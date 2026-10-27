package com.sixoeight.randommod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.sixoeight.randommod.init.RandomModModWoodTypes;
import com.sixoeight.randommod.init.RandomModModBlocks;

public class EbonyWallHangingSignBlock extends WallHangingSignBlock {
	public EbonyWallHangingSignBlock() {
		super(RandomModModWoodTypes.EBONY_HANGING_SIGN_WOOD_TYPE,
				BlockBehaviour.Properties.of().sound(SoundType.HANGING_SIGN).strength(1f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn().dropsLike(RandomModModBlocks.EBONY_HANGING_SIGN.get()));
	}
}