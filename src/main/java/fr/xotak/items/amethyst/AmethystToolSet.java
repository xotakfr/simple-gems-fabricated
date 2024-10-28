package fr.xotak.items.amethyst;

import fr.xotak.items.materials.NewGemsArmorMaterial;
import fr.xotak.items.materials.NewGemsToolMaterial;
import net.minecraft.item.*;

import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class AmethystToolSet {
    //tools
    public static final Item AMETHYST_SHOVEL = Registry.register(Registries.ITEM, AmethystRegistryKeys.SHOVEL,
            new ShovelItem(NewGemsToolMaterial.AMETHYST, 1.5F, -3.0F,
                    new ShovelItem.Settings().registryKey(AmethystRegistryKeys.SHOVEL)));
    public static final Item AMETHYST_PICKAXE = Registry.register(Registries.ITEM, AmethystRegistryKeys.PICKAXE,
            new PickaxeItem(NewGemsToolMaterial.AMETHYST, 1.0F, -2.8F,
                    new PickaxeItem.Settings().registryKey(AmethystRegistryKeys.PICKAXE)));
    public static final Item AMETHYST_AXE = Registry.register(Registries.ITEM, AmethystRegistryKeys.AXE,
            new AxeItem(NewGemsToolMaterial.AMETHYST, 6.0F, -3.0F,
                    new AxeItem.Settings().registryKey(AmethystRegistryKeys.AXE)));
    public static final Item AMETHYST_HOE = Registry.register(Registries.ITEM, AmethystRegistryKeys.HOE,
            new HoeItem(NewGemsToolMaterial.AMETHYST, 0.0F, -3.0F,
                    new HoeItem.Settings().registryKey(AmethystRegistryKeys.HOE)));
    public static final Item AMETHYST_SWORD = Registry.register(Registries.ITEM, AmethystRegistryKeys.SWORD,
            new SwordItem(NewGemsToolMaterial.AMETHYST, 3.0F, -2.4F,
                    new Item.Settings().registryKey(AmethystRegistryKeys.SWORD)));
    //armor
    public static final Item AMETHYST_HELMET = Registry.register(Registries.ITEM, AmethystRegistryKeys.HELMET,
            new AmethystArmorItem(NewGemsArmorMaterial.AMETHYST, EquipmentType.HELMET,
                    new Item.Settings().registryKey(AmethystRegistryKeys.HELMET)));
    public static final Item AMETHYST_CHESTPLATE = Registry.register(Registries.ITEM, AmethystRegistryKeys.CHESTPLATE,
            new AmethystArmorItem(NewGemsArmorMaterial.AMETHYST, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(AmethystRegistryKeys.CHESTPLATE)));
    public static final Item AMETHYST_LEGGINGS = Registry.register(Registries.ITEM, AmethystRegistryKeys.LEGGINGS,
            new AmethystArmorItem(NewGemsArmorMaterial.AMETHYST, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(AmethystRegistryKeys.LEGGINGS)));
    public static final Item AMETHYST_BOOTS = Registry.register(Registries.ITEM, AmethystRegistryKeys.BOOTS,
            new AmethystArmorItem(NewGemsArmorMaterial.AMETHYST, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(AmethystRegistryKeys.BOOTS)));

    public static void initialize() {}
}
