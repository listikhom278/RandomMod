/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sixoeight.randommod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.sixoeight.randommod.RandomModMod;

public class RandomModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, RandomModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_CREO_FLOW = REGISTRY.register("music_disc.creo-flow", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("random_mod", "music_disc.creo-flow")));
}