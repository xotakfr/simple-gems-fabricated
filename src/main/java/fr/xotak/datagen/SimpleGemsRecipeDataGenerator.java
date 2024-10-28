package fr.xotak.datagen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.List;

public class SimpleGemsRecipeDataGenerator extends FabricRecipeProvider {
    public SimpleGemsRecipeDataGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    private static final List<ItemConvertible> SMELTABLE_TO_RUBY = List.of(RubyToolSet.RUBY_ORE);
    private static final List<ItemConvertible> SMELTABLE_TO_SAPPHIRE = List.of(SapphireToolSet.SAPPHIRE_ORE);

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            public void generate() {
                RegistryEntryLookup<Item> registryLookup = registries.getOrThrow(RegistryKeys.ITEM);

                /*
                Ruby Tools
                 */
                /*
                ShapelessRecipeJsonBuilder.create(registryLookup, RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, 9).input(RubyToolSet.RUBY_BLOCK_ITEM, 1)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_BLOCK_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_BLOCK_ITEM))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(registryLookup, RecipeCategory.BUILDING_BLOCKS, RubyToolSet.RUBY_BLOCK_ITEM).input(RubyToolSet.RUBY_ITEM, 9)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_BLOCK_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_BLOCK_ITEM))
                        .offerTo(exporter);

                 */
                this.offerCompactingRecipe(RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, RubyToolSet.RUBY_BLOCK_ITEM, RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM));

                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, RubyToolSet.RUBY_SHOVEL)
                        .pattern(" R ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, RubyToolSet.RUBY_PICKAXE)
                        .pattern("RRR")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, RubyToolSet.RUBY_AXE)
                        .pattern(" RR")
                        .pattern(" SR")
                        .pattern(" S ")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, RubyToolSet.RUBY_HOE)
                        .pattern(" RR")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_SWORD)
                        .pattern(" R ")
                        .pattern(" R ")
                        .pattern(" S ")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                 /*
                Ruby armor
                */
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_HELMET)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("   ")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_CHESTPLATE)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_LEGGINGS)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("R R")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, RubyToolSet.RUBY_BOOTS)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("R R")
                        .input('R', RubyToolSet.RUBY_ITEM)
                        .criterion(RecipeGenerator.hasItem(RubyToolSet.RUBY_ITEM), this.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                        .offerTo(exporter);
                /*
                Ruby smelting
                 */
                this.offerSmelting(SMELTABLE_TO_RUBY, RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, 6, 300, "simple_gems");
                this.offerBlasting(SMELTABLE_TO_RUBY, RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, 6, 150, "simple_gems");

                /*
                Amethyst tools
                 */
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_SHOVEL)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('A', Items.AMETHYST_SHARD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_PICKAXE)
                        .pattern("AAA")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('A', Items.AMETHYST_SHARD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_AXE)
                        .pattern(" AA")
                        .pattern(" SA")
                        .pattern(" S ")
                        .input('A', Items.AMETHYST_SHARD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_HOE)
                        .pattern(" AA")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('A', Items.AMETHYST_SHARD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_SWORD)
                        .pattern(" A ")
                        .pattern(" A ")
                        .pattern(" S ")
                        .input('A', Items.AMETHYST_SHARD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);
                /*
                Amethyst armor
                 */
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_HELMET)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("   ")
                        .input('A', Items.AMETHYST_SHARD)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_CHESTPLATE)
                        .pattern("A A")
                        .pattern("AAA")
                        .pattern("AAA")
                        .input('A', Items.AMETHYST_SHARD)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_LEGGINGS)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("A A")
                        .input('A', Items.AMETHYST_SHARD)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_BOOTS)
                        .pattern("   ")
                        .pattern("A A")
                        .pattern("A A")
                        .input('A', Items.AMETHYST_SHARD)
                        .criterion(RecipeGenerator.hasItem(Items.AMETHYST_SHARD), this.conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                /*
                Sapphire tools
                 */
                this.offerCompactingRecipe(RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, SapphireToolSet.SAPPHIRE_BLOCK_ITEM, RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM));
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_SHOVEL)
                        .pattern(" G ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('G', SapphireToolSet.SAPPHIRE_SHOVEL)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_PICKAXE)
                        .pattern("GGG")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('G', SapphireToolSet.SAPPHIRE_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_AXE)
                        .pattern(" GG")
                        .pattern(" SG")
                        .pattern(" S ")
                        .input('G', SapphireToolSet.SAPPHIRE_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_HOE)
                        .pattern(" GG")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('G', SapphireToolSet.SAPPHIRE_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_SWORD)
                        .pattern(" G ")
                        .pattern(" G ")
                        .pattern(" S ")
                        .input('G', SapphireToolSet.SAPPHIRE_ITEM)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                /*
                Sapphire armor
                 */
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_HELMET)
                        .pattern("SSS")
                        .pattern("S S")
                        .pattern("   ")
                        .input('S', SapphireToolSet.SAPPHIRE_ITEM)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_CHESTPLATE)
                        .pattern("S S")
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', SapphireToolSet.SAPPHIRE_ITEM)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_LEGGINGS)
                        .pattern("SSS")
                        .pattern("S S")
                        .pattern("S S")
                        .input('S', SapphireToolSet.SAPPHIRE_ITEM)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_BOOTS)
                        .pattern("   ")
                        .pattern("S S")
                        .pattern("S S")
                        .input('S', SapphireToolSet.SAPPHIRE_ITEM)
                        .criterion(RecipeGenerator.hasItem(SapphireToolSet.SAPPHIRE_ITEM), this.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                        .offerTo(exporter);
                /*
                Sapphire smelting
                 */
                this.offerSmelting(SMELTABLE_TO_SAPPHIRE, RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, 6, 300, "simple_gems");
                this.offerBlasting(SMELTABLE_TO_SAPPHIRE, RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, 6, 150, "simple_gems");

                /*
                Emerald tools
                 */
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_SHOVEL)
                        .pattern(" E ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('E', Items.EMERALD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_PICKAXE)
                        .pattern("EEE")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('E', Items.EMERALD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_AXE)
                        .pattern(" EE")
                        .pattern(" SE")
                        .pattern(" S ")
                        .input('E', Items.EMERALD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_HOE)
                        .pattern(" EE")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('E', Items.EMERALD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_SWORD)
                        .pattern(" E ")
                        .pattern(" E ")
                        .pattern(" S ")
                        .input('E', Items.EMERALD)
                        .input('S', Items.STICK)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                /*
                Amethyst armor
                 */
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_HELMET)
                        .pattern("EEE")
                        .pattern("E E")
                        .pattern("   ")
                        .input('E', Items.EMERALD)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_CHESTPLATE)
                        .pattern("E E")
                        .pattern("EEE")
                        .pattern("EEE")
                        .input('E', Items.EMERALD)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_LEGGINGS)
                        .pattern("EEE")
                        .pattern("E E")
                        .pattern("E E")
                        .input('E', Items.EMERALD)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(registryLookup, RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_BOOTS)
                        .pattern("   ")
                        .pattern("E E")
                        .pattern("E E")
                        .input('E', Items.EMERALD)
                        .criterion(RecipeGenerator.hasItem(Items.EMERALD), this.conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
            }
        };
    }


    @Override
    public String getName() {
        return "";
    }
}
