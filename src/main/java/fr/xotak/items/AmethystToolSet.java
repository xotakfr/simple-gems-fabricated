package fr.xotak.items;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

public class AmethystToolSet {
    //tools
    public static final ResourceKey<Item> AMETHYST_SHOVEL_RK = ItemsUtil.create("amethyst_shovel");
    public static final Item AMETHYST_SHOVEL = ItemsUtil.register(AMETHYST_SHOVEL_RK, Item::new,
            new Item.Properties().shovel(GemsToolMaterial.AMETHYST, 1.5F, -3.0F));
    public static final ResourceKey<Item> AMETHYST_PICKAXE_RK = ItemsUtil.create("amethyst_pickaxe");
    public static final Item AMETHYST_PICKAXE = ItemsUtil.register(AMETHYST_PICKAXE_RK, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.AMETHYST, 1.0F, -2.8F));
    public static final ResourceKey<Item> AMETHYST_AXE_RK = ItemsUtil.create("amethyst_axe");
    public static final Item AMETHYST_AXE = ItemsUtil.register(AMETHYST_AXE_RK, Item::new,
            new Item.Properties().axe(GemsToolMaterial.AMETHYST, 6.0F, -3.0F));
    public static final ResourceKey<Item> AMETHYST_HOE_RK = ItemsUtil.create("amethyst_hoe");
    public static final Item AMETHYST_HOE = ItemsUtil.register(AMETHYST_HOE_RK, Item::new,
            new Item.Properties().hoe(GemsToolMaterial.AMETHYST, 0.0F, -3.0F));
    public static final ResourceKey<Item> AMETHYST_SWORD_RK = ItemsUtil.create("amethyst_sword");
    public static final Item AMETHYST_SWORD = ItemsUtil.register(AMETHYST_SWORD_RK, Item::new,
            new Item.Properties().sword(GemsToolMaterial.AMETHYST, 3.0F, -2.4F));
    public static final ResourceKey<Item> AMETHYST_SPEAR_RK = ItemsUtil.create("amethyst_spear");
    public static final Item AMETHYST_SPEAR = ItemsUtil.register(AMETHYST_SPEAR_RK, Item::new,
            new Item.Properties().spear(GemsToolMaterial.AMETHYST, 0.95F, 0.8F, 0.6F, 3F, 12.0F, 7.25F, 5.1F, 12.25F, 4.6F));
    //armor
    public static final ResourceKey<Item> AMETHYST_HELMET_RK = ItemsUtil.create("amethyst_helmet");
    public static final Item AMETHYST_HELMET = ItemsUtil.register(AMETHYST_HELMET_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.HELMET));
    public static final ResourceKey<Item> AMETHYST_CHESTPLATE_RK = ItemsUtil.create("amethyst_chestplate");
    public static final Item AMETHYST_CHESTPLATE = ItemsUtil.register(AMETHYST_CHESTPLATE_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.CHESTPLATE));
    public static final ResourceKey<Item> AMETHYST_LEGGINGS_RK = ItemsUtil.create("amethyst_leggings");
    public static final Item AMETHYST_LEGGINGS = ItemsUtil.register(AMETHYST_LEGGINGS_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.LEGGINGS));
    public static final ResourceKey<Item> AMETHYST_BOOTS_RK = ItemsUtil.create("amethyst_boots");
    public static final Item AMETHYST_BOOTS = ItemsUtil.register(AMETHYST_BOOTS_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.AMETHYST, ArmorType.BOOTS));

    public static void initialize() {}
}
