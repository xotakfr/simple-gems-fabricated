package fr.xotak.util;

import fr.xotak.items.materials.GemsArmorMaterial;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.entry.RegistryEntry;


import java.util.List;
import java.util.Map;

public class ArmorEffects {
    public static final Map<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> ARMOR_EFFECTS =
            Map.of(GemsArmorMaterial.AMETHYST,
                    List.of(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 150, 0, false, false, false)),
                    GemsArmorMaterial.EMERALD,
                    List.of(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 150, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.NIGHT_VISION, 150, 0, false, false, false)),
                    GemsArmorMaterial.RUBY,
                    List.of(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 150, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 150, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.NIGHT_VISION, 150, 0, false, false, false)),
                    GemsArmorMaterial.SAPPHIRE,
                    List.of(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 150, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 150, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 150, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.NIGHT_VISION, 150, 0, false, false, false))
                    );
}
