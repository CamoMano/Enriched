package com.enrichedmc.enriched;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.networking.EnrichedClientNetworking;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class EnrichedClientMod implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(EnrichedBlocks.REDWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EnrichedBlocks.REDWOOD_SAPLING, RenderLayer.getCutout());

        EnrichedClientNetworking.registerClientboundPackets();
    }
}
