package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import java.util.Optional;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class EnrichedModelProvider extends FabricModelProvider {
  public EnrichedModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
    BlockModelGenerators.BlockFamilyProvider redwoodTexturePool =
        blockStateModelGenerator.family(EnrichedBlocks.REDWOOD_PLANKS);
    BlockModelGenerators.BlockFamilyProvider darkGraniteTexturePool =
        blockStateModelGenerator.family(EnrichedBlocks.DARK_GRANITE);
    BlockModelGenerators.BlockFamilyProvider polishedDarkGraniteTexturePool =
        blockStateModelGenerator.family(
            EnrichedBlocks.POLISHED_DARK_GRANITE);
    BlockModelGenerators.BlockFamilyProvider marbleTexturePool =
        blockStateModelGenerator.family(EnrichedBlocks.MARBLE);
    BlockModelGenerators.BlockFamilyProvider polishedMarbleTexturePool =
        blockStateModelGenerator.family(EnrichedBlocks.POLISHED_MARBLE);

    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.RUBY_BLOCK);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.RUBY_ORE);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.DEEPSLATE_RUBY_ORE);

    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.SAPPHIRE_BLOCK);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.SAPPHIRE_ORE);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE);

    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.TANZANITE_BLOCK);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.TANZANITE_ORE);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE);

    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.AMBER_BLOCK);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.AMBER_ORE);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.DEEPSLATE_AMBER_ORE);

    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.TOPAZ_BLOCK);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.TOPAZ_ORE);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.DEEPSLATE_TOPAZ_ORE);

    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.TIN_BLOCK);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.TIN_ORE);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.DEEPSLATE_TIN_ORE);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.RAW_TIN_BLOCK);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.BRONZE_BLOCK);

    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.STEEL_BLOCK);
    blockStateModelGenerator.createTrivialCube(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);

    blockStateModelGenerator
        .woodProvider(EnrichedBlocks.REDWOOD_LOG)
        .logWithHorizontal(EnrichedBlocks.REDWOOD_LOG)
        .wood(EnrichedBlocks.REDWOOD_WOOD);

    blockStateModelGenerator
        .woodProvider(EnrichedBlocks.STRIPPED_REDWOOD_LOG)
        .logWithHorizontal(EnrichedBlocks.STRIPPED_REDWOOD_LOG)
        .wood(EnrichedBlocks.STRIPPED_REDWOOD_WOOD);

    blockStateModelGenerator.createTrivialBlock(EnrichedBlocks.REDWOOD_LEAVES, TexturedModel.LEAVES);
    blockStateModelGenerator.createPlant(
        EnrichedBlocks.REDWOOD_SAPLING,
        EnrichedBlocks.POTTED_REDWOOD_SAPLING,
        BlockModelGenerators.TintState.NOT_TINTED);

    redwoodTexturePool.button(EnrichedBlocks.REDWOOD_BUTTON);
    blockStateModelGenerator.createDoor(EnrichedBlocks.REDWOOD_DOOR);
    redwoodTexturePool.pressurePlate(EnrichedBlocks.REDWOOD_PRESSURE_PLATE);
    blockStateModelGenerator.createTrapdoor(EnrichedBlocks.REDWOOD_TRAPDOOR);
    redwoodTexturePool.slab(EnrichedBlocks.REDWOOD_SLAB);
    redwoodTexturePool.stairs(EnrichedBlocks.REDWOOD_STAIRS);
    redwoodTexturePool.fence(EnrichedBlocks.REDWOOD_FENCE);
    redwoodTexturePool.fenceGate(EnrichedBlocks.REDWOOD_FENCE_GATE);

    darkGraniteTexturePool.slab(EnrichedBlocks.DARK_GRANITE_SLAB);
    darkGraniteTexturePool.stairs(EnrichedBlocks.DARK_GRANITE_STAIRS);
    darkGraniteTexturePool.wall(EnrichedBlocks.DARK_GRANITE_WALL);
    polishedDarkGraniteTexturePool.slab(EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB);
    polishedDarkGraniteTexturePool.stairs(EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS);

    marbleTexturePool.slab(EnrichedBlocks.MARBLE_SLAB);
    marbleTexturePool.stairs(EnrichedBlocks.MARBLE_STAIRS);
    marbleTexturePool.wall(EnrichedBlocks.MARBLE_WALL);
    polishedMarbleTexturePool.slab(EnrichedBlocks.POLISHED_MARBLE_SLAB);
    polishedMarbleTexturePool.stairs(EnrichedBlocks.POLISHED_MARBLE_STAIRS);
  }

  @Override
  public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    /*-------------*/
    /* -- Items -- */
    /*-------------*/

    itemModelGenerator.generateFlatItem(EnrichedItems.RUBY, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.SAPPHIRE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.TANZANITE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.AMBER, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.TOPAZ, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.STEEL_BLEND, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.STEEL_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.BRONZE_BLEND, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.BRONZE_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.TIN_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.RAW_TIN, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.OBSIDIAN_ALLOY_BLEND, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.OBSIDIAN_ALLOY_INGOT, ModelTemplates.FLAT_ITEM);

    /*-------------*/
    /* -- Tools -- */
    /*-------------*/

    this.registerToolModels(
        itemModelGenerator,
        EnrichedItems.RUBY_SWORD,
        EnrichedItems.RUBY_SHOVEL,
        EnrichedItems.RUBY_PICKAXE,
        EnrichedItems.RUBY_AXE,
        EnrichedItems.RUBY_HOE);

    this.registerToolModels(
        itemModelGenerator,
        EnrichedItems.SAPPHIRE_SWORD,
        EnrichedItems.SAPPHIRE_SHOVEL,
        EnrichedItems.SAPPHIRE_PICKAXE,
        EnrichedItems.SAPPHIRE_AXE,
        EnrichedItems.SAPPHIRE_HOE);

    this.registerToolModels(
        itemModelGenerator,
        EnrichedItems.TANZANITE_SWORD,
        EnrichedItems.TANZANITE_SHOVEL,
        EnrichedItems.TANZANITE_PICKAXE,
        EnrichedItems.TANZANITE_AXE,
        EnrichedItems.TANZANITE_HOE);

    this.registerToolModels(
        itemModelGenerator,
        EnrichedItems.STEEL_SWORD,
        EnrichedItems.STEEL_SHOVEL,
        EnrichedItems.STEEL_PICKAXE,
        EnrichedItems.STEEL_AXE,
        EnrichedItems.STEEL_HOE);

    this.registerToolModels(
        itemModelGenerator,
        EnrichedItems.OBSIDIAN_SWORD,
        EnrichedItems.OBSIDIAN_SHOVEL,
        EnrichedItems.OBSIDIAN_PICKAXE,
        EnrichedItems.OBSIDIAN_AXE,
        EnrichedItems.OBSIDIAN_HOE);

    this.registerToolModels(
        itemModelGenerator,
        EnrichedItems.EMERALD_SWORD,
        EnrichedItems.EMERALD_SHOVEL,
        EnrichedItems.EMERALD_PICKAXE,
        EnrichedItems.EMERALD_AXE,
        EnrichedItems.EMERALD_HOE);

    this.registerToolModels(
        itemModelGenerator,
        EnrichedItems.COPPER_SWORD,
        EnrichedItems.COPPER_SHOVEL,
        EnrichedItems.COPPER_PICKAXE,
        EnrichedItems.COPPER_AXE,
        EnrichedItems.COPPER_HOE);

    this.registerToolModels(
            itemModelGenerator,
            EnrichedItems.BRONZE_SWORD,
            EnrichedItems.BRONZE_SHOVEL,
            EnrichedItems.BRONZE_PICKAXE,
            EnrichedItems.BRONZE_AXE,
            EnrichedItems.BRONZE_HOE);

    /*-------------*/
    /* -- Armor -- */
    /*-------------*/

    this.registerArmorModels(
        itemModelGenerator,
        EnrichedItems.RUBY_HELMET,
        EnrichedItems.RUBY_CHESTPLATE,
        EnrichedItems.RUBY_LEGGINGS,
        EnrichedItems.RUBY_BOOTS);

    this.registerArmorModels(
        itemModelGenerator,
        EnrichedItems.SAPPHIRE_HELMET,
        EnrichedItems.SAPPHIRE_CHESTPLATE,
        EnrichedItems.SAPPHIRE_LEGGINGS,
        EnrichedItems.SAPPHIRE_BOOTS);

    this.registerArmorModels(
        itemModelGenerator,
        EnrichedItems.TANZANITE_HELMET,
        EnrichedItems.TANZANITE_CHESTPLATE,
        EnrichedItems.TANZANITE_LEGGINGS,
        EnrichedItems.TANZANITE_BOOTS);

    this.registerArmorModels(
        itemModelGenerator,
        EnrichedItems.STEEL_HELMET,
        EnrichedItems.STEEL_CHESTPLATE,
        EnrichedItems.STEEL_LEGGINGS,
        EnrichedItems.STEEL_BOOTS);

    this.registerArmorModels(
        itemModelGenerator,
        EnrichedItems.OBSIDIAN_HELMET,
        EnrichedItems.OBSIDIAN_CHESTPLATE,
        EnrichedItems.OBSIDIAN_LEGGINGS,
        EnrichedItems.OBSIDIAN_BOOTS);

    this.registerArmorModels(
        itemModelGenerator,
        EnrichedItems.EMERALD_HELMET,
        EnrichedItems.EMERALD_CHESTPLATE,
        EnrichedItems.EMERALD_LEGGINGS,
        EnrichedItems.EMERALD_BOOTS);

    this.registerArmorModels(
            itemModelGenerator,
            EnrichedItems.BRONZE_HELMET,
            EnrichedItems.BRONZE_CHESTPLATE,
            EnrichedItems.BRONZE_LEGGINGS,
            EnrichedItems.BRONZE_BOOTS);

    /*------------*/
    /* -- Food -- */
    /*------------*/

    itemModelGenerator.generateFlatItem(EnrichedItems.BEEF_STEW, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(EnrichedItems.BERRY_JUICE, ModelTemplates.FLAT_ITEM);
  }

  private void registerToolModels(
      ItemModelGenerators itemModelGenerator,
      Item sword,
      Item shovel,
      Item pickaxe,
      Item axe,
      Item hoe) {
    itemModelGenerator.generateFlatItem(sword, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(shovel, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(pickaxe, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(axe, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(hoe, ModelTemplates.FLAT_ITEM);
  }

  private void registerArmorModels(
      ItemModelGenerators itemModelGenerator,
      ArmorItem helmet,
      ArmorItem chestplate,
      ArmorItem leggings,
      ArmorItem boots) {
    itemModelGenerator.generateArmorTrims(helmet);
    itemModelGenerator.generateArmorTrims(chestplate);
    itemModelGenerator.generateArmorTrims(leggings);
    itemModelGenerator.generateArmorTrims(boots);
  }
}
