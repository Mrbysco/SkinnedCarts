package com.mrbysco.skinnedcarts.init;

import java.util.ArrayList;

import com.mrbysco.skinnedcarts.items.ItemCustomCart;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class CartItems {
	public static ItemCustomCart elephant_cart;
	public static ItemCustomCart frog_cart;
	public static ItemCustomCart panda_cart;
	public static ItemCustomCart pelican_cart;
	public static ItemCustomCart pufferfish_cart;
	public static ItemCustomCart snail_cart;
	public static ItemCustomCart turtle_cart;

	public static ArrayList<Item> ITEMS = new ArrayList<>();
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
		IForgeRegistry<Item> registry = event.getRegistry();

		elephant_cart = registerItem(new ItemCustomCart("elephant_minecart"));
		frog_cart = registerItem(new ItemCustomCart("frog_minecart"));
		panda_cart = registerItem(new ItemCustomCart("panda_minecart"));
		pelican_cart = registerItem(new ItemCustomCart("pelican_minecart"));
		pufferfish_cart = registerItem(new ItemCustomCart("pufferfish_minecart"));
		snail_cart = registerItem(new ItemCustomCart("snail_minecart"));
		turtle_cart = registerItem(new ItemCustomCart("turtle_minecart"));

		registry.registerAll(ITEMS.toArray(new Item[0]));
    }
	
	public static <T extends Item> T registerItem(T item)
    {
        ITEMS.add(item);
        return item;
    }
}
