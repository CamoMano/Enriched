package com.vanillaenhanced;

import com.vanillaenhanced.client.renderer.HoneySlimeEntityRenderer;
import com.vanillaenhanced.entity.HoneySlime;
import com.vanillaenhanced.registry.ModInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SlimeEntity;

public class VanillaEnhancedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModInit.REDWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModInit.POTTED_REDWOOD_SAPLING, RenderLayer.getCutout());
/*
        EntityRendererRegistry.INSTANCE.register(ModInit.HONEY_SLIME, (entityRenderDispatcher, context) ->
            new HoneySlimeEntityRenderer(entityRenderDispatcher));


 */

        EntityRendererRegistry.INSTANCE.register(ModInit.HONEY_SLIME, HoneySlimeEntityRenderer::new);



    }

}
