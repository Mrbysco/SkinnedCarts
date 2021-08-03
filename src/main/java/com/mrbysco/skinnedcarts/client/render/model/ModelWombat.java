package com.mrbysco.skinnedcarts.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWombat<E extends Entity> extends EntityModel<E> {
	private final ModelRenderer cart;
	private final ModelRenderer back_wall;
	private final ModelRenderer front_wall;
	private final ModelRenderer right_wall;
	private final ModelRenderer left_wall;
	private final ModelRenderer bottom;
	private final ModelRenderer inner;
	private final ModelRenderer Head;
	private final ModelRenderer nose;
	private final ModelRenderer ear;
	private final ModelRenderer ear2;
	private final ModelRenderer backlegs;
	private final ModelRenderer bone;
	private final ModelRenderer backlegs2;
	private final ModelRenderer bone2;
	private final ModelRenderer frontleg;
	private final ModelRenderer frontleg2;
	private final ModelRenderer frontshoulder;
	private final ModelRenderer frontshoulder2;
	private final ModelRenderer tail;

	public ModelWombat() {
		texWidth = 96;
		texHeight = 96;

		cart = new ModelRenderer(this);
		cart.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);
		

		back_wall = new ModelRenderer(this);
		back_wall.setPos(8.0F, 0.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.texOffs(52, 22).addBox(-16.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		front_wall = new ModelRenderer(this);
		front_wall.setPos(8.0F, -6.0F, -9.0F);
		cart.addChild(front_wall);
		front_wall.texOffs(52, 32).addBox(-16.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		right_wall = new ModelRenderer(this);
		right_wall.setPos(1.0F, -6.0F, 0.0F);
		cart.addChild(right_wall);
		right_wall.texOffs(34, 26).addBox(-9.0F, -4.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, false);

		left_wall = new ModelRenderer(this);
		left_wall.setPos(15.0F, -6.0F, 0.0F);
		cart.addChild(left_wall);
		left_wall.texOffs(0, 26).addBox(-9.0F, -4.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, false);

		bottom = new ModelRenderer(this);
		bottom.setPos(8.0F, 0.0F, 0.0F);
		cart.addChild(bottom);
		bottom.texOffs(0, 0).addBox(-16.0F, -2.0F, -10.0F, 16.0F, 2.0F, 20.0F, 0.0F, false);

		inner = new ModelRenderer(this);
		inner.setPos(8.0F, 0.0F, 0.0F);
		cart.addChild(inner);
		inner.texOffs(0, 22).addBox(-15.0F, -2.9F, -9.0F, 14.0F, 2.0F, 18.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -2.125F, -6.375F);
		cart.addChild(Head);
		setRotationAngle(Head, 0.0873F, 0.0F, 0.0F);
		Head.texOffs(0, 51).addBox(-4.5F, -6.375F, -7.125F, 9.0F, 7.0F, 4.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setPos(0.0F, -1.375F, -7.625F);
		Head.addChild(nose);
		setRotationAngle(nose, 0.3054F, 0.0F, 0.0F);
		nose.texOffs(0, 0).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		ear = new ModelRenderer(this);
		ear.setPos(3.5F, -6.875F, -6.125F);
		Head.addChild(ear);
		setRotationAngle(ear, 0.0436F, -1.2217F, 0.2182F);
		ear.texOffs(53, 5).addBox(0.1066F, -1.1132F, -0.6119F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		ear2 = new ModelRenderer(this);
		ear2.setPos(-3.5F, -6.875F, -5.125F);
		Head.addChild(ear2);
		setRotationAngle(ear2, 0.0F, 1.309F, -0.2182F);
		ear2.texOffs(54, 0).addBox(-1.1263F, -1.1082F, -0.9715F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		backlegs = new ModelRenderer(this);
		backlegs.setPos(9.0F, -3.0F, 7.5F);
		cart.addChild(backlegs);
		setRotationAngle(backlegs, 0.2618F, -0.1745F, 0.0F);
		backlegs.texOffs(61, 0).addBox(-2.8264F, -5.2622F, -3.6782F, 3.0F, 7.0F, 6.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-1.1946F, 1.8612F, -4.2109F);
		backlegs.addChild(bone);
		setRotationAngle(bone, -0.1309F, 0.0F, 0.0F);
		bone.texOffs(79, 0).addBox(-1.7757F, -1.0536F, -2.0695F, 3.0F, 1.0F, 4.0F, 0.0F, false);

		backlegs2 = new ModelRenderer(this);
		backlegs2.setPos(-9.0F, -3.0F, 7.5F);
		cart.addChild(backlegs2);
		setRotationAngle(backlegs2, 0.2618F, 0.1745F, 0.0F);
		backlegs2.texOffs(61, 0).addBox(-0.1736F, -5.7451F, -3.5487F, 3.0F, 7.0F, 6.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.6876F, 1.0452F, -2.8926F);
		backlegs2.addChild(bone2);
		setRotationAngle(bone2, -0.1309F, -0.1309F, 0.0F);
		bone2.texOffs(79, 0).addBox(-0.9466F, -0.1244F, -2.9003F, 3.0F, 1.0F, 4.0F, 0.0F, true);

		frontleg = new ModelRenderer(this);
		frontleg.setPos(-8.0F, -6.0F, -10.0F);
		cart.addChild(frontleg);
		setRotationAngle(frontleg, -0.1745F, -0.1745F, -0.1309F);
		frontleg.texOffs(11, 0).addBox(-0.8264F, 0.829F, -0.0302F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		frontleg2 = new ModelRenderer(this);
		frontleg2.setPos(8.0F, -6.0F, -10.0F);
		cart.addChild(frontleg2);
		setRotationAngle(frontleg2, -0.1745F, 0.1745F, 0.1309F);
		frontleg2.texOffs(11, 0).addBox(-1.1736F, 0.829F, -0.0302F, 2.0F, 5.0F, 2.0F, 0.0F, true);

		frontshoulder = new ModelRenderer(this);
		frontshoulder.setPos(5.0F, -4.5F, -7.5F);
		cart.addChild(frontshoulder);
		setRotationAngle(frontshoulder, 0.3054F, 0.0436F, 0.0F);
		frontshoulder.texOffs(80, 6).addBox(1.4976F, -3.4829F, -2.2171F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		frontshoulder2 = new ModelRenderer(this);
		frontshoulder2.setPos(-5.0F, -4.5F, -7.5F);
		cart.addChild(frontshoulder2);
		setRotationAngle(frontshoulder2, 0.3054F, -0.0436F, 0.0F);
		frontshoulder2.texOffs(80, 6).addBox(-3.4976F, -3.4829F, -2.2171F, 2.0F, 4.0F, 5.0F, 0.0F, true);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -1.5F, 10.0F);
		cart.addChild(tail);
		setRotationAngle(tail, -1.6581F, 0.0873F, 0.0F);
		tail.texOffs(0, 9).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
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