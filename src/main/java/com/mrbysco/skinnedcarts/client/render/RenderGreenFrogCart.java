package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelGreenFrog;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.MinecartRenderState;
import net.minecraft.resources.ResourceLocation;

public class RenderGreenFrogCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T, MinecartRenderState> {
	private static final ResourceLocation CART_TEXTURES = createLocation("minecart_greenfrog");

	public RenderGreenFrogCart(EntityRendererProvider.Context context) {
		super(context, new ModelGreenFrog(context.bakeLayer(ClientHandler.GREEN_FROG_CART)));
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