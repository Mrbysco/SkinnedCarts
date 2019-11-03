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

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 24.0F, 0.0F);
		mouth.cubeList.add(new ModelBox(mouth, 36, 52, -2.0F, -7.0F, -3.0F, 4, 3, 1, 0.0F, false));

		left_fin = new ModelRenderer(this);
		left_fin.setRotationPoint(-8.0F, 17.0F, 5.0F);
		setRotationAngle(left_fin, 0.0F, 0.0F, 0.2618F);
		left_fin.cubeList.add(new ModelBox(left_fin, 59, 52, -3.0F, -2.0F, -2.0F, 3, 1, 4, 0.0F, false));

		right_fin = new ModelRenderer(this);
		right_fin.setRotationPoint(8.0F, 17.0F, 5.0F);
		setRotationAngle(right_fin, 0.0F, 0.0F, -0.2618F);
		right_fin.cubeList.add(new ModelBox(right_fin, 46, 52, 0.0F, -1.0F, -2.0F, 3, 1, 4, 0.0F, false));

		left_spines_1 = new ModelRenderer(this);
		left_spines_1.setRotationPoint(-8.0F, 19.0F, -2.0F);
		setRotationAngle(left_spines_1, 0.0F, -0.7854F, 0.0F);
		left_spines_1.cubeList.add(new ModelBox(left_spines_1, 16, 76, -1.0F, -5.0F, 0.0F, 1, 10, 0, 0.0F, false));

		right_spines_1 = new ModelRenderer(this);
		right_spines_1.setRotationPoint(8.0F, 19.0F, -2.0F);
		setRotationAngle(right_spines_1, 0.0F, 0.7854F, 0.0F);
		right_spines_1.cubeList.add(new ModelBox(right_spines_1, 16, 64, 0.0F, -5.0F, 0.0F, 1, 10, 0, 0.0F, false));

		top_spines_1 = new ModelRenderer(this);
		top_spines_1.setRotationPoint(0.0F, 14.0F, -2.0F);
		setRotationAngle(top_spines_1, 0.7854F, 0.0F, 0.0F);
		top_spines_1.cubeList.add(new ModelBox(top_spines_1, 0, 62, -8.0F, -1.0F, 0.0F, 16, 1, 0, 0.0F, false));

		bottom_spines_1 = new ModelRenderer(this);
		bottom_spines_1.setRotationPoint(0.0F, 24.0F, -2.0F);
		setRotationAngle(bottom_spines_1, -0.7854F, 0.0F, 0.0F);
		bottom_spines_1.cubeList.add(new ModelBox(bottom_spines_1, 0, 74, -8.0F, 0.0F, 0.0F, 16, 1, 0, 0.0F, false));

		top_spines_2 = new ModelRenderer(this);
		top_spines_2.setRotationPoint(0.0F, 14.0F, 18.0F);
		setRotationAngle(top_spines_2, -0.7854F, 0.0F, 0.0F);
		top_spines_2.cubeList.add(new ModelBox(top_spines_2, 0, 63, -8.0F, -1.0F, 0.0F, 16, 1, 0, 0.0F, false));

		bottom_spines_2 = new ModelRenderer(this);
		bottom_spines_2.setRotationPoint(0.0F, 24.0F, 18.0F);
		setRotationAngle(bottom_spines_2, 0.7854F, 0.0F, 0.0F);
		bottom_spines_2.cubeList.add(new ModelBox(bottom_spines_2, 0, 75, -8.0F, 0.0F, 0.0F, 16, 1, 0, 0.0F, false));

		right_spines_4 = new ModelRenderer(this);
		right_spines_4.setRotationPoint(8.0F, 19.0F, 18.0F);
		setRotationAngle(right_spines_4, 0.0F, -0.7854F, 0.0F);
		right_spines_4.cubeList.add(new ModelBox(right_spines_4, 16, 76, 0.0F, -5.0F, 0.0F, 1, 10, 0, 0.0F, false));

		left_spines_4 = new ModelRenderer(this);
		left_spines_4.setRotationPoint(-8.0F, 19.0F, 18.0F);
		setRotationAngle(left_spines_4, 0.0F, 0.7854F, 0.0F);
		left_spines_4.cubeList.add(new ModelBox(left_spines_4, 16, 64, -1.0F, -5.0F, 0.0F, 1, 10, 0, 0.0F, false));

		right_spines_2 = new ModelRenderer(this);
		right_spines_2.setRotationPoint(2.0F, 22.0F, 18.0F);
		right_spines_2.cubeList.add(new ModelBox(right_spines_2, 0, 76, 6.0F, -8.0F, -14.0F, 1, 10, 0, 0.0F, false));

		right_spines_3 = new ModelRenderer(this);
		right_spines_3.setRotationPoint(2.0F, 22.0F, 18.0F);
		right_spines_3.cubeList.add(new ModelBox(right_spines_3, 0, 64, 6.0F, -8.0F, -6.0F, 1, 10, 0, 0.0F, false));

		left_spines_2 = new ModelRenderer(this);
		left_spines_2.setRotationPoint(2.0F, 22.0F, 18.0F);
		left_spines_2.cubeList.add(new ModelBox(left_spines_2, 0, 64, -11.0F, -8.0F, -14.0F, 1, 10, 0, 0.0F, false));

		left_spines_3 = new ModelRenderer(this);
		left_spines_3.setRotationPoint(2.0F, 22.0F, 18.0F);
		left_spines_3.cubeList.add(new ModelBox(left_spines_3, 0, 76, -11.0F, -8.0F, -6.0F, 1, 10, 0, 0.0F, false));

		top_spines_left_1 = new ModelRenderer(this);
		top_spines_left_1.setRotationPoint(2.0F, 22.0F, 18.0F);
		top_spines_left_1.cubeList.add(new ModelBox(top_spines_left_1, 0, 86, -10.0F, -9.0F, -14.0F, 2, 1, 0, 0.0F, false));

		top_spines_left_2 = new ModelRenderer(this);
		top_spines_left_2.setRotationPoint(2.0F, 22.0F, 18.0F);
		top_spines_left_2.cubeList.add(new ModelBox(top_spines_left_2, 0, 87, -10.0F, -9.0F, -6.0F, 2, 1, 0, 0.0F, false));

		top_spines_right_2 = new ModelRenderer(this);
		top_spines_right_2.setRotationPoint(2.0F, 22.0F, 18.0F);
		top_spines_right_2.cubeList.add(new ModelBox(top_spines_right_2, 0, 86, 4.0F, -9.0F, -6.0F, 2, 1, 0, 0.0F, false));

		top_spines_right_1 = new ModelRenderer(this);
		top_spines_right_1.setRotationPoint(2.0F, 22.0F, 18.0F);
		top_spines_right_1.cubeList.add(new ModelBox(top_spines_right_1, 0, 87, 4.0F, -9.0F, -14.0F, 2, 1, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cart.render(f5);
		mouth.render(f5);
		left_fin.render(f5);
		right_fin.render(f5);
		left_spines_1.render(f5);
		right_spines_1.render(f5);
		top_spines_1.render(f5);
		bottom_spines_1.render(f5);
		top_spines_2.render(f5);
		bottom_spines_2.render(f5);
		right_spines_4.render(f5);
		left_spines_4.render(f5);
		right_spines_2.render(f5);
		right_spines_3.render(f5);
		left_spines_2.render(f5);
		left_spines_3.render(f5);
		top_spines_left_1.render(f5);
		top_spines_left_2.render(f5);
		top_spines_right_2.render(f5);
		top_spines_right_1.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}