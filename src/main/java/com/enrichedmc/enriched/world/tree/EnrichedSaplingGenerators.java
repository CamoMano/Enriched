package com.enrichedmc.enriched.world.tree;

import com.enrichedmc.enriched.world.EnrichedConfiguredFeatures;
import java.util.Optional;
import net.minecraft.block.SaplingGenerator;

public class EnrichedSaplingGenerators {
  public static final SaplingGenerator REDWOOD;

  static {
    REDWOOD =
        new SaplingGenerator(
            "redwood",
            0.0f,
            Optional.empty(),
            Optional.empty(),
            Optional.of(EnrichedConfiguredFeatures.REDWOOD_KEY),
            Optional.empty(),
            Optional.empty(),
            Optional.empty());
  }
}
