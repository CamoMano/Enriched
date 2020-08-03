package com.vanillaenhanced;

import com.vanillaenhanced.registry.ModInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class VanillaEnhancedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModInit.REDWOOD_SAPLING, RenderLayer.getCutout());
    }
}
