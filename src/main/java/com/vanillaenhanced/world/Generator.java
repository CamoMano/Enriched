package com.vanillaenhanced.world;

import com.google.common.collect.Lists;
import com.vanillaenhanced.VanillaEnhanced;
import com.vanillaenhanced.config.ModConfig;
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

@SuppressWarnings("deprecation") //Experimental v1 Biome API
public class Generator {
    //Common Ores
    public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_COMMON = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.SAPPHIRE_ORE.getDefaultState(),
            7)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(32))
        .spreadHorizontally()
        .repeat(8); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_DEEPSLATE_SAPPHIRE_COMMON = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.DEEPSLATE_SAPPHIRE_ORE.getDefaultState(),
            7)) // vein size
        .uniformRange(YOffset.getBottom(), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(9); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_RUBY_COMMON = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.RUBY_ORE.getDefaultState(),
            7)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(32))
        .spreadHorizontally()
        .repeat(8); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_DEEPSLATE_RUBY_COMMON = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.DEEPSLATE_RUBY_ORE.getDefaultState(),
            7)) // vein size
        .uniformRange(YOffset.getBottom(), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(9); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_TANZANITE_COMMON = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.TANZANITE_ORE.getDefaultState(),
            7)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(32))
        .spreadHorizontally()
        .repeat(8); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_DEEPSLATE_TANZANITE_COMMON = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.DEEPSLATE_TANZANITE_ORE.getDefaultState(),
            7)) // vein size
        .uniformRange(YOffset.getBottom(), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(9); // number of veins per chunk
    //Rare Ores
    public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_RARE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.SAPPHIRE_ORE.getDefaultState(),
            4)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(32))
        .spreadHorizontally()
        .repeat(6); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_DEEPSLATE_SAPPHIRE_RARE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.DEEPSLATE_SAPPHIRE_ORE.getDefaultState(),
            4)) // vein size
        .uniformRange(YOffset.getBottom(), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(7); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_RUBY_RARE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.RUBY_ORE.getDefaultState(),
            3)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(32))
        .spreadHorizontally()
        .repeat(6); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_DEEPSLATE_RUBY_RARE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.DEEPSLATE_RUBY_ORE.getDefaultState(),
            3)) // vein size
        .uniformRange(YOffset.getBottom(), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(7); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_TANZANITE_RARE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.TANZANITE_ORE.getDefaultState(),
            3)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(32))
        .spreadHorizontally()
        .repeat(6); // number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_DEEPSLATE_TANZANITE_RARE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.DEEPSLATE_TANZANITE_ORE.getDefaultState(),
            3)) // vein size
        .uniformRange(YOffset.getBottom(), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(7); // number of veins per chunk
    //Stone Types
    public static ConfiguredFeature<?, ?> GEN_MARBLE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.MARBLE.getDefaultState(),
            30)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(80))
        .spreadHorizontally()
        .repeat(7); // number of veins per chunk
    public static ConfiguredFeature<?, ?> GEN_DARK_GRANITE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModInit.DARK_GRANITE.getDefaultState(),
            30)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(75))
        .spreadHorizontally()
        .repeat(7); // number of veins per chunk
    public static ConfiguredFeature<?, ?> GEN_MUD = Feature.DISK
        .configure(new DiskFeatureConfig(
            ModInit.MUD.getDefaultState(),
            UniformIntProvider.create(3, 4), 4,
            Lists.newArrayList(Blocks.DIRT.getDefaultState(),
                Blocks.GRASS_BLOCK.getDefaultState()))).
            decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP);

    public static void register(ModConfig config) {
        // * Sapphire Common
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_sapphire_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireCommon.getValue(), ORE_SAPPHIRE_COMMON);
        RegistryKey<ConfiguredFeature<?, ?>> oreDeepslateSapphireCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_deepslate_sapphire_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepslateSapphireCommon.getValue(), ORE_DEEPSLATE_SAPPHIRE_COMMON);
        //Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_sapphire_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireRare.getValue(), ORE_SAPPHIRE_RARE);
        //Deepslate Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreDeepslateSapphireRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_deepslate_sapphire_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepslateSapphireRare.getValue(), ORE_DEEPSLATE_SAPPHIRE_RARE);
        if (config.enableSapphireOre) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireCommon);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepslateSapphireCommon);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireRare);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepslateSapphireRare);
        }
        // * Ruby Common
        RegistryKey<ConfiguredFeature<?, ?>> oreRubyCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_ruby_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyCommon.getValue(), ORE_RUBY_COMMON);
        // Deepslate Common
        RegistryKey<ConfiguredFeature<?, ?>> oreDeepslateRubyCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_deepslate_ruby_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepslateRubyCommon.getValue(), ORE_DEEPSLATE_RUBY_COMMON);
        //Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreRubyRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_ruby_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyRare.getValue(), ORE_RUBY_RARE);
        //Deepslate Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreDeepslateRubyRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_deepslate_ruby_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepslateRubyRare.getValue(), ORE_DEEPSLATE_RUBY_RARE);
        if (config.enableRubyOre) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyRare);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepslateRubyRare);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyCommon);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepslateRubyCommon);
        }
        // * Tanzanite Common
        RegistryKey<ConfiguredFeature<?, ?>> oreTanzaniteCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_tanzanite_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTanzaniteCommon.getValue(), ORE_TANZANITE_COMMON);
        //Deepslate Common
        RegistryKey<ConfiguredFeature<?, ?>> oreDeepslateTanzaniteCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_deepslate_tanzanite_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepslateTanzaniteCommon.getValue(), ORE_DEEPSLATE_TANZANITE_COMMON);
        //Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreTanzaniteRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_tanzanite_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTanzaniteRare.getValue(), ORE_TANZANITE_RARE);
        //Deepslate Rare
        RegistryKey<ConfiguredFeature<?, ?>> oreDeepslateTanzaniteRare = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "ore_deepslate_tanzanite_rare"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepslateTanzaniteRare.getValue(), ORE_DEEPSLATE_TANZANITE_RARE);
        if (config.enableTanzaniteOre) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTanzaniteRare);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepslateTanzaniteRare);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, oreTanzaniteCommon);
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepslateTanzaniteCommon);
        }
        //Stone Types
        //Marble
        RegistryKey<ConfiguredFeature<?, ?>> genMarble = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "gen_marble"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genMarble.getValue(), GEN_MARBLE);
        if (config.enableMarble) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, genMarble);
        }
        //Dark Granite
        RegistryKey<ConfiguredFeature<?, ?>> genDarkGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "gen_dark_granite"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genDarkGranite.getValue(), GEN_DARK_GRANITE);
        if (config.enableDarkGranite) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, genDarkGranite);
        }
        //Mud
        RegistryKey<ConfiguredFeature<?, ?>> genMud = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(VanillaEnhanced.MOD_ID, "gen_mud"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genMud.getValue(), GEN_MUD);
        if (config.enableMud) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.RAW_GENERATION, genMud);
        }
    }
}

