package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class StairsBase extends StairsBlock {
    public StairsBase(BlockState state, String name, AbstractBlock copy) {
        super(state, FabricBlockSettings.copy(copy));

    }
}
