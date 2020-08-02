package com.vanillaenhanced.biome;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class RedwoodForest extends Biome {

    public RedwoodForest()
    {
        super((new Settings()).configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
                .precipitation(Precipitation.RAIN)
                .category(Category.FOREST)
                .depth(0.125F).scale(0.05F)
                .temperature(0.8F)
                .downfall(0.8F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build()).parent((String)null)
                .noises(ImmutableList.of(new MixedNoisePoint(0.95F, 0.9F, 0.0F, 0.0F, 1.0F))));
        this.addStructureFeature(DefaultBiomeFeatures.STRONGHOLD);
        this.addStructureFeature(DefaultBiomeFeatures.PILLAGER_OUTPOST);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(this);
        this.addStructureFeature(DefaultBiomeFeatures.STANDARD_RUINED_PORTAL);
        DefaultBiomeFeatures.addLandCarvers(this);
        DefaultBiomeFeatures.addDefaultLakes(this);
        DefaultBiomeFeatures.addLargeFerns(this);
        DefaultBiomeFeatures.addGiantSpruceTaigaTrees(this);
        DefaultBiomeFeatures.addGiantTaigaGrass(this);
        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addMossyRocks(this);
        DefaultBiomeFeatures.addForestFlowers(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addDefaultDisks(this);
        DefaultBiomeFeatures.addDefaultVegetation(this);
        DefaultBiomeFeatures.addPlainsTallGrass(this);
        DefaultBiomeFeatures.addDefaultMushrooms(this);
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.RABBIT, 12, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.FOX, 10, 1, 2));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.COW, 8, 4, 4));

    }
}
