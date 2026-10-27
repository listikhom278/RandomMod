/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.sixoeight.randommod.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.BoatDispenseItemBehavior;

@EventBusSubscriber
public class RandomModModDispenseBehaviors {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DispenserBlock.registerBehavior(RandomModModItems.EBONY_BOAT.get(), new BoatDispenseItemBehavior(RandomModModBoatTypes.EBONY_BOAT_TYPE.getValue()));
			DispenserBlock.registerBehavior(RandomModModItems.EBONY_CHEST_BOAT.get(), new BoatDispenseItemBehavior(RandomModModBoatTypes.EBONY_CHEST_BOAT_TYPE.getValue(), true));
			DispenserBlock.registerBehavior(RandomModModItems.GREENWOOD_BOAT.get(), new BoatDispenseItemBehavior(RandomModModBoatTypes.GREENWOOD_BOAT_TYPE.getValue()));
			DispenserBlock.registerBehavior(RandomModModItems.GREENWOOD_CHEST_BOAT.get(), new BoatDispenseItemBehavior(RandomModModBoatTypes.GREENWOOD_CHEST_BOAT_TYPE.getValue(), true));
		});
	}
}