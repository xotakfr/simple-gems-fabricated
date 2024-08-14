package fr.xotak.items.materials;

import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class GemsArmorMaterial {
    public static final RegistryEntry<ArmorMaterial> AMETHYST =  register("amethyst", Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.BODY, 5);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.AMETHYST_SHARD));
    public static final RegistryEntry<ArmorMaterial> RUBY =  register("ruby", Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 5);
        map.put(ArmorItem.Type.LEGGINGS, 8);
        map.put(ArmorItem.Type.CHESTPLATE, 10);
        map.put(ArmorItem.Type.HELMET, 5);
        map.put(ArmorItem.Type.BODY, 5);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.ofItems(RubyToolSet.RUBY_ITEM));
    public static final RegistryEntry<ArmorMaterial> SAPPHIRE =  register("sapphire", Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 6);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.CHESTPLATE, 11);
        map.put(ArmorItem.Type.HELMET, 6);
        map.put(ArmorItem.Type.BODY, 5);
    }), 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.ofItems(SapphireToolSet.SAPPHIRE_ITEM));

    // Utils
    public static RegistryEntry<ArmorMaterial> getDefault(net.minecraft.registry.Registry<ArmorMaterial> registry) {
        return ArmorMaterials.LEATHER;
    }

    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.ofVanilla(id)));
        return register(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }

    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            enumMap.put(type, defense.get(type));
        }
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.ofVanilla(id), new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }
}
