package com.enrichedmc.enriched.block;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.enrichedmc.enriched.world.tree.EnrichedSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroups;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class EnrichedBlocks
{
    public static final Block RUBY_BLOCK;
    public static final Block RUBY_ORE;
    public static final Block DEEPSLATE_RUBY_ORE;
    public static final Block SAPPHIRE_BLOCK;
    public static final Block SAPPHIRE_ORE;
    public static final Block DEEPSLATE_SAPPHIRE_ORE;
    public static final Block TANZANITE_BLOCK;
    public static final Block TANZANITE_ORE;
    public static final Block DEEPSLATE_TANZANITE_ORE;
    public static final Block STEEL_BLOCK;
    public static final Block OBSIDIAN_ALLOY_BLOCK;

    public static final Block REDWOOD_LOG;
    public static final Block REDWOOD_WOOD;
    public static final Block STRIPPED_REDWOOD_LOG;
    public static final Block STRIPPED_REDWOOD_WOOD;
    public static final Block REDWOOD_PLANKS;
    public static final Block REDWOOD_LEAVES;
    public static final Block REDWOOD_SAPLING;

    public static final Block DARK_GRANITE;

    static
    {
        RUBY_BLOCK = EnrichedRegisters.registerBlock("ruby_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
        RUBY_ORE = EnrichedRegisters.registerBlock("ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
        DEEPSLATE_RUBY_ORE = EnrichedRegisters.registerBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

        SAPPHIRE_BLOCK = EnrichedRegisters.registerBlock("sapphire_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
        SAPPHIRE_ORE = EnrichedRegisters.registerBlock("sapphire_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
        DEEPSLATE_SAPPHIRE_ORE = EnrichedRegisters.registerBlock("deepslate_sapphire_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

        TANZANITE_BLOCK = EnrichedRegisters.registerBlock("tanzanite_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
        TANZANITE_ORE = EnrichedRegisters.registerBlock("tanzanite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));
        DEEPSLATE_TANZANITE_ORE = EnrichedRegisters.registerBlock("deepslate_tanzanite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.STONE)));

        STEEL_BLOCK = EnrichedRegisters.registerBlock("steel_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
        OBSIDIAN_ALLOY_BLOCK = EnrichedRegisters.registerBlock("obsidian_alloy_block", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

        REDWOOD_LOG = EnrichedRegisters.registerBlock("redwood_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG)
                .strength(2.0f)
                .sounds(BlockSoundGroup.WOOD)));

        REDWOOD_WOOD = EnrichedRegisters.registerBlock("redwood_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)
                .strength(2.0f)
                .sounds(BlockSoundGroup.WOOD)));

        STRIPPED_REDWOOD_LOG = EnrichedRegisters.registerBlock("stripped_redwood_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG)
                .strength(2.0f)
                .sounds(BlockSoundGroup.WOOD)));

        STRIPPED_REDWOOD_WOOD = EnrichedRegisters.registerBlock("stripped_redwood_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)
                .strength(2.0f)
                .sounds(BlockSoundGroup.WOOD)));

        REDWOOD_PLANKS = EnrichedRegisters.registerBlock("redwood_planks", new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)
                .strength(2.0f, 3.0f)
                .sounds(BlockSoundGroup.WOOD)));

        REDWOOD_LEAVES = EnrichedRegisters.registerBlock("redwood_leaves", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LEAVES)
                .strength(0.2f)
                .nonOpaque()));

        REDWOOD_SAPLING = EnrichedRegisters.registerBlock("redwood_sapling", new SaplingBlock(EnrichedSaplingGenerators.REDWOOD,
                AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

        DARK_GRANITE = EnrichedRegisters.registerBlock("dark_granite", new Block(AbstractBlock.Settings.copy(Blocks.GRANITE)
                .strength(1.5f, 6.0f)
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()));

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

        EnrichedRegisters.registerToItemGroup(STEEL_BLOCK, ItemGroups.BUILDING_BLOCKS);
        EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_BLOCK, ItemGroups.BUILDING_BLOCKS);

        EnrichedRegisters.registerToItemGroup(REDWOOD_LOG, ItemGroups.BUILDING_BLOCKS);
        EnrichedRegisters.registerToItemGroup(REDWOOD_WOOD, ItemGroups.BUILDING_BLOCKS);
        EnrichedRegisters.registerToItemGroup(STRIPPED_REDWOOD_LOG, ItemGroups.BUILDING_BLOCKS);
        EnrichedRegisters.registerToItemGroup(STRIPPED_REDWOOD_WOOD, ItemGroups.BUILDING_BLOCKS);
        EnrichedRegisters.registerToItemGroup(REDWOOD_PLANKS, ItemGroups.BUILDING_BLOCKS);
        EnrichedRegisters.registerToItemGroup(REDWOOD_LEAVES, ItemGroups.NATURAL);
        EnrichedRegisters.registerToItemGroup(REDWOOD_SAPLING, ItemGroups.NATURAL);

        EnrichedRegisters.registerToItemGroup(DARK_GRANITE, ItemGroups.BUILDING_BLOCKS);
    }

    public static void registerBlocks()
    {
        EnrichedMod.LOGGER.info("Registering Enriched's blocks...");
    }
}
