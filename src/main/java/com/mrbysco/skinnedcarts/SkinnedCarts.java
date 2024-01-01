package com.mrbysco.skinnedcarts;

import com.mojang.logging.LogUtils;
import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.config.CartConfig;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import com.mrbysco.skinnedcarts.items.CustomCartItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DispenserBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.slf4j.Logger;

@Mod(SkinnedCarts.MOD_ID)
public class SkinnedCarts {
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final String MOD_ID = "skinnedcarts";

	public SkinnedCarts(IEventBus eventBus) {
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CartConfig.serverSpec);
		eventBus.register(CartConfig.class);

		eventBus.addListener(this::setup);

		CartRegistry.ITEMS.register(eventBus);
		CartRegistry.CREATIVE_MODE_TABS.register(eventBus);
		CartRegistry.ENTITY_TYPES.register(eventBus);
		CartRegistry.SOUND_EVENTS.register(eventBus);

		if (FMLEnvironment.dist.isClient()) {
			eventBus.addListener(ClientHandler::registerEntityRenders);
			eventBus.addListener(ClientHandler::registerLayerDefinitions);
		}
	}

	private void setup(final FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			for (DeferredHolder<Item, ? extends Item> deferredHolder : CartRegistry.ITEMS.getEntries()) {
				if (deferredHolder.get() instanceof CustomCartItem cart) {
					DispenserBlock.registerBehavior(cart, CustomCartItem.MINECART_DISPENSER_BEHAVIOR);
				}
			}
		});
	}
}
