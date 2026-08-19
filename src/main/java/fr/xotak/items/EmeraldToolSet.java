package fr.xotak.items;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;


public class EmeraldToolSet {
    //tools
    public static final ResourceKey<Item> EMERALD_SHOVEL_RK = ItemsUtil.create("emerald_shovel");
    public static final Item EMERALD_SHOVEL = ItemsUtil.register(EMERALD_SHOVEL_RK, Item::new,
            new Item.Properties().shovel(GemsToolMaterial.EMERALD, 1.5F, -3.0F));
    public static final ResourceKey<Item> EMERALD_PICKAXE_RK = ItemsUtil.create("emerald_pickaxe");
    public static final Item EMERALD_PICKAXE = ItemsUtil.register(EMERALD_PICKAXE_RK, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.EMERALD, 1.0F, -2.8F));
    public static final ResourceKey<Item> EMERALD_AXE_RK = ItemsUtil.create("emerald_axe");
    public static final Item EMERALD_AXE = ItemsUtil.register(EMERALD_AXE_RK, Item::new,
            new Item.Properties().axe(GemsToolMaterial.EMERALD, 6.0F, -3.0F));
    public static final ResourceKey<Item> EMERALD_HOE_RK = ItemsUtil.create("emerald_hoe");
    public static final Item EMERALD_HOE = ItemsUtil.register(EMERALD_HOE_RK, Item::new,
            new Item.Properties().hoe(GemsToolMaterial.EMERALD, 0.0F, -3.0F));
    public static final ResourceKey<Item> EMERALD_SWORD_RK = ItemsUtil.create("emerald_sword");
    public static final Item EMERALD_SWORD = ItemsUtil.register(EMERALD_SWORD_RK, Item::new,
            new Item.Properties().sword(GemsToolMaterial.EMERALD, 3.0F, -2.4F));
    public static final ResourceKey<Item> EMERALD_SPEAR_RK = ItemsUtil.create("emerald_spear");
    public static final Item EMERALD_SPEAR = ItemsUtil.register(EMERALD_SPEAR_RK, Item::new,
            new Item.Properties().spear(GemsToolMaterial.EMERALD, 1.0F, 1.25F, 0.55F, 2.75F, 10.5F, 6.75F, 5.1F, 10.75F, 4.6F));
    //armor
    public static final ResourceKey<Item> EMERALD_HELMET_RK = ItemsUtil.create("emerald_HELMET");
    public static final Item EMERALD_HELMET = ItemsUtil.register(EMERALD_HELMET_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.HELMET));
    public static final ResourceKey<Item> EMERALD_CHESTPLATE_RK = ItemsUtil.create("emerald_chestplate");
    public static final Item EMERALD_CHESTPLATE = ItemsUtil.register(EMERALD_CHESTPLATE_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.CHESTPLATE));
    public static final ResourceKey<Item> EMERALD_LEGGINGS_RK = ItemsUtil.create("emerald_leggings");
    public static final Item EMERALD_LEGGINGS = ItemsUtil.register(EMERALD_LEGGINGS_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.LEGGINGS));
    public static final ResourceKey<Item> EMERALD_BOOTS_RK = ItemsUtil.create("emerald_boots");
    public static final Item EMERALD_BOOTS = ItemsUtil.register(EMERALD_BOOTS_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.BOOTS));


    public static void initialize() {
        // This method is called to initialize static fields. If this method is not called, the static fields will be null
    }
}
