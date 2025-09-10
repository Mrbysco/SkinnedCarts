package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class GreenFrogCartEntity extends AbstractSkinnedCart {

	public GreenFrogCartEntity(EntityType<?> type, Level level) {
		super(type, level);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.GREEN_FROG_CART.get();
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.GREEN_FROG_CART_ITEM.get();
	}
}
