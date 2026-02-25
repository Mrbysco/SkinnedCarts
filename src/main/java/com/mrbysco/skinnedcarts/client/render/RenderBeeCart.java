package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelBee;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.MinecartRenderState;
import net.minecraft.resources.Identifier;

public class RenderBeeCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T, MinecartRenderState> {
	private static final Identifier CART_TEXTURES = createLocation("minecart_bee");

	public RenderBeeCart(EntityRendererProvider.Context context) {
		super(context, new ModelBee(context.bakeLayer(ClientHandler.BEE_CART)));
	}

	@Override
	public MinecartRenderState createRenderState() {
		return new MinecartRenderState();
	}

	@Override
	public Identifier getTextureLocation() {
		return CART_TEXTURES;
	}
}