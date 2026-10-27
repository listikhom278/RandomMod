package com.sixoeight.randommod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.sixoeight.randommod.init.RandomModModWoodTypes;
import com.sixoeight.randommod.init.RandomModModBlocks;

public class EbonyWallSignBlock extends WallSignBlock {
	public EbonyWallSignBlock() {
		super(RandomModModWoodTypes.EBONY_SIGN_WOOD_TYPE,
				BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn().dropsLike(RandomModModBlocks.EBONY_SIGN.get()));
	}
}