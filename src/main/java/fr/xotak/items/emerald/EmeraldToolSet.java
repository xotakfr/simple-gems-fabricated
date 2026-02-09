package fr.xotak.items.emerald;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class EmeraldToolSet {
    //tools
    public static final Item EMERALD_SHOVEL = Items.register(EmeraldRegistryKeys.SHOVEL, Item::new,
            new Item.Settings().shovel(GemsToolMaterial.EMERALD, 1.5F, -3.0F));
    public static final Item EMERALD_PICKAXE = Items.register(EmeraldRegistryKeys.PICKAXE, Item::new,
            new Item.Settings().pickaxe(GemsToolMaterial.EMERALD, 1.0F, -2.8F));
    public static final Item EMERALD_AXE = Items.register(EmeraldRegistryKeys.AXE, Item::new,
            new Item.Settings().axe(GemsToolMaterial.EMERALD, 6.0F, -3.0F));
    public static final Item EMERALD_HOE = Items.register(EmeraldRegistryKeys.HOE, Item::new,
            new Item.Settings().hoe(GemsToolMaterial.EMERALD, 0.0F, -3.0F));
    public static final Item EMERALD_SWORD = Items.register(EmeraldRegistryKeys.SWORD, Item::new,
            new Item.Settings().sword(GemsToolMaterial.EMERALD, 3.0F, -2.4F));
    //armor
    public static final Item EMERALD_HELMET = Items.register(EmeraldRegistryKeys.HELMET, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.EMERALD, EquipmentType.HELMET));
    public static final Item EMERALD_CHESTPLATE = Items.register(EmeraldRegistryKeys.CHESTPLATE, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.EMERALD, EquipmentType.CHESTPLATE));
    public static final Item EMERALD_LEGGINGS = Items.register(EmeraldRegistryKeys.LEGGINGS, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.EMERALD, EquipmentType.LEGGINGS));
    public static final Item EMERALD_BOOTS = Items.register(EmeraldRegistryKeys.BOOTS, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.EMERALD, EquipmentType.BOOTS));


    public static void initialize() {
        // This method is called to initialize static fields. If this method is not called, the static fields will be null
    }
}
