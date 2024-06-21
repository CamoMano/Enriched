package com.enrichedmc.items;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem
{
    public SwordBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, new Settings().attributeModifiers(SwordItem.createAttributeModifiers(toolMaterial_1, 1, -2.4f)));
    }
}
