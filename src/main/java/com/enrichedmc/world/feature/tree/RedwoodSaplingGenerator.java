package com.enrichedmc.world.feature.tree;

import com.enrichedmc.world.Features;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;


public class RedwoodSaplingGenerator extends LargeTreeSaplingGenerator {
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bl) {
        return null;
    }

    @Override
    protected RegistryEntry<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return Features.getEntry(BuiltinRegistries.CONFIGURED_FEATURE, Features.REDWOOD_TREE_FEATURE);
    }

}
