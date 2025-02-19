package fr.xotak.items.equipment;

import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public interface EquipmentAssetKeys {

    static RegistryKey<EquipmentAsset> register(String name) {
        return RegistryKey.of(net.minecraft.item.equipment.EquipmentAssetKeys.REGISTRY_KEY, Identifier.of("simple_gems", name));
    }
    RegistryKey<EquipmentAsset> AMETHYST = register("amethyst");
    RegistryKey<EquipmentAsset> EMERALD = register("emerald");
    RegistryKey<EquipmentAsset> RUBY = register("ruby");
    RegistryKey<EquipmentAsset> SAPPHIRE = register("sapphire");


}
