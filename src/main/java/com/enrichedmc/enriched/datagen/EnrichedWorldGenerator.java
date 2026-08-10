package com.enrichedmc.enriched.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;

public class EnrichedWorldGenerator extends FabricDynamicRegistryProvider {
  public EnrichedWorldGenerator(
      FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void configure(HolderLookup.Provider registries, Entries entries) {
    entries.addAll(registries.lookupOrThrow(Registries.CONFIGURED_FEATURE));
    entries.addAll(registries.lookupOrThrow(Registries.PLACED_FEATURE));
  }

  @Override
  public String getName() {
    return "World Gen";
  }
}
