package com.vanillaenhanced.biome;

import com.vanillaenhanced.config.ModConfig;
import net.fabricmc.fabric.impl.biome.OverworldBiomeData;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import org.apache.logging.log4j.Level;

import java.util.function.Supplier;

import static com.vanillaenhanced.VanillaEnhanced.*;


public final class Biomes {
    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    private static final RegistryKey<Biome> DIVERSE_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "diverse_forest"));

    public static void register(ModConfig config) {
        /*
        if (config.enableDiverseForest)
            registerBiome(Biomes::createDiverseForest, "diverse_forest", OverworldBiomeCreator.createPlains(false, false, false));
        if (config.enableRedwoodForest)
            registerBiome(Biomes::createRedwoodForest, "redwood_forest",  0.4);
        if (config.enableDesertMountain)
            registerBiome(Biomes::createDesertMountains, "desert_mountains",  0.5);
        if (config.enableExtremeMountain)
            registerBiome(Biomes::createExtremeMountains, "extreme_mountains",  0.25);
        if (config.enableFrozenDesert)
            registerBiome(Biomes::createFrozenDesert, "frozen_desert",  0.10);
        if (config.enableExtremeJungle)
            registerBiome(Biomes::createExtremeJungle, "extreme_jungle",  0.15);
        if (config.enableShatteredJungle)
            registerBiome(Biomes::createShatteredJungle, "shattered_jungle",  0.10);


         */
        Registry.register(BuiltinRegistries.BIOME, DIVERSE_FOREST.getValue(), createDiverseForest());

        log(Level.INFO, "Loaded biomes.");
    }


    private static Biome createDiverseForest() {
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addBirchTrees(generationSettings);
        DefaultBiomeFeatures.addForestTrees(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addPlainsMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        ModBiomeFeatures.addDefaultPortal(generationSettings);
        return (new Biome.Builder())
                .category(Biome.Category.FOREST)
                .temperature(0.8F)
                .downfall(0.85F)
                .precipitation(Biome.Precipitation.RAIN)
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .skyColor(0x84AAFF)
                        .grassColor(0x549845)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }

    private static Biome composeEndSpawnSettings(GenerationSettings.Builder builder) {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addPlainsMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        ModBiomeFeatures.addDefaultPortal(generationSettings);
        return (new Biome.Builder())
                .category(Biome.Category.FOREST)
                .temperature(0.8F)
                .downfall(0.85F)
                .precipitation(Biome.Precipitation.RAIN)
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .skyColor(0x84AAFF)
                        .grassColor(0x549845)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(builder.build())
                .build();
    }

    /*
        private static Biome createDiverseForest() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addPlainsMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        DefaultBiomeFeatures.addBirchTrees(generationSettings);
        DefaultBiomeFeatures.addForestTrees(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);
        ModBiomeFeatures.addDefaultPortal(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.FOREST)
            .temperature(0.8F)
            .downfall(0.85F)
            .precipitation(Biome.Precipitation.RAIN)
            .effects(new BiomeEffects.Builder()
                .waterColor(4159204)
                .waterFogColor(329011)
                .fogColor(12638463)
                .moodSound(BiomeMoodSound.CAVE)
                .skyColor(0x84AAFF)
                .grassColor(0x549845)
                .build())
            .spawnSettings(spawnSettings.build())
            .generationSettings(generationSettings.build())
            .build();
    }
     */

    private static Biome createRedwoodForest() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        ModBiomeFeatures.addTaigaMobs(spawnSettings);
        ModBiomeFeatures.addSalmon(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);
        DefaultBiomeFeatures.addGiantTaigaGrass(generationSettings);
        DefaultBiomeFeatures.addTaigaGrass(generationSettings);
        DefaultBiomeFeatures.addSweetBerryBushes(generationSettings);
        ModBiomeFeatures.addRedwoodTrees(generationSettings);
        ModBiomeFeatures.addDefaultPortal(generationSettings);
        ModBiomeFeatures.addMegaSpruce(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.FOREST)
            .temperature(0.85F)
            .downfall(0.85F)
            .precipitation(Biome.Precipitation.RAIN)
            .effects(new BiomeEffects.Builder()
                .waterColor(0x287082)
                .waterFogColor(329011)
                .fogColor(12638463)
                .moodSound(BiomeMoodSound.CAVE)
                .skyColor(0x84AAFF)
                .grassColor(0x549845)
                .build())
            .spawnSettings(spawnSettings.build())
            .generationSettings(generationSettings.build())
            .build();
    }

    private static Biome createDesertMountains() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addDesertMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDesertVegetation(generationSettings);
        biomeStageThree(generationSettings);
        ModBiomeFeatures.addDesertFeatures(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.DESERT)
            .temperature(2.0F)
            .downfall(0.0F)
            .precipitation(Biome.Precipitation.NONE)
            .effects(new BiomeEffects.Builder()
                .waterColor(4159204)
                .waterFogColor(329011)
                .fogColor(12638463)
                .moodSound(BiomeMoodSound.CAVE)
                .skyColor(0x84AAFF)
                .grassColor(0xd6b27c)
                .build())
            .spawnSettings(spawnSettings.build())
            .generationSettings(generationSettings.build())
            .build();
    }

    private static Biome createFrozenDesert() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        ModBiomeFeatures.addFrozenDesertMobs(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        biomeStageThree(generationSettings);
        ModBiomeFeatures.addDesertFeatures(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.ICY)
            .temperature(-0.8F)
            .downfall(0.5F)
            .precipitation(Biome.Precipitation.SNOW)
            .effects(new BiomeEffects.Builder()
                .waterColor(0x3938C9)
                .waterFogColor(329011)
                .fogColor(12638463)
                .moodSound(BiomeMoodSound.CAVE)
                .skyColor(0x84AAFF)
                .grassColor(0xd6b27c)
                .build())
            .spawnSettings(spawnSettings.build())
            .generationSettings(generationSettings.build())
            .build();
    }

    private static Biome createExtremeMountains() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        ModBiomeFeatures.addMountainMobs(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addTaigaGrass(generationSettings);
        ModBiomeFeatures.addMountainPortal(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.EXTREME_HILLS)
            .temperature(0.2F)
            .downfall(0.3F)
            .precipitation(Biome.Precipitation.RAIN)
            .effects(new BiomeEffects.Builder()
                .waterColor(4159204)
                .waterFogColor(329011)
                .fogColor(12638463)
                .moodSound(BiomeMoodSound.CAVE)
                .skyColor(0x84AAFF)
                .grassColor(0x8ab689)
                .build())
            .spawnSettings(spawnSettings.build())
            .generationSettings(generationSettings.build())
            .build();
    }

    private static Biome createExtremeJungle() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addJungleMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        ModBiomeFeatures.addJungleMobsExtra(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addJungleVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        DefaultBiomeFeatures.addJungleTrees(generationSettings);
        DefaultBiomeFeatures.addSparseJungleTrees(generationSettings);
        ModBiomeFeatures.addJunglePortal(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.JUNGLE)
            .temperature(0.95F)
            .downfall(0.9F)
            .precipitation(Biome.Precipitation.RAIN)
            .effects(new BiomeEffects.Builder()
                .waterColor(4159204)
                .waterFogColor(329011)
                .fogColor(12638463)
                .moodSound(BiomeMoodSound.CAVE)
                .skyColor(0x84AAFF)
                .grassColor(0x59c93c)
                .build())
            .spawnSettings(spawnSettings.build())
            .generationSettings(generationSettings.build())
            .build();
    }
    private static Biome createShatteredJungle() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addJungleMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, true);
        ModBiomeFeatures.addJungleMobsExtra(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addJungleVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        DefaultBiomeFeatures.addJungleTrees(generationSettings);
        DefaultBiomeFeatures.addSparseJungleTrees(generationSettings);
        ModBiomeFeatures.addJunglePortal(generationSettings);
        return (new Biome.Builder())
                .category(Biome.Category.JUNGLE)
                .temperature(0.95F)
                .downfall(0.9F)
                .precipitation(Biome.Precipitation.RAIN)
                .effects(new BiomeEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .skyColor(0x84AAFF)
                        .grassColor(0x59c93c)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }





    // * Stage One Features; common to all presently defined Biomes.
    private static void biomeStageOne(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addLandCarvers(settings);
        DefaultBiomeFeatures.addDefaultOres(settings);
        DefaultBiomeFeatures.addDefaultDisks(settings);
        DefaultBiomeFeatures.addDefaultMushrooms(settings);
    }

     // * Stage Two Features; common to all presently defined Forests.

    private static void forestStageTwo(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addDefaultGrass(settings);
        DefaultBiomeFeatures.addDefaultFlowers(settings);
    }


    // * Stage Three Features; common to a few presently defined biomes.
    private static void biomeStageThree(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addDungeons(settings);
        DefaultBiomeFeatures.addMineables(settings);
        DefaultBiomeFeatures.addSprings(settings);
        DefaultBiomeFeatures.addFrozenTopLayer(settings);
    }


}