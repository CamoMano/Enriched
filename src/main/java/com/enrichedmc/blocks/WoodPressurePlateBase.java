package com.enrichedmc.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.PressurePlateBlock;

public class WoodPressurePlateBase extends PressurePlateBlock {
  public WoodPressurePlateBase(AbstractBlock copy, BlockSetType blockSetType) {
    super(
        PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(copy), blockSetType);
  }
}
