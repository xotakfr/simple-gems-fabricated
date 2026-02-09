package fr.xotak.datagen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import java.util.concurrent.CompletableFuture;

public class SimpleGemsModelGenerator extends FabricModelProvider {
    public SimpleGemsModelGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createTrivialCube(RubyToolSet.RUBY_ORE);
        blockStateModelGenerator.createTrivialCube(RubyToolSet.RUBY_BLOCK);
        blockStateModelGenerator.createTrivialCube(SapphireToolSet.SAPPHIRE_ORE);
        blockStateModelGenerator.createTrivialCube(SapphireToolSet.SAPPHIRE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        // Ruby
        itemModelGenerator.generateFlatItem(RubyToolSet.RUBY_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(RubyToolSet.RUBY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(RubyToolSet.RUBY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(RubyToolSet.RUBY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(RubyToolSet.RUBY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(RubyToolSet.RUBY_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateTrimmableItem(RubyToolSet.RUBY_HELMET, GemsArmorMaterial.RUBY.assetId(), ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(RubyToolSet.RUBY_CHESTPLATE, GemsArmorMaterial.RUBY.assetId(), ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(RubyToolSet.RUBY_LEGGINGS, GemsArmorMaterial.RUBY.assetId(), ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(RubyToolSet.RUBY_BOOTS, GemsArmorMaterial.RUBY.assetId(), ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        // Amethyst
        itemModelGenerator.generateFlatItem(AmethystToolSet.AMETHYST_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(AmethystToolSet.AMETHYST_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(AmethystToolSet.AMETHYST_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(AmethystToolSet.AMETHYST_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(AmethystToolSet.AMETHYST_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateTrimmableItem(AmethystToolSet.AMETHYST_HELMET, GemsArmorMaterial.AMETHYST.assetId(), ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(AmethystToolSet.AMETHYST_CHESTPLATE, GemsArmorMaterial.AMETHYST.assetId(), ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(AmethystToolSet.AMETHYST_LEGGINGS, GemsArmorMaterial.AMETHYST.assetId(), ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(AmethystToolSet.AMETHYST_BOOTS, GemsArmorMaterial.AMETHYST.assetId(), ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        // Sapphire
        itemModelGenerator.generateFlatItem(SapphireToolSet.SAPPHIRE_ITEM, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(SapphireToolSet.SAPPHIRE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(SapphireToolSet.SAPPHIRE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(SapphireToolSet.SAPPHIRE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(SapphireToolSet.SAPPHIRE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(SapphireToolSet.SAPPHIRE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateTrimmableItem(SapphireToolSet.SAPPHIRE_HELMET, GemsArmorMaterial.SAPPHIRE.assetId(), ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(SapphireToolSet.SAPPHIRE_CHESTPLATE, GemsArmorMaterial.SAPPHIRE.assetId(), ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(SapphireToolSet.SAPPHIRE_LEGGINGS, GemsArmorMaterial.SAPPHIRE.assetId(), ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(SapphireToolSet.SAPPHIRE_BOOTS, GemsArmorMaterial.SAPPHIRE.assetId(), ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        // Emerald
        itemModelGenerator.generateFlatItem(EmeraldToolSet.EMERALD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(EmeraldToolSet.EMERALD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(EmeraldToolSet.EMERALD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(EmeraldToolSet.EMERALD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(EmeraldToolSet.EMERALD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateTrimmableItem(EmeraldToolSet.EMERALD_HELMET, GemsArmorMaterial.EMERALD.assetId(), ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(EmeraldToolSet.EMERALD_CHESTPLATE, GemsArmorMaterial.EMERALD.assetId(), ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(EmeraldToolSet.EMERALD_LEGGINGS, GemsArmorMaterial.EMERALD.assetId(), ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(EmeraldToolSet.EMERALD_BOOTS, GemsArmorMaterial.EMERALD.assetId(), ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

    }

    public static EquipmentClientInfo buildHumanoid(String name) {
        return EquipmentClientInfo.builder().addHumanoidLayers(Identifier.withDefaultNamespace(name)).build();
    }
}
