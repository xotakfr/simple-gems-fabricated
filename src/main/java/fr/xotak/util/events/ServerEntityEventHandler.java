package fr.xotak.util.events;

import fr.xotak.util.ArmorEffects;
import fr.xotak.util.ArmorUtils;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.player.PlayerEntity;

import static fr.xotak.datagen.SimpleGemsItemTagGenerator.*;

public class ServerEntityEventHandler {
    public static void initialize() {
        ServerEntityEvents.EQUIPMENT_CHANGE.register(((livingEntity, equipmentSlot, previousStack, currentStack) ->
        {
            if (!(livingEntity instanceof PlayerEntity player)) {
                return;
            }
            if (!equipmentSlot.isArmorSlot()) {
                return;
            }
            if (previousStack.isIn(AMETHYST_ARMOR)) {
                ArmorUtils.removeArmorEffects(player, AMETHYST_ARMOR);
            } else if (previousStack.isIn(EMERALD_ARMOR)) {
                ArmorUtils.removeArmorEffects(player, EMERALD_ARMOR);
            } else if (previousStack.isIn(RUBY_ARMOR)) {
                ArmorUtils.removeArmorEffects(player, RUBY_ARMOR);
            } else if (previousStack.isIn(SAPPHIRE_ARMOR)) {
                ArmorUtils.removeArmorEffects(player, SAPPHIRE_ARMOR);
            }
            if (currentStack.isIn(MOD_ARMORS)) {
                ArmorUtils.evaluateArmorEffects(player);
            }
        }
        ));
    }
}
