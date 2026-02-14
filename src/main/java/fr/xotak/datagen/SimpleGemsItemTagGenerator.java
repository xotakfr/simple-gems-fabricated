package fr.xotak.datagen;

import fr.xotak.items.amethyst.AmethystToolSet;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Date;
import java.util.concurrent.CompletableFuture;

public class SimpleGemsItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public SimpleGemsItemTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
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
        valueLookupBuilder(RUBIES)
                .add(RubyToolSet.RUBY_ITEM)
                .setReplace(false);
        valueLookupBuilder(SAPPHIRE)
                .add(SapphireToolSet.SAPPHIRE_ITEM)
                .setReplace(false);
        valueLookupBuilder(REPAIRS_AMETHYST_ARMOR)
                .add(Items.AMETHYST_SHARD);
        valueLookupBuilder(AMETHYST_TOOL_MATERIALS)
                .add(Items.AMETHYST_SHARD);
        valueLookupBuilder(REPAIRS_EMERALD_ARMOR)
                .add(Items.EMERALD);
        valueLookupBuilder(EMERALD_TOOL_MATERIALS)
                .add(Items.EMERALD);
        valueLookupBuilder(REPAIRS_RUBY_ARMOR)
                .add(RubyToolSet.RUBY_ITEM);
        valueLookupBuilder(RUBY_TOOL_MATERIALS)
                .add(RubyToolSet.RUBY_ITEM);
        valueLookupBuilder(REPAIRS_SAPPHIRE_ARMOR)
                .add(SapphireToolSet.SAPPHIRE_ITEM);
        valueLookupBuilder(SAPPHIRE_TOOL_MATERIALS)
                .add(SapphireToolSet.SAPPHIRE_ITEM);
        valueLookupBuilder(ItemTags.SHOVELS)
                .add(AmethystToolSet.AMETHYST_SHOVEL)
                .add(EmeraldToolSet.EMERALD_SHOVEL)
                .add(RubyToolSet.RUBY_SHOVEL)
                .add(SapphireToolSet.SAPPHIRE_SHOVEL)
                .setReplace(false);
        valueLookupBuilder(ItemTags.PICKAXES)
                .add(AmethystToolSet.AMETHYST_PICKAXE)
                .add(EmeraldToolSet.EMERALD_PICKAXE)
                .add(RubyToolSet.RUBY_PICKAXE)
                .add(SapphireToolSet.SAPPHIRE_PICKAXE)
                .setReplace(false);
        valueLookupBuilder(ItemTags.AXES)
                .add(AmethystToolSet.AMETHYST_AXE)
                .add(EmeraldToolSet.EMERALD_AXE)
                .add(RubyToolSet.RUBY_AXE)
                .add(SapphireToolSet.SAPPHIRE_AXE)
                .setReplace(false);
        valueLookupBuilder(ItemTags.HOES)
                .add(AmethystToolSet.AMETHYST_HOE)
                .add(EmeraldToolSet.EMERALD_HOE)
                .add(RubyToolSet.RUBY_HOE)
                .add(SapphireToolSet.SAPPHIRE_HOE)
                .setReplace(false);
        valueLookupBuilder(ItemTags.SWORDS)
                .add(AmethystToolSet.AMETHYST_SWORD)
                .add(EmeraldToolSet.EMERALD_SWORD)
                .add(RubyToolSet.RUBY_SWORD)
                .add(SapphireToolSet.SAPPHIRE_SWORD)
                .setReplace(false);
        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(AmethystToolSet.AMETHYST_HELMET)
                .add(EmeraldToolSet.EMERALD_HELMET)
                .add(RubyToolSet.RUBY_HELMET)
                .add(SapphireToolSet.SAPPHIRE_HELMET)
                .setReplace(false);
        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(AmethystToolSet.AMETHYST_CHESTPLATE)
                .add(EmeraldToolSet.EMERALD_CHESTPLATE)
                .add(RubyToolSet.RUBY_CHESTPLATE)
                .add(SapphireToolSet.SAPPHIRE_CHESTPLATE)
                .setReplace(false);
        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(AmethystToolSet.AMETHYST_LEGGINGS)
                .add(EmeraldToolSet.EMERALD_LEGGINGS)
                .add(RubyToolSet.RUBY_LEGGINGS)
                .add(SapphireToolSet.SAPPHIRE_LEGGINGS)
                .setReplace(false);
        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(AmethystToolSet.AMETHYST_BOOTS)
                .add(EmeraldToolSet.EMERALD_BOOTS)
                .add(RubyToolSet.RUBY_BOOTS)
                .add(SapphireToolSet.SAPPHIRE_BOOTS)
                .setReplace(false);
        valueLookupBuilder(RUBY_ARMOR)
                .add(RubyToolSet.RUBY_HELMET)
                .add(RubyToolSet.RUBY_CHESTPLATE)
                .add(RubyToolSet.RUBY_LEGGINGS)
                .add(RubyToolSet.RUBY_BOOTS)
                .setReplace(false);
        valueLookupBuilder(SAPPHIRE_ARMOR)
                .add(SapphireToolSet.SAPPHIRE_HELMET)
                .add(SapphireToolSet.SAPPHIRE_CHESTPLATE)
                .add(SapphireToolSet.SAPPHIRE_LEGGINGS)
                .add(SapphireToolSet.SAPPHIRE_BOOTS)
                .setReplace(false);
        valueLookupBuilder(AMETHYST_ARMOR)
                .add(AmethystToolSet.AMETHYST_HELMET)
                .add(AmethystToolSet.AMETHYST_CHESTPLATE)
                .add(AmethystToolSet.AMETHYST_LEGGINGS)
                .add(AmethystToolSet.AMETHYST_BOOTS)
                .setReplace(false);
        valueLookupBuilder(EMERALD_ARMOR)
                .add(EmeraldToolSet.EMERALD_HELMET)
                .add(EmeraldToolSet.EMERALD_CHESTPLATE)
                .add(EmeraldToolSet.EMERALD_LEGGINGS)
                .add(EmeraldToolSet.EMERALD_BOOTS)
                .setReplace(false);
        valueLookupBuilder(MOD_ARMORS)
                .addTag(RUBY_ARMOR)
                .addTag(SAPPHIRE_ARMOR)
                .addTag(AMETHYST_ARMOR)
                .addTag(EMERALD_ARMOR);
        valueLookupBuilder(WEAVABLE)
                .add(Items.AMETHYST_SHARD)
                .add(Items.EMERALD)
                .add(RubyToolSet.RUBY_ITEM)
                .add(SapphireToolSet.SAPPHIRE_ITEM);
    }
}
