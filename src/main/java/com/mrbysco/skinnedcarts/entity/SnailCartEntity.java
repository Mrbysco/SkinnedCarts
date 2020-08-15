package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class SnailCartEntity extends AbstractSkinnedCart {
	
	public SnailCartEntity(EntityType<?> type, World worldIn) {
		super(type, worldIn);
	}

	public SnailCartEntity(EntityType<?> type, World worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public SnailCartEntity(FMLPlayMessages.SpawnEntity spawnEntity, World worldIn) {
		this(CartRegistry.SNAIL_CART.get(), worldIn);
	}

	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	Type getSkinCartType() {
		return Type.SNAIL;
	}
}