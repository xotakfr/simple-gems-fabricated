package fr.xotak.items.equipment;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import fr.xotak.datagen.SimpleGemsItemTagGenerator;

import java.util.EnumMap;


public interface GemsArmorMaterial {
    ArmorMaterial AMETHYST = new ArmorMaterial(18, Util.make(new EnumMap(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 5);
        map.put(ArmorType.CHESTPLATE, 7);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 5);
    }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, SimpleGemsItemTagGenerator.REPAIRS_AMETHYST_ARMOR, EquipmentAssetKeys.AMETHYST);
    ArmorMaterial EMERALD = new ArmorMaterial(33, Util.make(new EnumMap(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 11);
    }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, SimpleGemsItemTagGenerator.REPAIRS_EMERALD_ARMOR, EquipmentAssetKeys.EMERALD);
    ArmorMaterial RUBY = new ArmorMaterial(45, Util.make(new EnumMap(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 5);
        map.put(ArmorType.LEGGINGS, 8);
        map.put(ArmorType.CHESTPLATE, 10);
        map.put(ArmorType.HELMET, 5);
        map.put(ArmorType.BODY, 5);
    }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f,SimpleGemsItemTagGenerator.REPAIRS_RUBY_ARMOR, EquipmentAssetKeys.RUBY);
    ArmorMaterial SAPPHIRE = new ArmorMaterial(50, Util.make(new EnumMap(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 6);
        map.put(ArmorType.LEGGINGS, 7);
        map.put(ArmorType.CHESTPLATE, 11);
        map.put(ArmorType.HELMET, 6);
        map.put(ArmorType.BODY, 5);
    }), 30, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, SimpleGemsItemTagGenerator.REPAIRS_SAPPHIRE_ARMOR, EquipmentAssetKeys.SAPPHIRE);


}
