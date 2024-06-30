package com.enrichedmc.world;

import com.enrichedmc.registry.ModInit;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import org.apache.logging.log4j.Level;

import static com.enrichedmc.Enriched.*;

public class Features
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, identifier("redwood_tree"));

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        Features.register(context, REDWOOD_TREE, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ModInit.REDWOOD_LOG), new MegaJungleTrunkPlacer(10, 2, 19),
                BlockStateProvider.of(ModInit.REDWOOD_LEAVES), new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                new TwoLayersFeatureSize(1, 1, 2)).build());
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuredFeature)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuredFeature));
    }
}
