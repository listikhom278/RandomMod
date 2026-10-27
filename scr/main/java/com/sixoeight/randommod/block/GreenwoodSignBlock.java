package com.sixoeight.randommod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.sixoeight.randommod.init.RandomModModWoodTypes;

public class GreenwoodSignBlock extends StandingSignBlock {
	public GreenwoodSignBlock() {
		super(RandomModModWoodTypes.GREENWOOD_SIGN_WOOD_TYPE, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}