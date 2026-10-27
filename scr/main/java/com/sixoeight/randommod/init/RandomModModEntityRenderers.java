/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sixoeight.randommod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.sixoeight.randommod.client.renderer.BaldiRenderer;
import com.sixoeight.randommod.client.renderer.BaldiCatRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class RandomModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RandomModModEntities.BALDI.get(), BaldiRenderer::new);
		event.registerEntityRenderer(RandomModModEntities.BALDI_CAT.get(), BaldiCatRenderer::new);
	}
}