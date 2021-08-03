package com.mrbysco.skinnedcarts.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFrog<E extends Entity> extends EntityModel<E> {
    public ModelRenderer cart;
    public ModelRenderer front;
    public ModelRenderer back;
    public ModelRenderer bottom;
    public ModelRenderer seat;
    public ModelRenderer left;
    public ModelRenderer right;
    public ModelRenderer Leg1;
    public ModelRenderer Leg1_1;
    public ModelRenderer Leg2;
    public ModelRenderer Leg3;
    public ModelRenderer Leg2_1;
    public ModelRenderer Leg3_1;

    public ModelFrog() {
        this.texWidth = 64;
        this.texHeight = 64;

        this.cart = new ModelRenderer(this);

        this.Leg2_1 = new ModelRenderer(this, 37, 0);
        this.Leg2_1.setPos(0.0F, 0.0F, 0.0F);
        this.Leg2_1.addBox(-6.0F, -4.0F, -10.0F, 4, 4, 4, 0.0F);
        this.bottom = new ModelRenderer(this, 0, 46);
        this.bottom.setPos(0.0F, 4.0F, 0.0F);
        this.bottom.addBox(-10.0F, -8.0F, -1.0F, 20, 16, 2, 0.0F);
        this.setRotateAngle(bottom, 1.5707963267948966F, 0.0F, 0.0F);
        this.cart.addChild(bottom);
        this.Leg1 = new ModelRenderer(this, 37, 0);
        this.Leg1.setPos(3.0F, 5.0F, 4.0F);
        this.Leg1.addBox(-4.0F, -4.0F, 4.0F, 4, 4, 2, 0.0F);
        this.Leg3 = new ModelRenderer(this, 37, 0);
        this.Leg3.setPos(0.0F, 0.0F, 0.0F);
        this.Leg3.addBox(-10.0F, -3.0F, 7.0F, 4, 4, 4, 0.0F);
        this.seat = new ModelRenderer(this, 44, 47);
        this.seat.setPos(0.0F, 4.0F, 0.0F);
        this.seat.addBox(-9.0F, -7.0F, -1.0F, 18, 14, 1, 0.0F);
        this.setRotateAngle(seat, -1.5707963267948966F, 0.0F, 0.0F);
        this.cart.addChild(seat);
        this.Leg2 = new ModelRenderer(this, 37, 0);
        this.Leg2.setPos(0.0F, 0.0F, 0.0F);
        this.Leg2.addBox(-6.0F, -4.0F, 6.0F, 4, 4, 4, 0.0F);
        this.right = new ModelRenderer(this, 0, 30);
        this.right.mirror = true;
        this.right.setPos(0.0F, 4.0F, 7.0F);
        this.right.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.cart.addChild(right);
        this.Leg3_1 = new ModelRenderer(this, 37, 0);
        this.Leg3_1.setPos(0.0F, 0.0F, 0.0F);
        this.Leg3_1.addBox(-10.0F, -3.0F, -11.0F, 4, 4, 4, 0.0F);
        this.Leg1_1 = new ModelRenderer(this, 37, 0);
        this.Leg1_1.setPos(3.0F, 5.0F, -4.0F);
        this.Leg1_1.addBox(-4.0F, -4.0F, -6.0F, 4, 4, 2, 0.0F);
        this.back = new ModelRenderer(this, 0, 10);
        this.back.setPos(9.0F, 4.0F, 0.0F);
        this.back.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(back, 0.0F, 1.5707963267948966F, 0.0F);
        this.cart.addChild(back);
        this.front = new ModelRenderer(this, 0, 0);
        this.front.setPos(-9.0F, 4.0F, 0.0F);
        this.front.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(front, 0.0F, 4.71238898038469F, 0.0F);
        this.cart.addChild(front);
        this.left = new ModelRenderer(this, 0, 20);
        this.left.setPos(0.0F, 4.0F, -7.0F);
        this.left.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(left, 0.0F, 3.141592653589793F, 0.0F);
        this.cart.addChild(left);
        this.Leg1.addChild(this.Leg3);
        this.Leg1.addChild(this.Leg2);
        this.cart.addChild(Leg1);
        this.Leg1_1.addChild(this.Leg2_1);
        this.Leg1_1.addChild(this.Leg3_1);
        this.cart.addChild(Leg1_1);

    }

    @Override
    public void setupAnim(E entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.cart.y = 4.0F - ageInTicks;
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        cart.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
