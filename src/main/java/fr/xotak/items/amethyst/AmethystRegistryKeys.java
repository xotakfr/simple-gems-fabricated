package fr.xotak.items.amethyst;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class AmethystRegistryKeys {
    private static final String MODID = "simple_gems";
    public static final RegistryKey<Item> SHOVEL = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_shovel"));
    public static final RegistryKey<Item> PICKAXE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_pickaxe"));
    public static final RegistryKey<Item> AXE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_axe"));
    public static final RegistryKey<Item> HOE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_hoe"));
    public static final RegistryKey<Item> SWORD = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_sword"));
    public static final RegistryKey<Item> HELMET = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_helmet"));
    public static final RegistryKey<Item> CHESTPLATE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_chestplate"));
    public static final RegistryKey<Item> LEGGINGS = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_leggings"));
    public static final RegistryKey<Item> BOOTS = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "amethyst_boots"));

    public static void initialize() {}

}
