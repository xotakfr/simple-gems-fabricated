package fr.xotak.items.materials;

import net.minecraft.item.equipment.*;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import fr.xotak.datagen.SimpleGemsItemTagGenerator;

import java.util.EnumMap;



public interface GemsArmorMaterial {
    public static final ArmorMaterial AMETHYST = new ArmorMaterial(18, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 7);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 5);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, SimpleGemsItemTagGenerator.REPAIRS_AMETHYST_ARMOR, Identifier.of("simple_gems:amethyst"));
    public static final ArmorMaterial EMERALD = new ArmorMaterial(33, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, SimpleGemsItemTagGenerator.REPAIRS_EMERALD_ARMOR, Identifier.of("simple_gems:emerald"));
    public static final ArmorMaterial RUBY = new ArmorMaterial(45, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 8);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 5);
        map.put(EquipmentType.BODY, 5);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f,SimpleGemsItemTagGenerator.REPAIRS_RUBY_ARMOR, Identifier.of("simple_gems:ruby"));
    public static final ArmorMaterial SAPPHIRE = new ArmorMaterial(30, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 6);
        map.put(EquipmentType.LEGGINGS, 7);
        map.put(EquipmentType.CHESTPLATE, 11);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 5);
    }), 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, SimpleGemsItemTagGenerator.REPAIRS_SAPPHIRE_ARMOR, Identifier.of("simple_gems:sapphire"));


}
