package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelLadybug<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel back_wall;
	private final RendererModel front_wall;
	private final RendererModel right_wall;
	private final RendererModel left_wall;
	private final RendererModel bottom;
	private final RendererModel inner;
	private final RendererModel head;
	private final RendererModel antenna;
	private final RendererModel antenna2;

	public ModelLadybug() {
		textureWidth = 96;
		textureHeight = 96;

		cart = new RendererModel(this);
		cart.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);
		

		back_wall = new RendererModel(this);
		back_wall.setRotationPoint(8.0F, 0.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 52, 22, -16.0F, -10.0F, 8.0F, 16, 8, 2, 0.0F, false));

		front_wall = new RendererModel(this);
		front_wall.setRotationPoint(8.0F, -6.0F, -9.0F);
		cart.addChild(front_wall);
		front_wall.cubeList.add(new ModelBox(front_wall, 52, 32, -16.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		right_wall = new RendererModel(this);
		right_wall.setRotationPoint(1.0F, -6.0F, 0.0F);
		cart.addChild(right_wall);
		right_wall.cubeList.add(new ModelBox(right_wall, 34, 26, -9.0F, -4.0F, -8.0F, 2, 8, 16, 0.0F, false));

		left_wall = new RendererModel(this);
		left_wall.setRotationPoint(15.0F, -6.0F, 0.0F);
		cart.addChild(left_wall);
		left_wall.cubeList.add(new ModelBox(left_wall, 0, 26, -9.0F, -4.0F, -8.0F, 2, 8, 16, 0.0F, false));

		bottom = new RendererModel(this);
		bottom.setRotationPoint(8.0F, 0.0F, 0.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -16.0F, -2.0F, -10.0F, 16, 2, 20, 0.0F, false));

		inner = new RendererModel(this);
		inner.setRotationPoint(8.0F, 0.0F, 0.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -15.0F, -2.9F, -9.0F, 14, 2, 18, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(head);
		head.cubeList.add(new ModelBox(head, 74, 0, -4.0F, -10.5F, -12.0F, 8, 6, 3, 0.0F, false));

		antenna = new RendererModel(this);
		antenna.setRotationPoint(-3.0F, -10.5F, -11.0F);
		head.addChild(antenna);
		setRotationAngle(antenna, 0.0F, -0.3054F, -0.3054F);
		antenna.cubeList.add(new ModelBox(antenna, 74, 10, 0.0F, -4.0F, -0.5F, 0, 5, 1, 0.0F, false));

		antenna2 = new RendererModel(this);
		antenna2.setRotationPoint(3.0F, -10.5F, -11.0F);
		head.addChild(antenna2);
		setRotationAngle(antenna2, 0.0F, 0.3054F, 0.3054F);
		antenna2.cubeList.add(new ModelBox(antenna2, 74, 10, 0.0F, -4.0F, -0.5F, 0, 5, 1, 0.0F, true));
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