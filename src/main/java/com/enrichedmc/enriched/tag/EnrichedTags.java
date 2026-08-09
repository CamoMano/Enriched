package com.enrichedmc.enriched.tag;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EnrichedTags {
  public static void registerTags() {
    EnrichedMod.LOGGER.info("Registering Enriched's tags...");
  }

  public static class ItemTags {
    public static final TagKey<Item> REDWOOD_LOGS =
        EnrichedRegisters.createTagKey(Registries.ITEM, "redwood_logs");

    public static final TagKey<Item> STEEL_INGOTS =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "ingots/steel");

    public static final TagKey<Item> BRONZE_INGOTS =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "ingots/bronze");

    public static final TagKey<Item> TIN_INGOTS =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "ingots/tin");

    public static final TagKey<Item> OBSIDIAN_ALLOY_INGOTS =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "ingots/obsidian_alloy");
    public static final TagKey<Item> RUBIES =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "gems/ruby");

    public static final TagKey<Item> SAPPHIRES =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "gems/sapphire");

    public static final TagKey<Item> TANZANITES =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "gems/tanzanite");

    public static final TagKey<Item> AMBERS =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "gems/amber");

    public static final TagKey<Item> TOPAZS =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "gems/topaz");
    public static final TagKey<Item> FOODS =
        EnrichedRegisters.createCommonTagKey(Registries.ITEM, "foods");
  }

  public static class BlockTags {
    public static final TagKey<Block> REDWOOD_LOGS =
        EnrichedRegisters.createTagKey(Registries.BLOCK, "redwood_logs");
  }
}
