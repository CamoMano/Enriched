package com.enrichedmc.enriched.conditions.impl;

import com.enrichedmc.enriched.EnrichedMod;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class CopperResourceCondition implements ResourceCondition
{
    @Override
    public ResourceConditionType<?> getType()
    {
        return ResourceConditionType.create(Identifier.of(EnrichedMod.MOD_ID, "copper_enabled"), MapCodec.unit(CopperResourceCondition::new));
    }

    @Override
    public boolean test(@Nullable RegistryWrapper.WrapperLookup registryLookup)
    {
        return EnrichedMod.getInstance().getGameOptions().toolsAndArmorOptions.enableCopperTools;
    }
}
