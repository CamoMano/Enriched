package com.vanillaenhanced.entity;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

public class HoneySlime extends SlimeEntity {
    public HoneySlime(EntityType<? extends SlimeEntity> entityType, World world) {
        super(entityType, world);
    }

    public EntityData initialize(
        ServerWorldAccess world,
        LocalDifficulty difficulty,
        SpawnReason spawnReason,
        EntityData data,
        NbtCompound tag
    ) {
        EntityData ret = super.initialize(world, difficulty, spawnReason, data, tag);
        setSize(1 << (this.random.nextInt(10) < 1 ? 1 : 0), true);
        return ret;
    }

    //@Override
    protected ParticleEffect getParticles() {
        return ParticleTypes.FALLING_HONEY;
    }
}
