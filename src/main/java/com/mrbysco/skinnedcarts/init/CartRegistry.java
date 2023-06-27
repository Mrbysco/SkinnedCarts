package com.mrbysco.skinnedcarts.init;

import com.mrbysco.skinnedcarts.Reference;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart.Type;
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
import com.mrbysco.skinnedcarts.items.CustomCartItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class CartRegistry {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Reference.MOD_ID);
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reference.MOD_ID);

	public static final RegistryObject<Item> ELEPHANT_CART_ITEM = ITEMS.register("elephant_minecart", () -> new CustomCartItem(Type.ELEPHANT, itemBuilder()));
	public static final RegistryObject<Item> FROG_CART_ITEM = ITEMS.register("frog_minecart", () -> new CustomCartItem(Type.FROG, itemBuilder()));
	public static final RegistryObject<Item> PANDA_CART_ITEM = ITEMS.register("panda_minecart", () -> new CustomCartItem(Type.PANDA, itemBuilder()));
	public static final RegistryObject<Item> PELICAN_CART_ITEM = ITEMS.register("pelican_minecart", () -> new CustomCartItem(Type.PELICAN, itemBuilder()));
	public static final RegistryObject<Item> PUFFERFISH_CART_ITEM = ITEMS.register("pufferfish_minecart", () -> new CustomCartItem(Type.PUFFERFISH, itemBuilder()));
	public static final RegistryObject<Item> SNAIL_CART_ITEM = ITEMS.register("snail_minecart", () -> new CustomCartItem(Type.SNAIL, itemBuilder()));
	public static final RegistryObject<Item> TURTLE_CART_ITEM = ITEMS.register("turtle_minecart", () -> new CustomCartItem(Type.TURTLE, itemBuilder()));
	public static final RegistryObject<Item> BEE_CART_ITEM = ITEMS.register("bee_minecart", () -> new CustomCartItem(Type.BEE, itemBuilder()));
	public static final RegistryObject<Item> GREEN_FROG_CART_ITEM = ITEMS.register("green_frog_minecart", () -> new CustomCartItem(Type.GREEN_FROG, itemBuilder()));
	public static final RegistryObject<Item> LADYBUG_CART_ITEM = ITEMS.register("ladybug_minecart", () -> new CustomCartItem(Type.LADYBUG, itemBuilder()));
	public static final RegistryObject<Item> PENGUIN_CART_ITEM = ITEMS.register("penguin_minecart", () -> new CustomCartItem(Type.PENGUIN, itemBuilder()));
	public static final RegistryObject<Item> WOMBAT_CART_ITEM = ITEMS.register("wombat_minecart", () -> new CustomCartItem(Type.WOMBAT, itemBuilder()));

	public static final RegistryObject<CreativeModeTab> CART_TAB = CREATIVE_MODE_TABS.register("tab", () -> CreativeModeTab.builder()
			.icon(() -> new ItemStack(Items.MINECART))
			.withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
			.title(Component.translatable("itemGroup.skinnedcarts.tab"))
			.displayItems((features, output) -> {
				List<ItemStack> stacks = CartRegistry.ITEMS.getEntries().stream().map(reg -> new ItemStack(reg.get())).toList();
				output.acceptAll(stacks);
			}).build());

	public static final RegistryObject<SoundEvent> WEDNESDAY_FROG_CART = SOUND_EVENTS.register("minecart.wednesday.frog", () ->
			SoundEvent.createVariableRangeEvent(new ResourceLocation(Reference.MOD_ID, "minecart.wednesday.frog")));

	private static Item.Properties itemBuilder() {
		return new Item.Properties();
	}

	public static final RegistryObject<EntityType<ElephantCartEntity>> ELEPHANT_CART = ENTITY_TYPES.register("elephant_minecart", () -> register("elephant_minecart", EntityType.Builder.<ElephantCartEntity>of(ElephantCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(ElephantCartEntity::new)));
	public static final RegistryObject<EntityType<FrogCartEntity>> FROG_CART = ENTITY_TYPES.register("frog_minecart", () -> register("frog_minecart", EntityType.Builder.<FrogCartEntity>of(FrogCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(FrogCartEntity::new)));
	public static final RegistryObject<EntityType<PandaCartEntity>> PANDA_CART = ENTITY_TYPES.register("panda_minecart", () -> register("panda_minecart", EntityType.Builder.<PandaCartEntity>of(PandaCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(PandaCartEntity::new)));
	public static final RegistryObject<EntityType<PelicanCartEntity>> PELICAN_CART = ENTITY_TYPES.register("pelican_minecart", () -> register("pelican_minecart", EntityType.Builder.<PelicanCartEntity>of(PelicanCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(PelicanCartEntity::new)));
	public static final RegistryObject<EntityType<PufferFishCartEntity>> PUFFERFISH_CART = ENTITY_TYPES.register("pufferfish_minecart", () -> register("pufferfish_minecart", EntityType.Builder.<PufferFishCartEntity>of(PufferFishCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(PufferFishCartEntity::new)));
	public static final RegistryObject<EntityType<SnailCartEntity>> SNAIL_CART = ENTITY_TYPES.register("snail_minecart", () -> register("snail_minecart", EntityType.Builder.<SnailCartEntity>of(SnailCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(SnailCartEntity::new)));
	public static final RegistryObject<EntityType<TurtleCartEntity>> TURTLE_CART = ENTITY_TYPES.register("turtle_minecart", () -> register("turtle_minecart", EntityType.Builder.<TurtleCartEntity>of(TurtleCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(TurtleCartEntity::new)));
	public static final RegistryObject<EntityType<BeeCartEntity>> BEE_CART = ENTITY_TYPES.register("bee_minecart", () -> register("bee_minecart", EntityType.Builder.<BeeCartEntity>of(BeeCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(BeeCartEntity::new)));
	public static final RegistryObject<EntityType<GreenFrogCartEntity>> GREEN_FROG_CART = ENTITY_TYPES.register("green_frog_minecart", () -> register("green_frog_minecart", EntityType.Builder.<GreenFrogCartEntity>of(GreenFrogCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(GreenFrogCartEntity::new)));
	public static final RegistryObject<EntityType<LadybugCartEntity>> LADYBUG_CART = ENTITY_TYPES.register("ladybug_minecart", () -> register("ladybug_minecart", EntityType.Builder.<LadybugCartEntity>of(LadybugCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(LadybugCartEntity::new)));
	public static final RegistryObject<EntityType<PenguinCartEntity>> PENGUIN_CART = ENTITY_TYPES.register("penguin_minecart", () -> register("penguin_minecart", EntityType.Builder.<PenguinCartEntity>of(PenguinCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(PenguinCartEntity::new)));
	public static final RegistryObject<EntityType<WombatCartEntity>> WOMBAT_CART = ENTITY_TYPES.register("wombat_minecart", () -> register("wombat_minecart", EntityType.Builder.<WombatCartEntity>of(WombatCartEntity::new, MobCategory.MISC)
			.sized(0.98F, 0.7F).setCustomClientFactory(WombatCartEntity::new)));

	public static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
		return builder.build(id);
	}
}