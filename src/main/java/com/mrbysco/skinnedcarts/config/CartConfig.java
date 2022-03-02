package com.mrbysco.skinnedcarts.config;

import com.mrbysco.skinnedcarts.SkinnedCarts;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import org.apache.commons.lang3.tuple.Pair;

public class CartConfig {
	public static class Server {
		public final BooleanValue WednesdayFrogCart;

		Server(ForgeConfigSpec.Builder builder) {
			builder.comment("General settings")
					.push("general");

			WednesdayFrogCart = builder
					.comment("Setting this to true occasionally makes the frog carts awknowledge the day (Default: false)")
					.define("WednesdayFrogCart", true);

			builder.pop();
		}
	}

	public static final ForgeConfigSpec serverSpec;
	public static final CartConfig.Server SERVER;

	static {
		final Pair<Server, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CartConfig.Server::new);
		serverSpec = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	@SubscribeEvent
	public static void onLoad(final ModConfigEvent.Loading configEvent) {
		SkinnedCarts.logger.debug("Loaded SkinnedCart's config file {}", configEvent.getConfig().getFileName());
	}

	@SubscribeEvent
	public static void onFileChange(final ModConfigEvent.Reloading configEvent) {
		SkinnedCarts.logger.debug("SkinnedCart's config just got changed on the file system!");
	}
}
