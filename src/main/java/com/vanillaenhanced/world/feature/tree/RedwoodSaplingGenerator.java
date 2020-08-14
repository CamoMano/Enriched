package com.vanillaenhanced.world.feature.tree;


import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.TreeFeatureConfig;


import java.util.Random;

public class RedwoodSaplingGenerator extends LargeTreeSaplingGenerator {

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
		return null;
	}

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
		return ConfiguredFeatures.MEGA_SPRUCE;
	}
}
