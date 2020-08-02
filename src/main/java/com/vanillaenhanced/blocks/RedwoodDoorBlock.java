
package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.DoorBlock;

public class RedwoodDoorBlock extends DoorBlock {

	public RedwoodDoorBlock(String name, AbstractBlock copy) {
		super(FabricBlockSettings.copy(copy));
	}
}
