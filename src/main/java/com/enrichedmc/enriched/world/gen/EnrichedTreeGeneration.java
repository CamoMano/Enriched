package com.enrichedmc.enriched.world.gen;

import com.enrichedmc.enriched.world.EnrichedPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class EnrichedTreeGeneration {
  public static void generateTrees() {
    BiomeModifications.addFeature(
        BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
        GenerationStep.Decoration.VEGETAL_DECORATION,
        EnrichedPlacedFeatures.REDWOOD_PLACED_KEY);
  }
}
