package fr.xotak.datagen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.render.entity.equipment.EquipmentModel;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

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
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_HELMET, GemsArmorMaterial.RUBY.assetId(), "helmet", false);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_CHESTPLATE, GemsArmorMaterial.RUBY.assetId(), "chestplate", false);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_LEGGINGS, GemsArmorMaterial.RUBY.assetId(), "leggings", false);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_BOOTS, GemsArmorMaterial.RUBY.assetId(), "boots", false);

        // Amethyst
        itemModelGenerator.register(AmethystToolSet.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_HELMET, GemsArmorMaterial.AMETHYST.assetId(), "helmet", false);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_CHESTPLATE, GemsArmorMaterial.AMETHYST.assetId(), "chestplate", false);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_LEGGINGS, GemsArmorMaterial.AMETHYST.assetId(), "leggings", false);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_BOOTS, GemsArmorMaterial.AMETHYST.assetId(), "boots", false);

        // Sapphire
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_ITEM, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_HELMET, GemsArmorMaterial.SAPPHIRE.assetId(), "helmet", false);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_CHESTPLATE, GemsArmorMaterial.SAPPHIRE.assetId(), "chestplate", false);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_LEGGINGS, GemsArmorMaterial.SAPPHIRE.assetId(), "leggings", false);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_BOOTS, GemsArmorMaterial.SAPPHIRE.assetId(), "boots", false);

        // Emerald
        itemModelGenerator.register(EmeraldToolSet.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_HELMET, GemsArmorMaterial.EMERALD.assetId(), "helmet", false);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_CHESTPLATE, GemsArmorMaterial.EMERALD.assetId(), "chestplate", false);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_LEGGINGS, GemsArmorMaterial.EMERALD.assetId(), "leggings", false);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_BOOTS, GemsArmorMaterial.EMERALD.assetId(), "boots", false);

    }

    public static EquipmentModel buildHumanoid(String name) {
        return EquipmentModel.builder().addHumanoidLayers(Identifier.ofVanilla(name)).build();
    }
}
