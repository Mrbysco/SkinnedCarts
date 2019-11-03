package com.mrbysco.skinnedcarts.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFrog extends ModelBase {
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
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Leg2_1 = new ModelRenderer(this, 37, 0);
        this.Leg2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg2_1.addBox(-6.0F, -4.0F, -10.0F, 4, 4, 4, 0.0F);
        this.bottom = new ModelRenderer(this, 0, 46);
        this.bottom.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.bottom.addBox(-10.0F, -8.0F, -1.0F, 20, 16, 2, 0.0F);
        this.setRotateAngle(bottom, 1.5707963267948966F, 0.0F, 0.0F);
        this.Leg1 = new ModelRenderer(this, 37, 0);
        this.Leg1.setRotationPoint(3.0F, 5.0F, 4.0F);
        this.Leg1.addBox(-4.0F, -4.0F, 4.0F, 4, 4, 2, 0.0F);
        this.Leg3 = new ModelRenderer(this, 37, 0);
        this.Leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg3.addBox(-10.0F, -3.0F, 7.0F, 4, 4, 4, 0.0F);
        this.seat = new ModelRenderer(this, 44, 47);
        this.seat.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.seat.addBox(-9.0F, -7.0F, -1.0F, 18, 14, 1, 0.0F);
        this.setRotateAngle(seat, -1.5707963267948966F, 0.0F, 0.0F);
        this.Leg2 = new ModelRenderer(this, 37, 0);
        this.Leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg2.addBox(-6.0F, -4.0F, 6.0F, 4, 4, 4, 0.0F);
        this.right = new ModelRenderer(this, 0, 30);
        this.right.mirror = true;
        this.right.setRotationPoint(0.0F, 4.0F, 7.0F);
        this.right.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.Leg3_1 = new ModelRenderer(this, 37, 0);
        this.Leg3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg3_1.addBox(-10.0F, -3.0F, -11.0F, 4, 4, 4, 0.0F);
        this.Leg1_1 = new ModelRenderer(this, 37, 0);
        this.Leg1_1.setRotationPoint(3.0F, 5.0F, -4.0F);
        this.Leg1_1.addBox(-4.0F, -4.0F, -6.0F, 4, 4, 2, 0.0F);
        this.back = new ModelRenderer(this, 0, 10);
        this.back.setRotationPoint(9.0F, 4.0F, 0.0F);
        this.back.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(back, 0.0F, 1.5707963267948966F, 0.0F);
        this.front = new ModelRenderer(this, 0, 0);
        this.front.setRotationPoint(-9.0F, 4.0F, 0.0F);
        this.front.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(front, 0.0F, 4.71238898038469F, 0.0F);
        this.left = new ModelRenderer(this, 0, 20);
        this.left.setRotationPoint(0.0F, 4.0F, -7.0F);
        this.left.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(left, 0.0F, 3.141592653589793F, 0.0F);
        this.Leg1_1.addChild(this.Leg2_1);
        this.Leg1.addChild(this.Leg3);
        this.Leg1.addChild(this.Leg2);
        this.Leg1_1.addChild(this.Leg3_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.bottom.render(f5);
        this.Leg1.render(f5);
        this.seat.render(f5);
        this.right.render(f5);
        this.Leg1_1.render(f5);
        this.back.render(f5);
        this.front.render(f5);
        this.left.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
