package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelPenguin;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RenderPenguinCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T> {
	private static final ResourceLocation CART_TEXTURES = createLocation("minecart_penguin");

	public RenderPenguinCart(EntityRendererProvider.Context context) {
		super(context, new ModelPenguin<>(context.bakeLayer(ClientHandler.PENGUIN_CART)));
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	@Override
	public ResourceLocation getTextureLocation(T cart) {
		return CART_TEXTURES;
	}
}