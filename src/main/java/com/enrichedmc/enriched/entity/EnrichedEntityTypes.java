package com.enrichedmc.enriched.entity;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.entity.custom.HoneySlimeEntity;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.HostileEntity;

public class EnrichedEntityTypes
{
    public static final EntityType<HoneySlimeEntity> HONEY_SLIME;

    static
    {
        HONEY_SLIME = EnrichedRegisters.registerEntityType("honey_slime", EntityType.Builder.create(HoneySlimeEntity::new, SpawnGroup.MONSTER)
                .dimensions(2.04f, 2.04f)
                .eyeHeight(0.325f)
                .spawnBoxScale(4.0f)
                .maxTrackingRange(12)
                .build());
    }

    public static void registerEntityTypes()
    {
        EnrichedMod.LOGGER.info("Registering Enriched's entity types...");

        EnrichedEntityTypes.registerEntityAttributes();
    }

    private static void registerEntityAttributes()
    {
        FabricDefaultAttributeRegistry.register(HONEY_SLIME, HostileEntity.createHostileAttributes().build());
    }
}
