package fr.xotak;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Map;

public class ArmorUtils {
    public static void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, List<StatusEffectInstance>> entry : ArmorEffects.ARMOR_EFFECTS.entrySet()) {
            ArmorMaterial armorMaterial = entry.getKey();
            List<StatusEffectInstance> effects = entry.getValue();

            if (hasCorrectArmorOn(armorMaterial, player)) {
                for (StatusEffectInstance e: effects) {
                    addStatusEffectFromMaterial(player, armorMaterial, e);
                }
            }
        }
    }

    private static void addStatusEffectFromMaterial(PlayerEntity player, ArmorMaterial material, StatusEffectInstance effect) {
        boolean hasStatusEffect = player.hasStatusEffect(effect.getEffectType());
        if (!hasStatusEffect) {
            player.addStatusEffect(new StatusEffectInstance(effect));
        }
    }

    private static boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
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
