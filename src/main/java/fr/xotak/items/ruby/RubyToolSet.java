package fr.xotak.items.ruby;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
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
    public static final Item RUBY_ITEM = Items.register(RubyRegistryEntry.ITEM, Item::new,
            new Item.Settings().registryKey(RubyRegistryEntry.ITEM));
    public static final Block RUBY_BLOCK = Registry.register(Registries.BLOCK, RubyRegistryEntry.BLOCK,
            new Block(AbstractBlock.Settings.create().registryKey(RubyRegistryEntry.BLOCK).strength(3.0F).requiresTool()));
    public static final Item RUBY_ORE_ITEM = Items.register(RUBY_ORE, BlockItem::new,
            new Item.Settings().registryKey(RubyRegistryEntry.ORE_ITEM).useBlockPrefixedTranslationKey());
    public static final Item RUBY_BLOCK_ITEM = Items.register(RUBY_BLOCK, BlockItem::new,
        new Item.Settings().registryKey(RubyRegistryEntry.BLOCK_ITEM).useBlockPrefixedTranslationKey());

    //tools
    public static final Item RUBY_SHOVEL = Items.register(RubyRegistryEntry.SHOVEL, Item::new,
            new Item.Settings().shovel(GemsToolMaterial.RUBY, 1.5F, -3.0F));
    public static final Item RUBY_PICKAXE = Items.register(RubyRegistryEntry.PICKAXE, Item::new,
            new Item.Settings().pickaxe(GemsToolMaterial.RUBY, 1.0F, -2.8F));
    public static final Item RUBY_AXE = Items.register(RubyRegistryEntry.AXE, Item::new,
            new Item.Settings().axe(GemsToolMaterial.RUBY, 6.0F, -3.0F));
    public static final Item RUBY_HOE = Items.register(RubyRegistryEntry.HOE, Item::new,
            new Item.Settings().hoe(GemsToolMaterial.RUBY, 0.0F, -3.0F));
    public static final Item RUBY_SWORD = Items.register(RubyRegistryEntry.SWORD, Item::new,
            new Item.Settings().sword(GemsToolMaterial.RUBY, 3.0F, -2.4F));
    //armor
    public static final Item RUBY_HELMET = Items.register(RubyRegistryEntry.HELMET, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.RUBY, EquipmentType.HELMET));
    public static final Item RUBY_CHESTPLATE = Items.register(RubyRegistryEntry.CHESTPLATE, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.RUBY, EquipmentType.CHESTPLATE));
    public static final Item RUBY_LEGGINGS = Items.register(RubyRegistryEntry.LEGGINGS, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.RUBY, EquipmentType.LEGGINGS));
    public static final Item RUBY_BOOTS = Items.register(RubyRegistryEntry.BOOTS, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.RUBY, EquipmentType.BOOTS));


    public static void initialize() {}
}
