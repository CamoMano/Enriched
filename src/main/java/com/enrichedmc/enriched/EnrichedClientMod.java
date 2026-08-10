package com.enrichedmc.enriched;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.networking.EnrichedClientNetworking;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;

@Environment(EnvType.CLIENT)
public class EnrichedClientMod implements ClientModInitializer {
  private static final int REDWOOD_LEAF_TINT = 0x14741F;

  @Override
  public void onInitializeClient() {
    // Render layers now come from the "render_type" of the generated block models, and the
    // leaves' item tint is baked into its item model. Only the block tint is registered here.
    BlockColorRegistry.register(
        (state, world, pos, tints) -> tints.add(REDWOOD_LEAF_TINT), EnrichedBlocks.REDWOOD_LEAVES);

    EnrichedClientNetworking.registerClientboundPackets();
  }
}
