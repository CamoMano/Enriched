package com.vanillaenhanced.world;

import com.vanillaenhanced.VanillaEnhanced;
import com.vanillaenhanced.registry.ModInit;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Generator2 {

    private static ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModInit.SAPPHIRE_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk



public static void register(){
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(VanillaEnhanced.MOD_ID, "ore_sapphire_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireOverworld.getValue(), ORE_SAPPHIRE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworld);
    }

}

