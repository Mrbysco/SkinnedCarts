package com.mrbysco.skinnedcarts;

import com.mojang.logging.LogUtils;
import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.config.CartConfig;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

@Mod(SkinnedCarts.MOD_ID)
public class SkinnedCarts {
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final String MOD_ID = "skinnedcarts";

	public SkinnedCarts() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CartConfig.serverSpec);
		eventBus.register(CartConfig.class);

		CartRegistry.ITEMS.register(eventBus);
		CartRegistry.CREATIVE_MODE_TABS.register(eventBus);
		CartRegistry.ENTITY_TYPES.register(eventBus);
		CartRegistry.SOUND_EVENTS.register(eventBus);

		if (FMLEnvironment.dist.isClient()) {
			eventBus.addListener(ClientHandler::registerEntityRenders);
			eventBus.addListener(ClientHandler::registerLayerDefinitions);
		}
	}
}
