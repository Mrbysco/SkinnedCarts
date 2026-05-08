package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.config.CartConfig;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.Calendar;

public class FrogCartEntity extends AbstractSkinnedCart {

	public FrogCartEntity(EntityType<?> type, Level level) {
		super(type, level);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.FROG_CART.get();
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.FROG_CART_ITEM.get();
	}

	private void playLivingSound() {
		this.playSound(CartRegistry.WEDNESDAY_FROG_CART.get(), this.getSoundVolume(), this.getSoundPitch());
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
	public InteractionResult interact(Player player, InteractionHand hand, Vec3 location) {
		if (CartConfig.SERVER.wednesdayFrogCart.get() && itsWednesday()) {
			if (!level().isClientSide()) {
				this.playLivingSound();
			}
		}
		return super.interact(player, hand, location);
	}

	private boolean itsWednesday() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
	}
}
