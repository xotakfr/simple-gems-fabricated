package fr.xotak.items.ruby;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RubyToolSet {
    //blocks and item
    public static final Block RUBY_ORE = Registry.register(BuiltInRegistries.BLOCK, RubyRegistryEntry.ORE,
            new DropExperienceBlock(UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of().setId(RubyRegistryEntry.ORE).strength(3.0F).requiresCorrectToolForDrops()));
    public static final Item RUBY_ITEM = Items.registerItem(RubyRegistryEntry.ITEM, Item::new,
            new Item.Properties().setId(RubyRegistryEntry.ITEM));
    public static final Block RUBY_BLOCK = Registry.register(BuiltInRegistries.BLOCK, RubyRegistryEntry.BLOCK,
            new Block(BlockBehaviour.Properties.of().setId(RubyRegistryEntry.BLOCK).strength(3.0F).requiresCorrectToolForDrops()));
    public static final Item RUBY_ORE_ITEM = Items.registerBlock(RUBY_ORE, BlockItem::new,
            new Item.Properties().setId(RubyRegistryEntry.ORE_ITEM).useBlockDescriptionPrefix());
    public static final Item RUBY_BLOCK_ITEM = Items.registerBlock(RUBY_BLOCK, BlockItem::new,
        new Item.Properties().setId(RubyRegistryEntry.BLOCK_ITEM).useBlockDescriptionPrefix());

    //tools
    public static final Item RUBY_SHOVEL = Items.registerItem(RubyRegistryEntry.SHOVEL, Item::new,
            new Item.Properties().shovel(GemsToolMaterial.RUBY, 1.5F, -3.0F));
    public static final Item RUBY_PICKAXE = Items.registerItem(RubyRegistryEntry.PICKAXE, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.RUBY, 1.0F, -2.8F));
    public static final Item RUBY_AXE = Items.registerItem(RubyRegistryEntry.AXE, Item::new,
            new Item.Properties().axe(GemsToolMaterial.RUBY, 6.0F, -3.0F));
    public static final Item RUBY_HOE = Items.registerItem(RubyRegistryEntry.HOE, Item::new,
            new Item.Properties().hoe(GemsToolMaterial.RUBY, 0.0F, -3.0F));
    public static final Item RUBY_SWORD = Items.registerItem(RubyRegistryEntry.SWORD, Item::new,
            new Item.Properties().sword(GemsToolMaterial.RUBY, 3.0F, -2.4F));
    //armor
    public static final Item RUBY_HELMET = Items.registerItem(RubyRegistryEntry.HELMET, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.RUBY, ArmorType.HELMET));
    public static final Item RUBY_CHESTPLATE = Items.registerItem(RubyRegistryEntry.CHESTPLATE, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.RUBY, ArmorType.CHESTPLATE));
    public static final Item RUBY_LEGGINGS = Items.registerItem(RubyRegistryEntry.LEGGINGS, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.RUBY, ArmorType.LEGGINGS));
    public static final Item RUBY_BOOTS = Items.registerItem(RubyRegistryEntry.BOOTS, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.RUBY, ArmorType.BOOTS));


    public static void initialize() {}
}
