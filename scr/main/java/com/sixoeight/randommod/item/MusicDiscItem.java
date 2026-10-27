package com.sixoeight.randommod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import com.sixoeight.randommod.RandomModMod;

public class MusicDiscItem extends Item {
	public MusicDiscItem() {
		super(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RandomModMod.MODID, "music_disc"))));
	}
}