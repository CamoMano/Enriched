package com.enrichedmc.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class TreeGeneration
{
    public static void generateTrees()
    {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), GenerationStep.Feature.VEGETAL_DECORATION,
                EnrichedPlacedFeatures.REDWOOD_PLACED_KEY);
    }
}
