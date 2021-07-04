package com.vanillaenhanced.biome;

import com.vanillaenhanced.config.ModConfig;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import java.util.function.Supplier;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

public final class Biomes {
    @SuppressWarnings("deprecation") //Experimental v1 Biome API
    public static void register(ModConfig config) {
        if (config.enableDiverseForest)
            registerBiome(Biomes::createDiverseForest, "diverse_forest", OverworldClimate.TEMPERATE, 0.75);
        if (config.enableRedwoodForest)
            registerBiome(Biomes::createRedwoodForest, "redwood_forest", OverworldClimate.TEMPERATE, 0.4);
        if (config.enableDesertMountain)
            registerBiome(Biomes::createDesertMountains, "desert_mountains", OverworldClimate.DRY, 0.5);
        if (config.enableExtremeMountain)
            registerBiome(Biomes::createExtremeMountains, "extreme_mountains", OverworldClimate.COOL, 0.25);
        if (config.enableFrozenDesert)
            registerBiome(Biomes::createFrozenDesert, "frozen_desert", OverworldClimate.SNOWY, 0.10);
        if (config.enableExtremeJungle)
            registerBiome(Biomes::createExtremeJungle, "extreme_jungle", OverworldClimate.TEMPERATE, 0.15);
    }

    @SuppressWarnings("deprecation") //Experimental v1 API
    private static void registerBiome(
        Supplier<Biome> supplier,
        String biomeName,
        OverworldClimate climate,
        double weight
    ) {
        final RegistryKey<Biome> biomeKey = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, biomeName));
        final Biome biome = supplier.get();
        Registry.register(BuiltinRegistries.BIOME, biomeKey.getValue(), biome);
        OverworldBiomes.addContinentalBiome(biomeKey, climate, weight);
    }

    private static Biome createDiverseForest() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addPlainsMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.withConfig(SurfaceBuilder.GRASS_CONFIG));
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        DefaultBiomeFeatures.addBirchTrees(generationSettings);
        DefaultBiomeFeatures.addForestTrees(generationSettings);
        DefaultBiomeFeatures.addMountainTrees(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);
        ModBiomeFeatures.addDefaultPortal(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.FOREST)
            .depth(0.125F)
            .scale(0.05F)
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

    private static Biome createRedwoodForest() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        ModBiomeFeatures.addTaigaMobs(spawnSettings);
        ModBiomeFeatures.addSalmon(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.withConfig(SurfaceBuilder.GRASS_CONFIG));
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
            .depth(0.125F)
            .scale(0.2F)
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
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.withConfig(SurfaceBuilder.SAND_CONFIG));
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDesertVegetation(generationSettings);
        DefaultBiomeFeatures.addDesertLakes(generationSettings);
        biomeStageThree(generationSettings);
        ModBiomeFeatures.addDesertFeatures(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.DESERT)
            .depth(1.0F)
            .scale(0.75F)
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
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        ModBiomeFeatures.addFrozenDesertMobs(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.withConfig(SurfaceBuilder.SAND_CONFIG));
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDesertLakes(generationSettings);
        biomeStageThree(generationSettings);
        ModBiomeFeatures.addDesertFeatures(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.ICY)
            .depth(0.125F)
            .scale(0.05F)
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
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        ModBiomeFeatures.addMountainMobs(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.MOUNTAIN.withConfig(SurfaceBuilder.GRASS_CONFIG));
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addMountainTrees(generationSettings);
        DefaultBiomeFeatures.addTaigaGrass(generationSettings);
        ModBiomeFeatures.addMountainPortal(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.EXTREME_HILLS)
            .depth(2.0F)
            .scale(1.0F)
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
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        ModBiomeFeatures.addJungleMobsExtra(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.withConfig(SurfaceBuilder.GRASS_CONFIG));
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addJungleVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        DefaultBiomeFeatures.addJungleTrees(generationSettings);
        DefaultBiomeFeatures.addJungleEdgeTrees(generationSettings);
        ModBiomeFeatures.addJunglePortal(generationSettings);
        return (new Biome.Builder())
            .category(Biome.Category.JUNGLE)
            .depth(1.0F)
            .scale(0.4F)
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

    /**
     * Stage One Features; common to all presently defined Biomes.
     */
    private static void biomeStageOne(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addDefaultUndergroundStructures(settings);
        DefaultBiomeFeatures.addDefaultOres(settings);
        DefaultBiomeFeatures.addDefaultDisks(settings);
        DefaultBiomeFeatures.addDefaultMushrooms(settings);
    }

    /**
     * Stage Two Features; common to all presently defined Forests.
     */
    private static void forestStageTwo(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addDefaultLakes(settings);
        DefaultBiomeFeatures.addDefaultGrass(settings);
        DefaultBiomeFeatures.addDefaultFlowers(settings);
    }

    /**
     * Stage Three Features; common to a few presently defined biomes.
     */
    private static void biomeStageThree(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addLandCarvers(settings);
        DefaultBiomeFeatures.addDungeons(settings);
        DefaultBiomeFeatures.addMineables(settings);
        DefaultBiomeFeatures.addSprings(settings);
        DefaultBiomeFeatures.addFrozenTopLayer(settings);
    }
}
