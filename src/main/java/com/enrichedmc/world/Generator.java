package com.enrichedmc.world;

import com.enrichedmc.config.ModConfig;
import com.enrichedmc.world.feature.ore.OreConfiguredFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

import static com.enrichedmc.Enriched.MOD_ID;
import static com.enrichedmc.world.Features.REDWOOD_TREE_PATCH_FEATURE;

public class Generator {

    public static final PlacedFeature ORE_SAPPHIRE = OreConfiguredFeatures.ORE_SAPPHIRE.withPlacement(modifiersWithCount(6, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(0),
                    YOffset.fixed(32))));
    public static final PlacedFeature ORE_SAPPHIRE_DEEPSLATE = OreConfiguredFeatures.ORE_SAPPHIRE_DEEPSLATE.withPlacement(modifiersWithCount(6, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(-64)
                    , YOffset.fixed(32))));
    public static final PlacedFeature ORE_SAPPHIRE_COMMON = OreConfiguredFeatures.ORE_SAPPHIRE.withPlacement(modifiersWithCount(9, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(0),
                    YOffset.fixed(32))));
    public static final PlacedFeature ORE_SAPPHIRE_DEEPSLATE_COMMON = OreConfiguredFeatures.ORE_SAPPHIRE_DEEPSLATE.withPlacement(modifiersWithCount(9, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(-64)
                    , YOffset.fixed(32))));
    public static final PlacedFeature ORE_RUBY = OreConfiguredFeatures.ORE_RUBY.withPlacement(modifiersWithCount(6, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(0),
                    YOffset.fixed(32))));
    public static final PlacedFeature ORE_RUBY_DEEPSLATE = OreConfiguredFeatures.ORE_RUBY_DEEPSLATE.withPlacement(modifiersWithCount(6, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(-64)
                    , YOffset.fixed(32))));
    public static final PlacedFeature ORE_RUBY_COMMON = OreConfiguredFeatures.ORE_RUBY.withPlacement(modifiersWithCount(9, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(0),
                    YOffset.fixed(32))));
    public static final PlacedFeature ORE_RUBY_DEEPSLATE_COMMON = OreConfiguredFeatures.ORE_RUBY_DEEPSLATE.withPlacement(modifiersWithCount(9, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(-64)
                    , YOffset.fixed(32))));
    public static final PlacedFeature ORE_TANZANITE = OreConfiguredFeatures.ORE_TANZANITE.withPlacement(modifiersWithCount(6, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(0),
                    YOffset.fixed(32))));
    public static final PlacedFeature ORE_TANZANITE_DEEPSLATE = OreConfiguredFeatures.ORE_TANZANITE_DEEPSLATE.withPlacement(modifiersWithCount(6, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(-64)
                    , YOffset.fixed(32))));
    public static final PlacedFeature ORE_TANZANITE_COMMON = OreConfiguredFeatures.ORE_TANZANITE.withPlacement(modifiersWithCount(9, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(0),
                    YOffset.fixed(32))));
    public static final PlacedFeature ORE_TANZANITE_DEEPSLATE_COMMON = OreConfiguredFeatures.ORE_TANZANITE_DEEPSLATE.withPlacement(modifiersWithCount(9, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(-64)
                    , YOffset.fixed(32))));
    public static final PlacedFeature GEN_DARK_GRANITE = OreConfiguredFeatures.GEN_DARK_GRANITE.withPlacement(modifiersWithCount(7, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(0),
                    YOffset.fixed(75))));
    public static final PlacedFeature GEN_MARBLE = OreConfiguredFeatures.GEN_MARBLE.withPlacement(modifiersWithCount(7, //per chunk
            HeightRangePlacementModifier.uniform(YOffset.fixed(0),
                    YOffset.fixed(80))));


    public static void register(ModConfig config) {
        OreConfiguredFeatures.register();

        // * Sapphire Common
        RegistryKey<PlacedFeature> oreSapphire = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_sapphire"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSapphire.getValue(), ORE_SAPPHIRE);
        RegistryKey<PlacedFeature> oreSapphireDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_sapphire_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSapphireDeepslate.getValue(), ORE_SAPPHIRE_DEEPSLATE);
        RegistryKey<PlacedFeature> oreSapphireCommon = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_sapphire_common"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSapphireCommon.getValue(), ORE_SAPPHIRE_COMMON);
        RegistryKey<PlacedFeature> oreSapphireDeepslateCommon = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_sapphire_deepslate_common"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSapphireDeepslateCommon.getValue(), ORE_SAPPHIRE_DEEPSLATE_COMMON);

        if (config.enableSapphireOre) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireCommon);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireDeepslateCommon);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphire);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireDeepslate);
        }


        // * Ruby Common
        RegistryKey<PlacedFeature> oreRuby = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_ruby"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreRuby.getValue(), ORE_RUBY);
        RegistryKey<PlacedFeature> oreRubyDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_ruby_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreRubyDeepslate.getValue(), ORE_RUBY_DEEPSLATE);
        RegistryKey<PlacedFeature> oreRubyCommon = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_ruby_common"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreRubyCommon.getValue(), ORE_RUBY_COMMON);
        RegistryKey<PlacedFeature> oreRubyDeepslateCommon = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_ruby_deepslate_common"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreRubyDeepslateCommon.getValue(), ORE_RUBY_DEEPSLATE_COMMON);
        if (config.enableRubyOre) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyCommon);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyDeepslateCommon);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRuby);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyDeepslate);
        }


        // * Tanzanite Common
        RegistryKey<PlacedFeature> oreTanzanite = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_tanzanite"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTanzanite.getValue(), ORE_TANZANITE);
        RegistryKey<PlacedFeature> oreTanzaniteDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_tanzanite_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTanzaniteDeepslate.getValue(), ORE_TANZANITE_DEEPSLATE);
        RegistryKey<PlacedFeature> oreTanzaniteCommon = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_tanzanite_common"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTanzaniteCommon.getValue(), ORE_TANZANITE_COMMON);
        RegistryKey<PlacedFeature> oreTanzaniteDeepslateCommon = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "ore_tanzanite_deepslate_common"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTanzaniteDeepslateCommon.getValue(), ORE_TANZANITE_DEEPSLATE_COMMON);
        if (config.enableTanzaniteOre) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, oreTanzaniteCommon);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, oreTanzaniteDeepslateCommon);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTanzanite);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTanzaniteDeepslate);
        }


        //Stone Types
        //Marble
        RegistryKey<PlacedFeature> genMarble = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "marble"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, genMarble.getValue(), GEN_MARBLE);
        if (config.enableMarble) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, genMarble);
        }
        //Dark Granite
        RegistryKey<PlacedFeature> genDarkGranite = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID, "dark_granite"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, genDarkGranite.getValue(), GEN_DARK_GRANITE);
        if (config.enableDarkGranite) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, genDarkGranite);
        }

        if (config.enableRedwoodTrees) {
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), GenerationStep.Feature.VEGETAL_DECORATION, getKey(REDWOOD_TREE_PATCH_FEATURE));
        }

    }


    private static List<PlacementModifier> modifiers(PlacementModifier first, PlacementModifier second) {
        return List.of(first, SquarePlacementModifier.of(), second, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier modifier) {
        return modifiers(CountPlacementModifier.of(count), modifier);
    }

    public static RegistryKey<PlacedFeature> getKey(PlacedFeature f) {
        return BuiltinRegistries.PLACED_FEATURE.getKey(f).orElseThrow();
    }

}


