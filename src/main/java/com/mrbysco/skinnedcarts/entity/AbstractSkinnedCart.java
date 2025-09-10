package com.mrbysco.skinnedcarts.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public abstract class AbstractSkinnedCart extends Minecart {

	public AbstractSkinnedCart(EntityType<?> type, Level level) {
		super(type, level);
	}

	protected abstract Item getReturnItem();

	@Override
	public Item getDropItem() {
		return this.getReturnItem();
	}

	@Override
	public ItemStack getPickResult() {
		return new ItemStack(this.getDropItem());
	}
}
