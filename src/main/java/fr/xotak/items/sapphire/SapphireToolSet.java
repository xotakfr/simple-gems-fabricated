package fr.xotak.items.sapphire;

import fr.xotak.items.materials.GemsArmorMaterial;
import fr.xotak.items.materials.GemsToolMaterial;
import fr.xotak.items.ruby.RubyArmorItem;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class SapphireToolSet {
    //blocks and item
    public static final Block SAPPHIRE_ORE = Registry.register(Registries.BLOCK, Identifier.of("simple_gems", "sapphire_ore"),
            new ExperienceDroppingBlock(UniformIntProvider.create(6, 10), Block.Settings.create().strength(4.0F).requiresTool()));
    public static final Item SAPPHIRE_ITEM = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire"),
            new Item(new Item.Settings()));
    public static final Block SAPPHIRE_BLOCK = Registry.register(Registries.BLOCK, Identifier.of("simple_gems", "sapphire_block"),
            new Block(Block.Settings.create().strength(4.0F).requiresTool()));
    public static final Item SAPPHIRE_ORE_ITEM = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_ore"),
            new BlockItem(SAPPHIRE_ORE, new Item.Settings()));
    public static final Item SAPPHIRE_BLOCK_ITEM = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_block"),
            new BlockItem(SAPPHIRE_BLOCK, new Item.Settings()));
    //tools
    public static final ToolItem SAPPHIRE_SHOVEL = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_shovel"),
            new ShovelItem(GemsToolMaterial.SAPPHIRE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(GemsToolMaterial.SAPPHIRE, 1, -3.0F))));
    public static final ToolItem SAPPHIRE_PICKAXE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_pickaxe"),
            new PickaxeItem(GemsToolMaterial.SAPPHIRE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(GemsToolMaterial.SAPPHIRE, 0, -2.8F))));
    public static final ToolItem SAPPHIRE_AXE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_axe"),
            new AxeItem(GemsToolMaterial.SAPPHIRE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(GemsToolMaterial.SAPPHIRE, 4, -3.0F))));
    public static final ToolItem SAPPHIRE_HOE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_hoe"),
            new HoeItem(GemsToolMaterial.SAPPHIRE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(GemsToolMaterial.SAPPHIRE, -6, 0))));
    public static final ToolItem SAPPHIRE_SWORD = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_sword"),
            new SwordItem(GemsToolMaterial.SAPPHIRE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(GemsToolMaterial.SAPPHIRE, 2, -2.4F))));
    //armor
    public static final Item SAPPHIRE_HELMET = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_helmet"),
            new SapphireArmorItem(GemsArmorMaterial.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(55))));
    public static final Item SAPPHIRE_CHESTPLATE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_chestplate"),
            new SapphireArmorItem(GemsArmorMaterial.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(55))));
    public static final Item SAPPHIRE_LEGGINGS = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_leggings"),
            new SapphireArmorItem(GemsArmorMaterial.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(55))));
    public static final Item SAPPHIRE_BOOTS = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "sapphire_boots"),
            new SapphireArmorItem(GemsArmorMaterial.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(55))));

    public static void initialize() {}
}
