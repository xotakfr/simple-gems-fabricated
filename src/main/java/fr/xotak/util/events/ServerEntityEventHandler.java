package fr.xotak.util.events;

import fr.xotak.util.ArmorEffects;
import fr.xotak.util.ArmorUtils;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.world.entity.player.Player;

import static fr.xotak.datagen.SimpleGemsItemTagGenerator.*;

public class ServerEntityEventHandler {
    public static void initialize() {
        ServerEntityEvents.EQUIPMENT_CHANGE.register(((livingEntity, equipmentSlot, previousStack, currentStack) ->
        {
            if (!(livingEntity instanceof Player player)) {
                return;
            }
            if (!equipmentSlot.isArmor()) {
                return;
            }
            if (previousStack.is(AMETHYST_ARMOR)) {
                ArmorUtils.removeArmorEffects(player, AMETHYST_ARMOR);
            } else if (previousStack.is(EMERALD_ARMOR)) {
                ArmorUtils.removeArmorEffects(player, EMERALD_ARMOR);
            } else if (previousStack.is(RUBY_ARMOR)) {
                ArmorUtils.removeArmorEffects(player, RUBY_ARMOR);
            } else if (previousStack.is(SAPPHIRE_ARMOR)) {
                ArmorUtils.removeArmorEffects(player, SAPPHIRE_ARMOR);
            }
            if (currentStack.is(MOD_ARMORS)) {
                ArmorUtils.evaluateArmorEffects(player);
            }
        }
        ));
    }
}
