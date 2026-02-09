package fr.xotak.items.amethyst;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.item.*;

import net.minecraft.item.equipment.EquipmentType;

public class AmethystToolSet {
    //tools
    public static final Item AMETHYST_SHOVEL = Items.register(AmethystRegistryKeys.SHOVEL, Item::new,
            new Item.Settings().shovel(GemsToolMaterial.AMETHYST, 1.5F, -3.0F));
    public static final Item AMETHYST_PICKAXE = Items.register(AmethystRegistryKeys.PICKAXE, Item::new,
            new Item.Settings().pickaxe(GemsToolMaterial.AMETHYST, 1.0F, -2.8F));
    public static final Item AMETHYST_AXE = Items.register(AmethystRegistryKeys.AXE, Item::new,
            new Item.Settings().axe(GemsToolMaterial.AMETHYST, 6.0F, -3.0F));
    public static final Item AMETHYST_HOE = Items.register(AmethystRegistryKeys.HOE, Item::new,
            new Item.Settings().hoe(GemsToolMaterial.AMETHYST, 0.0F, -3.0F));
    public static final Item AMETHYST_SWORD = Items.register(AmethystRegistryKeys.SWORD, Item::new,
            new Item.Settings().sword(GemsToolMaterial.AMETHYST, 3.0F, -2.4F));
    //armor
    public static final Item AMETHYST_HELMET = Items.register(AmethystRegistryKeys.HELMET, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.AMETHYST, EquipmentType.HELMET));
    public static final Item AMETHYST_CHESTPLATE = Items.register(AmethystRegistryKeys.CHESTPLATE, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.AMETHYST, EquipmentType.CHESTPLATE));
    public static final Item AMETHYST_LEGGINGS = Items.register(AmethystRegistryKeys.LEGGINGS, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.AMETHYST, EquipmentType.LEGGINGS));
    public static final Item AMETHYST_BOOTS = Items.register(AmethystRegistryKeys.BOOTS, Item::new,
            new Item.Settings().armor(GemsArmorMaterial.AMETHYST, EquipmentType.BOOTS));

    public static void initialize() {}
}
