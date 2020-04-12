package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

public class SteelBlock extends Block {
    public SteelBlock() {
        super(FabricBlockSettings.copy(Blocks.IRON_BLOCK).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.METAL).strength(6.0f,7.0f).build());
    }
}
