package fr.xotak.items.ruby;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class RubyRegistryEntry {
    private static final String MODID = "simple_gems";

    public static final RegistryKey<Block> ORE = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MODID, "ruby_ore"));
    public static final RegistryKey<Item> ITEM = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby"));
    public static final RegistryKey<Block> BLOCK = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MODID, "ruby_block"));
    public static final RegistryKey<Item> ORE_ITEM = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_ore"));
    public static final RegistryKey<Item> BLOCK_ITEM = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_block"));
    public static final RegistryKey<Item> SHOVEL = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_shovel"));
    public static final RegistryKey<Item> PICKAXE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_pickaxe"));
    public static final RegistryKey<Item> AXE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_axe"));
    public static final RegistryKey<Item> HOE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_hoe"));
    public static final RegistryKey<Item> SWORD = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_sword"));
    public static final RegistryKey<Item> HELMET = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_helmet"));
    public static final RegistryKey<Item> CHESTPLATE = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_chestplate"));
    public static final RegistryKey<Item> LEGGINGS = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_leggings"));
    public static final RegistryKey<Item> BOOTS = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, "ruby_boots"));


    public static void initialize() {}

}
