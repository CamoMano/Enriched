package com.vanillaenhanced.biome;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class DiverseForest extends Biome {

    public DiverseForest()
    {
        super((new Biome.Settings()).configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
                .precipitation(Biome.Precipitation.RAIN)
                .category(Category.FOREST)
                .depth(0.125F).scale(0.05F)
                .temperature(0.8F)
                .downfall(0.4F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build()).parent((String)null)
                .noises(ImmutableList.of(new Biome.MixedNoisePoint(0.7F, 0.0F, 0.0F, 0.0F, 1.0F))));
        this.addStructureFeature(DefaultBiomeFeatures.STRONGHOLD);
        this.addStructureFeature(DefaultBiomeFeatures.PILLAGER_OUTPOST);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(this);
        this.addStructureFeature(DefaultBiomeFeatures.STANDARD_RUINED_PORTAL);
        DefaultBiomeFeatures.addLandCarvers(this);
        DefaultBiomeFeatures.addDefaultLakes(this);
        DefaultBiomeFeatures.addMountainTrees(this);
        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addForestFlowers(this);
        DefaultBiomeFeatures.addForestGrass(this);
        DefaultBiomeFeatures.addBirchTrees(this);
        DefaultBiomeFeatures.addTaigaTrees(this);
        DefaultBiomeFeatures.addForestTrees(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addDefaultDisks(this);
        DefaultBiomeFeatures.addDefaultMushrooms(this);
        DefaultBiomeFeatures.addDefaultVegetation(this);
        this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.COW, 8, 4, 4));

    }
}
