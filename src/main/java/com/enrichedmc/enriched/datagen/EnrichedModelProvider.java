package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.item.EnrichedItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class EnrichedModelProvider extends FabricModelProvider
{
    public EnrichedModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(EnrichedItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.TANZANITE, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.STEEL_BLEND, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.OBSIDIAN_ALL0Y_BLEND, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.OBSIDIAN_ALL0Y_INGOT, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.HONEY_BALL, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.BEEF_STEW, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.BERRY_JUICE, Models.GENERATED);
    }
}
