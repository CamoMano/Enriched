package com.enrichedmc.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem
{
    public HoeBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, new Settings().attributeModifiers(HoeItem.createAttributeModifiers(toolMaterial_1, -4, 0.0f)));
    }
}