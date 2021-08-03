package com.mrbysco.skinnedcarts.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPufferFish<E extends Entity> extends EntityModel<E> {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer mouth;
	public ModelRenderer left_fin;
	public ModelRenderer right_fin;
	public ModelRenderer left_spines_1;
	public ModelRenderer right_spines_1;
	public ModelRenderer top_spines_1;
	public ModelRenderer bottom_spines_1;
	public ModelRenderer top_spines_2;
	public ModelRenderer bottom_spines_2;
	public ModelRenderer right_spines_4;
	public ModelRenderer left_spines_4;
	public ModelRenderer right_spines_2;
	public ModelRenderer right_spines_3;
	public ModelRenderer left_spines_2;
	public ModelRenderer left_spines_3;
	public ModelRenderer top_spines_left_1;
	public ModelRenderer top_spines_left_2;
	public ModelRenderer top_spines_right_2;
	public ModelRenderer top_spines_right_1;

	public ModelPufferFish() {
		texWidth = 96;
		texHeight = 96;

		cart = new ModelRenderer(this);
		cart.setPos(-6.0F, 5.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);

		back_wall = new ModelRenderer(this, 0, 52);
		back_wall.setPos(-2.0F, 19.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.addBox(-6.0F, -29.0F, 2.0F, 16, 8, 2, 0.0F, true);

		front_wall = new ModelRenderer(this, 46, 22);
		front_wall.setPos(-2.0F, 13.0F, -9.0F);
		setRotationAngle(front_wall, 0.0F, -3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.addBox(-10.0F, -23.0F, 5.0F, 16, 8, 2, 0.0F, true);

		left_wall = new ModelRenderer(this, 36, 42);
		left_wall.setPos(5.0F, 13.0F, 0.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.addBox(-2.0F, -23.0F, 1.0F, 16, 8, 2, 0.0F, true);

		right_wall = new ModelRenderer(this, 0, 42);
		right_wall.setPos(-9.0F, 13.0F, 0.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.addBox(-14.0F, -23.0F, -3.0F, 16, 8, 2, 0.0F, true);

		bottom = new ModelRenderer(this, 0, 0);
		bottom.setPos(-2.0F, 19.0F, 0.0F);
		cart.addChild(bottom);
		bottom.addBox(-6.0F, -21.0F, -16.0F, 16, 2, 20, 0.0F, true);

		inner = new ModelRenderer(this, 0, 22);
		inner.setPos(-2.0F, 19.0F, 0.0F);
		cart.addChild(inner);
		inner.addBox(-5.0F, -21.9F, -15.0F, 14, 2, 18, 0.0F, true);

		mouth = new ModelRenderer(this, 36, 52);
		mouth.setPos(-2.0F, 19.0F, -8.0F);
		cart.addChild(mouth);
		mouth.addBox(0.0F, -26.0F, -9.0F, 4, 3, 1, 0.0F, true);

		right_fin = new ModelRenderer(this, 59, 52);
		right_fin.setPos(6.0F, 12.0F, -3.0F);
		setRotationAngle(right_fin, 0.0F, 0.0F, -0.2618F);
		cart.addChild(right_fin);
		right_fin.addBox(6.8494F, -19.835F, -8.0F, 3, 1, 4, 0.0F, true);

		left_fin = new ModelRenderer(this, 46, 52);
		left_fin.setPos(-10.0F, 12.0F, -3.0F);
		setRotationAngle(left_fin, 0.0F, 0.0F, 0.2618F);
		cart.addChild(left_fin);
		left_fin.addBox(-5.9857F, -19.8702F, -8.0F, 3, 1, 4, 0.0F, true);

		right_spines_1 = new ModelRenderer(this, 16, 76);
		right_spines_1.setPos(6.0F, 14.0F, -10.0F);
		setRotationAngle(right_spines_1, 0.0F, 0.7854F, 0.0F);
		cart.addChild(right_spines_1);
		right_spines_1.addBox(5.6569F, -24.0F, -2.8284F, 1, 10, 0, 0.0F, true);

		left_spines_1 = new ModelRenderer(this, 16, 64);
		left_spines_1.setPos(-10.0F, 14.0F, -10.0F);
		setRotationAngle(left_spines_1, 0.0F, -0.7854F, 0.0F);
		cart.addChild(left_spines_1);
		left_spines_1.addBox(-3.8284F, -24.0F, -5.6569F, 1, 10, 0, 0.0F, true);

		top_spines_1 = new ModelRenderer(this, 0, 62);
		top_spines_1.setPos(-2.0F, 9.0F, -10.0F);
		setRotationAngle(top_spines_1, 0.7854F, 0.0F, 0.0F);
		cart.addChild(top_spines_1);
		top_spines_1.addBox(-6.0F, -18.6777F, 9.1924F, 16, 1, 0, 0.0F, true);

		bottom_spines_1 = new ModelRenderer(this, 0, 74);
		bottom_spines_1.setPos(-2.0F, 19.0F, -10.0F);
		setRotationAngle(bottom_spines_1, -0.7854F, 0.0F, 0.0F);
		cart.addChild(bottom_spines_1);
		bottom_spines_1.addBox(-6.0F, -9.1924F, -17.6777F, 16, 1, 0, 0.0F, true);

		top_spines_2 = new ModelRenderer(this, 0, 63);
		top_spines_2.setPos(-2.0F, 9.0F, 10.0F);
		setRotationAngle(top_spines_2, -0.7854F, 0.0F, 0.0F);
		cart.addChild(top_spines_2);
		top_spines_2.addBox(-6.0F, -10.1924F, -17.6777F, 16, 1, 0, 0.0F, true);

		bottom_spines_2 = new ModelRenderer(this, 0, 75);
		bottom_spines_2.setPos(-2.0F, 19.0F, 10.0F);
		setRotationAngle(bottom_spines_2, 0.7854F, 0.0F, 0.0F);
		cart.addChild(bottom_spines_2);
		bottom_spines_2.addBox(-6.0F, -17.6777F, 9.1924F, 16, 1, 0, 0.0F, true);

		left_spines_4 = new ModelRenderer(this, 16, 76);
		left_spines_4.setPos(-10.0F, 14.0F, 10.0F);
		setRotationAngle(left_spines_4, 0.0F, 0.7854F, 0.0F);
		cart.addChild(left_spines_4);
		left_spines_4.addBox(4.6569F, -24.0F, -2.8284F, 1, 10, 0, 0.0F, true);

		right_spines_4 = new ModelRenderer(this, 16, 64);
		right_spines_4.setPos(6.0F, 14.0F, 10.0F);
		setRotationAngle(right_spines_4, 0.0F, -0.7854F, 0.0F);
		cart.addChild(right_spines_4);
		right_spines_4.addBox(-2.8284F, -24.0F, -5.6569F, 1, 10, 0, 0.0F, true);

		left_spines_2 = new ModelRenderer(this, 0, 76);
		left_spines_2.setPos(-4.0F, 17.0F, 10.0F);
		cart.addChild(left_spines_2);
		left_spines_2.addBox(-5.0F, -27.0F, -20.0F, 1, 10, 0, 0.0F, true);

		left_spines_3 = new ModelRenderer(this, 0, 64);
		left_spines_3.setPos(-4.0F, 17.0F, 10.0F);
		cart.addChild(left_spines_3);
		left_spines_3.addBox(-5.0F, -27.0F, -12.0F, 1, 10, 0, 0.0F, true);

		right_spines_2 = new ModelRenderer(this, 0, 64);
		right_spines_2.setPos(-4.0F, 17.0F, 10.0F);
		cart.addChild(right_spines_2);
		right_spines_2.addBox(12.0F, -27.0F, -20.0F, 1, 10, 0, 0.0F, true);

		right_spines_3 = new ModelRenderer(this, 0, 76);
		right_spines_3.setPos(-4.0F, 17.0F, 10.0F);
		cart.addChild(right_spines_3);
		right_spines_3.addBox(12.0F, -27.0F, -12.0F, 1, 10, 0, 0.0F, true);

		top_spines_right_1 = new ModelRenderer(this, 0, 86);
		top_spines_right_1.setPos(-4.0F, 17.0F, 10.0F);
		cart.addChild(top_spines_right_1);
		top_spines_right_1.addBox(10.0F, -28.0F, -20.0F, 2, 1, 0, 0.0F, true);

		top_spines_right_2 = new ModelRenderer(this, 0, 87);
		top_spines_right_2.setPos(-4.0F, 17.0F, 10.0F);
		cart.addChild(top_spines_right_2);
		top_spines_right_2.addBox(10.0F, -28.0F, -12.0F, 2, 1, 0, 0.0F, true);

		top_spines_left_2 = new ModelRenderer(this, 0, 86);
		top_spines_left_2.setPos(-4.0F, 17.0F, 10.0F);
		cart.addChild(top_spines_left_2);
		top_spines_left_2.addBox(-4.0F, -28.0F, -12.0F, 2, 1, 0, 0.0F, true);

		top_spines_left_1 = new ModelRenderer(this, 0, 87);
		top_spines_left_1.setPos(-4.0F, 17.0F, 10.0F);
		cart.addChild(top_spines_left_1);
		top_spines_left_1.addBox(-4.0F, -28.0F, -20.0F, 2, 1, 0, 0.0F, true);

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