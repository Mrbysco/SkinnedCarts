package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.config.CartConfig;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Calendar;

public class FrogCartEntity extends AbstractSkinnedCart {
	
	public FrogCartEntity(EntityType<?> type, World worldIn) {
		super(type, worldIn);
	}

	public FrogCartEntity(EntityType<?> type, World worldIn, double x, double y, double z)
	{
		super(type, worldIn, x, y, z);
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
        return (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F;
    }
	
	@Override
	public SoundCategory getSoundCategory() {
		return SoundCategory.NEUTRAL;
	}

	@Override
	public ActionResultType applyPlayerInteraction(PlayerEntity player, Vec3d vec, Hand hand) {
		if(CartConfig.SERVER.WednesdayFrogCart.get() && itsWednesday()) {
			if (!world.isRemote) {
				this.playLivingSound();
			}
		}
		return super.applyPlayerInteraction(player, vec, hand);
	}
	
	private boolean itsWednesday() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
	}
}
