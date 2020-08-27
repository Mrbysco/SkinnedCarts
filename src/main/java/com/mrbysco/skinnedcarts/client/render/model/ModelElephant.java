package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelElephant<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel back_wall;
	private final RendererModel front_wall;
	private final RendererModel right_wall;
	private final RendererModel left_wall;
	private final RendererModel bottom;
	private final RendererModel inner;
	private final RendererModel head;
	private final RendererModel trunk;
	private final RendererModel left_ear;
	private final RendererModel right_ear;
	private final RendererModel left_tusk;
	private final RendererModel right_tusk;

	public ModelElephant() {
		textureWidth = 96;
		textureHeight = 96;

		cart = new RendererModel(this);
		cart.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);
		

		back_wall = new RendererModel(this);
		back_wall.setRotationPoint(0.0F, 0.0F, 8.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 0, 52, -8.0F, -10.0F, 0.0F, 16, 8, 2, 0.0F, false));

		front_wall = new RendererModel(this);
		front_wall.setRotationPoint(0.0F, -6.0F, -1.0F);
		cart.addChild(front_wall);
		setRotationAngle(front_wall, 0.0F, 3.1416F, 0.0F);
		front_wall.cubeList.add(new ModelBox(front_wall, 46, 22, -8.0F, -4.0F, 7.0F, 16, 8, 2, 0.0F, false));

		right_wall = new RendererModel(this);
		right_wall.setRotationPoint(-7.0F, -6.0F, 8.0F);
		cart.addChild(right_wall);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		right_wall.cubeList.add(new ModelBox(right_wall, 36, 42, -16.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		left_wall = new RendererModel(this);
		left_wall.setRotationPoint(7.0F, -6.0F, 8.0F);
		cart.addChild(left_wall);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		left_wall.cubeList.add(new ModelBox(left_wall, 0, 42, 0.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		bottom = new RendererModel(this);
		bottom.setRotationPoint(0.0F, 0.0F, 8.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -8.0F, -2.0F, -18.0F, 16, 2, 20, 0.0F, false));

		inner = new RendererModel(this);
		inner.setRotationPoint(0.0F, 0.0F, 8.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -7.0F, -2.9F, -17.0F, 14, 2, 18, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 62, -4.0F, -12.0F, -15.0F, 8, 8, 5, 0.0F, false));

		trunk = new RendererModel(this);
		trunk.setRotationPoint(0.0F, -8.0F, -7.0F);
		cart.addChild(trunk);
		setRotationAngle(trunk, -0.2618F, 0.0F, 0.0F);
		trunk.cubeList.add(new ModelBox(trunk, 26, 62, -2.0F, 2.0706F, -7.7274F, 4, 5, 7, 0.0F, false));

		left_ear = new RendererModel(this);
		left_ear.setRotationPoint(-4.0F, -9.0F, -4.0F);
		cart.addChild(left_ear);
		setRotationAngle(left_ear, 0.0F, 0.1745F, 0.0F);
		left_ear.cubeList.add(new ModelBox(left_ear, 36, 52, -3.6108F, -4.0F, -7.8785F, 5, 8, 2, 0.0F, true));

		right_ear = new RendererModel(this);
		right_ear.setRotationPoint(4.0F, -9.0F, -4.0F);
		cart.addChild(right_ear);
		setRotationAngle(right_ear, 0.0F, -0.1745F, 0.0F);
		right_ear.cubeList.add(new ModelBox(right_ear, 36, 52, -1.3892F, -4.0F, -7.8785F, 5, 8, 2, 0.0F, false));

		left_tusk = new RendererModel(this);
		left_tusk.setRotationPoint(-2.0F, -5.0F, -7.0F);
		cart.addChild(left_tusk);
		setRotationAngle(left_tusk, 0.1745F, 0.0F, 0.0F);
		left_tusk.cubeList.add(new ModelBox(left_tusk, 0, 0, -1.0F, -1.3892F, -9.8785F, 1, 1, 2, 0.0F, true));

		right_tusk = new RendererModel(this);
		right_tusk.setRotationPoint(2.0F, -5.0F, -7.0F);
		cart.addChild(right_tusk);
		setRotationAngle(right_tusk, 0.1745F, 0.0F, 0.0F);
		right_tusk.cubeList.add(new ModelBox(right_tusk, 0, 0, 0.0F, -1.3892F, -9.8785F, 1, 1, 2, 0.0F, true));
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