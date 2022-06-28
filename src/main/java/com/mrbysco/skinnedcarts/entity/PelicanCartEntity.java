package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class PelicanCartEntity extends AbstractSkinnedCart {

	public PelicanCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public PelicanCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public PelicanCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.PELICAN_CART.get(), worldIn);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.PELICAN_CART.get();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.PELICAN;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.PELICAN_CART_ITEM.get();
	}
}
