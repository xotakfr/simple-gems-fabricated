package fr.xotak.datagen;

import fr.xotak.items.amethyst.AmethystToolSet;import fr.xotak.items.emerald.EmeraldArmorItem;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class SimpleGemsItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public SimpleGemsItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Item> RUBIES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:ruby"));
    public static final TagKey<Item> SAPPHIRE = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:sapphire"));
    public static final TagKey<Item> REPAIRS_AMETHYST_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:repairs_amethyst_armor"));
    public static final TagKey<Item> AMETHYST_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:amethyst_tool_materials"));
    public static final TagKey<Item> REPAIRS_EMERALD_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:repairs_emerald_armor"));
    public static final TagKey<Item> EMERALD_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:emerald_tool_materials"));
    public static final TagKey<Item> REPAIRS_RUBY_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:repairs_ruby_armor"));
    public static final TagKey<Item> RUBY_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:ruby_tool_materials"));
    public static final TagKey<Item> REPAIRS_SAPPHIRE_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:repairs_sapphire_armor"));
    public static final TagKey<Item> SAPPHIRE_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:sapphire_tool_materials"));
    public static final TagKey<Item> RUBY_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:ruby_armor"));
    public static final TagKey<Item> SAPPHIRE_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:sapphire_armor"));
    public static final TagKey<Item> AMETHYST_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:amethyst_armor"));
    public static final TagKey<Item> EMERALD_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:emerald_armor"));


    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(RUBIES)
                .add(RubyToolSet.RUBY_ITEM)
                .setReplace(false);
        getOrCreateTagBuilder(SAPPHIRE)
                .add(SapphireToolSet.SAPPHIRE_ITEM)
                .setReplace(false);
        getOrCreateTagBuilder(REPAIRS_AMETHYST_ARMOR)
                .add(Items.AMETHYST_SHARD);
        getOrCreateTagBuilder(AMETHYST_TOOL_MATERIALS)
                .add(Items.AMETHYST_SHARD);
        getOrCreateTagBuilder(REPAIRS_EMERALD_ARMOR)
                .add(Items.EMERALD);
        getOrCreateTagBuilder(EMERALD_TOOL_MATERIALS)
                .add(Items.EMERALD);
        getOrCreateTagBuilder(REPAIRS_RUBY_ARMOR)
                .add(RubyToolSet.RUBY_ITEM);
        getOrCreateTagBuilder(RUBY_TOOL_MATERIALS)
                .add(RubyToolSet.RUBY_ITEM);
        getOrCreateTagBuilder(REPAIRS_SAPPHIRE_ARMOR)
                .add(SapphireToolSet.SAPPHIRE_ITEM);
        getOrCreateTagBuilder(SAPPHIRE_TOOL_MATERIALS)
                .add(SapphireToolSet.SAPPHIRE_ITEM);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(AmethystToolSet.AMETHYST_SHOVEL)
                .add(EmeraldToolSet.EMERALD_SHOVEL)
                .add(RubyToolSet.RUBY_SHOVEL)
                .add(SapphireToolSet.SAPPHIRE_SHOVEL)
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(AmethystToolSet.AMETHYST_PICKAXE)
                .add(EmeraldToolSet.EMERALD_PICKAXE)
                .add(RubyToolSet.RUBY_PICKAXE)
                .add(SapphireToolSet.SAPPHIRE_PICKAXE)
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(AmethystToolSet.AMETHYST_AXE)
                .add(EmeraldToolSet.EMERALD_AXE)
                .add(RubyToolSet.RUBY_AXE)
                .add(SapphireToolSet.SAPPHIRE_AXE)
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(AmethystToolSet.AMETHYST_HOE)
                .add(EmeraldToolSet.EMERALD_HOE)
                .add(RubyToolSet.RUBY_HOE)
                .add(SapphireToolSet.SAPPHIRE_HOE)
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(AmethystToolSet.AMETHYST_SWORD)
                .add(EmeraldToolSet.EMERALD_SWORD)
                .add(RubyToolSet.RUBY_SWORD)
                .add(SapphireToolSet.SAPPHIRE_SWORD)
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(AmethystToolSet.AMETHYST_HELMET)
                .add(EmeraldToolSet.EMERALD_HELMET)
                .add(RubyToolSet.RUBY_HELMET)
                .add(SapphireToolSet.SAPPHIRE_HELMET)
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(AmethystToolSet.AMETHYST_CHESTPLATE)
                .add(EmeraldToolSet.EMERALD_CHESTPLATE)
                .add(RubyToolSet.RUBY_CHESTPLATE)
                .add(SapphireToolSet.SAPPHIRE_CHESTPLATE)
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(AmethystToolSet.AMETHYST_LEGGINGS)
                .add(EmeraldToolSet.EMERALD_LEGGINGS)
                .add(RubyToolSet.RUBY_LEGGINGS)
                .add(SapphireToolSet.SAPPHIRE_LEGGINGS)
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(AmethystToolSet.AMETHYST_BOOTS)
                .add(EmeraldToolSet.EMERALD_BOOTS)
                .add(RubyToolSet.RUBY_BOOTS)
                .add(SapphireToolSet.SAPPHIRE_BOOTS)
                .setReplace(false);
        getOrCreateTagBuilder(RUBY_ARMOR)
                .add(RubyToolSet.RUBY_HELMET)
                .add(RubyToolSet.RUBY_CHESTPLATE)
                .add(RubyToolSet.RUBY_LEGGINGS)
                .add(RubyToolSet.RUBY_BOOTS)
                .setReplace(false);
        getOrCreateTagBuilder(SAPPHIRE_ARMOR)
                .add(SapphireToolSet.SAPPHIRE_HELMET)
                .add(SapphireToolSet.SAPPHIRE_CHESTPLATE)
                .add(SapphireToolSet.SAPPHIRE_LEGGINGS)
                .add(SapphireToolSet.SAPPHIRE_BOOTS)
                .setReplace(false);
        getOrCreateTagBuilder(AMETHYST_ARMOR)
                .add(AmethystToolSet.AMETHYST_HELMET)
                .add(AmethystToolSet.AMETHYST_CHESTPLATE)
                .add(AmethystToolSet.AMETHYST_LEGGINGS)
                .add(AmethystToolSet.AMETHYST_BOOTS)
                .setReplace(false);
        getOrCreateTagBuilder(EMERALD_ARMOR)
                .add(EmeraldToolSet.EMERALD_HELMET)
                .add(EmeraldToolSet.EMERALD_CHESTPLATE)
                .add(EmeraldToolSet.EMERALD_LEGGINGS)
                .add(EmeraldToolSet.EMERALD_BOOTS)
                .setReplace(false);
    }
}
