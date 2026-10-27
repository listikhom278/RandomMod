/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package com.sixoeight.randommod.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class RandomModModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(RandomModModBlocks.EBONY_SAPLING.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(RandomModModBlocks.GREEN_WOOD_SAPLING.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == RandomModModVillagerProfessions.RANDOM_PROFESSION.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(RandomModModBlocks.EBONY_SAPLING.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 11), new ItemStack(RandomModModBlocks.GREEN_WOOD_SAPLING.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(RandomModModItems.GERMANIUM_INGOT.get(), 6), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(RandomModModBlocks.BALDI_BLOCK.get(), 10), new ItemStack(RandomModModItems.GERMANIUM_INGOT.get(), 5), 10, 5, 0.05f));
		}
	}
}