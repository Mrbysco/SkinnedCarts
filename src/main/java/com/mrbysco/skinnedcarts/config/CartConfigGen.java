package com.mrbysco.skinnedcarts.config;

import com.mrbysco.skinnedcarts.Reference;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MOD_ID)
@Config.LangKey("skinnedcarts.config.title")
public class CartConfigGen {
	@Config.Comment({"General settings"})
	public static General general = new General();
	
	public static class General{
		
		@Config.RequiresMcRestart
		@Config.Comment("Setting this to true occasionally makes the frog carts awknowledge the day (Default: false)")
		public boolean WednesdayFrogCarts = false;
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	private static class EventHandler {

		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(Reference.MOD_ID)) {
				ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
			}
		}
	}
}
