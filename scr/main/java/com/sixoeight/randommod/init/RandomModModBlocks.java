/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sixoeight.randommod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.Sheets;

import com.sixoeight.randommod.block.*;
import com.sixoeight.randommod.RandomModMod;

@EventBusSubscriber
public class RandomModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RandomModMod.MODID);
	public static final DeferredBlock<Block> BALDI_BLOCK;
	public static final DeferredBlock<Block> BALDI_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> NETHER_GERMANIUM_ORE;
	public static final DeferredBlock<Block> RAW_GERMANIUM_BLOCK;
	public static final DeferredBlock<Block> GERMANIUM_INGOT_BLOCK;
	public static final DeferredBlock<Block> EBONY_LOG;
	public static final DeferredBlock<Block> EBONY_WOOD;
	public static final DeferredBlock<Block> STRIPPED_EBONY_LOG;
	public static final DeferredBlock<Block> STRIPPED_EBONY_WOOD;
	public static final DeferredBlock<Block> EBONY_PLANKS;
	public static final DeferredBlock<Block> EBONY_LEAVES;
	public static final DeferredBlock<Block> EBONY_STAIRS;
	public static final DeferredBlock<Block> EBONY_SLAB;
	public static final DeferredBlock<Block> EBONY_FENCE;
	public static final DeferredBlock<Block> EBONY_FENCE_GATE;
	public static final DeferredBlock<Block> EBONY_DOOR;
	public static final DeferredBlock<Block> EBONY_TRAPDOOR;
	public static final DeferredBlock<Block> EBONY_PRESSURE_PLATE;
	public static final DeferredBlock<Block> EBONY_BUTTON;
	public static final DeferredBlock<Block> EBONY_SIGN;
	public static final DeferredBlock<Block> EBONY_WALL_SIGN;
	public static final DeferredBlock<Block> EBONY_HANGING_SIGN;
	public static final DeferredBlock<Block> EBONY_WALL_HANGING_SIGN;
	public static final DeferredBlock<Block> GREENWOOD_LOG;
	public static final DeferredBlock<Block> GREENWOOD_WOOD;
	public static final DeferredBlock<Block> STRIPPED_GREENWOOD_LOG;
	public static final DeferredBlock<Block> STRIPPED_GREENWOOD_WOOD;
	public static final DeferredBlock<Block> GREENWOOD_PLANKS;
	public static final DeferredBlock<Block> GREENWOOD_LEAVES;
	public static final DeferredBlock<Block> GREENWOOD_STAIRS;
	public static final DeferredBlock<Block> GREENWOOD_SLAB;
	public static final DeferredBlock<Block> GREENWOOD_FENCE;
	public static final DeferredBlock<Block> GREENWOOD_FENCE_GATE;
	public static final DeferredBlock<Block> GREENWOOD_DOOR;
	public static final DeferredBlock<Block> GREENWOOD_TRAPDOOR;
	public static final DeferredBlock<Block> GREENWOOD_PRESSURE_PLATE;
	public static final DeferredBlock<Block> GREENWOOD_BUTTON;
	public static final DeferredBlock<Block> GREENWOOD_SIGN;
	public static final DeferredBlock<Block> GREENWOOD_WALL_SIGN;
	public static final DeferredBlock<Block> GREENWOOD_HANGING_SIGN;
	public static final DeferredBlock<Block> GREENWOOD_WALL_HANGING_SIGN;
	public static final DeferredBlock<Block> GREEN_WOOD_SAPLING;
	public static final DeferredBlock<Block> EBONY_SAPLING;
	public static final DeferredBlock<Block> RANDOM_TABLE;
	static {
		BALDI_BLOCK = REGISTRY.register("baldi_block", BaldiBlockBlock::new);
		BALDI_DIMENSION_PORTAL = REGISTRY.register("baldi_dimension_portal", BaldiDimensionPortalBlock::new);
		NETHER_GERMANIUM_ORE = REGISTRY.register("nether_germanium_ore", NetherGermaniumOreBlock::new);
		RAW_GERMANIUM_BLOCK = REGISTRY.register("raw_germanium_block", RawGermaniumBlockBlock::new);
		GERMANIUM_INGOT_BLOCK = REGISTRY.register("germanium_ingot_block", GermaniumIngotBlockBlock::new);
		EBONY_LOG = REGISTRY.register("ebony_log", EbonyLogBlock::new);
		EBONY_WOOD = REGISTRY.register("ebony_wood", EbonyWoodBlock::new);
		STRIPPED_EBONY_LOG = REGISTRY.register("stripped_ebony_log", StrippedEbonyLogBlock::new);
		STRIPPED_EBONY_WOOD = REGISTRY.register("stripped_ebony_wood", StrippedEbonyWoodBlock::new);
		EBONY_PLANKS = REGISTRY.register("ebony_planks", EbonyPlanksBlock::new);
		EBONY_LEAVES = REGISTRY.register("ebony_leaves", EbonyLeavesBlock::new);
		EBONY_STAIRS = REGISTRY.register("ebony_stairs", EbonyStairsBlock::new);
		EBONY_SLAB = REGISTRY.register("ebony_slab", EbonySlabBlock::new);
		EBONY_FENCE = REGISTRY.register("ebony_fence", EbonyFenceBlock::new);
		EBONY_FENCE_GATE = REGISTRY.register("ebony_fence_gate", EbonyFenceGateBlock::new);
		EBONY_DOOR = REGISTRY.register("ebony_door", EbonyDoorBlock::new);
		EBONY_TRAPDOOR = REGISTRY.register("ebony_trapdoor", EbonyTrapdoorBlock::new);
		EBONY_PRESSURE_PLATE = REGISTRY.register("ebony_pressure_plate", EbonyPressurePlateBlock::new);
		EBONY_BUTTON = REGISTRY.register("ebony_button", EbonyButtonBlock::new);
		EBONY_SIGN = REGISTRY.register("ebony_sign", EbonySignBlock::new);
		EBONY_WALL_SIGN = REGISTRY.register("ebony_wall_sign", EbonyWallSignBlock::new);
		EBONY_HANGING_SIGN = REGISTRY.register("ebony_hanging_sign", EbonyHangingSignBlock::new);
		EBONY_WALL_HANGING_SIGN = REGISTRY.register("ebony_wall_hanging_sign", EbonyWallHangingSignBlock::new);
		GREENWOOD_LOG = REGISTRY.register("greenwood_log", GreenwoodLogBlock::new);
		GREENWOOD_WOOD = REGISTRY.register("greenwood_wood", GreenwoodWoodBlock::new);
		STRIPPED_GREENWOOD_LOG = REGISTRY.register("stripped_greenwood_log", StrippedGreenwoodLogBlock::new);
		STRIPPED_GREENWOOD_WOOD = REGISTRY.register("stripped_greenwood_wood", StrippedGreenwoodWoodBlock::new);
		GREENWOOD_PLANKS = REGISTRY.register("greenwood_planks", GreenwoodPlanksBlock::new);
		GREENWOOD_LEAVES = REGISTRY.register("greenwood_leaves", GreenwoodLeavesBlock::new);
		GREENWOOD_STAIRS = REGISTRY.register("greenwood_stairs", GreenwoodStairsBlock::new);
		GREENWOOD_SLAB = REGISTRY.register("greenwood_slab", GreenwoodSlabBlock::new);
		GREENWOOD_FENCE = REGISTRY.register("greenwood_fence", GreenwoodFenceBlock::new);
		GREENWOOD_FENCE_GATE = REGISTRY.register("greenwood_fence_gate", GreenwoodFenceGateBlock::new);
		GREENWOOD_DOOR = REGISTRY.register("greenwood_door", GreenwoodDoorBlock::new);
		GREENWOOD_TRAPDOOR = REGISTRY.register("greenwood_trapdoor", GreenwoodTrapdoorBlock::new);
		GREENWOOD_PRESSURE_PLATE = REGISTRY.register("greenwood_pressure_plate", GreenwoodPressurePlateBlock::new);
		GREENWOOD_BUTTON = REGISTRY.register("greenwood_button", GreenwoodButtonBlock::new);
		GREENWOOD_SIGN = REGISTRY.register("greenwood_sign", GreenwoodSignBlock::new);
		GREENWOOD_WALL_SIGN = REGISTRY.register("greenwood_wall_sign", GreenwoodWallSignBlock::new);
		GREENWOOD_HANGING_SIGN = REGISTRY.register("greenwood_hanging_sign", GreenwoodHangingSignBlock::new);
		GREENWOOD_WALL_HANGING_SIGN = REGISTRY.register("greenwood_wall_hanging_sign", GreenwoodWallHangingSignBlock::new);
		GREEN_WOOD_SAPLING = REGISTRY.register("green_wood_sapling", GreenWoodSaplingBlock::new);
		EBONY_SAPLING = REGISTRY.register("ebony_sapling", EbonySaplingBlock::new);
		RANDOM_TABLE = REGISTRY.register("random_table", RandomTableBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Sheets.addWoodType(RandomModModWoodTypes.EBONY_SIGN_WOOD_TYPE);
			Sheets.addWoodType(RandomModModWoodTypes.EBONY_HANGING_SIGN_WOOD_TYPE);
			Sheets.addWoodType(RandomModModWoodTypes.GREENWOOD_SIGN_WOOD_TYPE);
			Sheets.addWoodType(RandomModModWoodTypes.GREENWOOD_HANGING_SIGN_WOOD_TYPE);
		}
	}

	@SubscribeEvent
	public static void registerSigns(BlockEntityTypeAddBlocksEvent event) {
		event.modify(BlockEntityType.SIGN, EBONY_SIGN.get(), EBONY_WALL_SIGN.get());
		event.modify(BlockEntityType.HANGING_SIGN, EBONY_HANGING_SIGN.get(), EBONY_WALL_HANGING_SIGN.get());
		event.modify(BlockEntityType.SIGN, GREENWOOD_SIGN.get(), GREENWOOD_WALL_SIGN.get());
		event.modify(BlockEntityType.HANGING_SIGN, GREENWOOD_HANGING_SIGN.get(), GREENWOOD_WALL_HANGING_SIGN.get());
	}
}