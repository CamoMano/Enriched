

package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.WoodButtonBlock;


public class RedwoodButtonBlock extends WoodButtonBlock {

	public RedwoodButtonBlock(String name, AbstractBlock copy) {
		super(FabricBlockSettings.copy(copy));
	}
}
