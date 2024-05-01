package fr.xotak;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleGems implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("simple-gems");

	// Ruby toolset
	public static final RubyItem RUBY_ITEM = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby"),
			new RubyItem(new Item.Settings()));
	public static final ToolItem RUBY_PICKAXE = Registry.register(Registries.ITEM, new Identifier("simple_gems", "ruby_pickaxe"),
			new PickaxeItem(RubyToolMaterial.INSTANCE, 0, -2.8F, new Item.Settings()));

	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(RUBY_ITEM))
			.displayName(Text.translatable("itemGroup.simple_gems.item_group"))
			.entries((context, entries) -> {
				entries.add(RUBY_ITEM);
				entries.add(RUBY_PICKAXE);
			})
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello from Simple Gems");

		Registry.register(Registries.ITEM_GROUP, new Identifier("simple_gems", "simple_gems"), ITEM_GROUP);
	}
}