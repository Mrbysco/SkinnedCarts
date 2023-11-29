package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.config.CartConfig;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.NetworkHooks;
import net.neoforged.neoforge.network.PlayMessages.SpawnEntity;

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
	public EntityType<?> getType() {
		return CartRegistry.FROG_CART.get();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return (Packet<ClientGamePacketListener>) NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.FROG;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.FROG_CART_ITEM.get();
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
		if (CartConfig.SERVER.wednesdayFrogCart.get() && itsWednesday()) {
			if (!level().isClientSide) {
				this.playLivingSound();
			}
		}
		return super.interactAt(player, vec, hand);
	}

	private boolean itsWednesday() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
	}
}
