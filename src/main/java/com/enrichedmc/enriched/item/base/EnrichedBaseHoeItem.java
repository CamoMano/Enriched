package com.enrichedmc.enriched.item.base;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class EnrichedBaseHoeItem extends HoeItem
{
    public EnrichedBaseHoeItem(ToolMaterial toolMaterial)
    {
        super(toolMaterial, new Settings()
                .maxCount(1)
                .attributeModifiers(HoeItem.createAttributeModifiers(toolMaterial, -4, 0.0f)));
    }
}
