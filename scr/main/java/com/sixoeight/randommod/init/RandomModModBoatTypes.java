/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sixoeight.randommod.init;

import net.neoforged.fml.common.asm.enumextension.EnumProxy;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.vehicle.Boat;

import java.util.function.Supplier;

public class RandomModModBoatTypes {
	public static final EnumProxy<Boat.Type> EBONY_BOAT_TYPE = new EnumProxy<>(Boat.Type.class, (Supplier<Block>) () -> Blocks.OAK_PLANKS, "random_mod:ebony_boat", RandomModModItems.EBONY_BOAT, (Supplier<Item>) () -> Items.AIR,
			(Supplier<Item>) () -> Items.STICK, false);
	public static final EnumProxy<Boat.Type> EBONY_CHEST_BOAT_TYPE = new EnumProxy<>(Boat.Type.class, (Supplier<Block>) () -> Blocks.OAK_PLANKS, "random_mod:ebony_chest_boat", (Supplier<Item>) () -> Items.AIR, RandomModModItems.EBONY_CHEST_BOAT,
			(Supplier<Item>) () -> Items.STICK, false);
	public static final EnumProxy<Boat.Type> GREENWOOD_BOAT_TYPE = new EnumProxy<>(Boat.Type.class, (Supplier<Block>) () -> Blocks.OAK_PLANKS, "random_mod:greenwood_boat", RandomModModItems.GREENWOOD_BOAT, (Supplier<Item>) () -> Items.AIR,
			(Supplier<Item>) () -> Items.STICK, false);
	public static final EnumProxy<Boat.Type> GREENWOOD_CHEST_BOAT_TYPE = new EnumProxy<>(Boat.Type.class, (Supplier<Block>) () -> Blocks.OAK_PLANKS, "random_mod:greenwood_chest_boat", (Supplier<Item>) () -> Items.AIR,
			RandomModModItems.GREENWOOD_CHEST_BOAT, (Supplier<Item>) () -> Items.STICK, false);
}