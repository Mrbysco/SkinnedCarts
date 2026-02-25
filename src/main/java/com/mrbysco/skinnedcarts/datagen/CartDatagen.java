package com.mrbysco.skinnedcarts.datagen;

import com.mrbysco.skinnedcarts.SkinnedCarts;
import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@EventBusSubscriber
public class CartDatagen {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent.Client event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		generator.addProvider(true, new Recipes.Runner(packOutput, lookupProvider));

		generator.addProvider(true, new Language(packOutput));
		generator.addProvider(true, new SoundDefinitions(packOutput));
		generator.addProvider(true, new Models(packOutput));
	}

	private static class Recipes extends RecipeProvider {
		public Recipes(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
			super(provider, recipeOutput);
		}

		@Override
		protected void buildRecipes() {
			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.BEE_CART_ITEM.get())
					.pattern("YBY")
					.pattern("BMB")
					.pattern("YBY")
					.define('M', Items.MINECART)
					.define('B', Items.BLACK_WOOL)
					.define('Y', Items.YELLOW_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.ELEPHANT_CART_ITEM.get())
					.pattern("GGG")
					.pattern("GMG")
					.pattern("GGG")
					.define('M', Items.MINECART)
					.define('G', Items.GRAY_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.FROG_CART_ITEM.get())
					.pattern("GGG")
					.pattern("GMG")
					.pattern("GGG")
					.define('M', Items.MINECART)
					.define('G', Items.LIGHT_GRAY_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.GREEN_FROG_CART_ITEM.get())
					.pattern("GGG")
					.pattern("GMG")
					.pattern("WWW")
					.define('M', Items.MINECART)
					.define('G', Items.GREEN_WOOL)
					.define('W', Items.WHITE_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.LADYBUG_CART_ITEM.get())
					.pattern("RRR")
					.pattern("RMR")
					.pattern("BBB")
					.define('M', Items.MINECART)
					.define('R', Items.RED_WOOL)
					.define('B', Items.BLACK_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.PANDA_CART_ITEM.get())
					.pattern("BWB")
					.pattern("WMW")
					.pattern("BWB")
					.define('M', Items.MINECART)
					.define('B', Items.BLACK_WOOL)
					.define('W', Items.WHITE_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.PELICAN_CART_ITEM.get())
					.pattern("WWW")
					.pattern("YMW")
					.pattern("YYY")
					.define('M', Items.MINECART)
					.define('W', Items.WHITE_WOOL)
					.define('Y', Items.YELLOW_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.PENGUIN_CART_ITEM.get())
					.pattern("BBB")
					.pattern("YMY")
					.pattern("WWW")
					.define('M', Items.MINECART)
					.define('B', Items.BLACK_WOOL)
					.define('Y', Items.YELLOW_WOOL)
					.define('W', Items.WHITE_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.PUFFERFISH_CART_ITEM.get())
					.pattern("YWY")
					.pattern("WMW")
					.pattern("YWY")
					.define('M', Items.MINECART)
					.define('W', Items.WHITE_WOOL)
					.define('Y', Items.YELLOW_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.SNAIL_CART_ITEM.get())
					.pattern("BBB")
					.pattern("BMB")
					.pattern("GGG")
					.define('M', Items.MINECART)
					.define('B', Items.BROWN_WOOL)
					.define('G', Items.LIGHT_GRAY_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.TURTLE_CART_ITEM.get())
					.pattern("GGG")
					.pattern("GMG")
					.pattern("YYY")
					.define('M', Items.MINECART)
					.define('G', Items.GREEN_WOOL)
					.define('Y', Items.YELLOW_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);

			shaped(RecipeCategory.TRANSPORTATION, CartRegistry.WOMBAT_CART_ITEM.get())
					.pattern("BBB")
					.pattern("BMB")
					.pattern("BBB")
					.define('M', Items.MINECART)
					.define('B', Items.BROWN_WOOL)
					.unlockedBy("has_minecart", has(Items.MINECART))
					.save(output);
		}

		public static class Runner extends RecipeProvider.Runner {
			public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
				super(output, completableFuture);
			}

			@Override
			protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
				return new Recipes(provider, recipeOutput);
			}

			@Override
			public String getName() {
				return "Skinned Carts Recipes";
			}
		}
	}

	private static class Language extends LanguageProvider {
		public Language(PackOutput packOutput) {
			super(packOutput, SkinnedCarts.MOD_ID, "en_us");
		}

		@Override
		protected void addTranslations() {
			this.add("itemGroup.skinnedcarts.tab", "Skinned Carts");

			this.add("skinnedcarts.config.title", "Skinned Carts config");

			this.addItem(CartRegistry.ELEPHANT_CART_ITEM, "Elephant Minecart");
			this.addItem(CartRegistry.FROG_CART_ITEM, "Frog Minecart");
			this.addItem(CartRegistry.PANDA_CART_ITEM, "Panda Minecart");
			this.addItem(CartRegistry.PELICAN_CART_ITEM, "Pelican Minecart");
			this.addItem(CartRegistry.PUFFERFISH_CART_ITEM, "Pufferfish Minecart");
			this.addItem(CartRegistry.SNAIL_CART_ITEM, "Snail Minecart");
			this.addItem(CartRegistry.TURTLE_CART_ITEM, "Turtle Minecart");
			this.addItem(CartRegistry.BEE_CART_ITEM, "Bee Minecart");
			this.addItem(CartRegistry.GREEN_FROG_CART_ITEM, "Green Frog Minecart");
			this.addItem(CartRegistry.LADYBUG_CART_ITEM, "Ladybug Minecart");
			this.addItem(CartRegistry.PENGUIN_CART_ITEM, "Penguin Minecart");
			this.addItem(CartRegistry.WOMBAT_CART_ITEM, "Wombat Minecart");

			this.addEntityType(CartRegistry.ELEPHANT_CART, "Elephant Minecart");
			this.addEntityType(CartRegistry.FROG_CART, "Frog Minecart");
			this.addEntityType(CartRegistry.PANDA_CART, "Panda Minecart");
			this.addEntityType(CartRegistry.PELICAN_CART, "Pelican Minecart");
			this.addEntityType(CartRegistry.PUFFERFISH_CART, "Pufferfish Minecart");
			this.addEntityType(CartRegistry.SNAIL_CART, "Snail Minecart");
			this.addEntityType(CartRegistry.TURTLE_CART, "Turtle Minecart");
			this.addEntityType(CartRegistry.BEE_CART, "Bee Minecart");
			this.addEntityType(CartRegistry.GREEN_FROG_CART, "Green Frog Minecart");
			this.addEntityType(CartRegistry.LADYBUG_CART, "Ladybug Minecart");
			this.addEntityType(CartRegistry.PENGUIN_CART, "Penguin Minecart");
			this.addEntityType(CartRegistry.WOMBAT_CART, "Wombat Minecart");

			addSubtitle(CartRegistry.WEDNESDAY_FROG_CART, "It's wednesday");

			addConfig("title", "Skinned Carts Config", null);
			addConfig("general", "General", "General Settings");
			addConfig("wednesdayFrogCart", "Wednesday Frog Cart", "Setting this to true occasionally makes the frog carts acknowledge the day (Default: false)");
		}

		public void addSubtitle(Supplier<SoundEvent> sound, String name) {
			this.addSubtitle(sound.get(), name);
		}

		public void addSubtitle(SoundEvent sound, String name) {
			String path = SkinnedCarts.MOD_ID + ".subtitle." + sound.location().getPath();
			this.add(path, name);
		}

		/**
		 * Add the translation for a config entry
		 *
		 * @param path        The path of the config entry
		 * @param name        The name of the config entry
		 * @param description The description of the config entry (optional in case of targeting "title" or similar entries that have no tooltip)
		 */
		private void addConfig(String path, String name, @Nullable String description) {
			this.add("skinnedcarts.configuration." + path, name);
			if (description != null && !description.isEmpty())
				this.add("skinnedcarts.configuration." + path + ".tooltip", description);
		}
	}

	private static class SoundDefinitions extends SoundDefinitionsProvider {
		public SoundDefinitions(PackOutput packOutput) {
			super(packOutput, SkinnedCarts.MOD_ID);
		}

		@Override
		public void registerSounds() {
			this.add(CartRegistry.WEDNESDAY_FROG_CART, definition()
					.subtitle(modSubtitle(CartRegistry.WEDNESDAY_FROG_CART.getId()))
					.with(sound(SkinnedCarts.modLoc("wednesday"))));
		}

		public String modSubtitle(Identifier id) {
			return SkinnedCarts.MOD_ID + ".subtitle." + id.getPath();
		}
	}

	private static class Models extends ModelProvider {
		public Models(PackOutput packOutput) {
			super(packOutput, SkinnedCarts.MOD_ID);
		}

		@Override
		protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
			CartRegistry.ITEMS.getEntries()
					.forEach(holder -> {
						itemModels.generateFlatItem(holder.get(), ModelTemplates.FLAT_ITEM);
					});
		}
	}
}
