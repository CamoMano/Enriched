package com.enrichedmc.enriched.datagen;

import static com.enrichedmc.enriched.tag.EnrichedTags.*;
import static com.enrichedmc.enriched.tag.EnrichedTags.ItemTags.*;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.conditions.EnrichedResourceConditions;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.tag.EnrichedTags;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.BlastingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

public class EnrichedRecipeProvider extends FabricRecipeProvider {
  public EnrichedRecipeProvider(
      FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  public void generate(RecipeExporter exporter) {
    this.createRubyRecipes(exporter);
    this.createSapphireRecipes(exporter);
    this.createTanzaniteRecipes(exporter);
    this.createSteelRecipes(exporter);
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

  private void createRubyRecipes(RecipeExporter recipeExporter) {
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

    offerReversibleCompactingRecipes(
        recipeExporter,
        RecipeCategory.MISC,
        EnrichedItems.RUBY,
        RecipeCategory.MISC,
        EnrichedBlocks.RUBY_BLOCK);
  }

  private void createSapphireRecipes(RecipeExporter recipeExporter) {
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

    offerReversibleCompactingRecipes(
        recipeExporter,
        RecipeCategory.MISC,
        EnrichedItems.SAPPHIRE,
        RecipeCategory.MISC,
        EnrichedBlocks.SAPPHIRE_BLOCK);
  }

  private void createTanzaniteRecipes(RecipeExporter recipeExporter) {
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

    offerReversibleCompactingRecipes(
        recipeExporter,
        RecipeCategory.MISC,
        EnrichedItems.TANZANITE,
        RecipeCategory.MISC,
        EnrichedBlocks.TANZANITE_BLOCK);
  }

  private void createSteelRecipes(RecipeExporter recipeExporter) {
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

    ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, EnrichedItems.STEEL_BLEND)
        .input(Items.IRON_INGOT)
        .input(Items.COAL)
        .criterion(
            FabricRecipeProvider.hasItem(Items.IRON_INGOT),
            FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
        .offerTo(recipeExporter);

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

    offerReversibleCompactingRecipes(
        recipeExporter,
        RecipeCategory.MISC,
        EnrichedItems.STEEL_INGOT,
        RecipeCategory.MISC,
        EnrichedBlocks.STEEL_BLOCK);
  }

  private void createObsidianRecipes(RecipeExporter recipeExporter) {
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

    ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, EnrichedItems.OBSIDIAN_ALLOY_BLEND)
        .input(Items.OBSIDIAN)
        .input(EnrichedItems.STEEL_INGOT)
        .criterion(
            FabricRecipeProvider.hasItem(Items.OBSIDIAN),
            FabricRecipeProvider.conditionsFromItem(Items.OBSIDIAN))
        .offerTo(recipeExporter);

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

    offerReversibleCompactingRecipes(
        recipeExporter,
        RecipeCategory.MISC,
        EnrichedItems.OBSIDIAN_ALLOY_INGOT,
        RecipeCategory.MISC,
        EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);
  }

  private void createEmeraldRecipes(RecipeExporter recipeExporter) {
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

  private void createCopperRecipes(RecipeExporter recipeExporter) {
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

  private void createHorseArmorRecipes(RecipeExporter recipeExporter) {
    this.createHorseArmorRecipe(recipeExporter, Items.DIAMOND, Items.DIAMOND_HORSE_ARMOR);
    this.createHorseArmorRecipe(recipeExporter, Items.GOLD_INGOT, Items.GOLDEN_HORSE_ARMOR);
    this.createHorseArmorRecipe(recipeExporter, Items.IRON_INGOT, Items.IRON_HORSE_ARMOR);
  }

  private void createChainmailRecipes(RecipeExporter recipeExporter) {
    this.createHelmetRecipe(
        recipeExporter,
        Items.CHAIN,
        (ArmorItem) Items.CHAINMAIL_HELMET,
        Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

    this.createChestplateRecipe(
        recipeExporter,
        Items.CHAIN,
        (ArmorItem) Items.CHAINMAIL_CHESTPLATE,
        Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

    this.createLeggingsRecipe(
        recipeExporter,
        Items.CHAIN,
        (ArmorItem) Items.CHAINMAIL_LEGGINGS,
        Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

    this.createBootsRecipe(
        recipeExporter,
        Items.CHAIN,
        (ArmorItem) Items.CHAINMAIL_BOOTS,
        Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));
  }

  private void createRawSmeltingRecipes(RecipeExporter recipeExporter) {
    this.createSmeltingRecipe(
        recipeExporter, Items.RAW_IRON_BLOCK, RecipeCategory.MISC, Items.IRON_BLOCK, 6.3f, 1800);
    this.createSmeltingRecipe(
        recipeExporter,
        Items.RAW_COPPER_BLOCK,
        RecipeCategory.MISC,
        Items.COPPER_BLOCK,
        6.3f,
        1800);
    this.createSmeltingRecipe(
        recipeExporter, Items.RAW_GOLD_BLOCK, RecipeCategory.MISC, Items.GOLD_BLOCK, 6.3f, 1800);

    this.createBlastingRecipe(
        recipeExporter, Items.RAW_IRON_BLOCK, RecipeCategory.MISC, Items.IRON_BLOCK, 6.3f, 900);
    this.createBlastingRecipe(
        recipeExporter, Items.RAW_COPPER_BLOCK, RecipeCategory.MISC, Items.COPPER_BLOCK, 6.3f, 900);
    this.createBlastingRecipe(
        recipeExporter, Items.RAW_GOLD_BLOCK, RecipeCategory.MISC, Items.GOLD_BLOCK, 6.3f, 900);
  }

  private void createSmeltingRecipe(
      RecipeExporter recipeExporter,
      Item input,
      RecipeCategory recipeCategory,
      Item output,
      float experience,
      int cookingTime) {
    String recipeJSONFileName =
        String.format(
            "%s_from_smelting_%s",
            StringUtils.substringAfterLast(output.getTranslationKey(), "."),
            StringUtils.substringAfterLast(input.getTranslationKey(), "."));

    CookingRecipeJsonBuilder.create(
            Ingredient.ofItems(input),
            recipeCategory,
            output,
            experience,
            cookingTime,
            RecipeSerializer.SMELTING,
            SmeltingRecipe::new)
        .criterion(
            FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
        .offerTo(
            withConditions(recipeExporter, EnrichedResourceConditions.RAW_SMELTING_ENABLED),
            Identifier.of(EnrichedMod.MOD_ID, recipeJSONFileName));
  }

  private void createBlastingRecipe(
      RecipeExporter recipeExporter,
      Item input,
      RecipeCategory recipeCategory,
      Item output,
      float experience,
      int cookingTime) {
    String recipeJSONFileName =
        String.format(
            "%s_from_blasting_%s",
            StringUtils.substringAfterLast(output.getTranslationKey(), "."),
            StringUtils.substringAfterLast(input.getTranslationKey(), "."));

    CookingRecipeJsonBuilder.create(
            Ingredient.ofItems(input),
            recipeCategory,
            output,
            experience,
            cookingTime,
            RecipeSerializer.BLASTING,
            BlastingRecipe::new)
        .criterion(
            FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
        .offerTo(
            withConditions(recipeExporter, EnrichedResourceConditions.RAW_SMELTING_ENABLED),
            Identifier.of(EnrichedMod.MOD_ID, recipeJSONFileName));
  }

  private void createUncraftingRecipes(RecipeExporter recipeExporter) {
    this.createUncraftingRecipeWithTag(recipeExporter, ItemTags.WOOL, Items.STRING, 4);

    this.createUncraftingRecipe(recipeExporter, Items.COBWEB, Items.STRING, 5);
    this.createUncraftingRecipe(recipeExporter, Items.BRICKS, Items.BRICK, 4);
    this.createUncraftingRecipe(recipeExporter, Items.NETHER_BRICK, Items.NETHER_BRICKS, 4);
    this.createUncraftingRecipe(recipeExporter, Items.MAGMA_BLOCK, Items.MAGMA_CREAM, 4);
    this.createUncraftingRecipe(recipeExporter, Items.NETHER_WART, Items.NETHER_WART_BLOCK, 9);
    this.createUncraftingRecipe(recipeExporter, Items.HONEYCOMB_BLOCK, Items.HONEYCOMB, 4);
  }

  private void createRedwoodRecipes(RecipeExporter recipeExporter) {
    ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_BUTTON)
        .input(EnrichedBlocks.REDWOOD_PLANKS)
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_PLANKS),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_PLANKS))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_DOOR, 3)
        .input('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("RR ")
        .pattern("RR ")
        .pattern("RR ")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_PLANKS),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_PLANKS))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_FENCE, 3)
        .input('R', EnrichedBlocks.REDWOOD_PLANKS)
        .input('S', Items.STICK)
        .pattern("RSR")
        .pattern("RSR")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_PLANKS),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_PLANKS))
        .criterion(
            FabricRecipeProvider.hasItem(Items.STICK),
            FabricRecipeProvider.conditionsFromItem(Items.STICK))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_FENCE_GATE)
        .input('R', EnrichedBlocks.REDWOOD_PLANKS)
        .input('S', Items.STICK)
        .pattern("SRS")
        .pattern("SRS")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_PLANKS),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_PLANKS))
        .criterion(
            FabricRecipeProvider.hasItem(Items.STICK),
            FabricRecipeProvider.conditionsFromItem(Items.STICK))
        .offerTo(recipeExporter);

    ShapelessRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_PLANKS, 4)
        .input(EnrichedTags.ItemTags.REDWOOD_LOGS)
        .criterion(
            "has_" + EnrichedTags.ItemTags.REDWOOD_LOGS.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(EnrichedTags.ItemTags.REDWOOD_LOGS))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_PRESSURE_PLATE)
        .input('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("RR")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_PLANKS),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_PLANKS))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_SLAB, 6)
        .input('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("RRR")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_PLANKS),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_PLANKS))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_STAIRS, 6)
        .input('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("R  ")
        .pattern("RR ")
        .pattern("RRR")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_PLANKS),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_PLANKS))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_TRAPDOOR, 2)
        .input('R', EnrichedBlocks.REDWOOD_PLANKS)
        .pattern("RRR")
        .pattern("RRR")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_PLANKS),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_PLANKS))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.REDWOOD_WOOD, 2)
        .input('R', EnrichedBlocks.REDWOOD_LOG)
        .pattern("RR")
        .pattern("RR")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.REDWOOD_LOG),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.REDWOOD_LOG))
        .offerTo(recipeExporter);
  }

  private void createFoodRecipes(RecipeExporter recipeExporter) {
    ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, EnrichedItems.BERRY_JUICE)
        .input(Items.SWEET_BERRIES)
        .input(Items.SWEET_BERRIES)
        .input(Items.GLASS_BOTTLE)
        .criterion(
            FabricRecipeProvider.hasItem(Items.SWEET_BERRIES),
            FabricRecipeProvider.conditionsFromItem(Items.SWEET_BERRIES))
        .offerTo(recipeExporter);

    ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, EnrichedItems.BEEF_STEW)
        .input(Items.COOKED_BEEF)
        .input(Items.CARROT)
        .input(Items.BOWL)
        .input(Items.BAKED_POTATO)
        .input(Items.BROWN_MUSHROOM)
        .criterion(
            FabricRecipeProvider.hasItem(Items.BROWN_MUSHROOM),
            FabricRecipeProvider.conditionsFromItem(Items.BROWN_MUSHROOM))
        .offerTo(recipeExporter, "beef_brown_mushroom");

    ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, EnrichedItems.BEEF_STEW)
        .input(Items.COOKED_BEEF)
        .input(Items.CARROT)
        .input(Items.BOWL)
        .input(Items.BAKED_POTATO)
        .input(Items.RED_MUSHROOM)
        .criterion(
            FabricRecipeProvider.hasItem(Items.RED_MUSHROOM),
            FabricRecipeProvider.conditionsFromItem(Items.RED_MUSHROOM))
        .offerTo(recipeExporter, "beef_red_mushroom");

    ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, EnrichedItems.BEEF_STEW)
        .input(Items.COOKED_BEEF)
        .input(Items.MUSHROOM_STEW)
        .criterion(
            FabricRecipeProvider.hasItem(Items.COOKED_BEEF),
            FabricRecipeProvider.conditionsFromItem(Items.COOKED_BEEF))
        .offerTo(recipeExporter, "beef_from_mushroom");
  }

  private void createDarkGraniteRecipes(RecipeExporter recipeExporter) {
    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.DARK_GRANITE_SLAB, 6)
        .input('D', EnrichedBlocks.DARK_GRANITE)
        .pattern("DDD")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.DARK_GRANITE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.DARK_GRANITE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.DARK_GRANITE_STAIRS, 6)
        .input('D', EnrichedBlocks.DARK_GRANITE)
        .pattern("D  ")
        .pattern("DD ")
        .pattern("DDD")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.DARK_GRANITE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.DARK_GRANITE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.DARK_GRANITE_WALL, 6)
        .input('D', EnrichedBlocks.DARK_GRANITE)
        .pattern("DDD")
        .pattern("DDD")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.DARK_GRANITE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.DARK_GRANITE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_DARK_GRANITE, 4)
        .input('D', EnrichedBlocks.DARK_GRANITE)
        .pattern("DD ")
        .pattern("DD ")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.DARK_GRANITE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.DARK_GRANITE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB, 6)
        .input('P', EnrichedBlocks.POLISHED_DARK_GRANITE)
        .pattern("PPP")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.DARK_GRANITE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.DARK_GRANITE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS, 6)
        .input('P', EnrichedBlocks.POLISHED_DARK_GRANITE)
        .pattern("P  ")
        .pattern("PP ")
        .pattern("PPP")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.DARK_GRANITE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.DARK_GRANITE))
        .offerTo(recipeExporter);
  }

  private void createMarbleRecipes(RecipeExporter recipeExporter) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.MARBLE_SLAB, 6)
        .input('M', EnrichedBlocks.MARBLE)
        .pattern("MMM")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.MARBLE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.DARK_GRANITE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.MARBLE_STAIRS, 6)
        .input('M', EnrichedBlocks.MARBLE)
        .pattern("M  ")
        .pattern("MM ")
        .pattern("MMM")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.MARBLE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.MARBLE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.MARBLE_WALL, 6)
        .input('M', EnrichedBlocks.MARBLE)
        .pattern("MMM")
        .pattern("MMM")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.MARBLE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.MARBLE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_MARBLE, 4)
        .input('M', EnrichedBlocks.MARBLE)
        .pattern("MM ")
        .pattern("MM ")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.MARBLE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.MARBLE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_MARBLE_SLAB, 6)
        .input('M', EnrichedBlocks.POLISHED_MARBLE)
        .pattern("MMM")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.POLISHED_MARBLE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.POLISHED_MARBLE))
        .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(
            RecipeCategory.BUILDING_BLOCKS, EnrichedBlocks.POLISHED_MARBLE_STAIRS, 6)
        .input('M', EnrichedBlocks.POLISHED_MARBLE)
        .pattern("M  ")
        .pattern("MM ")
        .pattern("MMM")
        .criterion(
            FabricRecipeProvider.hasItem(EnrichedBlocks.POLISHED_MARBLE),
            FabricRecipeProvider.conditionsFromItem(EnrichedBlocks.POLISHED_MARBLE))
        .offerTo(recipeExporter);
  }

  /*-------------------------*/
  /* -- Utility Functions -- */
  /*-------------------------*/

  private void createSwordRecipe(
      RecipeExporter recipeExporter,
      Item swordMaterial,
      Item outputSword,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputSword)
        .input('M', swordMaterial)
        .input('S', Items.STICK)
        .pattern(" M ")
        .pattern(" M ")
        .pattern(" S ")
        .criterion(
            FabricRecipeProvider.hasItem(swordMaterial),
            FabricRecipeProvider.conditionsFromItem(swordMaterial))
        .criterion(
            FabricRecipeProvider.hasItem(Items.STICK),
            FabricRecipeProvider.conditionsFromItem(Items.STICK))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createShovelRecipe(
      RecipeExporter recipeExporter,
      Item shovelMaterial,
      Item outputShovel,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputShovel)
        .input('M', shovelMaterial)
        .input('S', Items.STICK)
        .pattern(" M ")
        .pattern(" S ")
        .pattern(" S ")
        .criterion(
            FabricRecipeProvider.hasItem(shovelMaterial),
            FabricRecipeProvider.conditionsFromItem(shovelMaterial))
        .criterion(
            FabricRecipeProvider.hasItem(Items.STICK),
            FabricRecipeProvider.conditionsFromItem(Items.STICK))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createPickaxeRecipe(
      RecipeExporter recipeExporter,
      Item pickaxeMaterial,
      Item outputPickaxe,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputPickaxe)
        .input('M', pickaxeMaterial)
        .input('S', Items.STICK)
        .pattern("MMM")
        .pattern(" S ")
        .pattern(" S ")
        .criterion(
            FabricRecipeProvider.hasItem(pickaxeMaterial),
            FabricRecipeProvider.conditionsFromItem(pickaxeMaterial))
        .criterion(
            FabricRecipeProvider.hasItem(Items.STICK),
            FabricRecipeProvider.conditionsFromItem(Items.STICK))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createAxeRecipe(
      RecipeExporter recipeExporter,
      Item axeMaterial,
      Item outputAxe,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputAxe)
        .input('M', axeMaterial)
        .input('S', Items.STICK)
        .pattern("MM ")
        .pattern("MS ")
        .pattern(" S ")
        .criterion(
            FabricRecipeProvider.hasItem(axeMaterial),
            FabricRecipeProvider.conditionsFromItem(axeMaterial))
        .criterion(
            FabricRecipeProvider.hasItem(Items.STICK),
            FabricRecipeProvider.conditionsFromItem(Items.STICK))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createHoeRecipe(
      RecipeExporter recipeExporter,
      Item hoeMaterial,
      Item outputHoe,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputHoe)
        .input('M', hoeMaterial)
        .input('S', Items.STICK)
        .pattern("MM ")
        .pattern(" S ")
        .pattern(" S ")
        .criterion(
            FabricRecipeProvider.hasItem(hoeMaterial),
            FabricRecipeProvider.conditionsFromItem(hoeMaterial))
        .criterion(
            FabricRecipeProvider.hasItem(Items.STICK),
            FabricRecipeProvider.conditionsFromItem(Items.STICK))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createHelmetRecipe(
      RecipeExporter recipeExporter,
      Item helmetMaterial,
      ArmorItem outputHelmet,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputHelmet)
        .input('M', helmetMaterial)
        .pattern("MMM")
        .pattern("M M")
        .criterion(
            FabricRecipeProvider.hasItem(helmetMaterial),
            FabricRecipeProvider.conditionsFromItem(helmetMaterial))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createChestplateRecipe(
      RecipeExporter recipeExporter,
      Item chestplateMaterial,
      ArmorItem outputChestplate,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputChestplate)
        .input('M', chestplateMaterial)
        .pattern("M M")
        .pattern("MMM")
        .pattern("MMM")
        .criterion(
            FabricRecipeProvider.hasItem(chestplateMaterial),
            FabricRecipeProvider.conditionsFromItem(chestplateMaterial))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createLeggingsRecipe(
      RecipeExporter recipeExporter,
      Item leggingsMaterial,
      ArmorItem outputLeggings,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputLeggings)
        .input('M', leggingsMaterial)
        .pattern("MMM")
        .pattern("M M")
        .pattern("M M")
        .criterion(
            FabricRecipeProvider.hasItem(leggingsMaterial),
            FabricRecipeProvider.conditionsFromItem(leggingsMaterial))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createBootsRecipe(
      RecipeExporter recipeExporter,
      Item bootsRecipe,
      ArmorItem outputBoots,
      @Nullable List<ResourceCondition> resourceConditions) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputBoots)
        .input('M', bootsRecipe)
        .pattern("M M")
        .pattern("M M")
        .criterion(
            FabricRecipeProvider.hasItem(bootsRecipe),
            FabricRecipeProvider.conditionsFromItem(bootsRecipe))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter);
  }

  private void createHorseArmorRecipe(
      RecipeExporter recipeExporter, Item horseArmorMaterial, Item outputHorseArmor) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, outputHorseArmor)
        .input('M', horseArmorMaterial)
        .pattern("M M")
        .pattern("MMM")
        .pattern("M M")
        .criterion(
            FabricRecipeProvider.hasItem(horseArmorMaterial),
            FabricRecipeProvider.conditionsFromItem(horseArmorMaterial))
        .offerTo(withConditions(recipeExporter, EnrichedResourceConditions.HORSE_ARMOR_ENABLED));
  }

  private void createUncraftingRecipeWithTag(
      RecipeExporter exporter, TagKey<Item> compactItemTag, Item outputItem, int count) {
    ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, outputItem, count)
        .input(compactItemTag)
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            withConditions(exporter, EnrichedResourceConditions.UNCRAFTING_ENABLED),
            Identifier.of(EnrichedMod.MOD_ID, "uncrafting_" + compactItemTag.id().getPath()));
  }

  private void createUncraftingRecipe(
      RecipeExporter exporter, Item compactItem, Item outputItem, int count) {
    ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, outputItem, count)
        .input(compactItem)
        .criterion(
            FabricRecipeProvider.hasItem(compactItem),
            FabricRecipeProvider.conditionsFromItem(compactItem))
        .offerTo(
            withConditions(exporter, EnrichedResourceConditions.UNCRAFTING_ENABLED),
            Identifier.of(
                EnrichedMod.MOD_ID,
                "uncrafting_"
                    + StringUtils.substringAfterLast(compactItem.getTranslationKey(), ".")));
  }

  private void createHelmetTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      ArmorItem outputHelmet,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputHelmet)
        .input('M', compactItemTag)
        .pattern("MMM")
        .pattern("M M")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_helmet"));
  }

  private void createChestplateTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      ArmorItem outputChestplate,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputChestplate)
        .input('M', compactItemTag)
        .pattern("M M")
        .pattern("MMM")
        .pattern("MMM")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_chestplate"));
  }

  private void createLeggingsTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      ArmorItem outputLeggings,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputLeggings)
        .input('M', compactItemTag)
        .pattern("MMM")
        .pattern("M M")
        .pattern("M M")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_leggings"));
  }

  private void createBootsTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      ArmorItem outputBoots,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputBoots)
        .input('M', compactItemTag)
        .pattern("M M")
        .pattern("M M")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_boots"));
  }

  private void createSwordTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputSword,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputSword)
        .input('M', compactItemTag)
        .input('S', Items.STICK)
        .pattern(" M ")
        .pattern(" M ")
        .pattern(" S ")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_sword"));
  }

  private void createPickaxeTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputPickaxe,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputPickaxe)
        .input('M', compactItemTag)
        .input('S', Items.STICK)
        .pattern("MMM")
        .pattern(" S ")
        .pattern(" S ")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_pickaxe"));
  }

  private void createAxeTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputAxe,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputAxe)
        .input('M', compactItemTag)
        .input('S', Items.STICK)
        .pattern("MM ")
        .pattern("MS ")
        .pattern(" S ")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_axe"));
  }

  private void createShovelTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputShovel,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputShovel)
        .input('M', compactItemTag)
        .input('S', Items.STICK)
        .pattern(" M ")
        .pattern(" S ")
        .pattern(" S ")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_shovel"));
  }

  private void createHoeTagRecipe(
      RecipeExporter recipeExporter,
      TagKey<Item> compactItemTag,
      Item outputHoe,
      @Nullable List<ResourceCondition> resourceConditions) {

    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputHoe)
        .input('M', compactItemTag)
        .input('S', Items.STICK)
        .pattern("MM ")
        .pattern(" S ")
        .pattern(" S ")
        .criterion(
            "has_" + compactItemTag.id().getPath(),
            FabricRecipeProvider.conditionsFromTag(compactItemTag))
        .offerTo(
            resourceConditions != null
                ? withConditions(
                    recipeExporter, resourceConditions.toArray(ResourceCondition[]::new))
                : recipeExporter,
            Identifier.of(
                EnrichedMod.MOD_ID,
                StringUtils.substringAfterLast(compactItemTag.getTranslationKey(), ".")
                    + "_tag_hoe"));
  }
}
