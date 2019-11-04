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
		cart.setRotationPoint(-6.0F, 5.0F, 2.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);

		back_wall = new ModelRenderer(this);
		back_wall.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 0, 52, -8.0F, -29.0F, 2.0F, 16, 8, 2, 0.0F, true));

		front_wall = new ModelRenderer(this);
		front_wall.setRotationPoint(-2.0F, 13.0F, -9.0F);
		setRotationAngle(front_wall, 0.0F, -3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.cubeList.add(new ModelBox(front_wall, 46, 22, -8.0F, -23.0F, 5.0F, 16, 8, 2, 0.0F, true));

		left_wall = new ModelRenderer(this);
		left_wall.setRotationPoint(5.0F, 13.0F, 0.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.cubeList.add(new ModelBox(left_wall, 36, 42, -2.0F, -23.0F, -1.0F, 16, 8, 2, 0.0F, true));

		right_wall = new ModelRenderer(this);
		right_wall.setRotationPoint(-9.0F, 13.0F, 0.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.cubeList.add(new ModelBox(right_wall, 0, 42, -14.0F, -23.0F, -1.0F, 16, 8, 2, 0.0F, true));

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -8.0F, -21.0F, -16.0F, 16, 2, 20, 0.0F, true));

		inner = new ModelRenderer(this);
		inner.setRotationPoint(-2.0F, 19.0F, 0.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -7.0F, -21.9F, -15.0F, 14, 2, 18, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.0F, 9.0F, -10.0F);
		setRotationAngle(head, 0.1745F, 0.0F, 0.0F);
		cart.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 62, -4.0F, -22.7532F, -7.6095F, 8, 12, 5, 0.0F, true));

		right_eye = new ModelRenderer(this);
		right_eye.setRotationPoint(-0.5F, 7.0F, -12.0F);
		setRotationAngle(right_eye, -0.3491F, 0.0F, 0.0F);
		cart.addChild(right_eye);
		right_eye.cubeList.add(new ModelBox(right_eye, 0, 0, 0.0F, -21.802F, -12.1365F, 1, 6, 1, 0.0F, true));

		left_eye = new ModelRenderer(this);
		left_eye.setRotationPoint(-3.5F, 7.0F, -12.0F);
		setRotationAngle(left_eye, -0.3491F, 0.0F, 0.0F);
		cart.addChild(left_eye);
		left_eye.cubeList.add(new ModelBox(left_eye, 0, 0, -1.0F, -21.802F, -12.1365F, 1, 6, 1, 0.0F, false));

		foot = new ModelRenderer(this);
		foot.setRotationPoint(-2.0F, 19.0F, -8.0F);
		cart.addChild(foot);
		foot.cubeList.add(new ModelBox(foot, 36, 52, -4.0F, -22.0F, 12.0F, 8, 3, 4, 0.0F, true));

		right_antennae = new ModelRenderer(this);
		right_antennae.setRotationPoint(0.5F, 11.0F, -13.0F);
		setRotationAngle(right_antennae, -0.9599F, -0.1745F, -0.0873F);
		cart.addChild(right_antennae);
		right_antennae.cubeList.add(new ModelBox(right_antennae, 4, 0, 0.1564F, -5.4147F, -22.0471F, 1, 2, 1, 0.0F, false));

		left_antennae = new ModelRenderer(this);
		left_antennae.setRotationPoint(-4.5F, 11.0F, -13.0F);
		setRotationAngle(left_antennae, -0.9599F, 0.1745F, 0.0873F);
		cart.addChild(left_antennae);
		left_antennae.cubeList.add(new ModelBox(left_antennae, 4, 0, -1.1564F, -5.4147F, -22.0471F, 1, 2, 1, 0.0F, true));


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