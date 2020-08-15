package com.mrbysco.skinnedcarts.client;

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
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientHandler {
    public static void doClientStuff(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.ELEPHANT_CART.get(), renderManager -> new RenderElephantCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.FROG_CART.get(), renderManager -> new RenderFrogCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.PANDA_CART.get(), renderManager -> new RenderPandaCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.PELICAN_CART.get(), renderManager -> new RenderPelicanCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.PUFFERFISH_CART.get(), renderManager -> new RenderPufferFishCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.SNAIL_CART.get(), renderManager -> new RenderSnailCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.TURTLE_CART.get(), renderManager -> new RenderTurtleCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.BEE_CART.get(), renderManager -> new RenderBeeCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.GREEN_FROG_CART.get(), renderManager -> new RenderGreenFrogCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.LADYBUG_CART.get(), renderManager -> new RenderLadybugCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.PENGUIN_CART.get(), renderManager -> new RenderPenguinCart(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.WOMBAT_CART.get(), renderManager -> new RenderWombatCart(renderManager));
    }
}
