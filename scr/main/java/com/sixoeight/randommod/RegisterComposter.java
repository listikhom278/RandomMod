package com.sixoeight.randommod;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

@EventBusSubscriber
public class RegisterComposter {

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        ItemStack itemStack = event.getItemStack();

        // Проверяем, что кликнули по компостеру ядовитой картошкой
        if (state.getBlock() instanceof ComposterBlock && itemStack.is(Items.POISONOUS_POTATO)) {
            int levelValue = state.getValue(ComposterBlock.LEVEL);

            // Если компостер еще не полон (максимум 7 уровней перед готовностью)
            if (levelValue < 7) {
                if (!level.isClientSide) {
                    // Тратим 1 картошку (если игрок не в креативе)
                    if (!event.getEntity().isCreative()) {
                        itemStack.shrink(1);
                    }

                    // Шанс 65% повысить уровень компостера
                    if (level.random.nextFloat() < 0.65f) {
                        level.setBlock(pos, state.setValue(ComposterBlock.LEVEL, levelValue + 1), 3);
                        level.playSound(null, pos, SoundEvents.COMPOSTER_FILL_SUCCESS, SoundSource.BLOCKS, 1.0F, 1.0F);
                    } else {
                        level.playSound(null, pos, SoundEvents.COMPOSTER_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                    }
                }

                // Говорим игре, что мы обработали клик и поворачиваем руку игрока
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.sidedSuccess(level.isClientSide));
            }
        }
    }
}