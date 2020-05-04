package com.mrbysco.skinnedcarts.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class SnailCartEntity extends AbstractSkinnedCart {
	
	public SnailCartEntity(EntityType<?> type, World worldIn) {
		super(type, worldIn);
	}

	public SnailCartEntity(EntityType<?> type, World worldIn, double x, double y, double z)
	{
		super(type, worldIn, x, y, z);
	}

	@Override
	Type getSkinCartType() {
		return Type.SNAIL;
	}
}
