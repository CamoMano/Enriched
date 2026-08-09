package com.enrichedmc.enriched.world.gen;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.config.EnrichedGameOptions;
import com.enrichedmc.enriched.world.EnrichedPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

public class EnrichedOreGeneration {
  public static void generateOres() {
    EnrichedGameOptions.WorldGenerationOptions worldGenerationOptions =
        EnrichedMod.getInstance().getGameOptions().worldGenerationOptions;

    if (worldGenerationOptions.generateRubyOres) {
      BiomeModifications.addFeature(
          BiomeSelectors.tag(ConventionalBiomeTags.IS_JUNGLE),
          GenerationStep.Decoration.UNDERGROUND_ORES,
          EnrichedPlacedFeatures.RUBY_ORE_PLACED_KEY);
    }

    if (worldGenerationOptions.generateSapphireOres) {
      BiomeModifications.addFeature(
          BiomeSelectors.tag(ConventionalBiomeTags.IS_DRY_OVERWORLD),
          GenerationStep.Decoration.UNDERGROUND_ORES,
          EnrichedPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
    }

    if (worldGenerationOptions.generateTanzaniteOres) {
      BiomeModifications.addFeature(
          BiomeSelectors.tag(ConventionalBiomeTags.IS_SAVANNA),
          GenerationStep.Decoration.UNDERGROUND_ORES,
          EnrichedPlacedFeatures.TANZANITE_ORE_PLACED_KEY);

      if (worldGenerationOptions.generateAmberOres) {
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            EnrichedPlacedFeatures.AMBER_ORE_PLACED_KEY);
      }

      if (worldGenerationOptions.generateTopazOres) {
        BiomeModifications.addFeature(
            BiomeSelectors.tag(ConventionalBiomeTags.IS_DESERT),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            EnrichedPlacedFeatures.TOPAZ_ORE_PLACED_KEY);
      }

      if (worldGenerationOptions.generateTinOres) {
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            EnrichedPlacedFeatures.TIN_ORE_PLACED_KEY);
      }

      if (worldGenerationOptions.generateDarkGranite) {
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            EnrichedPlacedFeatures.DARK_GRANITE_UPPER_PLACED_KEY);

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            EnrichedPlacedFeatures.DARK_GRANITE_LOWER_PLACED_KEY);
      }

      if (worldGenerationOptions.generateMarble) {
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            EnrichedPlacedFeatures.MARBLE_UPPER_PLACED_KEY);

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            EnrichedPlacedFeatures.MARBLE_LOWER_PLACED_KEY);
      }
    }
  }
}
