package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class ModelFrog<T extends Entity> extends HierarchicalModel<T> {
	public ModelPart root;
	public ModelPart cart;

	public ModelFrog(final ModelPart part) {
		this.root = part;
		this.cart = part.getChild("cart");
	}

	public static LayerDefinition createMesh() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partDefinition = meshdefinition.getRoot();

		PartDefinition cartDefinition = partDefinition.addOrReplaceChild("cart",
				CubeListBuilder.create()
				, PartPose.offsetAndRotation(8.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("back_wall",
				CubeListBuilder.create()
						.texOffs(0, 66).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("front_wall",
				CubeListBuilder.create()
						.texOffs(0, 56).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		cartDefinition.addOrReplaceChild("right_wall",
				CubeListBuilder.create()
						.texOffs(0, 76).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F).mirror()
				, PartPose.offsetAndRotation(-7.0F, -6.0F, 8.0F, 0.0F, -1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("left_wall",
				CubeListBuilder.create()
						.texOffs(0, 86).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F).mirror()
				, PartPose.offsetAndRotation(7.0F, -6.0F, 8.0F, 0.0F, 1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("bottom",
				CubeListBuilder.create()
						.texOffs(11, 22).addBox(-8.0F, -2.0F, -10.0F, 16.0F, 2.0F, 20.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("inner",
				CubeListBuilder.create()
						.texOffs(3, 1).addBox(-7.0F, -2.9F, -9.0F, 14.0F, 2.0F, 18.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create()
						.texOffs(37, 56).addBox(8.0F, -4.0F, 7.0F, 2.0F, 4.0F, 4.0F)
						.texOffs(37, 56).addBox(10.0F, -4.0F, 5.0F, 4.0F, 4.0F, 4.0F)
						.texOffs(37, 56).addBox(11.0F, -3.0F, 1.0F, 4.0F, 4.0F, 4.0F)
				, PartPose.offset(0.0F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create()
						.texOffs(37, 56).addBox(-10.0F, -4.0F, 7.0F, 2.0F, 4.0F, 4.0F)
						.texOffs(37, 56).addBox(-14.0F, -4.0F, 5.0F, 4.0F, 4.0F, 4.0F)
						.texOffs(37, 56).addBox(-15.0F, -3.0F, 1.0F, 4.0F, 4.0F, 4.0F)
				, PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.cart.y = 4.0F - ageInTicks;
	}

	@Override
	public ModelPart root() {
		return this.root;
	}
}
