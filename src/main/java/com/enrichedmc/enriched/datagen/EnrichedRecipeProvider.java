package com.enrichedmc.enriched.datagen;

import static com.enrichedmc.enriched.tag.EnrichedTags.*;
import static com.enrichedmc.enriched.tag.EnrichedTags.ItemTags.*;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.conditions.EnrichedResourceConditions;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.tag.EnrichedTags;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Recipe;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

public class EnrichedRecipeProvider extends FabricRecipeProvider {
  public EnrichedRecipeProvider(
      FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected RecipeProvider createRecipeProvider(
      HolderLookup.Provider registryLookup, RecipeOutput exporter) {
    return new RecipeProvider(registryLookup, exporter) {
      @Override
      public void buildRecipes() {
    this.createRubyRecipes(exporter);
    this.createSapphireRecipes(exporter);
    this.createTanzaniteRecipes(exporter);
    this.createSteelRecipes(exporter);
    this.createBronzeAndTinRecipes(exporter);
    this.createObsidianRecipes(exporter);
    this.createEmeraldRecipes(exporter);
    this.createCopperRecipes(exporter);

    this.createHorseArmorRecipes(exporter);
    this.createChainmailRecipes(exporter);
    this.createRawSmeltingRecipes(exporter);

    this.createUncraftingRecipes(exporter);
    this.createFoodRecipes(exporter);

    this.createRedwoodRecipes(exporter);
    this.createDarkGraniteRecipes(exporter);
    this.createMarbleRecipes(exporter);
  }

  private void createRubyRecipes(RecipeOutput recipeExporter) {
    this.createSwordTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_SWORD,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));

    this.createShovelTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_SHOVEL,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
    this.createPickaxeTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_PICKAXE,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
    this.createAxeTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_AXE,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
    this.createHoeTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_HOE,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));

    this.createHelmetTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_HELMET,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
    this.createChestplateTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_CHESTPLATE,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
    this.createLeggingsTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_LEGGINGS,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
    this.createBootsTagRecipe(
        recipeExporter,
        RUBIES,
        EnrichedItems.RUBY_BOOTS,
        Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));

    nineBlockStorageRecipes(
                RecipeCategory.MISC,
        EnrichedItems.RUBY,
        RecipeCategory.MISC,
        EnrichedBlocks.RUBY_BLOCK);
  }

  private void createSapphireRecipes(RecipeOutput recipeExporter) {
    this.createSwordTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_SWORD,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    this.createShovelTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_SHOVEL,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    this.createPickaxeTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_PICKAXE,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    this.createAxeTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_AXE,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    this.createHoeTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_HOE,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    this.createHelmetTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_HELMET,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    this.createChestplateTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_CHESTPLATE,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    this.createLeggingsTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_LEGGINGS,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    this.createBootsTagRecipe(
        recipeExporter,
        SAPPHIRES,
        EnrichedItems.SAPPHIRE_BOOTS,
        Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

    nineBlockStorageRecipes(
                RecipeCategory.MISC,
        EnrichedItems.SAPPHIRE,
        RecipeCategory.MISC,
        EnrichedBlocks.SAPPHIRE_BLOCK);
  }

  private void createTanzaniteRecipes(RecipeOutput recipeExporter) {
    this.createSwordTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_SWORD,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    this.createShovelTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_SHOVEL,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    this.createPickaxeTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_PICKAXE,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    this.createAxeTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_AXE,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    this.createHoeTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_HOE,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    this.createHelmetTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_HELMET,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    this.createChestplateTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_CHESTPLATE,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    this.createLeggingsTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_LEGGINGS,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    this.createBootsTagRecipe(
        recipeExporter,
        TANZANITES,
        EnrichedItems.TANZANITE_BOOTS,
        Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

    nineBlockStorageRecipes(
                RecipeCategory.MISC,
        EnrichedItems.TANZANITE,
        RecipeCategory.MISC,
        EnrichedBlocks.TANZANITE_BLOCK);
  }

  private void createSteelRecipes(RecipeOutput recipeExporter) {
    this.createSwordTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_SWORD,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
    this.createShovelTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_SHOVEL,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
    this.createPickaxeTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_PICKAXE,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
    this.createAxeTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_AXE,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
    this.createHoeTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_HOE,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));

    this.createHelmetTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_HELMET,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
    this.createChestplateTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_CHESTPLATE,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
    this.createLeggingsTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_LEGGINGS,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
    this.createBootsTagRecipe(
        recipeExporter,
        STEEL_INGOTS,
        EnrichedItems.STEEL_BOOTS,
        Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));

    shapeless(RecipeCategory.MISC, EnrichedItems.STEEL_BLEND)
        .requires(Items.IRON_INGOT)
        .requires(Items.COAL)
        .unlockedBy(
            getHasName(Items.IRON_INGOT),
            has(Items.IRON_INGOT))
        .save(recipeExporter);

    this.createSmeltingRecipe(
        recipeExporter,
        EnrichedItems.STEEL_BLEND,
        RecipeCategory.MISC,
        EnrichedItems.STEEL_INGOT,
        0.7f,
        200);

    this.createBlastingRecipe(
        recipeExporter,
        EnrichedItems.STEEL_BLEND,
        RecipeCategory.MISC,
        EnrichedItems.STEEL_INGOT,
        0.7f,
        100);

    nineBlockStorageRecipes(
                RecipeCategory.MISC,
        EnrichedItems.STEEL_INGOT,
        RecipeCategory.MISC,
        EnrichedBlocks.STEEL_BLOCK);
  }

  private void createBronzeAndTinRecipes(RecipeOutput recipeExporter) {

    shapeless(RecipeCategory.MISC, EnrichedItems.BRONZE_BLEND, 3)
        .requires(EnrichedItems.TIN_INGOT)
        .requires(Items.COPPER_INGOT)
        .requires(Items.COPPER_INGOT)
        .unlockedBy(
            getHasName(EnrichedItems.TIN_INGOT),
            has(EnrichedItems.TIN_INGOT))
        .save(recipeExporter);

    this.createSmeltingRecipe(
        recipeExporter,
        EnrichedItems.BRONZE_BLEND,
        RecipeCategory.MISC,
        EnrichedItems.BRONZE_INGOT,
        0.7f,
        200);

    this.createBlastingRecipe(
        recipeExporter,
        EnrichedItems.BRONZE_BLEND,
        RecipeCategory.MISC,
        EnrichedItems.BRONZE_INGOT,
        0.7f,
        100);

    this.createSmeltingRecipe(
        recipeExporter,
        EnrichedItems.RAW_TIN,
        RecipeCategory.MISC,
        EnrichedItems.TIN_INGOT,
        0.7f,
        200);

    this.createBlastingRecipe(
        recipeExporter,
        EnrichedItems.RAW_TIN,
        RecipeCategory.MISC,
        EnrichedItems.TIN_INGOT,
        0.7f,
        100);

    nineBlockStorageRecipes(
                RecipeCategory.MISC,
        EnrichedItems.BRONZE_INGOT,
        RecipeCategory.MISC,
        EnrichedBlocks.BRONZE_BLOCK);

    nineBlockStorageRecipes(
                RecipeCategory.MISC,
        EnrichedItems.TIN_INGOT,
        RecipeCategory.MISC,
        EnrichedBlocks.TIN_BLOCK);

    nineBlockStorageRecipes(
                    RecipeCategory.MISC,
            EnrichedItems.RAW_TIN,
            RecipeCategory.MISC,
            EnrichedBlocks.RAW_TIN_BLOCK);
  }

  private void createObsidianRecipes(RecipeOutput recipeExporter) {
    this.createSwordTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_SWORD,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    this.createShovelTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_SHOVEL,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    this.createPickaxeTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_PICKAXE,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    this.createAxeTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_AXE,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    this.createHoeTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_HOE,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    this.createHelmetTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_HELMET,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    this.createChestplateTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_CHESTPLATE,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    this.createLeggingsTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_LEGGINGS,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    this.createBootsTagRecipe(
        recipeExporter,
        OBSIDIAN_ALLOY_INGOTS,
        EnrichedItems.OBSIDIAN_BOOTS,
        Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

    shapeless(RecipeCategory.MISC, EnrichedItems.OBSIDIAN_ALLOY_BLEND, 3)
        .requires(Items.OBSIDIAN)
        .requires(EnrichedItems.STEEL_INGOT)
        .requires(EnrichedItems.STEEL_INGOT)
        .unlockedBy(
            getHasName(Items.OBSIDIAN),
            has(Items.OBSIDIAN))
        .save(recipeExporter);

    this.createSmeltingRecipe(
        recipeExporter,
        EnrichedItems.OBSIDIAN_ALLOY_BLEND,
        RecipeCategory.MISC,
        EnrichedItems.OBSIDIAN_ALLOY_INGOT,
        0.7f,
        200);

    this.createBlastingRecipe(
        recipeExporter,
        EnrichedItems.OBSIDIAN_ALLOY_BLEND,
        RecipeCategory.MISC,
        EnrichedItems.OBSIDIAN_ALLOY_INGOT,
        0.7f,
        100);

    nineBlockStorageRecipes(
                RecipeCategory.MISC,
        EnrichedItems.OBSIDIAN_ALLOY_INGOT,
        RecipeCategory.MISC,
        EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);
  }

  private void createEmeraldRecipes(RecipeOutput recipeExporter) {
    this.createSwordRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_SWORD,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
    this.createShovelRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_SHOVEL,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
    this.createPickaxeRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_PICKAXE,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
    this.createAxeRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_AXE,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
    this.createHoeRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_HOE,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));

    this.createHelmetRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_HELMET,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
    this.createChestplateRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_CHESTPLATE,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
    this.createLeggingsRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_LEGGINGS,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
    this.createBootsRecipe(
        recipeExporter,
        Items.EMERALD,
        EnrichedItems.EMERALD_BOOTS,
        Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
  }

  private void createCopperRecipes(RecipeOutput recipeExporter) {
    this.createSwordTagRecipe(
        recipeExporter,
        ConventionalItemTags.COPPER_INGOTS,
        EnrichedItems.COPPER_SWORD,
        Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
    this.createShovelTagRecipe(
        recipeExporter,
        ConventionalItemTags.COPPER_INGOTS,
        EnrichedItems.COPPER_SHOVEL,
        Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
    this.createPickaxeTagRecipe(
        recipeExporter,
        ConventionalItemTags.COPPER_INGOTS,
        EnrichedItems.COPPER_PICKAXE,
        Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
    this.createAxeTagRecipe(
        recipeExporter,
        ConventionalItemTags.COPPER_INGOTS,
        EnrichedItems.COPPER_AXE,
        Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
    this.createHoeTagRecipe(
        recipeExporter,
        ConventionalItemTags.COPPER_INGOTS,
        EnrichedItems.COPPER_HOE,
        Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
  }

  private void createHorseArmorRecipes(RecipeOutput recipeExporter) {
    this.createHorseArmorRecipe(recipeExporter, Items.DIAMOND, Items.DIAMOND_HORSE_ARMOR);
    this.createHorseArmorRecipe(recipeExporter, Items.GOLD_INGOT, Items.GOLDEN_HORSE_ARMOR);
    this.createHorseArmorRecipe(recipeExporter, Items.IRON_INGOT, Items.IRON_HORSE_ARMOR);
  }

  private void createChainmailRecipes(RecipeOutput recipeExporter) {
    this.createHelmetRecipe(
        recipeExporter,
        Items.IRON_CHAIN,
        Items.CHAINMAIL_HELMET,
        Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

    this.createChestplateRecipe(
        recipeExporter,
        Items.IRON_CHAIN,
        Items.CHAINMAIL_CHESTPLATE,
        Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

    this.createLeggingsRecipe(
        recipeExporter,
        Items.IRON_CHAIN,
        Items.CHAINMAIL_LEGGINGS,
        Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

    this.createBootsRecipe(
        recipeExporter,
        Items.IRON_CHAIN,
        Items.CHAINMAIL_BOOTS,
        Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));
  }

  private void createRawSmeltingRecipes(RecipeOutput recipeExporter) {
    this.createSmeltingRecipe(
        recipeExporter, Items.RAW_IRON_BLOCK, RecipeCategory.MISC, Items.IRON_BLOCK, 6.3f, 1800);
    this.createSmeltingRecipe(
        recipeExporter,
        Items.RAW_COPPER_BLOCK,
        RecipeCategory.MISC,
        Items.COPPER_BLOCK.weathering().unaffected(),
        6.3f,
        1800);
    this.createSmeltingRecipe(
        recipeExporter, Items.RAW_GOLD_BLOCK, RecipeCategory.MISC, Items.GOLD_BLOCK, 6.3f, 1800);
    this.createSmeltingRecipe(
            recipeExporter, EnrichedBlocks.RAW_TIN_BLOCK.asItem(), RecipeCategory.MISC, EnrichedBlocks.TIN_BLOCK.asItem(), 6.3f, 1800);

    this.createBlastingRecipe(
        recipeExporter, Items.RAW_IRON_BLOCK, RecipeCategory.MISC, Items.IRON_BLOCK, 6.3f, 900);
    this.createBlastingRecipe(
        recipeExporter, Items.RAW_COPPER_BLOCK, RecipeCategory.MISC, Items.COPPER_BLOCK.weathering().unaffected(), 6.3f, 900);
    this.createBlastingRecipe(
        recipeExporter, Items.RAW_GOLD_BLOCK, RecipeCategory.MISC, Items.GOLD_BLOCK, 6.3f, 900);
    this.createBlastingRecipe(
            recipeExporter, EnrichedBlocks.RAW_TIN_BLOCK.asItem(), RecipeCategory.MISC, EnrichedBlocks.TIN_BLOCK.asItem(), 6.3f, 900);
  }

  private void createSmeltingRecipe(
      RecipeOutput recipeExporter,
      Item input,
      RecipeCategory recipeCategory,
      Item output,
      float experience,
      int cookingTime) {
    String recipeJSONFileName =
        String.format(
            "%s_from_smelting_%s",
            StringUtils.substringAfterLast(output.getDescriptionId(), "."),
            StringUtils.substringAfterLast(input.getDescriptionId(), "."));

    SimpleCookingRecipeBuilder.smelting(
            Ingredient.of(input),
            recipeCategory,
            CookingBookCategory.MISC,
            output,
            experience,
            cookingTime)
        .unlockedBy(
            getHasName(input), has(input))
        .save(
            withConditions(recipeExporter, EnrichedResourceConditions.RAW_SMELTING_ENABLED),
            recipeKey(recipeJSONFileName));
  }

  private void createBlastingRecipe(
      RecipeOutput recipeExporter,
      Item input,
      RecipeCategory recipeCategory,
      Item output,
      float experience,
      int cookingTime) {
    String recipeJSONFileName =
        String.format(
            "%s_from_blasting_%s",
            StringUtils.substringAfterLast(output.getDescriptionId(), "."),
            StringUtils.substringAfterLast(input.getDescriptionId(), "."));

    SimpleCookingRecipeBuilder.blasting(
            Ingredient.of(input),
            recipeCategory,
            CookingBookCategory.MISC,
            output,
            experience,
            cookingTime)
        .unlockedBy(
            getHasName(input), has(input))
        .save(
            withConditions(recipeExporter, EnrichedResourceConditions.RAW_SMELTING_ENABLED),
            recipeKey(recipeJSONFileName));
  }

  private void createUncraftingRecipes(RecipeOutput recipeExporter) {
    this.createUncraftingRecipeWithTag(recipeExporter, ItemTags.WOOL, Items.STRING, 4);

    this.createUncraftingRecipe(recipeExporter, Items.COBWEB, Items.STRING, 5);
    this.createUncraftingRecipe(recipeExporter, Items.BRICKS, Items.BRICK, 4);
    this.createUncraftingRecipe(recipeExporter, Items.NETHER_BRICK, Items.NETHER_BRICKS, 4);
    this.createUncraftingRecipe(recipeExporter, Items.MAGMA_BLOCK, Items.MAGMA_CREAM, 4);
    this.createUncraftingRecipe(recipeExporter, Items.NETHER_WART, Items.NETHER_WART_BLOCK, 9);
    this.createUncraftingRecipe(recipeExporter, Items.HONEYCOMB_BLOCK, Items.HONEYCOMB, 4);
  }

  private void createRedwoodRecipes(RecipeOutput recipeExporter) {
    shapeless(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_BUTTON)
        .requires(EnrichedBlocks.REDWOOD_PLANKS)
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_PLANKS),
            has(EnrichedBlocks.REDWOOD_PLANKS))
        .save(recipeExporter);

    shaped(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_DOOR, 3)
        .define('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("RR ")
        .pattern("RR ")
        .pattern("RR ")
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_PLANKS),
            has(EnrichedBlocks.REDWOOD_PLANKS))
        .save(recipeExporter);

    shaped(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_FENCE, 3)
        .define('R', EnrichedBlocks.REDWOOD_PLANKS)
        .define('S', Items.STICK)
        .pattern("RSR")
        .pattern("RSR")
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_PLANKS),
            has(EnrichedBlocks.REDWOOD_PLANKS))
        .unlockedBy(
            getHasName(Items.STICK),
            has(Items.STICK))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_FENCE_GATE)
        .define('R', EnrichedBlocks.REDWOOD_PLANKS)
        .define('S', Items.STICK)
        .pattern("SRS")
        .pattern("SRS")
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_PLANKS),
            has(EnrichedBlocks.REDWOOD_PLANKS))
        .unlockedBy(
            getHasName(Items.STICK),
            has(Items.STICK))
        .save(recipeExporter);

    shapeless(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_PLANKS, 4)
        .requires(EnrichedTags.ItemTags.REDWOOD_LOGS)
        .unlockedBy(
            "has_" + EnrichedTags.ItemTags.REDWOOD_LOGS.location().getPath(),
            has(EnrichedTags.ItemTags.REDWOOD_LOGS))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_PRESSURE_PLATE)
        .define('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("RR")
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_PLANKS),
            has(EnrichedBlocks.REDWOOD_PLANKS))
        .save(recipeExporter);

    shaped(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_SLAB, 6)
        .define('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("RRR")
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_PLANKS),
            has(EnrichedBlocks.REDWOOD_PLANKS))
        .save(recipeExporter);

    shaped(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_STAIRS, 6)
        .define('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("R  ")
        .pattern("RR ")
        .pattern("RRR")
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_PLANKS),
            has(EnrichedBlocks.REDWOOD_PLANKS))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_TRAPDOOR, 2)
        .define('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("RRR")
        .pattern("RRR")
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_PLANKS),
            has(EnrichedBlocks.REDWOOD_PLANKS))
        .save(recipeExporter);

    shaped(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_WOOD, 2)
        .define('R', EnrichedBlocks.REDWOOD_LOG)
        .pattern("RR")
        .pattern("RR")
        .unlockedBy(
            getHasName(EnrichedBlocks.REDWOOD_LOG),
            has(EnrichedBlocks.REDWOOD_LOG))
        .save(recipeExporter);
  }

  private void createFoodRecipes(RecipeOutput recipeExporter) {
    shapeless(RecipeCategory.FOOD, EnrichedItems.BERRY_JUICE)
        .requires(Items.SWEET_BERRIES)
        .requires(Items.SWEET_BERRIES)
        .requires(Items.GLASS_BOTTLE)
        .unlockedBy(
            getHasName(Items.SWEET_BERRIES),
            has(Items.SWEET_BERRIES))
        .save(recipeExporter);

    shapeless(RecipeCategory.FOOD, EnrichedItems.BEEF_STEW)
        .requires(Items.COOKED_BEEF)
        .requires(Items.CARROT)
        .requires(Items.BOWL)
        .requires(Items.BAKED_POTATO)
        .requires(Items.BROWN_MUSHROOM)
        .unlockedBy(
            getHasName(Items.BROWN_MUSHROOM),
            has(Items.BROWN_MUSHROOM))
        .save(recipeExporter, "beef_brown_mushroom");

    shapeless(RecipeCategory.FOOD, EnrichedItems.BEEF_STEW)
        .requires(Items.COOKED_BEEF)
        .requires(Items.CARROT)
        .requires(Items.BOWL)
        .requires(Items.BAKED_POTATO)
        .requires(Items.RED_MUSHROOM)
        .unlockedBy(
            getHasName(Items.RED_MUSHROOM),
            has(Items.RED_MUSHROOM))
        .save(recipeExporter, "beef_red_mushroom");

    shapeless(RecipeCategory.FOOD, EnrichedItems.BEEF_STEW)
        .requires(Items.COOKED_BEEF)
        .requires(Items.MUSHROOM_STEW)
        .unlockedBy(
            getHasName(Items.COOKED_BEEF),
            has(Items.COOKED_BEEF))
        .save(recipeExporter, "beef_from_mushroom");
  }

  private void createDarkGraniteRecipes(RecipeOutput recipeExporter) {
    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.DARK_GRANITE_SLAB, 6)
        .define('D', EnrichedBlocks.DARK_GRANITE)
        .pattern("DDD")
        .unlockedBy(
            getHasName(EnrichedBlocks.DARK_GRANITE),
            has(EnrichedBlocks.DARK_GRANITE))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.DARK_GRANITE_STAIRS, 6)
        .define('D', EnrichedBlocks.DARK_GRANITE)
        .pattern("D  ")
        .pattern("DD ")
        .pattern("DDD")
        .unlockedBy(
            getHasName(EnrichedBlocks.DARK_GRANITE),
            has(EnrichedBlocks.DARK_GRANITE))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.DARK_GRANITE_WALL, 6)
        .define('D', EnrichedBlocks.DARK_GRANITE)
        .pattern("DDD")
        .pattern("DDD")
        .unlockedBy(
            getHasName(EnrichedBlocks.DARK_GRANITE),
            has(EnrichedBlocks.DARK_GRANITE))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_DARK_GRANITE, 4)
        .define('D', EnrichedBlocks.DARK_GRANITE)
        .pattern("DD ")
        .pattern("DD ")
        .unlockedBy(
            getHasName(EnrichedBlocks.DARK_GRANITE),
            has(EnrichedBlocks.DARK_GRANITE))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB, 6)
        .define('P', EnrichedBlocks.POLISHED_DARK_GRANITE)
        .pattern("PPP")
        .unlockedBy(
            getHasName(EnrichedBlocks.DARK_GRANITE),
            has(EnrichedBlocks.DARK_GRANITE))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS, 6)
        .define('P', EnrichedBlocks.POLISHED_DARK_GRANITE)
        .pattern("P  ")
        .pattern("PP ")
        .pattern("PPP")
        .unlockedBy(
            getHasName(EnrichedBlocks.DARK_GRANITE),
            has(EnrichedBlocks.DARK_GRANITE))
        .save(recipeExporter);
  }

  private void createMarbleRecipes(RecipeOutput recipeExporter) {
    shaped(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.MARBLE_SLAB, 6)
        .define('M', EnrichedBlocks.MARBLE)
        .pattern("MMM")
        .unlockedBy(
            getHasName(EnrichedBlocks.MARBLE),
            has(EnrichedBlocks.DARK_GRANITE))
        .save(recipeExporter);

    shaped(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.MARBLE_STAIRS, 6)
        .define('M', EnrichedBlocks.MARBLE)
        .pattern("M  ")
        .pattern("MM ")
        .pattern("MMM")
        .unlockedBy(
            getHasName(EnrichedBlocks.MARBLE),
            has(EnrichedBlocks.MARBLE))
        .save(recipeExporter);

    shaped(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.MARBLE_WALL, 6)
        .define('M', EnrichedBlocks.MARBLE)
        .pattern("MMM")
        .pattern("MMM")
        .unlockedBy(
            getHasName(EnrichedBlocks.MARBLE),
            has(EnrichedBlocks.MARBLE))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_MARBLE, 4)
        .define('M', EnrichedBlocks.MARBLE)
        .pattern("MM ")
        .pattern("MM ")
        .unlockedBy(
            getHasName(EnrichedBlocks.MARBLE),
            has(EnrichedBlocks.MARBLE))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_MARBLE_SLAB, 6)
        .define('M', EnrichedBlocks.POLISHED_MARBLE)
        .pattern("MMM")
        .unlockedBy(
            getHasName(EnrichedBlocks.POLISHED_MARBLE),
            has(EnrichedBlocks.POLISHED_MARBLE))
        .save(recipeExporter);

    shaped(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_MARBLE_STAIRS, 6)
        .define('M', EnrichedBlocks.POLISHED_MARBLE)
        .pattern("M  ")
        .pattern("MM ")
        .pattern("MMM")
        .unlockedBy(
            getHasName(EnrichedBlocks.POLISHED_MARBLE),
            has(EnrichedBlocks.POLISHED_MARBLE))
        .save(recipeExporter);
  }

  /*-------------------------*/
  /* -- Utility Functions -- */
  /*-------------------------*/

  private void createSwordRecipe(
      RecipeOutput recipeExporter,
      Item swordMaterial,
      Item outputSword,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.COMBAT, outputSword)
        .define('M', swordMaterial)
        .define('S', Items.STICK)
        .pattern(" M ")
        .pattern(" M ")
        .pattern(" S ")
        .unlockedBy(
            getHasName(swordMaterial),
            has(swordMaterial))
        .unlockedBy(
            getHasName(Items.STICK),
            has(Items.STICK))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createShovelRecipe(
      RecipeOutput recipeExporter,
      Item shovelMaterial,
      Item outputShovel,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.TOOLS, outputShovel)
        .define('M', shovelMaterial)
        .define('S', Items.STICK)
        .pattern(" M ")
        .pattern(" S ")
        .pattern(" S ")
        .unlockedBy(
            getHasName(shovelMaterial),
            has(shovelMaterial))
        .unlockedBy(
            getHasName(Items.STICK),
            has(Items.STICK))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createPickaxeRecipe(
      RecipeOutput recipeExporter,
      Item pickaxeMaterial,
      Item outputPickaxe,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.TOOLS, outputPickaxe)
        .define('M', pickaxeMaterial)
        .define('S', Items.STICK)
        .pattern("MMM")
        .pattern(" S ")
        .pattern(" S ")
        .unlockedBy(
            getHasName(pickaxeMaterial),
            has(pickaxeMaterial))
        .unlockedBy(
            getHasName(Items.STICK),
            has(Items.STICK))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createAxeRecipe(
      RecipeOutput recipeExporter,
      Item axeMaterial,
      Item outputAxe,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.TOOLS, outputAxe)
        .define('M', axeMaterial)
        .define('S', Items.STICK)
        .pattern("MM ")
        .pattern("MS ")
        .pattern(" S ")
        .unlockedBy(
            getHasName(axeMaterial),
            has(axeMaterial))
        .unlockedBy(
            getHasName(Items.STICK),
            has(Items.STICK))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createHoeRecipe(
      RecipeOutput recipeExporter,
      Item hoeMaterial,
      Item outputHoe,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.TOOLS, outputHoe)
        .define('M', hoeMaterial)
        .define('S', Items.STICK)
        .pattern("MM ")
        .pattern(" S ")
        .pattern(" S ")
        .unlockedBy(
            getHasName(hoeMaterial),
            has(hoeMaterial))
        .unlockedBy(
            getHasName(Items.STICK),
            has(Items.STICK))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createHelmetRecipe(
      RecipeOutput recipeExporter,
      Item helmetMaterial,
      Item outputHelmet,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.COMBAT, outputHelmet)
        .define('M', helmetMaterial)
        .pattern("MMM")
        .pattern("M M")
        .unlockedBy(
            getHasName(helmetMaterial),
            has(helmetMaterial))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createChestplateRecipe(
      RecipeOutput recipeExporter,
      Item chestplateMaterial,
      Item outputChestplate,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.COMBAT, outputChestplate)
        .define('M', chestplateMaterial)
        .pattern("M M")
        .pattern("MMM")
        .pattern("MMM")
        .unlockedBy(
            getHasName(chestplateMaterial),
            has(chestplateMaterial))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createLeggingsRecipe(
      RecipeOutput recipeExporter,
      Item leggingsMaterial,
      Item outputLeggings,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.COMBAT, outputLeggings)
        .define('M', leggingsMaterial)
        .pattern("MMM")
        .pattern("M M")
        .pattern("M M")
        .unlockedBy(
            getHasName(leggingsMaterial),
            has(leggingsMaterial))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createBootsRecipe(
      RecipeOutput recipeExporter,
      Item bootsRecipe,
      Item outputBoots,
      @Nullable List<ResourceCondition> resourceConditions) {
    shaped(RecipeCategory.COMBAT, outputBoots)
        .define('M', bootsRecipe)
        .pattern("M M")
        .pattern("M M")
        .unlockedBy(
            getHasName(bootsRecipe),
            has(bootsRecipe))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createHorseArmorRecipe(
      RecipeOutput recipeExporter, Item horseArmorMaterial, Item outputHorseArmor) {
    shaped(RecipeCategory.MISC, outputHorseArmor)
        .define('M', horseArmorMaterial)
        .pattern("M M")
        .pattern("MMM")
        .pattern("M M")
        .unlockedBy(
            getHasName(horseArmorMaterial),
            has(horseArmorMaterial))
        .save(withConditions(recipeExporter, EnrichedResourceConditions.HORSE_ARMOR_ENABLED));
  }

  private void createUncraftingRecipeWithTag(
      RecipeOutput exporter, TagKey<Item> compactItemTag, Item outputItem, int count) {
    shapeless(RecipeCategory.MISC, outputItem, count)
        .requires(compactItemTag)
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            withConditions(exporter, EnrichedResourceConditions.UNCRAFTING_ENABLED),
            recipeKey("uncrafting_" + compactItemTag.location().getPath()));
  }

  private void createUncraftingRecipe(
      RecipeOutput exporter, Item compactItem, Item outputItem, int count) {
    shapeless(RecipeCategory.MISC, outputItem, count)
        .requires(compactItem)
        .unlockedBy(
            getHasName(compactItem),
            has(compactItem))
        .save(
            withConditions(exporter, EnrichedResourceConditions.UNCRAFTING_ENABLED),
            recipeKey("uncrafting_"
                    + StringUtils.substringAfterLast(compactItem.getDescriptionId(), ".")));
  }

  private void createHelmetTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputHelmet,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.COMBAT, outputHelmet)
        .define('M', compactItemTag)
        .pattern("MMM")
        .pattern("M M")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_helmet"));
  }

  private void createChestplateTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputChestplate,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.COMBAT, outputChestplate)
        .define('M', compactItemTag)
        .pattern("M M")
        .pattern("MMM")
        .pattern("MMM")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_chestplate"));
  }

  private void createLeggingsTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputLeggings,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.COMBAT, outputLeggings)
        .define('M', compactItemTag)
        .pattern("MMM")
        .pattern("M M")
        .pattern("M M")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_leggings"));
  }

  private void createBootsTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputBoots,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.COMBAT, outputBoots)
        .define('M', compactItemTag)
        .pattern("M M")
        .pattern("M M")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_boots"));
  }

  private void createSwordTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputSword,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.COMBAT, outputSword)
        .define('M', compactItemTag)
        .define('S', Items.STICK)
        .pattern(" M ")
        .pattern(" M ")
        .pattern(" S ")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_sword"));
  }

  private void createPickaxeTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputPickaxe,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.TOOLS, outputPickaxe)
        .define('M', compactItemTag)
        .define('S', Items.STICK)
        .pattern("MMM")
        .pattern(" S ")
        .pattern(" S ")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_pickaxe"));
  }

  private void createAxeTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputAxe,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.COMBAT, outputAxe)
        .define('M', compactItemTag)
        .define('S', Items.STICK)
        .pattern("MM ")
        .pattern("MS ")
        .pattern(" S ")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_axe"));
  }

  private void createShovelTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputShovel,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.TOOLS, outputShovel)
        .define('M', compactItemTag)
        .define('S', Items.STICK)
        .pattern(" M ")
        .pattern(" S ")
        .pattern(" S ")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_shovel"));
  }

  private void createHoeTagRecipe(
      RecipeOutput recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputHoe,
      @Nullable List<ResourceCondition> resourceConditions) {

    shaped(RecipeCategory.TOOLS, outputHoe)
        .define('M', compactItemTag)
        .define('S', Items.STICK)
        .pattern("MM ")
        .pattern(" S ")
        .pattern(" S ")
        .unlockedBy(
            "has_" + compactItemTag.location().getPath(),
            has(compactItemTag))
        .save(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            recipeKey(StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_hoe"));
  }
    };
  }

  @Override
  public String getName() {
    return "Enriched Recipes";
  }

  private static ResourceKey<Recipe<?>> recipeKey(String path) {
    return ResourceKey.create(Registries.RECIPE, EnrichedRegisters.id(path));
  }
}
