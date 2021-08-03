package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.config.CartConfig;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.Calendar;

public class FrogCartEntity extends AbstractSkinnedCart {
	
	public FrogCartEntity(EntityType<?> type, World worldIn) {
		super(type, worldIn);
	}

	public FrogCartEntity(EntityType<?> type, World worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public FrogCartEntity(FMLPlayMessages.SpawnEntity spawnEntity, World worldIn) {
		this(CartRegistry.FROG_CART.get(), worldIn);
	}

	@Override
	public IPacket<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	Type getSkinCartType() {
		return Type.FROG;
	}
	
	private void playLivingSound() {
		SoundEvent sound = CartRegistry.WEDNESDAY_FROG_CART.get();
        this.playSound(sound, this.getSoundVolume() , this.getSoundPitch());
	}
	
	protected float getSoundVolume()
    {
        return 1.0F;
    }
	
	protected float getSoundPitch()
    {
        return (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F;
    }
	
	@Override
	public SoundCategory getSoundSource() {
		return SoundCategory.NEUTRAL;
	}

	@Override
	public ActionResultType interactAt(PlayerEntity player, Vector3d vec, Hand hand) {
		if(CartConfig.SERVER.WednesdayFrogCart.get() && itsWednesday()) {
			if (!level.isClientSide) {
				this.playLivingSound();
			}
		}
		return super.interactAt(player, vec, hand);
	}
	
	private boolean itsWednesday() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
	}
}
