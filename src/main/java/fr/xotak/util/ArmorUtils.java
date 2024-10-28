package fr.xotak.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
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
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return helmet.isIn(tagKey) && breastplate.isIn(tagKey) &&
                leggings.isIn(tagKey) && boots.isIn(tagKey);
    }

    public static boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }
}
