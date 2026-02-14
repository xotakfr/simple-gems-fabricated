package fr.xotak.datagen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SimpleGemsRecipeDataGenerator extends FabricRecipeProvider {
    public SimpleGemsRecipeDataGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    private static final List<ItemLike> SMELTABLE_TO_RUBY = List.of(RubyToolSet.RUBY_ORE);
    private static final List<ItemLike> SMELTABLE_TO_SAPPHIRE = List.of(SapphireToolSet.SAPPHIRE_ORE);

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider registries, @NonNull RecipeOutput exporter) {
        return new RecipeProvider(registries, exporter) {
            @Override
            public void buildRecipes() {
                HolderGetter<Item> registryLookup = registries.lookupOrThrow(Registries.ITEM);

                /*
                Ruby Tools
                 */
                this.nineBlockStorageRecipes(RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, RecipeCategory.MISC, RubyToolSet.RUBY_BLOCK_ITEM);

                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, RubyToolSet.RUBY_SHOVEL)
                        .pattern(" R ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, RubyToolSet.RUBY_PICKAXE)
                        .pattern("RRR")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, RubyToolSet.RUBY_AXE)
                        .pattern(" RR")
                        .pattern(" SR")
                        .pattern(" S ")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, RubyToolSet.RUBY_HOE)
                        .pattern(" RR")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_SWORD)
                        .pattern(" R ")
                        .pattern(" R ")
                        .pattern(" S ")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                 /*
                Ruby armor
                */
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_HELMET)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("   ")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_CHESTPLATE)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_LEGGINGS)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_BOOTS)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', RubyToolSet.RUBY_ITEM)
                        .unlockedBy(RecipeProvider.getHasName(RubyToolSet.RUBY_ITEM), this.has(RubyToolSet.RUBY_ITEM))
                        .save(output);
                /*
                Ruby smelting
                 */
                this.oreSmelting(SMELTABLE_TO_RUBY, RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, 6, 300, "simple_gems");
                this.oreBlasting(SMELTABLE_TO_RUBY, RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, 6, 150, "simple_gems");

                /*
                Amethyst tools
                 */
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_SHOVEL)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('A', Items.AMETHYST_SHARD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_PICKAXE)
                        .pattern("AAA")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('A', Items.AMETHYST_SHARD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_AXE)
                        .pattern(" AA")
                        .pattern(" SA")
                        .pattern(" S ")
                        .define('A', Items.AMETHYST_SHARD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_HOE)
                        .pattern(" AA")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('A', Items.AMETHYST_SHARD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_SWORD)
                        .pattern(" A ")
                        .pattern(" A ")
                        .pattern(" S ")
                        .define('A', Items.AMETHYST_SHARD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);
                /*
                Amethyst armor
                 */
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_HELMET)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("   ")
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_CHESTPLATE)
                        .pattern("A A")
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_LEGGINGS)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("A A")
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_BOOTS)
                        .pattern("   ")
                        .pattern("A A")
                        .pattern("A A")
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(RecipeProvider.getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                        .save(output);

                /*
                Sapphire tools
                 */
                this.nineBlockStorageRecipes(RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_BLOCK_ITEM);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_SHOVEL)
                        .pattern(" G ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('G', SapphireToolSet.SAPPHIRE_SHOVEL)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_PICKAXE)
                        .pattern("GGG")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('G', SapphireToolSet.SAPPHIRE_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_AXE)
                        .pattern(" GG")
                        .pattern(" SG")
                        .pattern(" S ")
                        .define('G', SapphireToolSet.SAPPHIRE_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_HOE)
                        .pattern(" GG")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('G', SapphireToolSet.SAPPHIRE_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_SWORD)
                        .pattern(" G ")
                        .pattern(" G ")
                        .pattern(" S ")
                        .define('G', SapphireToolSet.SAPPHIRE_ITEM)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                /*
                Sapphire armor
                 */
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_HELMET)
                        .pattern("SSS")
                        .pattern("S S")
                        .pattern("   ")
                        .define('S', SapphireToolSet.SAPPHIRE_ITEM)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_CHESTPLATE)
                        .pattern("S S")
                        .pattern("SSS")
                        .pattern("SSS")
                        .define('S', SapphireToolSet.SAPPHIRE_ITEM)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_LEGGINGS)
                        .pattern("SSS")
                        .pattern("S S")
                        .pattern("S S")
                        .define('S', SapphireToolSet.SAPPHIRE_ITEM)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_BOOTS)
                        .pattern("   ")
                        .pattern("S S")
                        .pattern("S S")
                        .define('S', SapphireToolSet.SAPPHIRE_ITEM)
                        .unlockedBy(RecipeProvider.getHasName(SapphireToolSet.SAPPHIRE_ITEM), this.has(SapphireToolSet.SAPPHIRE_ITEM))
                        .save(output);
                /*
                Sapphire smelting
                 */
                this.oreSmelting(SMELTABLE_TO_SAPPHIRE, RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, 6, 300, "simple_gems");
                this.oreBlasting(SMELTABLE_TO_SAPPHIRE, RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, 6, 150, "simple_gems");

                /*
                Emerald tools
                 */
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_SHOVEL)
                        .pattern(" E ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_PICKAXE)
                        .pattern("EEE")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_AXE)
                        .pattern(" EE")
                        .pattern(" SE")
                        .pattern(" S ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_HOE)
                        .pattern(" EE")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_SWORD)
                        .pattern(" E ")
                        .pattern(" E ")
                        .pattern(" S ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
                /*
                Amethyst armor
                 */
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_HELMET)
                        .pattern("EEE")
                        .pattern("E E")
                        .pattern("   ")
                        .define('E', Items.EMERALD)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_CHESTPLATE)
                        .pattern("E E")
                        .pattern("EEE")
                        .pattern("EEE")
                        .define('E', Items.EMERALD)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_LEGGINGS)
                        .pattern("EEE")
                        .pattern("E E")
                        .pattern("E E")
                        .define('E', Items.EMERALD)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
                ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_BOOTS)
                        .pattern("   ")
                        .pattern("E E")
                        .pattern("E E")
                        .define('E', Items.EMERALD)
                        .unlockedBy(RecipeProvider.getHasName(Items.EMERALD), this.has(Items.EMERALD))
                        .save(output);
            }
        };
    }


    @Override
    public String getName() {
        return "";
    }
}
