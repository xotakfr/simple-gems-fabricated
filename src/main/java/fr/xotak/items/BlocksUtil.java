package fr.xotak.items;

import fr.xotak.SimpleGems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class BlocksUtil {
    public static Block register(BlockItemId id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings) {
        Block block = register(id.block(), blockFactory, settings);

        BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(id.item()));
        Registry.register(BuiltInRegistries.ITEM, id.item(), blockItem);

        return block;
    }

    public static Block register(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings) {
        Block block = blockFactory.apply(settings.setId(id));

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    public static BlockItemId createBlockItemId(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(SimpleGems.MOD_ID, name);
        return BlockItemId.create(id, id);
    }

    public static ResourceKey<Block> createBlockId(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(SimpleGems.MOD_ID, name);
        return ResourceKey.create(Registries.BLOCK, id);
    }
}
