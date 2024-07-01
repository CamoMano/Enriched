package com.enrichedmc.enriched.datagen.tag;

import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnrichedBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public EnrichedBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        this.getOrCreateTagBuilder(EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_ruby_tool"));
        this.getOrCreateTagBuilder(EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_sapphire_tool"));
        this.getOrCreateTagBuilder(EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_tanzanite_tool"));
        this.getOrCreateTagBuilder(EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_steel_tool"));
        this.getOrCreateTagBuilder(EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_obsidian_tool"));
        this.getOrCreateTagBuilder(EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_emerald_tool"));
        this.getOrCreateTagBuilder(EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_copper_tool"));
    }

}
