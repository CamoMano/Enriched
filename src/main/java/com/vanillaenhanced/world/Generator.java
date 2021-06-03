package com.vanillaenhanced.world;

import com.google.common.collect.Lists;
import com.vanillaenhanced.VanillaEnhanced;
import com.vanillaenhanced.registry.ModInit;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;

public class Generator {

    //Common Ores
    public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    7)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(32))
            .spreadHorizontally()
            .repeat(8); // number of veins per chunk


    public static ConfiguredFeature<?, ?> ORE_RUBY_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.RUBY_ORE.getDefaultState(),
                    7)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(32))
            .spreadHorizontally()
            .repeat(8); // number of veins per chunk

    public static ConfiguredFeature<?, ?> ORE_AMETHYST_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.AMETHYST_ORE.getDefaultState(),
                    7)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(32))
            .spreadHorizontally()
            .repeat(8); // number of veins per chunk


    //Rare Ores
    public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_RARE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    4)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(32))
            .spreadHorizontally()
            .repeat(6); // number of veins per chunk


    public static ConfiguredFeature<?, ?> ORE_RUBY_RARE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.RUBY_ORE.getDefaultState(),
                    3)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(32))
            .spreadHorizontally()
            .repeat(6); // number of veins per chunk

    public static ConfiguredFeature<?, ?> ORE_AMETHYST_RARE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.AMETHYST_ORE.getDefaultState(),
                    3)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(32))
            .spreadHorizontally()
            .repeat(6); // number of veins per chunk


    //Stone Types
    public static ConfiguredFeature<?, ?> GEN_MARBLE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.MARBLE.getDefaultState(),
                    30)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(80))
            .spreadHorizontally()
            .repeat(7); // number of veins per chunk

    public static ConfiguredFeature<?, ?> GEN_DARK_GRANITE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.DARK_GRANITE.getDefaultState(),
                    30)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(75))
            .spreadHorizontally()
            .repeat(7); // number of veins per chunk

    public static ConfiguredFeature<?, ?> GEN_MUD = Feature.DISK
            .configure(new DiskFeatureConfig(
                    ModInit.MUD.getDefaultState(),
                    UniformIntProvider.create(3, 4),4,
                    Lists.newArrayList(Blocks.DIRT.getDefaultState(),
                            Blocks.GRASS_BLOCK.getDefaultState()))).
                    decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP);

    public static void register() {
        // * Sapphire Common
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_sapphire_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireCommon.getValue(), ORE_SAPPHIRE_COMMON);
        //Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_sapphire_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireRare.getValue(), ORE_SAPPHIRE_RARE);
        if(ModInit.enableSapphireGear) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireCommon);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireRare);
        }

        // * Ruby Common
        RegistryKey<ConfiguredFeature<?, ?>> oreRubyCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_ruby_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyCommon.getValue(), ORE_RUBY_COMMON);
        //Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreRubyRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_ruby_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyRare.getValue(), ORE_RUBY_RARE);
        if(ModInit.enableRubyGear) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyRare);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyCommon);
        }

        // * Amethyst Common
        RegistryKey<ConfiguredFeature<?, ?>> oreAmethystCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_amethyst_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAmethystCommon.getValue(), ORE_AMETHYST_COMMON);
        //Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreAmethystRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_amethyst_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAmethystRare.getValue(), ORE_AMETHYST_RARE);
        if (ModInit.enableAmethystGear) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAmethystRare);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, oreAmethystCommon);
        }



        //Stone Types
        //Marble
        RegistryKey<ConfiguredFeature<?, ?>> genMarble = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "gen_marble"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genMarble.getValue(), GEN_MARBLE);
        if (ModInit.enableMarble) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, genMarble);
        }
        //Dark Granite
        RegistryKey<ConfiguredFeature<?, ?>> genDarkGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "gen_dark_granite"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genDarkGranite.getValue(), GEN_DARK_GRANITE);
        if (ModInit.enableDarkGranite) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, genDarkGranite);

        }

        //Mud

        RegistryKey<ConfiguredFeature<?, ?>> genMud = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(VanillaEnhanced.MOD_ID, "gen_mud"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genMud.getValue(), GEN_MUD);
          BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.RAW_GENERATION, genMud);

    }

}

