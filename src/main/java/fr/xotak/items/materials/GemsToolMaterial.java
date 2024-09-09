package fr.xotak.items.materials;

import com.google.common.base.Suppliers;
import fr.xotak.dataGen.SimpleGemsBlockTagGenerator;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum GemsToolMaterial implements ToolMaterial {
    AMETHYST(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 7.0F, 2.5F, 10, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    EMERALD(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.EMERALD)),
    RUBY(SimpleGemsBlockTagGenerator.INCORRECT_FOR_LEVEL_5_TAG, 2640, 9.0F, 6.0F, 25, () -> Ingredient.ofItems(RubyToolSet.RUBY_ITEM)),
    SAPPHIRE(SimpleGemsBlockTagGenerator.INCORRECT_FOR_LEVEL_5_TAG, 3300, 10.0F, 7.0F, 30, () -> Ingredient.ofItems(SapphireToolSet.SAPPHIRE_ITEM));

    @Override
    public int getDurability() {
        return itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return inverseTag;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    GemsToolMaterial(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }
}
