package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelTurtle<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel back_wall;
	private final RendererModel front_wall;
	private final RendererModel right_wall;
	private final RendererModel left_wall;
	private final RendererModel bottom;
	private final RendererModel inner;
	private final RendererModel left_flipper_front;
	private final RendererModel right_flipper_front;
	private final RendererModel left_flipper_back;
	private final RendererModel right_flipper_back;
	private final RendererModel head;

	public ModelTurtle() {
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

		left_flipper_front = new RendererModel(this);
		left_flipper_front.setRotationPoint(-8.0F, -2.0F, 2.0F);
		cart.addChild(left_flipper_front);
		setRotationAngle(left_flipper_front, 0.0F, 0.2618F, 0.0F);
		left_flipper_front.cubeList.add(new ModelBox(left_flipper_front, 0, 62, -6.0F, -1.0F, 0.0F, 6, 2, 5, 0.0F, false));

		right_flipper_front = new RendererModel(this);
		right_flipper_front.setRotationPoint(8.0F, -2.0F, 2.0F);
		cart.addChild(right_flipper_front);
		setRotationAngle(right_flipper_front, 0.0F, -0.2618F, 0.0F);
		right_flipper_front.cubeList.add(new ModelBox(right_flipper_front, 22, 62, 0.0F, -1.0F, 0.0F, 6, 2, 5, 0.0F, false));

		left_flipper_back = new RendererModel(this);
		left_flipper_back.setRotationPoint(-2.0F, -2.0F, 18.0F);
		cart.addChild(left_flipper_back);
		setRotationAngle(left_flipper_back, 0.0F, -0.1745F, 0.0F);
		left_flipper_back.cubeList.add(new ModelBox(left_flipper_back, 20, 69, -5.0F, -1.0F, 0.0F, 5, 2, 5, 0.0F, false));

		right_flipper_back = new RendererModel(this);
		right_flipper_back.setRotationPoint(2.0F, -2.0F, 18.0F);
		cart.addChild(right_flipper_back);
		setRotationAngle(right_flipper_back, 0.0F, 0.1745F, 0.0F);
		right_flipper_back.cubeList.add(new ModelBox(right_flipper_back, 0, 69, 0.0F, -1.0F, 0.0F, 5, 2, 5, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(head);
		head.cubeList.add(new ModelBox(head, 36, 52, -3.0F, -6.0F, -7.0F, 6, 5, 5, 0.0F, false));
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