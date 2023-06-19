package com.enrichedmc.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.TrapdoorBlock;

public class WoodTrapdoorBase extends TrapdoorBlock {
    public WoodTrapdoorBase(AbstractBlock copy, BlockSetType blockSetType) {
        super(FabricBlockSettings.copy(copy), blockSetType);
    }
}
