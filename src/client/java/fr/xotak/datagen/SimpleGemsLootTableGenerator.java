package fr.xotak.datagen;

import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class SimpleGemsLootTableGenerator extends FabricBlockLootTableProvider {
    public SimpleGemsLootTableGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        createSingleItemTableWithSilkTouch(RubyToolSet.RUBY_ORE, RubyToolSet.RUBY_ITEM);
        createSingleItemTable(RubyToolSet.RUBY_BLOCK_ITEM);
        createSingleItemTableWithSilkTouch(SapphireToolSet.SAPPHIRE_ORE, SapphireToolSet.SAPPHIRE_ITEM);
        createSingleItemTable(SapphireToolSet.SAPPHIRE_BLOCK_ITEM);
    }
}
