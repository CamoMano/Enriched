package com.enrichedmc.enriched.conditions.impl;

import com.enrichedmc.enriched.EnrichedMod;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.Nullable;

public class UncraftingResourceCondition implements ResourceCondition {
  @Override
  public ResourceConditionType<?> getType() {
    return ResourceConditionType.create(
        Identifier.fromNamespaceAndPath(EnrichedMod.MOD_ID, "uncrafting_enabled"),
        MapCodec.unit(UncraftingResourceCondition::new));
  }

  @Override
  public boolean test(@Nullable RegistryOps.RegistryInfoLookup registryLookup) {
    return EnrichedMod.getInstance().getGameOptions().recipeOptions.enableUncraftingRecipes;
  }
}
