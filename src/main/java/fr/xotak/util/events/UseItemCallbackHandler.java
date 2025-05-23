package fr.xotak.util.events;

import fr.xotak.items.ruby.RubyToolSet;
import fr.xotak.items.sapphire.SapphireToolSet;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class UseItemCallbackHandler {
    public static void initialize() {
        UseItemCallback.EVENT.register((PlayerEntity entity, World world, Hand hand) -> {
            ItemStack itemStack = entity.getMainHandStack();
                if (!world.isClient) {
                    if (itemStack.isOf(Items.AMETHYST_SHARD)) {
                        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.NEUTRAL, 1.0F, 0.9F);
                        entity.getItemCooldownManager().set(Identifier.ofVanilla("amethyst_shard"), 200);
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, false));
                        itemStack.decrementUnlessCreative(1, entity);
                        return ActionResult.CONSUME;
                    } else if (itemStack.isOf(RubyToolSet.RUBY_ITEM)) {
                        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.NEUTRAL, 1.0F, 0.9F);
                        entity.getItemCooldownManager().set(Identifier.of("simple_gems:ruby"), 200);
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 0, false, false, false));
                        itemStack.decrementUnlessCreative(1, entity);
                        return ActionResult.CONSUME;
                    } else if (itemStack.isOf(SapphireToolSet.SAPPHIRE_ITEM)) {
                        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.NEUTRAL, 1.0F, 0.9F);
                        entity.getItemCooldownManager().set(Identifier.of("simple_gems:sapphire"), 200);
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 0, false, false, false));
                        itemStack.decrementUnlessCreative(1, entity);
                        return ActionResult.CONSUME;
                    } else if (itemStack.isOf(Items.EMERALD)) {
                        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.NEUTRAL, 1.0F, 0.9F);
                        entity.getItemCooldownManager().set(Identifier.ofVanilla("emerald"), 200);
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 400, 0, false, false, false));
                        itemStack.decrementUnlessCreative(1, entity);
                        return ActionResult.CONSUME;
                    }
                }
            return ActionResult.PASS;
        });
    }
}
