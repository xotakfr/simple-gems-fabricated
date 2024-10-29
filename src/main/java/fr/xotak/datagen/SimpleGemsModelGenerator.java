package fr.xotak.datagen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.materials.GemsArmorMaterial;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.equipment.EquipmentModel;
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
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_HELMET, GemsArmorMaterial.RUBY.modelId(), buildHumanoid(GemsArmorMaterial.RUBY.modelId().getPath()), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_CHESTPLATE, GemsArmorMaterial.RUBY.modelId(), buildHumanoid(GemsArmorMaterial.RUBY.modelId().getPath()), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_LEGGINGS, GemsArmorMaterial.RUBY.modelId(), buildHumanoid(GemsArmorMaterial.RUBY.modelId().getPath()), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(RubyToolSet.RUBY_BOOTS, GemsArmorMaterial.RUBY.modelId(), buildHumanoid(GemsArmorMaterial.RUBY.modelId().getPath()), EquipmentSlot.FEET);

        // Amethyst
        itemModelGenerator.register(AmethystToolSet.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(AmethystToolSet.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_HELMET, GemsArmorMaterial.AMETHYST.modelId(), buildHumanoid(GemsArmorMaterial.AMETHYST.modelId().getPath()), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_CHESTPLATE, GemsArmorMaterial.AMETHYST.modelId(), buildHumanoid(GemsArmorMaterial.AMETHYST.modelId().getPath()), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_LEGGINGS, GemsArmorMaterial.AMETHYST.modelId(), buildHumanoid(GemsArmorMaterial.AMETHYST.modelId().getPath()), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(AmethystToolSet.AMETHYST_BOOTS, GemsArmorMaterial.AMETHYST.modelId(), buildHumanoid(GemsArmorMaterial.AMETHYST.modelId().getPath()), EquipmentSlot.FEET);

        // Sapphire
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_ITEM, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(SapphireToolSet.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_HELMET, GemsArmorMaterial.SAPPHIRE.modelId(), buildHumanoid(GemsArmorMaterial.SAPPHIRE.modelId().getPath()), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_CHESTPLATE, GemsArmorMaterial.SAPPHIRE.modelId(), buildHumanoid(GemsArmorMaterial.SAPPHIRE.modelId().getPath()), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_LEGGINGS, GemsArmorMaterial.SAPPHIRE.modelId(), buildHumanoid(GemsArmorMaterial.SAPPHIRE.modelId().getPath()), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(SapphireToolSet.SAPPHIRE_BOOTS, GemsArmorMaterial.SAPPHIRE.modelId(), buildHumanoid(GemsArmorMaterial.SAPPHIRE.modelId().getPath()), EquipmentSlot.FEET);

        // Emerald
        itemModelGenerator.register(EmeraldToolSet.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(EmeraldToolSet.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_HELMET, GemsArmorMaterial.EMERALD.modelId(), buildHumanoid(GemsArmorMaterial.EMERALD.modelId().getPath()), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_CHESTPLATE, GemsArmorMaterial.EMERALD.modelId(), buildHumanoid(GemsArmorMaterial.EMERALD.modelId().getPath()), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_LEGGINGS, GemsArmorMaterial.EMERALD.modelId(), buildHumanoid(GemsArmorMaterial.EMERALD.modelId().getPath()), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(EmeraldToolSet.EMERALD_BOOTS, GemsArmorMaterial.EMERALD.modelId(), buildHumanoid(GemsArmorMaterial.EMERALD.modelId().getPath()), EquipmentSlot.FEET);

    }

    public static EquipmentModel buildHumanoid(String name) {
        return EquipmentModel.builder().addHumanoidLayers(Identifier.ofVanilla(name)).build();
    }
}
