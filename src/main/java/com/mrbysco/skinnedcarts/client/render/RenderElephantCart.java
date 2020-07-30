package com.mrbysco.skinnedcarts.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mrbysco.skinnedcarts.client.render.model.ModelElephant;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;

public class RenderElephantCart<T extends AbstractSkinnedCart> extends RenderSkinnedCart<T> {
    private static ResourceLocation CART_TEXTURES = createLocation("minecart_elephant");
    /** instance of ModelMinecart for rendering */
    private final EntityModel<T> modelMinecart = new ModelElephant<>();

    public RenderElephantCart(EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn);
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void render(T entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.push();
        long i = (long)entityIn.getEntityId() * 493286711L;
        i = i * i * 4392167121L + i * 98761L;
        float f = (((float)(i >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        float f1 = (((float)(i >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        float f2 = (((float)(i >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        matrixStackIn.translate((double)f, (double)f1, (double)f2);
        double d0 = MathHelper.lerp((double)partialTicks, entityIn.lastTickPosX, entityIn.getPosX());
        double d1 = MathHelper.lerp((double)partialTicks, entityIn.lastTickPosY, entityIn.getPosY());
        double d2 = MathHelper.lerp((double)partialTicks, entityIn.lastTickPosZ, entityIn.getPosZ());
        double d3 = (double)0.3F;
        Vector3d Vector3d = entityIn.getPos(d0, d1, d2);
        float f3 = MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch);
        if (Vector3d != null) {
            Vector3d Vector3d1 = entityIn.getPosOffset(d0, d1, d2, (double)0.3F);
            Vector3d Vector3d2 = entityIn.getPosOffset(d0, d1, d2, (double)-0.3F);
            if (Vector3d1 == null) {
                Vector3d1 = Vector3d;
            }

            if (Vector3d2 == null) {
                Vector3d2 = Vector3d;
            }

            matrixStackIn.translate(Vector3d.x - d0, (Vector3d1.y + Vector3d2.y) / 2.0D - d1, Vector3d.z - d2);
            Vector3d Vector3d3 = Vector3d2.add(-Vector3d1.x, -Vector3d1.y, -Vector3d1.z);
            if (Vector3d3.length() != 0.0D) {
                Vector3d3 = Vector3d3.normalize();
                entityYaw = (float)(Math.atan2(Vector3d3.z, Vector3d3.x) * 180.0D / Math.PI);
                f3 = (float)(Math.atan(Vector3d3.y) * 73.0D);
            }
        }

        entityYaw %= 360;
        if (entityYaw < 0)
            entityYaw += 360;
        entityYaw += 360;

        double serverYaw = entityIn.rotationYaw;
        serverYaw += 180;
        serverYaw %= 360;
        if (serverYaw < 0)
            serverYaw += 360;
        serverYaw += 360;

        if (Math.abs(entityYaw - serverYaw) > 90) {
            entityYaw += 180;
            f3 = -f3;
        }

        matrixStackIn.translate(0.0D, 0.375D, 0.0D);
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F - entityYaw));
        matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(-f3));
        float f5 = (float)entityIn.getRollingAmplitude() - partialTicks;
        float f6 = entityIn.getDamage() - partialTicks;
        if (f6 < 0.0F) {
            f6 = 0.0F;
        }

        if (f5 > 0.0F) {
            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(MathHelper.sin(f5) * f5 * f6 / 10.0F * (float)entityIn.getRollingDirection()));
        }
//        if (f5 > 0.0F) {
//            float angle = (MathHelper.sin(f5) * f5 * f6) / 10F;
//            angle = Math.min(angle, 0.8f);
//            angle = Math.copySign(angle, ((EntitySkinnedCart)entity).getRollingDirection());
//            GlStateManager.rotate(angle * f5 * f6 / 10.0F * (float)entity.getRollingDirection(), 1.0F, 0.0F, 0.0F);
//            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(angle));
//        }

        int j = entityIn.getDisplayTileOffset();
        BlockState blockstate = entityIn.getDisplayTile();
        if (blockstate.getRenderType() != BlockRenderType.INVISIBLE) {
            matrixStackIn.push();
            float f4 = 0.75F;
            matrixStackIn.scale(0.75F, 0.75F, 0.75F);
            matrixStackIn.translate(-0.5D, (double)((float)(j - 8) / 16.0F), 0.5D);
            matrixStackIn.rotate(Vector3f.YP.rotationDegrees(90.0F));
            this.renderBlockState(entityIn, partialTicks, blockstate, matrixStackIn, bufferIn, packedLightIn);
            matrixStackIn.pop();
        }

        matrixStackIn.scale(-1.0F, -1.0F, 1.0F);
        this.modelMinecart.setRotationAngles(entityIn, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.modelMinecart.getRenderType(this.getEntityTexture(entityIn)));
        this.modelMinecart.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.pop();
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    public ResourceLocation getEntityTexture(T entity) {
        return CART_TEXTURES;
    }
}