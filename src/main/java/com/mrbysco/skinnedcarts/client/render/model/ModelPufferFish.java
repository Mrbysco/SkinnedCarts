package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class ModelPufferFish<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart root;
	private final ModelPart cart;

	public ModelPufferFish(final ModelPart part) {
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
						.texOffs(0, 52).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("front_wall",
				CubeListBuilder.create()
						.texOffs(46, 22).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		cartDefinition.addOrReplaceChild("right_wall",
				CubeListBuilder.create()
						.texOffs(36, 42).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offsetAndRotation(-7.0F, -6.0F, 8.0F, 0.0F, -1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("left_wall",
				CubeListBuilder.create()
						.texOffs(0, 42).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offsetAndRotation(7.0F, -6.0F, 8.0F, 0.0F, 1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("bottom",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-8.0F, -2.0F, -10.0F, 16.0F, 2.0F, 20.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("inner",
				CubeListBuilder.create()
						.texOffs(0, 22).addBox(-7.0F, -2.9F, -9.0F, 14.0F, 2.0F, 18.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("mouth",
				CubeListBuilder.create()
						.texOffs(36, 52).addBox(-2.0F, -7.0F, -3.0F, 4.0F, 3.0F, 1.0F)
				, PartPose.offset(0.0F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("left_fin",
				CubeListBuilder.create()
						.texOffs(59, 52).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F)
				, PartPose.offsetAndRotation(-8.0F, -7.0F, 5.0F, 0.0F, 0.0F, 0.2618F));

		cartDefinition.addOrReplaceChild("right_fin",
				CubeListBuilder.create()
						.texOffs(46, 52).addBox(0.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F)
				, PartPose.offsetAndRotation(8.0F, -7.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		cartDefinition.addOrReplaceChild("left_spines_1",
				CubeListBuilder.create()
						.texOffs(16, 76).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 10.0F, 0.0F)
				, PartPose.offsetAndRotation(-8.0F, -5.0F, -2.0F, 0.0F, -0.7854F, 0.0F));

		cartDefinition.addOrReplaceChild("right_spines_1",
				CubeListBuilder.create()
						.texOffs(16, 64).addBox(0.0F, -5.0F, 0.0F, 1.0F, 10.0F, 0.0F)
				, PartPose.offsetAndRotation(8.0F, -5.0F, -2.0F, 0.0F, 0.7854F, 0.0F));

		cartDefinition.addOrReplaceChild("top_spines_1",
				CubeListBuilder.create()
						.texOffs(0, 62).addBox(-8.0F, -1.0F, 0.0F, 16.0F, 1.0F, 0.0F)
				, PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("bottom_spines_1",
				CubeListBuilder.create()
						.texOffs(0, 74).addBox(-8.0F, 0.0F, 0.0F, 16.0F, 1.0F, 0.0F)
				, PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.7854F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("top_spines_2",
				CubeListBuilder.create()
						.texOffs(0, 63).addBox(-8.0F, -1.0F, 0.0F, 16.0F, 1.0F, 0.0F)
				, PartPose.offsetAndRotation(0.0F, -10.0F, 18.0F, -0.7854F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("top_spines_left_1",
				CubeListBuilder.create()
						.texOffs(0, 86).addBox(-10.0F, -9.0F, -14.0F, 2.0F, 1.0F, 0.0F)
				, PartPose.offset(2.0F, -2.0F, 18.0F));

		cartDefinition.addOrReplaceChild("bottom_spines_2",
				CubeListBuilder.create()
						.texOffs(0, 75).addBox(-8.0F, 0.0F, 0.0F, 16.0F, 1.0F, 0.0F)
				, PartPose.offsetAndRotation(0.0F, 0.0F, 18.0F, 0.7854F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("top_spines_left_2",
				CubeListBuilder.create()
						.texOffs(0, 87).addBox(-10.0F, -9.0F, -6.0F, 2.0F, 1.0F, 0.0F)
				, PartPose.offset(2.0F, -2.0F, 18.0F));

		cartDefinition.addOrReplaceChild("right_spines_4",
				CubeListBuilder.create()
						.texOffs(16, 76).addBox(0.0F, -5.0F, 0.0F, 1.0F, 10.0F, 0.0F)
				, PartPose.offsetAndRotation(8.0F, -5.0F, 18.0F, 0.0F, -0.7854F, 0.0F));

		cartDefinition.addOrReplaceChild("left_spines_4",
				CubeListBuilder.create()
						.texOffs(16, 64).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 10.0F, 0.0F)
				, PartPose.offsetAndRotation(-8.0F, -5.0F, 18.0F, 0.0F, 0.7854F, 0.0F));

		cartDefinition.addOrReplaceChild("top_spines_right_2",
				CubeListBuilder.create()
						.texOffs(0, 86).addBox(4.0F, -9.0F, -6.0F, 2.0F, 1.0F, 0.0F)
				, PartPose.offset(2.0F, -2.0F, 18.0F));

		cartDefinition.addOrReplaceChild("right_spines_2",
				CubeListBuilder.create()
						.texOffs(0, 76).addBox(6.0F, -8.0F, -14.0F, 1.0F, 10.0F, 0.0F)
				, PartPose.offset(2.0F, -2.0F, 18.0F));

		cartDefinition.addOrReplaceChild("right_spines_3",
				CubeListBuilder.create()
						.texOffs(0, 64).addBox(6.0F, -8.0F, -6.0F, 1.0F, 10.0F, 0.0F)
				, PartPose.offset(2.0F, -2.0F, 18.0F));

		cartDefinition.addOrReplaceChild("top_spines_right_1",
				CubeListBuilder.create()
						.texOffs(0, 87).addBox(4.0F, -9.0F, -14.0F, 2.0F, 1.0F, 0.0F)
				, PartPose.offset(2.0F, -2.0F, 18.0F));

		cartDefinition.addOrReplaceChild("left_spines_2",
				CubeListBuilder.create()
						.texOffs(0, 64).addBox(-11.0F, -8.0F, -14.0F, 1.0F, 10.0F, 0.0F)
				, PartPose.offset(2.0F, -2.0F, 18.0F));

		cartDefinition.addOrReplaceChild("left_spines_3",
				CubeListBuilder.create()
						.texOffs(0, 76).addBox(-11.0F, -8.0F, -6.0F, 1.0F, 10.0F, 0.0F)
				, PartPose.offset(2.0F, -2.0F, 18.0F));

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