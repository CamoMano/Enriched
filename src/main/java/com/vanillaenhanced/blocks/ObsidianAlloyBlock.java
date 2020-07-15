package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import static net.minecraft.sound.BlockSoundGroup.METAL;

public class ObsidianAlloyBlock extends Block {
    public ObsidianAlloyBlock() {
        super(FabricBlockSettings.copy(Blocks.OBSIDIAN).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).sounds(METAL).strength(40.0f,1000.0f).build());
    }
}
