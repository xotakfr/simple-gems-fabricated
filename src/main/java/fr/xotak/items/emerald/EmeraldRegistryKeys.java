package fr.xotak.items.emerald;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class EmeraldRegistryKeys {
    private static final String MODID = "simple_gems";
    public static final RegistryKey<Item> SHOVEL = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_shovel"));
    public static final RegistryKey<Item> PICKAXE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_pickaxe"));
    public static final RegistryKey<Item> AXE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_axe"));
    public static final RegistryKey<Item> HOE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_hoe"));
    public static final RegistryKey<Item> SWORD = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_sword"));
    public static final RegistryKey<Item> HELMET = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_helmet"));
    public static final RegistryKey<Item> CHESTPLATE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_chestplate"));
    public static final RegistryKey<Item> LEGGINGS = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_leggings"));
    public static final RegistryKey<Item> BOOTS = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "emerald_boots"));

    public static void initialize() {}
}
