package com.mrbysco.skinnedcarts.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSnail<E extends Entity> extends EntityModel<E> {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer head;
	public ModelRenderer left_eye;
	public ModelRenderer right_eye;
	public ModelRenderer foot;
	public ModelRenderer left_antennae;
	public ModelRenderer right_antennae;

	public ModelSnail() {
		texWidth = 96;
		texHeight = 96;

		cart = new ModelRenderer(this);
		cart.setPos(-6.0F, 5.0F, 2.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);

		back_wall = new ModelRenderer(this, 0, 52);
		back_wall.setPos(-2.0F, 19.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.addBox(-8.0F, -29.0F, 2.0F, 16, 8, 2, 0.0F, true);

		front_wall = new ModelRenderer(this, 46, 22);
		front_wall.setPos(-2.0F, 13.0F, -9.0F);
		setRotationAngle(front_wall, 0.0F, -3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.addBox(-8.0F, -23.0F, 5.0F, 16, 8, 2, 0.0F, true);

		left_wall = new ModelRenderer(this, 36, 42);
		left_wall.setPos(5.0F, 13.0F, 0.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.addBox(-2.0F, -23.0F, -1.0F, 16, 8, 2, 0.0F, true);

		right_wall = new ModelRenderer(this, 0, 42);
		right_wall.setPos(-9.0F, 13.0F, 0.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.addBox(-14.0F, -23.0F, -1.0F, 16, 8, 2, 0.0F, true);

		bottom = new ModelRenderer(this, 0, 0);
		bottom.setPos(-2.0F, 19.0F, 0.0F);
		cart.addChild(bottom);
		bottom.addBox(-8.0F, -21.0F, -16.0F, 16, 2, 20, 0.0F, true);

		inner = new ModelRenderer(this, 0, 22);
		inner.setPos(-2.0F, 19.0F, 0.0F);
		cart.addChild(inner);
		inner.addBox(-7.0F, -21.9F, -15.0F, 14, 2, 18, 0.0F, true);

		head = new ModelRenderer(this, 0, 62);
		head.setPos(-2.0F, 9.0F, -10.0F);
		setRotationAngle(head, 0.1745F, 0.0F, 0.0F);
		cart.addChild(head);
		head.addBox(-4.0F, -22.7532F, -7.6095F, 8, 12, 5, 0.0F, true);

		right_eye = new ModelRenderer(this, 0, 0);
		right_eye.setPos(-0.5F, 7.0F, -12.0F);
		setRotationAngle(right_eye, -0.3491F, 0.0F, 0.0F);
		cart.addChild(right_eye);
		right_eye.addBox(0.0F, -21.802F, -12.1365F, 1, 6, 1, 0.0F, true);

		left_eye = new ModelRenderer(this, 0, 0);
		left_eye.setPos(-3.5F, 7.0F, -12.0F);
		setRotationAngle(left_eye, -0.3491F, 0.0F, 0.0F);
		cart.addChild(left_eye);
		left_eye.addBox(-1.0F, -21.802F, -12.1365F, 1, 6, 1, 0.0F, false);

		foot = new ModelRenderer(this, 36, 52);
		foot.setPos(-2.0F, 19.0F, -8.0F);
		cart.addChild(foot);
		foot.addBox(-4.0F, -22.0F, 12.0F, 8, 3, 4, 0.0F, true);

		right_antennae = new ModelRenderer(this, 4, 0);
		right_antennae.setPos(0.5F, 11.0F, -13.0F);
		setRotationAngle(right_antennae, -0.9599F, -0.1745F, -0.0873F);
		cart.addChild(right_antennae);
		right_antennae.addBox(0.1564F, -5.4147F, -22.0471F, 1, 2, 1, 0.0F, false);

		left_antennae = new ModelRenderer(this, 4, 0);
		left_antennae.setPos(-4.5F, 11.0F, -13.0F);
		setRotationAngle(left_antennae, -0.9599F, 0.1745F, 0.0873F);
		cart.addChild(left_antennae);
		left_antennae.addBox(-1.1564F, -5.4147F, -22.0471F, 1, 2, 1, 0.0F, true);


	}

	@Override
	public void setupAnim(E entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.cart.y = 4.0F - ageInTicks;
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		cart.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}