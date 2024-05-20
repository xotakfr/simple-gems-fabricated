package fr.xotak;

import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class RubyToolSet {
    //blocks and item
    public static final Block RUBY_ORE = Registry.register(Registries.BLOCK, new Identifier("simple_gems", "ruby_ore"),
            new ExperienceDroppingBlock(Block.Settings.create().strength(3.0F).requiresTool(), UniformIntProvider.create(4, 8)));
    public static final Item RUBY_ITEM = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby"),
            new Item(new Item.Settings()));
    public static final Block RUBY_BLOCK = Registry.register(Registries.BLOCK, new Identifier("simple_gems", "ruby_block"),
            new Block(Block.Settings.create().strength(3.0F).requiresTool()));
    public static final Item RUBY_ORE_ITEM = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_ore"),
            new BlockItem(RUBY_ORE, new Item.Settings()));
    public static final Item RUBY_BLOCK_ITEM = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_block"),
            new BlockItem(RUBY_BLOCK, new Item.Settings()));
    //tools
    public static final ToolItem RUBY_SHOVEL = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_shovel"),
            new ShovelItem(RubyToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings()));
    public static final ToolItem RUBY_PICKAXE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_pickaxe"),
            new PickaxeItem(RubyToolMaterial.INSTANCE, 0, -2.8F, new Item.Settings()));
    public static final ToolItem RUBY_AXE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_axe"),
            new AxeItem(RubyToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings()));
    public static final ToolItem RUBY_HOE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_hoe"),
            new HoeItem(RubyToolMaterial.INSTANCE, -6, 0, new Item.Settings()));
    public static final ToolItem RUBY_SWORD = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_sword"),
            new SwordItem(RubyToolMaterial.INSTANCE, 2, -2.4F, new Item.Settings()));
    //armor
    public static final Item RUBY_HELMET = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_helmet"),
            new RubyArmorItem(RubyArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item RUBY_CHESTPLATE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_chestplate"),
            new RubyArmorItem(RubyArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item RUBY_LEGGINGS = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_leggings"),
            new RubyArmorItem(RubyArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item RUBY_BOOTS = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_boots"),
            new RubyArmorItem(RubyArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Settings()));


    public static void initialize() {

    }
}
