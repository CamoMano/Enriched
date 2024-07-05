package com.enrichedmc.enriched.item.base;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class EnrichedBaseAxeItem extends AxeItem {
  public EnrichedBaseAxeItem(ToolMaterial toolMaterial) {
    super(
        toolMaterial,
        new Settings()
            .maxCount(1)
            .attributeModifiers(AxeItem.createAttributeModifiers(toolMaterial, 3.0f, -3.0f)));
  }
}
