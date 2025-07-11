package fr.xotak.items.amethyst;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.item.*;

import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class AmethystToolSet {
    //tools
    public static final Item AMETHYST_SHOVEL = Registry.register(Registries.ITEM, AmethystRegistryKeys.SHOVEL,
            new ShovelItem(GemsToolMaterial.AMETHYST, 1.5F, -3.0F,
                    new ShovelItem.Settings().registryKey(AmethystRegistryKeys.SHOVEL)));
    public static final Item AMETHYST_PICKAXE = Items.register(AmethystRegistryKeys.PICKAXE, Item::new, new Item.Settings().pickaxe(GemsToolMaterial.AMETHYST, 1.0F, -2.8F));
    public static final Item AMETHYST_AXE = Registry.register(Registries.ITEM, AmethystRegistryKeys.AXE,
            new AxeItem(GemsToolMaterial.AMETHYST, 6.0F, -3.0F,
                    new AxeItem.Settings().registryKey(AmethystRegistryKeys.AXE)));
    public static final Item AMETHYST_HOE = Registry.register(Registries.ITEM, AmethystRegistryKeys.HOE,
            new HoeItem(GemsToolMaterial.AMETHYST, 0.0F, -3.0F,
                    new HoeItem.Settings().registryKey(AmethystRegistryKeys.HOE)));
    public static final Item AMETHYST_SWORD = Items.register(AmethystRegistryKeys.SWORD, Item::new, new Item.Settings().sword(GemsToolMaterial.AMETHYST, 3.0F, -2.4F));
    //armor
    public static final Item AMETHYST_HELMET = Items.register(AmethystRegistryKeys.HELMET, Item::new, new Item.Settings().armor(GemsArmorMaterial.AMETHYST, EquipmentType.HELMET));
    public static final Item AMETHYST_CHESTPLATE = Items.register(AmethystRegistryKeys.CHESTPLATE, Item::new, new Item.Settings().armor(GemsArmorMaterial.AMETHYST, EquipmentType.CHESTPLATE));
    public static final Item AMETHYST_LEGGINGS = Items.register(AmethystRegistryKeys.LEGGINGS, Item::new, new Item.Settings().armor(GemsArmorMaterial.AMETHYST, EquipmentType.LEGGINGS));
    public static final Item AMETHYST_BOOTS = Items.register(AmethystRegistryKeys.BOOTS, Item::new, new Item.Settings().armor(GemsArmorMaterial.AMETHYST, EquipmentType.BOOTS));

    public static void initialize() {}
}
