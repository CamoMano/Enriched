package com.enrichedmc.enriched.datagen.lang;

import com.enrichedmc.enriched.item.EnrichedItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnrichedEnglishLanguageProvider extends FabricLanguageProvider
{
    public EnrichedEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder)
    {
        translationBuilder.add(EnrichedItems.RUBY, "Ruby");
        translationBuilder.add(EnrichedItems.SAPPHIRE, "Sapphire");
        translationBuilder.add(EnrichedItems.TANZANITE, "Tanzanite");
        translationBuilder.add(EnrichedItems.STEEL_BLEND, "Steel Blend");
        translationBuilder.add(EnrichedItems.STEEL_INGOT, "Steel Ingot");
        translationBuilder.add(EnrichedItems.OBSIDIAN_ALL0Y_BLEND, "Obsidian Alloy Blend");
        translationBuilder.add(EnrichedItems.OBSIDIAN_ALL0Y_INGOT, "Obsidian Alloy Ingot");
        translationBuilder.add(EnrichedItems.HONEY_BALL, "Honey Ball");
        translationBuilder.add(EnrichedItems.BEEF_STEW, "Beef Stew");
        translationBuilder.add(EnrichedItems.BERRY_JUICE, "Berry Juice");
    }
}
