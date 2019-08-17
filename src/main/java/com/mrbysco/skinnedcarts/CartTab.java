package com.mrbysco.skinnedcarts;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CartTab extends CreativeTabs {
	public CartTab() {
		super(Reference.MOD_ID);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.MINECART);
	}
}
