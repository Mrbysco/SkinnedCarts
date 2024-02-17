package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class PenguinCartEntity extends AbstractSkinnedCart {

	public PenguinCartEntity(EntityType<?> type, Level level) {
		super(type, level);
	}

	public PenguinCartEntity(EntityType<?> type, Level level, double x, double y, double z) {
		super(type, level, x, y, z);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.PENGUIN_CART.get();
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.PENGUIN;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.PENGUIN_CART_ITEM.get();
	}
}
