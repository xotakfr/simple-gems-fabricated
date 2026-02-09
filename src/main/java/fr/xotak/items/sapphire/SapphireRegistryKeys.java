package fr.xotak.items.sapphire;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class SapphireRegistryKeys {
    private static final String MODID = "simple_gems";

    public static final ResourceKey<Block> ORE = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MODID, "sapphire_ore"));
    public static final ResourceKey<Item> ITEM = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire"));
    public static final ResourceKey<Block> BLOCK = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MODID, "sapphire_block"));
    public static final ResourceKey<Item> ORE_ITEM = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_ore"));
    public static final ResourceKey<Item> BLOCK_ITEM = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_block"));
    public static final ResourceKey<Item> SHOVEL = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_shovel"));
    public static final ResourceKey<Item> PICKAXE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_pickaxe"));
    public static final ResourceKey<Item> AXE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_axe"));
    public static final ResourceKey<Item> HOE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_hoe"));
    public static final ResourceKey<Item> SWORD = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_sword"));
    public static final ResourceKey<Item> HELMET = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_helmet"));
    public static final ResourceKey<Item> CHESTPLATE = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_chestplate"));
    public static final ResourceKey<Item> LEGGINGS = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_leggings"));
    public static final ResourceKey<Item> BOOTS = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, "sapphire_boots"));


    public static void initialize() {}
}
