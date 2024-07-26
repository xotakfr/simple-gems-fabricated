package fr.xotak.dataGen;

import fr.xotak.items.ruby.RubyToolSet;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class SimpleGemsItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public SimpleGemsItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    private static final TagKey<Item> RUBIES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:rubies"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(RUBIES)
                .add(RubyToolSet.RUBY_ITEM)
                .setReplace(false);

    }
}
