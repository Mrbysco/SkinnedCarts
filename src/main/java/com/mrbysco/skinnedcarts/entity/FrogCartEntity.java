package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.config.CartConfig;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

import java.util.Calendar;

public class FrogCartEntity extends AbstractSkinnedCart {

	public FrogCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public FrogCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public FrogCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.FROG_CART.get(), worldIn);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	Type getSkinCartType() {
		return Type.FROG;
	}

	private void playLivingSound() {
		SoundEvent sound = CartRegistry.WEDNESDAY_FROG_CART.get();
		this.playSound(sound, this.getSoundVolume(), this.getSoundPitch());
	}

	protected float getSoundVolume() {
		return 1.0F;
	}

	protected float getSoundPitch() {
		return (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F;
	}

	@Override
	public SoundSource getSoundSource() {
		return SoundSource.NEUTRAL;
	}

	@Override
	public InteractionResult interactAt(Player player, Vec3 vec, InteractionHand hand) {
		if (CartConfig.SERVER.WednesdayFrogCart.get() && itsWednesday()) {
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
