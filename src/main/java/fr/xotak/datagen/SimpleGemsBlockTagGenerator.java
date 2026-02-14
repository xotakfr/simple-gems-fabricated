package fr.xotak.datagen;

import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import java.util.concurrent.CompletableFuture;

public class SimpleGemsBlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public SimpleGemsBlockTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Block> INCORRECT_FOR_LEVEL_5_TAG = TagKey.create(Registries.BLOCK, Identifier.parse("fabric:incorrect_for_level_5_tool"));

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_COPPER_TOOL)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK);
    }
}
