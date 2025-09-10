package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class PelicanCartEntity extends AbstractSkinnedCart {

	public PelicanCartEntity(EntityType<?> type, Level level) {
		super(type, level);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.PELICAN_CART.get();
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.PELICAN_CART_ITEM.get();
	}
}
