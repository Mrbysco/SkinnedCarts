package com.mrbysco.skinnedcarts;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CartTab {
	public static final ItemGroup CART_TAB = new ItemGroup(Reference.MOD_ID + ".tab") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(Items.MINECART);
		}
	};
}
