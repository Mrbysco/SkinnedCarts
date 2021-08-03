package com.mrbysco.skinnedcarts.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelElephant<E extends Entity> extends EntityModel<E> {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer head;
	public ModelRenderer trunk;
	public ModelRenderer left_ear;
	public ModelRenderer right_ear;
	public ModelRenderer left_tusk;
	public ModelRenderer right_tusk;

	public ModelElephant() {
		texWidth = 96;
		texHeight = 96;

		cart = new ModelRenderer(this);
		cart.setPos(2.0F, 5.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);

		back_wall = new ModelRenderer(this);
		back_wall.setPos(0.0F, 0.0F, 2.0F);
		cart.addChild(back_wall);
		back_wall.texOffs(0, 52).addBox(-8.0F, -10.0F, 8.0F, 16, 8, 2, 0.0F, true);

		front_wall = new ModelRenderer(this);
		front_wall.setPos(0.0F, -6.0F, -7.0F);
		setRotationAngle(front_wall, 0.0F, -3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.texOffs(46, 22).addBox(-8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, true);

		left_wall = new ModelRenderer(this);
		left_wall.setPos(7.0F, -6.0F, 2.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.texOffs(36, 42).addBox(-8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, true);

		right_wall = new ModelRenderer(this);
		right_wall.setPos(-7.0F, -6.0F, 2.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.texOffs(0, 42).addBox(-8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, true);

		bottom = new ModelRenderer(this);
		bottom.setPos(0.0F, 0.0F, 2.0F);
		cart.addChild(bottom);
		bottom.texOffs(0, 0).addBox(-8.0F, -2.0F, -10.0F, 16, 2, 20, 0.0F, true);

		inner = new ModelRenderer(this);
		inner.setPos(0.0F, 0.0F, 2.0F);
		cart.addChild(inner);
		inner.texOffs(0, 22).addBox(-7.0F, -2.9F, -9.0F, 14, 2, 18, 0.0F, true);

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, -6.0F);
		cart.addChild(head);
		head.texOffs(0, 62).addBox(-4.0F, -12.0F, -7.0F, 8, 8, 5, 0.0F, true);

		trunk = new ModelRenderer(this);
		trunk.setPos(0.0F, -8.0F, -13.0F);
		setRotationAngle(trunk, -0.2618F, 0.0F, 0.0F);
		cart.addChild(trunk);
		trunk.texOffs(26, 62).addBox(-2.0F, 0.0F, 0.0F, 4, 5, 7, 0.0F, true);

		right_ear = new ModelRenderer(this);
		right_ear.setPos(4.0F, -9.0F, -10.0F);
		setRotationAngle(right_ear, 0.0F, -0.1745F, 0.0F);
		cart.addChild(right_ear);
		right_ear.texOffs(36, 52).addBox(0.0F, -4.0F, 0.0F, 5, 8, 2, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setPos(-4.0F, -9.0F, -10.0F);
		setRotationAngle(left_ear, 0.0F, 0.1745F, 0.0F);
		cart.addChild(left_ear);
		left_ear.texOffs(36, 52).addBox(-5.0F, -4.0F, 0.0F, 5, 8, 2, 0.0F, true);

		right_tusk = new ModelRenderer(this);
		right_tusk.setPos(2.0F, -5.0F, -13.0F);
		setRotationAngle(right_tusk, 0.1745F, 0.0F, 0.0F);
		cart.addChild(right_tusk);
		right_tusk.texOffs(0, 0).addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false);

		left_tusk = new ModelRenderer(this);
		left_tusk.setPos(-2.0F, -5.0F, -13.0F);
		setRotationAngle(left_tusk, 0.1745F, 0.0F, 0.0F);
		cart.addChild(left_tusk);
		left_tusk.texOffs(0, 0).addBox(-1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false);

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