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
import com.mrbysco.skinnedcarts.entity.BeeCartEntity;
import com.mrbysco.skinnedcarts.entity.ElephantCartEntity;
import com.mrbysco.skinnedcarts.entity.FrogCartEntity;
import com.mrbysco.skinnedcarts.entity.GreenFrogCartEntity;
import com.mrbysco.skinnedcarts.entity.LadybugCartEntity;
import com.mrbysco.skinnedcarts.entity.PandaCartEntity;
import com.mrbysco.skinnedcarts.entity.PelicanCartEntity;
import com.mrbysco.skinnedcarts.entity.PenguinCartEntity;
import com.mrbysco.skinnedcarts.entity.PufferFishCartEntity;
import com.mrbysco.skinnedcarts.entity.SnailCartEntity;
import com.mrbysco.skinnedcarts.entity.TurtleCartEntity;
import com.mrbysco.skinnedcarts.entity.WombatCartEntity;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientHandler {
    public static void registerRenders(ModelRegistryEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ElephantCartEntity.class, RenderElephantCart::new);
        RenderingRegistry.registerEntityRenderingHandler(FrogCartEntity.class, RenderFrogCart::new);
        RenderingRegistry.registerEntityRenderingHandler(PandaCartEntity.class, RenderPandaCart::new);
        RenderingRegistry.registerEntityRenderingHandler(PelicanCartEntity.class, RenderPelicanCart::new);
        RenderingRegistry.registerEntityRenderingHandler(PufferFishCartEntity.class, RenderPufferFishCart::new);
        RenderingRegistry.registerEntityRenderingHandler(SnailCartEntity.class, RenderSnailCart::new);
        RenderingRegistry.registerEntityRenderingHandler(TurtleCartEntity.class, RenderTurtleCart::new);
        RenderingRegistry.registerEntityRenderingHandler(BeeCartEntity.class, RenderBeeCart::new);
        RenderingRegistry.registerEntityRenderingHandler(GreenFrogCartEntity.class, RenderGreenFrogCart::new);
        RenderingRegistry.registerEntityRenderingHandler(LadybugCartEntity.class, RenderLadybugCart::new);
        RenderingRegistry.registerEntityRenderingHandler(PenguinCartEntity.class, RenderPenguinCart::new);
        RenderingRegistry.registerEntityRenderingHandler(WombatCartEntity.class, RenderWombatCart::new);
    }
}
