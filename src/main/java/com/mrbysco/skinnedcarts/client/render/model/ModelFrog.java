package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelFrog<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel bottom;
	private final RendererModel seat;
	private final RendererModel left;
	private final RendererModel back;
	private final RendererModel front;
	private final RendererModel right;
	private final RendererModel Leg1;
	private final RendererModel Leg3;
	private final RendererModel Leg2;
	private final RendererModel Leg1_1;
	private final RendererModel Leg2_1;
	private final RendererModel Leg3_1;

	public ModelFrog() {
		textureWidth = 64;
		textureHeight = 64;

		cart = new RendererModel(this);
		cart.setRotationPoint(0.0F, 24.0F, 0.0F);


		bottom = new RendererModel(this);
		bottom.setRotationPoint(0.0F, -1.0F, 0.0F);
		cart.addChild(bottom);
		setRotationAngle(bottom, 1.5708F, 0.0F, 0.0F);
		bottom.cubeList.add(new ModelBox(bottom, 0, 46, -10.0F, -8.0F, -1.0F, 20, 16, 2, 0.0F, true));

		seat = new RendererModel(this);
		seat.setRotationPoint(0.0F, -1.0F, 0.0F);
		cart.addChild(seat);
		setRotationAngle(seat, -1.5708F, 0.0F, 0.0F);
		seat.cubeList.add(new ModelBox(seat, 44, 47, -9.0F, -7.0F, -1.0F, 18, 14, 1, 0.0F, true));

		left = new RendererModel(this);
		left.setRotationPoint(0.0F, -1.0F, 7.0F);
		cart.addChild(left);
		left.cubeList.add(new ModelBox(left, 0, 30, -8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F, false));

		back = new RendererModel(this);
		back.setRotationPoint(-9.0F, -1.0F, 0.0F);
		cart.addChild(back);
		setRotationAngle(back, 0.0F, -1.5708F, 0.0F);
		back.cubeList.add(new ModelBox(back, 0, 10, -8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F, true));

		front = new RendererModel(this);
		front.setRotationPoint(9.0F, -1.0F, 0.0F);
		cart.addChild(front);
		setRotationAngle(front, 0.0F, -4.7124F, 0.0F);
		front.cubeList.add(new ModelBox(front, 0, 0, -8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F, true));

		right = new RendererModel(this);
		right.setRotationPoint(0.0F, -1.0F, -7.0F);
		cart.addChild(right);
		setRotationAngle(right, 0.0F, -3.1416F, 0.0F);
		right.cubeList.add(new ModelBox(right, 0, 20, -8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F, true));

		Leg1 = new RendererModel(this);
		Leg1.setRotationPoint(-3.0F, 0.0F, 4.0F);
		cart.addChild(Leg1);
		Leg1.cubeList.add(new ModelBox(Leg1, 37, 0, 0.0F, -4.0F, 4.0F, 4, 4, 2, 0.0F, true));

		Leg3 = new RendererModel(this);
		Leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leg1.addChild(Leg3);
		Leg3.cubeList.add(new ModelBox(Leg3, 37, 0, 6.0F, -3.0F, 7.0F, 4, 4, 4, 0.0F, true));

		Leg2 = new RendererModel(this);
		Leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leg1.addChild(Leg2);
		Leg2.cubeList.add(new ModelBox(Leg2, 37, 0, 2.0F, -4.0F, 6.0F, 4, 4, 4, 0.0F, true));

		Leg1_1 = new RendererModel(this);
		Leg1_1.setRotationPoint(-3.0F, 0.0F, -4.0F);
		cart.addChild(Leg1_1);
		Leg1_1.cubeList.add(new ModelBox(Leg1_1, 37, 0, 0.0F, -4.0F, -6.0F, 4, 4, 2, 0.0F, true));

		Leg2_1 = new RendererModel(this);
		Leg2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leg1_1.addChild(Leg2_1);
		Leg2_1.cubeList.add(new ModelBox(Leg2_1, 37, 0, 2.0F, -4.0F, -10.0F, 4, 4, 4, 0.0F, true));

		Leg3_1 = new RendererModel(this);
		Leg3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leg1_1.addChild(Leg3_1);
		Leg3_1.cubeList.add(new ModelBox(Leg3_1, 37, 0, 6.0F, -3.0F, -11.0F, 4, 4, 4, 0.0F, true));
	}

	@Override
	public void setRotationAngles(E entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		this.cart.rotationPointY = 4.0F - ageInTicks;
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		cart.render(scale);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}