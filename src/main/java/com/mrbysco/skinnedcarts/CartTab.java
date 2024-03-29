package com.mrbysco.skinnedcarts;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CartTab {
	public static final CreativeModeTab CART_TAB = new CreativeModeTab(Reference.MOD_ID + ".tab") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(Items.MINECART);
		}
	};
}
