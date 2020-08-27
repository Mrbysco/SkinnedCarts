package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelPufferFish<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel back_wall;
	private final RendererModel front_wall;
	private final RendererModel right_wall;
	private final RendererModel left_wall;
	private final RendererModel bottom;
	private final RendererModel inner;
	private final RendererModel mouth;
	private final RendererModel left_fin;
	private final RendererModel right_fin;
	private final RendererModel left_spines_1;
	private final RendererModel right_spines_1;
	private final RendererModel top_spines_1;
	private final RendererModel bottom_spines_1;
	private final RendererModel top_spines_2;
	private final RendererModel top_spines_left_1;
	private final RendererModel bottom_spines_2;
	private final RendererModel top_spines_left_2;
	private final RendererModel right_spines_4;
	private final RendererModel left_spines_4;
	private final RendererModel top_spines_right_2;
	private final RendererModel right_spines_2;
	private final RendererModel right_spines_3;
	private final RendererModel top_spines_right_1;
	private final RendererModel left_spines_2;
	private final RendererModel left_spines_3;

	public ModelPufferFish() {
		textureWidth = 96;
		textureHeight = 96;

		cart = new RendererModel(this);
		cart.setRotationPoint(8.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);
		

		back_wall = new RendererModel(this);
		back_wall.setRotationPoint(0.0F, 0.0F, 8.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 0, 52, -8.0F, -10.0F, 8.0F, 16, 8, 2, 0.0F, false));

		front_wall = new RendererModel(this);
		front_wall.setRotationPoint(0.0F, -6.0F, -1.0F);
		cart.addChild(front_wall);
		setRotationAngle(front_wall, 0.0F, 3.1416F, 0.0F);
		front_wall.cubeList.add(new ModelBox(front_wall, 46, 22, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		right_wall = new RendererModel(this);
		right_wall.setRotationPoint(-7.0F, -6.0F, 8.0F);
		cart.addChild(right_wall);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		right_wall.cubeList.add(new ModelBox(right_wall, 36, 42, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		left_wall = new RendererModel(this);
		left_wall.setRotationPoint(7.0F, -6.0F, 8.0F);
		cart.addChild(left_wall);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		left_wall.cubeList.add(new ModelBox(left_wall, 0, 42, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		bottom = new RendererModel(this);
		bottom.setRotationPoint(0.0F, 0.0F, 8.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -8.0F, -2.0F, -10.0F, 16, 2, 20, 0.0F, false));

		inner = new RendererModel(this);
		inner.setRotationPoint(0.0F, 0.0F, 8.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -7.0F, -2.9F, -9.0F, 14, 2, 18, 0.0F, false));

		mouth = new RendererModel(this);
		mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(mouth);
		mouth.cubeList.add(new ModelBox(mouth, 36, 52, -2.0F, -7.0F, -3.0F, 4, 3, 1, 0.0F, false));

		left_fin = new RendererModel(this);
		left_fin.setRotationPoint(-8.0F, -7.0F, 5.0F);
		cart.addChild(left_fin);
		setRotationAngle(left_fin, 0.0F, 0.0F, 0.2618F);
		left_fin.cubeList.add(new ModelBox(left_fin, 59, 52, -3.0F, -2.0F, -2.0F, 3, 1, 4, 0.0F, false));

		right_fin = new RendererModel(this);
		right_fin.setRotationPoint(8.0F, -7.0F, 5.0F);
		cart.addChild(right_fin);
		setRotationAngle(right_fin, 0.0F, 0.0F, -0.2618F);
		right_fin.cubeList.add(new ModelBox(right_fin, 46, 52, 0.0F, -1.0F, -2.0F, 3, 1, 4, 0.0F, false));

		left_spines_1 = new RendererModel(this);
		left_spines_1.setRotationPoint(-8.0F, -5.0F, -2.0F);
		cart.addChild(left_spines_1);
		setRotationAngle(left_spines_1, 0.0F, -0.7854F, 0.0F);
		left_spines_1.cubeList.add(new ModelBox(left_spines_1, 16, 76, -1.0F, -5.0F, 0.0F, 1, 10, 0, 0.0F, false));

		right_spines_1 = new RendererModel(this);
		right_spines_1.setRotationPoint(8.0F, -5.0F, -2.0F);
		cart.addChild(right_spines_1);
		setRotationAngle(right_spines_1, 0.0F, 0.7854F, 0.0F);
		right_spines_1.cubeList.add(new ModelBox(right_spines_1, 16, 64, 0.0F, -5.0F, 0.0F, 1, 10, 0, 0.0F, false));

		top_spines_1 = new RendererModel(this);
		top_spines_1.setRotationPoint(0.0F, -10.0F, -2.0F);
		cart.addChild(top_spines_1);
		setRotationAngle(top_spines_1, 0.7854F, 0.0F, 0.0F);
		top_spines_1.cubeList.add(new ModelBox(top_spines_1, 0, 62, -8.0F, -1.0F, 0.0F, 16, 1, 0, 0.0F, false));

		bottom_spines_1 = new RendererModel(this);
		bottom_spines_1.setRotationPoint(0.0F, 0.0F, -2.0F);
		cart.addChild(bottom_spines_1);
		setRotationAngle(bottom_spines_1, -0.7854F, 0.0F, 0.0F);
		bottom_spines_1.cubeList.add(new ModelBox(bottom_spines_1, 0, 74, -8.0F, 0.0F, 0.0F, 16, 1, 0, 0.0F, false));

		top_spines_2 = new RendererModel(this);
		top_spines_2.setRotationPoint(0.0F, -10.0F, 18.0F);
		cart.addChild(top_spines_2);
		setRotationAngle(top_spines_2, -0.7854F, 0.0F, 0.0F);
		top_spines_2.cubeList.add(new ModelBox(top_spines_2, 0, 63, -8.0F, -1.0F, 0.0F, 16, 1, 0, 0.0F, false));

		top_spines_left_1 = new RendererModel(this);
		top_spines_left_1.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(top_spines_left_1);
		top_spines_left_1.cubeList.add(new ModelBox(top_spines_left_1, 0, 86, -10.0F, -9.0F, -14.0F, 2, 1, 0, 0.0F, false));

		bottom_spines_2 = new RendererModel(this);
		bottom_spines_2.setRotationPoint(0.0F, 0.0F, 18.0F);
		cart.addChild(bottom_spines_2);
		setRotationAngle(bottom_spines_2, 0.7854F, 0.0F, 0.0F);
		bottom_spines_2.cubeList.add(new ModelBox(bottom_spines_2, 0, 75, -8.0F, 0.0F, 0.0F, 16, 1, 0, 0.0F, false));

		top_spines_left_2 = new RendererModel(this);
		top_spines_left_2.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(top_spines_left_2);
		top_spines_left_2.cubeList.add(new ModelBox(top_spines_left_2, 0, 87, -10.0F, -9.0F, -6.0F, 2, 1, 0, 0.0F, false));

		right_spines_4 = new RendererModel(this);
		right_spines_4.setRotationPoint(8.0F, -5.0F, 18.0F);
		cart.addChild(right_spines_4);
		setRotationAngle(right_spines_4, 0.0F, -0.7854F, 0.0F);
		right_spines_4.cubeList.add(new ModelBox(right_spines_4, 16, 76, 0.0F, -5.0F, 0.0F, 1, 10, 0, 0.0F, false));

		left_spines_4 = new RendererModel(this);
		left_spines_4.setRotationPoint(-8.0F, -5.0F, 18.0F);
		cart.addChild(left_spines_4);
		setRotationAngle(left_spines_4, 0.0F, 0.7854F, 0.0F);
		left_spines_4.cubeList.add(new ModelBox(left_spines_4, 16, 64, -1.0F, -5.0F, 0.0F, 1, 10, 0, 0.0F, false));

		top_spines_right_2 = new RendererModel(this);
		top_spines_right_2.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(top_spines_right_2);
		top_spines_right_2.cubeList.add(new ModelBox(top_spines_right_2, 0, 86, 4.0F, -9.0F, -6.0F, 2, 1, 0, 0.0F, false));

		right_spines_2 = new RendererModel(this);
		right_spines_2.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(right_spines_2);
		right_spines_2.cubeList.add(new ModelBox(right_spines_2, 0, 76, 6.0F, -8.0F, -14.0F, 1, 10, 0, 0.0F, false));

		right_spines_3 = new RendererModel(this);
		right_spines_3.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(right_spines_3);
		right_spines_3.cubeList.add(new ModelBox(right_spines_3, 0, 64, 6.0F, -8.0F, -6.0F, 1, 10, 0, 0.0F, false));

		top_spines_right_1 = new RendererModel(this);
		top_spines_right_1.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(top_spines_right_1);
		top_spines_right_1.cubeList.add(new ModelBox(top_spines_right_1, 0, 87, 4.0F, -9.0F, -14.0F, 2, 1, 0, 0.0F, false));

		left_spines_2 = new RendererModel(this);
		left_spines_2.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(left_spines_2);
		left_spines_2.cubeList.add(new ModelBox(left_spines_2, 0, 64, -11.0F, -8.0F, -14.0F, 1, 10, 0, 0.0F, false));

		left_spines_3 = new RendererModel(this);
		left_spines_3.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(left_spines_3);
		left_spines_3.cubeList.add(new ModelBox(left_spines_3, 0, 76, -11.0F, -8.0F, -6.0F, 1, 10, 0, 0.0F, false));
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