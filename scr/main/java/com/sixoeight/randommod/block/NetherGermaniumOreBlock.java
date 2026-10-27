package com.sixoeight.randommod.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class NetherGermaniumOreBlock extends Block {
	public NetherGermaniumOreBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).sound(SoundType.NETHERRACK).strength(3f, 10f).requiresCorrectToolForDrops());
	}
}