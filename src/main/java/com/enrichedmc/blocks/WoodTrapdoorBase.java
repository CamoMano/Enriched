package com.enrichedmc.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.TrapdoorBlock;

public class WoodTrapdoorBase extends TrapdoorBlock
{
    public WoodTrapdoorBase(AbstractBlock copy, BlockSetType blockSetType)
    {
        super(blockSetType, AbstractBlock.Settings.copy(copy));
    }
}
