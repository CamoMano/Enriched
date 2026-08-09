package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class EnrichedBlockLootTableProvider extends FabricBlockLootTableProvider {
  public EnrichedBlockLootTableProvider(
      FabricDataOutput dataOutput,
      CompletableFuture<HolderLookup.Provider> registryLookup) {
    super(dataOutput, registryLookup);
  }

  @Override
  public void generate() {
    this.dropSelf(EnrichedBlocks.RUBY_BLOCK);
    this.dropSelf(EnrichedBlocks.SAPPHIRE_BLOCK);
    this.dropSelf(EnrichedBlocks.TANZANITE_BLOCK);
    this.dropSelf(EnrichedBlocks.STEEL_BLOCK);
    this.dropSelf(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);
    this.dropSelf(EnrichedBlocks.TIN_BLOCK);
    this.dropSelf(EnrichedBlocks.BRONZE_BLOCK);
    this.dropSelf(EnrichedBlocks.RAW_TIN_BLOCK);

    this.add(
        EnrichedBlocks.RUBY_ORE, rubyOre -> this.enrichedOreDrops(rubyOre, EnrichedItems.RUBY));
    this.add(
        EnrichedBlocks.DEEPSLATE_RUBY_ORE,
        deepslateRubyOre -> this.enrichedOreDrops(deepslateRubyOre, EnrichedItems.RUBY));

    this.add(
        EnrichedBlocks.SAPPHIRE_ORE,
        sapphireOre -> this.enrichedOreDrops(sapphireOre, EnrichedItems.SAPPHIRE));
    this.add(
        EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE,
        deepslateSapphireOre ->
            this.enrichedOreDrops(deepslateSapphireOre, EnrichedItems.SAPPHIRE));

    this.add(
        EnrichedBlocks.TANZANITE_ORE,
        tanzaniteOre -> this.enrichedOreDrops(tanzaniteOre, EnrichedItems.TANZANITE));
    this.add(
        EnrichedBlocks.DEEPSLATE_TANZANITE_ORE,
        deepslateTanzaniteOre ->
            this.enrichedOreDrops(deepslateTanzaniteOre, EnrichedItems.TANZANITE));

    this.add(
        EnrichedBlocks.AMBER_ORE, amberOre -> this.enrichedOreDrops(amberOre, EnrichedItems.AMBER));
    this.add(
        EnrichedBlocks.DEEPSLATE_AMBER_ORE,
        deepslateAmberOre -> this.enrichedOreDrops(deepslateAmberOre, EnrichedItems.AMBER));

    this.add(
        EnrichedBlocks.TOPAZ_ORE, topazOre -> this.enrichedOreDrops(topazOre, EnrichedItems.TOPAZ));
    this.add(
        EnrichedBlocks.DEEPSLATE_TOPAZ_ORE,
        deepslateTopazOre -> this.enrichedOreDrops(deepslateTopazOre, EnrichedItems.TOPAZ));

    this.add(
        EnrichedBlocks.TIN_ORE, tinOre -> this.enrichedOreDrops(tinOre, EnrichedItems.RAW_TIN));
    this.add(
        EnrichedBlocks.DEEPSLATE_TIN_ORE,
        deepslateTinOre -> this.enrichedOreDrops(deepslateTinOre, EnrichedItems.RAW_TIN));

    this.dropSelf(EnrichedBlocks.STEEL_BLOCK);
    this.dropSelf(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);

    this.dropSelf(EnrichedBlocks.REDWOOD_LOG);
    this.dropSelf(EnrichedBlocks.REDWOOD_WOOD);
    this.dropSelf(EnrichedBlocks.STRIPPED_REDWOOD_LOG);
    this.dropSelf(EnrichedBlocks.STRIPPED_REDWOOD_WOOD);
    this.dropSelf(EnrichedBlocks.REDWOOD_PLANKS);
    this.add(
        EnrichedBlocks.REDWOOD_LEAVES,
        createLeavesDrops(EnrichedBlocks.REDWOOD_LEAVES, EnrichedBlocks.REDWOOD_SAPLING, 0.25f));
    this.dropSelf(EnrichedBlocks.REDWOOD_SAPLING);
    this.dropPottedContents(EnrichedBlocks.POTTED_REDWOOD_SAPLING);
    this.dropSelf(EnrichedBlocks.REDWOOD_BUTTON);
    this.dropSelf(EnrichedBlocks.REDWOOD_DOOR);
    this.dropSelf(EnrichedBlocks.REDWOOD_PRESSURE_PLATE);
    this.dropSelf(EnrichedBlocks.REDWOOD_TRAPDOOR);
    this.dropSelf(EnrichedBlocks.REDWOOD_SLAB);
    this.dropSelf(EnrichedBlocks.REDWOOD_STAIRS);
    this.dropSelf(EnrichedBlocks.REDWOOD_FENCE);
    this.dropSelf(EnrichedBlocks.REDWOOD_FENCE_GATE);

    this.dropSelf(EnrichedBlocks.DARK_GRANITE);
    this.dropSelf(EnrichedBlocks.DARK_GRANITE_SLAB);
    this.dropSelf(EnrichedBlocks.DARK_GRANITE_STAIRS);
    this.dropSelf(EnrichedBlocks.DARK_GRANITE_WALL);
    this.dropSelf(EnrichedBlocks.POLISHED_DARK_GRANITE);
    this.dropSelf(EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB);
    this.dropSelf(EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS);

    this.dropSelf(EnrichedBlocks.MARBLE);
    this.dropSelf(EnrichedBlocks.MARBLE_SLAB);
    this.dropSelf(EnrichedBlocks.MARBLE_STAIRS);
    this.dropSelf(EnrichedBlocks.MARBLE_WALL);
    this.dropSelf(EnrichedBlocks.POLISHED_MARBLE);
    this.dropSelf(EnrichedBlocks.POLISHED_MARBLE_SLAB);
    this.dropSelf(EnrichedBlocks.POLISHED_MARBLE_STAIRS);
  }

  private LootTable.Builder enrichedOreDrops(Block drop, Item item) {
    HolderLookup.RegistryLookup<Enchantment> registerWrapper =
        this.registries.lookupOrThrow(Registries.ENCHANTMENT);

    return this.createSilkTouchDispatchTable(
        drop,
        this.applyExplosionDecay(
            drop,
            LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                .apply(
                    ApplyBonusCount.addOreBonusCount(
                        registerWrapper.getOrThrow(Enchantments.FORTUNE)))));
  }
}
