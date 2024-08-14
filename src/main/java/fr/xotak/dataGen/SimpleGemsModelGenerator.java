package fr.xotak.dataGen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class SimpleGemsModelGenerator extends FabricModelProvider {
    public SimpleGemsModelGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(RubyToolSet.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(RubyToolSet.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(SapphireToolSet.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(SapphireToolSet.SAPPHIRE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Ruby
        itemModelGenerator.register(RubyToolSet.RUBY_ITEM, Models.GENERATED);
        itemModelGenerator.register(RubyToolSet.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(RubyToolSet.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(RubyToolSet.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(RubyToolSet.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(RubyToolSet.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RubyToolSet.RUBY_HELMET, Models.GENERATED);
        itemModelGenerator.register(RubyToolSet.RUBY_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(RubyToolSet.RUBY_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(RubyToolSet.RUBY_BOOTS, Models.GENERATED);

        // Amethyst
        itemModelGenerator.register(AmethystToolSet.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_HELMET, Models.GENERATED);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_BOOTS, Models.GENERATED);

        // Sapphire
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_ITEM, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_HELMET, Models.GENERATED);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_BOOTS, Models.GENERATED);

    }
}
