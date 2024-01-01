package com.mrbysco.skinnedcarts.config;

import com.mrbysco.skinnedcarts.SkinnedCarts;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.BooleanValue;
import org.apache.commons.lang3.tuple.Pair;

public class CartConfig {
	public static class Server {
		public final BooleanValue wednesdayFrogCart;

		Server(ModConfigSpec.Builder builder) {
			builder.comment("General settings")
					.push("general");

			wednesdayFrogCart = builder
					.comment("Setting this to true occasionally makes the frog carts acknowledge the day (Default: false)")
					.define("wednesdayFrogCart", true);

			builder.pop();
		}
	}

	public static final ModConfigSpec serverSpec;
	public static final CartConfig.Server SERVER;

	static {
		final Pair<Server, ModConfigSpec> specPair = new ModConfigSpec.Builder().configure(CartConfig.Server::new);
		serverSpec = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	@SubscribeEvent
	public static void onLoad(final ModConfigEvent.Loading configEvent) {
		SkinnedCarts.LOGGER.debug("Loaded SkinnedCart's config file {}", configEvent.getConfig().getFileName());
	}

	@SubscribeEvent
	public static void onFileChange(final ModConfigEvent.Reloading configEvent) {
		SkinnedCarts.LOGGER.debug("SkinnedCart's config just got changed on the file system!");
	}
}
