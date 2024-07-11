package com.enrichedmc.enriched.tag;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class EnrichedTags {
  public static void registerTags() {
    EnrichedMod.LOGGER.info("Registering Enriched's tags...");
  }

  public static class ItemTags {
    public static final TagKey<Item> REDWOOD_LOGS =
        EnrichedRegisters.createTagKey(RegistryKeys.ITEM, "redwood_logs");

    public static final TagKey<Item> STEEL_INGOTS =
        EnrichedRegisters.createCommonTagKey(RegistryKeys.ITEM, "ingots/steel");

    public static final TagKey<Item> OBSIDIAN_ALLOY_INGOTS =
        EnrichedRegisters.createCommonTagKey(RegistryKeys.ITEM, "ingots/obsidian_alloy");
    public static final TagKey<Item> RUBIES =
        EnrichedRegisters.createCommonTagKey(RegistryKeys.ITEM, "gems/ruby");

    public static final TagKey<Item> SAPPHIRES =
        EnrichedRegisters.createCommonTagKey(RegistryKeys.ITEM, "gems/sapphire");

    public static final TagKey<Item> TANZANITES =
        EnrichedRegisters.createCommonTagKey(RegistryKeys.ITEM, "gems/tanzanite");
    public static final TagKey<Item> FOODS =
        EnrichedRegisters.createCommonTagKey(RegistryKeys.ITEM, "foods");
  }

  public static class BlockTags {
    public static final TagKey<Block> REDWOOD_LOGS =
        EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "redwood_logs");
  }
}
