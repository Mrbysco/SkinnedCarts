package com.mrbysco.skinnedcarts.client.render;

import com.mrbysco.skinnedcarts.Reference;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.util.ResourceLocation;

public class RenderSkinnedCart<T extends AbstractMinecartEntity> extends EntityRenderer<T> {
    private static ResourceLocation CART_TEXTURES = createLocation("minecart_frog");

    public RenderSkinnedCart(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
        this.shadowSize = 0.7F;
    }
    
    public static ResourceLocation createLocation(String cartName) {
    	return new ResourceLocation(Reference.MOD_PREFIX + "textures/entity/" + cartName + ".png");
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    public ResourceLocation getEntityTexture(T entity) {
        return this.CART_TEXTURES;
    }
}