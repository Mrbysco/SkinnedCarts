package com.mrbysco.skinnedcarts.init;

import com.mrbysco.skinnedcarts.SkinnedCarts;
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
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class CartRegistry {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SkinnedCarts.MOD_ID);
	public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(SkinnedCarts.MOD_ID);
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, SkinnedCarts.MOD_ID);
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkinnedCarts.MOD_ID);

	public static final DeferredItem<MinecartItem> ELEPHANT_CART_ITEM = ITEMS.registerItem("elephant_minecart", (properties) -> new MinecartItem(CartRegistry.ELEPHANT_CART.get(), properties));
	public static final DeferredItem<MinecartItem> FROG_CART_ITEM = ITEMS.registerItem("frog_minecart", (properties) -> new MinecartItem(CartRegistry.FROG_CART.get(), properties));
	public static final DeferredItem<MinecartItem> PANDA_CART_ITEM = ITEMS.registerItem("panda_minecart", (properties) -> new MinecartItem(CartRegistry.PANDA_CART.get(), properties));
	public static final DeferredItem<MinecartItem> PELICAN_CART_ITEM = ITEMS.registerItem("pelican_minecart", (properties) -> new MinecartItem(CartRegistry.PELICAN_CART.get(), properties));
	public static final DeferredItem<MinecartItem> PUFFERFISH_CART_ITEM = ITEMS.registerItem("pufferfish_minecart", (properties) -> new MinecartItem(CartRegistry.PUFFERFISH_CART.get(), properties));
	public static final DeferredItem<MinecartItem> SNAIL_CART_ITEM = ITEMS.registerItem("snail_minecart", (properties) -> new MinecartItem(CartRegistry.SNAIL_CART.get(), properties));
	public static final DeferredItem<MinecartItem> TURTLE_CART_ITEM = ITEMS.registerItem("turtle_minecart", (properties) -> new MinecartItem(CartRegistry.TURTLE_CART.get(), properties));
	public static final DeferredItem<MinecartItem> BEE_CART_ITEM = ITEMS.registerItem("bee_minecart", (properties) -> new MinecartItem(CartRegistry.BEE_CART.get(), properties));
	public static final DeferredItem<MinecartItem> GREEN_FROG_CART_ITEM = ITEMS.registerItem("green_frog_minecart", (properties) -> new MinecartItem(CartRegistry.GREEN_FROG_CART.get(), properties));
	public static final DeferredItem<MinecartItem> LADYBUG_CART_ITEM = ITEMS.registerItem("ladybug_minecart", (properties) -> new MinecartItem(CartRegistry.LADYBUG_CART.get(), properties));
	public static final DeferredItem<MinecartItem> PENGUIN_CART_ITEM = ITEMS.registerItem("penguin_minecart", (properties) -> new MinecartItem(CartRegistry.PENGUIN_CART.get(), properties));
	public static final DeferredItem<MinecartItem> WOMBAT_CART_ITEM = ITEMS.registerItem("wombat_minecart", (properties) -> new MinecartItem(CartRegistry.WOMBAT_CART.get(), properties));

	public static final Supplier<CreativeModeTab> CART_TAB = CREATIVE_MODE_TABS.register("tab", () -> CreativeModeTab.builder()
			.icon(() -> new ItemStack(Items.MINECART))
			.withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
			.title(Component.translatable("itemGroup.skinnedcarts.tab"))
			.displayItems((features, output) -> {
				List<ItemStack> stacks = CartRegistry.ITEMS.getEntries().stream().map(reg -> new ItemStack(reg.get())).toList();
				output.acceptAll(stacks);
			}).build());

	public static final DeferredHolder<SoundEvent, SoundEvent> WEDNESDAY_FROG_CART = SOUND_EVENTS.register("minecart.wednesday.frog", () ->
			SoundEvent.createVariableRangeEvent(SkinnedCarts.modLoc("minecart.wednesday.frog"))
	);

	public static final Supplier<EntityType<ElephantCartEntity>> ELEPHANT_CART = ENTITY_TYPES.registerEntityType("elephant_minecart",
			ElephantCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<FrogCartEntity>> FROG_CART = ENTITY_TYPES.registerEntityType("frog_minecart",
			FrogCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<PandaCartEntity>> PANDA_CART = ENTITY_TYPES.registerEntityType("panda_minecart",
			PandaCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<PelicanCartEntity>> PELICAN_CART = ENTITY_TYPES.registerEntityType("pelican_minecart",
			PelicanCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<PufferFishCartEntity>> PUFFERFISH_CART = ENTITY_TYPES.registerEntityType("pufferfish_minecart",
			PufferFishCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<SnailCartEntity>> SNAIL_CART = ENTITY_TYPES.registerEntityType("snail_minecart",
			SnailCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<TurtleCartEntity>> TURTLE_CART = ENTITY_TYPES.registerEntityType("turtle_minecart",
			TurtleCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<BeeCartEntity>> BEE_CART = ENTITY_TYPES.registerEntityType("bee_minecart",
			BeeCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<GreenFrogCartEntity>> GREEN_FROG_CART = ENTITY_TYPES.registerEntityType("green_frog_minecart",
			GreenFrogCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<LadybugCartEntity>> LADYBUG_CART = ENTITY_TYPES.registerEntityType("ladybug_minecart",
			LadybugCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<PenguinCartEntity>> PENGUIN_CART = ENTITY_TYPES.registerEntityType("penguin_minecart",
			PenguinCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
	public static final Supplier<EntityType<WombatCartEntity>> WOMBAT_CART = ENTITY_TYPES.registerEntityType("wombat_minecart",
			WombatCartEntity::new, MobCategory.MISC, builder -> builder
					.sized(0.98F, 0.7F).noLootTable().passengerAttachments(0.1875F).clientTrackingRange(8)
	);
}