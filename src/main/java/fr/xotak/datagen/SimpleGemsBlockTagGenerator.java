package fr.xotak.datagen;

import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class SimpleGemsBlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public SimpleGemsBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Block> INCORRECT_FOR_LEVEL_5_TAG = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric:incorrect_for_level_5_tool"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .add(SapphireToolSet.SAPPHIRE_ORE)
                .add(SapphireToolSet.SAPPHIRE_BLOCK);
    }
}
