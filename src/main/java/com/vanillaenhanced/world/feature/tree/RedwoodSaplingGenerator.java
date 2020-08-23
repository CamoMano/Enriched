package com.vanillaenhanced.world.feature.tree;

import com.vanillaenhanced.registry.ModInit;
import com.vanillaenhanced.world.Features;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;


import java.util.Random;


public class RedwoodSaplingGenerator extends LargeTreeSaplingGenerator {

	@Nullable
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
		return null;
	}

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
		return Features.REDWOOD_TREE_FEATURE;
	}
}
