package fr.xotak.util;

import fr.xotak.items.materials.amethyst.AmethystArmorMaterial;
import fr.xotak.items.materials.ruby.RubyArmorMaterial;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorMaterial;
import com.google.common.collect.ImmutableMap;


import java.util.List;

public class ArmorEffects {
    public static final ImmutableMap<ArmorMaterial, List<StatusEffectInstance>> ARMOR_EFFECTS =
            new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>()
                    .put(RubyArmorMaterial.INSTANCE, List.of(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 0, false, false, false), new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, false)))
                    .put(AmethystArmorMaterial.INSTANCE, List.of(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, false)))
                    .build();


}
