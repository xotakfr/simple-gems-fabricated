package fr.xotak;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleGems implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("simple-gems");

	// Ruby toolset
	public static final Block RUBY_ORE = Registry.register(Registries.BLOCK, new Identifier("simple_gems", "ruby_ore"),
			new ExperienceDroppingBlock(Block.Settings.create().strength(3.0F).requiresTool(), UniformIntProvider.create(4, 8)));
	public static final RubyItem RUBY_ITEM = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby"),
			new RubyItem(new Item.Settings()));
	public static final Block RUBY_BLOCK = Registry.register(Registries.BLOCK, new Identifier("simple_gems", "ruby_block"),
			new Block(Block.Settings.create().strength(3.0F).requiresTool()));
	public static final ToolItem RUBY_SHOVEL = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_shovel"),
			new ShovelItem(RubyToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings()));
	public static final ToolItem RUBY_PICKAXE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_pickaxe"),
			new PickaxeItem(RubyToolMaterial.INSTANCE, 0, -2.8F, new Item.Settings()));
	public static final ToolItem RUBY_AXE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_axe"),
			new AxeItem(RubyToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings()));
	public static final ToolItem RUBY_HOE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_hoe"),
			new HoeItem(RubyToolMaterial.INSTANCE, -6, 0, new Item.Settings()));
	public static final ToolItem RUBY_SWORD = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_sword"),
			new SwordItem(RubyToolMaterial.INSTANCE, 2, -2.4F, new Item.Settings()));

	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(RUBY_ITEM))
			.displayName(Text.translatable("itemGroup.simple_gems.item_group"))
			.entries((context, entries) -> {
				entries.add(RUBY_ORE);
				entries.add(RUBY_ITEM);
				entries.add(RUBY_BLOCK);
				entries.add(RUBY_SHOVEL);
				entries.add(RUBY_PICKAXE);
				entries.add(RUBY_AXE);
				entries.add(RUBY_HOE);
				entries.add(RUBY_SWORD);
			})
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello from Simple Gems");

		Registry.register(Registries.ITEM_GROUP, new Identifier("simple_gems", "simple_gems"), ITEM_GROUP);
		Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings()));
	}
}