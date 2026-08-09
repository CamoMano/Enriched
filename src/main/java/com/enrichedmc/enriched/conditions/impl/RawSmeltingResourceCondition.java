package com.enrichedmc.enriched.conditions.impl;

import com.enrichedmc.enriched.EnrichedMod;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public class RawSmeltingResourceCondition implements ResourceCondition {
  @Override
  public ResourceConditionType<?> getType() {
    return ResourceConditionType.create(
        ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, "raw_smelting_enabled"),
        MapCodec.unit(RawSmeltingResourceCondition::new));
  }

  @Override
  public boolean test(@Nullable HolderLookup.Provider registryLookup) {
    return EnrichedMod.getInstance().getGameOptions().recipeOptions.enableRawSmeltingRecipes;
  }
}
