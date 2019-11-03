package com.mrbysco.skinnedcarts.init;

import com.mrbysco.skinnedcarts.Reference;
import com.mrbysco.skinnedcarts.SkinnedCarts;
import com.mrbysco.skinnedcarts.entity.EntityElephantCart;
import com.mrbysco.skinnedcarts.entity.EntityFrogCart;
import com.mrbysco.skinnedcarts.entity.EntityPandaCart;
import com.mrbysco.skinnedcarts.entity.EntityPelicanCart;
import com.mrbysco.skinnedcarts.entity.EntityPufferFishCart;
import com.mrbysco.skinnedcarts.entity.EntitySkinnedCart;
import com.mrbysco.skinnedcarts.entity.EntitySnailCart;
import com.mrbysco.skinnedcarts.entity.EntityTurtleCart;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CartEntities {

	static int ID = 0;
	
	public static void register() {		
		registerEntity("elephant_minecart", EntityElephantCart.class, "ElephantMinecart", 80, 3, true);
		registerEntity("frog_minecart", EntityFrogCart.class, "FrogMinecart", 80, 3, true);
		registerEntity("panda_minecart", EntityPandaCart.class, "PandaMinecart", 80, 3, true);
		registerEntity("pelican_minecart", EntityPelicanCart.class, "PelicanMinecart", 80, 3, true);
		registerEntity("pufferfish_minecart", EntityPufferFishCart.class, "PufferFishMinecart", 80, 3, true);
		registerEntity("snail_minecart", EntitySnailCart.class, "SnailMinecart", 80, 3, true);
		registerEntity("turtle_minecart", EntityTurtleCart.class, "TurtleMinecart", 80, 3, true);
	}

	public static void registerEntity(String registryName, Class<? extends EntitySkinnedCart> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, registryName), entityClass, Reference.MOD_PREFIX + entityName, ID, SkinnedCarts.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		ID++;
	}
}
