package fr.xotak.items.ruby;

import fr.xotak.items.materials.GemsArmorMaterial;
import fr.xotak.items.materials.GemsToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class RubyToolSet {
    //blocks and item
    public static final Block RUBY_ORE = Registry.register(Registries.BLOCK, Identifier.of("simple_gems", "ruby_ore"),
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8), Block.Settings.create().strength(3.0F).requiresTool()));
    public static final Item RUBY_ITEM = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby"),
            new Item(new Item.Settings()));
    public static final Block RUBY_BLOCK = Registry.register(Registries.BLOCK, Identifier.of("simple_gems", "ruby_block"),
            new Block(Block.Settings.create().strength(3.0F).requiresTool()));
    public static final Item RUBY_ORE_ITEM = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_ore"),
            new BlockItem(RUBY_ORE, new Item.Settings()));
    public static final Item RUBY_BLOCK_ITEM = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_block"),
            new BlockItem(RUBY_BLOCK, new Item.Settings()));
    //tools
    public static final ToolItem RUBY_SHOVEL = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_shovel"),
            new ShovelItem(GemsToolMaterial.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(GemsToolMaterial.RUBY, 1, -3.0F))));
    public static final ToolItem RUBY_PICKAXE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_pickaxe"),
            new PickaxeItem(GemsToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(GemsToolMaterial.RUBY, 0, -2.8F))));
    public static final ToolItem RUBY_AXE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_axe"),
            new AxeItem(GemsToolMaterial.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(GemsToolMaterial.RUBY, 4, -3.0F))));
    public static final ToolItem RUBY_HOE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_hoe"),
            new HoeItem(GemsToolMaterial.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(GemsToolMaterial.RUBY, -6, 0))));
    public static final ToolItem RUBY_SWORD = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_sword"),
            new SwordItem(GemsToolMaterial.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(GemsToolMaterial.RUBY, 2, -2.4F))));
    //armor
    public static final Item RUBY_HELMET = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_helmet"),
            new RubyArmorItem(GemsArmorMaterial.RUBY, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item RUBY_CHESTPLATE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_chestplate"),
            new RubyArmorItem(GemsArmorMaterial.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item RUBY_LEGGINGS = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_leggings"),
            new RubyArmorItem(GemsArmorMaterial.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item RUBY_BOOTS = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "ruby_boots"),
            new RubyArmorItem(GemsArmorMaterial.RUBY, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));


    public static void initialize() {}
}
