package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class TurtleCartEntity extends AbstractSkinnedCart {

	public TurtleCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public TurtleCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public TurtleCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.TURTLE_CART.get(), worldIn);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.TURTLE_CART.get();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.TURTLE;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.TURTLE_CART_ITEM.get();
	}
}
