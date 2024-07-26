package com.enrichedmc.enriched.datagen.tag;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.enrichedmc.enriched.tag.EnrichedTags;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

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
        .add(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE)
        .add(EnrichedBlocks.AMBER_BLOCK)
        .add(EnrichedBlocks.AMBER_ORE)
        .add(EnrichedBlocks.DEEPSLATE_AMBER_ORE)
        .add(EnrichedBlocks.TOPAZ_BLOCK)
        .add(EnrichedBlocks.TOPAZ_ORE)
        .add(EnrichedBlocks.DEEPSLATE_TOPAZ_ORE)
        .add(EnrichedBlocks.DARK_GRANITE)
        .add(EnrichedBlocks.DARK_GRANITE_SLAB)
        .add(EnrichedBlocks.DARK_GRANITE_STAIRS)
        .add(EnrichedBlocks.DARK_GRANITE_WALL)
        .add(EnrichedBlocks.POLISHED_DARK_GRANITE)
        .add(EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB)
        .add(EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS)
        .add(EnrichedBlocks.MARBLE)
        .add(EnrichedBlocks.MARBLE_SLAB)
        .add(EnrichedBlocks.MARBLE_STAIRS)
        .add(EnrichedBlocks.MARBLE_WALL)
        .add(EnrichedBlocks.POLISHED_MARBLE)
        .add(EnrichedBlocks.POLISHED_MARBLE_SLAB)
        .add(EnrichedBlocks.POLISHED_MARBLE_STAIRS)
        .add(EnrichedBlocks.TIN_ORE)
        .add(EnrichedBlocks.DEEPSLATE_TIN_ORE)
        .add(EnrichedBlocks.TIN_BLOCK)
        .add(EnrichedBlocks.RAW_TIN_BLOCK)
        .add(EnrichedBlocks.BRONZE_BLOCK);

    this.getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
        .add(EnrichedBlocks.RUBY_ORE)
        .add(EnrichedBlocks.DEEPSLATE_RUBY_ORE)
        .add(EnrichedBlocks.SAPPHIRE_ORE)
        .add(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE)
        .add(EnrichedBlocks.TANZANITE_ORE)
        .add(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE)
        .add(EnrichedBlocks.AMBER_ORE)
        .add(EnrichedBlocks.DEEPSLATE_AMBER_ORE)
        .add(EnrichedBlocks.TOPAZ_ORE)
        .add(EnrichedBlocks.DEEPSLATE_TOPAZ_ORE);

    this.getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
        .add(EnrichedBlocks.REDWOOD_LOG)
        .add(EnrichedBlocks.REDWOOD_WOOD)
        .add(EnrichedBlocks.STRIPPED_REDWOOD_LOG)
        .add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD);

    this.getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
        .add(EnrichedBlocks.REDWOOD_LOG)
        .add(EnrichedBlocks.REDWOOD_WOOD)
        .add(EnrichedBlocks.STRIPPED_REDWOOD_LOG)
        .add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD)
        .add(EnrichedBlocks.REDWOOD_PLANKS);

    this.getOrCreateTagBuilder(BlockTags.WALLS)
        .add(EnrichedBlocks.DARK_GRANITE_WALL)
        .add(EnrichedBlocks.MARBLE_WALL);

    this.getOrCreateTagBuilder(BlockTags.SLABS)
        .add(EnrichedBlocks.DARK_GRANITE_SLAB)
        .add(EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB)
        .add(EnrichedBlocks.MARBLE_SLAB)
        .add(EnrichedBlocks.POLISHED_MARBLE_SLAB)
        .add(EnrichedBlocks.POLISHED_MARBLE_STAIRS);

    this.getOrCreateTagBuilder(BlockTags.STAIRS)
        .add(EnrichedBlocks.DARK_GRANITE_STAIRS)
        .add(EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS)
        .add(EnrichedBlocks.MARBLE_STAIRS)
        .add(EnrichedBlocks.POLISHED_MARBLE_STAIRS)
        .add(EnrichedBlocks.POLISHED_MARBLE_STAIRS);

    this.getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(EnrichedBlocks.REDWOOD_SLAB);
    this.getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(EnrichedBlocks.REDWOOD_STAIRS);
    this.getOrCreateTagBuilder(BlockTags.LEAVES).add(EnrichedBlocks.REDWOOD_LEAVES);
    this.getOrCreateTagBuilder(BlockTags.PLANKS).add(EnrichedBlocks.REDWOOD_PLANKS);

    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_ruby_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_sapphire_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_tanzanite_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_steel_tool"));
    this.getOrCreateTagBuilder(
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_bronze_tool"));
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
