package fr.xotak;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorMaterial;
import com.google.common.collect.ImmutableMap;


import java.util.List;

public class ArmorEffects {
    public static final ImmutableMap<ArmorMaterial, List<StatusEffectInstance>> ARMOR_EFFECTS =
            new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>()
                    .put(RubyArmorMaterial.INSTANCE, List.of(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 0, false, false, true)))
                    .build();


}
