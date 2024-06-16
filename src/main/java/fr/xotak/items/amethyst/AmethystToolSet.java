package fr.xotak.items.amethyst;

import fr.xotak.items.materials.GemsArmorMaterial;
import fr.xotak.items.materials.GemsToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AmethystToolSet {
    //tools
    public static final ToolItem AMETHYST_SHOVEL = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_shovel"),
            new ShovelItem(GemsToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(GemsToolMaterial.AMETHYST, 1, -3.0F))));
    public static final ToolItem AMETHYST_PICKAXE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_pickaxe"),
            new PickaxeItem(GemsToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(GemsToolMaterial.AMETHYST, 0, -2.8F))));
    public static final ToolItem AMETHYST_AXE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_axe"),
            new AxeItem(GemsToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(GemsToolMaterial.AMETHYST, 4, -3.0F))));
    public static final ToolItem AMETHYST_HOE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_hoe"),
            new HoeItem(GemsToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(GemsToolMaterial.AMETHYST, -6, 0))));
    public static final ToolItem AMETHYST_SWORD = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_sword"),
            new SwordItem(GemsToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(GemsToolMaterial.AMETHYST, 2, -2.4F))));
    //armor
    public static final Item AMETHYST_HELMET = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_helmet"),
            new AmethystArmorItem(GemsArmorMaterial.AMETHYST, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item AMETHYST_CHESTPLATE = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_chestplate"),
            new AmethystArmorItem(GemsArmorMaterial.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item AMETHYST_LEGGINGS = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_leggings"),
            new AmethystArmorItem(GemsArmorMaterial.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item AMETHYST_BOOTS = Registry.register(Registries.ITEM, Identifier.of("simple_gems", "amethyst_boots"),
            new AmethystArmorItem(GemsArmorMaterial.AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static void initialize() {}
}
