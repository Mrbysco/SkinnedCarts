package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelGreenFrog<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel back_wall;
	private final RendererModel front_wall;
	private final RendererModel right_wall;
	private final RendererModel left_wall;
	private final RendererModel bottom;
	private final RendererModel inner;
	private final RendererModel eyes;
	private final RendererModel righteye;
	private final RendererModel lefteye;
	private final RendererModel leftfronttoes;
	private final RendererModel toe3;
	private final RendererModel toe2;
	private final RendererModel toe;
	private final RendererModel leftlowerfrontleg;
	private final RendererModel rightfronttoes;
	private final RendererModel toe6;
	private final RendererModel toe5;
	private final RendererModel toe4;
	private final RendererModel rightlowerfrontleg;
	private final RendererModel rightbacktoes;
	private final RendererModel toe7;
	private final RendererModel toe8;
	private final RendererModel toe9;
	private final RendererModel leftbacktoes;
	private final RendererModel toe10;
	private final RendererModel toe11;
	private final RendererModel toe12;
	private final RendererModel leftbackupperleg;
	private final RendererModel rightbackupperleg;
	private final RendererModel leftbacklowerleg;
	private final RendererModel rightbacklowerleg;

	public ModelGreenFrog() {
		textureWidth = 96;
		textureHeight = 96;

		cart = new RendererModel(this);
		cart.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);
		

		back_wall = new RendererModel(this);
		back_wall.setRotationPoint(0.0F, 0.0F, 8.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 52, 22, -8.0F, -10.0F, 0.5F, 16, 8, 2, 0.0F, false));

		front_wall = new RendererModel(this);
		front_wall.setRotationPoint(0.0F, -6.0F, 17.0F);
		cart.addChild(front_wall);
		front_wall.cubeList.add(new ModelBox(front_wall, 52, 32, -8.0F, -4.0F, -26.5F, 16, 8, 2, 0.0F, false));

		right_wall = new RendererModel(this);
		right_wall.setRotationPoint(-7.0F, -6.0F, 8.0F);
		cart.addChild(right_wall);
		right_wall.cubeList.add(new ModelBox(right_wall, 34, 26, -1.0F, -4.0F, -15.5F, 2, 8, 16, 0.0F, false));

		left_wall = new RendererModel(this);
		left_wall.setRotationPoint(7.0F, -6.0F, 8.0F);
		cart.addChild(left_wall);
		left_wall.cubeList.add(new ModelBox(left_wall, 0, 26, -1.0F, -4.0F, -15.5F, 2, 8, 16, 0.0F, false));

		bottom = new RendererModel(this);
		bottom.setRotationPoint(0.0F, 0.0F, 8.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -8.0F, -2.0F, -17.5F, 16, 2, 20, 0.0F, false));

		inner = new RendererModel(this);
		inner.setRotationPoint(1.0F, -39.5F, 7.5F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -8.0F, 36.6F, -16.0F, 14, 2, 18, 0.0F, false));

		eyes = new RendererModel(this);
		eyes.setRotationPoint(6.0F, -0.5F, -10.5F);
		cart.addChild(eyes);
		

		righteye = new RendererModel(this);
		righteye.setRotationPoint(-10.0F, -11.0F, 1.0F);
		eyes.addChild(righteye);
		setRotationAngle(righteye, 0.0F, -0.2618F, 0.0F);
		righteye.cubeList.add(new ModelBox(righteye, 0, 6, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false));

		lefteye = new RendererModel(this);
		lefteye.setRotationPoint(-1.5F, -11.0F, 1.0F);
		eyes.addChild(lefteye);
		setRotationAngle(lefteye, 0.0F, -2.8798F, 0.0F);
		lefteye.cubeList.add(new ModelBox(lefteye, 0, 0, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false));

		leftfronttoes = new RendererModel(this);
		leftfronttoes.setRotationPoint(1.0F, 0.0F, 0.0F);
		cart.addChild(leftfronttoes);
		

		toe3 = new RendererModel(this);
		toe3.setRotationPoint(-6.5F, -0.5F, -10.5F);
		leftfronttoes.addChild(toe3);
		setRotationAngle(toe3, 0.0F, -0.3054F, 0.0F);
		toe3.cubeList.add(new ModelBox(toe3, 0, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		toe2 = new RendererModel(this);
		toe2.setRotationPoint(-8.0F, -0.5F, -10.5F);
		leftfronttoes.addChild(toe2);
		setRotationAngle(toe2, 0.0F, 0.3491F, 0.0F);
		toe2.cubeList.add(new ModelBox(toe2, 0, 0, -1.4698F, -0.5F, -1.171F, 2, 1, 2, 0.0F, false));

		toe = new RendererModel(this);
		toe.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftfronttoes.addChild(toe);
		toe.cubeList.add(new ModelBox(toe, 0, 0, -10.5F, -1.0F, -9.5F, 2, 1, 2, 0.0F, false));

		leftlowerfrontleg = new RendererModel(this);
		leftlowerfrontleg.setRotationPoint(-7.0F, -2.5F, -9.0F);
		cart.addChild(leftlowerfrontleg);
		setRotationAngle(leftlowerfrontleg, 0.0F, -0.3054F, -0.2182F);
		leftlowerfrontleg.cubeList.add(new ModelBox(leftlowerfrontleg, 0, 0, -0.8968F, -2.9881F, -1.0325F, 2, 5, 2, 0.0F, false));

		rightfronttoes = new RendererModel(this);
		rightfronttoes.setRotationPoint(-1.5F, 0.0F, 1.5F);
		cart.addChild(rightfronttoes);
		

		toe6 = new RendererModel(this);
		toe6.setRotationPoint(7.0F, -0.5F, -11.5F);
		rightfronttoes.addChild(toe6);
		setRotationAngle(toe6, 0.0F, 0.2618F, 0.0F);
		toe6.cubeList.add(new ModelBox(toe6, 0, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		toe5 = new RendererModel(this);
		toe5.setRotationPoint(9.0F, -0.5F, -12.0F);
		rightfronttoes.addChild(toe5);
		setRotationAngle(toe5, 0.0F, -0.48F, 0.0F);
		toe5.cubeList.add(new ModelBox(toe5, 0, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		toe4 = new RendererModel(this);
		toe4.setRotationPoint(1.0F, 0.0F, -1.0F);
		rightfronttoes.addChild(toe4);
		toe4.cubeList.add(new ModelBox(toe4, 0, 0, 8.5F, -1.0F, -10.0F, 2, 1, 2, 0.0F, false));

		rightlowerfrontleg = new RendererModel(this);
		rightlowerfrontleg.setRotationPoint(6.57F, -0.5781F, -8.9633F);
		cart.addChild(rightlowerfrontleg);
		setRotationAngle(rightlowerfrontleg, 0.0F, -0.5236F, 0.1309F);
		rightlowerfrontleg.cubeList.add(new ModelBox(rightlowerfrontleg, 0, 0, -1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F, false));

		rightbacktoes = new RendererModel(this);
		rightbacktoes.setRotationPoint(5.5F, 0.0F, -5.5F);
		cart.addChild(rightbacktoes);
		setRotationAngle(rightbacktoes, 0.0F, -0.6545F, 0.0F);
		

		toe7 = new RendererModel(this);
		toe7.setRotationPoint(5.5F, -0.5F, 2.5F);
		rightbacktoes.addChild(toe7);
		setRotationAngle(toe7, 0.0F, 0.2618F, 0.0F);
		toe7.cubeList.add(new ModelBox(toe7, 0, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		toe8 = new RendererModel(this);
		toe8.setRotationPoint(7.5F, -0.5F, 2.0F);
		rightbacktoes.addChild(toe8);
		setRotationAngle(toe8, 0.0F, -0.48F, 0.0F);
		toe8.cubeList.add(new ModelBox(toe8, 0, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		toe9 = new RendererModel(this);
		toe9.setRotationPoint(-0.5F, 0.0F, 13.0F);
		rightbacktoes.addChild(toe9);
		toe9.cubeList.add(new ModelBox(toe9, 0, 0, 8.5F, -1.0F, -10.0F, 2, 1, 2, 0.0F, false));

		leftbacktoes = new RendererModel(this);
		leftbacktoes.setRotationPoint(-5.5F, 0.0F, -5.5F);
		cart.addChild(leftbacktoes);
		setRotationAngle(leftbacktoes, 0.0F, 0.6545F, 0.0F);
		

		toe10 = new RendererModel(this);
		toe10.setRotationPoint(-5.5F, -0.5F, 2.5F);
		leftbacktoes.addChild(toe10);
		setRotationAngle(toe10, 0.0F, -0.2618F, 0.0F);
		toe10.cubeList.add(new ModelBox(toe10, 0, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

		toe11 = new RendererModel(this);
		toe11.setRotationPoint(-7.5F, -0.5F, 2.0F);
		leftbacktoes.addChild(toe11);
		setRotationAngle(toe11, 0.0F, 0.48F, 0.0F);
		toe11.cubeList.add(new ModelBox(toe11, 0, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

		toe12 = new RendererModel(this);
		toe12.setRotationPoint(0.5F, 0.0F, 13.0F);
		leftbacktoes.addChild(toe12);
		toe12.cubeList.add(new ModelBox(toe12, 0, 0, -10.5F, -1.0F, -10.0F, 2, 1, 2, 0.0F, true));

		leftbackupperleg = new RendererModel(this);
		leftbackupperleg.setRotationPoint(-9.5F, -4.5F, 10.5F);
		cart.addChild(leftbackupperleg);
		setRotationAngle(leftbackupperleg, -0.4363F, 0.4363F, 0.0F);
		leftbackupperleg.cubeList.add(new ModelBox(leftbackupperleg, 52, 0, 1.0789F, -2.9144F, -11.0269F, 4, 4, 13, 0.0F, false));

		rightbackupperleg = new RendererModel(this);
		rightbackupperleg.setRotationPoint(9.5F, -4.5F, 8.0F);
		cart.addChild(rightbackupperleg);
		setRotationAngle(rightbackupperleg, -0.4363F, -0.4363F, 0.0F);
		rightbackupperleg.cubeList.add(new ModelBox(rightbackupperleg, 52, 0, -3.7805F, -3.5911F, -9.5756F, 4, 4, 13, 0.0F, true));

		leftbacklowerleg = new RendererModel(this);
		leftbacklowerleg.setRotationPoint(-8.5F, -0.5F, 2.0F);
		cart.addChild(leftbacklowerleg);
		setRotationAngle(leftbacklowerleg, 0.1309F, 0.5236F, -0.3054F);
		leftbacklowerleg.cubeList.add(new ModelBox(leftbacklowerleg, 88, 0, -1.0F, -9.0F, -1.0F, 2, 9, 2, 0.0F, false));

		rightbacklowerleg = new RendererModel(this);
		rightbacklowerleg.setRotationPoint(8.5F, -0.5F, 2.0F);
		cart.addChild(rightbacklowerleg);
		setRotationAngle(rightbacklowerleg, 0.1309F, -0.5236F, 0.3054F);
		rightbacklowerleg.cubeList.add(new ModelBox(rightbacklowerleg, 88, 0, -1.0F, -9.0F, -1.0F, 2, 9, 2, 0.0F, true));
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