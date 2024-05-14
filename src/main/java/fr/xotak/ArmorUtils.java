package fr.xotak;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Map;

public class ArmorUtils {
    public static void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, List<StatusEffectInstance>> entry : ArmorEffects.ARMOR_EFFECTS.entrySet()) {
            ArmorMaterial armorMaterial = entry.getKey();
            StatusEffectInstance effect = (StatusEffectInstance) entry.getValue();

            if (hasCorrectArmorOn(armorMaterial, player)) {
                addStatusEffectFromMaterial(player, armorMaterial, effect);
            }
        }
    }

    private static void addStatusEffectFromMaterial(PlayerEntity player, ArmorMaterial material, StatusEffectInstance effect) {
        boolean hasStatusEffect = player.hasStatusEffect(effect.getEffectType());
        if (!hasStatusEffect) {
            player.addStatusEffect(new StatusEffectInstance(effect));
        }
    }

    private static boolean hasFullSuitArmor(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack chestplate = player.getInventory().getArmorStack(1);
        ItemStack leggings = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);
    }
}
