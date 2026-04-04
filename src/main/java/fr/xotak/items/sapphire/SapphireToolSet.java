package fr.xotak.items.sapphire;

import fr.xotak.items.BlocksUtil;
import fr.xotak.items.ItemsUtil;
import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.Locale;

public class SapphireToolSet {
    //blocks and item
    public static final Block SAPPHIRE_ORE = BlocksUtil.register(
            "sapphire_ore",
            p->new DropExperienceBlock(UniformInt.of(6, 10), p),
            BlockBehaviour.Properties.of().strength(4.0F).requiresCorrectToolForDrops(),
            true
    );
    public static final Item SAPPHIRE_ITEM = ItemsUtil.register("sapphire", Item::new,
            new Item.Properties());

    public static final Block SAPPHIRE_BLOCK = BlocksUtil.register(
        "sapphire_block",
        Block::new,
        BlockBehaviour.Properties.of().strength(4.0F).requiresCorrectToolForDrops(),
        true
)   ;
    //tools
    public static final Item SAPPHIRE_SHOVEL = ItemsUtil.register("sapphire_shovel", Item::new,
            new Item.Properties().shovel(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final Item SAPPHIRE_PICKAXE = ItemsUtil.register("sapphire_pickaxe", Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final Item SAPPHIRE_AXE = ItemsUtil.register("sapphire_axe", Item::new,
            new Item.Properties().axe(GemsToolMaterial.SAPPHIRE, 6.0F, -3.0F));
    public static final Item SAPPHIRE_HOE = ItemsUtil.register("sapphire_hoe", Item::new,
            new Item.Properties().hoe(GemsToolMaterial.SAPPHIRE, 0.0F, -3.0F));
    public static final Item SAPPHIRE_SWORD = ItemsUtil.register("sapphire_sword", Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.SAPPHIRE, 3.0F, -2.4F));
    //armor
    public static final Item SAPPHIRE_HELMET = ItemsUtil.register("sapphire_helmet", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.HELMET));
    public static final Item SAPPHIRE_CHESTPLATE = ItemsUtil.register("sapphire_chestplate", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.CHESTPLATE));
    public static final Item SAPPHIRE_LEGGINGS = ItemsUtil.register("sapphire_leggings", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.LEGGINGS));
    public static final Item SAPPHIRE_BOOTS = ItemsUtil.register("sapphire_boots", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.BOOTS));

    public static void initialize() {}
}
