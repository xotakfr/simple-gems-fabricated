package fr.xotak.datagen;

import fr.xotak.items.RubyToolSet;
import fr.xotak.items.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import java.util.concurrent.CompletableFuture;

public class SimpleGemsBlockTagGenerator extends FabricTagsProvider.BlockTagsProvider {
    public SimpleGemsBlockTagGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Block> INCORRECT_FOR_LEVEL_5_TAG = TagKey.create(Registries.BLOCK, Identifier.parse("fabric:incorrect_for_level_5_tool"));

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(RubyToolSet.RUBY_ORE_RK)
                .add(RubyToolSet.RUBY_BLOCK_RK)
                .add(SapphireToolSet.SAPPHIRE_ORE_RK)
                .add(SapphireToolSet.SAPPHIRE_BLOCK_RK)
                .setReplace(false);
        builder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(RubyToolSet.RUBY_ORE_RK)
                .add(RubyToolSet.RUBY_BLOCK_RK)
                .add(SapphireToolSet.SAPPHIRE_ORE_RK)
                .add(SapphireToolSet.SAPPHIRE_BLOCK_RK)
                .setReplace(false);
        builder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(RubyToolSet.RUBY_ORE_RK)
                .add(RubyToolSet.RUBY_BLOCK_RK)
                .add(SapphireToolSet.SAPPHIRE_ORE_RK)
                .add(SapphireToolSet.SAPPHIRE_BLOCK_RK)
                .setReplace(false);
        builder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(RubyToolSet.RUBY_ORE_RK)
                .add(RubyToolSet.RUBY_BLOCK_RK)
                .add(SapphireToolSet.SAPPHIRE_ORE_RK)
                .add(SapphireToolSet.SAPPHIRE_BLOCK_RK)
                .setReplace(false);
        builder(BlockTags.INCORRECT_FOR_COPPER_TOOL)
                .add(RubyToolSet.RUBY_ORE_RK)
                .add(RubyToolSet.RUBY_BLOCK_RK)
                .add(SapphireToolSet.SAPPHIRE_ORE_RK)
                .add(SapphireToolSet.SAPPHIRE_BLOCK_RK)
                .setReplace(false);
        builder(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(RubyToolSet.RUBY_ORE_RK)
                .add(RubyToolSet.RUBY_BLOCK_RK)
                .add(SapphireToolSet.SAPPHIRE_ORE_RK)
                .add(SapphireToolSet.SAPPHIRE_BLOCK_RK)
                .setReplace(false);
        builder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(RubyToolSet.RUBY_ORE_RK)
                .add(RubyToolSet.RUBY_BLOCK_RK)
                .add(SapphireToolSet.SAPPHIRE_ORE_RK)
                .add(SapphireToolSet.SAPPHIRE_BLOCK_RK)
                .setReplace(false);
        builder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .add(SapphireToolSet.SAPPHIRE_ORE_RK)
                .add(SapphireToolSet.SAPPHIRE_BLOCK_RK);
    }
}
