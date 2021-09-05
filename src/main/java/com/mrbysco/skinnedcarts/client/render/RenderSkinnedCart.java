package com.mrbysco.skinnedcarts.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import com.mrbysco.skinnedcarts.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class RenderSkinnedCart<T extends AbstractMinecart> extends EntityRenderer<T> {
    private static ResourceLocation CART_TEXTURES = createLocation("minecart_frog");
    private final EntityModel<T> modelMinecart;

    public RenderSkinnedCart(EntityRendererProvider.Context context, EntityModel<T> model) {
        super(context);
        this.modelMinecart = model;
        this.shadowRadius = 0.7F;
    }
    
    public static ResourceLocation createLocation(String cartName) {
    	return new ResourceLocation(Reference.MOD_PREFIX + "textures/entity/" + cartName + ".png");
    }

    protected void renderBlockState(T entityIn, float partialTicks, BlockState stateIn, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
        Minecraft.getInstance().getBlockRenderer().renderSingleBlock(stateIn, matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    /**
     * Renders the desired {@code T} type Entity.
     */
    public void render(T entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.pushPose();
        long i = (long)entityIn.getId() * 493286711L;
        i = i * i * 4392167121L + i * 98761L;
        float f = (((float)(i >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        float f1 = (((float)(i >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        float f2 = (((float)(i >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        matrixStackIn.translate((double)f, (double)f1, (double)f2);
        double d0 = Mth.lerp((double)partialTicks, entityIn.xOld, entityIn.getX());
        double d1 = Mth.lerp((double)partialTicks, entityIn.yOld, entityIn.getY());
        double d2 = Mth.lerp((double)partialTicks, entityIn.zOld, entityIn.getZ());
        double d3 = (double)0.3F;
        Vec3 Vector3d = entityIn.getPos(d0, d1, d2);
        float f3 = Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot());
        if (Vector3d != null) {
            Vec3 Vector3d1 = entityIn.getPosOffs(d0, d1, d2, (double)0.3F);
            Vec3 Vector3d2 = entityIn.getPosOffs(d0, d1, d2, (double)-0.3F);
            if (Vector3d1 == null) {
                Vector3d1 = Vector3d;
            }

            if (Vector3d2 == null) {
                Vector3d2 = Vector3d;
            }

            matrixStackIn.translate(Vector3d.x - d0, (Vector3d1.y + Vector3d2.y) / 2.0D - d1, Vector3d.z - d2);
            Vec3 Vector3d3 = Vector3d2.add(-Vector3d1.x, -Vector3d1.y, -Vector3d1.z);
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

        double serverYaw = entityIn.getYRot();
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
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180.0F - entityYaw));
        matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(-f3));
        float f5 = (float)entityIn.getHurtTime() - partialTicks;
        float f6 = entityIn.getDamage() - partialTicks;
        if (f6 < 0.0F) {
            f6 = 0.0F;
        }

        if (f5 > 0.0F) {
            matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(Mth.sin(f5) * f5 * f6 / 10.0F * (float)entityIn.getHurtDir()));
        }
//        if (f5 > 0.0F) {
//            float angle = (MathHelper.sin(f5) * f5 * f6) / 10F;
//            angle = Math.min(angle, 0.8f);
//            angle = Math.copySign(angle, ((EntitySkinnedCart)entity).getRollingDirection());
//            GlStateManager.rotate(angle * f5 * f6 / 10.0F * (float)entity.getRollingDirection(), 1.0F, 0.0F, 0.0F);
//            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(angle));
//        }

        int j = entityIn.getDisplayOffset();
        BlockState blockstate = entityIn.getDisplayBlockState();
        if (blockstate.getRenderShape() != RenderShape.INVISIBLE) {
            matrixStackIn.pushPose();
            float f4 = 0.75F;
            matrixStackIn.scale(0.75F, 0.75F, 0.75F);
            matrixStackIn.translate(-0.5D, (double)((float)(j - 8) / 16.0F), 0.5D);
            matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(90.0F));
            this.renderBlockState(entityIn, partialTicks, blockstate, matrixStackIn, bufferIn, packedLightIn);
            matrixStackIn.popPose();
        }

        matrixStackIn.scale(-1.0F, -1.0F, 1.0F);
        this.modelMinecart.setupAnim(entityIn, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
        VertexConsumer ivertexbuilder = bufferIn.getBuffer(this.modelMinecart.renderType(this.getTextureLocation(entityIn)));
        this.modelMinecart.renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.popPose();
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    public ResourceLocation getTextureLocation(T entity) {
        return this.CART_TEXTURES;
    }
}