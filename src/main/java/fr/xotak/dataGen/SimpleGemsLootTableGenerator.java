package fr.xotak.dataGen;

import fr.xotak.items.ruby.RubyToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class SimpleGemsLootTableGenerator extends FabricBlockLootTableProvider {
    public SimpleGemsLootTableGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(RubyToolSet.RUBY_ORE, drops(RubyToolSet.RUBY_ITEM));
        addDrop(RubyToolSet.RUBY_BLOCK, drops(RubyToolSet.RUBY_BLOCK_ITEM));
    }
}
