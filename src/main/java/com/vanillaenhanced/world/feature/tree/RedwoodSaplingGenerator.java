package com.vanillaenhanced.world.feature.tree;

import com.vanillaenhanced.registry.ModInit;
import com.vanillaenhanced.world.Generation;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class RedwoodSaplingGenerator extends SaplingGenerator {
	@Nullable
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
		return ModInit.REDWOOD_TREE_FEATURE.configure(ModInit.REDWOOD_TREE_CONFIG);
	}

}
