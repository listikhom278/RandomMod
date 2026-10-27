/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sixoeight.randommod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.*;

import com.sixoeight.randommod.item.*;
import com.sixoeight.randommod.RandomModMod;

public class RandomModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RandomModMod.MODID);
	public static final DeferredItem<Item> BALDI_SPAWN_EGG;
	public static final DeferredItem<Item> BALDI_BLOCK;
	public static final DeferredItem<Item> BALDI_DIMENSION;
	public static final DeferredItem<Item> BALDIS_RULER;
	public static final DeferredItem<Item> BALDI_CAT_SPAWN_EGG;
	public static final DeferredItem<Item> EMERALD_PICKAXE;
	public static final DeferredItem<Item> EMERALD_SHOVEL;
	public static final DeferredItem<Item> EMERALD_AXE;
	public static final DeferredItem<Item> EMERALD_SWORD;
	public static final DeferredItem<Item> EMERALD_HOE;
	public static final DeferredItem<Item> EMERALD_ARMOR_HELMET;
	public static final DeferredItem<Item> EMERALD_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> EMERALD_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> EMERALD_ARMOR_BOOTS;
	public static final DeferredItem<Item> NETHER_GERMANIUM_ORE;
	public static final DeferredItem<Item> RAW_GERMANIUM;
	public static final DeferredItem<Item> GERMANIUM_INGOT;
	public static final DeferredItem<Item> RAW_GERMANIUM_BLOCK;
	public static final DeferredItem<Item> GERMANIUM_INGOT_BLOCK;
	public static final DeferredItem<Item> EBONY_LOG;
	public static final DeferredItem<Item> EBONY_WOOD;
	public static final DeferredItem<Item> STRIPPED_EBONY_LOG;
	public static final DeferredItem<Item> STRIPPED_EBONY_WOOD;
	public static final DeferredItem<Item> EBONY_PLANKS;
	public static final DeferredItem<Item> EBONY_LEAVES;
	public static final DeferredItem<Item> EBONY_STAIRS;
	public static final DeferredItem<Item> EBONY_SLAB;
	public static final DeferredItem<Item> EBONY_FENCE;
	public static final DeferredItem<Item> EBONY_FENCE_GATE;
	public static final DeferredItem<Item> EBONY_DOOR;
	public static final DeferredItem<Item> EBONY_TRAPDOOR;
	public static final DeferredItem<Item> EBONY_PRESSURE_PLATE;
	public static final DeferredItem<Item> EBONY_BUTTON;
	public static final DeferredItem<Item> EBONY_SIGN;
	public static final DeferredItem<Item> EBONY_HANGING_SIGN;
	public static final DeferredItem<Item> EBONY_BOAT;
	public static final DeferredItem<Item> EBONY_CHEST_BOAT;
	public static final DeferredItem<Item> GREENWOOD_LOG;
	public static final DeferredItem<Item> GREENWOOD_WOOD;
	public static final DeferredItem<Item> STRIPPED_GREENWOOD_LOG;
	public static final DeferredItem<Item> STRIPPED_GREENWOOD_WOOD;
	public static final DeferredItem<Item> GREENWOOD_PLANKS;
	public static final DeferredItem<Item> GREENWOOD_LEAVES;
	public static final DeferredItem<Item> GREENWOOD_STAIRS;
	public static final DeferredItem<Item> GREENWOOD_SLAB;
	public static final DeferredItem<Item> GREENWOOD_FENCE;
	public static final DeferredItem<Item> GREENWOOD_FENCE_GATE;
	public static final DeferredItem<Item> GREENWOOD_DOOR;
	public static final DeferredItem<Item> GREENWOOD_TRAPDOOR;
	public static final DeferredItem<Item> GREENWOOD_PRESSURE_PLATE;
	public static final DeferredItem<Item> GREENWOOD_BUTTON;
	public static final DeferredItem<Item> GREENWOOD_SIGN;
	public static final DeferredItem<Item> GREENWOOD_HANGING_SIGN;
	public static final DeferredItem<Item> GREENWOOD_BOAT;
	public static final DeferredItem<Item> GREENWOOD_CHEST_BOAT;
	public static final DeferredItem<Item> GREEN_WOOD_SAPLING;
	public static final DeferredItem<Item> EBONY_SAPLING;
	public static final DeferredItem<Item> RANDOM_TABLE;
	public static final DeferredItem<Item> MUSIC_DISC;
	static {
		BALDI_SPAWN_EGG = REGISTRY.register("baldi_spawn_egg", () -> new DeferredSpawnEggItem(RandomModModEntities.BALDI, -10027213, -13312, new Item.Properties()));
		BALDI_BLOCK = block(RandomModModBlocks.BALDI_BLOCK, new Item.Properties().fireResistant());
		BALDI_DIMENSION = REGISTRY.register("baldi_dimension", BaldiDimensionItem::new);
		BALDIS_RULER = REGISTRY.register("baldis_ruler", BaldisRulerItem::new);
		BALDI_CAT_SPAWN_EGG = REGISTRY.register("baldi_cat_spawn_egg", () -> new DeferredSpawnEggItem(RandomModModEntities.BALDI_CAT, -13369600, -16763905, new Item.Properties()));
		EMERALD_PICKAXE = REGISTRY.register("emerald_pickaxe", EmeraldPickaxeItem::new);
		EMERALD_SHOVEL = REGISTRY.register("emerald_shovel", EmeraldShovelItem::new);
		EMERALD_AXE = REGISTRY.register("emerald_axe", EmeraldAxeItem::new);
		EMERALD_SWORD = REGISTRY.register("emerald_sword", EmeraldSwordItem::new);
		EMERALD_HOE = REGISTRY.register("emerald_hoe", EmeraldHoeItem::new);
		EMERALD_ARMOR_HELMET = REGISTRY.register("emerald_armor_helmet", EmeraldArmorItem.Helmet::new);
		EMERALD_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_chestplate", EmeraldArmorItem.Chestplate::new);
		EMERALD_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_leggings", EmeraldArmorItem.Leggings::new);
		EMERALD_ARMOR_BOOTS = REGISTRY.register("emerald_armor_boots", EmeraldArmorItem.Boots::new);
		NETHER_GERMANIUM_ORE = block(RandomModModBlocks.NETHER_GERMANIUM_ORE);
		RAW_GERMANIUM = REGISTRY.register("raw_germanium", RawGermaniumItem::new);
		GERMANIUM_INGOT = REGISTRY.register("germanium_ingot", GermaniumIngotItem::new);
		RAW_GERMANIUM_BLOCK = block(RandomModModBlocks.RAW_GERMANIUM_BLOCK);
		GERMANIUM_INGOT_BLOCK = block(RandomModModBlocks.GERMANIUM_INGOT_BLOCK);
		EBONY_LOG = block(RandomModModBlocks.EBONY_LOG);
		EBONY_WOOD = block(RandomModModBlocks.EBONY_WOOD);
		STRIPPED_EBONY_LOG = block(RandomModModBlocks.STRIPPED_EBONY_LOG);
		STRIPPED_EBONY_WOOD = block(RandomModModBlocks.STRIPPED_EBONY_WOOD);
		EBONY_PLANKS = block(RandomModModBlocks.EBONY_PLANKS);
		EBONY_LEAVES = block(RandomModModBlocks.EBONY_LEAVES);
		EBONY_STAIRS = block(RandomModModBlocks.EBONY_STAIRS);
		EBONY_SLAB = block(RandomModModBlocks.EBONY_SLAB);
		EBONY_FENCE = block(RandomModModBlocks.EBONY_FENCE);
		EBONY_FENCE_GATE = block(RandomModModBlocks.EBONY_FENCE_GATE);
		EBONY_DOOR = doubleBlock(RandomModModBlocks.EBONY_DOOR);
		EBONY_TRAPDOOR = block(RandomModModBlocks.EBONY_TRAPDOOR);
		EBONY_PRESSURE_PLATE = block(RandomModModBlocks.EBONY_PRESSURE_PLATE);
		EBONY_BUTTON = block(RandomModModBlocks.EBONY_BUTTON);
		EBONY_SIGN = signBlock(RandomModModBlocks.EBONY_SIGN, RandomModModBlocks.EBONY_WALL_SIGN, new Item.Properties().stacksTo(16));
		EBONY_HANGING_SIGN = hangingSignBlock(RandomModModBlocks.EBONY_HANGING_SIGN, RandomModModBlocks.EBONY_WALL_HANGING_SIGN, new Item.Properties().stacksTo(16));
		EBONY_BOAT = REGISTRY.register("ebony_boat", () -> new BoatItem(false, RandomModModBoatTypes.EBONY_BOAT_TYPE.getValue(), new Item.Properties().stacksTo(1)));
		EBONY_CHEST_BOAT = REGISTRY.register("ebony_chest_boat", () -> new BoatItem(true, RandomModModBoatTypes.EBONY_CHEST_BOAT_TYPE.getValue(), new Item.Properties().stacksTo(1)));
		GREENWOOD_LOG = block(RandomModModBlocks.GREENWOOD_LOG);
		GREENWOOD_WOOD = block(RandomModModBlocks.GREENWOOD_WOOD);
		STRIPPED_GREENWOOD_LOG = block(RandomModModBlocks.STRIPPED_GREENWOOD_LOG);
		STRIPPED_GREENWOOD_WOOD = block(RandomModModBlocks.STRIPPED_GREENWOOD_WOOD);
		GREENWOOD_PLANKS = block(RandomModModBlocks.GREENWOOD_PLANKS);
		GREENWOOD_LEAVES = block(RandomModModBlocks.GREENWOOD_LEAVES);
		GREENWOOD_STAIRS = block(RandomModModBlocks.GREENWOOD_STAIRS);
		GREENWOOD_SLAB = block(RandomModModBlocks.GREENWOOD_SLAB);
		GREENWOOD_FENCE = block(RandomModModBlocks.GREENWOOD_FENCE);
		GREENWOOD_FENCE_GATE = block(RandomModModBlocks.GREENWOOD_FENCE_GATE);
		GREENWOOD_DOOR = doubleBlock(RandomModModBlocks.GREENWOOD_DOOR);
		GREENWOOD_TRAPDOOR = block(RandomModModBlocks.GREENWOOD_TRAPDOOR);
		GREENWOOD_PRESSURE_PLATE = block(RandomModModBlocks.GREENWOOD_PRESSURE_PLATE);
		GREENWOOD_BUTTON = block(RandomModModBlocks.GREENWOOD_BUTTON);
		GREENWOOD_SIGN = signBlock(RandomModModBlocks.GREENWOOD_SIGN, RandomModModBlocks.GREENWOOD_WALL_SIGN, new Item.Properties().stacksTo(16));
		GREENWOOD_HANGING_SIGN = hangingSignBlock(RandomModModBlocks.GREENWOOD_HANGING_SIGN, RandomModModBlocks.GREENWOOD_WALL_HANGING_SIGN, new Item.Properties().stacksTo(16));
		GREENWOOD_BOAT = REGISTRY.register("greenwood_boat", () -> new BoatItem(false, RandomModModBoatTypes.GREENWOOD_BOAT_TYPE.getValue(), new Item.Properties().stacksTo(1)));
		GREENWOOD_CHEST_BOAT = REGISTRY.register("greenwood_chest_boat", () -> new BoatItem(true, RandomModModBoatTypes.GREENWOOD_CHEST_BOAT_TYPE.getValue(), new Item.Properties().stacksTo(1)));
		GREEN_WOOD_SAPLING = block(RandomModModBlocks.GREEN_WOOD_SAPLING);
		EBONY_SAPLING = block(RandomModModBlocks.EBONY_SAPLING);
		RANDOM_TABLE = block(RandomModModBlocks.RANDOM_TABLE);
		MUSIC_DISC = REGISTRY.register("music_disc", MusicDiscItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}

	private static DeferredItem<Item> signBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock) {
		return signBlock(block, wallBlock, new Item.Properties());
	}

	private static DeferredItem<Item> signBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new SignItem(properties, block.get(), wallBlock.get()));
	}

	private static DeferredItem<Item> hangingSignBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock) {
		return hangingSignBlock(block, wallBlock, new Item.Properties());
	}

	private static DeferredItem<Item> hangingSignBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new HangingSignItem(block.get(), wallBlock.get(), properties));
	}
}