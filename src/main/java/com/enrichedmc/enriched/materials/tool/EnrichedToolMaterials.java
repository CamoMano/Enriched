package com.enrichedmc.enriched.materials.tool;

import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.enrichedmc.enriched.tag.EnrichedTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ToolMaterial;

public class EnrichedToolMaterials {
  public static final ToolMaterial RUBY =
      new ToolMaterial(
          EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_ruby_tool"),
          650,
          7.5f,
          6.0f,
          20,
          EnrichedTags.ItemTags.RUBIES);

  public static final ToolMaterial SAPPHIRE =
      new ToolMaterial(
          EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_sapphire_tool"),
          650,
          8.0f,
          5.0f,
          20,
          EnrichedTags.ItemTags.SAPPHIRES);

  public static final ToolMaterial TANZANITE =
      new ToolMaterial(
          EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_tanzanite_tool"),
          750,
          7.5f,
          5.0f,
          20,
          EnrichedTags.ItemTags.TANZANITES);

  public static final ToolMaterial STEEL =
      new ToolMaterial(
          EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_steel_tool"),
          850,
          6.0f,
          6.0f,
          13,
          EnrichedTags.ItemTags.STEEL_INGOTS);

  public static final ToolMaterial OBSIDIAN =
      new ToolMaterial(
          EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_obsidian_tool"),
          1820,
          7.0f,
          7.0f,
          9,
          EnrichedTags.ItemTags.OBSIDIAN_ALLOY_INGOTS);

  public static final ToolMaterial EMERALD =
      new ToolMaterial(
          EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_emerald_tool"),
          650,
          7.5f,
          5.0f,
          26,
          ConventionalItemTags.EMERALD_GEMS);

  public static final ToolMaterial COPPER =
      new ToolMaterial(
          EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_copper_tool"),
          150,
          4.0f,
          3.5f,
          13,
          ConventionalItemTags.COPPER_INGOTS);

  public static final ToolMaterial BRONZE =
      new ToolMaterial(
          EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_bronze_tool"),
          700,
          6.0f,
          5.0f,
          15,
          EnrichedTags.ItemTags.BRONZE_INGOTS);
}
