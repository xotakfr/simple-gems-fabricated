package fr.xotak;

import fr.xotak.items.amethyst.AmethystRegistryKeys;
import fr.xotak.items.emerald.EmeraldRegistryKeys;
import fr.xotak.items.emerald.EmeraldToolSet;
import fr.xotak.items.ruby.RubyRegistryEntry;
import fr.xotak.items.sapphire.SapphireRegistryKeys;
import fr.xotak.items.sapphire.SapphireToolSet;
import fr.xotak.util.events.ServerEntityEventHandler;
import fr.xotak.util.events.UseItemCallbackHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.amethyst.AmethystToolSet;

public class SimpleGems implements ModInitializer {
	// We declare the mod id here for future reference
	public static final String MOD_ID = "simple_gems";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Ruby toolset

	// Ore generation
	public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, "ruby_ore"));
	public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, "sapphire_ore"));


	public static final CreativeModeTab ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(RubyToolSet.RUBY_ITEM))
			.title(Component.translatable("itemGroup.simple_gems.item_group"))
			.displayItems((context, entries) -> {
				entries.accept(AmethystToolSet.AMETHYST_SHOVEL);
				entries.accept(AmethystToolSet.AMETHYST_PICKAXE);
				entries.accept(AmethystToolSet.AMETHYST_AXE);
				entries.accept(AmethystToolSet.AMETHYST_HOE);
				entries.accept(AmethystToolSet.AMETHYST_SWORD);
				entries.accept(AmethystToolSet.AMETHYST_HELMET);
				entries.accept(AmethystToolSet.AMETHYST_CHESTPLATE);
				entries.accept(AmethystToolSet.AMETHYST_LEGGINGS);
				entries.accept(AmethystToolSet.AMETHYST_BOOTS);
				entries.accept(RubyToolSet.RUBY_ORE);
				entries.accept(RubyToolSet.RUBY_ITEM);
				entries.accept(RubyToolSet.RUBY_BLOCK);
				entries.accept(RubyToolSet.RUBY_SHOVEL);
				entries.accept(RubyToolSet.RUBY_PICKAXE);
				entries.accept(RubyToolSet.RUBY_AXE);
				entries.accept(RubyToolSet.RUBY_HOE);
				entries.accept(RubyToolSet.RUBY_SWORD);
				entries.accept(RubyToolSet.RUBY_HELMET);
				entries.accept(RubyToolSet.RUBY_CHESTPLATE);
				entries.accept(RubyToolSet.RUBY_LEGGINGS);
				entries.accept(RubyToolSet.RUBY_BOOTS);
				entries.accept(SapphireToolSet.SAPPHIRE_ORE);
				entries.accept(SapphireToolSet.SAPPHIRE_ITEM);
				entries.accept(SapphireToolSet.SAPPHIRE_BLOCK);
				entries.accept(SapphireToolSet.SAPPHIRE_SHOVEL);
				entries.accept(SapphireToolSet.SAPPHIRE_PICKAXE);
				entries.accept(SapphireToolSet.SAPPHIRE_AXE);
				entries.accept(SapphireToolSet.SAPPHIRE_HOE);
				entries.accept(SapphireToolSet.SAPPHIRE_SWORD);
				entries.accept(SapphireToolSet.SAPPHIRE_HELMET);
				entries.accept(SapphireToolSet.SAPPHIRE_CHESTPLATE);
				entries.accept(SapphireToolSet.SAPPHIRE_LEGGINGS);
				entries.accept(SapphireToolSet.SAPPHIRE_BOOTS);
				entries.accept(EmeraldToolSet.EMERALD_SHOVEL);
				entries.accept(EmeraldToolSet.EMERALD_PICKAXE);
				entries.accept(EmeraldToolSet.EMERALD_AXE);
				entries.accept(EmeraldToolSet.EMERALD_HOE);
				entries.accept(EmeraldToolSet.EMERALD_SWORD);
				entries.accept(EmeraldToolSet.EMERALD_HELMET);
				entries.accept(EmeraldToolSet.EMERALD_CHESTPLATE);
				entries.accept(EmeraldToolSet.EMERALD_LEGGINGS);
				entries.accept(EmeraldToolSet.EMERALD_BOOTS);
			})
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello from Simple Gems");

		// Initialize the RegistryKeys
		RubyRegistryEntry.initialize();
		AmethystRegistryKeys.initialize();
		SapphireRegistryKeys.initialize();
		EmeraldRegistryKeys.initialize();

		// Initialize the items
		RubyToolSet.initialize();
		AmethystToolSet.initialize();
		SapphireToolSet.initialize();
		EmeraldToolSet.initialize();

		UseItemCallbackHandler.initialize();
		ServerEntityEventHandler.initialize();

		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "simple_gems"), ITEM_GROUP);

		//Ore Gen
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, RUBY_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SAPPHIRE_ORE_PLACED_KEY);
	}
}