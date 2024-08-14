package fr.xotak.items.sapphire;

import fr.xotak.util.ArmorUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

public class SapphireArmorItem extends ArmorItem {
    public SapphireArmorItem(RegistryEntry<ArmorMaterial> material, ArmorItem.Type slot, Item.Settings settings) {
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
