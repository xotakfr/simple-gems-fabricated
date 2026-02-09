package fr.xotak.items.emerald;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class EmeraldRegistryKeys {
    private static final String MODID = "simple_gems";
    public static final ResourceKey<Item> SHOVEL = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_shovel"));
    public static final ResourceKey<Item> PICKAXE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_pickaxe"));
    public static final ResourceKey<Item> AXE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_axe"));
    public static final ResourceKey<Item> HOE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_hoe"));
    public static final ResourceKey<Item> SWORD = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_sword"));
    public static final ResourceKey<Item> HELMET = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_helmet"));
    public static final ResourceKey<Item> CHESTPLATE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_chestplate"));
    public static final ResourceKey<Item> LEGGINGS = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_leggings"));
    public static final ResourceKey<Item> BOOTS = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "emerald_boots"));

    public static void initialize() {}
}
