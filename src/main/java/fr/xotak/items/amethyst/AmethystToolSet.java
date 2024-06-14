package fr.xotak.items.amethyst;

import fr.xotak.items.materials.amethyst.AmethystArmorMaterial;
import fr.xotak.items.materials.amethyst.AmethystToolMaterial;
import fr.xotak.items.ruby.RubyArmorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AmethystToolSet {
    //tools
    public static final ToolItem AMETHYST_SHOVEL = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_shovel"),
            new ShovelItem(AmethystToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings()));
    public static final ToolItem AMETHYST_PICKAXE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_pickaxe"),
            new PickaxeItem(AmethystToolMaterial.INSTANCE, 0, -2.8F, new Item.Settings()));
    public static final ToolItem AMETHYST_AXE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_axe"),
            new AxeItem(AmethystToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings()));
    public static final ToolItem AMETHYST_HOE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_hoe"),
            new HoeItem(AmethystToolMaterial.INSTANCE, -6, 0, new Item.Settings()));
    public static final ToolItem AMETHYST_SWORD = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_sword"),
            new SwordItem(AmethystToolMaterial.INSTANCE, 2, -2.4F, new Item.Settings()));
    //armor
    public static final Item AMETHYST_HELMET = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_helmet"),
            new RubyArmorItem(AmethystArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item AMETHYST_CHESTPLATE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_chestplate"),
            new RubyArmorItem(AmethystArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item AMETHYST_LEGGINGS = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_leggings"),
            new RubyArmorItem(AmethystArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item AMETHYST_BOOTS = Registry.register(Registries.ITEM, new Identifier("simple_gems", "amethyst_boots"),
            new RubyArmorItem(AmethystArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static void initialize() {}
}
