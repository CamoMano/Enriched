package com.enrichedmc.world;

import com.enrichedmc.registry.ModInit;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import org.apache.logging.log4j.Level;

import java.util.List;

import static com.enrichedmc.Enriched.LOGGER;
import static com.enrichedmc.Enriched.MOD_NAME;


public class Features {

    public static ConfiguredFeature<TreeFeatureConfig, ?> REDWOOD_TREE_FEATURE;
    public static PlacedFeature REDWOOD_TREE_PLACED_FEATURE;

    public static RegistryEntry<PlacedFeature> REDWOOD_TREE_CHECKED;
    public static RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> REDWOOD_TREE;


    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    public static void register() {
        REDWOOD_TREE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, "redwood_tree",
                new ConfiguredFeature<>(Feature.TREE, redwoodTree().build()));

        REDWOOD_TREE_PLACED_FEATURE = Registry.register(BuiltinRegistries.PLACED_FEATURE, "redwood_tree",
                new PlacedFeature(getEntry(BuiltinRegistries.CONFIGURED_FEATURE, REDWOOD_TREE_FEATURE), List.of(
                        PlacedFeatures.wouldSurvive(ModInit.REDWOOD_SAPLING)
                ))
        );

        REDWOOD_TREE = ConfiguredFeatures.register("redwood_treeb", Feature.TREE, (
                new TreeFeatureConfig.Builder(BlockStateProvider.of(ModInit.REDWOOD_LOG),
                        new MegaJungleTrunkPlacer(16, 16, 16),
                        BlockStateProvider.of(ModInit.REDWOOD_LEAVES),
                        new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                        new TwoLayersFeatureSize(4, 1, 2)))
                .decorators(ImmutableList.of(TrunkVineTreeDecorator.INSTANCE, LeavesVineTreeDecorator.INSTANCE))
                .build());

        REDWOOD_TREE_CHECKED = PlacedFeatures.register("redwood_tree_checked", TreeConfiguredFeatures.MEGA_JUNGLE_TREE, PlacedFeatures.wouldSurvive(ModInit.REDWOOD_SAPLING));

        RegistryKey<ConfiguredFeature<?, ?>> treeRedwood = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("tutorial", "tree_redwood"));



        log(Level.INFO, "Loaded features.");

    }

    public static TreeFeatureConfig.Builder redwoodTree() {
        return new TreeFeatureConfig.Builder((BlockStateProvider.of(ModInit.REDWOOD_LOG)), new MegaJungleTrunkPlacer(16, 16, 16), BlockStateProvider.of(ModInit.REDWOOD_LEAVES), new JungleFoliagePlacer(ConstantIntProvider.create(2),
                ConstantIntProvider.create(0),
                2),
                new TwoLayersFeatureSize(4, 1, 2))
                .decorators(ImmutableList.of(
                        new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL))));
    }


    public static <T> RegistryEntry<T> getEntry(Registry<T> registry, T value) {
        return registry.getEntry(registry.getKey(value).orElseThrow()).orElseThrow();
    }



}