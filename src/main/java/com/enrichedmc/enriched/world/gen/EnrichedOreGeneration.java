package com.enrichedmc.enriched.world.gen;

import com.enrichedmc.enriched.world.EnrichedPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class EnrichedOreGeneration
{
    public static void generateOres()
    {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EnrichedPlacedFeatures.RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EnrichedPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EnrichedPlacedFeatures.TANZANITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EnrichedPlacedFeatures.DARK_GRANITE_PLACED_KEY);
    }
}
