package fr.xotak.items.amethyst;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class AmethystRegistryKeys {
    private static final String MODID = "simple_gems";
    public static final ResourceKey<Item> SHOVEL = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_shovel"));
    public static final ResourceKey<Item> PICKAXE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_pickaxe"));
    public static final ResourceKey<Item> AXE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_axe"));
    public static final ResourceKey<Item> HOE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_hoe"));
    public static final ResourceKey<Item> SWORD = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_sword"));
    public static final ResourceKey<Item> HELMET = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_helmet"));
    public static final ResourceKey<Item> CHESTPLATE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_chestplate"));
    public static final ResourceKey<Item> LEGGINGS = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_leggings"));
    public static final ResourceKey<Item> BOOTS = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "amethyst_boots"));

    public static void initialize() {}

}
