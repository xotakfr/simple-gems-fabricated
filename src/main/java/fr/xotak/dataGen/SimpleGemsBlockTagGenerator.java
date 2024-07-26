package fr.xotak.dataGen;

import fr.xotak.items.ruby.RubyToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class SimpleGemsBlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public SimpleGemsBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Block> LEVEL_5_TOOLS_TAG = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric:need_tool_level_5"));
    public static final TagKey<Block> IRON_TOOLS_TAG = TagKey.of(RegistryKeys.BLOCK, Identifier.of("minecraft:incorrect_for_iron_tool"));
    public static final TagKey<Block> MINECRAFT_MINEABLE_BLOCK_TAGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("minecraft:mineable/pickaxe"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(IRON_TOOLS_TAG)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .setReplace(false);
        getOrCreateTagBuilder(MINECRAFT_MINEABLE_BLOCK_TAGS)
                .add(RubyToolSet.RUBY_ORE)
                .add(RubyToolSet.RUBY_BLOCK)
                .setReplace(false);
    }
}
