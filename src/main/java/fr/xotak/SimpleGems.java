package fr.xotak;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.amethyst.AmethystToolSet;

public class SimpleGems implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("simple-gems");

	// Ruby toolset

	// Ore generation
	public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("simple_gems", "ruby_ore"));

	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(RubyToolSet.RUBY_ITEM))
			.displayName(Text.translatable("itemGroup.simple_gems.item_group"))
			.entries((context, entries) -> {
				entries.add(RubyToolSet.RUBY_ORE);
				entries.add(RubyToolSet.RUBY_ITEM);
				entries.add(RubyToolSet.RUBY_BLOCK);
				entries.add(RubyToolSet.RUBY_SHOVEL);
				entries.add(RubyToolSet.RUBY_PICKAXE);
				entries.add(RubyToolSet.RUBY_AXE);
				entries.add(RubyToolSet.RUBY_HOE);
				entries.add(RubyToolSet.RUBY_SWORD);
				entries.add(RubyToolSet.RUBY_HELMET);
				entries.add(RubyToolSet.RUBY_CHESTPLATE);
				entries.add(RubyToolSet.RUBY_LEGGINGS);
				entries.add(RubyToolSet.RUBY_BOOTS);
				entries.add(AmethystToolSet.AMETHYST_SHOVEL);
				entries.add(AmethystToolSet.AMETHYST_PICKAXE);
				entries.add(AmethystToolSet.AMETHYST_AXE);
				entries.add(AmethystToolSet.AMETHYST_HOE);
				entries.add(AmethystToolSet.AMETHYST_SWORD);
				entries.add(AmethystToolSet.AMETHYST_HELMET);
				entries.add(AmethystToolSet.AMETHYST_CHESTPLATE);
				entries.add(AmethystToolSet.AMETHYST_LEGGINGS);
				entries.add(AmethystToolSet.AMETHYST_BOOTS);
			})
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello from Simple Gems");

		RubyToolSet.initialize();
		AmethystToolSet.initialize();

		Registry.register(Registries.ITEM_GROUP, Identifier.of("simple_gems", "simple_gems"), ITEM_GROUP);

		//Ore Gen
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RUBY_ORE_PLACED_KEY);
	}
}