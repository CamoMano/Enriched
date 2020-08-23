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
import net.minecraft.world.biome.BiomeKeys;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

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


    //@Override
    


    //@Override
    protected ParticleEffect getParticles() {
        return ParticleTypes.FALLING_HONEY;
    }

}
