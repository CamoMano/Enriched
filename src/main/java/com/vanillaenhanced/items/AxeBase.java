package com.vanillaenhanced.items;


import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {
	public AxeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1,3, -3.0f,new Settings().group(ItemGroup.TOOLS) );
    }
}
