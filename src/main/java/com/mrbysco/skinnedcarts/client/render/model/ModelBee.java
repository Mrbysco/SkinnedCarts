package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class ModelBee<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart root;
	private final ModelPart cart;

	public ModelBee(final ModelPart part) {
		this.root = part;
		this.cart = part.getChild("cart");
	}

	public static LayerDefinition createMesh() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partDefinition = meshdefinition.getRoot();

		PartDefinition cartDefinition = partDefinition.addOrReplaceChild("cart",
				CubeListBuilder.create()
				, PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F,  0.0F, -1.5708F, 0.0F));

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

		cartDefinition.addOrReplaceChild("Head",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-2.0F, -3.5F, -1.0F, 4.0F, 6.0F, 2.0F)
				, PartPose.offset(6.5F, -5.0F, -10.0F));

		cartDefinition.addOrReplaceChild("Head2",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-2.0F, -3.5F, -1.0F, 4.0F, 6.0F, 2.0F).mirror()
				, PartPose.offset(-6.5F, -5.0F, -10.0F));

		PartDefinition Wings3Definition = cartDefinition.addOrReplaceChild("Wings3",
				CubeListBuilder.create()
						.texOffs(56, 52).addBox(-6.9627F, 0.8434F, -6.0F, 8.0F, 0.0F, 12.0F).mirror()
				, PartPose.offsetAndRotation(-8.0F, -8.5F, 0.0F,  0.0F, 0.0F, 0.5672F));

		Wings3Definition.addOrReplaceChild("Wings4",
				CubeListBuilder.create()
						.texOffs(56, 52).addBox(-7.7588F, 0.9659F, -6.0F, 8.0F, 0.0F, 12.0F).mirror()
				, PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F,  0.0F, 0.0F, -0.829F));

		PartDefinition WingsDefinition = cartDefinition.addOrReplaceChild("Wings",
				CubeListBuilder.create()
						.texOffs(56, 0).addBox(-1.0373F, 0.8434F, -6.0F, 8.0F, 0.0F, 12.0F)
				, PartPose.offsetAndRotation(8.0F, -8.5F, 0.0F,  0.0F, 0.0F, -0.5672F));

		WingsDefinition.addOrReplaceChild("Wings2",
				CubeListBuilder.create()
						.texOffs(56, 0).addBox(-0.2412F, 0.9659F, -6.0F, 8.0F, 0.0F, 12.0F)
				, PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F,  0.0F, 0.0F, 0.829F));

		cartDefinition.addOrReplaceChild("bone",
				CubeListBuilder.create()
						.texOffs(1, 9).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F)
				, PartPose.offsetAndRotation(0.0F, -7.0F, 9.5F,  0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition,  96,  96 );
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.cart.y = 4.0F - ageInTicks;
	}

	@Override
	public ModelPart root() {
		return this.root;
	}
}