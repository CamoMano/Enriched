package com.enrichedmc.enriched.datagen.tag;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import static com.enrichedmc.enriched.registry.EnrichedRegisters.blockKey;

import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.enrichedmc.enriched.tag.EnrichedTags;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

public class EnrichedBlockTagProvider extends FabricTagsProvider<Block> {
  public EnrichedBlockTagProvider(
      FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, Registries.BLOCK, registriesFuture);
  }

  @Override
  protected void addTags(HolderLookup.Provider wrapperLookup) {
    this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .add(blockKey(EnrichedBlocks.RUBY_BLOCK))
        .add(blockKey(EnrichedBlocks.RUBY_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_RUBY_ORE))
        .add(blockKey(EnrichedBlocks.SAPPHIRE_BLOCK))
        .add(blockKey(EnrichedBlocks.SAPPHIRE_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE))
        .add(blockKey(EnrichedBlocks.TANZANITE_BLOCK))
        .add(blockKey(EnrichedBlocks.TANZANITE_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE))
        .add(blockKey(EnrichedBlocks.AMBER_BLOCK))
        .add(blockKey(EnrichedBlocks.AMBER_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_AMBER_ORE))
        .add(blockKey(EnrichedBlocks.TOPAZ_BLOCK))
        .add(blockKey(EnrichedBlocks.TOPAZ_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_TOPAZ_ORE))
        .add(blockKey(EnrichedBlocks.DARK_GRANITE))
        .add(blockKey(EnrichedBlocks.DARK_GRANITE_SLAB))
        .add(blockKey(EnrichedBlocks.DARK_GRANITE_STAIRS))
        .add(blockKey(EnrichedBlocks.DARK_GRANITE_WALL))
        .add(blockKey(EnrichedBlocks.POLISHED_DARK_GRANITE))
        .add(blockKey(EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB))
        .add(blockKey(EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS))
        .add(blockKey(EnrichedBlocks.MARBLE))
        .add(blockKey(EnrichedBlocks.MARBLE_SLAB))
        .add(blockKey(EnrichedBlocks.MARBLE_STAIRS))
        .add(blockKey(EnrichedBlocks.MARBLE_WALL))
        .add(blockKey(EnrichedBlocks.POLISHED_MARBLE))
        .add(blockKey(EnrichedBlocks.POLISHED_MARBLE_SLAB))
        .add(blockKey(EnrichedBlocks.POLISHED_MARBLE_STAIRS))
        .add(blockKey(EnrichedBlocks.TIN_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_TIN_ORE))
        .add(blockKey(EnrichedBlocks.TIN_BLOCK))
        .add(blockKey(EnrichedBlocks.RAW_TIN_BLOCK))
        .add(blockKey(EnrichedBlocks.BRONZE_BLOCK));

    this.tag(BlockTags.NEEDS_IRON_TOOL)
        .add(blockKey(EnrichedBlocks.RUBY_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_RUBY_ORE))
        .add(blockKey(EnrichedBlocks.SAPPHIRE_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE))
        .add(blockKey(EnrichedBlocks.TANZANITE_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE))
        .add(blockKey(EnrichedBlocks.AMBER_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_AMBER_ORE))
        .add(blockKey(EnrichedBlocks.TOPAZ_ORE))
        .add(blockKey(EnrichedBlocks.DEEPSLATE_TOPAZ_ORE));

    this.tag(BlockTags.LOGS)
        .add(blockKey(EnrichedBlocks.REDWOOD_LOG))
        .add(blockKey(EnrichedBlocks.REDWOOD_WOOD))
        .add(blockKey(EnrichedBlocks.STRIPPED_REDWOOD_LOG))
        .add(blockKey(EnrichedBlocks.STRIPPED_REDWOOD_WOOD));

    this.tag(BlockTags.MINEABLE_WITH_AXE)
        .add(blockKey(EnrichedBlocks.REDWOOD_LOG))
        .add(blockKey(EnrichedBlocks.REDWOOD_WOOD))
        .add(blockKey(EnrichedBlocks.STRIPPED_REDWOOD_LOG))
        .add(blockKey(EnrichedBlocks.STRIPPED_REDWOOD_WOOD))
        .add(blockKey(EnrichedBlocks.REDWOOD_PLANKS));

    this.tag(BlockTags.WALLS)
        .add(blockKey(EnrichedBlocks.DARK_GRANITE_WALL))
        .add(blockKey(EnrichedBlocks.MARBLE_WALL));

    this.tag(BlockTags.SLABS)
        .add(blockKey(EnrichedBlocks.DARK_GRANITE_SLAB))
        .add(blockKey(EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB))
        .add(blockKey(EnrichedBlocks.MARBLE_SLAB))
        .add(blockKey(EnrichedBlocks.POLISHED_MARBLE_SLAB))
        .add(blockKey(EnrichedBlocks.POLISHED_MARBLE_STAIRS));

    this.tag(BlockTags.STAIRS)
        .add(blockKey(EnrichedBlocks.DARK_GRANITE_STAIRS))
        .add(blockKey(EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS))
        .add(blockKey(EnrichedBlocks.MARBLE_STAIRS))
        .add(blockKey(EnrichedBlocks.POLISHED_MARBLE_STAIRS))
        .add(blockKey(EnrichedBlocks.POLISHED_MARBLE_STAIRS));

    this.tag(BlockTags.WOODEN_SLABS).add(blockKey(EnrichedBlocks.REDWOOD_SLAB));
    this.tag(BlockTags.WOODEN_STAIRS).add(blockKey(EnrichedBlocks.REDWOOD_STAIRS));
    this.tag(BlockTags.LEAVES).add(blockKey(EnrichedBlocks.REDWOOD_LEAVES));
    this.tag(BlockTags.PLANKS).add(blockKey(EnrichedBlocks.REDWOOD_PLANKS));

    this.tag(
        EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_ruby_tool"));
    this.tag(
        EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_sapphire_tool"));
    this.tag(
        EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_tanzanite_tool"));
    this.tag(
        EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_steel_tool"));
    this.tag(
        EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_bronze_tool"));
    this.tag(
        EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_obsidian_tool"));
    this.tag(
        EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_emerald_tool"));
    this.tag(
        EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_copper_tool"));

    this.tag(EnrichedTags.BlockTags.REDWOOD_LOGS)
        .add(blockKey(EnrichedBlocks.REDWOOD_LOG))
        .add(blockKey(EnrichedBlocks.STRIPPED_REDWOOD_LOG))
        .add(blockKey(EnrichedBlocks.REDWOOD_WOOD))
        .add(blockKey(EnrichedBlocks.STRIPPED_REDWOOD_WOOD));
  }
}
