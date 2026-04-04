package fr.xotak.items.emerald;

import fr.xotak.items.ItemsUtil;
import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;


public class EmeraldToolSet {
    //tools
    public static final Item EMERALD_SHOVEL = ItemsUtil.register("emerald_shovel", Item::new,
            new Item.Properties().shovel(GemsToolMaterial.EMERALD, 1.5F, -3.0F));
    public static final Item EMERALD_PICKAXE = ItemsUtil.register("emerald_pickaxe", Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.EMERALD, 1.0F, -2.8F));
    public static final Item EMERALD_AXE = ItemsUtil.register("emerald_axe", Item::new,
            new Item.Properties().axe(GemsToolMaterial.EMERALD, 6.0F, -3.0F));
    public static final Item EMERALD_HOE = ItemsUtil.register("emerald_hoe", Item::new,
            new Item.Properties().hoe(GemsToolMaterial.EMERALD, 0.0F, -3.0F));
    public static final Item EMERALD_SWORD = ItemsUtil.register("emerald_sword", Item::new,
            new Item.Properties().sword(GemsToolMaterial.EMERALD, 3.0F, -2.4F));
    //armor
    public static final Item EMERALD_HELMET = ItemsUtil.register("emerald_helmet", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.HELMET));
    public static final Item EMERALD_CHESTPLATE = ItemsUtil.register("emerald_chestplate", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.CHESTPLATE));
    public static final Item EMERALD_LEGGINGS = ItemsUtil.register("emerald_leggings", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.LEGGINGS));
    public static final Item EMERALD_BOOTS = ItemsUtil.register("emerald_boots", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.EMERALD, ArmorType.BOOTS));


    public static void initialize() {
        // This method is called to initialize static fields. If this method is not called, the static fields will be null
    }
}
