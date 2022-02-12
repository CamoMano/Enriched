package com.enrichedmc;

import com.enrichedmc.client.renderer.HoneySlimeEntityRenderer;
import com.enrichedmc.registry.ModInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;

public class EnrichedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> 0x14741F, ModInit.REDWOOD_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x14741F, ModInit.REDWOOD_LEAVES);
        BlockRenderLayerMap.INSTANCE.putBlock(ModInit.REDWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModInit.POTTED_REDWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModInit.REDWOOD_LEAVES, RenderLayer.getCutoutMipped());
        EntityRendererRegistry.INSTANCE.register(ModInit.HONEY_SLIME, HoneySlimeEntityRenderer::new);
    }
}
