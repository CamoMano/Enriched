package com.enrichedmc.world;

public class Features {
/*
    public static ConfiguredFeature<TreeFeatureConfig, ?> REDWOOD_TREE_FEATURE;
    public static PlacedFeature REDWOOD_TREE_PLACED_FEATURE;
    public static RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> REDWOOD_TREE;


    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    public static void register() {
        REDWOOD_TREE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, "redwood_tree_feature",
                new ConfiguredFeature<>(Feature.TREE, redwoodTree().build()));

        REDWOOD_TREE_PLACED_FEATURE = Registry.register(BuiltinRegistries.PLACED_FEATURE, "redwood_tree_placed_feature",
                new PlacedFeature(getEntry(BuiltinRegistries.CONFIGURED_FEATURE, REDWOOD_TREE_FEATURE), List.of(
                        PlacedFeatures.wouldSurvive(ModInit.REDWOOD_SAPLING)
                ))
        );

        REDWOOD_TREE = ConfiguredFeatures.register("redwood_tree", Feature.TREE, (
                new TreeFeatureConfig.Builder(BlockStateProvider.of(ModInit.REDWOOD_LOG),
                        new MegaJungleTrunkPlacer(16, 16, 16),
                        BlockStateProvider.of(ModInit.REDWOOD_LEAVES),
                        new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                        new TwoLayersFeatureSize(4, 1, 2)))
                .build());

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



 */
}