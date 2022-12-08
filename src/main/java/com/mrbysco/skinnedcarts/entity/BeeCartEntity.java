package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class BeeCartEntity extends AbstractSkinnedCart {

	public BeeCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public BeeCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public BeeCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.BEE_CART.get(), worldIn);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.BEE_CART.get();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return (Packet<ClientGamePacketListener>) NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.BEE;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.BEE_CART_ITEM.get();
	}
}
