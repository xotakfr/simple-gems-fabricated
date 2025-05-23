package fr.xotak.util;

import fr.xotak.datagen.SimpleGemsItemTagGenerator;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;


import java.util.List;
import java.util.Map;

public class ArmorEffects {
    public static final Map<TagKey<Item>, List<StatusEffectInstance>> ARMOR_EFFECTS =
            Map.of(SimpleGemsItemTagGenerator.AMETHYST_ARMOR,
                    List.of(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, false, false, false)),
                    SimpleGemsItemTagGenerator.EMERALD_ARMOR,
                    List.of(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, -1, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, false, false, false)),
                   SimpleGemsItemTagGenerator.RUBY_ARMOR,
                    List.of(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, -1, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, -1, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, false, false, false)),
                    SimpleGemsItemTagGenerator.SAPPHIRE_ARMOR,
                    List.of(new StatusEffectInstance(StatusEffects.WATER_BREATHING, -1, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, -1, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, -1, 0, false, false, false),
                            new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, false, false, false))
                    );
}
