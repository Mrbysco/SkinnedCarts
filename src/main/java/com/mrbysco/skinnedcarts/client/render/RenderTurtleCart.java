package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.client.ClientHandler;
import com.mrbysco.skinnedcarts.client.render.model.ModelTurtle;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RenderTurtleCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T> {
    private static ResourceLocation CART_TEXTURES = createLocation("minecart_turtle");

    public RenderTurtleCart(EntityRendererProvider.Context context) {
        super(context, new ModelTurtle<>(context.bakeLayer(ClientHandler.TURTLE_CART)));
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