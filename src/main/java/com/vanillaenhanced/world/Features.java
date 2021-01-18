package com.vanillaenhanced.world;

import com.vanillaenhanced.registry.ModInit;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

public class Features {

    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String string, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, MOD_ID + string, feature);
    }

    public static final TreeFeatureConfig REDWOOD_TREE_CONFIG = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModInit.REDWOOD_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ModInit.REDWOOD_LEAVES.getDefaultState()),
            new JungleFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 2),
            new MegaJungleTrunkPlacer(16, 16, 16),
            new TwoLayersFeatureSize(1, 1, 2)).build();


    public static final ConfiguredFeature<TreeFeatureConfig, ?> REDWOOD_TREE = register("redwood_tree", Feature.TREE.configure(Features.REDWOOD_TREE_CONFIG));
    public static final ConfiguredFeature<?, ?> REDWOOD_TREES = register("redwood_trees", REDWOOD_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(7, 0.1F, 1))));

}