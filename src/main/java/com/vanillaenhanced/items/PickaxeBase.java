package com.vanillaenhanced.items;


import net.minecraft.item.*;


import java.util.List;

public class PickaxeBase extends PickaxeItem {
	public PickaxeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1,-1, -2.8f,new Item.Settings().group(ItemGroup.TOOLS) );
    }
}
