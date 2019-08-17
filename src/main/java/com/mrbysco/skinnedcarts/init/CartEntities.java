package com.mrbysco.skinnedcarts.init;

import java.util.ArrayList;

import com.mrbysco.skinnedcarts.Reference;
import com.mrbysco.skinnedcarts.SkinnedCarts;
import com.mrbysco.skinnedcarts.entity.EntityFrogCart;
import com.mrbysco.skinnedcarts.entity.EntitySkinnedCart;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.registries.IForgeRegistry;

//@EventBusSubscriber()
public class CartEntities {

	public static EntityEntry FROG_MINECART;

	public static ArrayList<EntityEntry> ENTITIES = new ArrayList<>();

	static int ID = 0;
	
	public static void register() {		
		registerEntity("frog_minecart", EntityFrogCart.class, "FrogMinecart", 80, 3, true);
	}
	
//	@SubscribeEvent
//    public static void registerItems(RegistryEvent.Register<EntityEntry> event)
//    {
//		IForgeRegistry<EntityEntry> registry = event.getRegistry();
//		
//		FROG_MINECART = registerMinecart(new EntityEntry(EntityFrogCart.class, "FrogMinecart"), "frog_minecart");
//
//		registry.registerAll(ENTITIES.toArray(new EntityEntry[0]));
//    }
//	
	public static void registerEntity(String registryName, Class<? extends EntitySkinnedCart> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, registryName), entityClass, Reference.MOD_PREFIX + entityName, ID, SkinnedCarts.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		ID++;
	}
	

	public static EntityEntry registerMinecart(EntityEntry entry, String registryName) {
		entry.setRegistryName(new ResourceLocation(Reference.MOD_ID, registryName));
        ENTITIES.add(entry);

        return entry;
	}
}
