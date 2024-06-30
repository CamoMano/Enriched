package com.enrichedmc.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem
{
    public AxeBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, new Settings().attributeModifiers(AxeItem.createAttributeModifiers(toolMaterial_1, 3, -3.0f)));
    }
}
