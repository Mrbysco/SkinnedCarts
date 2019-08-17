package com.mrbysco.skinnedcarts.init;

import java.util.ArrayList;

import com.mrbysco.skinnedcarts.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class CartSounds {
	public static SoundEvent wednesday_frog_cart;
	
	public static ArrayList<SoundEvent> SOUND_EVENTS = new ArrayList<>();
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<SoundEvent> event)
    {
		IForgeRegistry<SoundEvent> registry = event.getRegistry();
		
		wednesday_frog_cart = registerSound("minecart.wednesday.frog");

		registry.registerAll(SOUND_EVENTS.toArray(new SoundEvent[0]));
    }
	
	public static SoundEvent registerSound(String soundName)
    {
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, soundName);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(location);
		
		SOUND_EVENTS.add(event);
        return event;
    }
}
