package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class PenguinCartEntity extends AbstractSkinnedCart {

	public PenguinCartEntity(EntityType<?> type, Level level) {
		super(type, level);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.PENGUIN_CART.get();
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.PENGUIN_CART_ITEM.get();
	}
}
