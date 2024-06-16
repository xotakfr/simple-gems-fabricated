package fr.xotak.items.amethyst;

import fr.xotak.util.ArmorUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

public class AmethystArmorItem extends ArmorItem {

        public AmethystArmorItem(RegistryEntry<ArmorMaterial> material, Type slot, Settings settings) {
            super(material, slot, settings);
        }

        @Override
        public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
            if (!world.isClient) {
                if (entity instanceof PlayerEntity player && ArmorUtils.hasFullSuitOfArmorOn(player)) {
                    ArmorUtils.evaluateArmorEffects(player);
                }
            }
            super.inventoryTick(stack, world, entity, slot, selected);
        }
}
