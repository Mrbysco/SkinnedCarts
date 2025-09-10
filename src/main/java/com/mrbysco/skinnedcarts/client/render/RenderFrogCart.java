package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelFrog;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.MinecartRenderState;
import net.minecraft.resources.ResourceLocation;

public class RenderFrogCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T, MinecartRenderState> {
	private static final ResourceLocation CART_TEXTURES = createLocation("minecart_frog");

	public RenderFrogCart(EntityRendererProvider.Context context) {
		super(context, new ModelFrog(context.bakeLayer(ClientHandler.FROG_CART)));
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