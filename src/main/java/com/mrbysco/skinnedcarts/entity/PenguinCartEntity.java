package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fmllegacy.network.NetworkHooks;

public class PenguinCartEntity extends AbstractSkinnedCart {

	public PenguinCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public PenguinCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public PenguinCartEntity(FMLPlayMessages.SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.PENGUIN_CART.get(), worldIn);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	Type getSkinCartType() {
		return Type.PENGUIN;
	}
}
