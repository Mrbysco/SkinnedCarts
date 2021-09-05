package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fmllegacy.network.NetworkHooks;

public class GreenFrogCartEntity extends AbstractSkinnedCart {

	public GreenFrogCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public GreenFrogCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public GreenFrogCartEntity(FMLPlayMessages.SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.GREEN_FROG_CART.get(), worldIn);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	Type getSkinCartType() {
		return Type.GREEN_FROG;
	}
}
