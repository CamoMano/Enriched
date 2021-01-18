package com.vanillaenhanced.world;

import com.vanillaenhanced.VanillaEnhanced;
import com.vanillaenhanced.registry.ModInit;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Generator {

    //Common Ores
    private static ConfiguredFeature<?, ?> ORE_SAPPHIRE_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    6)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    32))) // max y level
            .spreadHorizontally()
            .repeat(8); // number of veins per chunk


    private static ConfiguredFeature<?, ?> ORE_RUBY_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.RUBY_ORE.getDefaultState(),
                    6)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    32))) // max y level
            .spreadHorizontally()
            .repeat(8); // number of veins per chunk

    private static ConfiguredFeature<?, ?> ORE_AMETHYST_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.AMETHYST_ORE.getDefaultState(),
                    6)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    32))) // max y level
            .spreadHorizontally()
            .repeat(8); // number of veins per chunk


    //Rare Ores
    private static ConfiguredFeature<?, ?> ORE_SAPPHIRE_RARE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    3)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    32))) // max y level
            .spreadHorizontally()
            .repeat(5); // number of veins per chunk


    private static ConfiguredFeature<?, ?> ORE_RUBY_RARE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.RUBY_ORE.getDefaultState(),
                    3)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    32))) // max y level
            .spreadHorizontally()
            .repeat(5); // number of veins per chunk

    private static ConfiguredFeature<?, ?> ORE_AMETHYST_RARE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.AMETHYST_ORE.getDefaultState(),
                    3)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    32))) // max y level
            .spreadHorizontally()
            .repeat(5); // number of veins per chunk
    
    
    //Stone Types
    private static ConfiguredFeature<?, ?> GEN_MARBLE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.MARBLE.getDefaultState(),
                    30)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    80))) // max y level
            .spreadHorizontally()
            .repeat(7); // number of veins per chunk

    private static ConfiguredFeature<?, ?> GEN_DARK_GRANITE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.DARK_GRANITE.getDefaultState(),
                    30)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    75))) // max y level
            .spreadHorizontally()
            .repeat(7); // number of veins per chunk

    public static void register() {
        //Common
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_sapphire_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireCommon.getValue(), ORE_SAPPHIRE_COMMON);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireCommon);

        RegistryKey<ConfiguredFeature<?, ?>> oreRubyCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_ruby_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyCommon.getValue(), ORE_RUBY_COMMON);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyCommon);

        RegistryKey<ConfiguredFeature<?, ?>> oreAmethystCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_amethyst_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAmethystCommon.getValue(), ORE_AMETHYST_COMMON);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, oreAmethystCommon);

        //Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_sapphire_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireRare.getValue(), ORE_SAPPHIRE_RARE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireRare);

        RegistryKey<ConfiguredFeature<?, ?>> oreRubyRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_ruby_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyRare.getValue(), ORE_RUBY_RARE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyRare);

        RegistryKey<ConfiguredFeature<?, ?>> oreAmethystRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_amethyst_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAmethystRare.getValue(), ORE_AMETHYST_RARE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAmethystRare);


        //Stone Types
        RegistryKey<ConfiguredFeature<?, ?>> genMarble = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "gen_marble"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genMarble.getValue(), GEN_MARBLE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, genMarble);

        RegistryKey<ConfiguredFeature<?, ?>> genDarkGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "gen_dark_granite"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genDarkGranite.getValue(), GEN_DARK_GRANITE);
        
        if (ModInit.enableDarkGranite) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, genDarkGranite);
        }

    }
}

