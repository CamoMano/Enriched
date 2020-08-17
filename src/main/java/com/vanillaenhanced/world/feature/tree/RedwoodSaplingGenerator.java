package com.vanillaenhanced.world.feature.tree;

import com.vanillaenhanced.registry.ModInit;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;


import java.util.Random;

public class RedwoodSaplingGenerator extends LargeTreeSaplingGenerator {

	@Nullable
	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
		return null;
	}

	@Nullable
	protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
		return ConfiguredFeatures.MEGA_SPRUCE;
	}
}
