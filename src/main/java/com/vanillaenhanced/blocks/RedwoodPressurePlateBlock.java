

package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.PressurePlateBlock;


public class RedwoodPressurePlateBlock extends PressurePlateBlock {

	public RedwoodPressurePlateBlock(String name, AbstractBlock copy) {
		super(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copy(copy));
	}

}
