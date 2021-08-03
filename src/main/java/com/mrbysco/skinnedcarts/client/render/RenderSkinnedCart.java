package com.mrbysco.skinnedcarts.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mrbysco.skinnedcarts.Reference;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.util.ResourceLocation;

public class RenderSkinnedCart<T extends AbstractMinecartEntity> extends EntityRenderer<T> {
    private static ResourceLocation CART_TEXTURES = createLocation("minecart_frog");

    public RenderSkinnedCart(EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn);
        this.shadowRadius = 0.7F;
    }
    
    public static ResourceLocation createLocation(String cartName) {
    	return new ResourceLocation(Reference.MOD_PREFIX + "textures/entity/" + cartName + ".png");
    }

    protected void renderBlockState(T entityIn, float partialTicks, BlockState stateIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        Minecraft.getInstance().getBlockRenderer().renderSingleBlock(stateIn, matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    public ResourceLocation getTextureLocation(T entity) {
        return this.CART_TEXTURES;
    }
}