package fr.xotak.dataGen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.ruby.RubyToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.List;

public class SimpleGemsRecipeDataGenerator extends FabricRecipeProvider {
    public SimpleGemsRecipeDataGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    private static final List<ItemConvertible> SMELTABLE_TO_RUBY = List.of(RubyToolSet.RUBY_ORE);

    @Override
    public void generate(RecipeExporter exporter) {
        /*
        Ruby tools
         */
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, 9).input(RubyToolSet.RUBY_BLOCK_ITEM, 1)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_BLOCK_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_BLOCK_ITEM))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, RubyToolSet.RUBY_BLOCK_ITEM).input(RubyToolSet.RUBY_ITEM, 9)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_BLOCK_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_BLOCK_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, RubyToolSet.RUBY_SHOVEL)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', RubyToolSet.RUBY_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, RubyToolSet.RUBY_PICKAXE)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', RubyToolSet.RUBY_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, RubyToolSet.RUBY_AXE)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('R', RubyToolSet.RUBY_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, RubyToolSet.RUBY_HOE)
                .pattern(" RR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', RubyToolSet.RUBY_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, RubyToolSet.RUBY_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('R', RubyToolSet.RUBY_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        /*
        Ruby armor
         */
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, RubyToolSet.RUBY_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .input('R', RubyToolSet.RUBY_ITEM)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, RubyToolSet.RUBY_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', RubyToolSet.RUBY_ITEM)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, RubyToolSet.RUBY_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', RubyToolSet.RUBY_ITEM)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, RubyToolSet.RUBY_BOOTS)
                .pattern("   ")
                .pattern("R R")
                .pattern("R R")
                .input('R', RubyToolSet.RUBY_ITEM)
                .criterion(FabricRecipeProvider.hasItem(RubyToolSet.RUBY_ITEM), FabricRecipeProvider.conditionsFromItem(RubyToolSet.RUBY_ITEM))
                .offerTo(exporter);
        /*
        Ruby smelting
         */
        RecipeProvider.offerSmelting(exporter, SMELTABLE_TO_RUBY, RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, 6, 300, "simple_gems");
        RecipeProvider.offerBlasting(exporter, SMELTABLE_TO_RUBY, RecipeCategory.MISC, RubyToolSet.RUBY_ITEM, 6, 150, "simple_gems");

        /*
        Amethyst tools
         */
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_SHOVEL)
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_PICKAXE)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_AXE)
                .pattern(" AA")
                .pattern(" SA")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AmethystToolSet.AMETHYST_HOE)
                .pattern(" AA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        /*
        Amethyst armor
         */
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AmethystToolSet.AMETHYST_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
    }
}
