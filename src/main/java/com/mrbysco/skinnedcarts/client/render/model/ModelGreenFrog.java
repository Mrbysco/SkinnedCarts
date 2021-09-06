package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class ModelGreenFrog<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart root;
	private final ModelPart cart;

	public ModelGreenFrog(final ModelPart part) {
		this.root = part;
		this.cart = part.getChild("cart");
	}

	public static LayerDefinition createMesh() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partDefinition = meshdefinition.getRoot();

		PartDefinition cartDefinition = partDefinition.addOrReplaceChild("cart",
				CubeListBuilder.create()
				, PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F,  0.0F, -1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("back_wall",
				CubeListBuilder.create()
						.texOffs(52, 22).addBox(-8.0F, -10.0F, 0.5F, 16.0F, 8.0F, 2.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("front_wall",
				CubeListBuilder.create()
						.texOffs(52, 32).addBox(-8.0F, -4.0F, -26.5F, 16.0F, 8.0F, 2.0F)
				, PartPose.offset(0.0F, -6.0F, 17.0F));

		cartDefinition.addOrReplaceChild("right_wall",
				CubeListBuilder.create()
						.texOffs(34, 26).addBox(-1.0F, -4.0F, -15.5F, 2.0F, 8.0F, 16.0F)
				, PartPose.offset(-7.0F, -6.0F, 8.0F));

		cartDefinition.addOrReplaceChild("left_wall",
				CubeListBuilder.create()
						.texOffs(0, 26).addBox(-1.0F, -4.0F, -15.5F, 2.0F, 8.0F, 16.0F)
				, PartPose.offset(7.0F, -6.0F, 8.0F));

		cartDefinition.addOrReplaceChild("bottom",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-8.0F, -2.0F, -17.5F, 16.0F, 2.0F, 20.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("inner",
				CubeListBuilder.create()
						.texOffs(0, 22).addBox(-8.0F, 36.6F, -16.0F, 14.0F, 2.0F, 18.0F)
				, PartPose.offset(1.0F, -39.5F, 7.5F));

		PartDefinition eyesDefinition = cartDefinition.addOrReplaceChild("eyes",
				CubeListBuilder.create()
				, PartPose.offset(6.0F, -0.5F, -10.5F));

		eyesDefinition.addOrReplaceChild("righteye",
				CubeListBuilder.create()
						.texOffs(0, 6).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F)
				, PartPose.offsetAndRotation(-10.0F, -11.0F, 1.0F,  0.0F, -0.2618F, 0.0F));

		eyesDefinition.addOrReplaceChild("lefteye",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F)
				, PartPose.offsetAndRotation(-1.5F, -11.0F, 1.0F,  0.0F, -2.8798F, 0.0F));

		PartDefinition leftFrontToesDefinition = cartDefinition.addOrReplaceChild("leftfronttoes",
				CubeListBuilder.create()
				, PartPose.offset(1.0F, 0.0F, 0.0F));

		leftFrontToesDefinition.addOrReplaceChild("toe3",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F)
				, PartPose.offsetAndRotation(-6.5F, -0.5F, -10.5F,  0.0F, -0.3054F, 0.0F));

		leftFrontToesDefinition.addOrReplaceChild("toe2",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.4698F, -0.5F, -1.171F, 2.0F, 1.0F, 2.0F)
				, PartPose.offsetAndRotation(-8.0F, -0.5F, -10.5F,  0.0F, 0.3491F, 0.0F));

		leftFrontToesDefinition.addOrReplaceChild("toe",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-10.5F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F).mirror()
				, PartPose.offset(0.0F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("leftlowerfrontleg",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-0.8968F, -2.9881F, -1.0325F, 2.0F, 5.0F, 2.0F)
				, PartPose.offsetAndRotation(-7.0F, -2.5F, -9.0F,  0.0F, -0.3054F, -0.2182F));

		PartDefinition rightfronttoesDefinition = cartDefinition.addOrReplaceChild("rightfronttoes",
				CubeListBuilder.create()
				, PartPose.offset(-1.5F, 0.0F, 1.5F));

		rightfronttoesDefinition.addOrReplaceChild("toe6",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F)
				, PartPose.offsetAndRotation(7.0F, -0.5F, -11.5F,  0.0F, 0.2618F, 0.0F));

		rightfronttoesDefinition.addOrReplaceChild("toe5",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F)
				, PartPose.offsetAndRotation(9.0F, -0.5F, -12.0F,  0.0F, -0.48F, 0.0F));

		rightfronttoesDefinition.addOrReplaceChild("toe4",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(8.5F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F)
				, PartPose.offset(1.0F, 0.0F, -1.0F));

		cartDefinition.addOrReplaceChild("rightlowerfrontleg",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F)
				, PartPose.offsetAndRotation(6.57F, -0.5781F, -8.9633F,  0.0F, -0.5236F, 0.1309F));

		PartDefinition rightbacktoesDefinition = cartDefinition.addOrReplaceChild("rightbacktoes",
				CubeListBuilder.create()
				, PartPose.offsetAndRotation(5.5F, 0.0F, -5.5F,  0.0F, -0.6545F, 0.0F));

		rightbacktoesDefinition.addOrReplaceChild("toe7",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F)
				, PartPose.offsetAndRotation(5.5F, -0.5F, 2.5F,  0.0F, 0.2618F, 0.0F));

		rightbacktoesDefinition.addOrReplaceChild("toe8",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F)
				, PartPose.offsetAndRotation(7.5F, -0.5F, 2.0F,  0.0F, -0.48F, 0.0F));

		rightbacktoesDefinition.addOrReplaceChild("toe9",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(8.5F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F)
				, PartPose.offset(-0.5F, 0.0F, 13.0F));

		PartDefinition leftbacktoesDefinition = cartDefinition.addOrReplaceChild("leftbacktoes",
				CubeListBuilder.create()
				, PartPose.offsetAndRotation(-5.5F, 0.0F, -5.5F,  0.0F, 0.6545F, 0.0F));

		leftbacktoesDefinition.addOrReplaceChild("toe10",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F).mirror()
				, PartPose.offsetAndRotation(-5.5F, -0.5F, 2.5F,  0.0F, -0.2618F, 0.0F));

		leftbacktoesDefinition.addOrReplaceChild("toe11",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F).mirror()
				, PartPose.offsetAndRotation(-7.5F, -0.5F, 2.0F,  0.0F, 0.48F, 0.0F));

		leftbacktoesDefinition.addOrReplaceChild("toe12",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-10.5F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F).mirror()
				, PartPose.offset(0.5F, 0.0F, 13.0F));

		cartDefinition.addOrReplaceChild("leftbackupperleg",
				CubeListBuilder.create()
						.texOffs(52, 0).addBox(1.0789F, -2.9144F, -11.0269F, 4.0F, 4.0F, 13.0F)
				, PartPose.offsetAndRotation(-9.5F, -4.5F, 10.5F,  -0.4363F, 0.4363F, 0.0F));

		cartDefinition.addOrReplaceChild("rightbackupperleg",
				CubeListBuilder.create()
						.texOffs(52, 0).addBox(-3.7805F, -3.5911F, -9.5756F, 4.0F, 4.0F, 13.0F).mirror()
				, PartPose.offsetAndRotation(9.5F, -4.5F, 8.0F,  -0.4363F, -0.4363F, 0.0F));

		cartDefinition.addOrReplaceChild("leftbacklowerleg",
				CubeListBuilder.create()
						.texOffs(88, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F)
				, PartPose.offsetAndRotation(-8.5F, -0.5F, 2.0F,  0.1309F, 0.5236F, -0.3054F));

		cartDefinition.addOrReplaceChild("rightbacklowerleg",
				CubeListBuilder.create()
						.texOffs(88, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F).mirror()
				, PartPose.offsetAndRotation(8.5F, -0.5F, 2.0F,  0.1309F, -0.5236F, 0.3054F));

		return LayerDefinition.create(meshdefinition,  96,  96 );
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