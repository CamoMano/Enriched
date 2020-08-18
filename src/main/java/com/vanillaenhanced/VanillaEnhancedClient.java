package com.vanillaenhanced;

import com.vanillaenhanced.client.renderer.HoneySlimeEntityRenderer;
import com.vanillaenhanced.registry.ModInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class VanillaEnhancedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModInit.REDWOOD_SAPLING, RenderLayer.getCutout());

        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        EntityRendererRegistry.INSTANCE.register(ModInit.HONEY_SLIME, (dispatcher, context) -> {
            return new HoneySlimeEntityRenderer(dispatcher);
        });
    }
}
