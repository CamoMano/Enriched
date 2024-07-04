package com.enrichedmc.enriched.world.gen;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.config.EnrichedGameOptions;
import com.enrichedmc.enriched.world.EnrichedPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class EnrichedOreGeneration
{
    public static void generateOres()
    {
        EnrichedGameOptions.WorldGenerationOptions worldGenerationOptions = EnrichedMod.getInstance().getGameOptions().worldGenerationOptions;

        if (worldGenerationOptions.generateRubyOres)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EnrichedPlacedFeatures.RUBY_ORE_PLACED_KEY);

        if (worldGenerationOptions.generateSapphireOres)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EnrichedPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);

        if (worldGenerationOptions.generateTanzaniteOres)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EnrichedPlacedFeatures.TANZANITE_ORE_PLACED_KEY);

        if (worldGenerationOptions.generateDarkGranite)
        {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    EnrichedPlacedFeatures.DARK_GRANITE_UPPER_PLACED_KEY);

            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    EnrichedPlacedFeatures.DARK_GRANITE_LOWER_PLACED_KEY);
        }

        if (worldGenerationOptions.generateMarble)
        {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    EnrichedPlacedFeatures.MARBLE_UPPER_PLACED_KEY);

            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    EnrichedPlacedFeatures.MARBLE_LOWER_PLACED_KEY);
        }
    }

}
