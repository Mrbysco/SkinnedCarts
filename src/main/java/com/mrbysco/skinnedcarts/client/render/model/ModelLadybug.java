package com.mrbysco.skinnedcarts.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLadybug<E extends Entity> extends EntityModel<E> {
	private final ModelRenderer cart;
	private final ModelRenderer back_wall;
	private final ModelRenderer front_wall;
	private final ModelRenderer right_wall;
	private final ModelRenderer left_wall;
	private final ModelRenderer bottom;
	private final ModelRenderer inner;
	private final ModelRenderer head;
	private final ModelRenderer antenna;
	private final ModelRenderer antenna2;

	public ModelLadybug() {
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

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		cart.addChild(head);
		head.texOffs(74, 0).addBox(-4.0F, -10.5F, -12.0F, 8.0F, 6.0F, 3.0F, 0.0F, false);

		antenna = new ModelRenderer(this);
		antenna.setPos(-3.0F, -10.5F, -11.0F);
		head.addChild(antenna);
		setRotationAngle(antenna, 0.0F, -0.3054F, -0.3054F);
		antenna.texOffs(74, 10).addBox(0.0F, -4.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, false);

		antenna2 = new ModelRenderer(this);
		antenna2.setPos(3.0F, -10.5F, -11.0F);
		head.addChild(antenna2);
		setRotationAngle(antenna2, 0.0F, 0.3054F, 0.3054F);
		antenna2.texOffs(74, 10).addBox(0.0F, -4.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, true);
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