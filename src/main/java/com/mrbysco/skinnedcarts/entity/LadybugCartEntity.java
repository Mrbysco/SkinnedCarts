package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class LadybugCartEntity extends AbstractSkinnedCart {

	public LadybugCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public LadybugCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public LadybugCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.LADYBUG_CART.get(), worldIn);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	Type getSkinCartType() {
		return Type.LADYBUG;
	}
}
