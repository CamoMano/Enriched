package com.enrichedmc.enriched;

import com.enrichedmc.enriched.datagen.EnrichedBlockLootTableProvider;
import com.enrichedmc.enriched.datagen.EnrichedEquipmentAssetProvider;
import com.enrichedmc.enriched.datagen.EnrichedModelProvider;
import com.enrichedmc.enriched.datagen.EnrichedRecipeProvider;
import com.enrichedmc.enriched.datagen.EnrichedWorldGenerator;
import com.enrichedmc.enriched.datagen.lang.EnrichedEnglishLanguageProvider;
import com.enrichedmc.enriched.datagen.tag.EnrichedBlockTagProvider;
import com.enrichedmc.enriched.datagen.tag.EnrichedItemTagProvider;
import com.enrichedmc.enriched.world.EnrichedConfiguredFeatures;
import com.enrichedmc.enriched.world.EnrichedPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class EnrichedDataGenerator implements DataGeneratorEntrypoint {
  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack dataGeneratorPack = fabricDataGenerator.createPack();
    dataGeneratorPack.addProvider(EnrichedEnglishLanguageProvider::new);
    dataGeneratorPack.addProvider(EnrichedBlockTagProvider::new);
    dataGeneratorPack.addProvider(EnrichedItemTagProvider::new);
    dataGeneratorPack.addProvider(EnrichedBlockLootTableProvider::new);
    dataGeneratorPack.addProvider(EnrichedModelProvider::new);
    dataGeneratorPack.addProvider(EnrichedEquipmentAssetProvider::new);
    dataGeneratorPack.addProvider(EnrichedRecipeProvider::new);
    dataGeneratorPack.addProvider(EnrichedWorldGenerator::new);
  }

  @Override
  public void buildRegistry(RegistrySetBuilder registryBuilder) {
    registryBuilder.add(
        Registries.CONFIGURED_FEATURE, EnrichedConfiguredFeatures::bootstrap);
    registryBuilder.add(Registries.PLACED_FEATURE, EnrichedPlacedFeatures::bootstrap);
  }
}
