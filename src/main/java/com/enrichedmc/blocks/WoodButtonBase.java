package com.enrichedmc.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.WoodenButtonBlock;

public class WoodButtonBase extends WoodenButtonBlock {
    public WoodButtonBase(AbstractBlock copy) {
        super(FabricBlockSettings.copy(copy));
    }
}
