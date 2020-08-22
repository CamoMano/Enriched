package com.vanillaenhanced.biome;

import com.vanillaenhanced.mixin.BuiltinBiomesAccessor;
import com.vanillaenhanced.world.Features;
import com.vanillaenhanced.world.feature.tree.RedwoodTreeFeature;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.LakeFeature;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

public final class Biomes {
    public static final RegistryKey<Biome> DIVERSE_FOREST_KEY;
    public static final RegistryKey<Biome> REDWOOD_FOREST_KEY;
    //public static final RegistryKey<Biome> DESERT_MOUNTAINS_KEY;
    //public static final RegistryKey<Biome> EXTREME_MOUNTAIN_KEY;
    //public static final RegistryKey<Biome> FROZEN_DESERT_KEY;
    //public static final RegistryKey<Biome> EXTREME_JUNGLE_KEY;
    //public static final RegistryKey<Biome> MONOLITH_KEY;
    public static final Biome DIVERSE_FOREST;
    public static final Biome REDWOOD_FOREST;
    //public static final Biome DESERT_MOUNTAINS;
    //public static final Biome EXTREME_MOUNTAIN;
    //public static final Biome FROZEN_DESERT;
    //public static final Biome EXTREME_JUNGLE;
    //public static final Biome MONOLITH;

    public static void init() {

        Registry.register(BuiltinRegistries.BIOME, DIVERSE_FOREST_KEY.getValue(), DIVERSE_FOREST);
        Registry.register(BuiltinRegistries.BIOME, REDWOOD_FOREST_KEY.getValue(), REDWOOD_FOREST);
        BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(DIVERSE_FOREST), DIVERSE_FOREST_KEY);
        BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(REDWOOD_FOREST), REDWOOD_FOREST_KEY);
    }


    static {
        DIVERSE_FOREST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID+":diverse_forest"));
        REDWOOD_FOREST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID+":redwood_forest"));
        DIVERSE_FOREST = new Biome.Builder()
                .category(Biome.Category.FOREST)
                .depth(0.05F)
                .downfall(0.4F)
                .effects(new BiomeEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .skyColor(0x84AAFF)
                        .grassColor(0x516b2e)
                        .build())
                .generationSettings(new GenerationSettings.Builder()
                        .surfaceBuilder(SurfaceBuilder.DEFAULT.method_30478(SurfaceBuilder.GRASS_CONFIG))
                .build())
                .precipitation(Biome.Precipitation.RAIN)
                .scale(0.125F)
                .spawnSettings(new SpawnSettings.Builder()
                        .creatureSpawnProbability(0.2F)
                        .build())
                .temperature(0.8F)
                .build();
        REDWOOD_FOREST = new Biome.Builder()
                .category(Biome.Category.FOREST)
                .depth(0.125F)
                .downfall(0.4F)
                .effects(new BiomeEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .skyColor(0x84AAFF)
                        .grassColor(0x516b2e)
                        .build())
                .generationSettings(new GenerationSettings.Builder()
                        .surfaceBuilder(SurfaceBuilder.DEFAULT.method_30478(SurfaceBuilder.GRASS_CONFIG))
                        .build())
                .precipitation(Biome.Precipitation.RAIN)
                .scale(0.125F)
                .spawnSettings(new SpawnSettings.Builder()
                        .creatureSpawnProbability(0.2F)
                        .build())
                .temperature(0.8F)
                .build();



    }








}
