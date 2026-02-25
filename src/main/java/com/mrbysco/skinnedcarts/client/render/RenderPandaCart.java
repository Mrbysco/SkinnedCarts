package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelPanda;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.MinecartRenderState;
import net.minecraft.resources.Identifier;

public class RenderPandaCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T, MinecartRenderState> {
	private static final Identifier CART_TEXTURES = createLocation("minecart_panda");

	public RenderPandaCart(EntityRendererProvider.Context context) {
		super(context, new ModelPanda(context.bakeLayer(ClientHandler.PANDA_CART)));
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