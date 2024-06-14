package fr.xotak.items.materials.amethyst;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystToolMaterial implements ToolMaterial {
    public static final AmethystToolMaterial INSTANCE = new AmethystToolMaterial();
    @Override
    public int getDurability() {
        return 500;
    }

    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }

    @Override
    public float getAttackDamage() {
        return 2.5F;
    }

    public int getMiningLevel() {
        return 2;
    }

    public int getEnchantability() {
        return 10;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.AMETHYST_SHARD);
    }
}
