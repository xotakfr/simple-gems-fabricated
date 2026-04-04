package fr.xotak.datagen;

import fr.xotak.items.RubyToolSet;
import fr.xotak.items.SapphireToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class SimpleGemsLootTableGenerator extends FabricBlockLootSubProvider {
    public SimpleGemsLootTableGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        createSingleItemTableWithSilkTouch(RubyToolSet.RUBY_ORE, RubyToolSet.RUBY_ITEM);
        createSingleItemTable(RubyToolSet.RUBY_BLOCK);
        createSingleItemTableWithSilkTouch(SapphireToolSet.SAPPHIRE_ORE, SapphireToolSet.SAPPHIRE_ITEM);
        createSingleItemTable(SapphireToolSet.SAPPHIRE_BLOCK);
    }
}
