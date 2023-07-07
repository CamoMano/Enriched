package com.enrichedmc.world.feature.tree;

import com.enrichedmc.world.Features;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class RedwoodSaplingGenerator extends LargeTreeSaplingGenerator {

  @Nullable
  @Override
  protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
    return null;
  }

  @Nullable
  @Override
  protected RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
    return Features.REDWOOD_TREE;
  }
}
