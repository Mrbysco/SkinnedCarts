package com.mrbysco.skinnedcarts.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSnail extends ModelBase {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer head;
	public ModelRenderer left_eye;
	public ModelRenderer right_eye;
	public ModelRenderer foot;
	public ModelRenderer left_antennae;
	public ModelRenderer right_antennae;

	public ModelSnail() {
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
		head.setRotationPoint(0.0F, 14.0F, -2.0F);
		setRotationAngle(head, 0.1745F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 62, -4.0F, -3.0F, -5.0F, 8, 12, 5, 0.0F, false));

		left_eye = new ModelRenderer(this);
		left_eye.setRotationPoint(-1.5F, 12.0F, -4.0F);
		setRotationAngle(left_eye, -0.3491F, 0.0F, 0.0F);
		left_eye.cubeList.add(new ModelBox(left_eye, 0, 0, -1.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		right_eye = new ModelRenderer(this);
		right_eye.setRotationPoint(1.5F, 12.0F, -4.0F);
		setRotationAngle(right_eye, -0.3491F, 0.0F, 0.0F);
		right_eye.cubeList.add(new ModelBox(right_eye, 0, 0, 0.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, true));

		foot = new ModelRenderer(this);
		foot.setRotationPoint(0.0F, 24.0F, 0.0F);
		foot.cubeList.add(new ModelBox(foot, 36, 52, -4.0F, -3.0F, 18.0F, 8, 3, 4, 0.0F, false));

		left_antennae = new ModelRenderer(this);
		left_antennae.setRotationPoint(-2.5F, 16.0F, -5.0F);
		setRotationAngle(left_antennae, -0.9599F, 0.1745F, 0.0873F);
		left_antennae.cubeList.add(new ModelBox(left_antennae, 4, 0, -0.5675F, 0.366F, -2.9883F, 1, 2, 1, 0.0F, true));

		right_antennae = new ModelRenderer(this);
		right_antennae.setRotationPoint(2.5F, 16.0F, -5.0F);
		setRotationAngle(right_antennae, -0.9599F, -0.1745F, -0.0873F);
		right_antennae.cubeList.add(new ModelBox(right_antennae, 4, 0, -0.4325F, 0.366F, -2.9883F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cart.render(f5);
		head.render(f5);
		left_eye.render(f5);
		right_eye.render(f5);
		foot.render(f5);
		left_antennae.render(f5);
		right_antennae.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}