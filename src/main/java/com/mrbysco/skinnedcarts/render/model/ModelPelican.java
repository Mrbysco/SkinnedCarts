package com.mrbysco.skinnedcarts.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPelican extends ModelBase {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer head;
	public ModelRenderer beak;
	public ModelRenderer left_wing;
	public ModelRenderer right_wing;
	public ModelRenderer tail;

	public ModelPelican() {

		textureWidth = 96;
		textureHeight = 96;

		cart = new ModelRenderer(this);
		cart.setRotationPoint(-6.0F, 5.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);

		back_wall = new ModelRenderer(this);
		back_wall.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 0, 52, -6.0F, -29.0F, 2.0F, 16, 8, 2, 0.0F, true));

		front_wall = new ModelRenderer(this);
		front_wall.setRotationPoint(-2.0F, 13.0F, -9.0F);
		setRotationAngle(front_wall, 0.0F, -3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.cubeList.add(new ModelBox(front_wall, 46, 22, -10.0F, -23.0F, 5.0F, 16, 8, 2, 0.0F, true));

		left_wall = new ModelRenderer(this);
		left_wall.setRotationPoint(5.0F, 13.0F, 0.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.cubeList.add(new ModelBox(left_wall, 36, 42, -2.0F, -23.0F, 1.0F, 16, 8, 2, 0.0F, true));

		right_wall = new ModelRenderer(this);
		right_wall.setRotationPoint(-9.0F, 13.0F, 0.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.cubeList.add(new ModelBox(right_wall, 0, 42, -14.0F, -23.0F, -3.0F, 16, 8, 2, 0.0F, true));

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -6.0F, -21.0F, -16.0F, 16, 2, 20, 0.0F, true));

		inner = new ModelRenderer(this);
		inner.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -5.0F, -23.0F, -15.0F, 14, 2, 18, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.0F, 19.0F, -8.0F);
		cart.addChild(head);
		head.cubeList.add(new ModelBox(head, 36, 52, -1.0F, -31.0F, -12.0F, 6, 3, 4, 0.0F, true));

		beak = new ModelRenderer(this);
		beak.setRotationPoint(-2.0F, 19.0F, -8.0F);
		cart.addChild(beak);
		beak.cubeList.add(new ModelBox(beak, 56, 52, -2.0F, -28.0F, -13.0F, 8, 8, 5, 0.0F, true));

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(6.0F, 13.0F, -6.0F);
		setRotationAngle(right_wing, 0.0F, 0.1745F, 0.0F);
		cart.addChild(right_wing);
		right_wing.cubeList.add(new ModelBox(right_wing, 0, 62, 1.0115F, -21.0F, -5.5616F, 2, 6, 11, 0.0F, true));

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-10.0F, 13.0F, -6.0F);
		setRotationAngle(left_wing, 0.0F, -0.1745F, 0.0F);
		cart.addChild(left_wing);
		left_wing.cubeList.add(new ModelBox(left_wing, 26, 62, 0.9277F, -21.0F, -6.2561F, 2, 6, 11, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-2.0F, 13.0F, 10.0F);
		setRotationAngle(tail, 0.2618F, 0.0F, 0.0F);
		cart.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 0, 79, -2.0F, -19.5512F, -1.7768F, 8, 3, 4, 0.0F, true));

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