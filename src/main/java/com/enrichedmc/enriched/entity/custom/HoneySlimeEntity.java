package com.enrichedmc.enriched.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class HoneySlimeEntity extends SlimeEntity
{
    public HoneySlimeEntity(EntityType<? extends SlimeEntity> entityType, World world)
    {
        super(entityType, world);
    }

    @Override
    protected SoundEvent getJumpSound()
    {
        return SoundEvents.ENTITY_SLIME_JUMP;
    }

    @Override
    protected SoundEvent getSquishSound()
    {
        return SoundEvents.ENTITY_SLIME_SQUISH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source)
    {
        return SoundEvents.ENTITY_SLIME_HURT;
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_SLIME_DEATH;
    }
}
