package fr.xotak.datagen;

import fr.xotak.items.AmethystToolSet;
import fr.xotak.items.EmeraldToolSet;
import fr.xotak.items.RubyToolSet;
import fr.xotak.items.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.ItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class SimpleGemsItemTagGenerator extends FabricTagsProvider.ItemTagsProvider {
    public SimpleGemsItemTagGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Item> RUBIES = TagKey.create(Registries.ITEM, Identifier.parse("c:ruby"));
    public static final TagKey<Item> SAPPHIRE = TagKey.create(Registries.ITEM, Identifier.parse("c:sapphire"));
    public static final TagKey<Item> REPAIRS_AMETHYST_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("c:repairs_amethyst_armor"));
    public static final TagKey<Item> AMETHYST_TOOL_MATERIALS = TagKey.create(Registries.ITEM, Identifier.parse("c:amethyst_tool_materials"));
    public static final TagKey<Item> REPAIRS_EMERALD_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("c:repairs_emerald_armor"));
    public static final TagKey<Item> EMERALD_TOOL_MATERIALS = TagKey.create(Registries.ITEM, Identifier.parse("c:emerald_tool_materials"));
    public static final TagKey<Item> REPAIRS_RUBY_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("c:repairs_ruby_armor"));
    public static final TagKey<Item> RUBY_TOOL_MATERIALS = TagKey.create(Registries.ITEM, Identifier.parse("c:ruby_tool_materials"));
    public static final TagKey<Item> REPAIRS_SAPPHIRE_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("c:repairs_sapphire_armor"));
    public static final TagKey<Item> SAPPHIRE_TOOL_MATERIALS = TagKey.create(Registries.ITEM, Identifier.parse("c:sapphire_tool_materials"));
    public static final TagKey<Item> RUBY_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("c:ruby_armor"));
    public static final TagKey<Item> SAPPHIRE_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("c:sapphire_armor"));
    public static final TagKey<Item> AMETHYST_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("c:amethyst_armor"));
    public static final TagKey<Item> EMERALD_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("c:emerald_armor"));
    public static final TagKey<Item> MOD_ARMORS = TagKey.create(Registries.ITEM, Identifier.parse("simple_gems:armors"));
    public static final TagKey<Item> WEAVABLE = TagKey.create(Registries.ITEM, Identifier.parse("simple_gems:weavable"));


    @Override
    protected void addTags(HolderLookup.Provider arg) {
        builder(RUBIES)
                .add(RubyToolSet.RUBY_ITEM_RK)
                .setReplace(false);
        builder(SAPPHIRE)
                .add(SapphireToolSet.SAPPHIRE_ITEM_RK)
                .setReplace(false);
        builder(REPAIRS_AMETHYST_ARMOR)
                .add(ItemIds.AMETHYST_SHARD);
        builder(AMETHYST_TOOL_MATERIALS)
                .add(ItemIds.AMETHYST_SHARD);
        builder(REPAIRS_EMERALD_ARMOR)
                .add(ItemIds.EMERALD);
        builder(EMERALD_TOOL_MATERIALS)
                .add(ItemIds.EMERALD);
        builder(REPAIRS_RUBY_ARMOR)
                .add(RubyToolSet.RUBY_ITEM_RK);
        builder(RUBY_TOOL_MATERIALS)
                .add(RubyToolSet.RUBY_ITEM_RK);
        builder(REPAIRS_SAPPHIRE_ARMOR)
                .add(SapphireToolSet.SAPPHIRE_ITEM_RK);
        builder(SAPPHIRE_TOOL_MATERIALS)
                .add(SapphireToolSet.SAPPHIRE_ITEM_RK);
        builder(ItemTags.SHOVELS)
                .add(AmethystToolSet.AMETHYST_SHOVEL_RK)
                .add(EmeraldToolSet.EMERALD_SHOVEL_RK)
                .add(RubyToolSet.RUBY_SHOVEL_RK)
                .add(SapphireToolSet.SAPPHIRE_SHOVEL_RK)
                .setReplace(false);
        builder(ItemTags.PICKAXES)
                .add(AmethystToolSet.AMETHYST_PICKAXE_RK)
                .add(EmeraldToolSet.EMERALD_PICKAXE_RK)
                .add(RubyToolSet.RUBY_PICKAXE_RK)
                .add(SapphireToolSet.SAPPHIRE_PICKAXE_RK)
                .setReplace(false);
        builder(ItemTags.AXES)
                .add(AmethystToolSet.AMETHYST_AXE_RK)
                .add(EmeraldToolSet.EMERALD_AXE_RK)
                .add(RubyToolSet.RUBY_AXE_RK)
                .add(SapphireToolSet.SAPPHIRE_AXE_RK)
                .setReplace(false);
        builder(ItemTags.HOES)
                .add(AmethystToolSet.AMETHYST_HOE_RK)
                .add(EmeraldToolSet.EMERALD_HOE_RK)
                .add(RubyToolSet.RUBY_HOE_RK)
                .add(SapphireToolSet.SAPPHIRE_HOE_RK)
                .setReplace(false);
        builder(ItemTags.SWORDS)
                .add(AmethystToolSet.AMETHYST_SWORD_RK)
                .add(EmeraldToolSet.EMERALD_SWORD_RK)
                .add(RubyToolSet.RUBY_SWORD_RK)
                .add(SapphireToolSet.SAPPHIRE_SWORD_RK)
                .setReplace(false);
        builder(ItemTags.HEAD_ARMOR)
                .add(AmethystToolSet.AMETHYST_HELMET_RK)
                .add(EmeraldToolSet.EMERALD_HELMET_RK)
                .add(RubyToolSet.RUBY_HELMET_RK)
                .add(SapphireToolSet.SAPPHIRE_HELMET_RK)
                .setReplace(false);
        builder(ItemTags.CHEST_ARMOR)
                .add(AmethystToolSet.AMETHYST_CHESTPLATE_RK)
                .add(EmeraldToolSet.EMERALD_CHESTPLATE_RK)
                .add(RubyToolSet.RUBY_CHESTPLATE_RK)
                .add(SapphireToolSet.SAPPHIRE_CHESTPLATE_RK)
                .setReplace(false);
        builder(ItemTags.LEG_ARMOR)
                .add(AmethystToolSet.AMETHYST_LEGGINGS_RK)
                .add(EmeraldToolSet.EMERALD_LEGGINGS_RK)
                .add(RubyToolSet.RUBY_LEGGINGS_RK)
                .add(SapphireToolSet.SAPPHIRE_LEGGINGS_RK)
                .setReplace(false);
        builder(ItemTags.FOOT_ARMOR)
                .add(AmethystToolSet.AMETHYST_BOOTS_RK)
                .add(EmeraldToolSet.EMERALD_BOOTS_RK)
                .add(RubyToolSet.RUBY_BOOTS_RK)
                .add(SapphireToolSet.SAPPHIRE_BOOTS_RK)
                .setReplace(false);
        builder(RUBY_ARMOR)
                .add(RubyToolSet.RUBY_HELMET_RK)
                .add(RubyToolSet.RUBY_CHESTPLATE_RK)
                .add(RubyToolSet.RUBY_LEGGINGS_RK)
                .add(RubyToolSet.RUBY_BOOTS_RK)
                .setReplace(false);
        builder(SAPPHIRE_ARMOR)
                .add(SapphireToolSet.SAPPHIRE_HELMET_RK)
                .add(SapphireToolSet.SAPPHIRE_CHESTPLATE_RK)
                .add(SapphireToolSet.SAPPHIRE_LEGGINGS_RK)
                .add(SapphireToolSet.SAPPHIRE_BOOTS_RK)
                .setReplace(false);
        builder(AMETHYST_ARMOR)
                .add(AmethystToolSet.AMETHYST_HELMET_RK)
                .add(AmethystToolSet.AMETHYST_CHESTPLATE_RK)
                .add(AmethystToolSet.AMETHYST_LEGGINGS_RK)
                .add(AmethystToolSet.AMETHYST_BOOTS_RK)
                .setReplace(false);
        builder(EMERALD_ARMOR)
                .add(EmeraldToolSet.EMERALD_HELMET_RK)
                .add(EmeraldToolSet.EMERALD_CHESTPLATE_RK)
                .add(EmeraldToolSet.EMERALD_LEGGINGS_RK)
                .add(EmeraldToolSet.EMERALD_BOOTS_RK)
                .setReplace(false);
        builder(MOD_ARMORS)
                .addTag(RUBY_ARMOR)
                .addTag(SAPPHIRE_ARMOR)
                .addTag(AMETHYST_ARMOR)
                .addTag(EMERALD_ARMOR);
        builder(WEAVABLE)
                .add(ItemIds.AMETHYST_SHARD)
                .add(ItemIds.EMERALD)
                .add(RubyToolSet.RUBY_ITEM_RK)
                .add(SapphireToolSet.SAPPHIRE_ITEM_RK);
    }
}
