package com.enrichedmc.world;

import com.enrichedmc.config.ModConfig;
import com.enrichedmc.registry.ModInit;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

import static com.enrichedmc.Enriched.MOD_ID;
import static net.minecraft.util.registry.BuiltinRegistries.PLACED_FEATURE;

public class Generator {
    private static ConfiguredFeature<?, ?> ORE_SAPPHIRE_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_SAPPHIRE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_SAPPHIRE_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(32))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_DEEPSLATE_SAPPHIRE_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_SAPPHIRE_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_DEEPSLATE_SAPPHIRE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_DEEPSLATE_SAPPHIRE_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_SAPPHIRE_COMMON_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_SAPPHIRE_COMMON_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_SAPPHIRE_COMMON_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(9), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(32))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_DEEPSLATE_SAPPHIRE_COMMON_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_SAPPHIRE_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_DEEPSLATE_SAPPHIRE_COMMON_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_DEEPSLATE_SAPPHIRE_COMMON_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(9), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0))
            )); // height


    private static ConfiguredFeature<?, ?> ORE_RUBY_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModInit.RUBY_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_RUBY_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_RUBY_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(32))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_DEEPSLATE_RUBY_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_RUBY_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_DEEPSLATE_RUBY_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_DEEPSLATE_RUBY_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_RUBY_COMMON_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModInit.RUBY_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_RUBY_COMMON_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_RUBY_COMMON_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(9), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(32))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_DEEPSLATE_RUBY_COMMON_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_RUBY_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_DEEPSLATE_RUBY_COMMON_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_DEEPSLATE_RUBY_COMMON_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(9), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0))
            )); // height


    private static ConfiguredFeature<?, ?> ORE_TANZANITE_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModInit.TANZANITE_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_TANZANITE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_TANZANITE_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(32))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_DEEPSLATE_TANZANITE_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_TANZANITE_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_DEEPSLATE_TANZANITE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_DEEPSLATE_TANZANITE_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_TANZANITE_COMMON_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModInit.TANZANITE_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_TANZANITE_COMMON_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_TANZANITE_COMMON_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(9), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(32))
            )); // height

    private static ConfiguredFeature<?, ?> ORE_DEEPSLATE_TANZANITE_COMMON_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_TANZANITE_ORE.getDefaultState(),
                    4)); // vein

    public static PlacedFeature ORE_DEEPSLATE_TANZANITE_COMMON_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_DEEPSLATE_TANZANITE_COMMON_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(9), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0))
            )); // height


    private static ConfiguredFeature<?, ?> ORE_DARK_GRANITE_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModInit.DARK_GRANITE.getDefaultState(),
                    30)); // vein

    public static PlacedFeature ORE_DARK_GRANITE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_DARK_GRANITE_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(8), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(70))
            )); // height


    private static ConfiguredFeature<?, ?> ORE_MARBLE_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModInit.MARBLE.getDefaultState(),
                    30)); // vein

    public static PlacedFeature ORE_MARBLE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ORE_MARBLE_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(8), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(75))
            )); // height

    public static void register(ModConfig config) {
        // * Sapphire
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_sapphire"), ORE_SAPPHIRE_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_sapphire"),
                ORE_SAPPHIRE_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_sapphire_common"), ORE_SAPPHIRE_COMMON_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_sapphire_common"),
                ORE_SAPPHIRE_COMMON_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_deepslate_sapphire"), ORE_DEEPSLATE_SAPPHIRE_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_deepslate_sapphire"),
                ORE_DEEPSLATE_SAPPHIRE_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_deepslate_sapphire_common"), ORE_DEEPSLATE_SAPPHIRE_COMMON_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_deepslate_sapphire_common"),
                ORE_DEEPSLATE_SAPPHIRE_COMMON_PLACED_FEATURE);


        if (config.enableSapphireOre) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_sapphire")));



            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_deepslate_sapphire")));

/*
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_deepslate_sapphire_common")));

            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_sapphire_common")));

 */
        }


        // * Ruby
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_ruby"), ORE_RUBY_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_ruby"),
                ORE_RUBY_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_ruby_common"), ORE_RUBY_COMMON_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_ruby_common"),
                ORE_RUBY_COMMON_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_deepslate_ruby"), ORE_DEEPSLATE_RUBY_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_deepslate_ruby"),
                ORE_DEEPSLATE_RUBY_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_deepslate_ruby_common"), ORE_DEEPSLATE_RUBY_COMMON_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_deepslate_ruby_common"),
                ORE_DEEPSLATE_RUBY_COMMON_PLACED_FEATURE);


        if (config.enableRubyOre) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_ruby")));



            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_deepslate_ruby")));


/*            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_deepslate_ruby_common")));
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_ruby_common")));

 */
        }


        // * Tanzanite
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_tanzanite"), ORE_TANZANITE_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_tanzanite"),
                ORE_TANZANITE_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_tanzanite_common"), ORE_TANZANITE_COMMON_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_tanzanite_common"),
                ORE_TANZANITE_COMMON_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_deepslate_tanzanite"), ORE_DEEPSLATE_TANZANITE_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_deepslate_tanzanite"),
                ORE_DEEPSLATE_TANZANITE_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_deepslate_tanzanite_common"), ORE_DEEPSLATE_TANZANITE_COMMON_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_deepslate_tanzanite_common"),
                ORE_DEEPSLATE_TANZANITE_COMMON_PLACED_FEATURE);


        if (config.enableTanzaniteOre) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_tanzanite")));



            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_deepslate_tanzanite")));


    /*        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_deepslate_tanzanite_common")));
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_tanzanite_common")));

     */
        }


        //Stone Types
        //Marble
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_marble"), ORE_MARBLE_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_marble"),
                ORE_MARBLE_PLACED_FEATURE);
        if (config.enableMarble) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_marble")));
        }
        //Dark Granite
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MOD_ID, "ore_dark_granite"), ORE_DARK_GRANITE_FEATURE);
        Registry.register(PLACED_FEATURE, new Identifier(MOD_ID, "ore_dark_granite"),
                ORE_DARK_GRANITE_PLACED_FEATURE);
        if (config.enableDarkGranite) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(MOD_ID, "ore_dark_granite")));
        }

/*
        if (config.enableRedwoodTrees) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, getKey(REDWOOD_TREE_PLACED_FEATURE));
        }

 */

    }

    public static RegistryKey<PlacedFeature> getKey(PlacedFeature f) {
        return BuiltinRegistries.PLACED_FEATURE.getKey(f).orElseThrow();


    }
}


