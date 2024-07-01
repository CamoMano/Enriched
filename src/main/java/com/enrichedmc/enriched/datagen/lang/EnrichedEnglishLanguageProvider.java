package com.enrichedmc.enriched.datagen.lang;

import com.enrichedmc.enriched.block.EnrichedBlocks;
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
        /*-------------*/
        /* -- Items -- */
        /*-------------*/

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

        /*--------------*/
        /* -- Blocks -- */
        /*--------------*/

        translationBuilder.add(EnrichedBlocks.RUBY_BLOCK, "Ruby Block");
        translationBuilder.add(EnrichedBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(EnrichedBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");

        translationBuilder.add(EnrichedBlocks.SAPPHIRE_BLOCK, "Sapphire Block");
        translationBuilder.add(EnrichedBlocks.SAPPHIRE_ORE, "Sapphire Ore");
        translationBuilder.add(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE, "Deepslate Sapphire Ore");

        translationBuilder.add(EnrichedBlocks.TANZANITE_BLOCK, "Tanzanite Block");
        translationBuilder.add(EnrichedBlocks.TANZANITE_ORE, "Tanzanite Ore");
        translationBuilder.add(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE, "Deepslate Tanzanite Ore");

        translationBuilder.add(EnrichedBlocks.STEEL_BLOCK, "Steel Block");
        translationBuilder.add(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK, "Obsidian Alloy Block");
    }
}
