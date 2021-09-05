package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelPelican;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RenderPelicanCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T> {
    private static ResourceLocation CART_TEXTURES = createLocation("minecart_pelican");

    public RenderPelicanCart(EntityRendererProvider.Context context) {
        super(context, new ModelPelican<>(context.bakeLayer(ClientHandler.PELICAN_CART)));
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