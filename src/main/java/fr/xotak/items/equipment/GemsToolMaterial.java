package fr.xotak.items.equipment;

import fr.xotak.datagen.SimpleGemsBlockTagGenerator;
import fr.xotak.datagen.SimpleGemsItemTagGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class GemsToolMaterial {
    public static final ToolMaterial AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 7.0F, 2.5F, 10, SimpleGemsItemTagGenerator.AMETHYST_TOOL_MATERIALS);
    public static final ToolMaterial EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, SimpleGemsItemTagGenerator.EMERALD_TOOL_MATERIALS);
    public static final ToolMaterial RUBY = new ToolMaterial(SimpleGemsBlockTagGenerator.INCORRECT_FOR_LEVEL_5_TAG, 2640, 9.0F, 6.0F, 25, SimpleGemsItemTagGenerator.RUBY_TOOL_MATERIALS);
    public static final ToolMaterial SAPPHIRE = new ToolMaterial(SimpleGemsBlockTagGenerator.INCORRECT_FOR_LEVEL_5_TAG, 3300, 10.0F, 7.0F, 30, SimpleGemsItemTagGenerator.SAPPHIRE_TOOL_MATERIALS);
}
