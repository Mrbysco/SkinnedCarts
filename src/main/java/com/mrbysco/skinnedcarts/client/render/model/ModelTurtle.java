package com.mrbysco.skinnedcarts.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTurtle<E extends Entity> extends EntityModel<E> {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer head;
	public ModelRenderer left_flipper_front;
	public ModelRenderer right_flipper_front;
	public ModelRenderer left_flipper_back;
	public ModelRenderer right_flipper_back;

	public ModelTurtle() {
		texWidth = 96;
		texHeight = 96;

		cart = new ModelRenderer(this);
		cart.setPos(-6.0F, 5.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);

		back_wall = new ModelRenderer(this, 0, 52);
		back_wall.setPos(2.0F, 19.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.addBox(-10.0F, -29.0F, 2.0F, 16, 8, 2, 0.0F, false);

		front_wall = new ModelRenderer(this, 46, 22);
		front_wall.setPos(2.0F, 13.0F, -9.0F);
		setRotationAngle(front_wall, 0.0F, 3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.addBox(-6.0F, -23.0F, 5.0F, 16, 8, 2, 0.0F, false);

		right_wall = new ModelRenderer(this, 36, 42);
		right_wall.setPos(-5.0F, 13.0F, 0.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.addBox(-14.0F, -23.0F, 1.0F, 16, 8, 2, 0.0F, false);

		left_wall = new ModelRenderer(this, 0, 42);
		left_wall.setPos(9.0F, 13.0F, 0.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.addBox(-2.0F, -23.0F, -3.0F, 16, 8, 2, 0.0F, false);

		bottom = new ModelRenderer(this, 0, 0);
		bottom.setPos(2.0F, 19.0F, 0.0F);
		cart.addChild(bottom);
		bottom.addBox(-10.0F, -21.0F, -16.0F, 16, 2, 20, 0.0F, false);

		inner = new ModelRenderer(this, 0, 22);
		inner.setPos(2.0F, 19.0F, 0.0F);
		cart.addChild(inner);
		inner.addBox(-9.0F, -21.9F, -15.0F, 14, 2, 18, 0.0F, false);

		head = new ModelRenderer(this, 36, 52);
		head.setPos(2.0F, 19.0F, -8.0F);
		cart.addChild(head);
		head.addBox(-5.0F, -25.0F, -13.0F, 6, 5, 5, 0.0F, false);

		left_flipper_front = new ModelRenderer(this, 0, 62);
		left_flipper_front.setPos(-6.0F, 17.0F, -6.0F);
		setRotationAngle(left_flipper_front, 0.0F, 0.2618F, 0.0F);
		cart.addChild(left_flipper_front);
		left_flipper_front.addBox(-6.3789F, -20.0F, -6.3132F, 6, 2, 5, 0.0F, false);

		right_flipper_front = new ModelRenderer(this, 22, 62);
		right_flipper_front.setPos(10.0F, 17.0F, -6.0F);
		setRotationAngle(right_flipper_front, 0.0F, -0.2618F, 0.0F);
		cart.addChild(right_flipper_front);
		right_flipper_front.addBox(-3.4848F, -20.0F, -5.2779F, 6, 2, 5, 0.0F, false);

		left_flipper_back = new ModelRenderer(this, 20, 69);
		left_flipper_back.setPos(0.0F, 17.0F, 10.0F);
		setRotationAngle(left_flipper_back, 0.0F, -0.1745F, 0.0F);
		cart.addChild(left_flipper_back);
		left_flipper_back.addBox(-8.0115F, -20.0F, -5.5616F, 5, 2, 5, 0.0F, false);

		right_flipper_back = new ModelRenderer(this, 0, 69);
		right_flipper_back.setPos(4.0F, 17.0F, 10.0F);
		setRotationAngle(right_flipper_back, 0.0F, 0.1745F, 0.0F);
		cart.addChild(right_flipper_back);
		right_flipper_back.addBox(-0.9277F, -20.0F, -6.2561F, 5, 2, 5, 0.0F, false);

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