package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelPenguin<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel back_wall;
	private final RendererModel front_wall;
	private final RendererModel right_wall;
	private final RendererModel left_wall;
	private final RendererModel bottom;
	private final RendererModel inner;
	private final RendererModel head;
	private final RendererModel left_wing;
	private final RendererModel right_wing;
	private final RendererModel tail;
	private final RendererModel foot2;
	private final RendererModel foot;

	public ModelPenguin() {
		textureWidth = 96;
		textureHeight = 96;

		cart = new RendererModel(this);
		cart.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);
		

		back_wall = new RendererModel(this);
		back_wall.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 0, 52, -8.0F, -10.0F, 8.0F, 16, 8, 2, 0.0F, false));

		front_wall = new RendererModel(this);
		front_wall.setRotationPoint(0.0F, -6.0F, -9.0F);
		cart.addChild(front_wall);
		setRotationAngle(front_wall, 0.0F, 3.1416F, 0.0F);
		front_wall.cubeList.add(new ModelBox(front_wall, 46, 22, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		right_wall = new RendererModel(this);
		right_wall.setRotationPoint(-7.0F, -6.0F, 0.0F);
		cart.addChild(right_wall);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		right_wall.cubeList.add(new ModelBox(right_wall, 36, 42, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		left_wall = new RendererModel(this);
		left_wall.setRotationPoint(7.0F, -6.0F, 0.0F);
		cart.addChild(left_wall);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		left_wall.cubeList.add(new ModelBox(left_wall, 0, 42, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		bottom = new RendererModel(this);
		bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -8.0F, -2.0F, -10.0F, 16, 2, 20, 0.0F, false));

		inner = new RendererModel(this);
		inner.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -7.0F, -2.9F, -9.0F, 14, 2, 18, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 0.0F, -8.0F);
		cart.addChild(head);
		setRotationAngle(head, -0.0873F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 36, 52, -3.0F, -13.0F, -5.0F, 6, 4, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 58, 58, -2.0F, -9.7081F, -8.6858F, 4, 1, 6, 0.0F, false));

		left_wing = new RendererModel(this);
		left_wing.setRotationPoint(-8.0F, -6.0F, -6.0F);
		cart.addChild(left_wing);
		setRotationAngle(left_wing, 0.0F, -0.1745F, 0.0F);
		left_wing.cubeList.add(new ModelBox(left_wing, 0, 62, 0.0F, -3.0F, 0.0F, 2, 5, 11, 0.0F, false));

		right_wing = new RendererModel(this);
		right_wing.setRotationPoint(8.0F, -6.0F, -6.0F);
		cart.addChild(right_wing);
		setRotationAngle(right_wing, 0.0F, 0.1745F, 0.0F);
		right_wing.cubeList.add(new ModelBox(right_wing, 26, 62, -2.0F, -3.0F, 0.0F, 2, 5, 11, 0.0F, false));

		tail = new RendererModel(this);
		tail.setRotationPoint(0.0F, -6.0F, 10.0F);
		cart.addChild(tail);
		setRotationAngle(tail, 0.3927F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 0, 79, -4.0F, -3.0F, 0.0F, 8, 2, 4, 0.0F, false));

		foot2 = new RendererModel(this);
		foot2.setRotationPoint(3.0F, -0.5F, 10.0F);
		cart.addChild(foot2);
		setRotationAngle(foot2, 0.3927F, 0.0F, 0.0F);
		foot2.cubeList.add(new ModelBox(foot2, 58, 58, 0.0F, -3.1913F, -0.4619F, 4, 2, 5, 0.0F, false));

		foot = new RendererModel(this);
		foot.setRotationPoint(-7.0F, -0.5F, 10.0F);
		cart.addChild(foot);
		setRotationAngle(foot, 0.3927F, 0.0F, 0.0F);
		foot.cubeList.add(new ModelBox(foot, 58, 58, 0.0F, -3.1913F, -0.4619F, 4, 2, 5, 0.0F, false));
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