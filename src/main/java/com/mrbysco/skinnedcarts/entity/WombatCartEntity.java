package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class WombatCartEntity extends AbstractSkinnedCart {

	public WombatCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public WombatCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public WombatCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.WOMBAT_CART.get(), worldIn);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.WOMBAT_CART.get();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.WOMBAT;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.WOMBAT_CART_ITEM.get();
	}
}
