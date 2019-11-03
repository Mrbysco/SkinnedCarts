package com.mrbysco.skinnedcarts.proxy;

import com.mrbysco.skinnedcarts.SkinnedCarts;
import com.mrbysco.skinnedcarts.entity.EntityElephantCart;
import com.mrbysco.skinnedcarts.entity.EntityFrogCart;
import com.mrbysco.skinnedcarts.entity.EntityPandaCart;
import com.mrbysco.skinnedcarts.entity.EntityPelicanCart;
import com.mrbysco.skinnedcarts.entity.EntityPufferFishCart;
import com.mrbysco.skinnedcarts.entity.EntitySnailCart;
import com.mrbysco.skinnedcarts.entity.EntityTurtleCart;
import com.mrbysco.skinnedcarts.render.RenderElephantCart;
import com.mrbysco.skinnedcarts.render.RenderFrogCart;
import com.mrbysco.skinnedcarts.render.RenderPandaCart;
import com.mrbysco.skinnedcarts.render.RenderPelicanCart;
import com.mrbysco.skinnedcarts.render.RenderPufferFishCart;
import com.mrbysco.skinnedcarts.render.RenderSkinnedCart;
import com.mrbysco.skinnedcarts.render.RenderSnailCart;
import com.mrbysco.skinnedcarts.render.RenderTurtleCart;
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
		RenderingRegistry.registerEntityRenderingHandler(EntityElephantCart.class, renderManager -> new RenderElephantCart(renderManager));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrogCart.class, renderManager -> new RenderFrogCart(renderManager));
		RenderingRegistry.registerEntityRenderingHandler(EntityPandaCart.class, renderManager -> new RenderPandaCart(renderManager));
		RenderingRegistry.registerEntityRenderingHandler(EntityPelicanCart.class, renderManager -> new RenderPelicanCart(renderManager));
		RenderingRegistry.registerEntityRenderingHandler(EntityPufferFishCart.class, renderManager -> new RenderPufferFishCart(renderManager));
		RenderingRegistry.registerEntityRenderingHandler(EntitySnailCart.class, renderManager -> new RenderSnailCart(renderManager));
		RenderingRegistry.registerEntityRenderingHandler(EntityTurtleCart.class, renderManager -> new RenderTurtleCart(renderManager));
	}
	
	@Override
	public void Init() {
		
	}
	
	@Override
	public void PostInit() {
		
	}
}
