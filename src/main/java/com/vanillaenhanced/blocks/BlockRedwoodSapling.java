package com.vanillaenhanced.blocks;

import com.vanillaenhanced.world.feature.tree.RedwoodSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.sound.BlockSoundGroup;

public class BlockRedwoodSapling extends SaplingBlock {
    public BlockRedwoodSapling() {
        super(new RedwoodSaplingGenerator(), FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.GRASS).noCollision().ticksRandomly().breakInstantly());
    }
}
