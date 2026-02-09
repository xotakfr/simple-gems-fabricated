package fr.xotak.items.equipment;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

public interface EquipmentAssetKeys {

    static ResourceKey<EquipmentAsset> register(String name) {
        return ResourceKey.create(net.minecraft.world.item.equipment.EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath("simple_gems", name));
    }
    ResourceKey<EquipmentAsset> AMETHYST = register("amethyst");
    ResourceKey<EquipmentAsset> EMERALD = register("emerald");
    ResourceKey<EquipmentAsset> RUBY = register("ruby");
    ResourceKey<EquipmentAsset> SAPPHIRE = register("sapphire");


}
