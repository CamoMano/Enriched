package com.enrichedmc.enriched.materials.tool;

import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public enum EnrichedToolMaterials implements ToolMaterial {
  RUBY(
      EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_ruby_tool"),
      650,
      7.5f,
      4.5f,
      20,
      () -> Ingredient.ofItems(EnrichedItems.RUBY)),

  SAPPHIRE(
      EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_sapphire_tool"),
      650,
      8.0f,
      4.0f,
      20,
      () -> Ingredient.ofItems(EnrichedItems.SAPPHIRE)),

  TANZANITE(
      EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_tanzanite_tool"),
      750,
      7.5f,
      4.0f,
      20,
      () -> Ingredient.ofItems(EnrichedItems.TANZANITE)),

  STEEL(
      EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_steel_tool"),
      850,
      6.0f,
      5.0f,
      9,
      () -> Ingredient.ofItems(EnrichedItems.STEEL_INGOT)),

  OBSIDIAN(
      EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_obsidian_tool"),
      1820,
      7.0f,
      4.5f,
      9,
      () -> Ingredient.ofItems(EnrichedItems.OBSIDIAN_ALLOY_INGOT)),

  EMERALD(
      EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_emerald_tool"),
      650,
      7.5f,
      4.0f,
      25,
      () -> Ingredient.ofItems(Items.EMERALD)),

  COPPER(
      EnrichedRegisters.createTagKey(RegistryKeys.BLOCK, "incorrect_for_copper_tool"),
      150,
      4.0f,
      3.5f,
      13,
      () -> Ingredient.ofItems(Items.COPPER_INGOT));

  private final TagKey<Block> inverseTag;
  private final int itemDurability;
  private final float miningSpeed;
  private final float attackDamage;
  private final int enchantability;
  private final Supplier<Ingredient> repairIngredient;

  EnrichedToolMaterials(
      TagKey<Block> inverseTag,
      int itemDurability,
      float miningSpeed,
      float attckDamage,
      int enchantability,
      Supplier<Ingredient> repairIngredient) {
    this.inverseTag = inverseTag;
    this.itemDurability = itemDurability;
    this.miningSpeed = miningSpeed;
    this.attackDamage = attckDamage;
    this.enchantability = enchantability;
    this.repairIngredient = repairIngredient;
  }

  @Override
  public int getDurability() {
    return this.itemDurability;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return this.miningSpeed;
  }

  @Override
  public float getAttackDamage() {
    return this.attackDamage;
  }

  @Override
  public TagKey<Block> getInverseTag() {
    return this.inverseTag;
  }

  @Override
  public int getEnchantability() {
    return this.enchantability;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return this.repairIngredient.get();
  }
}
