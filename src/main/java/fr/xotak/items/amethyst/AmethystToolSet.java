package fr.xotak.items.amethyst;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;

public class AmethystToolSet {
    //tools
    public static final Item AMETHYST_SHOVEL = Items.registerItem(AmethystRegistryKeys.SHOVEL, Item::new,
            new Item.Properties().shovel(GemsToolMaterial.AMETHYST, 1.5F, -3.0F));
    public static final Item AMETHYST_PICKAXE = Items.registerItem(AmethystRegistryKeys.PICKAXE, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.AMETHYST, 1.0F, -2.8F));
    public static final Item AMETHYST_AXE = Items.registerItem(AmethystRegistryKeys.AXE, Item::new,
            new Item.Properties().axe(GemsToolMaterial.AMETHYST, 6.0F, -3.0F));
    public static final Item AMETHYST_HOE = Items.registerItem(AmethystRegistryKeys.HOE, Item::new,
            new Item.Properties().hoe(GemsToolMaterial.AMETHYST, 0.0F, -3.0F));
    public static final Item AMETHYST_SWORD = Items.registerItem(AmethystRegistryKeys.SWORD, Item::new,
            new Item.Properties().sword(GemsToolMaterial.AMETHYST, 3.0F, -2.4F));
    //armor
    public static final Item AMETHYST_HELMET = Items.registerItem(AmethystRegistryKeys.HELMET, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.HELMET));
    public static final Item AMETHYST_CHESTPLATE = Items.registerItem(AmethystRegistryKeys.CHESTPLATE, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.CHESTPLATE));
    public static final Item AMETHYST_LEGGINGS = Items.registerItem(AmethystRegistryKeys.LEGGINGS, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.LEGGINGS));
    public static final Item AMETHYST_BOOTS = Items.registerItem(AmethystRegistryKeys.BOOTS, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.BOOTS));

    public static void initialize() {}
}
