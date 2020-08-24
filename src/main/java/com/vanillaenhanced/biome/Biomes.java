package com.vanillaenhanced.biome;

import com.vanillaenhanced.mixin.BuiltinBiomesAccessor;
import com.vanillaenhanced.world.Features;
import com.vanillaenhanced.world.feature.tree.RedwoodTreeFeature;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.CreeperEntity;
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
import net.minecraft.world.gen.carver.CaveCarver;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import sun.jvm.hotspot.gc.shared.Generation;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

public final class Biomes {
    public static final RegistryKey<Biome> DIVERSE_FOREST_KEY;
    public static final RegistryKey<Biome> REDWOOD_FOREST_KEY;
    public static final RegistryKey<Biome> DESERT_MOUNTAINS_KEY;
    //public static final RegistryKey<Biome> EXTREME_MOUNTAIN_KEY;
    //public static final RegistryKey<Biome> FROZEN_DESERT_KEY;
    //public static final RegistryKey<Biome> EXTREME_JUNGLE_KEY;
    //public static final RegistryKey<Biome> MONOLITH_KEY;
    public static final Biome DIVERSE_FOREST;
    public static final Biome REDWOOD_FOREST;
    public static final Biome DESERT_MOUNTAINS;
    //public static final Biome EXTREME_MOUNTAIN;
    //public static final Biome FROZEN_DESERT;
    //public static final Biome EXTREME_JUNGLE;
    //public static final Biome MONOLITH;

    public static void init() {

        Registry.register(BuiltinRegistries.BIOME, DIVERSE_FOREST_KEY.getValue(), DIVERSE_FOREST);
        Registry.register(BuiltinRegistries.BIOME, REDWOOD_FOREST_KEY.getValue(), REDWOOD_FOREST);
        Registry.register(BuiltinRegistries.BIOME, DESERT_MOUNTAINS_KEY.getValue(), DESERT_MOUNTAINS);
        BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(DIVERSE_FOREST), DIVERSE_FOREST_KEY);
        BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(REDWOOD_FOREST), REDWOOD_FOREST_KEY);
        BuiltinBiomesAccessor.getIdMap().put(BuiltinRegistries.BIOME.getRawId(DESERT_MOUNTAINS), DESERT_MOUNTAINS_KEY);
    }



    static {
        DIVERSE_FOREST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID+":diverse_forest"));
        REDWOOD_FOREST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID+":redwood_forest"));
        DESERT_MOUNTAINS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID+":desert_mountains"));
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


        DESERT_MOUNTAINS = new Biome.Builder()
                .category(Biome.Category.DESERT)
                .depth(1.0F)
                .scale(0.75F)
                .temperature(2.0F)
                .downfall(0.0F)
                .effects(new BiomeEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .skyColor(0x84AAFF)
                        .grassColor(0x516b2e)
                        .build())
                .generationSettings(new GenerationSettings.Builder()
                .surfaceBuilder(SurfaceBuilder.DEFAULT.method_30478(SurfaceBuilder.SAND_CONFIG))
                        .carver(GenerationStep.Carver.AIR, ConfiguredCarvers.CAVE)
                        .carver(GenerationStep.Carver.AIR, ConfiguredCarvers.CANYON)
                        .structureFeature(ConfiguredStructureFeatures.DESERT_PYRAMID)
                        .structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL_DESERT)
                        .structureFeature(ConfiguredStructureFeatures.VILLAGE_DESERT)
                        .structureFeature(ConfiguredStructureFeatures.MINESHAFT)
                        .structureFeature(ConfiguredStructureFeatures.STRONGHOLD)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_COAL)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_DIAMOND)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_GOLD)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_IRON)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_GRANITE)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_ANDESITE)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_DIORITE)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_DIORITE)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_REDSTONE)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_LAPIS)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_DIRT)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_GRAVEL)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.DISK_SAND)
                        .feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.DISK_GRAVEL)
                        .feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.PATCH_CACTUS_DESERT)
                        .feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.PATCH_DEAD_BUSH)
                        .feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.BROWN_MUSHROOM_NORMAL)
                        .feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.RED_MUSHROOM_NORMAL)
                        .build())
                .precipitation(Biome.Precipitation.NONE)
                .spawnSettings(new SpawnSettings.Builder()
                .creatureSpawnProbability(0.2F)
                        .spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 8, 2, 4))
                        .spawn(SpawnGroup.AMBIENT, new SpawnSettings.SpawnEntry(EntityType.BAT, 10, 8, 8))
                        .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SPIDER, 100, 4, 4))
                        .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.HUSK, 95, 4, 4))
                        .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1))
                        .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SKELETON, 100, 4, 4))
                        .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.CREEPER, 100, 4, 4))
                        .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SLIME, 100, 4, 4))
                        .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4))
                        .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.WITCH, 5, 1, 1))
                        .build())
                .build();



    }








}
