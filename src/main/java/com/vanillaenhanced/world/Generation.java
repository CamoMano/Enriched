package com.vanillaenhanced.world;

import com.vanillaenhanced.registry.ModInit;
import com.vanillaenhanced.world.feature.tree.RedwoodTreeDecorator;
import com.vanillaenhanced.world.feature.tree.RedwoodTreeFeature;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;

import java.util.ArrayList;
import java.util.List;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;
import static com.vanillaenhanced.registry.ModInit.*;


public class Generation {

    public static void handleBiome(Biome biome) {
        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            if (enableDarkGranite){
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    ModInit.DARK_GRANITE.getDefaultState(),
                                    30 //Ore vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    7, //Number of veins per chunk
                                    0, //Bottom Offset
                                    0, //Min y level
                                    75 //Max y level
                            ))));}
            if (enableMarble){
                biome.addFeature(
                        GenerationStep.Feature.UNDERGROUND_ORES,
                        Feature.ORE.configure(
                                new OreFeatureConfig(
                                        OreFeatureConfig.Target.NATURAL_STONE,
                                        ModInit.MARBLE.getDefaultState(),
                                        30 //Ore vein size
                                )).createDecoratedFeature(
                                Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                        7, //Number of veins per chunk
                                        0, //Bottom Offset
                                        0, //Min y level
                                        80 //Max y level
                                ))));}
            if (enableRubyGear) {
                biome.addFeature(
                        GenerationStep.Feature.UNDERGROUND_ORES,
                        Feature.ORE.configure(
                                new OreFeatureConfig(
                                        OreFeatureConfig.Target.NATURAL_STONE,
                                        ModInit.RUBY_ORE.getDefaultState(),
                                        3 //Ore vein size
                                )).createDecoratedFeature(
                                Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                        5, //Number of veins per chunk
                                        0, //Bottom Offset
                                        0, //Min y level
                                        32 //Max y level
                                ))));
                if (biome.getCategory() == Biome.Category.DESERT) {
                    biome.addFeature(
                            GenerationStep.Feature.UNDERGROUND_ORES,
                            Feature.ORE.configure(
                                    new OreFeatureConfig(
                                            OreFeatureConfig.Target.NATURAL_STONE,
                                            ModInit.RUBY_ORE.getDefaultState(),
                                            6 //Ore vein size
                                    )).createDecoratedFeature(
                                    Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                            8, //Number of veins per chunk
                                            0, //Bottom Offset
                                            0, //Min y level
                                            32 //Max y level
                                    ))));
                }
            }
            if (enableSapphireGear) {
                biome.addFeature(
                        GenerationStep.Feature.UNDERGROUND_ORES,
                        Feature.ORE.configure(
                                new OreFeatureConfig(
                                        OreFeatureConfig.Target.NATURAL_STONE,
                                        ModInit.SAPPHIRE_ORE.getDefaultState(),
                                        3 //Ore vein size
                                )).createDecoratedFeature(
                                Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                        5, //Number of veins per chunk
                                        0, //Bottom Offset
                                        0, //Min y level
                                        32 //Max y level
                                ))));
                if (biome.getCategory() == Biome.Category.ICY) {
                    biome.addFeature(
                            GenerationStep.Feature.UNDERGROUND_ORES,
                            Feature.ORE.configure(
                                    new OreFeatureConfig(
                                            OreFeatureConfig.Target.NATURAL_STONE,
                                            ModInit.SAPPHIRE_ORE.getDefaultState(),
                                            6 //Ore vein size
                                    )).createDecoratedFeature(
                                    Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                            8, //Number of veins per chunk
                                            0, //Bottom Offset
                                            0, //Min y level
                                            32 //Max y level
                                    ))));
                }

            }
        }
    }


    private static final List<Biome> checkedBiomes = new ArrayList<>();

    public static void initBiomeFeatures() {

            setupTrees();

            for (Biome biome : Registry.BIOME) {
                addToBiome(biome);
            }

            //Handles modded biomes
            RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> addToBiome(biome));

    }

    private static void setupTrees() {
        REDWOOD_TREE_FEATURE = Registry.register(Registry.FEATURE, new Identifier(MOD_ID, "redwood_tree"), new RedwoodTreeFeature(TreeFeatureConfig.CODEC));
        REDWOOD_TREE_DECORATOR = Registry.register(Registry.DECORATOR, new Identifier(MOD_ID,"redwood_tree"), new RedwoodTreeDecorator(ChanceDecoratorConfig.field_24980));

        WeightedBlockStateProvider logProvider = new WeightedBlockStateProvider();
        logProvider.addState(REDWOOD_LOG.getDefaultState(), 10);

        REDWOOD_TREE_CONFIG = new TreeFeatureConfig.Builder(
                logProvider,
                new SimpleBlockStateProvider(REDWOOD_LEAVES.getDefaultState()),
                new RedwoodTreeFeature.FoliagePlacer(3, 1, 0, 0, 3),
                new MegaJungleTrunkPlacer(16,16,16),
                new TwoLayersFeatureSize(1, 0, 1)
        ).build();
    }

    private static void addToBiome(Biome biome) {
        if (checkedBiomes.contains(biome)) {
            //Just to be sure we dont add the stuff twice to the same biome
            return;
        }
        checkedBiomes.add(biome);


        if (biome.equals(REDWOOD_FOREST)) {
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION,
                    REDWOOD_TREE_FEATURE.configure(REDWOOD_TREE_CONFIG)
            );
        }
    }
}
