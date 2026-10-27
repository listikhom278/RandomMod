package com.sixoeight.randommod.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import com.sixoeight.randommod.init.RandomModModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements RandomModModBiomes.RandomModModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> random_mod_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.random_mod_dimensionTypeReference != null) {
			retval = RandomModModBiomes.adaptSurfaceRule(retval, this.random_mod_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setrandom_modDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.random_mod_dimensionTypeReference = dimensionType;
	}
}