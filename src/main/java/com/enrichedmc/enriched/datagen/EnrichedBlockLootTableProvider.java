package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
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

        this.addDrop(EnrichedBlocks.RUBY_ORE, rubyOre -> this.copperOreDrops(rubyOre, EnrichedItems.RUBY));
        this.addDrop(EnrichedBlocks.DEEPSLATE_RUBY_ORE, deepslateRubyOre -> this.copperOreDrops(deepslateRubyOre, EnrichedItems.RUBY));

        this.addDrop(EnrichedBlocks.SAPPHIRE_ORE, sapphireOre -> this.copperOreDrops(sapphireOre, EnrichedItems.SAPPHIRE));
        this.addDrop(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE, deepslateSapphireOre -> this.copperOreDrops(deepslateSapphireOre, EnrichedItems.SAPPHIRE));

        this.addDrop(EnrichedBlocks.TANZANITE_ORE, tanzaniteOre -> this.copperOreDrops(tanzaniteOre, EnrichedItems.SAPPHIRE));
        this.addDrop(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE, deepslateTanzaniteOre -> this.copperOreDrops(deepslateTanzaniteOre, EnrichedItems.SAPPHIRE));

        this.addDrop(EnrichedBlocks.STEEL_BLOCK);
        this.addDrop(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);
    }

    private LootTable.Builder copperOreDrops(Block drop, Item item)
    {
        RegistryWrapper.Impl<Enchantment> registerWrapper = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);

        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(item)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                .apply(ApplyBonusLootFunction.oreDrops(registerWrapper.getOrThrow(Enchantments.FORTUNE)))));
    }
}
