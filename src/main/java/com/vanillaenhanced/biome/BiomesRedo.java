package com.vanillaenhanced.biome;

import com.vanillaenhanced.config.ModConfig;
import com.vanillaenhanced.mixin.BuiltinBiomesAccessor;
import com.vanillaenhanced.mixin.SetBaseBiomesLayerAccessor;
import com.vanillaenhanced.mixin.VanillaLayeredBiomeSourceAccessor;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
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
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

public final class BiomesRedo {

    public static boolean enableRedwoodForest = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableRedwoodForest;
    public static boolean enableDiverseForest = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableDiverseForest;
    public static boolean enableDesertMountain = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableDesertMountain;
    public static boolean enableExtremeMountain = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableExtremeMountain;
    public static boolean enableExtremeJungle = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableExtremeJungle;
    public static boolean enableFrozenDesert = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableFrozenDesert;

    private static final Biome DIVERSE_FOREST = createDiverseForest();
    private static final Biome REDWOOD_FOREST = createRedwoodForest();
    private static final Biome DESERT_MOUNTAINS = createDesertMountains();
    private static final Biome EXTREME_MOUNTAINS = createExtremeMountains();
    private static final Biome FROZEN_DESERT = createFrozenDesert();
    private static final Biome EXTREME_JUNGLE = createExtremeJungle();

    public static final RegistryKey<Biome> DIVERSE_FOREST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "diverse_forest"));
    public static final RegistryKey<Biome> REDWOOD_FOREST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "redwood_forest"));
    public static final RegistryKey<Biome> DESERT_MOUNTAINS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "desert_mountains"));
    public static final RegistryKey<Biome> EXTREME_MOUNTAINS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "extreme_mountains"));
    public static final RegistryKey<Biome> FROZEN_DESERT_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "frozen_desert"));
    public static final RegistryKey<Biome> EXTREME_JUNGLE_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "extreme_jungle"));


    public static void init() {
        List<RegistryKey<Biome>> biomes = new ArrayList<>(VanillaLayeredBiomeSourceAccessor.getBiomes());


        if (enableDiverseForest) {
            Registry.register(BuiltinRegistries.BIOME, DIVERSE_FOREST_KEY.getValue(), DIVERSE_FOREST);
            BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(DIVERSE_FOREST), DIVERSE_FOREST_KEY);
            biomes.add(DIVERSE_FOREST_KEY);
            SetBaseBiomesLayerAccessor.setTemperateBiomes(
                    ArrayUtils.add(SetBaseBiomesLayerAccessor.getTemperateBiomes(), BuiltinRegistries.BIOME.getRawId(DIVERSE_FOREST)));
        }

        if (enableRedwoodForest) {
            Registry.register(BuiltinRegistries.BIOME, REDWOOD_FOREST_KEY.getValue(), REDWOOD_FOREST);
            BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(REDWOOD_FOREST), REDWOOD_FOREST_KEY);
            biomes.add(REDWOOD_FOREST_KEY);
            SetBaseBiomesLayerAccessor.setTemperateBiomes(
                    ArrayUtils.add(SetBaseBiomesLayerAccessor.getTemperateBiomes(), BuiltinRegistries.BIOME.getRawId(REDWOOD_FOREST)));
        }

        if (enableDesertMountain) {
            Registry.register(BuiltinRegistries.BIOME, DESERT_MOUNTAINS_KEY.getValue(), DESERT_MOUNTAINS);
            BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(DESERT_MOUNTAINS), DESERT_MOUNTAINS_KEY);
            biomes.add(DESERT_MOUNTAINS_KEY);
            SetBaseBiomesLayerAccessor.setDryBiomes(
                    ArrayUtils.add(SetBaseBiomesLayerAccessor.getDryBiomes(), BuiltinRegistries.BIOME.getRawId(DESERT_MOUNTAINS)));
        }

        if (enableExtremeMountain) {
            Registry.register(BuiltinRegistries.BIOME, EXTREME_MOUNTAINS_KEY.getValue(), EXTREME_MOUNTAINS);
            BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(EXTREME_MOUNTAINS), EXTREME_MOUNTAINS_KEY);
            biomes.add(EXTREME_MOUNTAINS_KEY);
            SetBaseBiomesLayerAccessor.setCoolBiomes(
                    ArrayUtils.add(SetBaseBiomesLayerAccessor.getCoolBiomes(), BuiltinRegistries.BIOME.getRawId(EXTREME_MOUNTAINS)));
        }

        if (enableFrozenDesert) {
            Registry.register(BuiltinRegistries.BIOME, FROZEN_DESERT_KEY.getValue(), FROZEN_DESERT);
            BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(FROZEN_DESERT), FROZEN_DESERT_KEY);
            biomes.add(FROZEN_DESERT_KEY);
            SetBaseBiomesLayerAccessor.setSnowyBiomes(
                    ArrayUtils.add(SetBaseBiomesLayerAccessor.getSnowyBiomes(), BuiltinRegistries.BIOME.getRawId(FROZEN_DESERT)));
        }

        if (enableExtremeJungle) {
            Registry.register(BuiltinRegistries.BIOME, EXTREME_JUNGLE_KEY.getValue(), EXTREME_JUNGLE);
            BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(EXTREME_JUNGLE), EXTREME_JUNGLE_KEY);
            biomes.add(EXTREME_JUNGLE_KEY);
            SetBaseBiomesLayerAccessor.setTemperateBiomes(
                    ArrayUtils.add(SetBaseBiomesLayerAccessor.getTemperateBiomes(), BuiltinRegistries.BIOME.getRawId(EXTREME_JUNGLE)));
        }

        VanillaLayeredBiomeSourceAccessor.setBiomes(biomes);




    }

    private static Biome createDiverseForest() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addPlainsMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.method_30478(SurfaceBuilder.GRASS_CONFIG));
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addDefaultMushrooms(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDefaultGrass(generationSettings);
        DefaultBiomeFeatures.addDefaultFlowers(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addBirchTrees(generationSettings);
        DefaultBiomeFeatures.addForestTrees(generationSettings);
        DefaultBiomeFeatures.addMountainTrees(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);

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
        DefaultBiomeFeatures.addSnowyMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        ModBiomeFeatures.addTaigaMobs(spawnSettings);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.method_30478(SurfaceBuilder.GRASS_CONFIG));
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addDefaultMushrooms(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDefaultGrass(generationSettings);
        DefaultBiomeFeatures.addDefaultFlowers(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);
        DefaultBiomeFeatures.addGiantTaigaGrass(generationSettings);
        DefaultBiomeFeatures.addTaigaGrass(generationSettings);
        DefaultBiomeFeatures.addSweetBerryBushes(generationSettings);
        ModBiomeFeatures.addRedwoodTrees(generationSettings);

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
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.method_30478(SurfaceBuilder.SAND_CONFIG));
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addDefaultMushrooms(generationSettings);
        DefaultBiomeFeatures.addDesertVegetation(generationSettings);
        DefaultBiomeFeatures.addDesertLakes(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);

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
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
        ModBiomeFeatures.addFrozenDesertMobs(spawnSettings);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.method_30478(SurfaceBuilder.SAND_CONFIG));
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addDefaultMushrooms(generationSettings);
        DefaultBiomeFeatures.addDesertVegetation(generationSettings);
        DefaultBiomeFeatures.addDesertLakes(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addBirchTrees(generationSettings);
        DefaultBiomeFeatures.addForestTrees(generationSettings);
        DefaultBiomeFeatures.addMountainTrees(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);

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
        DefaultBiomeFeatures.addDesertMobs(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(SurfaceBuilder.MOUNTAIN.method_30478(SurfaceBuilder.GRASS_CONFIG));
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addDefaultMushrooms(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addMountainTrees(generationSettings);
        DefaultBiomeFeatures.addTaigaGrass(generationSettings);


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
        generationSettings.surfaceBuilder(SurfaceBuilder.DEFAULT.method_30478(SurfaceBuilder.GRASS_CONFIG));
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addDefaultMushrooms(generationSettings);
        DefaultBiomeFeatures.addJungleVegetation(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDefaultGrass(generationSettings);
        DefaultBiomeFeatures.addDefaultFlowers(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addJungleTrees(generationSettings);
        DefaultBiomeFeatures.addJungleEdgeTrees(generationSettings);


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








}
