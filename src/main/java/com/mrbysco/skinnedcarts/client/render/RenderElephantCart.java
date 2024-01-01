package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelElephant;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RenderElephantCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T> {
	private static final ResourceLocation CART_TEXTURES = createLocation("minecart_elephant");

	public RenderElephantCart(EntityRendererProvider.Context context) {
		super(context, new ModelElephant<>(context.bakeLayer(ClientHandler.ELEPHANT_CART)));
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	@Override
	public ResourceLocation getTextureLocation(T cart) {
		return CART_TEXTURES;
	}
}