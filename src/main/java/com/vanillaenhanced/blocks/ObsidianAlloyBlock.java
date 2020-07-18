package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;


import static net.minecraft.sound.BlockSoundGroup.METAL;

public class ObsidianAlloyBlock extends Block {
    public ObsidianAlloyBlock() {
        super(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(METAL).strength(40.0f,1000.0f));
    }
}
