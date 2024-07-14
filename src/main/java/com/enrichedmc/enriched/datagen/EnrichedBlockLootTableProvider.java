package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

public class EnrichedBlockLootTableProvider extends FabricBlockLootTableProvider {
  public EnrichedBlockLootTableProvider(
      FabricDataOutput dataOutput,
      CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
    super(dataOutput, registryLookup);
  }

  @Override
  public void generate() {
    this.addDrop(EnrichedBlocks.RUBY_BLOCK);
    this.addDrop(EnrichedBlocks.SAPPHIRE_BLOCK);
    this.addDrop(EnrichedBlocks.TANZANITE_BLOCK);
    this.addDrop(EnrichedBlocks.STEEL_BLOCK);
    this.addDrop(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);
    this.addDrop(EnrichedBlocks.TIN_BLOCK);
    this.addDrop(EnrichedBlocks.BRONZE_BLOCK);
    this.addDrop(EnrichedBlocks.RAW_TIN_BLOCK);

    this.addDrop(
        EnrichedBlocks.RUBY_ORE, rubyOre -> this.enrichedOreDrops(rubyOre, EnrichedItems.RUBY));
    this.addDrop(
        EnrichedBlocks.DEEPSLATE_RUBY_ORE,
        deepslateRubyOre -> this.enrichedOreDrops(deepslateRubyOre, EnrichedItems.RUBY));

    this.addDrop(
        EnrichedBlocks.SAPPHIRE_ORE,
        sapphireOre -> this.enrichedOreDrops(sapphireOre, EnrichedItems.SAPPHIRE));
    this.addDrop(
        EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE,
        deepslateSapphireOre -> this.enrichedOreDrops(deepslateSapphireOre, EnrichedItems.SAPPHIRE));

    this.addDrop(
        EnrichedBlocks.TANZANITE_ORE,
        tanzaniteOre -> this.enrichedOreDrops(tanzaniteOre, EnrichedItems.TANZANITE));
    this.addDrop(
        EnrichedBlocks.DEEPSLATE_TANZANITE_ORE,
        deepslateTanzaniteOre ->
            this.enrichedOreDrops(deepslateTanzaniteOre, EnrichedItems.TANZANITE));

    this.addDrop(
            EnrichedBlocks.AMBER_ORE,
            amberOre -> this.enrichedOreDrops(amberOre, EnrichedItems.AMBER));
    this.addDrop(
            EnrichedBlocks.DEEPSLATE_AMBER_ORE,
            deepslateAmberOre ->
                    this.enrichedOreDrops(deepslateAmberOre, EnrichedItems.AMBER));

    this.addDrop(
            EnrichedBlocks.TOPAZ_ORE,
            topazOre -> this.enrichedOreDrops(topazOre, EnrichedItems.TOPAZ));
    this.addDrop(
            EnrichedBlocks.DEEPSLATE_TOPAZ_ORE,
            deepslateTopazOre ->
                    this.enrichedOreDrops(deepslateTopazOre, EnrichedItems.TOPAZ));

    this.addDrop(
            EnrichedBlocks.TIN_ORE,
           tinOre -> this.enrichedOreDrops(tinOre, EnrichedItems.RAW_TIN));
    this.addDrop(
            EnrichedBlocks.DEEPSLATE_TIN_ORE,
            deepslateTinOre ->
                    this.enrichedOreDrops(deepslateTinOre, EnrichedItems.RAW_TIN));

    this.addDrop(EnrichedBlocks.STEEL_BLOCK);
    this.addDrop(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);

    this.addDrop(EnrichedBlocks.REDWOOD_LOG);
    this.addDrop(EnrichedBlocks.REDWOOD_WOOD);
    this.addDrop(EnrichedBlocks.STRIPPED_REDWOOD_LOG);
    this.addDrop(EnrichedBlocks.STRIPPED_REDWOOD_WOOD);
    this.addDrop(EnrichedBlocks.REDWOOD_PLANKS);
    this.addDrop(
        EnrichedBlocks.REDWOOD_LEAVES,
        leavesDrops(EnrichedBlocks.REDWOOD_LEAVES, EnrichedBlocks.REDWOOD_SAPLING, 0.25f));
    this.addDrop(EnrichedBlocks.REDWOOD_SAPLING);
    this.addPottedPlantDrops(EnrichedBlocks.POTTED_REDWOOD_SAPLING);
    this.addDrop(EnrichedBlocks.REDWOOD_BUTTON);
    this.addDrop(EnrichedBlocks.REDWOOD_DOOR);
    this.addDrop(EnrichedBlocks.REDWOOD_PRESSURE_PLATE);
    this.addDrop(EnrichedBlocks.REDWOOD_TRAPDOOR);
    this.addDrop(EnrichedBlocks.REDWOOD_SLAB);
    this.addDrop(EnrichedBlocks.REDWOOD_STAIRS);
    this.addDrop(EnrichedBlocks.REDWOOD_FENCE);
    this.addDrop(EnrichedBlocks.REDWOOD_FENCE_GATE);

    this.addDrop(EnrichedBlocks.DARK_GRANITE);
    this.addDrop(EnrichedBlocks.DARK_GRANITE_SLAB);
    this.addDrop(EnrichedBlocks.DARK_GRANITE_STAIRS);
    this.addDrop(EnrichedBlocks.DARK_GRANITE_WALL);
    this.addDrop(EnrichedBlocks.POLISHED_DARK_GRANITE);
    this.addDrop(EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB);
    this.addDrop(EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS);

    this.addDrop(EnrichedBlocks.MARBLE);
    this.addDrop(EnrichedBlocks.MARBLE_SLAB);
    this.addDrop(EnrichedBlocks.MARBLE_STAIRS);
    this.addDrop(EnrichedBlocks.MARBLE_WALL);
    this.addDrop(EnrichedBlocks.POLISHED_MARBLE);
    this.addDrop(EnrichedBlocks.POLISHED_MARBLE_SLAB);
    this.addDrop(EnrichedBlocks.POLISHED_MARBLE_STAIRS);
  }

  private LootTable.Builder enrichedOreDrops(Block drop, Item item) {
    RegistryWrapper.Impl<Enchantment> registerWrapper =
        this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);

    return this.dropsWithSilkTouch(
        drop,
        this.applyExplosionDecay(
            drop,
            ItemEntry.builder(item)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                .apply(
                    ApplyBonusLootFunction.oreDrops(
                        registerWrapper.getOrThrow(Enchantments.FORTUNE)))));
  }
}
