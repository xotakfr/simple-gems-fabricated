package fr.xotak.datagen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
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

        /*
        Sapphire tools
         */
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, 9).input(SapphireToolSet.SAPPHIRE_BLOCK_ITEM, 1)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_BLOCK_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_BLOCK_ITEM))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SapphireToolSet.SAPPHIRE_BLOCK_ITEM).input(SapphireToolSet.SAPPHIRE_ITEM, 9)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_BLOCK_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_BLOCK_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_SHOVEL)
                .pattern(" G ")
                .pattern(" S ")
                .pattern(" S ")
                .input('G', SapphireToolSet.SAPPHIRE_SHOVEL)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_PICKAXE)
                .pattern("GGG")
                .pattern(" S ")
                .pattern(" S ")
                .input('G', SapphireToolSet.SAPPHIRE_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_AXE)
                .pattern(" GG")
                .pattern(" SG")
                .pattern(" S ")
                .input('G', SapphireToolSet.SAPPHIRE_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SapphireToolSet.SAPPHIRE_HOE)
                .pattern(" GG")
                .pattern(" S ")
                .pattern(" S ")
                .input('G', SapphireToolSet.SAPPHIRE_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_SWORD)
                .pattern(" G ")
                .pattern(" G ")
                .pattern(" S ")
                .input('G', SapphireToolSet.SAPPHIRE_ITEM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        /*
        Sapphire armor
         */
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .input('S', SapphireToolSet.SAPPHIRE_ITEM)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', SapphireToolSet.SAPPHIRE_ITEM)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', SapphireToolSet.SAPPHIRE_ITEM)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SapphireToolSet.SAPPHIRE_BOOTS)
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .input('S', SapphireToolSet.SAPPHIRE_ITEM)
                .criterion(FabricRecipeProvider.hasItem(SapphireToolSet.SAPPHIRE_ITEM), FabricRecipeProvider.conditionsFromItem(SapphireToolSet.SAPPHIRE_ITEM))
                .offerTo(exporter);
        /*
        Sapphire smelting
         */
        RecipeProvider.offerSmelting(exporter, SMELTABLE_TO_SAPPHIRE, RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, 6, 300, "simple_gems");
        RecipeProvider.offerBlasting(exporter, SMELTABLE_TO_SAPPHIRE, RecipeCategory.MISC, SapphireToolSet.SAPPHIRE_ITEM, 6, 150, "simple_gems");

        /*
        Emerald tools
         */
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_SHOVEL)
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_PICKAXE)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_AXE)
                .pattern(" EE")
                .pattern(" SE")
                .pattern(" S ")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EmeraldToolSet.EMERALD_HOE)
                .pattern(" EE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_SWORD)
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        /*
        Amethyst armor
         */
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_HELMET)
                .pattern("EEE")
                .pattern("E E")
                .pattern("   ")
                .input('E', Items.EMERALD)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_CHESTPLATE)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', Items.EMERALD)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_LEGGINGS)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldToolSet.EMERALD_BOOTS)
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
    }
}