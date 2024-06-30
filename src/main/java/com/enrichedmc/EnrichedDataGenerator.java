package com.enrichedmc;

import com.enrichedmc.world.EnrichedPlacedFeatures;
import com.enrichedmc.world.Features;
import com.enrichedmc.world.WorldGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class EnrichedDataGenerator implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
    {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(WorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder)
    {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, Features::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, EnrichedPlacedFeatures::bootstrap);
    }
}
