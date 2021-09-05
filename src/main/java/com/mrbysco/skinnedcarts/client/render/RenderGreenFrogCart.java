package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelGreenFrog;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RenderGreenFrogCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T> {
    private static ResourceLocation CART_TEXTURES = createLocation("minecart_greenfrog");

    public RenderGreenFrogCart(EntityRendererProvider.Context context) {
        super(context, new ModelGreenFrog<>(context.bakeLayer(ClientHandler.GREEN_FROG_CART)));
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    public ResourceLocation getTextureLocation(T entity)
    {
        return CART_TEXTURES;
    }
}