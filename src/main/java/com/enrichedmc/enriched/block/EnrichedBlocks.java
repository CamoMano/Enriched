package com.enrichedmc.enriched.block;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.enrichedmc.enriched.world.tree.EnrichedSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

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
            "ruby_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    RUBY_ORE =
        EnrichedRegisters.registerBlock(
            "ruby_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
    DEEPSLATE_RUBY_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_ruby_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

    SAPPHIRE_BLOCK =
        EnrichedRegisters.registerBlock(
            "sapphire_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    SAPPHIRE_ORE =
        EnrichedRegisters.registerBlock(
            "sapphire_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
    DEEPSLATE_SAPPHIRE_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_sapphire_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

    TANZANITE_BLOCK =
        EnrichedRegisters.registerBlock(
            "tanzanite_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    TANZANITE_ORE =
        EnrichedRegisters.registerBlock(
            "tanzanite_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
    DEEPSLATE_TANZANITE_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_tanzanite_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

    TIN_BLOCK =
        EnrichedRegisters.registerBlock(
            "tin_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    BRONZE_BLOCK =
        EnrichedRegisters.registerBlock(
            "bronze_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    RAW_TIN_BLOCK =
        EnrichedRegisters.registerBlock(
            "raw_tin_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    TIN_ORE =
        EnrichedRegisters.registerBlock(
            "tin_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
    DEEPSLATE_TIN_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_tin_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

    STEEL_BLOCK =
        EnrichedRegisters.registerBlock(
            "steel_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    OBSIDIAN_ALLOY_BLOCK =
        EnrichedRegisters.registerBlock(
            "obsidian_alloy_block", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    AMBER_BLOCK =
        EnrichedRegisters.registerBlock(
            "amber_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    AMBER_ORE =
        EnrichedRegisters.registerBlock(
            "amber_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
    DEEPSLATE_AMBER_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_amber_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

    TOPAZ_BLOCK =
        EnrichedRegisters.registerBlock(
            "topaz_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    TOPAZ_ORE =
        EnrichedRegisters.registerBlock(
            "topaz_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
    DEEPSLATE_TOPAZ_ORE =
        EnrichedRegisters.registerBlock(
            "deepslate_topaz_ore",
            new ExperienceDroppingBlock(
                UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

    REDWOOD_LOG =
        EnrichedRegisters.registerBlock(
            "redwood_log",
            new PillarBlock(
                AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    REDWOOD_WOOD =
        EnrichedRegisters.registerBlock(
            "redwood_wood",
            new PillarBlock(
                AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    STRIPPED_REDWOOD_LOG =
        EnrichedRegisters.registerBlock(
            "stripped_redwood_log",
            new PillarBlock(
                AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    STRIPPED_REDWOOD_WOOD =
        EnrichedRegisters.registerBlock(
            "stripped_redwood_wood",
            new PillarBlock(
                AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    REDWOOD_PLANKS =
        EnrichedRegisters.registerBlock(
            "redwood_planks",
            new Block(
                AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2.0f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    REDWOOD_LEAVES =
        EnrichedRegisters.registerBlock(
            "redwood_leaves",
            new LeavesBlock(
                AbstractBlock.Settings.copy(Blocks.SPRUCE_LEAVES).strength(0.2f).nonOpaque()));

    REDWOOD_SAPLING =
        EnrichedRegisters.registerBlock(
            "redwood_sapling",
            new SaplingBlock(
                EnrichedSaplingGenerators.REDWOOD,
                AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    POTTED_REDWOOD_SAPLING =
        EnrichedRegisters.registerBlock(
            "potted_redwood_sapling",
            new FlowerPotBlock(
                REDWOOD_SAPLING,
                AbstractBlock.Settings.copy(Blocks.POTTED_SPRUCE_SAPLING).nonOpaque()));

    REDWOOD_BUTTON =
        EnrichedRegisters.registerBlock(
            "redwood_button",
            new ButtonBlock(
                BlockSetType.SPRUCE, 4, AbstractBlock.Settings.copy(Blocks.SPRUCE_BUTTON)));

    REDWOOD_DOOR =
        EnrichedRegisters.registerBlock(
            "redwood_door",
            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(REDWOOD_PLANKS)));

    REDWOOD_PRESSURE_PLATE =
        EnrichedRegisters.registerBlock(
            "redwood_pressure_plate",
            new PressurePlateBlock(
                BlockSetType.SPRUCE, AbstractBlock.Settings.copy(REDWOOD_PLANKS)));

    REDWOOD_TRAPDOOR =
        EnrichedRegisters.registerBlock(
            "redwood_trapdoor",
            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(REDWOOD_PLANKS)));

    REDWOOD_SLAB =
        EnrichedRegisters.registerBlock(
            "redwood_slab",
            new SlabBlock(
                AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0f, 2.0f)));

    REDWOOD_STAIRS =
        EnrichedRegisters.registerBlock(
            "redwood_stairs",
            new StairsBlock(
                REDWOOD_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(REDWOOD_PLANKS)));

    REDWOOD_FENCE =
        EnrichedRegisters.registerBlock(
            "redwood_fence",
            new FenceBlock(
                AbstractBlock.Settings.copy(Blocks.SPRUCE_FENCE_GATE)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0f, 3.0f)));

    REDWOOD_FENCE_GATE =
        EnrichedRegisters.registerBlock(
            "redwood_fence_gate",
            new FenceGateBlock(
                WoodType.SPRUCE,
                AbstractBlock.Settings.copy(Blocks.SPRUCE_FENCE_GATE)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0f, 3.0f)));

    DARK_GRANITE =
        EnrichedRegisters.registerBlock(
            "dark_granite",
            new Block(
                AbstractBlock.Settings.copy(Blocks.GRANITE)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    DARK_GRANITE_SLAB =
        EnrichedRegisters.registerBlock(
            "dark_granite_slab",
            new SlabBlock(
                AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    DARK_GRANITE_STAIRS =
        EnrichedRegisters.registerBlock(
            "dark_granite_stairs",
            new StairsBlock(
                DARK_GRANITE.getDefaultState(), AbstractBlock.Settings.copy(DARK_GRANITE)));

    DARK_GRANITE_WALL =
        EnrichedRegisters.registerBlock(
            "dark_granite_wall", new WallBlock(AbstractBlock.Settings.copy(DARK_GRANITE)));

    POLISHED_DARK_GRANITE =
        EnrichedRegisters.registerBlock(
            "polished_dark_granite",
            new Block(
                AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    POLISHED_DARK_GRANITE_SLAB =
        EnrichedRegisters.registerBlock(
            "polished_dark_granite_slab",
            new SlabBlock(
                AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    POLISHED_DARK_GRANITE_STAIRS =
        EnrichedRegisters.registerBlock(
            "polished_dark_granite_stairs",
            new StairsBlock(
                POLISHED_DARK_GRANITE.getDefaultState(),
                AbstractBlock.Settings.copy(POLISHED_DARK_GRANITE)));

    MARBLE =
        EnrichedRegisters.registerBlock(
            "marble",
            new Block(
                AbstractBlock.Settings.copy(Blocks.GRANITE)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    MARBLE_SLAB =
        EnrichedRegisters.registerBlock(
            "marble_slab",
            new SlabBlock(
                AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    MARBLE_STAIRS =
        EnrichedRegisters.registerBlock(
            "marble_stairs",
            new StairsBlock(MARBLE.getDefaultState(), AbstractBlock.Settings.copy(MARBLE)));

    MARBLE_WALL =
        EnrichedRegisters.registerBlock(
            "marble_wall", new WallBlock(AbstractBlock.Settings.copy(MARBLE)));

    POLISHED_MARBLE =
        EnrichedRegisters.registerBlock(
            "polished_marble",
            new Block(
                AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    POLISHED_MARBLE_SLAB =
        EnrichedRegisters.registerBlock(
            "polished_marble_slab",
            new SlabBlock(
                AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    POLISHED_MARBLE_STAIRS =
        EnrichedRegisters.registerBlock(
            "polished_marble_stairs",
            new StairsBlock(
                POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_MARBLE)));

    /*-------------------------------*/
    /* -- Item Group Registration -- */
    /*-------------------------------*/

    EnrichedRegisters.registerToItemGroup(RUBY_BLOCK, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(RUBY_ORE, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_RUBY_ORE, ItemGroups.NATURAL);

    EnrichedRegisters.registerToItemGroup(SAPPHIRE_BLOCK, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(SAPPHIRE_ORE, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_SAPPHIRE_ORE, ItemGroups.NATURAL);

    EnrichedRegisters.registerToItemGroup(TANZANITE_BLOCK, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(TANZANITE_ORE, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_TANZANITE_ORE, ItemGroups.NATURAL);

    EnrichedRegisters.registerToItemGroup(AMBER_BLOCK, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(AMBER_ORE, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_AMBER_ORE, ItemGroups.NATURAL);

    EnrichedRegisters.registerToItemGroup(TOPAZ_BLOCK, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(TOPAZ_ORE, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_TOPAZ_ORE, ItemGroups.NATURAL);

    EnrichedRegisters.registerToItemGroup(TIN_BLOCK, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(TIN_ORE, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(DEEPSLATE_TIN_ORE, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(RAW_TIN_BLOCK, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(BRONZE_BLOCK, ItemGroups.BUILDING_BLOCKS);



    EnrichedRegisters.registerToItemGroup(STEEL_BLOCK, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_BLOCK, ItemGroups.BUILDING_BLOCKS);

    EnrichedRegisters.registerToItemGroup(REDWOOD_LOG, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_WOOD, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(STRIPPED_REDWOOD_LOG, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(STRIPPED_REDWOOD_WOOD, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_PLANKS, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_LEAVES, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(REDWOOD_SAPLING, ItemGroups.NATURAL);
    EnrichedRegisters.registerToItemGroup(REDWOOD_BUTTON, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_DOOR, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_PRESSURE_PLATE, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_TRAPDOOR, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_SLAB, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_STAIRS, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_FENCE, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(REDWOOD_FENCE_GATE, ItemGroups.BUILDING_BLOCKS);

    EnrichedRegisters.registerToItemGroup(DARK_GRANITE, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DARK_GRANITE_SLAB, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DARK_GRANITE_STAIRS, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(DARK_GRANITE_WALL, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_DARK_GRANITE, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_DARK_GRANITE_SLAB, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_DARK_GRANITE_STAIRS, ItemGroups.BUILDING_BLOCKS);

    EnrichedRegisters.registerToItemGroup(MARBLE, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(MARBLE_SLAB, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(MARBLE_STAIRS, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(MARBLE_WALL, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_MARBLE, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_MARBLE_SLAB, ItemGroups.BUILDING_BLOCKS);
    EnrichedRegisters.registerToItemGroup(POLISHED_MARBLE_STAIRS, ItemGroups.BUILDING_BLOCKS);
  }

  public static void registerBlocks() {
    EnrichedMod.LOGGER.info("Registering Enriched's blocks...");
  }
}
