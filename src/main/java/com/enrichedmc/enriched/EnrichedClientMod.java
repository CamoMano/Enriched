package com.enrichedmc.enriched;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.networking.EnrichedClientNetworking;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class EnrichedClientMod implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    ColorProviderRegistry.BLOCK.register(
        (state, world, pos, tintIndex) -> 0x14741F, EnrichedBlocks.REDWOOD_LEAVES);
    ColorProviderRegistry.ITEM.register(
        (stack, tintIndex) -> 0x14741F, EnrichedBlocks.REDWOOD_LEAVES);

    BlockRenderLayerMap.INSTANCE.putBlock(
        EnrichedBlocks.REDWOOD_LEAVES, RenderType.cutoutMipped());
    BlockRenderLayerMap.INSTANCE.putBlock(EnrichedBlocks.REDWOOD_SAPLING, RenderType.cutout());
    BlockRenderLayerMap.INSTANCE.putBlock(
        EnrichedBlocks.POTTED_REDWOOD_SAPLING, RenderType.cutout());


    EnrichedClientNetworking.registerClientboundPackets();
  }
}
