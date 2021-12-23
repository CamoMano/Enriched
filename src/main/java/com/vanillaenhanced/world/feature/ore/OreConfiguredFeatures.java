package com.vanillaenhanced.world.feature.ore;

import com.vanillaenhanced.registry.ModInit;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

public class OreConfiguredFeatures {


    public static final ConfiguredFeature<?, ?> ORE_SAPPHIRE = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    4)); //vein
    public static final ConfiguredFeature<?, ?> ORE_SAPPHIRE_DEEPSLATE = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_SAPPHIRE_ORE.getDefaultState(),
                    4)); //vein
    public static final ConfiguredFeature<?, ?> ORE_SAPPHIRE_COMMON = Feature.ORE.
            configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    7)); //vein
    public static final ConfiguredFeature<?, ?> ORE_SAPPHIRE_DEEPSLATE_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_SAPPHIRE_ORE.getDefaultState(),
                    7)); //vein
    public static final ConfiguredFeature<?, ?> ORE_RUBY = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    ModInit.RUBY_ORE.getDefaultState(),
                    4)); //vein
    public static final ConfiguredFeature<?, ?> ORE_RUBY_DEEPSLATE = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_RUBY_ORE.getDefaultState(),
                    4)); //vein
    public static final ConfiguredFeature<?, ?> ORE_RUBY_COMMON = Feature.ORE.
            configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    ModInit.RUBY_ORE.getDefaultState(),
                    7)); //vein
    public static final ConfiguredFeature<?, ?> ORE_RUBY_DEEPSLATE_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_RUBY_ORE.getDefaultState(),
                    7)); //vein
    public static final ConfiguredFeature<?, ?> ORE_TANZANITE = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    ModInit.TANZANITE_ORE.getDefaultState(),
                    4)); //vein
    public static final ConfiguredFeature<?, ?> ORE_TANZANITE_DEEPSLATE = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_TANZANITE_ORE.getDefaultState(),
                    4)); //vein
    public static final ConfiguredFeature<?, ?> ORE_TANZANITE_COMMON = Feature.ORE.
            configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    ModInit.TANZANITE_ORE.getDefaultState(),
                    7)); //vein
    public static final ConfiguredFeature<?, ?> ORE_TANZANITE_DEEPSLATE_COMMON = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModInit.DEEPSLATE_TANZANITE_ORE.getDefaultState(),
                    7)); //vein
    public static final ConfiguredFeature<?, ?> GEN_DARK_GRANITE = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    ModInit.DARK_GRANITE.getDefaultState(),
                    30)); //vein
    public static final ConfiguredFeature<?, ?> GEN_MARBLE = Feature.ORE
            .configure(new OreFeatureConfig(net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    ModInit.MARBLE.getDefaultState(),
                    30)); //vein

    public static void register() {

        RegistryKey<ConfiguredFeature<?, ?>> oreSapphire = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_sapphire"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphire.getValue(), ORE_SAPPHIRE);
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_sapphire_deepslate"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireDeepslate.getValue(), ORE_SAPPHIRE_DEEPSLATE);
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_sapphire_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireCommon.getValue(), ORE_SAPPHIRE_COMMON);
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireDeepslateCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_sapphire_deepslate_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireDeepslateCommon.getValue(), ORE_SAPPHIRE_DEEPSLATE_COMMON);

        RegistryKey<ConfiguredFeature<?, ?>> oreRuby = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_ruby"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRuby.getValue(), ORE_RUBY);
        RegistryKey<ConfiguredFeature<?, ?>> oreRubyDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_ruby_deepslate"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyDeepslate.getValue(), ORE_RUBY_DEEPSLATE);
        RegistryKey<ConfiguredFeature<?, ?>> oreRubyCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_ruby_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyCommon.getValue(), ORE_RUBY_COMMON);
        RegistryKey<ConfiguredFeature<?, ?>> oreRubyDeepslateCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_ruby_deepslate_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyDeepslateCommon.getValue(), ORE_RUBY_DEEPSLATE_COMMON);

        RegistryKey<ConfiguredFeature<?, ?>> oreTanzanite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_tanzanite"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTanzanite.getValue(), ORE_TANZANITE);
        RegistryKey<ConfiguredFeature<?, ?>> oreTanzaniteDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_tanzanite_deepslate"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTanzaniteDeepslate.getValue(), ORE_TANZANITE_DEEPSLATE);
        RegistryKey<ConfiguredFeature<?, ?>> oreTanzaniteCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_tanzanite_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTanzaniteCommon.getValue(), ORE_TANZANITE_COMMON);
        RegistryKey<ConfiguredFeature<?, ?>> oreTanzaniteDeepslateCommon = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_tanzanite_deepslate_common"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTanzaniteDeepslateCommon.getValue(), ORE_TANZANITE_DEEPSLATE_COMMON);

        RegistryKey<ConfiguredFeature<?, ?>> genDarkGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "dark_granite"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genDarkGranite.getValue(), GEN_DARK_GRANITE);

        RegistryKey<ConfiguredFeature<?, ?>> genMarble = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "marble"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, genMarble.getValue(), GEN_MARBLE);

    }
}
