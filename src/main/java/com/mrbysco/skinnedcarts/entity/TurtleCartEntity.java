package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class TurtleCartEntity extends AbstractSkinnedCart {

	public TurtleCartEntity(EntityType<?> type, Level level) {
		super(type, level);
	}

	public TurtleCartEntity(EntityType<?> type, Level level, double x, double y, double z) {
		super(type, level, x, y, z);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.TURTLE_CART.get();
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.TURTLE;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.TURTLE_CART_ITEM.get();
	}
}
