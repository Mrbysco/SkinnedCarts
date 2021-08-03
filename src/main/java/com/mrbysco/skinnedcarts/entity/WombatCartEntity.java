package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class WombatCartEntity extends AbstractSkinnedCart {

	public WombatCartEntity(EntityType<?> type, World worldIn) {
		super(type, worldIn);
	}

	public WombatCartEntity(EntityType<?> type, World worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public WombatCartEntity(FMLPlayMessages.SpawnEntity spawnEntity, World worldIn) {
		this(CartRegistry.WOMBAT_CART.get(), worldIn);
	}

	@Override
	public IPacket<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	Type getSkinCartType() {
		return Type.WOMBAT;
	}
}
