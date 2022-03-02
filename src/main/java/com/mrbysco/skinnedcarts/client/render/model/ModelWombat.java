package com.mrbysco.skinnedcarts.client.render.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class ModelWombat<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart root;
	private final ModelPart cart;

	public ModelWombat(final ModelPart part) {
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

		PartDefinition HeadDefinition = cartDefinition.addOrReplaceChild("Head",
				CubeListBuilder.create()
						.texOffs(0, 51).addBox(-4.5F, -6.375F, -7.125F, 9.0F, 7.0F, 4.0F)
				, PartPose.offsetAndRotation(0.0F, -2.125F, -6.375F, 0.0873F, 0.0F, 0.0F));

		HeadDefinition.addOrReplaceChild("nose",
				CubeListBuilder.create()
						.texOffs(0, 0).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F)
				, PartPose.offsetAndRotation(0.0F, -1.375F, -7.625F, 0.3054F, 0.0F, 0.0F));

		HeadDefinition.addOrReplaceChild("ear",
				CubeListBuilder.create()
						.texOffs(53, 5).addBox(0.1066F, -1.1132F, -0.6119F, 2.0F, 2.0F, 1.0F)
				, PartPose.offsetAndRotation(3.5F, -6.875F, -6.125F, 0.0436F, -1.2217F, 0.2182F));

		HeadDefinition.addOrReplaceChild("ear2",
				CubeListBuilder.create()
						.texOffs(54, 0).addBox(-1.1263F, -1.1082F, -0.9715F, 2.0F, 2.0F, 1.0F).mirror()
				, PartPose.offsetAndRotation(-3.5F, -6.875F, -5.125F, 0.0F, 1.309F, -0.2182F));

		PartDefinition backlegsDefinition = cartDefinition.addOrReplaceChild("backlegs",
				CubeListBuilder.create()
						.texOffs(61, 0).addBox(-2.8264F, -5.2622F, -3.6782F, 3.0F, 7.0F, 6.0F)
				, PartPose.offsetAndRotation(9.0F, -3.0F, 7.5F, 0.2618F, -0.1745F, 0.0F));

		backlegsDefinition.addOrReplaceChild("bone",
				CubeListBuilder.create()
						.texOffs(79, 0).addBox(-1.7757F, -1.0536F, -2.0695F, 3.0F, 1.0F, 4.0F).mirror()
				, PartPose.offsetAndRotation(-1.1946F, 1.8612F, -4.2109F, -0.1309F, 0.0F, 0.0F));

		PartDefinition backlegs2Definition = cartDefinition.addOrReplaceChild("backlegs2",
				CubeListBuilder.create()
						.texOffs(61, 0).addBox(-0.1736F, -5.7451F, -3.5487F, 3.0F, 7.0F, 6.0F).mirror()
				, PartPose.offsetAndRotation(-9.0F, -3.0F, 7.5F, 0.2618F, 0.1745F, 0.0F));

		backlegs2Definition.addOrReplaceChild("bone2",
				CubeListBuilder.create()
						.texOffs(79, 0).addBox(-0.9466F, -0.1244F, -2.9003F, 3.0F, 1.0F, 4.0F).mirror()
				, PartPose.offsetAndRotation(0.6876F, 1.0452F, -2.8926F, -0.1309F, -0.1309F, 0.0F));

		cartDefinition.addOrReplaceChild("frontleg",
				CubeListBuilder.create()
						.texOffs(11, 0).addBox(-0.8264F, 0.829F, -0.0302F, 2.0F, 5.0F, 2.0F)
				, PartPose.offsetAndRotation(-8.0F, -6.0F, -10.0F, -0.1745F, 0.1745F, 0.1309F));

		cartDefinition.addOrReplaceChild("frontleg2",
				CubeListBuilder.create()
						.texOffs(11, 0).addBox(-1.1736F, 0.829F, -0.0302F, 2.0F, 5.0F, 2.0F).mirror()
				, PartPose.offsetAndRotation(8.0F, -6.0F, -10.0F, -0.1745F, 0.1745F, 0.1309F));

		cartDefinition.addOrReplaceChild("frontshoulder",
				CubeListBuilder.create()
						.texOffs(80, 6).addBox(1.4976F, -3.4829F, -2.2171F, 2.0F, 4.0F, 5.0F)
				, PartPose.offsetAndRotation(5.0F, -4.5F, -7.5F, 0.3054F, 0.0436F, 0.0F));

		cartDefinition.addOrReplaceChild("frontshoulder2",
				CubeListBuilder.create()
						.texOffs(80, 6).addBox(-3.4976F, -3.4829F, -2.2171F, 2.0F, 4.0F, 5.0F).mirror()
				, PartPose.offsetAndRotation(-5.0F, -4.5F, -7.5F, 0.3054F, -0.0436F, 0.0F));

		cartDefinition.addOrReplaceChild("tail",
				CubeListBuilder.create()
						.texOffs(0, 9).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 2.0F)
				, PartPose.offsetAndRotation(0.0F, -1.5F, 10.0F, -1.6581F, 0.0873F, 0.0F));

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