package com.vanillaenhanced.world;

import com.vanillaenhanced.registry.ModInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;


public class Generation{

    public static void handleBiome(Biome biome) {
        if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            if (biome.getCategory() == Biome.Category.DESERT){
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    ModInit.RUBY_ORE.getDefaultState(),
                                    6 //Ore vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    7, //Number of veins per chunk
                                    0, //Bottom Offset
                                    0, //Min y level
                                    36 //Max y level
                            ))));}
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    ModInit.DARK_GRANITE.getDefaultState(),
                                    30 //Ore vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    8, //Number of veins per chunk
                                    0, //Bottom Offset
                                    0, //Min y level
                                    80 //Max y level
                            ))));
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    ModInit.RUBY_ORE.getDefaultState(),
                                    4 //Ore vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    6, //Number of veins per chunk
                                    0, //Bottom Offset
                                    0, //Min y level
                                    32 //Max y level
                            ))));
        }
    }

}