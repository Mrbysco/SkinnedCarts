package com.mrbysco.skinnedcarts.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGreenFrog<E extends Entity> extends EntityModel<E> {
	private final ModelRenderer cart;
	private final ModelRenderer back_wall;
	private final ModelRenderer front_wall;
	private final ModelRenderer right_wall;
	private final ModelRenderer left_wall;
	private final ModelRenderer bottom;
	private final ModelRenderer inner;
	private final ModelRenderer eyes;
	private final ModelRenderer righteye;
	private final ModelRenderer lefteye;
	private final ModelRenderer leftfronttoes;
	private final ModelRenderer toe3;
	private final ModelRenderer toe2;
	private final ModelRenderer toe;
	private final ModelRenderer leftlowerfrontleg;
	private final ModelRenderer rightfronttoes;
	private final ModelRenderer toe6;
	private final ModelRenderer toe5;
	private final ModelRenderer toe4;
	private final ModelRenderer rightlowerfrontleg;
	private final ModelRenderer rightbacktoes;
	private final ModelRenderer toe7;
	private final ModelRenderer toe8;
	private final ModelRenderer toe9;
	private final ModelRenderer leftbacktoes;
	private final ModelRenderer toe10;
	private final ModelRenderer toe11;
	private final ModelRenderer toe12;
	private final ModelRenderer leftbackupperleg;
	private final ModelRenderer rightbackupperleg;
	private final ModelRenderer leftbacklowerleg;
	private final ModelRenderer rightbacklowerleg;

	public ModelGreenFrog() {
		texWidth = 96;
		texHeight = 96;

		cart = new ModelRenderer(this);
		cart.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);
		

		back_wall = new ModelRenderer(this);
		back_wall.setPos(0.0F, 0.0F, 8.0F);
		cart.addChild(back_wall);
		back_wall.texOffs(52, 22).addBox(-8.0F, -10.0F, 0.5F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		front_wall = new ModelRenderer(this);
		front_wall.setPos(0.0F, -6.0F, 17.0F);
		cart.addChild(front_wall);
		front_wall.texOffs(52, 32).addBox(-8.0F, -4.0F, -26.5F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		right_wall = new ModelRenderer(this);
		right_wall.setPos(-7.0F, -6.0F, 8.0F);
		cart.addChild(right_wall);
		right_wall.texOffs(34, 26).addBox(-1.0F, -4.0F, -15.5F, 2.0F, 8.0F, 16.0F, 0.0F, false);

		left_wall = new ModelRenderer(this);
		left_wall.setPos(7.0F, -6.0F, 8.0F);
		cart.addChild(left_wall);
		left_wall.texOffs(0, 26).addBox(-1.0F, -4.0F, -15.5F, 2.0F, 8.0F, 16.0F, 0.0F, false);

		bottom = new ModelRenderer(this);
		bottom.setPos(0.0F, 0.0F, 8.0F);
		cart.addChild(bottom);
		bottom.texOffs(0, 0).addBox(-8.0F, -2.0F, -17.5F, 16.0F, 2.0F, 20.0F, 0.0F, false);

		inner = new ModelRenderer(this);
		inner.setPos(1.0F, -39.5F, 7.5F);
		cart.addChild(inner);
		inner.texOffs(0, 22).addBox(-8.0F, 36.6F, -16.0F, 14.0F, 2.0F, 18.0F, 0.0F, false);

		eyes = new ModelRenderer(this);
		eyes.setPos(6.0F, -0.5F, -10.5F);
		cart.addChild(eyes);
		

		righteye = new ModelRenderer(this);
		righteye.setPos(-10.0F, -11.0F, 1.0F);
		eyes.addChild(righteye);
		setRotationAngle(righteye, 0.0F, -0.2618F, 0.0F);
		righteye.texOffs(0, 6).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		lefteye = new ModelRenderer(this);
		lefteye.setPos(-1.5F, -11.0F, 1.0F);
		eyes.addChild(lefteye);
		setRotationAngle(lefteye, 0.0F, -2.8798F, 0.0F);
		lefteye.texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		leftfronttoes = new ModelRenderer(this);
		leftfronttoes.setPos(1.0F, 0.0F, 0.0F);
		cart.addChild(leftfronttoes);
		

		toe3 = new ModelRenderer(this);
		toe3.setPos(-6.5F, -0.5F, -10.5F);
		leftfronttoes.addChild(toe3);
		setRotationAngle(toe3, 0.0F, -0.3054F, 0.0F);
		toe3.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		toe2 = new ModelRenderer(this);
		toe2.setPos(-8.0F, -0.5F, -10.5F);
		leftfronttoes.addChild(toe2);
		setRotationAngle(toe2, 0.0F, 0.3491F, 0.0F);
		toe2.texOffs(0, 0).addBox(-1.4698F, -0.5F, -1.171F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		toe = new ModelRenderer(this);
		toe.setPos(0.0F, 0.0F, 0.0F);
		leftfronttoes.addChild(toe);
		toe.texOffs(0, 0).addBox(-10.5F, -1.0F, -9.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		leftlowerfrontleg = new ModelRenderer(this);
		leftlowerfrontleg.setPos(-7.0F, -2.5F, -9.0F);
		cart.addChild(leftlowerfrontleg);
		setRotationAngle(leftlowerfrontleg, 0.0F, -0.3054F, -0.2182F);
		leftlowerfrontleg.texOffs(0, 0).addBox(-0.8968F, -2.9881F, -1.0325F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		rightfronttoes = new ModelRenderer(this);
		rightfronttoes.setPos(-1.5F, 0.0F, 1.5F);
		cart.addChild(rightfronttoes);
		

		toe6 = new ModelRenderer(this);
		toe6.setPos(7.0F, -0.5F, -11.5F);
		rightfronttoes.addChild(toe6);
		setRotationAngle(toe6, 0.0F, 0.2618F, 0.0F);
		toe6.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		toe5 = new ModelRenderer(this);
		toe5.setPos(9.0F, -0.5F, -12.0F);
		rightfronttoes.addChild(toe5);
		setRotationAngle(toe5, 0.0F, -0.48F, 0.0F);
		toe5.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		toe4 = new ModelRenderer(this);
		toe4.setPos(1.0F, 0.0F, -1.0F);
		rightfronttoes.addChild(toe4);
		toe4.texOffs(0, 0).addBox(8.5F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		rightlowerfrontleg = new ModelRenderer(this);
		rightlowerfrontleg.setPos(6.57F, -0.5781F, -8.9633F);
		cart.addChild(rightlowerfrontleg);
		setRotationAngle(rightlowerfrontleg, 0.0F, -0.5236F, 0.1309F);
		rightlowerfrontleg.texOffs(0, 0).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		rightbacktoes = new ModelRenderer(this);
		rightbacktoes.setPos(5.5F, 0.0F, -5.5F);
		cart.addChild(rightbacktoes);
		setRotationAngle(rightbacktoes, 0.0F, -0.6545F, 0.0F);
		

		toe7 = new ModelRenderer(this);
		toe7.setPos(5.5F, -0.5F, 2.5F);
		rightbacktoes.addChild(toe7);
		setRotationAngle(toe7, 0.0F, 0.2618F, 0.0F);
		toe7.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		toe8 = new ModelRenderer(this);
		toe8.setPos(7.5F, -0.5F, 2.0F);
		rightbacktoes.addChild(toe8);
		setRotationAngle(toe8, 0.0F, -0.48F, 0.0F);
		toe8.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		toe9 = new ModelRenderer(this);
		toe9.setPos(-0.5F, 0.0F, 13.0F);
		rightbacktoes.addChild(toe9);
		toe9.texOffs(0, 0).addBox(8.5F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		leftbacktoes = new ModelRenderer(this);
		leftbacktoes.setPos(-5.5F, 0.0F, -5.5F);
		cart.addChild(leftbacktoes);
		setRotationAngle(leftbacktoes, 0.0F, 0.6545F, 0.0F);
		

		toe10 = new ModelRenderer(this);
		toe10.setPos(-5.5F, -0.5F, 2.5F);
		leftbacktoes.addChild(toe10);
		setRotationAngle(toe10, 0.0F, -0.2618F, 0.0F);
		toe10.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		toe11 = new ModelRenderer(this);
		toe11.setPos(-7.5F, -0.5F, 2.0F);
		leftbacktoes.addChild(toe11);
		setRotationAngle(toe11, 0.0F, 0.48F, 0.0F);
		toe11.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		toe12 = new ModelRenderer(this);
		toe12.setPos(0.5F, 0.0F, 13.0F);
		leftbacktoes.addChild(toe12);
		toe12.texOffs(0, 0).addBox(-10.5F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		leftbackupperleg = new ModelRenderer(this);
		leftbackupperleg.setPos(-9.5F, -4.5F, 10.5F);
		cart.addChild(leftbackupperleg);
		setRotationAngle(leftbackupperleg, -0.4363F, 0.4363F, 0.0F);
		leftbackupperleg.texOffs(52, 0).addBox(1.0789F, -2.9144F, -11.0269F, 4.0F, 4.0F, 13.0F, 0.0F, false);

		rightbackupperleg = new ModelRenderer(this);
		rightbackupperleg.setPos(9.5F, -4.5F, 8.0F);
		cart.addChild(rightbackupperleg);
		setRotationAngle(rightbackupperleg, -0.4363F, -0.4363F, 0.0F);
		rightbackupperleg.texOffs(52, 0).addBox(-3.7805F, -3.5911F, -9.5756F, 4.0F, 4.0F, 13.0F, 0.0F, true);

		leftbacklowerleg = new ModelRenderer(this);
		leftbacklowerleg.setPos(-8.5F, -0.5F, 2.0F);
		cart.addChild(leftbacklowerleg);
		setRotationAngle(leftbacklowerleg, 0.1309F, 0.5236F, -0.3054F);
		leftbacklowerleg.texOffs(88, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		rightbacklowerleg = new ModelRenderer(this);
		rightbacklowerleg.setPos(8.5F, -0.5F, 2.0F);
		cart.addChild(rightbacklowerleg);
		setRotationAngle(rightbacklowerleg, 0.1309F, -0.5236F, 0.3054F);
		rightbacklowerleg.texOffs(88, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(E entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.cart.y = 4.0F - ageInTicks;
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		cart.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}