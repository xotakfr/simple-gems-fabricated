package fr.xotak.util;

import java.util.List;
import java.util.Map;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ArmorUtils {
    public static void evaluateArmorEffects(Player player) {
        for (Map.Entry<TagKey<Item>, List<MobEffectInstance>> entry : ArmorEffects.ARMOR_EFFECTS.entrySet()) {
            TagKey<Item> tagKey = entry.getKey();
            List<MobEffectInstance> effects = entry.getValue();

            if (hasCorrectArmorOn(tagKey, player)) {
                for (MobEffectInstance e: effects) {
                    addStatusEffectFromTagKey(player, tagKey, e);
                }
            }
        }
    }

    private static void addStatusEffectFromTagKey(Player player, TagKey<Item> tagKey, MobEffectInstance effect) {
        boolean hasStatusEffect = player.hasEffect(effect.getEffect());
        if (!hasStatusEffect) {
            player.addEffect(effect);
        }
    }

    private static boolean hasCorrectArmorOn(TagKey<Item> tagKey, Player player) {
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);

        return helmet.is(tagKey) && chestplate.is(tagKey) &&
                leggings.is(tagKey) && boots.is(tagKey);
    }

    public static boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);

        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    public static void removeArmorEffects(Player player, TagKey<Item> armor) {
        for (MobEffectInstance effect: ArmorEffects.ARMOR_EFFECTS.get(armor)) {
            player.removeEffect(effect.getEffect());
        }
    }
}
