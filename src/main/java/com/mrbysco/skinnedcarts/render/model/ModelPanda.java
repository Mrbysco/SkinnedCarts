package com.mrbysco.skinnedcarts.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPanda extends ModelBase {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer head;
	public ModelRenderer right_ear;
	public ModelRenderer left_ear;
	public ModelRenderer muzzle;

	public ModelPanda() {

		textureWidth = 96;
		textureHeight = 96;

		cart = new ModelRenderer(this);
		cart.setRotationPoint(2.0F, 5.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);

		back_wall = new ModelRenderer(this);
		back_wall.setRotationPoint(-2.0F, 19.0F, 8.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 0, 52, -6.0F, -29.0F, 2.0F, 16, 8, 2, 0.0F, true));

		front_wall = new ModelRenderer(this);
		front_wall.setRotationPoint(-2.0F, 13.0F, -1.0F);
		setRotationAngle(front_wall, 0.0F, -3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.cubeList.add(new ModelBox(front_wall, 46, 22, -10.0F, -23.0F, 5.0F, 16, 8, 2, 0.0F, true));

		left_wall = new ModelRenderer(this);
		left_wall.setRotationPoint(5.0F, 13.0F, 8.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.cubeList.add(new ModelBox(left_wall, 36, 42, -2.0F, -23.0F, 1.0F, 16, 8, 2, 0.0F, true));

		right_wall = new ModelRenderer(this);
		right_wall.setRotationPoint(-9.0F, 13.0F, 8.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.cubeList.add(new ModelBox(right_wall, 0, 42, -14.0F, -23.0F, -3.0F, 16, 8, 2, 0.0F, true));

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(-2.0F, 19.0F, 8.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -6.0F, -21.0F, -16.0F, 16, 2, 20, 0.0F, true));

		inner = new ModelRenderer(this);
		inner.setRotationPoint(-2.0F, 19.0F, 8.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -5.0F, -21.9F, -15.0F, 14, 2, 18, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 62, -3.5F, -29.0F, -13.0F, 11, 7, 5, 0.0F, true));

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(left_ear);
		left_ear.cubeList.add(new ModelBox(left_ear, 0, 0, -4.5F, -31.0F, -10.0F, 3, 3, 2, 0.0F, false));

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(right_ear);
		right_ear.cubeList.add(new ModelBox(right_ear, 0, 0, 5.5F, -31.0F, -10.0F, 3, 3, 2, 0.0F, true));

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(muzzle);
		muzzle.cubeList.add(new ModelBox(muzzle, 0, 74, -0.5F, -25.0F, -15.0F, 5, 3, 2, 0.0F, true));

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cart.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}