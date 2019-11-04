package com.mrbysco.skinnedcarts.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPufferFish extends ModelBase {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer mouth;
	public ModelRenderer left_fin;
	public ModelRenderer right_fin;
	public ModelRenderer left_spines_1;
	public ModelRenderer right_spines_1;
	public ModelRenderer top_spines_1;
	public ModelRenderer bottom_spines_1;
	public ModelRenderer top_spines_2;
	public ModelRenderer bottom_spines_2;
	public ModelRenderer right_spines_4;
	public ModelRenderer left_spines_4;
	public ModelRenderer right_spines_2;
	public ModelRenderer right_spines_3;
	public ModelRenderer left_spines_2;
	public ModelRenderer left_spines_3;
	public ModelRenderer top_spines_left_1;
	public ModelRenderer top_spines_left_2;
	public ModelRenderer top_spines_right_2;
	public ModelRenderer top_spines_right_1;

	public ModelPufferFish() {
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
		inner.cubeList.add(new ModelBox(inner, 0, 22, -5.0F, -21.9F, -15.0F, 14, 2, 18, 0.0F, true));

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(-2.0F, 19.0F, -8.0F);
		cart.addChild(mouth);
		mouth.cubeList.add(new ModelBox(mouth, 36, 52, 0.0F, -26.0F, -9.0F, 4, 3, 1, 0.0F, true));

		right_fin = new ModelRenderer(this);
		right_fin.setRotationPoint(6.0F, 12.0F, -3.0F);
		setRotationAngle(right_fin, 0.0F, 0.0F, -0.2618F);
		cart.addChild(right_fin);
		right_fin.cubeList.add(new ModelBox(right_fin, 59, 52, 6.8494F, -19.835F, -8.0F, 3, 1, 4, 0.0F, true));

		left_fin = new ModelRenderer(this);
		left_fin.setRotationPoint(-10.0F, 12.0F, -3.0F);
		setRotationAngle(left_fin, 0.0F, 0.0F, 0.2618F);
		cart.addChild(left_fin);
		left_fin.cubeList.add(new ModelBox(left_fin, 46, 52, -5.9857F, -19.8702F, -8.0F, 3, 1, 4, 0.0F, true));

		right_spines_1 = new ModelRenderer(this);
		right_spines_1.setRotationPoint(6.0F, 14.0F, -10.0F);
		setRotationAngle(right_spines_1, 0.0F, 0.7854F, 0.0F);
		cart.addChild(right_spines_1);
		right_spines_1.cubeList.add(new ModelBox(right_spines_1, 16, 76, 5.6569F, -24.0F, -2.8284F, 1, 10, 0, 0.0F, true));

		left_spines_1 = new ModelRenderer(this);
		left_spines_1.setRotationPoint(-10.0F, 14.0F, -10.0F);
		setRotationAngle(left_spines_1, 0.0F, -0.7854F, 0.0F);
		cart.addChild(left_spines_1);
		left_spines_1.cubeList.add(new ModelBox(left_spines_1, 16, 64, -3.8284F, -24.0F, -5.6569F, 1, 10, 0, 0.0F, true));

		top_spines_1 = new ModelRenderer(this);
		top_spines_1.setRotationPoint(-2.0F, 9.0F, -10.0F);
		setRotationAngle(top_spines_1, 0.7854F, 0.0F, 0.0F);
		cart.addChild(top_spines_1);
		top_spines_1.cubeList.add(new ModelBox(top_spines_1, 0, 62, -6.0F, -18.6777F, 9.1924F, 16, 1, 0, 0.0F, true));

		bottom_spines_1 = new ModelRenderer(this);
		bottom_spines_1.setRotationPoint(-2.0F, 19.0F, -10.0F);
		setRotationAngle(bottom_spines_1, -0.7854F, 0.0F, 0.0F);
		cart.addChild(bottom_spines_1);
		bottom_spines_1.cubeList.add(new ModelBox(bottom_spines_1, 0, 74, -6.0F, -9.1924F, -17.6777F, 16, 1, 0, 0.0F, true));

		top_spines_2 = new ModelRenderer(this);
		top_spines_2.setRotationPoint(-2.0F, 9.0F, 10.0F);
		setRotationAngle(top_spines_2, -0.7854F, 0.0F, 0.0F);
		cart.addChild(top_spines_2);
		top_spines_2.cubeList.add(new ModelBox(top_spines_2, 0, 63, -6.0F, -10.1924F, -17.6777F, 16, 1, 0, 0.0F, true));

		bottom_spines_2 = new ModelRenderer(this);
		bottom_spines_2.setRotationPoint(-2.0F, 19.0F, 10.0F);
		setRotationAngle(bottom_spines_2, 0.7854F, 0.0F, 0.0F);
		cart.addChild(bottom_spines_2);
		bottom_spines_2.cubeList.add(new ModelBox(bottom_spines_2, 0, 75, -6.0F, -17.6777F, 9.1924F, 16, 1, 0, 0.0F, true));

		left_spines_4 = new ModelRenderer(this);
		left_spines_4.setRotationPoint(-10.0F, 14.0F, 10.0F);
		setRotationAngle(left_spines_4, 0.0F, 0.7854F, 0.0F);
		cart.addChild(left_spines_4);
		left_spines_4.cubeList.add(new ModelBox(left_spines_4, 16, 76, 4.6569F, -24.0F, -2.8284F, 1, 10, 0, 0.0F, true));

		right_spines_4 = new ModelRenderer(this);
		right_spines_4.setRotationPoint(6.0F, 14.0F, 10.0F);
		setRotationAngle(right_spines_4, 0.0F, -0.7854F, 0.0F);
		cart.addChild(right_spines_4);
		right_spines_4.cubeList.add(new ModelBox(right_spines_4, 16, 64, -2.8284F, -24.0F, -5.6569F, 1, 10, 0, 0.0F, true));

		left_spines_2 = new ModelRenderer(this);
		left_spines_2.setRotationPoint(-4.0F, 17.0F, 10.0F);
		cart.addChild(left_spines_2);
		left_spines_2.cubeList.add(new ModelBox(left_spines_2, 0, 76, -5.0F, -27.0F, -20.0F, 1, 10, 0, 0.0F, true));

		left_spines_3 = new ModelRenderer(this);
		left_spines_3.setRotationPoint(-4.0F, 17.0F, 10.0F);
		cart.addChild(left_spines_3);
		left_spines_3.cubeList.add(new ModelBox(left_spines_3, 0, 64, -5.0F, -27.0F, -12.0F, 1, 10, 0, 0.0F, true));

		right_spines_2 = new ModelRenderer(this);
		right_spines_2.setRotationPoint(-4.0F, 17.0F, 10.0F);
		cart.addChild(right_spines_2);
		right_spines_2.cubeList.add(new ModelBox(right_spines_2, 0, 64, 12.0F, -27.0F, -20.0F, 1, 10, 0, 0.0F, true));

		right_spines_3 = new ModelRenderer(this);
		right_spines_3.setRotationPoint(-4.0F, 17.0F, 10.0F);
		cart.addChild(right_spines_3);
		right_spines_3.cubeList.add(new ModelBox(right_spines_3, 0, 76, 12.0F, -27.0F, -12.0F, 1, 10, 0, 0.0F, true));

		top_spines_right_1 = new ModelRenderer(this);
		top_spines_right_1.setRotationPoint(-4.0F, 17.0F, 10.0F);
		cart.addChild(top_spines_right_1);
		top_spines_right_1.cubeList.add(new ModelBox(top_spines_right_1, 0, 86, 10.0F, -28.0F, -20.0F, 2, 1, 0, 0.0F, true));

		top_spines_right_2 = new ModelRenderer(this);
		top_spines_right_2.setRotationPoint(-4.0F, 17.0F, 10.0F);
		cart.addChild(top_spines_right_2);
		top_spines_right_2.cubeList.add(new ModelBox(top_spines_right_2, 0, 87, 10.0F, -28.0F, -12.0F, 2, 1, 0, 0.0F, true));

		top_spines_left_2 = new ModelRenderer(this);
		top_spines_left_2.setRotationPoint(-4.0F, 17.0F, 10.0F);
		cart.addChild(top_spines_left_2);
		top_spines_left_2.cubeList.add(new ModelBox(top_spines_left_2, 0, 86, -4.0F, -28.0F, -12.0F, 2, 1, 0, 0.0F, true));

		top_spines_left_1 = new ModelRenderer(this);
		top_spines_left_1.setRotationPoint(-4.0F, 17.0F, 10.0F);
		cart.addChild(top_spines_left_1);
		top_spines_left_1.cubeList.add(new ModelBox(top_spines_left_1, 0, 87, -4.0F, -28.0F, -20.0F, 2, 1, 0, 0.0F, true));

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