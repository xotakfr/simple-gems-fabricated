package fr.xotak.items.ruby;

import fr.xotak.items.materials.GemsArmorMaterial;
import fr.xotak.items.materials.GemsToolMaterial;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class RubyToolSet {
    //blocks and item
    public static final Block RUBY_ORE = Registry.register(Registries.BLOCK, RubyRegistryEntry.ORE,
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create().registryKey(RubyRegistryEntry.ORE).strength(3.0F).requiresTool()));
    public static final Item RUBY_ITEM = Registry.register(Registries.ITEM, RubyRegistryEntry.ITEM,
            new Item(new Item.Settings().registryKey(RubyRegistryEntry.ITEM)));
    public static final Block RUBY_BLOCK = Registry.register(Registries.BLOCK, RubyRegistryEntry.BLOCK,
            new Block(
                    AbstractBlock.Settings.create().registryKey(RubyRegistryEntry.BLOCK).strength(3.0F).requiresTool()));
    public static final Item RUBY_ORE_ITEM = Registry.register(Registries.ITEM, RubyRegistryEntry.ORE_ITEM,
            new BlockItem(RUBY_ORE,
                    new Item.Settings().registryKey(RubyRegistryEntry.ORE_ITEM).useBlockPrefixedTranslationKey()));
    public static final Item RUBY_BLOCK_ITEM = Registry.register(Registries.ITEM, RubyRegistryEntry.BLOCK_ITEM,
            new BlockItem(RUBY_BLOCK,
                    new Item.Settings().registryKey(RubyRegistryEntry.BLOCK_ITEM).useBlockPrefixedTranslationKey()));
    //tools
    public static final Item RUBY_SHOVEL = Registry.register(Registries.ITEM, RubyRegistryEntry.SHOVEL,
            new ShovelItem(GemsToolMaterial.RUBY, 1.5F, -3.0F,
                    new ShovelItem.Settings().registryKey(RubyRegistryEntry.SHOVEL)));
    public static final Item RUBY_PICKAXE = Registry.register(Registries.ITEM, RubyRegistryEntry.PICKAXE,
            new PickaxeItem(GemsToolMaterial.RUBY, 1.0F, -2.8F,
                    new PickaxeItem.Settings().registryKey(RubyRegistryEntry.PICKAXE)));
    public static final Item RUBY_AXE = Registry.register(Registries.ITEM, RubyRegistryEntry.AXE,
            new AxeItem(GemsToolMaterial.RUBY, 6.0F, -3.0F,
                    new AxeItem.Settings().registryKey(RubyRegistryEntry.AXE)));
    public static final Item RUBY_HOE = Registry.register(Registries.ITEM, RubyRegistryEntry.HOE,
            new HoeItem(GemsToolMaterial.RUBY, 0.0F, -3.0F,
                    new HoeItem.Settings().registryKey(RubyRegistryEntry.HOE)));
    public static final Item RUBY_SWORD = Registry.register(Registries.ITEM, RubyRegistryEntry.SWORD,
            new SwordItem(GemsToolMaterial.RUBY, 3.0F, -2.4F,
                    new Item.Settings().registryKey(RubyRegistryEntry.SWORD)));
    //armor
    public static final Item RUBY_HELMET = Registry.register(Registries.ITEM, RubyRegistryEntry.HELMET,
            new RubyArmorItem(GemsArmorMaterial.RUBY, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RubyRegistryEntry.HELMET)));
    public static final Item RUBY_CHESTPLATE = Registry.register(Registries.ITEM, RubyRegistryEntry.CHESTPLATE,
            new RubyArmorItem(GemsArmorMaterial.RUBY, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RubyRegistryEntry.CHESTPLATE)));
    public static final Item RUBY_LEGGINGS = Registry.register(Registries.ITEM, RubyRegistryEntry.LEGGINGS,
            new RubyArmorItem(GemsArmorMaterial.RUBY, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RubyRegistryEntry.LEGGINGS)));
    public static final Item RUBY_BOOTS = Registry.register(Registries.ITEM, RubyRegistryEntry.BOOTS,
            new RubyArmorItem(GemsArmorMaterial.RUBY, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RubyRegistryEntry.BOOTS)));


    public static void initialize() {}
}
