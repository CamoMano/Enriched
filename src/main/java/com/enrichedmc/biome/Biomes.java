package com.enrichedmc.biome;

public final class Biomes {
    /*
    public static final RegistryKey<Biome> DIVERSE_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "diverse_forest"));
    public static final RegistryKey<Biome> REDWOOD_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "redwood_forest"));
    public static final RegistryKey<Biome> FROZEN_DESERT = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "frozen_desert"));

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    public static void register(ModConfig config) {
        Registry.register(BuiltinRegistries.BIOME, DIVERSE_FOREST.getValue(), createDiverseForest());
        Registry.register(BuiltinRegistries.BIOME, REDWOOD_FOREST.getValue(), createRedwoodForest());
        Registry.register(BuiltinRegistries.BIOME, FROZEN_DESERT.getValue(), createFrozenDesert());
        log(Level.INFO, "Loaded biomes.");
    }

    public static Biome createDiverseForest() {
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


    private static Biome createRedwoodForest() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        ModBiomeFeatures.addTaigaMobs(spawnSettings);
        ModBiomeFeatures.addSalmon(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        ModBiomeFeatures.addRedwoodTrees(generationSettings);
        biomeStageOne(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        forestStageTwo(generationSettings);
        biomeStageThree(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);
        DefaultBiomeFeatures.addGiantTaigaGrass(generationSettings);
        DefaultBiomeFeatures.addMossyRocks(generationSettings);
        DefaultBiomeFeatures.addTaigaGrass(generationSettings);
        DefaultBiomeFeatures.addSweetBerryBushes(generationSettings);
        ModBiomeFeatures.addOldGrowthSpruce(generationSettings);
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



    private static Biome createFrozenDesert() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);
        ModBiomeFeatures.addFrozenDesertMobs(spawnSettings);
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        biomeStageOne(generationSettings);
        biomeStageThree(generationSettings);
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





    // * Stage One Features; common to all presently defined Biomes.
    public static void biomeStageOne(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addLandCarvers(settings);
        DefaultBiomeFeatures.addDefaultOres(settings);
        DefaultBiomeFeatures.addDefaultDisks(settings);
        DefaultBiomeFeatures.addDefaultMushrooms(settings);
    }

    // * Stage Two Features; common to all presently defined Forests.

    public static void forestStageTwo(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addDefaultGrass(settings);
        DefaultBiomeFeatures.addDefaultFlowers(settings);
    }


    // * Stage Three Features; common to a few presently defined biomes.
    public static void biomeStageThree(GenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addDungeons(settings);
        DefaultBiomeFeatures.addMineables(settings);
        DefaultBiomeFeatures.addSprings(settings);
        DefaultBiomeFeatures.addFrozenTopLayer(settings);
    }



     */
}