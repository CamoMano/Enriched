package com.enrichedmc.enriched;

import com.enrichedmc.enriched.datagen.EnrichedModelProvider;
import com.enrichedmc.enriched.datagen.lang.EnrichedEnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EnrichedDataGenerator implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
    {
        FabricDataGenerator.Pack dataGeneratorPack = fabricDataGenerator.createPack();
        dataGeneratorPack.addProvider(EnrichedEnglishLanguageProvider::new);
        dataGeneratorPack.addProvider(EnrichedModelProvider::new);
    }
}
