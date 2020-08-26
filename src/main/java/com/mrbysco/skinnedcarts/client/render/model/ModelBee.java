package com.mrbysco.skinnedcarts.client.render.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBee<E extends Entity> extends EntityModel<E> {
	private final ModelRenderer cart;
	private final ModelRenderer back_wall;
	private final ModelRenderer front_wall;
	private final ModelRenderer right_wall;
	private final ModelRenderer left_wall;
	private final ModelRenderer bottom;
	private final ModelRenderer inner;
	private final ModelRenderer Head;
	private final ModelRenderer Head2;
	private final ModelRenderer Wings3;
	private final ModelRenderer Wings4;
	private final ModelRenderer Wings;
	private final ModelRenderer Wings2;
	private final ModelRenderer bone;

	public ModelBee() {
		super(RenderType::getEntityTranslucent);
		textureWidth = 96;
		textureHeight = 96;

		cart = new ModelRenderer(this);
		cart.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(cart, 0.0F, -1.5708F, 0.0F);


		back_wall = new ModelRenderer(this);
		back_wall.setRotationPoint(8.0F, 0.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.setTextureOffset(52, 22).addBox(-16.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		front_wall = new ModelRenderer(this);
		front_wall.setRotationPoint(8.0F, -6.0F, -9.0F);
		cart.addChild(front_wall);
		front_wall.setTextureOffset(52, 32).addBox(-16.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		right_wall = new ModelRenderer(this);
		right_wall.setRotationPoint(1.0F, -6.0F, 0.0F);
		cart.addChild(right_wall);
		right_wall.setTextureOffset(34, 26).addBox(-9.0F, -4.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, false);

		left_wall = new ModelRenderer(this);
		left_wall.setRotationPoint(15.0F, -6.0F, 0.0F);
		cart.addChild(left_wall);
		left_wall.setTextureOffset(0, 26).addBox(-9.0F, -4.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, false);

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(8.0F, 0.0F, 0.0F);
		cart.addChild(bottom);
		bottom.setTextureOffset(0, 0).addBox(-16.0F, -2.0F, -10.0F, 16.0F, 2.0F, 20.0F, 0.0F, false);

		inner = new ModelRenderer(this);
		inner.setRotationPoint(8.0F, 0.0F, 0.0F);
		cart.addChild(inner);
		inner.setTextureOffset(0, 22).addBox(-15.0F, -2.9F, -9.0F, 14.0F, 2.0F, 18.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(6.5F, -5.0F, -10.0F);
		cart.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-2.0F, -3.5F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(-6.5F, -5.0F, -10.0F);
		cart.addChild(Head2);
		Head2.setTextureOffset(0, 0).addBox(-2.0F, -3.5F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, true);

		Wings3 = new ModelRenderer(this);
		Wings3.setRotationPoint(-8.0F, -8.5F, 0.0F);
		cart.addChild(Wings3);
		setRotationAngle(Wings3, 0.0F, 0.0F, 0.5672F);
		Wings3.setTextureOffset(56, 0).addBox(-6.9627F, 0.8434F, -6.0F, 8.0F, 0.0F, 12.0F, 0.0F, true);

		Wings4 = new ModelRenderer(this);
		Wings4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wings3.addChild(Wings4);
		setRotationAngle(Wings4, 0.0F, 0.0F, -0.829F);
		Wings4.setTextureOffset(56, 0).addBox(-7.7588F, 0.9659F, -6.0F, 8.0F, 0.0F, 12.0F, 0.0F, true);

		Wings = new ModelRenderer(this);
		Wings.setRotationPoint(8.0F, -8.5F, 0.0F);
		cart.addChild(Wings);
		setRotationAngle(Wings, 0.0F, 0.0F, -0.5672F);
		Wings.setTextureOffset(56, 0).addBox(-1.0373F, 0.8434F, -6.0F, 8.0F, 0.0F, 12.0F, 0.0F, false);

		Wings2 = new ModelRenderer(this);
		Wings2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wings.addChild(Wings2);
		setRotationAngle(Wings2, 0.0F, 0.0F, 0.829F);
		Wings2.setTextureOffset(56, 0).addBox(-0.2412F, 0.9659F, -6.0F, 8.0F, 0.0F, 12.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -7.0F, 9.5F);
		cart.addChild(bone);
		setRotationAngle(bone, 0.3927F, 0.0F, 0.0F);
		bone.setTextureOffset(1, 9).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.cart.rotationPointY = 4.0F - ageInTicks;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		cart.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}