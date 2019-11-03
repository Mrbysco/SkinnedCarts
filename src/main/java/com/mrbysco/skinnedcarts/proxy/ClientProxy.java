package com.mrbysco.skinnedcarts.proxy;

import com.mrbysco.skinnedcarts.SkinnedCarts;
import com.mrbysco.skinnedcarts.entity.EntityElephantCart;
import com.mrbysco.skinnedcarts.entity.EntityFrogCart;
import com.mrbysco.skinnedcarts.entity.EntityPandaCart;
import com.mrbysco.skinnedcarts.entity.EntityPelicanCart;
import com.mrbysco.skinnedcarts.entity.EntityPufferFishCart;
import com.mrbysco.skinnedcarts.entity.EntitySnailCart;
import com.mrbysco.skinnedcarts.entity.EntityTurtleCart;
import com.mrbysco.skinnedcarts.render.RenderSkinnedCart;
import com.mrbysco.skinnedcarts.render.model.ModelElephant;
import com.mrbysco.skinnedcarts.render.model.ModelFrog;
import com.mrbysco.skinnedcarts.render.model.ModelPanda;
import com.mrbysco.skinnedcarts.render.model.ModelPelican;
import com.mrbysco.skinnedcarts.render.model.ModelPufferFish;
import com.mrbysco.skinnedcarts.render.model.ModelSnail;
import com.mrbysco.skinnedcarts.render.model.ModelTurtle;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{

	@Override
	public void Preinit() {
		registerRender();
	}

	@Override
	public void registerRender() {
		SkinnedCarts.logger.info("Registering Skinned Cart Renders");
		RenderingRegistry.registerEntityRenderingHandler(EntityElephantCart.class, renderManager -> new RenderSkinnedCart<EntityElephantCart>(renderManager, new ModelElephant(), "minecart_elephant"));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrogCart.class, renderManager -> new RenderSkinnedCart<EntityFrogCart>(renderManager, new ModelFrog(), "minecart_frog"));
		RenderingRegistry.registerEntityRenderingHandler(EntityPandaCart.class, renderManager -> new RenderSkinnedCart<EntityPandaCart>(renderManager, new ModelPanda(), "minecart_panda"));
		RenderingRegistry.registerEntityRenderingHandler(EntityPelicanCart.class, renderManager -> new RenderSkinnedCart<EntityPelicanCart>(renderManager, new ModelPelican(), "minecart_pelican"));
		RenderingRegistry.registerEntityRenderingHandler(EntityPufferFishCart.class, renderManager -> new RenderSkinnedCart<EntityPufferFishCart>(renderManager, new ModelPufferFish(), "minecart_puffer_fish"));
		RenderingRegistry.registerEntityRenderingHandler(EntitySnailCart.class, renderManager -> new RenderSkinnedCart<EntitySnailCart>(renderManager, new ModelSnail(), "minecart_snail"));
		RenderingRegistry.registerEntityRenderingHandler(EntityTurtleCart.class, renderManager -> new RenderSkinnedCart<EntityTurtleCart>(renderManager, new ModelTurtle(), "minecart_turtle"));
	}
	
	@Override
	public void Init() {
		
	}
	
	@Override
	public void PostInit() {
		
	}
}
