package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import java.util.Optional;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class EnrichedModelProvider extends FabricModelProvider {
  public EnrichedModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    BlockStateModelGenerator.BlockTexturePool redwoodTexturePool =
        blockStateModelGenerator.registerCubeAllModelTexturePool(EnrichedBlocks.REDWOOD_PLANKS);
    BlockStateModelGenerator.BlockTexturePool darkGraniteTexturePool =
        blockStateModelGenerator.registerCubeAllModelTexturePool(EnrichedBlocks.DARK_GRANITE);
    BlockStateModelGenerator.BlockTexturePool polishedDarkGraniteTexturePool =
        blockStateModelGenerator.registerCubeAllModelTexturePool(
            EnrichedBlocks.POLISHED_DARK_GRANITE);
    BlockStateModelGenerator.BlockTexturePool marbleTexturePool =
        blockStateModelGenerator.registerCubeAllModelTexturePool(EnrichedBlocks.MARBLE);
    BlockStateModelGenerator.BlockTexturePool polishedMarbleTexturePool =
        blockStateModelGenerator.registerCubeAllModelTexturePool(EnrichedBlocks.POLISHED_MARBLE);

    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.RUBY_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.RUBY_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.DEEPSLATE_RUBY_ORE);

    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.SAPPHIRE_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.SAPPHIRE_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE);

    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.TANZANITE_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.TANZANITE_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE);

    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.STEEL_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);

    blockStateModelGenerator
        .registerLog(EnrichedBlocks.REDWOOD_LOG)
        .log(EnrichedBlocks.REDWOOD_LOG)
        .wood(EnrichedBlocks.REDWOOD_WOOD);

    blockStateModelGenerator
        .registerLog(EnrichedBlocks.STRIPPED_REDWOOD_LOG)
        .log(EnrichedBlocks.STRIPPED_REDWOOD_LOG)
        .wood(EnrichedBlocks.STRIPPED_REDWOOD_WOOD);

    blockStateModelGenerator.registerSingleton(EnrichedBlocks.REDWOOD_LEAVES, TexturedModel.LEAVES);
    blockStateModelGenerator.registerFlowerPotPlant(
        EnrichedBlocks.REDWOOD_SAPLING,
        EnrichedBlocks.POTTED_REDWOOD_SAPLING,
        BlockStateModelGenerator.TintType.NOT_TINTED);

    redwoodTexturePool.button(EnrichedBlocks.REDWOOD_BUTTON);
    blockStateModelGenerator.registerDoor(EnrichedBlocks.REDWOOD_DOOR);
    redwoodTexturePool.pressurePlate(EnrichedBlocks.REDWOOD_PRESSURE_PLATE);
    blockStateModelGenerator.registerTrapdoor(EnrichedBlocks.REDWOOD_TRAPDOOR);
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
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    /*-------------*/
    /* -- Items -- */
    /*-------------*/

    itemModelGenerator.register(EnrichedItems.RUBY, Models.GENERATED);
    itemModelGenerator.register(EnrichedItems.SAPPHIRE, Models.GENERATED);
    itemModelGenerator.register(EnrichedItems.TANZANITE, Models.GENERATED);
    itemModelGenerator.register(EnrichedItems.STEEL_BLEND, Models.GENERATED);
    itemModelGenerator.register(EnrichedItems.STEEL_INGOT, Models.GENERATED);
    itemModelGenerator.register(EnrichedItems.OBSIDIAN_ALLOY_BLEND, Models.GENERATED);
    itemModelGenerator.register(EnrichedItems.OBSIDIAN_ALLOY_INGOT, Models.GENERATED);
    itemModelGenerator.register(EnrichedItems.HONEY_BALL, Models.GENERATED);
    itemModelGenerator.register(
        EnrichedItems.HONEY_SLIME_SPAWN_EGG,
        new Model(Optional.of(Identifier.ofVanilla("item/template_spawn_egg")), Optional.empty()));

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

    /*------------*/
    /* -- Food -- */
    /*------------*/

    itemModelGenerator.register(EnrichedItems.BEEF_STEW, Models.GENERATED);
    itemModelGenerator.register(EnrichedItems.BERRY_JUICE, Models.GENERATED);
  }

  private void registerToolModels(
      ItemModelGenerator itemModelGenerator,
      Item sword,
      Item shovel,
      Item pickaxe,
      Item axe,
      Item hoe) {
    itemModelGenerator.register(sword, Models.GENERATED);
    itemModelGenerator.register(shovel, Models.GENERATED);
    itemModelGenerator.register(pickaxe, Models.GENERATED);
    itemModelGenerator.register(axe, Models.GENERATED);
    itemModelGenerator.register(hoe, Models.GENERATED);
  }

  private void registerArmorModels(
      ItemModelGenerator itemModelGenerator,
      ArmorItem helmet,
      ArmorItem chestplate,
      ArmorItem leggings,
      ArmorItem boots) {
    itemModelGenerator.registerArmor(helmet);
    itemModelGenerator.registerArmor(chestplate);
    itemModelGenerator.registerArmor(leggings);
    itemModelGenerator.registerArmor(boots);
  }
}
