package com.enrichedmc.enriched.world.tree;

import com.enrichedmc.enriched.world.EnrichedConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class EnrichedSaplingGenerators {
  public static final TreeGrower REDWOOD;

  static {
    REDWOOD =
        new TreeGrower(
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
