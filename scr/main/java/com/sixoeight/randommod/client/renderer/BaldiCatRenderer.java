package com.sixoeight.randommod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import com.sixoeight.randommod.entity.BaldiCatEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class BaldiCatRenderer extends MobRenderer<BaldiCatEntity, OcelotModel<BaldiCatEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("random_mod:textures/entities/baldi-cat.png");

	public BaldiCatRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<BaldiCatEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	protected void scale(BaldiCatEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(BaldiCatEntity entity) {
		return entityTexture;
	}
}