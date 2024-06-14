package fr.xotak.items.materials.amethyst;

import fr.xotak.items.materials.ruby.RubyArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class AmethystArmorMaterial implements ArmorMaterial {
    public static final AmethystArmorMaterial INSTANCE = new AmethystArmorMaterial();
    private static final int[] BASE_DURABILITY = new int[]{11, 15, 16, 13};
    private static final int[] PROTECTION_VALUES = new int[]{3, 5, 7, 3};

    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * 24;
    }

    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.AMETHYST_SHARD);
    }

    public String getName() {
        return "amethyst";
    }

    public float getToughness() {
        return 0.0f;
    }

    public float getKnockbackResistance() {
        return 0.0f;
    }
}
