package com.sixoeight.randommod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import com.sixoeight.randommod.init.RandomModModWoodTypes;

public class EbonyHangingSignBlock extends CeilingHangingSignBlock {
	public EbonyHangingSignBlock() {
		super(RandomModModWoodTypes.EBONY_HANGING_SIGN_WOOD_TYPE, BlockBehaviour.Properties.of().sound(SoundType.HANGING_SIGN).strength(1f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}