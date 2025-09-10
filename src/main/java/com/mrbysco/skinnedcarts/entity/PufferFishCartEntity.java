package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class PufferFishCartEntity extends AbstractSkinnedCart {

	public PufferFishCartEntity(EntityType<?> type, Level level) {
		super(type, level);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.PUFFERFISH_CART.get();
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.PUFFERFISH_CART_ITEM.get();
	}
}
