package com.enrichedmc.enriched.conditions.impl;

import com.enrichedmc.enriched.EnrichedMod;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class HorseArmorResourceCondition implements ResourceCondition
{
    @Override
    public ResourceConditionType<?> getType()
    {
        return ResourceConditionType.create(Identifier.of(EnrichedMod.MOD_ID, "horse_armor_enabled"), MapCodec.unit(HorseArmorResourceCondition::new));
    }

    @Override
    public boolean test(@Nullable RegistryWrapper.WrapperLookup registryLookup)
    {
        return EnrichedMod.getInstance().getGameOptions().recipeOptions.enableHorseArmorRecipes;
    }
}
