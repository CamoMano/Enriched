package com.vanillaenhanced.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {
    public ShovelBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -1, -3.0f, new Settings().group(ItemGroup.TOOLS));
    }
}
