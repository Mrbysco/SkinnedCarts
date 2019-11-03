package com.mrbysco.skinnedcarts.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTurtle extends ModelBase {
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
		textureWidth = 96;
		textureHeight = 96;

		cart = new ModelRenderer(this);
		cart.setRotationPoint(0.0F, 24.0F, 8.0F);

		back_wall = new ModelRenderer(this);
		back_wall.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 0, 52, -8.0F, -10.0F, 8.0F, 16, 8, 2, 0.0F, false));

		front_wall = new ModelRenderer(this);
		front_wall.setRotationPoint(0.0F, -6.0F, -9.0F);
		setRotationAngle(front_wall, 0.0F, 3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.cubeList.add(new ModelBox(front_wall, 46, 22, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		right_wall = new ModelRenderer(this);
		right_wall.setRotationPoint(-7.0F, -6.0F, 0.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.cubeList.add(new ModelBox(right_wall, 36, 42, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		left_wall = new ModelRenderer(this);
		left_wall.setRotationPoint(7.0F, -6.0F, 0.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.cubeList.add(new ModelBox(left_wall, 0, 42, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -8.0F, -2.0F, -10.0F, 16, 2, 20, 0.0F, false));

		inner = new ModelRenderer(this);
		inner.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -7.0F, -2.9F, -9.0F, 14, 2, 18, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 36, 52, -3.0F, -6.0F, -7.0F, 6, 5, 5, 0.0F, false));

		left_flipper_front = new ModelRenderer(this);
		left_flipper_front.setRotationPoint(-8.0F, 22.0F, 2.0F);
		setRotationAngle(left_flipper_front, 0.0F, 0.2618F, 0.0F);
		left_flipper_front.cubeList.add(new ModelBox(left_flipper_front, 0, 62, -6.0F, -1.0F, 0.0F, 6, 2, 5, 0.0F, false));

		right_flipper_front = new ModelRenderer(this);
		right_flipper_front.setRotationPoint(8.0F, 22.0F, 2.0F);
		setRotationAngle(right_flipper_front, 0.0F, -0.2618F, 0.0F);
		right_flipper_front.cubeList.add(new ModelBox(right_flipper_front, 22, 62, 0.0F, -1.0F, 0.0F, 6, 2, 5, 0.0F, false));

		left_flipper_back = new ModelRenderer(this);
		left_flipper_back.setRotationPoint(-2.0F, 22.0F, 18.0F);
		setRotationAngle(left_flipper_back, 0.0F, -0.1745F, 0.0F);
		left_flipper_back.cubeList.add(new ModelBox(left_flipper_back, 20, 69, -5.0F, -1.0F, 0.0F, 5, 2, 5, 0.0F, false));

		right_flipper_back = new ModelRenderer(this);
		right_flipper_back.setRotationPoint(2.0F, 22.0F, 18.0F);
		setRotationAngle(right_flipper_back, 0.0F, 0.1745F, 0.0F);
		right_flipper_back.cubeList.add(new ModelBox(right_flipper_back, 0, 69, 0.0F, -1.0F, 0.0F, 5, 2, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cart.render(f5);
		head.render(f5);
		left_flipper_front.render(f5);
		right_flipper_front.render(f5);
		left_flipper_back.render(f5);
		right_flipper_back.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}