package com.mrbysco.skinnedcarts.client;

import com.mrbysco.skinnedcarts.client.render.RenderElephantCart;
import com.mrbysco.skinnedcarts.client.render.RenderFrogCart;
import com.mrbysco.skinnedcarts.client.render.RenderPandaCart;
import com.mrbysco.skinnedcarts.client.render.RenderPelicanCart;
import com.mrbysco.skinnedcarts.client.render.RenderPufferFishCart;
import com.mrbysco.skinnedcarts.client.render.RenderSnailCart;
import com.mrbysco.skinnedcarts.client.render.RenderTurtleCart;
import com.mrbysco.skinnedcarts.init.CartRegistry;
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
    }
}
