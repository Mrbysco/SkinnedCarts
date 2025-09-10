package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelPufferFish;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.MinecartRenderState;
import net.minecraft.resources.ResourceLocation;

public class RenderPufferFishCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T, MinecartRenderState> {
	private static final ResourceLocation CART_TEXTURES = createLocation("minecart_puffer_fish");

	public RenderPufferFishCart(EntityRendererProvider.Context context) {
		super(context, new ModelPufferFish(context.bakeLayer(ClientHandler.PUFFERFISH_CART)));
	}

	@Override
	public MinecartRenderState createRenderState() {
		return new MinecartRenderState();
	}

	@Override
	public ResourceLocation getTextureLocation() {
		return CART_TEXTURES;
	}
}