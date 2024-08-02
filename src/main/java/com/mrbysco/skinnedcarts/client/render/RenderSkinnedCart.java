package com.mrbysco.skinnedcarts.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import com.mrbysco.skinnedcarts.SkinnedCarts;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class RenderSkinnedCart<T extends AbstractMinecart> extends EntityRenderer<T> {
	private static final ResourceLocation CART_TEXTURES = createLocation("minecart_frog");
	private final BlockRenderDispatcher blockRenderer;
	private final EntityModel<T> modelMinecart;

	public RenderSkinnedCart(EntityRendererProvider.Context context, EntityModel<T> model) {
		super(context);
		this.blockRenderer = context.getBlockRenderDispatcher();
		this.modelMinecart = model;
		this.shadowRadius = 0.7F;
	}

	public static ResourceLocation createLocation(String cartName) {
		return SkinnedCarts.modLoc("textures/entity/" + cartName + ".png");
	}

	protected void renderMinecartContents(T cart, float partialTicks, BlockState state, PoseStack poseStack,
	                                      MultiBufferSource bufferSource, int packedLight) {
		this.blockRenderer.renderSingleBlock(state, poseStack, bufferSource, packedLight, OverlayTexture.NO_OVERLAY);
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	@Override
	public void render(T cart, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn) {
		super.render(cart, entityYaw, partialTicks, poseStack, bufferSource, packedLightIn);
		poseStack.pushPose();
		long i = (long) cart.getId() * 493286711L;
		i = i * i * 4392167121L + i * 98761L;
		float f = (((float) (i >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		float f1 = (((float) (i >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		float f2 = (((float) (i >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		poseStack.translate(f, f1, f2);
		double xLerp = Mth.lerp((double) partialTicks, cart.xOld, cart.getX());
		double yLerp = Mth.lerp((double) partialTicks, cart.yOld, cart.getY());
		double zLerp = Mth.lerp((double) partialTicks, cart.zOld, cart.getZ());
		Vec3 vec3 = cart.getPos(xLerp, yLerp, zLerp);
		float f3 = Mth.lerp(partialTicks, cart.xRotO, cart.getXRot());
		if (vec3 != null) {
			Vec3 vec31 = cart.getPosOffs(xLerp, yLerp, zLerp, (double) 0.3F);
			Vec3 vec32 = cart.getPosOffs(xLerp, yLerp, zLerp, (double) -0.3F);
			if (vec31 == null) {
				vec31 = vec3;
			}

			if (vec32 == null) {
				vec32 = vec3;
			}

			poseStack.translate(vec3.x - xLerp, (vec31.y + vec32.y) / 2.0 - yLerp, vec3.z - zLerp);
			Vec3 vec33 = vec32.add(-vec31.x, -vec31.y, -vec31.z);
			if (vec33.length() != 0.0D) {
				vec33 = vec33.normalize();
				entityYaw = (float) (Math.atan2(vec33.z, vec33.x) * 180.0 / Math.PI);
				f3 = (float) (Math.atan(vec33.y) * 73.0);
			}
		}

		poseStack.translate(0.0F, 0.375F, 0.0F);
		poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - entityYaw));
		poseStack.mulPose(Axis.ZP.rotationDegrees(-f3));
		float f5 = (float) cart.getHurtTime() - partialTicks;
		float f6 = cart.getDamage() - partialTicks;
		if (f6 < 0.0F) {
			f6 = 0.0F;
		}

		if (f5 > 0.0F) {
			poseStack.mulPose(Axis.XP.rotationDegrees(Mth.sin(f5) * f5 * f6 / 10.0F * (float) cart.getHurtDir()));
		}
//        if (f5 > 0.0F) {
//            float angle = (MathHelper.sin(f5) * f5 * f6) / 10F;
//            angle = Math.min(angle, 0.8f);
//            angle = Math.copySign(angle, ((EntitySkinnedCart)entity).getRollingDirection());
//            GlStateManager.rotate(angle * f5 * f6 / 10.0F * (float)entity.getRollingDirection(), 1.0F, 0.0F, 0.0F);
//            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(angle));
//        }

		int j = cart.getDisplayOffset();
		BlockState blockstate = cart.getDisplayBlockState();
		if (blockstate.getRenderShape() != RenderShape.INVISIBLE) {
			poseStack.pushPose();
			poseStack.scale(0.75F, 0.75F, 0.75F);
			poseStack.translate(-0.5F, (float) (j - 8) / 16.0F, 0.5F);
			poseStack.mulPose(Axis.YP.rotationDegrees(90.0F));
			this.renderMinecartContents(cart, partialTicks, blockstate, poseStack, bufferSource, packedLightIn);
			poseStack.popPose();
		}

		poseStack.scale(-1.0F, -1.0F, 1.0F);
		this.modelMinecart.setupAnim(cart, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
		VertexConsumer vertexConsumer = bufferSource.getBuffer(this.modelMinecart.renderType(this.getTextureLocation(cart)));
		this.modelMinecart.renderToBuffer(poseStack, vertexConsumer, packedLightIn, OverlayTexture.NO_OVERLAY, -1);
		poseStack.popPose();
	}

	/**
	 * Returns the location of a cart's texture.
	 */
	@Override
	public ResourceLocation getTextureLocation(@NotNull T cart) {
		return CART_TEXTURES;
	}
}