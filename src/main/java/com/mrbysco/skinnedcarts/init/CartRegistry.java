package com.mrbysco.skinnedcarts.init;

import com.mrbysco.skinnedcarts.Reference;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart.Type;
import com.mrbysco.skinnedcarts.entity.ElephantCartEntity;
import com.mrbysco.skinnedcarts.entity.FrogCartEntity;
import com.mrbysco.skinnedcarts.entity.PandaCartEntity;
import com.mrbysco.skinnedcarts.entity.PelicanCartEntity;
import com.mrbysco.skinnedcarts.entity.PufferFishCartEntity;
import com.mrbysco.skinnedcarts.entity.SnailCartEntity;
import com.mrbysco.skinnedcarts.entity.TurtleCartEntity;
import com.mrbysco.skinnedcarts.items.CustomCartItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CartRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Reference.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final RegistryObject<Item> ELEPHANT_CART_ITEM = ITEMS.register("elephant_minecart", () -> new CustomCartItem(Type.ELEPHANT, itemBuilder()));
    public static final RegistryObject<Item> FROG_CART_ITEM = ITEMS.register("frog_minecart", () -> new CustomCartItem(Type.FROG, itemBuilder()));
    public static final RegistryObject<Item> PANDA_CART_ITEM = ITEMS.register("panda_minecart", () -> new CustomCartItem(Type.PANDA, itemBuilder()));
    public static final RegistryObject<Item> PELICAN_CART_ITEM = ITEMS.register("pelican_minecart", () -> new CustomCartItem(Type.PELICAN, itemBuilder()));
    public static final RegistryObject<Item> PUFFERFISH_CART_ITEM = ITEMS.register("pufferfish_minecart", () -> new CustomCartItem(Type.PUFFERFISH, itemBuilder()));
    public static final RegistryObject<Item> SNAIL_CART_ITEM = ITEMS.register("snail_minecart", () -> new CustomCartItem(Type.SNAIL, itemBuilder()));
    public static final RegistryObject<Item> TURTLE_CART_ITEM = ITEMS.register("turtle_minecart", () -> new CustomCartItem(Type.TURTLE, itemBuilder()));

    public static final RegistryObject<SoundEvent> WEDNESDAY_FROG_CART = SOUND_EVENTS.register("minecart.wednesday.frog", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "minecart.wednesday.frog")));


    private static Item.Properties itemBuilder() { return new Item.Properties(); }

    public static final RegistryObject<EntityType<ElephantCartEntity>> ELEPHANT_CART = ENTITIES.register("elephant_minecart", () -> register("elephant_minecart", EntityType.Builder.<ElephantCartEntity>create(ElephantCartEntity::new, EntityClassification.MISC)
            .size(0.98F, 0.7F).setCustomClientFactory(ElephantCartEntity::new)));
    public static final RegistryObject<EntityType<FrogCartEntity>> FROG_CART = ENTITIES.register("frog_minecart", () -> register("frog_minecart", EntityType.Builder.<FrogCartEntity>create(FrogCartEntity::new, EntityClassification.MISC)
            .size(0.98F, 0.7F).setCustomClientFactory(FrogCartEntity::new)));
    public static final RegistryObject<EntityType<PandaCartEntity>> PANDA_CART = ENTITIES.register("panda_minecart", () -> register("panda_minecart", EntityType.Builder.<PandaCartEntity>create(PandaCartEntity::new, EntityClassification.MISC)
            .size(0.98F, 0.7F).setCustomClientFactory(PandaCartEntity::new)));
    public static final RegistryObject<EntityType<PelicanCartEntity>> PELICAN_CART = ENTITIES.register("pelican_minecart", () -> register("pelican_minecart", EntityType.Builder.<PelicanCartEntity>create(PelicanCartEntity::new, EntityClassification.MISC)
            .size(0.98F, 0.7F).setCustomClientFactory(PelicanCartEntity::new)));
    public static final RegistryObject<EntityType<PufferFishCartEntity>> PUFFERFISH_CART = ENTITIES.register("pufferfish_minecart", () -> register("pufferfish_minecart", EntityType.Builder.<PufferFishCartEntity>create(PufferFishCartEntity::new, EntityClassification.MISC)
            .size(0.98F, 0.7F).setCustomClientFactory(PufferFishCartEntity::new)));
    public static final RegistryObject<EntityType<SnailCartEntity>> SNAIL_CART = ENTITIES.register("snail_minecart", () -> register("snail_minecart", EntityType.Builder.<SnailCartEntity>create(SnailCartEntity::new, EntityClassification.MISC)
            .size(0.98F, 0.7F).setCustomClientFactory(SnailCartEntity::new)));
    public static final RegistryObject<EntityType<TurtleCartEntity>> TURTLE_CART = ENTITIES.register("turtle_minecart", () -> register("turtle_minecart", EntityType.Builder.<TurtleCartEntity>create(TurtleCartEntity::new, EntityClassification.MISC)
            .size(0.98F, 0.7F).setCustomClientFactory(TurtleCartEntity::new)));

    public static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
        return builder.build(id);
    }
}