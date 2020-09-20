package com.vanillaenhanced.biome;

import com.vanillaenhanced.world.Features;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.Feature;

public class ModBiomeFeatures {
    public static void addWolves(net.minecraft.world.biome.SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 8, 4, 4));
    }
    public static void addTaigaMobs(net.minecraft.world.biome.SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 8, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.FOX, 8, 2, 4));
    }
    public static void addFrozenDesertMobs(net.minecraft.world.biome.SpawnSettings.Builder builder) {

    }
    public static void addMountainMobs(net.minecraft.world.biome.SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 8, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.FOX, 8, 2, 4));
    }
    public static void addRedwoodTrees(GenerationSettings.Builder builder) {
        builder.feature(GenerationStep.Feature.SURFACE_STRUCTURES, Feature.TREE.configure(Features.REDWOOD_TREE_FEATURE.config));

    }

}
