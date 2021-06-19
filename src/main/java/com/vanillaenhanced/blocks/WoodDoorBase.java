package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.DoorBlock;

public class WoodDoorBase extends DoorBlock {
    public WoodDoorBase(AbstractBlock copy) {
        super(FabricBlockSettings.copy(copy));
    }
}
