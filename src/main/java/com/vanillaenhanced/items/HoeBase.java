package com.vanillaenhanced.items;



import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {
	public HoeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1,0.0f, new Settings().group(ItemGroup.TOOLS) );
    }

}
