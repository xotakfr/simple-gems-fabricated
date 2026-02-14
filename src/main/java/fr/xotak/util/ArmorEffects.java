package fr.xotak.util;

import fr.xotak.datagen.SimpleGemsItemTagGenerator;
import java.util.List;
import java.util.Map;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;

public class ArmorEffects {
    public static final Map<TagKey<Item>, List<MobEffectInstance>> ARMOR_EFFECTS =
            Map.of(SimpleGemsItemTagGenerator.AMETHYST_ARMOR,
                    List.of(new MobEffectInstance(MobEffects.NIGHT_VISION, -1, 0, false, false, false)),
                    SimpleGemsItemTagGenerator.EMERALD_ARMOR,
                    List.of(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, -1, 0, false, false, false),
                            new MobEffectInstance(MobEffects.NIGHT_VISION, -1, 0, false, false, false)),
                   SimpleGemsItemTagGenerator.RUBY_ARMOR,
                    List.of(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, -1, 0, false, false, false),
                            new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, -1, 0, false, false, false),
                            new MobEffectInstance(MobEffects.NIGHT_VISION, -1, 0, false, false, false)),
                    SimpleGemsItemTagGenerator.SAPPHIRE_ARMOR,
                    List.of(new MobEffectInstance(MobEffects.WATER_BREATHING, -1, 0, false, false, false),
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, -1, 0, false, false, false),
                            new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, -1, 0, false, false, false),
                            new MobEffectInstance(MobEffects.NIGHT_VISION, -1, 0, false, false, false))
                    );
}
