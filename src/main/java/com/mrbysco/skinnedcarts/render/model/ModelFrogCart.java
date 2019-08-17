package com.mrbysco.skinnedcarts.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFrogCart extends ModelBase {
    public ModelRenderer field_78154_a2;
    public ModelRenderer field_78154_a3;
    public ModelRenderer field_78154_a1;
    public ModelRenderer field_78154_a6;
    public ModelRenderer field_78154_a4;
    public ModelRenderer field_78154_a5;

    public ModelFrogCart() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        
        this.field_78154_a2 = new ModelRenderer(this, 0, 0);
        this.field_78154_a2.setRotationPoint(-9.0F, 4.0F, 0.0F);
        this.field_78154_a2.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(field_78154_a2, 0.0F, 4.71238899230957F, 0.0F);
        this.field_78154_a6 = new ModelRenderer(this, 44, 47);
        this.field_78154_a6.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.field_78154_a6.addBox(-9.0F, -7.0F, -1.0F, 18, 14, 1, 0.0F);
        this.setRotateAngle(field_78154_a6, -1.5707963267948966F, 0.0F, 0.0F);
        this.field_78154_a4 = new ModelRenderer(this, 0, 20);
        this.field_78154_a4.setRotationPoint(0.0F, 4.0F, -7.0F);
        this.field_78154_a4.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(field_78154_a4, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78154_a3 = new ModelRenderer(this, 0, 10);
        this.field_78154_a3.setRotationPoint(9.0F, 4.0F, 0.0F);
        this.field_78154_a3.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
        this.setRotateAngle(field_78154_a3, 0.0F, 1.5707963267948966F, 0.0F);
        this.field_78154_a1 = new ModelRenderer(this, 0, 46);
        this.field_78154_a1.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.field_78154_a1.addBox(-10.0F, -8.0F, -1.0F, 20, 16, 2, 0.0F);
        this.setRotateAngle(field_78154_a1, 1.5707963267948966F, 0.0F, 0.0F);
        this.field_78154_a5 = new ModelRenderer(this, 0, 30);
        this.field_78154_a5.setRotationPoint(0.0F, 4.0F, 7.0F);
        this.field_78154_a5.addBox(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78154_a2.render(f5);
        this.field_78154_a6.render(f5);
        this.field_78154_a4.render(f5);
        this.field_78154_a3.render(f5);
        this.field_78154_a1.render(f5);
        this.field_78154_a5.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
