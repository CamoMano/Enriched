package com.enrichedmc.enriched.block;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.enrichedmc.enriched.world.tree.EnrichedSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class EnrichedBlocks {
  public static final Block RUBY_BLOCK;
  public static final Block RUBY_ORE;
  public static final Block DEEPSLATE_RUBY_ORE;
  public static final Block SAPPHIRE_BLOCK;
  public static final Block SAPPHIRE_ORE;
  public static final Block DEEPSLATE_SAPPHIRE_ORE;
  public static final Block TANZANITE_BLOCK;
  public static final Block TANZANITE_ORE;
  public static final Block DEEPSLATE_TANZANITE_ORE;

  public static final Block AMBER_BLOCK;
  public static final Block AMBER_ORE;
  public static final Block DEEPSLATE_AMBER_ORE;

  public static final Block TOPAZ_BLOCK;
  public static final Block TOPAZ_ORE;
  public static final Block DEEPSLATE_TOPAZ_ORE;

  public static final Block TIN_BLOCK;

  public static final Block RAW_TIN_BLOCK;
  public static final Block TIN_ORE;
  public static final Block DEEPSLATE_TIN_ORE;

  public static final Block BRONZE_BLOCK;
  public static final Block STEEL_BLOCK;
  public static final Block OBSIDIAN_ALLOY_BLOCK;

  public static final Block REDWOOD_LOG;
  public static final Block REDWOOD_WOOD;
  public static final Block STRIPPED_REDWOOD_LOG;
  public static final Block STRIPPED_REDWOOD_WOOD;
  public static final Block REDWOOD_PLANKS;
  public static final Block REDWOOD_LEAVES;
  public static final Block REDWOOD_SAPLING;
  public static final Block POTTED_REDWOOD_SAPLING;
  public static final Block REDWOOD_BUTTON;
  public static final Block REDWOOD_DOOR;
  public static final Block REDWOOD_PRESSURE_PLATE;
  public static final Block REDWOOD_TRAPDOOR;
  public static final Block REDWOOD_SLAB;
  public static final Block REDWOOD_STAIRS;
  public static final Block REDWOOD_FENCE;
  public static final Block REDWOOD_FENCE_GATE;

  public static final Block DARK_GRANITE;
  public static final Block DARK_GRANITE_SLAB;
  public static final Block DARK_GRANITE_STAIRS;
  public static final Block DARK_GRANITE_WALL;
  public static final Block POLISHED_DARK_GRANITE;
  public static final Block POLISHED_DARK_GRANITE_SLAB;
  public static final Block POLISHED_DARK_GRANITE_STAIRS;

  public static final Block MARBLE;
  public static final Block MARBLE_SLAB;
  public static final Block MARBLE_STAIRS;
  public static final Block MARBLE_WALL;
  public static final Block POLISHED_MARBLE;
  public static final Block POLISHED_MARBLE_SLAB;
  public static final Block POLISHED_MARBLE_STAIRS;

  static {
    RUBY_BLOCK =
        EnrichedRegisters.registerBlock(
            "ruby_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    RUBY_ORE =
        EnrichedRegisters.registerBlock(
            "ruby_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    DEEPSLATE_RUBY_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_ruby_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    SAPPHIRE_BLOCK =
        EnrichedRegisters.registerBlock(
            "sapphire_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    SAPPHIRE_ORE =
        EnrichedRegisters.registerBlock(
            "sapphire_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    DEEPSLATE_SAPPHIRE_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_sapphire_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    TANZANITE_BLOCK =
        EnrichedRegisters.registerBlock(
            "tanzanite_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    TANZANITE_ORE =
        EnrichedRegisters.registerBlock(
            "tanzanite_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    DEEPSLATE_TANZANITE_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_tanzanite_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    TIN_BLOCK =
        EnrichedRegisters.registerBlock(
            "tin_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    BRONZE_BLOCK =
        EnrichedRegisters.registerBlock(
            "bronze_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    RAW_TIN_BLOCK =
        EnrichedRegisters.registerBlock(
            "raw_tin_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    TIN_ORE =
        EnrichedRegisters.registerBlock(
            "tin_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    DEEPSLATE_TIN_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_tin_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    STEEL_BLOCK =
        EnrichedRegisters.registerBlock(
            "steel_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    OBSIDIAN_ALLOY_BLOCK =
        EnrichedRegisters.registerBlock(
            "obsidian_alloy_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    AMBER_BLOCK =
        EnrichedRegisters.registerBlock(
            "amber_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    AMBER_ORE =
        EnrichedRegisters.registerBlock(
            "amber_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    DEEPSLATE_AMBER_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_amber_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    TOPAZ_BLOCK =
        EnrichedRegisters.registerBlock(
            "topaz_block", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    TOPAZ_ORE =
        EnrichedRegisters.registerBlock(
            "topaz_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    DEEPSLATE_TOPAZ_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_topaz_ore",
            new DropExperienceBlock(
                UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    REDWOOD_LOG =
        EnrichedRegisters.registerBlock(
            "redwood_log",
            new RotatedPillarBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)));

    REDWOOD_WOOD =
        EnrichedRegisters.registerBlock(
            "redwood_wood",
            new RotatedPillarBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)));

    STRIPPED_REDWOOD_LOG =
        EnrichedRegisters.registerBlock(
            "stripped_redwood_log",
            new RotatedPillarBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)));

    STRIPPED_REDWOOD_WOOD =
        EnrichedRegisters.registerBlock(
            "stripped_redwood_wood",
            new RotatedPillarBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)));

    REDWOOD_PLANKS =
        EnrichedRegisters.registerBlock(
            "redwood_planks",
            new Block(
                BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)
                    .strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    REDWOOD_LEAVES =
        EnrichedRegisters.registerBlock(
            "redwood_leaves",
            new LeavesBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).strength(0.2f).noOcclusion()));

    REDWOOD_SAPLING =
        EnrichedRegisters.registerBlock(
            "redwood_sapling",
            new SaplingBlock(
                EnrichedSaplingGenerators.REDWOOD,
                BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    POTTED_REDWOOD_SAPLING =
        EnrichedRegisters.registerBlock(
            "potted_redwood_sapling",
            new FlowerPotBlock(
                REDWOOD_SAPLING,
                BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_SPRUCE_SAPLING).noOcclusion()));

    REDWOOD_BUTTON =
        EnrichedRegisters.registerBlock(
            "redwood_button",
            new ButtonBlock(
                BlockSetType.SPRUCE, 4, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON)));

    REDWOOD_DOOR =
        EnrichedRegisters.registerBlock(
            "redwood_door",
            new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(REDWOOD_PLANKS)));

    REDWOOD_PRESSURE_PLATE =
        EnrichedRegisters.registerBlock(
            "redwood_pressure_plate",
            new PressurePlateBlock(
                BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(REDWOOD_PLANKS)));

    REDWOOD_TRAPDOOR =
        EnrichedRegisters.registerBlock(
            "redwood_trapdoor",
            new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(REDWOOD_PLANKS)));

    REDWOOD_SLAB =
        EnrichedRegisters.registerBlock(
            "redwood_slab",
            new SlabBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)
                    .sound(SoundType.WOOD)
                    .strength(2.0f, 2.0f)));

    REDWOOD_STAIRS =
        EnrichedRegisters.registerBlock(
            "redwood_stairs",
            new StairBlock(
                REDWOOD_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(REDWOOD_PLANKS)));

    REDWOOD_FENCE =
        EnrichedRegisters.registerBlock(
            "redwood_fence",
            new FenceBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE)
                    .sound(SoundType.WOOD)
                    .strength(2.0f, 3.0f)));

    REDWOOD_FENCE_GATE =
        EnrichedRegisters.registerBlock(
            "redwood_fence_gate",
            new FenceGateBlock(
                WoodType.SPRUCE,
                BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE)
                    .sound(SoundType.WOOD)
                    .strength(2.0f, 3.0f)));

    DARK_GRANITE =
        EnrichedRegisters.registerBlock(
            "dark_granite",
            new Block(
                BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    DARK_GRANITE_SLAB =
        EnrichedRegisters.registerBlock(
            "dark_granite_slab",
            new SlabBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    DARK_GRANITE_STAIRS =
        EnrichedRegisters.registerBlock(
            "dark_granite_stairs",
            new StairBlock(
                DARK_GRANITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(DARK_GRANITE)));

    DARK_GRANITE_WALL =
        EnrichedRegisters.registerBlock(
            "dark_granite_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(DARK_GRANITE)));

    POLISHED_DARK_GRANITE =
        EnrichedRegisters.registerBlock(
            "polished_dark_granite",
            new Block(
                BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    POLISHED_DARK_GRANITE_SLAB =
        EnrichedRegisters.registerBlock(
            "polished_dark_granite_slab",
            new SlabBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    POLISHED_DARK_GRANITE_STAIRS =
        EnrichedRegisters.registerBlock(
            "polished_dark_granite_stairs",
            new StairBlock(
                POLISHED_DARK_GRANITE.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(POLISHED_DARK_GRANITE)));

    MARBLE =
        EnrichedRegisters.registerBlock(
            "marble",
            new Block(
                BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    MARBLE_SLAB =
        EnrichedRegisters.registerBlock(
            "marble_slab",
            new SlabBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    MARBLE_STAIRS =
        EnrichedRegisters.registerBlock(
            "marble_stairs",
            new StairBlock(MARBLE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(MARBLE)));

    MARBLE_WALL =
        EnrichedRegisters.registerBlock(
            "marble_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(MARBLE)));

    POLISHED_MARBLE =
        EnrichedRegisters.registerBlock(
            "polished_marble",
            new Block(
                BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    POLISHED_MARBLE_SLAB =
        EnrichedRegisters.registerBlock(
            "polished_marble_slab",
            new SlabBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    POLISHED_MARBLE_STAIRS =
        EnrichedRegisters.registerBlock(
            "polished_marble_stairs",
            new StairBlock(
                POLISHED_MARBLE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_MARBLE)));

    /*-------------------------------*/
    /* -- Item Group Registration -- */
    /*-------------------------------*/

    EnrichedRegisters.registerToItemGroup(RUBY_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(RUBY_ORE, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_RUBY_ORE, CreativeModeTabs.NATURAL_BLOCKS);

    EnrichedRegisters.registerToItemGroup(SAPPHIRE_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(SAPPHIRE_ORE, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_SAPPHIRE_ORE, CreativeModeTabs.NATURAL_BLOCKS);

    EnrichedRegisters.registerToItemGroup(TANZANITE_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(TANZANITE_ORE, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_TANZANITE_ORE, CreativeModeTabs.NATURAL_BLOCKS);

    EnrichedRegisters.registerToItemGroup(AMBER_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(AMBER_ORE, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_AMBER_ORE, CreativeModeTabs.NATURAL_BLOCKS);

    EnrichedRegisters.registerToItemGroup(TOPAZ_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(TOPAZ_ORE, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_TOPAZ_ORE, CreativeModeTabs.NATURAL_BLOCKS);

    EnrichedRegisters.registerToItemGroup(TIN_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(TIN_ORE, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_TIN_ORE, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(RAW_TIN_BLOCK, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(BRONZE_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);

    EnrichedRegisters.registerToItemGroup(STEEL_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_BLOCK, CreativeModeTabs.BUILDING_BLOCKS);

    EnrichedRegisters.registerToItemGroup(REDWOOD_LOG, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_WOOD, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(STRIPPED_REDWOOD_LOG, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(STRIPPED_REDWOOD_WOOD, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_PLANKS, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_LEAVES, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_SAPLING, CreativeModeTabs.NATURAL_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_BUTTON, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_DOOR, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_PRESSURE_PLATE, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_TRAPDOOR, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_SLAB, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_STAIRS, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_FENCE, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);

    EnrichedRegisters.registerToItemGroup(DARK_GRANITE, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DARK_GRANITE_SLAB, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DARK_GRANITE_STAIRS, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DARK_GRANITE_WALL, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_DARK_GRANITE, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_DARK_GRANITE_SLAB, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_DARK_GRANITE_STAIRS, CreativeModeTabs.BUILDING_BLOCKS);

    EnrichedRegisters.registerToItemGroup(MARBLE, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(MARBLE_SLAB, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(MARBLE_STAIRS, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(MARBLE_WALL, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_MARBLE, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_MARBLE_SLAB, CreativeModeTabs.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_MARBLE_STAIRS, CreativeModeTabs.BUILDING_BLOCKS);
  }

  public static void registerBlocks() {
    EnrichedMod.LOGGER.info("Registering Enriched's blocks...");
  }
}
