package com.vanillaenhanced.world;


import com.vanillaenhanced.biome.Biomes;
import com.vanillaenhanced.world.feature.tree.RedwoodTreeDecorator;
import com.vanillaenhanced.world.feature.tree.RedwoodTreeFeature;
import me.shedaniel.cloth.api.dynamic.registry.v1.BiomesRegistry;

import com.vanillaenhanced.registry.ModInit;
import net.minecraft.datafixer.fix.BiomeRenameFix;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeLayerSampler;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;


import java.util.function.Supplier;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;
import static com.vanillaenhanced.registry.ModInit.*;

public class Generator {


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
        if (biome.equals(Biomes.REDWOOD_FOREST_KEY)) {
            BiomesRegistry.registerFeature(biome, GenerationStep.Feature.VEGETAL_DECORATION, () -> Feature.TREE.configure(Features.REDWOOD_TREE_FEATURE.config));
        }
    }


    /*
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
                if (enableAmethystGear) {
                    biome.addFeature(
                            GenerationStep.Feature.UNDERGROUND_ORES,
                            Feature.ORE.configure(
                                    new OreFeatureConfig(
                                            OreFeatureConfig.Target.NATURAL_STONE,
                                            ModInit.AMETHYST_ORE.getDefaultState(),
                                            3 //Ore vein size
                                    )).createDecoratedFeature(
                                    Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                            5, //Number of veins per chunk
                                            0, //Bottom Offset
                                            0, //Min y level
                                            32 //Max y level
                                    ))));
                    if (biome.getCategory() == Biome.Category.JUNGLE) {
                        biome.addFeature(
                                GenerationStep.Feature.UNDERGROUND_ORES,
                                Feature.ORE.configure(
                                        new OreFeatureConfig(
                                                OreFeatureConfig.Target.NATURAL_STONE,
                                                ModInit.AMETHYST_ORE.getDefaultState(),
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

 */
}
