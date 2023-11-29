package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.network.NetworkHooks;
import net.neoforged.neoforge.network.PlayMessages.SpawnEntity;

public class SnailCartEntity extends AbstractSkinnedCart {

	public SnailCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public SnailCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public SnailCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.SNAIL_CART.get(), worldIn);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.SNAIL_CART.get();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return (Packet<ClientGamePacketListener>) NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.SNAIL;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.SNAIL_CART_ITEM.get();
	}
}
