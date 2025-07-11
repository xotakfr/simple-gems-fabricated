package fr.xotak.items.sapphire;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
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
            new ShovelItem(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F,
                    new ShovelItem.Settings().registryKey(SapphireRegistryKeys.SHOVEL)));
    public static final Item SAPPHIRE_PICKAXE = Items.register(SapphireRegistryKeys.PICKAXE, Item::new, new Item.Settings().pickaxe(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final Item SAPPHIRE_AXE = Registry.register(Registries.ITEM, SapphireRegistryKeys.AXE,
            new AxeItem(GemsToolMaterial.SAPPHIRE, 6.0F, -3.0F,
                    new AxeItem.Settings().registryKey(SapphireRegistryKeys.AXE)));
    public static final Item SAPPHIRE_HOE = Registry.register(Registries.ITEM, SapphireRegistryKeys.HOE,
            new HoeItem(GemsToolMaterial.SAPPHIRE, 0.0F, -3.0F,
                    new Item.Settings().registryKey(SapphireRegistryKeys.HOE)));
    public static final Item SAPPHIRE_SWORD = Items.register(SapphireRegistryKeys.SWORD, Item::new, new Item.Settings().pickaxe(GemsToolMaterial.SAPPHIRE, 3.0F, -2.4F));
    //armor
    public static final Item SAPPHIRE_HELMET = Items.register(SapphireRegistryKeys.HELMET, Item::new, new Item.Settings().armor(GemsArmorMaterial.SAPPHIRE, EquipmentType.HELMET));
    public static final Item SAPPHIRE_CHESTPLATE = Items.register(SapphireRegistryKeys.CHESTPLATE, Item::new, new Item.Settings().armor(GemsArmorMaterial.SAPPHIRE, EquipmentType.CHESTPLATE));
    public static final Item SAPPHIRE_LEGGINGS = Items.register(SapphireRegistryKeys.LEGGINGS, Item::new, new Item.Settings().armor(GemsArmorMaterial.SAPPHIRE, EquipmentType.LEGGINGS));
    public static final Item SAPPHIRE_BOOTS = Items.register(SapphireRegistryKeys.BOOTS, Item::new, new Item.Settings().armor(GemsArmorMaterial.SAPPHIRE, EquipmentType.BOOTS));

    public static void initialize() {}
}
