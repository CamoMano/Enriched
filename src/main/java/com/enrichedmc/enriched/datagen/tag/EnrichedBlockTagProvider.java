package com.enrichedmc.enriched.datagen.tag;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.base.EnrichedBaseHoeItem;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.enrichedmc.enriched.tag.EnrichedTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class EnrichedBlockTagProvider extends FabricTagProvider.BlockTagProvider {
  public EnrichedBlockTagProvider(
      FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
        .add(EnrichedBlocks.RUBY_BLOCK)
        .add(EnrichedBlocks.RUBY_ORE)
        .add(EnrichedBlocks.DEEPSLATE_RUBY_ORE)
        .add(EnrichedBlocks.SAPPHIRE_BLOCK)
        .add(EnrichedBlocks.SAPPHIRE_ORE)
        .add(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE)
        .add(EnrichedBlocks.TANZANITE_BLOCK)
        .add(EnrichedBlocks.TANZANITE_ORE)
        .add(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE);

    this.getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
        .add(EnrichedBlocks.RUBY_ORE)
        .add(EnrichedBlocks.DEEPSLATE_RUBY_ORE)
        .add(EnrichedBlocks.SAPPHIRE_ORE)
        .add(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE)
        .add(EnrichedBlocks.TANZANITE_ORE)
        .add(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE);

    this.getOrCreateTagBuilder(BlockTags.PLANKS).add(EnrichedBlocks.REDWOOD_PLANKS);

    this.getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
        .add(EnrichedBlocks.REDWOOD_LOG)
        .add(EnrichedBlocks.REDWOOD_WOOD)
        .add(EnrichedBlocks.STRIPPED_REDWOOD_LOG)
        .add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD);

    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_ruby_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_sapphire_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_tanzanite_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_steel_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_obsidian_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_emerald_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_copper_tool"));

    this.getOrCreateTagBuilder(EnrichedTags.BlockTags.REDWOOD_LOGS)
        .add(EnrichedBlocks.REDWOOD_LOG)
        .add(EnrichedBlocks.STRIPPED_REDWOOD_LOG)
        .add(EnrichedBlocks.REDWOOD_WOOD)
        .add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD);
  }
}
