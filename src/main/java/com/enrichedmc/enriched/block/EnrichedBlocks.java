package com.enrichedmc.enriched.block;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.ItemGroups;
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
    }

    public static void registerBlocks()
    {
        EnrichedMod.LOGGER.info("Registering Enriched's blocks...");
    }
}
