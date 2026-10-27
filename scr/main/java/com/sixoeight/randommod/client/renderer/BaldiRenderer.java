package com.sixoeight.randommod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import com.sixoeight.randommod.entity.BaldiEntity;

public class BaldiRenderer extends HumanoidMobRenderer<BaldiEntity, HumanoidModel<BaldiEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("random_mod:textures/entities/2404a82b41e07666.png");

	public BaldiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<BaldiEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(BaldiEntity entity) {
		return entityTexture;
	}
}