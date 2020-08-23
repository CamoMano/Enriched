package com.vanillaenhanced.world;

import com.vanillaenhanced.registry.ModInit;
import com.vanillaenhanced.world.feature.tree.RedwoodTreeDecorator;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

public class Features {
    private static <FC extends FeatureConfig> ConfiguredFeature<FC,?> register(String string, ConfiguredFeature<FC,?> feature){
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,MOD_ID+string,feature);
    }
public static final ConfiguredFeature<TreeFeatureConfig,?> REDWOOD_TREE_FEATURE = register("redwood_tree", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(ModInit.REDWOOD_LOG.getDefaultState()), new SimpleBlockStateProvider(ModInit.REDWOOD_LEAVES.getDefaultState()), new JungleFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 2), new MegaJungleTrunkPlacer(16, 16, 16), new TwoLayersFeatureSize(1, 1, 2))).build()));


    //public static Feature<TreeFeatureConfig> REDWOOD_TREE_FEATURE;
    //public static RedwoodTreeDecorator REDWOOD_TREE_DECORATOR;
    //public static TreeFeatureConfig REDWOOD_TREE_CONFIG;
}