/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sixoeight.randommod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.sixoeight.randommod.RandomModMod;

@EventBusSubscriber
public class RandomModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RANDOM_MOD_TAB = REGISTRY.register("random_mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.random_mod.random_mod_tab")).icon(() -> new ItemStack(RandomModModBlocks.RAW_GERMANIUM_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RandomModModItems.BALDI_SPAWN_EGG.get());
				tabData.accept(RandomModModItems.BALDI_CAT_SPAWN_EGG.get());
				tabData.accept(RandomModModBlocks.BALDI_BLOCK.get().asItem());
				tabData.accept(RandomModModItems.BALDI_DIMENSION.get());
				tabData.accept(RandomModModItems.BALDIS_RULER.get());
				tabData.accept(RandomModModBlocks.RANDOM_TABLE.get().asItem());
				tabData.accept(RandomModModItems.EMERALD_PICKAXE.get());
				tabData.accept(RandomModModItems.EMERALD_SHOVEL.get());
				tabData.accept(RandomModModItems.EMERALD_AXE.get());
				tabData.accept(RandomModModItems.EMERALD_SWORD.get());
				tabData.accept(RandomModModItems.EMERALD_HOE.get());
				tabData.accept(RandomModModItems.EMERALD_ARMOR_HELMET.get());
				tabData.accept(RandomModModItems.EMERALD_ARMOR_CHESTPLATE.get());
				tabData.accept(RandomModModItems.EMERALD_ARMOR_LEGGINGS.get());
				tabData.accept(RandomModModItems.EMERALD_ARMOR_BOOTS.get());
				tabData.accept(RandomModModBlocks.NETHER_GERMANIUM_ORE.get().asItem());
				tabData.accept(RandomModModItems.RAW_GERMANIUM.get());
				tabData.accept(RandomModModItems.GERMANIUM_INGOT.get());
				tabData.accept(RandomModModBlocks.RAW_GERMANIUM_BLOCK.get().asItem());
				tabData.accept(RandomModModBlocks.GERMANIUM_INGOT_BLOCK.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RandomModModItems.BALDI_SPAWN_EGG.get());
			tabData.accept(RandomModModItems.BALDI_CAT_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RandomModModItems.BALDI_DIMENSION.get());
			tabData.accept(RandomModModItems.BALDIS_RULER.get());
			tabData.accept(RandomModModItems.EMERALD_PICKAXE.get());
			tabData.accept(RandomModModItems.EMERALD_SHOVEL.get());
			tabData.accept(RandomModModItems.EMERALD_AXE.get());
			tabData.accept(RandomModModItems.EMERALD_HOE.get());
			tabData.accept(RandomModModItems.EBONY_BOAT.get());
			tabData.accept(RandomModModItems.EBONY_CHEST_BOAT.get());
			tabData.accept(RandomModModItems.GREENWOOD_BOAT.get());
			tabData.accept(RandomModModItems.GREENWOOD_CHEST_BOAT.get());
			tabData.accept(RandomModModItems.MUSIC_DISC.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RandomModModBlocks.NETHER_GERMANIUM_ORE.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_LEAVES.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_LEAVES.get().asItem());
			tabData.accept(RandomModModBlocks.GREEN_WOOD_SAPLING.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_SAPLING.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RandomModModItems.RAW_GERMANIUM.get());
			tabData.accept(RandomModModItems.GERMANIUM_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RandomModModBlocks.RAW_GERMANIUM_BLOCK.get().asItem());
			tabData.accept(RandomModModBlocks.GERMANIUM_INGOT_BLOCK.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_LOG.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_WOOD.get().asItem());
			tabData.accept(RandomModModBlocks.STRIPPED_EBONY_LOG.get().asItem());
			tabData.accept(RandomModModBlocks.STRIPPED_EBONY_WOOD.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_PLANKS.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_STAIRS.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_SLAB.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_FENCE.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_FENCE_GATE.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_DOOR.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_TRAPDOOR.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_PRESSURE_PLATE.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_BUTTON.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_LOG.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_WOOD.get().asItem());
			tabData.accept(RandomModModBlocks.STRIPPED_GREENWOOD_LOG.get().asItem());
			tabData.accept(RandomModModBlocks.STRIPPED_GREENWOOD_WOOD.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_PLANKS.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_STAIRS.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_SLAB.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_FENCE.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_FENCE_GATE.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_DOOR.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_TRAPDOOR.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(RandomModModBlocks.EBONY_SIGN.get().asItem());
			tabData.accept(RandomModModBlocks.EBONY_HANGING_SIGN.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_SIGN.get().asItem());
			tabData.accept(RandomModModBlocks.GREENWOOD_HANGING_SIGN.get().asItem());
			tabData.accept(RandomModModBlocks.RANDOM_TABLE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RandomModModItems.BALDIS_RULER.get());
			tabData.accept(RandomModModItems.EMERALD_ARMOR_HELMET.get());
			tabData.accept(RandomModModItems.EMERALD_ARMOR_CHESTPLATE.get());
			tabData.accept(RandomModModItems.EMERALD_ARMOR_LEGGINGS.get());
			tabData.accept(RandomModModItems.EMERALD_ARMOR_BOOTS.get());
			tabData.accept(RandomModModItems.EMERALD_SWORD.get());
			tabData.accept(RandomModModItems.EMERALD_AXE.get());
		}
	}
}