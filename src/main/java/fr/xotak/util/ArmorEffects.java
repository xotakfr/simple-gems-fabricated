package fr.xotak.util;

import fr.xotak.items.materials.GemsArmorMaterial;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorMaterial;
import com.google.common.collect.ImmutableMap;
import net.minecraft.registry.entry.RegistryEntry;


import java.util.List;

public class ArmorEffects {
    public static final ImmutableMap<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> ARMOR_EFFECTS =
            new ImmutableMap.Builder<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>>()
                    .put(GemsArmorMaterial.RUBY, List.of(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 0, false, false, false), new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, false)))
                    .put(GemsArmorMaterial.AMETHYST, List.of(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, false)))
                    .build();


}
