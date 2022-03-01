package com.enrichedmc.world;

import com.google.common.collect.ImmutableList;
import com.enrichedmc.registry.ModInit;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import org.apache.logging.log4j.Level;

import java.util.List;

import static com.enrichedmc.Enriched.*;


public class Features {

    public static ConfiguredFeature<TreeFeatureConfig, ?> REDWOOD_TREE;
    public static PlacedFeature REDWOOD_TREE_FEATURE;
    public static ConfiguredFeature<RandomPatchFeatureConfig, ?> REDWOOD_TREE_PATCH;
    public static PlacedFeature REDWOOD_TREE_PATCH_FEATURE;

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    public static void register() {
        REDWOOD_TREE = ConfiguredFeatures.register("redwood_tree", Feature.TREE.configure((
                new TreeFeatureConfig.Builder(BlockStateProvider.of(ModInit.REDWOOD_LOG),
                        new MegaJungleTrunkPlacer(16, 16, 16),
                        BlockStateProvider.of(ModInit.REDWOOD_LEAVES),
                        new JungleFoliagePlacer(ConstantIntProvider.create(2),
                                ConstantIntProvider.create(0),
                                2),
                        new TwoLayersFeatureSize(4, 1, 2))
                        .forceDirt())
                .decorators(ImmutableList.of(
                        new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL))))
                .build()));


        REDWOOD_TREE_FEATURE = Registry.register(BuiltinRegistries.PLACED_FEATURE, "redwood_tree",
                REDWOOD_TREE.withPlacement(VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(20, 0.1F, 5), ModInit.REDWOOD_SAPLING)));

        REDWOOD_TREE_PATCH = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, "redwood_tree_patch",
                Feature.RANDOM_PATCH.configure(
                        ConfiguredFeatures.createRandomPatchFeatureConfig(REDWOOD_TREE, List.of(Blocks.DIRT, Blocks.PODZOL, Blocks.GRASS_BLOCK), 5)
                )
        );

        REDWOOD_TREE_PATCH_FEATURE = Registry.register(BuiltinRegistries.PLACED_FEATURE, "redwood_tree_patch_feature",
                REDWOOD_TREE_PATCH.withPlacement(
                        RarityFilterPlacementModifier.of(1),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()
                )
        );

        log(Level.INFO, "Loaded features.");
    }


    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String string, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, MOD_ID + string, feature);
    }


}