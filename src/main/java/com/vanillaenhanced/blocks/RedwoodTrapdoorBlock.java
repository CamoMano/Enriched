
package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.TrapdoorBlock;

public class RedwoodTrapdoorBlock extends TrapdoorBlock {

	public RedwoodTrapdoorBlock(String name, AbstractBlock copy) {
		super(FabricBlockSettings.copy(copy));
	}
}
