package com.enrichedmc.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.PressurePlateBlock;

public class WoodPressurePlateBase extends PressurePlateBlock
{
    public WoodPressurePlateBase(AbstractBlock copy, BlockSetType blockSetType)
    {
        //
        super(
                blockSetType, AbstractBlock.Settings.copy(copy));
    }
}
