package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelBee<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel back_wall;
	private final RendererModel front_wall;
	private final RendererModel right_wall;
	private final RendererModel left_wall;
	private final RendererModel bottom;
	private final RendererModel inner;
	private final RendererModel Head;
	private final RendererModel Head2;
	private final RendererModel Wings3;
	private final RendererModel Wings4;
	private final RendererModel Wings;
	private final RendererModel Wings2;
	private final RendererModel bone;

	public ModelBee() {
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

		Head = new RendererModel(this);
		Head.setRotationPoint(6.5F, -5.0F, -10.0F);
		cart.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -2.0F, -3.5F, -1.0F, 4, 6, 2, 0.0F, false));

		Head2 = new RendererModel(this);
		Head2.setRotationPoint(-6.5F, -5.0F, -10.0F);
		cart.addChild(Head2);
		Head2.cubeList.add(new ModelBox(Head2, 0, 0, -2.0F, -3.5F, -1.0F, 4, 6, 2, 0.0F, true));

		Wings3 = new RendererModel(this);
		Wings3.setRotationPoint(-8.0F, -8.5F, 0.0F);
		cart.addChild(Wings3);
		setRotationAngle(Wings3, 0.0F, 0.0F, 0.5672F);
		Wings3.cubeList.add(new ModelBox(Wings3, 56, 0, -6.9627F, 0.8434F, -6.0F, 8, 0, 12, 0.0F, true));

		Wings4 = new RendererModel(this);
		Wings4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wings3.addChild(Wings4);
		setRotationAngle(Wings4, 0.0F, 0.0F, -0.829F);
		Wings4.cubeList.add(new ModelBox(Wings4, 56, 0, -7.7588F, 0.9659F, -6.0F, 8, 0, 12, 0.0F, true));

		Wings = new RendererModel(this);
		Wings.setRotationPoint(8.0F, -8.5F, 0.0F);
		cart.addChild(Wings);
		setRotationAngle(Wings, 0.0F, 0.0F, -0.5672F);
		Wings.cubeList.add(new ModelBox(Wings, 56, 0, -1.0373F, 0.8434F, -6.0F, 8, 0, 12, 0.0F, false));

		Wings2 = new RendererModel(this);
		Wings2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wings.addChild(Wings2);
		setRotationAngle(Wings2, 0.0F, 0.0F, 0.829F);
		Wings2.cubeList.add(new ModelBox(Wings2, 56, 0, -0.2412F, 0.9659F, -6.0F, 8, 0, 12, 0.0F, false));

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, -7.0F, 9.5F);
		cart.addChild(bone);
		setRotationAngle(bone, 0.3927F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 1, 9, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));
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