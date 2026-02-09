package fr.xotak.util.events;

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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class UseItemCallbackHandler {
    public static void initialize() {
        UseItemCallback.EVENT.register((Player entity, Level world, InteractionHand hand) -> {
            ItemStack itemStack = entity.getMainHandItem();
                if (!world.isClientSide()) {
                    if (itemStack.is(Items.AMETHYST_SHARD)) {
                        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.NEUTRAL, 1.0F, 0.9F);
                        entity.getCooldowns().addCooldown(Identifier.withDefaultNamespace("amethyst_shard"), 200);
                        entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0, false, false, false));
                        itemStack.consume(1, entity);
                        return InteractionResult.CONSUME;
                    } else if (itemStack.is(RubyToolSet.RUBY_ITEM)) {
                        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.NEUTRAL, 1.0F, 0.9F);
                        entity.getCooldowns().addCooldown(Identifier.parse("simple_gems:ruby"), 200);
                        entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 0, false, false, false));
                        itemStack.consume(1, entity);
                        return InteractionResult.CONSUME;
                    } else if (itemStack.is(SapphireToolSet.SAPPHIRE_ITEM)) {
                        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.NEUTRAL, 1.0F, 0.9F);
                        entity.getCooldowns().addCooldown(Identifier.parse("simple_gems:sapphire"), 200);
                        entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0, false, false, false));
                        itemStack.consume(1, entity);
                        return InteractionResult.CONSUME;
                    } else if (itemStack.is(Items.EMERALD)) {
                        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.NEUTRAL, 1.0F, 0.9F);
                        entity.getCooldowns().addCooldown(Identifier.withDefaultNamespace("emerald"), 200);
                        entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 400, 0, false, false, false));
                        itemStack.consume(1, entity);
                        return InteractionResult.CONSUME;
                    }
                }
            return InteractionResult.PASS;
        });
    }
}
