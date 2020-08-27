package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelWombat<E extends Entity> extends EntityModel<E> {
	private final RendererModel cart;
	private final RendererModel back_wall;
	private final RendererModel front_wall;
	private final RendererModel right_wall;
	private final RendererModel left_wall;
	private final RendererModel bottom;
	private final RendererModel inner;
	private final RendererModel Head;
	private final RendererModel nose;
	private final RendererModel ear;
	private final RendererModel ear2;
	private final RendererModel backlegs;
	private final RendererModel bone;
	private final RendererModel backlegs2;
	private final RendererModel bone2;
	private final RendererModel frontleg;
	private final RendererModel frontleg2;
	private final RendererModel frontshoulder;
	private final RendererModel frontshoulder2;
	private final RendererModel tail;

	public ModelWombat() {
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
		Head.setRotationPoint(0.0F, -2.125F, -6.375F);
		cart.addChild(Head);
		setRotationAngle(Head, 0.0873F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 51, -4.5F, -6.375F, -7.125F, 9, 7, 4, 0.0F, false));

		nose = new RendererModel(this);
		nose.setRotationPoint(0.0F, -1.375F, -7.625F);
		Head.addChild(nose);
		setRotationAngle(nose, 0.3054F, 0.0F, 0.0F);
		nose.cubeList.add(new ModelBox(nose, 0, 0, -2.0F, -1.5F, -1.0F, 4, 3, 2, 0.0F, false));

		ear = new RendererModel(this);
		ear.setRotationPoint(3.5F, -6.875F, -6.125F);
		Head.addChild(ear);
		setRotationAngle(ear, 0.0436F, -1.2217F, 0.2182F);
		ear.cubeList.add(new ModelBox(ear, 53, 5, 0.1066F, -1.1132F, -0.6119F, 2, 2, 1, 0.0F, false));

		ear2 = new RendererModel(this);
		ear2.setRotationPoint(-3.5F, -6.875F, -5.125F);
		Head.addChild(ear2);
		setRotationAngle(ear2, 0.0F, 1.309F, -0.2182F);
		ear2.cubeList.add(new ModelBox(ear2, 54, 0, -1.1263F, -1.1082F, -0.9715F, 2, 2, 1, 0.0F, true));

		backlegs = new RendererModel(this);
		backlegs.setRotationPoint(9.0F, -3.0F, 7.5F);
		cart.addChild(backlegs);
		setRotationAngle(backlegs, 0.2618F, -0.1745F, 0.0F);
		backlegs.cubeList.add(new ModelBox(backlegs, 61, 0, -2.8264F, -5.2622F, -3.6782F, 3, 7, 6, 0.0F, false));

		bone = new RendererModel(this);
		bone.setRotationPoint(-1.1946F, 1.8612F, -4.2109F);
		backlegs.addChild(bone);
		setRotationAngle(bone, -0.1309F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 79, 0, -1.7757F, -1.0536F, -2.0695F, 3, 1, 4, 0.0F, false));

		backlegs2 = new RendererModel(this);
		backlegs2.setRotationPoint(-9.0F, -3.0F, 7.5F);
		cart.addChild(backlegs2);
		setRotationAngle(backlegs2, 0.2618F, 0.1745F, 0.0F);
		backlegs2.cubeList.add(new ModelBox(backlegs2, 61, 0, -0.1736F, -5.7451F, -3.5487F, 3, 7, 6, 0.0F, true));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.6876F, 1.0452F, -2.8926F);
		backlegs2.addChild(bone2);
		setRotationAngle(bone2, -0.1309F, -0.1309F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 79, 0, -0.9466F, -0.1244F, -2.9003F, 3, 1, 4, 0.0F, true));

		frontleg = new RendererModel(this);
		frontleg.setRotationPoint(-8.0F, -6.0F, -10.0F);
		cart.addChild(frontleg);
		setRotationAngle(frontleg, -0.1745F, -0.1745F, -0.1309F);
		frontleg.cubeList.add(new ModelBox(frontleg, 11, 0, -0.8264F, 0.829F, -0.0302F, 2, 5, 2, 0.0F, false));

		frontleg2 = new RendererModel(this);
		frontleg2.setRotationPoint(8.0F, -6.0F, -10.0F);
		cart.addChild(frontleg2);
		setRotationAngle(frontleg2, -0.1745F, 0.1745F, 0.1309F);
		frontleg2.cubeList.add(new ModelBox(frontleg2, 11, 0, -1.1736F, 0.829F, -0.0302F, 2, 5, 2, 0.0F, true));

		frontshoulder = new RendererModel(this);
		frontshoulder.setRotationPoint(5.0F, -4.5F, -7.5F);
		cart.addChild(frontshoulder);
		setRotationAngle(frontshoulder, 0.3054F, 0.0436F, 0.0F);
		frontshoulder.cubeList.add(new ModelBox(frontshoulder, 80, 6, 1.4976F, -3.4829F, -2.2171F, 2, 4, 5, 0.0F, false));

		frontshoulder2 = new RendererModel(this);
		frontshoulder2.setRotationPoint(-5.0F, -4.5F, -7.5F);
		cart.addChild(frontshoulder2);
		setRotationAngle(frontshoulder2, 0.3054F, -0.0436F, 0.0F);
		frontshoulder2.cubeList.add(new ModelBox(frontshoulder2, 80, 6, -3.4976F, -3.4829F, -2.2171F, 2, 4, 5, 0.0F, true));

		tail = new RendererModel(this);
		tail.setRotationPoint(0.0F, -1.5F, 10.0F);
		cart.addChild(tail);
		setRotationAngle(tail, -1.6581F, 0.0873F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 0, 9, -1.5F, -1.5F, -0.5F, 3, 3, 2, 0.0F, false));
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