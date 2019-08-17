package com.mrbysco.skinnedcarts.init;

import java.util.ArrayList;

import com.mrbysco.skinnedcarts.SkinnedCarts;
import com.mrbysco.skinnedcarts.items.ItemCustomCart;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber()
public class CartItems {
	public static ItemCustomCart frog_cart;
	
	public static ArrayList<Item> ITEMS = new ArrayList<>();
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
		IForgeRegistry<Item> registry = event.getRegistry();
		
		frog_cart = registerItem(new ItemCustomCart("frog_minecart"));

		registry.registerAll(ITEMS.toArray(new Item[0]));
		SkinnedCarts.proxy.registerRender();
    }
	
	public static <T extends Item> T registerItem(T item)
    {
        ITEMS.add(item);
        return item;
    }
}
