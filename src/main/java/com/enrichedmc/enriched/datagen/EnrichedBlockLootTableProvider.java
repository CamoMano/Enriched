package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnrichedBlockLootTableProvider extends FabricBlockLootTableProvider
{
    public EnrichedBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        this.addDrop(EnrichedBlocks.RUBY_BLOCK);
        this.addDrop(EnrichedBlocks.SAPPHIRE_BLOCK);
        this.addDrop(EnrichedBlocks.TANZANITE_BLOCK);
        this.addDrop(EnrichedBlocks.STEEL_BLOCK);
        this.addDrop(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);

        this.addDrop(EnrichedBlocks.RUBY_ORE, rubyOre -> this.oreDrops(rubyOre, EnrichedItems.RUBY));
        this.addDrop(EnrichedBlocks.DEEPSLATE_RUBY_ORE, deepslateRubyOre -> this.oreDrops(deepslateRubyOre, EnrichedItems.RUBY));

        this.addDrop(EnrichedBlocks.SAPPHIRE_ORE, sapphireOre -> this.oreDrops(sapphireOre, EnrichedItems.SAPPHIRE));
        this.addDrop(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE, deepslateSapphireOre -> this.oreDrops(deepslateSapphireOre, EnrichedItems.SAPPHIRE));

        this.addDrop(EnrichedBlocks.TANZANITE_ORE, tanzaniteOre -> this.oreDrops(tanzaniteOre, EnrichedItems.SAPPHIRE));
        this.addDrop(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE, deepslateTanzaniteOre -> this.oreDrops(deepslateTanzaniteOre, EnrichedItems.SAPPHIRE));

        this.addDrop(EnrichedBlocks.STEEL_BLOCK);
        this.addDrop(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);
    }
}
