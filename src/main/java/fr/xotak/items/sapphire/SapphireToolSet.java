package fr.xotak.items.sapphire;

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

public class SapphireToolSet {
    //blocks and item
    public static final Block SAPPHIRE_ORE = Registry.register(BuiltInRegistries.BLOCK, SapphireRegistryKeys.ORE,
            new DropExperienceBlock(UniformInt.of(6, 10), 
                    BlockBehaviour.Properties.of().setId(SapphireRegistryKeys.ORE).strength(4.0F).requiresCorrectToolForDrops()));
    public static final Item SAPPHIRE_ITEM = Items.registerItem(SapphireRegistryKeys.ITEM, Item::new,
            new Item.Properties().setId(SapphireRegistryKeys.ITEM));
    public static final Block SAPPHIRE_BLOCK = Registry.register(BuiltInRegistries.BLOCK, SapphireRegistryKeys.BLOCK,
            new Block(BlockBehaviour.Properties.of().setId(SapphireRegistryKeys.BLOCK).strength(4.0F).requiresCorrectToolForDrops()));
    public static final Item SAPPHIRE_ORE_ITEM = Items.registerBlock(SAPPHIRE_ORE, BlockItem::new,
            new Item.Properties().setId(SapphireRegistryKeys.ORE_ITEM).useBlockDescriptionPrefix());
    public static final Item SAPPHIRE_BLOCK_ITEM = Items.registerBlock(SAPPHIRE_BLOCK, BlockItem::new,
            new Item.Properties().setId(SapphireRegistryKeys.BLOCK_ITEM).useBlockDescriptionPrefix());
    //tools
    public static final Item SAPPHIRE_SHOVEL = Items.registerItem(SapphireRegistryKeys.SHOVEL, Item::new,
            new Item.Properties().shovel(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final Item SAPPHIRE_PICKAXE = Items.registerItem(SapphireRegistryKeys.PICKAXE, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final Item SAPPHIRE_AXE = Items.registerItem(SapphireRegistryKeys.AXE, Item::new,
            new Item.Properties().axe(GemsToolMaterial.SAPPHIRE, 6.0F, -3.0F));
    public static final Item SAPPHIRE_HOE = Items.registerItem(SapphireRegistryKeys.HOE, Item::new,
            new Item.Properties().hoe(GemsToolMaterial.SAPPHIRE, 0.0F, -3.0F));
    public static final Item SAPPHIRE_SWORD = Items.registerItem(SapphireRegistryKeys.SWORD, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.SAPPHIRE, 3.0F, -2.4F));
    //armor
    public static final Item SAPPHIRE_HELMET = Items.registerItem(SapphireRegistryKeys.HELMET, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.HELMET));
    public static final Item SAPPHIRE_CHESTPLATE = Items.registerItem(SapphireRegistryKeys.CHESTPLATE, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.CHESTPLATE));
    public static final Item SAPPHIRE_LEGGINGS = Items.registerItem(SapphireRegistryKeys.LEGGINGS, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.LEGGINGS));
    public static final Item SAPPHIRE_BOOTS = Items.registerItem(SapphireRegistryKeys.BOOTS, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.BOOTS));

    public static void initialize() {}
}
