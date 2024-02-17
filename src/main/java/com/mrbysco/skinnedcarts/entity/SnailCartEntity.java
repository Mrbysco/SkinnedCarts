package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class SnailCartEntity extends AbstractSkinnedCart {

	public SnailCartEntity(EntityType<?> type, Level level) {
		super(type, level);
	}

	public SnailCartEntity(EntityType<?> type, Level level, double x, double y, double z) {
		super(type, level, x, y, z);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.SNAIL_CART.get();
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.SNAIL;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.SNAIL_CART_ITEM.get();
	}
}
