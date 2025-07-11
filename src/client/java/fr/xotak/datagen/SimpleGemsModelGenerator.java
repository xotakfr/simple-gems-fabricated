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
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_HELMET, GemsArmorMaterial.RUBY.assetId(), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_CHESTPLATE, GemsArmorMaterial.RUBY.assetId(), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_LEGGINGS, GemsArmorMaterial.RUBY.assetId(), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_BOOTS, GemsArmorMaterial.RUBY.assetId(), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        // Amethyst
        itemModelGenerator.register(AmethystToolSet.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_HELMET, GemsArmorMaterial.AMETHYST.assetId(), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_CHESTPLATE, GemsArmorMaterial.AMETHYST.assetId(), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_LEGGINGS, GemsArmorMaterial.AMETHYST.assetId(), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_BOOTS, GemsArmorMaterial.AMETHYST.assetId(), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        // Sapphire
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_ITEM, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_HELMET, GemsArmorMaterial.SAPPHIRE.assetId(), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_CHESTPLATE, GemsArmorMaterial.SAPPHIRE.assetId(), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_LEGGINGS, GemsArmorMaterial.SAPPHIRE.assetId(), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_BOOTS, GemsArmorMaterial.SAPPHIRE.assetId(), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        // Emerald
        itemModelGenerator.register(EmeraldToolSet.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_HELMET, GemsArmorMaterial.EMERALD.assetId(), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_CHESTPLATE, GemsArmorMaterial.EMERALD.assetId(), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_LEGGINGS, GemsArmorMaterial.EMERALD.assetId(), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_BOOTS, GemsArmorMaterial.EMERALD.assetId(), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

    }

    public static EquipmentModel buildHumanoid(String name) {
        return EquipmentModel.builder().addHumanoidLayers(Identifier.ofVanilla(name)).build();
    }
}
