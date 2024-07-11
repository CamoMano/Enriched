package com.enrichedmc.enriched.datagen.tag;

import static com.enrichedmc.enriched.tag.EnrichedTags.ItemTags.*;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.tag.EnrichedTags;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

public class EnrichedItemTagProvider extends FabricTagProvider.ItemTagProvider {
  public EnrichedItemTagProvider(
      FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
    super(output, completableFuture);
  }

  @Override
  protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

    this.getOrCreateTagBuilder(ItemTags.PLANKS).add(EnrichedBlocks.REDWOOD_PLANKS.asItem());

    this.getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
        .add(EnrichedBlocks.REDWOOD_LOG.asItem())
        .add(EnrichedBlocks.REDWOOD_WOOD.asItem())
        .add(EnrichedBlocks.STRIPPED_REDWOOD_LOG.asItem())
        .add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD.asItem());

    this.getOrCreateTagBuilder(EnrichedTags.ItemTags.REDWOOD_LOGS)
        .add(EnrichedBlocks.REDWOOD_LOG.asItem())
        .add(EnrichedBlocks.STRIPPED_REDWOOD_LOG.asItem())
        .add(EnrichedBlocks.REDWOOD_WOOD.asItem())
        .add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD.asItem());

    this.getOrCreateTagBuilder(ConventionalItemTags.DUSTS)
        .add(EnrichedItems.OBSIDIAN_ALLOY_BLEND)
        .add(EnrichedItems.STEEL_BLEND);

    this.getOrCreateTagBuilder(ConventionalItemTags.INGOTS)
        .add(EnrichedItems.OBSIDIAN_ALLOY_INGOT)
        .add(EnrichedItems.STEEL_INGOT);

    this.getOrCreateTagBuilder(ConventionalItemTags.ORES)
        .add(EnrichedBlocks.RUBY_ORE.asItem())
        .add(EnrichedBlocks.SAPPHIRE_ORE.asItem())
        .add(EnrichedBlocks.TANZANITE_ORE.asItem())
        .add(EnrichedItems.STEEL_INGOT);

    this.getOrCreateTagBuilder(ConventionalItemTags.TOOLS)
        .add(EnrichedItems.STEEL_AXE)
        .add(EnrichedItems.STEEL_HOE)
        .add(EnrichedItems.STEEL_SHOVEL)
        .add(EnrichedItems.STEEL_PICKAXE)
        .add(EnrichedItems.OBSIDIAN_AXE)
        .add(EnrichedItems.OBSIDIAN_HOE)
        .add(EnrichedItems.OBSIDIAN_SHOVEL)
        .add(EnrichedItems.OBSIDIAN_PICKAXE)
        .add(EnrichedItems.COPPER_AXE)
        .add(EnrichedItems.COPPER_HOE)
        .add(EnrichedItems.COPPER_SHOVEL)
        .add(EnrichedItems.COPPER_PICKAXE)
        .add(EnrichedItems.RUBY_AXE)
        .add(EnrichedItems.RUBY_HOE)
        .add(EnrichedItems.RUBY_SHOVEL)
        .add(EnrichedItems.RUBY_PICKAXE)
        .add(EnrichedItems.SAPPHIRE_AXE)
        .add(EnrichedItems.SAPPHIRE_HOE)
        .add(EnrichedItems.SAPPHIRE_SHOVEL)
        .add(EnrichedItems.SAPPHIRE_PICKAXE)
        .add(EnrichedItems.TANZANITE_AXE)
        .add(EnrichedItems.TANZANITE_HOE)
        .add(EnrichedItems.TANZANITE_SHOVEL)
        .add(EnrichedItems.TANZANITE_PICKAXE)
        .add(EnrichedItems.EMERALD_AXE)
        .add(EnrichedItems.EMERALD_HOE)
        .add(EnrichedItems.EMERALD_SHOVEL)
        .add(EnrichedItems.EMERALD_PICKAXE);

    this.getOrCreateTagBuilder(ConventionalItemTags.MINING_TOOL_TOOLS)
        .add(EnrichedItems.STEEL_PICKAXE)
        .add(EnrichedItems.OBSIDIAN_PICKAXE)
        .add(EnrichedItems.COPPER_PICKAXE)
        .add(EnrichedItems.RUBY_PICKAXE)
        .add(EnrichedItems.SAPPHIRE_PICKAXE)
        .add(EnrichedItems.TANZANITE_PICKAXE)
        .add(EnrichedItems.EMERALD_PICKAXE);

    this.getOrCreateTagBuilder(ItemTags.PICKAXES)
        .add(EnrichedItems.STEEL_PICKAXE)
        .add(EnrichedItems.OBSIDIAN_PICKAXE)
        .add(EnrichedItems.COPPER_PICKAXE)
        .add(EnrichedItems.RUBY_PICKAXE)
        .add(EnrichedItems.SAPPHIRE_PICKAXE)
        .add(EnrichedItems.TANZANITE_PICKAXE)
        .add(EnrichedItems.EMERALD_PICKAXE);

    this.getOrCreateTagBuilder(ItemTags.AXES)
        .add(EnrichedItems.STEEL_AXE)
        .add(EnrichedItems.OBSIDIAN_AXE)
        .add(EnrichedItems.COPPER_AXE)
        .add(EnrichedItems.RUBY_AXE)
        .add(EnrichedItems.SAPPHIRE_AXE)
        .add(EnrichedItems.TANZANITE_AXE)
        .add(EnrichedItems.EMERALD_AXE);

    this.getOrCreateTagBuilder(ItemTags.SHOVELS)
        .add(EnrichedItems.STEEL_SHOVEL)
        .add(EnrichedItems.OBSIDIAN_SHOVEL)
        .add(EnrichedItems.COPPER_SHOVEL)
        .add(EnrichedItems.RUBY_SHOVEL)
        .add(EnrichedItems.SAPPHIRE_SHOVEL)
        .add(EnrichedItems.TANZANITE_SHOVEL)
        .add(EnrichedItems.EMERALD_SHOVEL);

    this.getOrCreateTagBuilder(ItemTags.HOES)
        .add(EnrichedItems.STEEL_HOE)
        .add(EnrichedItems.OBSIDIAN_HOE)
        .add(EnrichedItems.COPPER_HOE)
        .add(EnrichedItems.RUBY_HOE)
        .add(EnrichedItems.SAPPHIRE_HOE)
        .add(EnrichedItems.TANZANITE_HOE)
        .add(EnrichedItems.EMERALD_HOE);

    this.getOrCreateTagBuilder(ItemTags.SWORDS)
        .add(EnrichedItems.STEEL_SWORD)
        .add(EnrichedItems.OBSIDIAN_SWORD)
        .add(EnrichedItems.COPPER_SWORD)
        .add(EnrichedItems.RUBY_SWORD)
        .add(EnrichedItems.SAPPHIRE_SWORD)
        .add(EnrichedItems.TANZANITE_SWORD)
        .add(EnrichedItems.EMERALD_SWORD);


    this.getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
        .add(EnrichedItems.STEEL_HELMET)
        .add(EnrichedItems.OBSIDIAN_HELMET)
        .add(EnrichedItems.RUBY_HELMET)
        .add(EnrichedItems.SAPPHIRE_HELMET)
        .add(EnrichedItems.TANZANITE_HELMET)
        .add(EnrichedItems.EMERALD_HELMET);

    this.getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
        .add(EnrichedItems.STEEL_CHESTPLATE)
        .add(EnrichedItems.OBSIDIAN_CHESTPLATE)
        .add(EnrichedItems.RUBY_CHESTPLATE)
        .add(EnrichedItems.SAPPHIRE_CHESTPLATE)
        .add(EnrichedItems.TANZANITE_CHESTPLATE)
        .add(EnrichedItems.EMERALD_CHESTPLATE);

    this.getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
        .add(EnrichedItems.STEEL_LEGGINGS)
        .add(EnrichedItems.OBSIDIAN_LEGGINGS)
        .add(EnrichedItems.RUBY_LEGGINGS)
        .add(EnrichedItems.SAPPHIRE_LEGGINGS)
        .add(EnrichedItems.TANZANITE_LEGGINGS)
        .add(EnrichedItems.EMERALD_LEGGINGS);

    this.getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
        .add(EnrichedItems.STEEL_BOOTS)
        .add(EnrichedItems.OBSIDIAN_BOOTS)
        .add(EnrichedItems.RUBY_BOOTS)
        .add(EnrichedItems.SAPPHIRE_BOOTS)
        .add(EnrichedItems.TANZANITE_BOOTS)
        .add(EnrichedItems.EMERALD_BOOTS);


    this.getOrCreateTagBuilder(ConventionalItemTags.MELEE_WEAPON_TOOLS)
        .add(EnrichedItems.STEEL_SWORD)
        .add(EnrichedItems.OBSIDIAN_SWORD)
        .add(EnrichedItems.RUBY_SWORD)
        .add(EnrichedItems.SAPPHIRE_SWORD)
        .add(EnrichedItems.TANZANITE_SWORD)
        .add(EnrichedItems.EMERALD_SWORD)
        .add(EnrichedItems.COPPER_SWORD);


    // Conventional Tags
    this.getOrCreateTagBuilder(STEEL_INGOTS).add(EnrichedItems.STEEL_INGOT);
    this.getOrCreateTagBuilder(OBSIDIAN_INGOTS).add(EnrichedItems.OBSIDIAN_ALLOY_INGOT);
    this.getOrCreateTagBuilder(RUBIES).add(EnrichedItems.RUBY);
    this.getOrCreateTagBuilder(SAPPHIRES).add(EnrichedItems.SAPPHIRE);
    this.getOrCreateTagBuilder(TANZANITES).add(EnrichedItems.TANZANITE);
    this.getOrCreateTagBuilder(FOODS).add(EnrichedItems.BERRY_JUICE).add(EnrichedItems.BEEF_STEW);
  }
}
