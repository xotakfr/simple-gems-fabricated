package fr.xotak.util.events;

import fr.xotak.datagen.SimpleGemsItemTagGenerator;
import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Map;

import static fr.xotak.SimpleGems.LOGGER;

public class UseItemCallbackHandler {
    private static final Map<Item, MobEffectInstance> EFFECTS =
            Map.of(Items.AMETHYST_SHARD, new MobEffectInstance(MobEffects.NIGHT_VISION, 1800, 0, false, false, false),
                    Items.EMERALD, new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 6000, 0, false, false, false),
                    RubyToolSet.RUBY_ITEM, new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0, false, false, false),
                    SapphireToolSet.SAPPHIRE_ITEM, new MobEffectInstance(MobEffects.WATER_BREATHING, 9000, 0, false, false, false)
            );

    public static void initialize() {
        UseItemCallback.EVENT.register((Player entity, Level world, InteractionHand hand) -> {
            ItemStack itemStack = entity.getMainHandItem();
                if (!world.isClientSide()) {
                    if (itemStack.is(SimpleGemsItemTagGenerator.WEAVABLE)) {
                        ItemCooldowns manager = entity.getCooldowns();
                        if (manager.isOnCooldown(itemStack)) {
                            return InteractionResult.CONSUME;
                        } else {
                            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.NEUTRAL, 1.0F, 0.9F);
                            entity.getCooldowns().addCooldown(itemStack, 1200);
                            entity.addEffect(new MobEffectInstance(EFFECTS.get(itemStack.getItem())));
                            LOGGER.info(EFFECTS.get(itemStack.getItem()).getEffect().getRegisteredName());
                            itemStack.consume(1, entity);
                            return InteractionResult.SUCCESS;
                        }
                    }
                }
            return InteractionResult.PASS;
        });
    }
}
