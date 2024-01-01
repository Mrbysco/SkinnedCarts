package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.network.NetworkHooks;
import net.neoforged.neoforge.network.PlayMessages.SpawnEntity;

public class GreenFrogCartEntity extends AbstractSkinnedCart {

	public GreenFrogCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public GreenFrogCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public GreenFrogCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.GREEN_FROG_CART.get(), worldIn);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.GREEN_FROG_CART.get();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.GREEN_FROG;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.GREEN_FROG_CART_ITEM.get();
	}
}
