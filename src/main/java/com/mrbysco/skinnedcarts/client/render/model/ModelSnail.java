package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class ModelSnail<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart root;
	private final ModelPart cart;

	public ModelSnail(final ModelPart part) {
		this.root = part;
		this.cart = part.getChild("cart");
	}

	public static LayerDefinition createMesh() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partDefinition = meshdefinition.getRoot();

		PartDefinition cartDefinition = partDefinition.addOrReplaceChild("cart",
				CubeListBuilder.create()
				, PartPose.offsetAndRotation(8.0F, 24.0F, 0.0F,  0.0F, -1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("back_wall",
				CubeListBuilder.create()
						.texOffs(0, 52).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("front_wall",
				CubeListBuilder.create()
						.texOffs(46, 22).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F,  0.0F, 3.1416F, 0.0F));

		cartDefinition.addOrReplaceChild("right_wall",
				CubeListBuilder.create()
						.texOffs(36, 42).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offsetAndRotation(-7.0F, -6.0F, 8.0F,  0.0F, -1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("left_wall",
				CubeListBuilder.create()
						.texOffs(0, 42).addBox(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offsetAndRotation(7.0F, -6.0F, 8.0F,  0.0F, 1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("bottom",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-8.0F, -2.0F, -10.0F, 16.0F, 2.0F, 20.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("inner",
				CubeListBuilder.create()
						.texOffs(0, 22).addBox(-7.0F, -2.9F, -9.0F, 14.0F, 2.0F, 18.0F)
				, PartPose.offset(0.0F, 0.0F, 8.0F));

		cartDefinition.addOrReplaceChild("head",
				CubeListBuilder.create()
						.texOffs(0, 62).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 12.0F, 5.0F)
				, PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F,  0.1745F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("left_eye",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-1.0F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F)
				, PartPose.offsetAndRotation(-1.5F, -12.0F, -4.0F,  -0.3491F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("right_eye",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(0.0F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F).mirror()
				, PartPose.offsetAndRotation(1.5F, -12.0F, -4.0F,  -0.3491F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("foot",
				CubeListBuilder.create()
						.texOffs(36, 52).addBox(-4.0F, -3.0F, 18.0F, 8.0F, 3.0F, 4.0F)
				, PartPose.offset(0.0F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("right_antennae",
				CubeListBuilder.create()
						.texOffs(4, 0).addBox(-0.4325F, 0.366F, -2.9883F, 1.0F, 2.0F, 1.0F)
				, PartPose.offsetAndRotation(2.5F, -8.0F, -5.0F,  -0.9599F, -0.1745F, -0.0873F));

		cartDefinition.addOrReplaceChild("left_antennae",
				CubeListBuilder.create()
						.texOffs(4, 0).addBox(-0.5675F, 0.366F, -2.9883F, 1.0F, 2.0F, 1.0F).mirror()
				, PartPose.offsetAndRotation(-2.5F, -8.0F, -5.0F,  -0.9599F, 0.1745F, 0.0873F));

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