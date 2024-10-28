package fr.xotak.items.sapphire;

import fr.xotak.items.materials.NewGemsArmorMaterial;
import fr.xotak.items.materials.NewGemsToolMaterial;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class SapphireToolSet {
    //blocks and item
    public static final Block SAPPHIRE_ORE = Registry.register(Registries.BLOCK, SapphireRegistryKeys.ORE,
            new ExperienceDroppingBlock(UniformIntProvider.create(6, 10), 
                    AbstractBlock.Settings.create().registryKey(SapphireRegistryKeys.ORE).strength(4.0F).requiresTool()));
    public static final Item SAPPHIRE_ITEM = Registry.register(Registries.ITEM, SapphireRegistryKeys.ITEM,
            new Item(new Item.Settings().registryKey(SapphireRegistryKeys.ITEM)));
    public static final Block SAPPHIRE_BLOCK = Registry.register(Registries.BLOCK, SapphireRegistryKeys.BLOCK,
            new Block(
                    AbstractBlock.Settings.create().registryKey(SapphireRegistryKeys.BLOCK).strength(4.0F).requiresTool()));
    public static final Item SAPPHIRE_ORE_ITEM = Registry.register(Registries.ITEM, SapphireRegistryKeys.ORE_ITEM,
            new BlockItem(SAPPHIRE_ORE, new Item.Settings().registryKey(SapphireRegistryKeys.ORE_ITEM).useBlockPrefixedTranslationKey()));
    public static final Item SAPPHIRE_BLOCK_ITEM = Registry.register(Registries.ITEM, SapphireRegistryKeys.BLOCK_ITEM,
            new BlockItem(SAPPHIRE_BLOCK, new Item.Settings().registryKey(SapphireRegistryKeys.BLOCK_ITEM).useBlockPrefixedTranslationKey()));
    //tools
    public static final Item SAPPHIRE_SHOVEL = Registry.register(Registries.ITEM, SapphireRegistryKeys.SHOVEL,
            new ShovelItem(NewGemsToolMaterial.SAPPHIRE, 1.5F, -3.0F,
                    new ShovelItem.Settings().registryKey(SapphireRegistryKeys.SHOVEL)));
    public static final Item SAPPHIRE_PICKAXE = Registry.register(Registries.ITEM, SapphireRegistryKeys.PICKAXE,
            new PickaxeItem(NewGemsToolMaterial.SAPPHIRE, 1.0F, -2.8F,
                    new PickaxeItem.Settings().registryKey(SapphireRegistryKeys.PICKAXE)));
    public static final Item SAPPHIRE_AXE = Registry.register(Registries.ITEM, SapphireRegistryKeys.AXE,
            new AxeItem(NewGemsToolMaterial.SAPPHIRE, 6.0F, -3.0F,
                    new AxeItem.Settings().registryKey(SapphireRegistryKeys.AXE)));
    public static final Item SAPPHIRE_HOE = Registry.register(Registries.ITEM, SapphireRegistryKeys.HOE,
            new HoeItem(NewGemsToolMaterial.SAPPHIRE, 0.0F, -3.0F,
                    new Item.Settings().registryKey(SapphireRegistryKeys.HOE)));
    public static final Item SAPPHIRE_SWORD = Registry.register(Registries.ITEM, SapphireRegistryKeys.SWORD,
            new SwordItem(NewGemsToolMaterial.SAPPHIRE, 3.0F, -2.4F,
                    new Item.Settings().registryKey(SapphireRegistryKeys.SWORD)));
    //armor
    public static final Item SAPPHIRE_HELMET = Registry.register(Registries.ITEM, SapphireRegistryKeys.HELMET,
            new SapphireArmorItem(NewGemsArmorMaterial.SAPPHIRE, EquipmentType.HELMET,
                    new Item.Settings().registryKey(SapphireRegistryKeys.HELMET)));
    public static final Item SAPPHIRE_CHESTPLATE = Registry.register(Registries.ITEM, SapphireRegistryKeys.CHESTPLATE,
            new SapphireArmorItem(NewGemsArmorMaterial.SAPPHIRE, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(SapphireRegistryKeys.CHESTPLATE)));
    public static final Item SAPPHIRE_LEGGINGS = Registry.register(Registries.ITEM, SapphireRegistryKeys.LEGGINGS,
            new SapphireArmorItem(NewGemsArmorMaterial.SAPPHIRE,EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(SapphireRegistryKeys.LEGGINGS)));
    public static final Item SAPPHIRE_BOOTS = Registry.register(Registries.ITEM, SapphireRegistryKeys.BOOTS,
            new SapphireArmorItem(NewGemsArmorMaterial.SAPPHIRE, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(SapphireRegistryKeys.BOOTS)));

    public static void initialize() {}
}
