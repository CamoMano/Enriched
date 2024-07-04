package com.enrichedmc.enriched.datagen.tag;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.tag.EnrichedTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class EnrichedItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public EnrichedItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        this.getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(EnrichedBlocks.REDWOOD_PLANKS.asItem());

        this.getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(EnrichedBlocks.REDWOOD_LOG.asItem())
                .add(EnrichedBlocks.REDWOOD_WOOD.asItem())
                .add(EnrichedBlocks.STRIPPED_REDWOOD_LOG.asItem())
                .add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD.asItem());

        this.getOrCreateTagBuilder(EnrichedTags.ItemTags.REDWOOD_LOGS)
                .add(EnrichedBlocks.REDWOOD_LOG.asItem())
                .add(EnrichedBlocks.STRIPPED_REDWOOD_LOG.asItem())
                .add(EnrichedBlocks.REDWOOD_WOOD.asItem())
                .add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD.asItem());
    }
}
