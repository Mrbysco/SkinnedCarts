package com.mrbysco.skinnedcarts.proxy;

import com.mrbysco.skinnedcarts.entity.EntityFrogCart;
import com.mrbysco.skinnedcarts.render.RenderFrogCart;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{

	@Override
	public void Preinit() {
		registerRender();
	}
	
	@Override
	public void registerRender() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFrogCart.class, RenderFrogCart::new);
	}
	
	@Override
	public void Init() {
	
	}
	
	@Override
	public void PostInit() {
		
	}
}
