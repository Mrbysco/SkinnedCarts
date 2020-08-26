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
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientHandler {
    public static void doClientStuff(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.ELEPHANT_CART.get(), RenderElephantCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.FROG_CART.get(), RenderFrogCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.PANDA_CART.get(), RenderPandaCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.PELICAN_CART.get(), RenderPelicanCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.PUFFERFISH_CART.get(), RenderPufferFishCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.SNAIL_CART.get(), RenderSnailCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.TURTLE_CART.get(), RenderTurtleCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.BEE_CART.get(), RenderBeeCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.GREEN_FROG_CART.get(), RenderGreenFrogCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.LADYBUG_CART.get(), RenderLadybugCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.PENGUIN_CART.get(), RenderPenguinCart::new);
        RenderingRegistry.registerEntityRenderingHandler(CartRegistry.WOMBAT_CART.get(), RenderWombatCart::new);
    }
}
