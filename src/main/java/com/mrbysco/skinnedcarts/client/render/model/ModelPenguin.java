package com.mrbysco.skinnedcarts.client.render.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPenguin<E extends Entity> extends EntityModel<E> {
	private final ModelRenderer cart;
	private final ModelRenderer back_wall;
	private final ModelRenderer front_wall;
	private final ModelRenderer right_wall;
	private final ModelRenderer left_wall;
	private final ModelRenderer bottom;
	private final ModelRenderer inner;
	private final ModelRenderer head;
	private final ModelRenderer left_wing;
	private final ModelRenderer right_wing;
	private final ModelRenderer tail;
	private final ModelRenderer foot2;
	private final ModelRenderer foot;

	public ModelPenguin() {
		textureWidth = 96;
		textureHeight = 96;

		cart = new ModelRenderer(this);
		cart.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);
		

		back_wall = new ModelRenderer(this);
		back_wall.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.setTextureOffset(0, 52).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		front_wall = new ModelRenderer(this);
		front_wall.setRotationPoint(0.0F, -6.0F, -9.0F);
		cart.addChild(front_wall);
		setRotationAngle(front_wall, 0.0F, 3.1416F, 0.0F);
		front_wall.setTextureOffset(46, 22).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		right_wall = new ModelRenderer(this);
		right_wall.setRotationPoint(-7.0F, -6.0F, 0.0F);
		cart.addChild(right_wall);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		right_wall.setTextureOffset(36, 42).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		left_wall = new ModelRenderer(this);
		left_wall.setRotationPoint(7.0F, -6.0F, 0.0F);
		cart.addChild(left_wall);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		left_wall.setTextureOffset(0, 42).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(bottom);
		bottom.setTextureOffset(0, 0).addBox(-8.0F, -2.0F, -10.0F, 16.0F, 2.0F, 20.0F, 0.0F, false);

		inner = new ModelRenderer(this);
		inner.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(inner);
		inner.setTextureOffset(0, 22).addBox(-7.0F, -2.9F, -9.0F, 14.0F, 2.0F, 18.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, -8.0F);
		cart.addChild(head);
		setRotationAngle(head, -0.0873F, 0.0F, 0.0F);
		head.setTextureOffset(36, 52).addBox(-3.0F, -13.0F, -5.0F, 6.0F, 4.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(58, 58).addBox(-2.0F, -9.7081F, -8.6858F, 4.0F, 1.0F, 6.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-8.0F, -6.0F, -6.0F);
		cart.addChild(left_wing);
		setRotationAngle(left_wing, 0.0F, -0.1745F, 0.0F);
		left_wing.setTextureOffset(0, 62).addBox(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 11.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(8.0F, -6.0F, -6.0F);
		cart.addChild(right_wing);
		setRotationAngle(right_wing, 0.0F, 0.1745F, 0.0F);
		right_wing.setTextureOffset(26, 62).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 11.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -6.0F, 10.0F);
		cart.addChild(tail);
		setRotationAngle(tail, 0.3927F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 79).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);

		foot2 = new ModelRenderer(this);
		foot2.setRotationPoint(3.0F, -0.5F, 10.0F);
		cart.addChild(foot2);
		setRotationAngle(foot2, 0.3927F, 0.0F, 0.0F);
		foot2.setTextureOffset(58, 58).addBox(0.0F, -3.1913F, -0.4619F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		foot = new ModelRenderer(this);
		foot.setRotationPoint(-7.0F, -0.5F, 10.0F);
		cart.addChild(foot);
		setRotationAngle(foot, 0.3927F, 0.0F, 0.0F);
		foot.setTextureOffset(58, 58).addBox(0.0F, -3.1913F, -0.4619F, 4.0F, 2.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(E entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.cart.rotationPointY = 4.0F - ageInTicks;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		cart.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}