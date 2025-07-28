package net.scoremoresalmon.fromthebog.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BOG_FLESH = new FoodProperties.Builder()
            .saturationMod(0.6f)
            .nutrition(4)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 0), 0.1f)
            .meat()
            .build();
}
