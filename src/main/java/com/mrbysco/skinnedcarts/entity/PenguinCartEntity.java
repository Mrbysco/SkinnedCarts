package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.network.NetworkHooks;
import net.neoforged.neoforge.network.PlayMessages.SpawnEntity;

public class PenguinCartEntity extends AbstractSkinnedCart {

	public PenguinCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public PenguinCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public PenguinCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.PENGUIN_CART.get(), worldIn);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.PENGUIN_CART.get();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return (Packet<ClientGamePacketListener>) NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.PENGUIN;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.PENGUIN_CART_ITEM.get();
	}
}
