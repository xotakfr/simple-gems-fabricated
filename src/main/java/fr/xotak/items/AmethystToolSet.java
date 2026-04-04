package fr.xotak.items;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

public class AmethystToolSet {
    //tools
    public static final Item AMETHYST_SHOVEL = ItemsUtil.register("amethyst_shovel", Item::new,
            new Item.Properties().shovel(GemsToolMaterial.AMETHYST, 1.5F, -3.0F));
    public static final Item AMETHYST_PICKAXE = ItemsUtil.register("amethyst_pickaxe", Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.AMETHYST, 1.0F, -2.8F));
    public static final Item AMETHYST_AXE = ItemsUtil.register("amethyst_axe", Item::new,
            new Item.Properties().axe(GemsToolMaterial.AMETHYST, 6.0F, -3.0F));
    public static final Item AMETHYST_HOE = ItemsUtil.register("amethyst_hoe", Item::new,
            new Item.Properties().hoe(GemsToolMaterial.AMETHYST, 0.0F, -3.0F));
    public static final Item AMETHYST_SWORD = ItemsUtil.register("amethyst_sword", Item::new,
            new Item.Properties().sword(GemsToolMaterial.AMETHYST, 3.0F, -2.4F));
    //armor
    public static final Item AMETHYST_HELMET = ItemsUtil.register("amethyst_helmet", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.HELMET));
    public static final Item AMETHYST_CHESTPLATE = ItemsUtil.register("amethyst_chestplate", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.CHESTPLATE));
    public static final Item AMETHYST_LEGGINGS = ItemsUtil.register("amethyst_leggings", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.LEGGINGS));
    public static final Item AMETHYST_BOOTS = ItemsUtil.register("amethyst_boots", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.BOOTS));

    public static void initialize() {}
}
