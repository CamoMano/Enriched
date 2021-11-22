package com.vanillaenhanced.world;

import com.vanillaenhanced.registry.ModInit;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import org.apache.logging.log4j.Level;

import static com.vanillaenhanced.VanillaEnhanced.*;
import static net.minecraft.world.gen.feature.PlacedFeatures.createCountExtraModifier;

public class Features {

    public static ConfiguredFeature<TreeFeatureConfig,?> REDWOOD_TREE;
    public static PlacedFeature REDWOOD_TREES;

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    public static void register() {
        REDWOOD_TREE = ConfiguredFeatures.register("redwood", Feature.TREE.configure((new TreeFeatureConfig.Builder(BlockStateProvider.of(ModInit.REDWOOD_LOG), new MegaJungleTrunkPlacer(10, 2, 19), BlockStateProvider.of(ModInit.REDWOOD_LEAVES), new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), new TwoLayersFeatureSize(1, 1, 2))).build()));


        REDWOOD_TREES = PlacedFeatures.register("redwood_trees", REDWOOD_TREE.withPlacement(VegetationPlacedFeatures.modifiers(createCountExtraModifier(10, 0.1F, 1))));


        log(Level.INFO, "Loaded features.");
    }

    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String string, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, MOD_ID + string, feature);
    }



}