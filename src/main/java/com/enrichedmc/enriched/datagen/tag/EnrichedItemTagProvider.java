package com.enrichedmc.enriched.datagen.tag;

import static com.enrichedmc.enriched.registry.EnrichedRegisters.itemKey;
import static com.enrichedmc.enriched.tag.EnrichedTags.ItemTags.*;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.tag.EnrichedTags;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

public class EnrichedItemTagProvider extends FabricTagsProvider<Item> {
  public EnrichedItemTagProvider(
      FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
    super(output, Registries.ITEM, completableFuture);
  }

  @Override
  protected void addTags(HolderLookup.Provider wrapperLookup) {

    this.tag(ItemTags.PLANKS).add(itemKey(EnrichedBlocks.REDWOOD_PLANKS));

    this.tag(ItemTags.LOGS)
        .add(itemKey(EnrichedBlocks.REDWOOD_LOG))
        .add(itemKey(EnrichedBlocks.REDWOOD_WOOD))
        .add(itemKey(EnrichedBlocks.STRIPPED_REDWOOD_LOG))
        .add(itemKey(EnrichedBlocks.STRIPPED_REDWOOD_WOOD));

    this.tag(EnrichedTags.ItemTags.REDWOOD_LOGS)
        .add(itemKey(EnrichedBlocks.REDWOOD_LOG))
        .add(itemKey(EnrichedBlocks.STRIPPED_REDWOOD_LOG))
        .add(itemKey(EnrichedBlocks.REDWOOD_WOOD))
        .add(itemKey(EnrichedBlocks.STRIPPED_REDWOOD_WOOD));

    this.tag(ConventionalItemTags.DUSTS)
        .add(itemKey(EnrichedItems.OBSIDIAN_ALLOY_BLEND))
        .add(itemKey(EnrichedItems.STEEL_BLEND))
        .add(itemKey(EnrichedItems.BRONZE_BLEND));

    this.tag(ConventionalItemTags.INGOTS)
        .add(itemKey(EnrichedItems.OBSIDIAN_ALLOY_INGOT))
        .add(itemKey(EnrichedItems.STEEL_INGOT))
        .add(itemKey(EnrichedItems.BRONZE_INGOT))
        .add(itemKey(EnrichedItems.TIN_INGOT));

    this.tag(ConventionalItemTags.ORES)
        .add(itemKey(EnrichedBlocks.RUBY_ORE))
        .add(itemKey(EnrichedBlocks.DEEPSLATE_RUBY_ORE))
        .add(itemKey(EnrichedBlocks.SAPPHIRE_ORE))
        .add(itemKey(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE))
        .add(itemKey(EnrichedBlocks.TANZANITE_ORE))
        .add(itemKey(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE))
        .add(itemKey(EnrichedBlocks.AMBER_ORE))
        .add(itemKey(EnrichedBlocks.DEEPSLATE_AMBER_ORE))
        .add(itemKey(EnrichedBlocks.TOPAZ_ORE))
        .add(itemKey(EnrichedBlocks.DEEPSLATE_TOPAZ_ORE))
        .add(itemKey(EnrichedBlocks.TIN_ORE))
        .add(itemKey(EnrichedBlocks.DEEPSLATE_TIN_ORE));

    this.tag(ConventionalItemTags.TOOLS)
        .add(itemKey(EnrichedItems.STEEL_AXE))
        .add(itemKey(EnrichedItems.STEEL_HOE))
        .add(itemKey(EnrichedItems.STEEL_SHOVEL))
        .add(itemKey(EnrichedItems.STEEL_PICKAXE))
        .add(itemKey(EnrichedItems.OBSIDIAN_AXE))
        .add(itemKey(EnrichedItems.OBSIDIAN_HOE))
        .add(itemKey(EnrichedItems.OBSIDIAN_SHOVEL))
        .add(itemKey(EnrichedItems.OBSIDIAN_PICKAXE))
        .add(itemKey(EnrichedItems.COPPER_AXE))
        .add(itemKey(EnrichedItems.COPPER_HOE))
        .add(itemKey(EnrichedItems.COPPER_SHOVEL))
        .add(itemKey(EnrichedItems.COPPER_PICKAXE))
        .add(itemKey(EnrichedItems.RUBY_AXE))
        .add(itemKey(EnrichedItems.RUBY_HOE))
        .add(itemKey(EnrichedItems.RUBY_SHOVEL))
        .add(itemKey(EnrichedItems.RUBY_PICKAXE))
        .add(itemKey(EnrichedItems.SAPPHIRE_AXE))
        .add(itemKey(EnrichedItems.SAPPHIRE_HOE))
        .add(itemKey(EnrichedItems.SAPPHIRE_SHOVEL))
        .add(itemKey(EnrichedItems.SAPPHIRE_PICKAXE))
        .add(itemKey(EnrichedItems.TANZANITE_AXE))
        .add(itemKey(EnrichedItems.TANZANITE_HOE))
        .add(itemKey(EnrichedItems.TANZANITE_SHOVEL))
        .add(itemKey(EnrichedItems.TANZANITE_PICKAXE))
        .add(itemKey(EnrichedItems.EMERALD_AXE))
        .add(itemKey(EnrichedItems.EMERALD_HOE))
        .add(itemKey(EnrichedItems.EMERALD_SHOVEL))
        .add(itemKey(EnrichedItems.EMERALD_PICKAXE));

    this.tag(ConventionalItemTags.MINING_TOOL_TOOLS)
        .add(itemKey(EnrichedItems.STEEL_PICKAXE))
        .add(itemKey(EnrichedItems.OBSIDIAN_PICKAXE))
        .add(itemKey(EnrichedItems.COPPER_PICKAXE))
        .add(itemKey(EnrichedItems.RUBY_PICKAXE))
        .add(itemKey(EnrichedItems.SAPPHIRE_PICKAXE))
        .add(itemKey(EnrichedItems.TANZANITE_PICKAXE))
        .add(itemKey(EnrichedItems.EMERALD_PICKAXE));

    this.tag(ItemTags.PICKAXES)
        .add(itemKey(EnrichedItems.STEEL_PICKAXE))
        .add(itemKey(EnrichedItems.OBSIDIAN_PICKAXE))
        .add(itemKey(EnrichedItems.COPPER_PICKAXE))
        .add(itemKey(EnrichedItems.RUBY_PICKAXE))
        .add(itemKey(EnrichedItems.SAPPHIRE_PICKAXE))
        .add(itemKey(EnrichedItems.TANZANITE_PICKAXE))
        .add(itemKey(EnrichedItems.EMERALD_PICKAXE));

    this.tag(ItemTags.AXES)
        .add(itemKey(EnrichedItems.STEEL_AXE))
        .add(itemKey(EnrichedItems.OBSIDIAN_AXE))
        .add(itemKey(EnrichedItems.COPPER_AXE))
        .add(itemKey(EnrichedItems.RUBY_AXE))
        .add(itemKey(EnrichedItems.SAPPHIRE_AXE))
        .add(itemKey(EnrichedItems.TANZANITE_AXE))
        .add(itemKey(EnrichedItems.EMERALD_AXE));

    this.tag(ItemTags.SHOVELS)
        .add(itemKey(EnrichedItems.STEEL_SHOVEL))
        .add(itemKey(EnrichedItems.OBSIDIAN_SHOVEL))
        .add(itemKey(EnrichedItems.COPPER_SHOVEL))
        .add(itemKey(EnrichedItems.RUBY_SHOVEL))
        .add(itemKey(EnrichedItems.SAPPHIRE_SHOVEL))
        .add(itemKey(EnrichedItems.TANZANITE_SHOVEL))
        .add(itemKey(EnrichedItems.EMERALD_SHOVEL));

    this.tag(ItemTags.HOES)
        .add(itemKey(EnrichedItems.STEEL_HOE))
        .add(itemKey(EnrichedItems.OBSIDIAN_HOE))
        .add(itemKey(EnrichedItems.COPPER_HOE))
        .add(itemKey(EnrichedItems.RUBY_HOE))
        .add(itemKey(EnrichedItems.SAPPHIRE_HOE))
        .add(itemKey(EnrichedItems.TANZANITE_HOE))
        .add(itemKey(EnrichedItems.EMERALD_HOE));

    this.tag(ItemTags.SWORDS)
        .add(itemKey(EnrichedItems.STEEL_SWORD))
        .add(itemKey(EnrichedItems.OBSIDIAN_SWORD))
        .add(itemKey(EnrichedItems.COPPER_SWORD))
        .add(itemKey(EnrichedItems.RUBY_SWORD))
        .add(itemKey(EnrichedItems.SAPPHIRE_SWORD))
        .add(itemKey(EnrichedItems.TANZANITE_SWORD))
        .add(itemKey(EnrichedItems.EMERALD_SWORD));

    this.tag(ItemTags.HEAD_ARMOR)
        .add(itemKey(EnrichedItems.STEEL_HELMET))
        .add(itemKey(EnrichedItems.OBSIDIAN_HELMET))
        .add(itemKey(EnrichedItems.RUBY_HELMET))
        .add(itemKey(EnrichedItems.SAPPHIRE_HELMET))
        .add(itemKey(EnrichedItems.TANZANITE_HELMET))
        .add(itemKey(EnrichedItems.EMERALD_HELMET));

    this.tag(ItemTags.CHEST_ARMOR)
        .add(itemKey(EnrichedItems.STEEL_CHESTPLATE))
        .add(itemKey(EnrichedItems.OBSIDIAN_CHESTPLATE))
        .add(itemKey(EnrichedItems.RUBY_CHESTPLATE))
        .add(itemKey(EnrichedItems.SAPPHIRE_CHESTPLATE))
        .add(itemKey(EnrichedItems.TANZANITE_CHESTPLATE))
        .add(itemKey(EnrichedItems.EMERALD_CHESTPLATE));

    this.tag(ItemTags.LEG_ARMOR)
        .add(itemKey(EnrichedItems.STEEL_LEGGINGS))
        .add(itemKey(EnrichedItems.OBSIDIAN_LEGGINGS))
        .add(itemKey(EnrichedItems.RUBY_LEGGINGS))
        .add(itemKey(EnrichedItems.SAPPHIRE_LEGGINGS))
        .add(itemKey(EnrichedItems.TANZANITE_LEGGINGS))
        .add(itemKey(EnrichedItems.EMERALD_LEGGINGS));

    this.tag(ItemTags.FOOT_ARMOR)
        .add(itemKey(EnrichedItems.STEEL_BOOTS))
        .add(itemKey(EnrichedItems.OBSIDIAN_BOOTS))
        .add(itemKey(EnrichedItems.RUBY_BOOTS))
        .add(itemKey(EnrichedItems.SAPPHIRE_BOOTS))
        .add(itemKey(EnrichedItems.TANZANITE_BOOTS))
        .add(itemKey(EnrichedItems.EMERALD_BOOTS));

    this.tag(ConventionalItemTags.MELEE_WEAPON_TOOLS)
        .add(itemKey(EnrichedItems.STEEL_SWORD))
        .add(itemKey(EnrichedItems.OBSIDIAN_SWORD))
        .add(itemKey(EnrichedItems.RUBY_SWORD))
        .add(itemKey(EnrichedItems.SAPPHIRE_SWORD))
        .add(itemKey(EnrichedItems.TANZANITE_SWORD))
        .add(itemKey(EnrichedItems.EMERALD_SWORD))
        .add(itemKey(EnrichedItems.COPPER_SWORD));

    // Conventional Tags
    this.tag(STEEL_INGOTS).add(itemKey(EnrichedItems.STEEL_INGOT));
    this.tag(OBSIDIAN_ALLOY_INGOTS).add(itemKey(EnrichedItems.OBSIDIAN_ALLOY_INGOT));
    this.tag(RUBIES).add(itemKey(EnrichedItems.RUBY));
    this.tag(SAPPHIRES).add(itemKey(EnrichedItems.SAPPHIRE));
    this.tag(TANZANITES).add(itemKey(EnrichedItems.TANZANITE));
    this.tag(AMBERS).add(itemKey(EnrichedItems.AMBER));
    this.tag(TOPAZS).add(itemKey(EnrichedItems.TOPAZ));
    this.tag(BRONZE_INGOTS).add(itemKey(EnrichedItems.BRONZE_INGOT));
    this.tag(TIN_INGOTS).add(itemKey(EnrichedItems.TIN_INGOT));
    this.tag(FOODS).add(itemKey(EnrichedItems.BERRY_JUICE)).add(itemKey(EnrichedItems.BEEF_STEW));
  }
}
