package fr.xotak.items.emerald;

import fr.xotak.items.materials.NewGemsArmorMaterial;
import fr.xotak.items.materials.NewGemsToolMaterial;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class EmeraldToolSet {
    //tools
    public static final Item EMERALD_SHOVEL = Registry.register(Registries.ITEM, EmeraldRegistryKeys.SHOVEL,
            new ShovelItem(NewGemsToolMaterial.EMERALD, 1.5F, -3.0F,
                    new ShovelItem.Settings().registryKey(EmeraldRegistryKeys.SHOVEL)));
    public static final Item EMERALD_PICKAXE = Registry.register(Registries.ITEM, EmeraldRegistryKeys.PICKAXE,
            new PickaxeItem(NewGemsToolMaterial.EMERALD, 1.0F, -2.8F,
                    new PickaxeItem.Settings().registryKey(EmeraldRegistryKeys.PICKAXE)));
    public static final Item EMERALD_AXE = Registry.register(Registries.ITEM, EmeraldRegistryKeys.AXE,
            new AxeItem(NewGemsToolMaterial.EMERALD, 6.0F, -3.0F,
                    new AxeItem.Settings().registryKey(EmeraldRegistryKeys.AXE)));
    public static final Item EMERALD_HOE = Registry.register(Registries.ITEM, EmeraldRegistryKeys.HOE,
            new HoeItem(NewGemsToolMaterial.EMERALD, 0.0F, -3.0F,
                    new HoeItem.Settings().registryKey(EmeraldRegistryKeys.HOE)));
    public static final Item EMERALD_SWORD = Registry.register(Registries.ITEM, EmeraldRegistryKeys.SWORD,
            new SwordItem(NewGemsToolMaterial.EMERALD, 3.0F, -2.4F,
                    new SwordItem.Settings().registryKey(EmeraldRegistryKeys.SWORD)));
    //armor
    public static final Item EMERALD_HELMET = Registry.register(Registries.ITEM, EmeraldRegistryKeys.HELMET,
            new EmeraldArmorItem(NewGemsArmorMaterial.EMERALD, EquipmentType.HELMET,
                    new ArmorItem.Settings().registryKey(EmeraldRegistryKeys.HELMET)));
    public static final Item EMERALD_CHESTPLATE = Registry.register(Registries.ITEM, EmeraldRegistryKeys.CHESTPLATE,
            new EmeraldArmorItem(NewGemsArmorMaterial.EMERALD, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(EmeraldRegistryKeys.CHESTPLATE)));
    public static final Item EMERALD_LEGGINGS = Registry.register(Registries.ITEM, EmeraldRegistryKeys.LEGGINGS,
            new EmeraldArmorItem(NewGemsArmorMaterial.EMERALD, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(EmeraldRegistryKeys.LEGGINGS)));
    public static final Item EMERALD_BOOTS = Registry.register(Registries.ITEM, EmeraldRegistryKeys.BOOTS,
            new EmeraldArmorItem(NewGemsArmorMaterial.EMERALD, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(EmeraldRegistryKeys.BOOTS)));


    public static void initialize() {
        // This method is called to initialize static fields. If this method is not called, the static fields will be null
    }
}
