package com.vanillaenhanced.world;


import com.vanillaenhanced.VanillaEnhanced;
import com.vanillaenhanced.registry.ModInit;
import me.shedaniel.cloth.api.dynamic.registry.v1.BiomesRegistry;
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

import static com.vanillaenhanced.registry.ModInit.*;

public class Generator {
/*
    public static void oreGen(RegistryKey<Biome> registryKey, Biome biome) {
        if (enableRubyGear) {
            BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModInit.RUBY_ORE.getDefaultState(), 3)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 32)).spreadHorizontally().repeat(5)));
            if (biome.getCategory() == Biome.Category.DESERT) {
                BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModInit.RUBY_ORE.getDefaultState(), 6)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 32)).spreadHorizontally().repeat(8)));
            }
        }

        if (enableSapphireGear) {
            BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModInit.SAPPHIRE_ORE.getDefaultState(), 3)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 32)).spreadHorizontally().repeat(5)));
            if (biome.getCategory() == Biome.Category.ICY) {
                BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModInit.SAPPHIRE_ORE.getDefaultState(), 6)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 32)).spreadHorizontally().repeat(8)));

            }
        }

        if (enableAmethystGear) {
            BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, AMETHYST_ORE.getDefaultState(), 3)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 32)).spreadHorizontally().repeat(5)));
            if (biome.getCategory() == Biome.Category.JUNGLE) {
                BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModInit.AMETHYST_ORE.getDefaultState(), 6)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 32)).spreadHorizontally().repeat(8)));

            }
        }



    }
    public static void blockGen(RegistryKey<Biome> registryKey, Biome biome) {
        if (enableDarkGranite) {
            BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModInit.DARK_GRANITE.getDefaultState(), 30)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 75)).spreadHorizontally().repeat(7)));
        }
        if (enableMarble) {
            BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModInit.MARBLE.getDefaultState(), 30)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 80)).spreadHorizontally().repeat(7)));
        }
    }

    public static void setupTrees(RegistryKey<Biome> registryKey, Biome biome){
        //BiomesRegistry.registerFeature(biome, GenerationStep.Feature.VEGETAL_DECORATION, () -> Feature.TREE.configure(Features.REDWOOD_TREE_FEATURE.config));
    }



    public static void registerConfiguredFeatures() {
        Registry<ConfiguredFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_FEATURE;
        Registry.register(Registry.FEATURE, new Identifier(VanillaEnhanced.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);

    }

    public static ConfiguredFeature <?, ?> SAPPHIRE_ORE =

 */
}

