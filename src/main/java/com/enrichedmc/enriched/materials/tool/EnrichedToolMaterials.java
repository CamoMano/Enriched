package com.enrichedmc.enriched.materials.tool;

import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import java.util.function.Supplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public enum EnrichedToolMaterials implements Tier {
  RUBY(
      EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_ruby_tool"),
      650,
      7.5f,
      6.0f,
      20,
      () -> Ingredient.of(EnrichedItems.RUBY)),

  SAPPHIRE(
      EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_sapphire_tool"),
      650,
      8.0f,
      5.0f,
      20,
      () -> Ingredient.of(EnrichedItems.SAPPHIRE)),

  TANZANITE(
      EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_tanzanite_tool"),
      750,
      7.5f,
      5.0f,
      20,
      () -> Ingredient.of(EnrichedItems.TANZANITE)),

  STEEL(
      EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_steel_tool"),
      850,
      6.0f,
      6.0f,
      13,
      () -> Ingredient.of(EnrichedItems.STEEL_INGOT)),

  OBSIDIAN(
      EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_obsidian_tool"),
      1820,
      7.0f,
      7.0f,
      9,
      () -> Ingredient.of(EnrichedItems.OBSIDIAN_ALLOY_INGOT)),

  EMERALD(
      EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_emerald_tool"),
      650,
      7.5f,
      5.0f,
      26,
      () -> Ingredient.of(Items.EMERALD)),

  COPPER(
      EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_copper_tool"),
      150,
      4.0f,
      3.5f,
      13,
      () -> Ingredient.of(Items.COPPER_INGOT)),

  BRONZE(
      EnrichedRegisters.createTagKey(Registries.BLOCK, "incorrect_for_bronze_tool"),
      700,
      6.0f,
      5.0f,
      15,
      () -> Ingredient.of(Items.COPPER_INGOT));

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
  public int getUses() {
    return this.itemDurability;
  }

  @Override
  public float getSpeed() {
    return this.miningSpeed;
  }

  @Override
  public float getAttackDamageBonus() {
    return this.attackDamage;
  }

  @Override
  public TagKey<Block> getIncorrectBlocksForDrops() {
    return this.inverseTag;
  }

  @Override
  public int getEnchantmentValue() {
    return this.enchantability;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return this.repairIngredient.get();
  }
}
