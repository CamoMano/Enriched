package com.vanillaenhanced.entity;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.minecraft.world.biome.Biome;

public class HoneySlime extends SlimeEntity {

    public HoneySlime(EntityType<? extends SlimeEntity> entityType, World world) {
        super(entityType, world);
    }

    public EntityData initialize(
            ServerWorldAccess world,
            LocalDifficulty difficulty,
            SpawnReason spawnReason,
            EntityData data,
            CompoundTag tag
    ) {
        EntityData ret = super.initialize(world, difficulty, spawnReason, data, tag);
        setSize(1 << (this.random.nextInt(10) < 1 ? 1 : 0), true);
        return ret;
    }

    @Override
    public boolean canSpawn(WorldAccess world, SpawnReason spawnReason) {
        // seed for testing: 6211790508050301845
        BlockPos down = getBlockPos().down();
        boolean ret = !world.getDifficulty().equals(Difficulty.PEACEFUL);
        ret = ret && this.getY() >= 50f && this.getY() <= 70f;
        ret = ret && world.getBiome(down).getCategory() == Biome.Category.FOREST;
        // this last condition is basically super.super.canSpawn()
        ret = ret && (spawnReason == SpawnReason.SPAWNER || world.getBlockState(down).allowsSpawning(world, down, getType()));
        return ret;
    }

    //@Override
    protected ParticleEffect getParticles() {
        return ParticleTypes.FALLING_HONEY;
    }

}
