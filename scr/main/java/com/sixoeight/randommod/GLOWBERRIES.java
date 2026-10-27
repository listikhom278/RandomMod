package com.sixoeight.randommod;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;

@EventBusSubscriber
public class GLOWBERRIES {

    @SubscribeEvent
    public static void onEatGlowingBerries(LivingEntityUseItemEvent.Finish event) {
        // Проверяем, что съеденный предмет — это светящиеся ягоды
        if (event.getItem().is(Items.GLOW_BERRIES)) {
            LivingEntity entity = event.getEntity();

            // Накладываем эффект свечения на 15 секунд (300 тиков)
            entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 300, 0));
        }
    }
}
