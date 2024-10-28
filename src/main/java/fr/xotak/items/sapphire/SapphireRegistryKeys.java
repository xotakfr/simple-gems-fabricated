package fr.xotak.items.sapphire;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class SapphireRegistryKeys {
    private static final String MODID = "simple_gems";

    public static final RegistryKey<Block> ORE = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MODID, "sapphire_ore"));
    public static final RegistryKey<Item> ITEM = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire"));
    public static final RegistryKey<Block> BLOCK = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MODID, "sapphire_block"));
    public static final RegistryKey<Item> ORE_ITEM = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_ore"));
    public static final RegistryKey<Item> BLOCK_ITEM = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_block"));
    public static final RegistryKey<Item> SHOVEL = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_shovel"));
    public static final RegistryKey<Item> PICKAXE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_pickaxe"));
    public static final RegistryKey<Item> AXE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_axe"));
    public static final RegistryKey<Item> HOE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_hoe"));
    public static final RegistryKey<Item> SWORD = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_sword"));
    public static final RegistryKey<Item> HELMET = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_helmet"));
    public static final RegistryKey<Item> CHESTPLATE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_chestplate"));
    public static final RegistryKey<Item> LEGGINGS = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_leggings"));
    public static final RegistryKey<Item> BOOTS = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "sapphire_boots"));


    public static void initialize() {}
}
