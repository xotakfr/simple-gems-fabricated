package fr.xotak.util;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.Map;

public class ArmorUtils {
    public static void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<TagKey<Item>, List<StatusEffectInstance>> entry : ArmorEffects.ARMOR_EFFECTS.entrySet()) {
            TagKey<Item> tagKey = entry.getKey();
            List<StatusEffectInstance> effects = entry.getValue();

            if (hasCorrectArmorOn(tagKey, player)) {
                for (StatusEffectInstance e: effects) {
                    addStatusEffectFromTagKey(player, tagKey, e);
                }
            }
        }
    }

    private static void addStatusEffectFromTagKey(PlayerEntity player, TagKey<Item> tagKey, StatusEffectInstance effect) {
        boolean hasStatusEffect = player.hasStatusEffect(effect.getEffectType());
        if (!hasStatusEffect) {
            player.addStatusEffect(new StatusEffectInstance(effect));
        }
    }

    private static boolean hasCorrectArmorOn(TagKey<Item> tagKey, PlayerEntity player) {
        ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);
        ItemStack leggings = player.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack chestplate = player.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack helmet = player.getEquippedStack(EquipmentSlot.HEAD);

        return helmet.isIn(tagKey) && chestplate.isIn(tagKey) &&
                leggings.isIn(tagKey) && boots.isIn(tagKey);
    }

    public static boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);
        ItemStack leggings = player.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack chestplate = player.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack helmet = player.getEquippedStack(EquipmentSlot.HEAD);

        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    public static void removeArmorEffects(PlayerEntity player, TagKey<Item> armor) {
        for (StatusEffectInstance effect: ArmorEffects.ARMOR_EFFECTS.get(armor)) {
            player.removeStatusEffect(effect.getEffectType());
        }
    }
}
