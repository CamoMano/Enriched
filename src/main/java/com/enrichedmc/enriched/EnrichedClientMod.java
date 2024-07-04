package com.enrichedmc.enriched;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.entity.EnrichedEntityTypes;
import com.enrichedmc.enriched.entity.render.HoneySlimeEntityRenderer;
import com.enrichedmc.enriched.networking.EnrichedClientNetworking;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class EnrichedClientMod implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> 0x14741F, EnrichedBlocks.REDWOOD_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x14741F, EnrichedBlocks.REDWOOD_LEAVES);

        BlockRenderLayerMap.INSTANCE.putBlock(EnrichedBlocks.REDWOOD_LEAVES, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EnrichedBlocks.REDWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EnrichedBlocks.POTTED_REDWOOD_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(EnrichedEntityTypes.HONEY_SLIME, HoneySlimeEntityRenderer::new);

        EnrichedClientNetworking.registerClientboundPackets();
    }
}
