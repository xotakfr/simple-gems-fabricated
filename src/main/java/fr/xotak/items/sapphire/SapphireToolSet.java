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
    public static final Item SAPPHIRE_ITEM = Items.register(SapphireRegistryKeys.ITEM, Item::new,
            new Item.Settings().registryKey(SapphireRegistryKeys.ITEM));
    public static final Block SAPPHIRE_BLOCK = Registry.register(Registries.BLOCK, SapphireRegistryKeys.BLOCK,
            new Block(AbstractBlock.Settings.create().registryKey(SapphireRegistryKeys.BLOCK).strength(4.0F).requiresTool()));
    public static final Item SAPPHIRE_ORE_ITEM = Items.register(SAPPHIRE_ORE, BlockItem::new,
            new Item.Settings().registryKey(SapphireRegistryKeys.ORE_ITEM).useBlockPrefixedTranslationKey());
    public static final Item SAPPHIRE_BLOCK_ITEM = Items.register(SAPPHIRE_BLOCK, BlockItem::new,
            new Item.Settings().registryKey(SapphireRegistryKeys.BLOCK_ITEM).useBlockPrefixedTranslationKey());
    //tools
    public static final Item SAPPHIRE_SHOVEL = Items.register(SapphireRegistryKeys.SHOVEL, Item::new,
            new Item.Settings().shovel(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final Item SAPPHIRE_PICKAXE = Items.register(SapphireRegistryKeys.PICKAXE, Item::new,
            new Item.Settings().pickaxe(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final Item SAPPHIRE_AXE = Items.register(SapphireRegistryKeys.AXE, Item::new,
            new Item.Settings().axe(GemsToolMaterial.SAPPHIRE, 6.0F, -3.0F));
    public static final Item SAPPHIRE_HOE = Items.register(SapphireRegistryKeys.HOE, Item::new,
            new Item.Settings().hoe(GemsToolMaterial.SAPPHIRE, 0.0F, -3.0F));
    public static final Item SAPPHIRE_SWORD = Items.register(SapphireRegistryKeys.SWORD, Item::new,
            new Item.Settings().pickaxe(GemsToolMaterial.SAPPHIRE, 3.0F, -2.4F));
    //armor
    public static final Item SAPPHIRE_HELMET = Items.register(SapphireRegistryKeys.HELMET, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.SAPPHIRE, EquipmentType.HELMET));
    public static final Item SAPPHIRE_CHESTPLATE = Items.register(SapphireRegistryKeys.CHESTPLATE, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.SAPPHIRE, EquipmentType.CHESTPLATE));
    public static final Item SAPPHIRE_LEGGINGS = Items.register(SapphireRegistryKeys.LEGGINGS, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.SAPPHIRE, EquipmentType.LEGGINGS));
    public static final Item SAPPHIRE_BOOTS = Items.register(SapphireRegistryKeys.BOOTS, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.SAPPHIRE, EquipmentType.BOOTS));

    public static void initialize() {}
}
