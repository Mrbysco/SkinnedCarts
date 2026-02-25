package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelWombat;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.MinecartRenderState;
import net.minecraft.resources.Identifier;

public class RenderWombatCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T, MinecartRenderState> {
	private static final Identifier CART_TEXTURES = createLocation("minecart_wombat");

	public RenderWombatCart(EntityRendererProvider.Context context) {
		super(context, new ModelWombat(context.bakeLayer(ClientHandler.WOMBAT_CART)));
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