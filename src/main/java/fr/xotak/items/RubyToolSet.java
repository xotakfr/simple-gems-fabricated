package fr.xotak.items;

import fr.xotak.items.equipment.GemsArmorMaterial;
import fr.xotak.items.equipment.GemsToolMaterial;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RubyToolSet {
    //blocks and item

    public static final Block RUBY_ORE = BlocksUtil.register(
            "ruby_ore",
            p->new DropExperienceBlock(UniformInt.of(4, 8), p),
            BlockBehaviour.Properties.of().strength(3.0F).requiresCorrectToolForDrops(),
            true
    );
    public static final Item RUBY_ITEM = ItemsUtil.register("ruby", Item::new,
            new Item.Properties());
    public static final Block RUBY_BLOCK = BlocksUtil.register(
            "ruby_block",
            Block::new,
            BlockBehaviour.Properties.of().strength(3.0F).requiresCorrectToolForDrops(),
            true
    );

    //tools
    public static final Item RUBY_SHOVEL = ItemsUtil.register("ruby_shovel", Item::new,
            new Item.Properties().shovel(GemsToolMaterial.RUBY, 1.5F, -3.0F));
    public static final Item RUBY_PICKAXE = ItemsUtil.register("ruby_pickaxe", Item::new,
            new Item.Properties().pickaxe(GemsToolMaterial.RUBY, 1.0F, -2.8F));
    public static final Item RUBY_AXE = ItemsUtil.register("ruby_axe", Item::new,
            new Item.Properties().axe(GemsToolMaterial.RUBY, 6.0F, -3.0F));
    public static final Item RUBY_HOE = ItemsUtil.register("ruby_hoe", Item::new,
            new Item.Properties().hoe(GemsToolMaterial.RUBY, 0.0F, -3.0F));
    public static final Item RUBY_SWORD = ItemsUtil.register("ruby_sword", Item::new,
            new Item.Properties().sword(GemsToolMaterial.RUBY, 3.0F, -2.4F));
    public static final Item RUBY_SPEAR = ItemsUtil.register("ruby_spear", Item::new, new Item.Properties().spear(GemsToolMaterial.RUBY, 1.21F, 1.4F, 0.4F, 2.0F, 6.5F, 5.0F, 5.1F, 7.5F, 4.6F));
    //armor
    public static final Item RUBY_HELMET = ItemsUtil.register("ruby_helmet", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.RUBY, ArmorType.HELMET));
    public static final Item RUBY_CHESTPLATE = ItemsUtil.register("ruby_chestplate", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.RUBY, ArmorType.CHESTPLATE));
    public static final Item RUBY_LEGGINGS = ItemsUtil.register("ruby_leggings", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.RUBY, ArmorType.LEGGINGS));
    public static final Item RUBY_BOOTS = ItemsUtil.register("ruby_boots", Item::new,
            new Item.Properties().humanoidArmor(GemsArmorMaterial.RUBY, ArmorType.BOOTS));


    public static void initialize() {}
}
