package com.mrbysco.skinnedcarts.client;

import com.mrbysco.skinnedcarts.Reference;
import com.mrbysco.skinnedcarts.client.render.RenderBeeCart;
import com.mrbysco.skinnedcarts.client.render.RenderElephantCart;
import com.mrbysco.skinnedcarts.client.render.RenderFrogCart;
import com.mrbysco.skinnedcarts.client.render.RenderGreenFrogCart;
import com.mrbysco.skinnedcarts.client.render.RenderLadybugCart;
import com.mrbysco.skinnedcarts.client.render.RenderPandaCart;
import com.mrbysco.skinnedcarts.client.render.RenderPelicanCart;
import com.mrbysco.skinnedcarts.client.render.RenderPenguinCart;
import com.mrbysco.skinnedcarts.client.render.RenderPufferFishCart;
import com.mrbysco.skinnedcarts.client.render.RenderSnailCart;
import com.mrbysco.skinnedcarts.client.render.RenderTurtleCart;
import com.mrbysco.skinnedcarts.client.render.RenderWombatCart;
import com.mrbysco.skinnedcarts.client.render.model.ModelBee;
import com.mrbysco.skinnedcarts.client.render.model.ModelElephant;
import com.mrbysco.skinnedcarts.client.render.model.ModelFrog;
import com.mrbysco.skinnedcarts.client.render.model.ModelGreenFrog;
import com.mrbysco.skinnedcarts.client.render.model.ModelLadybug;
import com.mrbysco.skinnedcarts.client.render.model.ModelPanda;
import com.mrbysco.skinnedcarts.client.render.model.ModelPelican;
import com.mrbysco.skinnedcarts.client.render.model.ModelPenguin;
import com.mrbysco.skinnedcarts.client.render.model.ModelPufferFish;
import com.mrbysco.skinnedcarts.client.render.model.ModelSnail;
import com.mrbysco.skinnedcarts.client.render.model.ModelTurtle;
import com.mrbysco.skinnedcarts.client.render.model.ModelWombat;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;

public class ClientHandler {
    public static final ModelLayerLocation ELEPHANT_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "elephant_cart"), "elephant_cart");
    public static final ModelLayerLocation FROG_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "frog_cart"), "frog_cart");
    public static final ModelLayerLocation PANDA_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "panda_cart"), "panda_cart");
    public static final ModelLayerLocation PELICAN_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "pelican_cart"), "pelican_cart");
    public static final ModelLayerLocation PUFFERFISH_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "pufferfish_cart"), "pufferfish_cart");
    public static final ModelLayerLocation SNAIL_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "snail_cart"), "snail_cart");
    public static final ModelLayerLocation TURTLE_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "turtle_cart"), "turtle_cart");
    public static final ModelLayerLocation BEE_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "bee_cart"), "bee_cart");
    public static final ModelLayerLocation GREEN_FROG_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "green_frog_cart"), "green_frog_cart");
    public static final ModelLayerLocation LADYBUG_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "ladybug_cart"), "ladybug_cart");
    public static final ModelLayerLocation PENGUIN_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "penguin_cart"), "penguin_cart");
    public static final ModelLayerLocation WOMBAT_CART = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "wombat_cart"), "wombat_cart");

    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(CartRegistry.BEE_CART.get(), RenderBeeCart::new);
        event.registerEntityRenderer(CartRegistry.ELEPHANT_CART.get(), RenderElephantCart::new);
        event.registerEntityRenderer(CartRegistry.FROG_CART.get(), RenderFrogCart::new);
        event.registerEntityRenderer(CartRegistry.GREEN_FROG_CART.get(), RenderGreenFrogCart::new);
        event.registerEntityRenderer(CartRegistry.LADYBUG_CART.get(), RenderLadybugCart::new);
        event.registerEntityRenderer(CartRegistry.PANDA_CART.get(), RenderPandaCart::new);
        event.registerEntityRenderer(CartRegistry.PELICAN_CART.get(), RenderPelicanCart::new);
        event.registerEntityRenderer(CartRegistry.PENGUIN_CART.get(), RenderPenguinCart::new);
        event.registerEntityRenderer(CartRegistry.PUFFERFISH_CART.get(), RenderPufferFishCart::new);
        event.registerEntityRenderer(CartRegistry.SNAIL_CART.get(), RenderSnailCart::new);
        event.registerEntityRenderer(CartRegistry.TURTLE_CART.get(), RenderTurtleCart::new);
        event.registerEntityRenderer(CartRegistry.WOMBAT_CART.get(), RenderWombatCart::new);
    }

    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BEE_CART, () -> ModelBee.createMesh());
        event.registerLayerDefinition(ELEPHANT_CART, () -> ModelBee.createMesh()); //ModelElephant.createMesh()
        event.registerLayerDefinition(FROG_CART, () -> ModelBee.createMesh()); //ModelFrog.createMesh()
        event.registerLayerDefinition(GREEN_FROG_CART, () -> ModelBee.createMesh()); //ModelGreenFrog.createMesh()
        event.registerLayerDefinition(LADYBUG_CART, () -> ModelBee.createMesh()); //ModelLadybug.createMesh()
        event.registerLayerDefinition(PANDA_CART, () -> ModelBee.createMesh()); //ModelPanda.createMesh()
        event.registerLayerDefinition(PELICAN_CART, () -> ModelBee.createMesh()); //ModelPelican.createMesh()
        event.registerLayerDefinition(PENGUIN_CART, () -> ModelBee.createMesh()); //ModelPenguin.createMesh()
        event.registerLayerDefinition(PUFFERFISH_CART, () -> ModelBee.createMesh()); //ModelPufferFish.createMesh()
        event.registerLayerDefinition(SNAIL_CART, () -> ModelBee.createMesh()); //ModelSnail.createMesh()
        event.registerLayerDefinition(TURTLE_CART, () -> ModelBee.createMesh()); //ModelTurtle.createMesh()
        event.registerLayerDefinition(WOMBAT_CART, () -> ModelBee.createMesh()); //ModelWombat.createMesh()
    }
}
