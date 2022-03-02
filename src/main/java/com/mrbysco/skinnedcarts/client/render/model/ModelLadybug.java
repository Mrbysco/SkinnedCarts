package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class ModelLadybug<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart root;
	private final ModelPart cart;

	public ModelLadybug(final ModelPart part) {
		this.root = part;
		this.cart = part.getChild("cart");
	}

	public static LayerDefinition createMesh() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partDefinition = meshdefinition.getRoot();

		PartDefinition cartDefinition = partDefinition.addOrReplaceChild("cart",
				CubeListBuilder.create()
				, PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		cartDefinition.addOrReplaceChild("back_wall",
				CubeListBuilder.create()
						.texOffs(52, 22).addBox(-16.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offset(8.0F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("front_wall",
				CubeListBuilder.create()
						.texOffs(52, 32).addBox(-16.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F)
				, PartPose.offset(8.0F, -6.0F, -9.0F));

		cartDefinition.addOrReplaceChild("right_wall",
				CubeListBuilder.create()
						.texOffs(34, 26).addBox(-9.0F, -4.0F, -8.0F, 2.0F, 8.0F, 16.0F)
				, PartPose.offset(1.0F, -6.0F, 0.0F));

		cartDefinition.addOrReplaceChild("left_wall",
				CubeListBuilder.create()
						.texOffs(0, 26).addBox(-9.0F, -4.0F, -8.0F, 2.0F, 8.0F, 16.0F)
				, PartPose.offset(15.0F, -6.0F, 0.0F));

		cartDefinition.addOrReplaceChild("bottom",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-16.0F, -2.0F, -10.0F, 16.0F, 2.0F, 20.0F)
				, PartPose.offset(8.0F, 0.0F, 0.0F));

		cartDefinition.addOrReplaceChild("inner",
				CubeListBuilder.create()
						.texOffs(0, 22).addBox(-15.0F, -2.9F, -9.0F, 14.0F, 2.0F, 18.0F)
				, PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition headDefinition = cartDefinition.addOrReplaceChild("head",
				CubeListBuilder.create()
						.texOffs(74, 0).addBox(-4.0F, -10.5F, -12.0F, 8.0F, 6.0F, 3.0F)
				, PartPose.offset(0.0F, 0.0F, 0.0F));

		headDefinition.addOrReplaceChild("antenna",
				CubeListBuilder.create()
						.texOffs(74, 10).addBox(0.0F, -4.0F, -0.5F, 0.0F, 5.0F, 1.0F)
				, PartPose.offsetAndRotation(-3.0F, -10.5F, -11.0F, 0.0F, -0.3054F, -0.3054F));

		headDefinition.addOrReplaceChild("antenna2",
				CubeListBuilder.create()
						.texOffs(74, 10).addBox(0.0F, -4.0F, -0.5F, 0.0F, 5.0F, 1.0F).mirror()
				, PartPose.offsetAndRotation(3.0F, -10.5F, -11.0F, 0.0F, 0.3054F, 0.3054F));

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