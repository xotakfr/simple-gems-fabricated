package fr.xotak.items.emerald;

import fr.xotak.items.amethyst.AmethystArmorItem;
import fr.xotak.items.materials.GemsArmorMaterial;
import fr.xotak.items.materials.GemsToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class EmeraldToolSet {
    //tools
    public static final ToolItem EMERALD_SHOVEL = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_shovel"),
            new ShovelItem(GemsToolMaterial.EMERALD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(GemsToolMaterial.EMERALD, 1.5F, -3.0F))));
    public static final ToolItem EMERALD_PICKAXE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_pickaxe"),
            new PickaxeItem(GemsToolMaterial.EMERALD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(GemsToolMaterial.EMERALD, 1.0F, -2.8F))));
    public static final ToolItem EMERALD_AXE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_axe"),
            new AxeItem(GemsToolMaterial.EMERALD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(GemsToolMaterial.EMERALD, 5, -3.0F))));
    public static final ToolItem EMERALD_HOE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_hoe"),
            new HoeItem(GemsToolMaterial.EMERALD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(GemsToolMaterial.EMERALD, -3, 0))));
    public static final ToolItem EMERALD_SWORD = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_sword"),
            new SwordItem(GemsToolMaterial.EMERALD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(GemsToolMaterial.EMERALD, 3, -2.4F))));
    //armor
    public static final Item EMERALD_HELMET = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_helmet"),
            new EmeraldArmorItem(GemsArmorMaterial.EMERALD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(33)));
    public static final Item EMERALD_CHESTPLATE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_chestplate"),
            new EmeraldArmorItem(GemsArmorMaterial.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(33)));
    public static final Item EMERALD_LEGGINGS = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_leggings"),
            new EmeraldArmorItem(GemsArmorMaterial.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(33)));
    public static final Item EMERALD_BOOTS = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "emerald_boots"),
            new EmeraldArmorItem(GemsArmorMaterial.EMERALD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(33)));

    public static void initialize() {}
}
