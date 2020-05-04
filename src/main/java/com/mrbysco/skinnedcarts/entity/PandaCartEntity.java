package com.mrbysco.skinnedcarts.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class PandaCartEntity extends AbstractSkinnedCart {
	
	public PandaCartEntity(EntityType<?> type, World worldIn) {
		super(type, worldIn);
	}

	public PandaCartEntity(EntityType<?> type, World worldIn, double x, double y, double z)
	{
		super(type, worldIn, x, y, z);
	}

	@Override
	Type getSkinCartType() {
		return Type.PANDA;
	}
}
