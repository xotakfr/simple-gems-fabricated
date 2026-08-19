package fr.xotak.items;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SapphireToolSet {
    //blocks and item
    public static final BlockItemId SAPPHIRE_ORE_RK = BlocksUtil.createBlockItemId("sapphire_ore");
    public static final Block SAPPHIRE_ORE = BlocksUtil.register(
            SAPPHIRE_ORE_RK,
            p->new DropExperienceBlock(UniformInt.of(6, 10), p),
            BlockBehaviour.Properties.of().strength(4.0F).requiresCorrectToolForDrops()
    );

    public static final ResourceKey<Item> SAPPHIRE_ITEM_RK = ItemsUtil.create("sapphire");
    public static final Item SAPPHIRE_ITEM = ItemsUtil.register(SAPPHIRE_ITEM_RK, Item::new,
            new Item.Properties());
    public static final BlockItemId SAPPHIRE_BLOCK_RK = BlocksUtil.createBlockItemId("sapphire_block");
    public static final Block SAPPHIRE_BLOCK = BlocksUtil.register(
        SAPPHIRE_BLOCK_RK,
        Block::new,
        BlockBehaviour.Properties.of().strength(4.0F).requiresCorrectToolForDrops()
)   ;
    //tools
    public static final ResourceKey<Item> SAPPHIRE_SHOVEL_RK = ItemsUtil.create("sapphire_shovel");
    public static final Item SAPPHIRE_SHOVEL = ItemsUtil.register(SAPPHIRE_SHOVEL_RK, Item::new,
            new Item.Properties().shovel(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final ResourceKey<Item> SAPPHIRE_PICKAXE_RK = ItemsUtil.create("sapphire_pickaxe");
    public static final Item SAPPHIRE_PICKAXE = ItemsUtil.register(SAPPHIRE_PICKAXE_RK, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.SAPPHIRE, 1.5F, -3.0F));
    public static final ResourceKey<Item> SAPPHIRE_AXE_RK = ItemsUtil.create("sapphire_axe");
    public static final Item SAPPHIRE_AXE = ItemsUtil.register(SAPPHIRE_AXE_RK, Item::new,
            new Item.Properties().axe(GemsToolMaterial.SAPPHIRE, 6.0F, -3.0F));
    public static final ResourceKey<Item> SAPPHIRE_HOE_RK = ItemsUtil.create("sapphire_hoe");
    public static final Item SAPPHIRE_HOE = ItemsUtil.register(SAPPHIRE_HOE_RK, Item::new,
            new Item.Properties().hoe(GemsToolMaterial.SAPPHIRE, 0.0F, -3.0F));
    public static final ResourceKey<Item> SAPPHIRE_SWORD_RK = ItemsUtil.create("sapphire_sword");
    public static final Item SAPPHIRE_SWORD = ItemsUtil.register(SAPPHIRE_SWORD_RK, Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.SAPPHIRE, 3.0F, -2.4F));
    public static final ResourceKey<Item> SAPPHIRE_SPEAR_RK = ItemsUtil.create("sapphire_spear");
    public static final Item SAPPHIRE_SPEAR = ItemsUtil.register(SAPPHIRE_SPEAR_RK, Item::new,
            new Item.Properties().spear(GemsToolMaterial.SAPPHIRE, 1.21F, 1.6F, 0.4F, 2.0F, 6.5F, 5.0F, 5.1F, 7.5F, 4.6F));
    //armor
    public static final ResourceKey<Item> SAPPHIRE_HELMET_RK = ItemsUtil.create("sapphire_helmet");
    public static final Item SAPPHIRE_HELMET = ItemsUtil.register(SAPPHIRE_HELMET_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.HELMET));
    public static final ResourceKey<Item> SAPPHIRE_CHESTPLATE_RK = ItemsUtil.create("sapphire_chestplate");
    public static final Item SAPPHIRE_CHESTPLATE = ItemsUtil.register(SAPPHIRE_CHESTPLATE_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.CHESTPLATE));
    public static final ResourceKey<Item> SAPPHIRE_LEGGINGS_RK = ItemsUtil.create("sapphire_leggings");
    public static final Item SAPPHIRE_LEGGINGS = ItemsUtil.register(SAPPHIRE_LEGGINGS_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.LEGGINGS));
    public static final ResourceKey<Item> SAPPHIRE_BOOTS_RK = ItemsUtil.create("sapphire_boots");
    public static final Item SAPPHIRE_BOOTS = ItemsUtil.register(SAPPHIRE_BOOTS_RK, Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.SAPPHIRE, ArmorType.BOOTS));

    public static void initialize() {}
}
