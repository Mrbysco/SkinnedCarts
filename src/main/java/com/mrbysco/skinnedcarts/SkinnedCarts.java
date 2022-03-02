package com.mrbysco.skinnedcarts;

import com.mojang.logging.LogUtils;
import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.config.CartConfig;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Reference.MOD_ID)
public class SkinnedCarts {
	public static final Logger LOGGER = LogUtils.getLogger();

	public SkinnedCarts() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CartConfig.serverSpec);
		eventBus.register(CartConfig.class);

		CartRegistry.ITEMS.register(eventBus);
		CartRegistry.ENTITIES.register(eventBus);
		CartRegistry.SOUND_EVENTS.register(eventBus);

		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
			eventBus.addListener(ClientHandler::registerEntityRenders);
			eventBus.addListener(ClientHandler::registerLayerDefinitions);
		});
	}
}
