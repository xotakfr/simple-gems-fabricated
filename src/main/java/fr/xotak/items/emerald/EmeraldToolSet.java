package fr.xotak.items.emerald;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;


public class EmeraldToolSet {
    //tools
    public static final Item EMERALD_SHOVEL = Items.registerItem(EmeraldRegistryKeys.SHOVEL, Item::new,
            new Item.Properties().shovel(GemsToolMaterial.EMERALD, 1.5F, -3.0F));
    public static final Item EMERALD_PICKAXE = Items.registerItem(EmeraldRegistryKeys.PICKAXE, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.EMERALD, 1.0F, -2.8F));
    public static final Item EMERALD_AXE = Items.registerItem(EmeraldRegistryKeys.AXE, Item::new,
            new Item.Properties().axe(GemsToolMaterial.EMERALD, 6.0F, -3.0F));
    public static final Item EMERALD_HOE = Items.registerItem(EmeraldRegistryKeys.HOE, Item::new,
            new Item.Properties().hoe(GemsToolMaterial.EMERALD, 0.0F, -3.0F));
    public static final Item EMERALD_SWORD = Items.registerItem(EmeraldRegistryKeys.SWORD, Item::new,
            new Item.Properties().sword(GemsToolMaterial.EMERALD, 3.0F, -2.4F));
    //armor
    public static final Item EMERALD_HELMET = Items.registerItem(EmeraldRegistryKeys.HELMET, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.HELMET));
    public static final Item EMERALD_CHESTPLATE = Items.registerItem(EmeraldRegistryKeys.CHESTPLATE, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.CHESTPLATE));
    public static final Item EMERALD_LEGGINGS = Items.registerItem(EmeraldRegistryKeys.LEGGINGS, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.LEGGINGS));
    public static final Item EMERALD_BOOTS = Items.registerItem(EmeraldRegistryKeys.BOOTS, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.BOOTS));


    public static void initialize() {
        // This method is called to initialize static fields. If this method is not called, the static fields will be null
    }
}
