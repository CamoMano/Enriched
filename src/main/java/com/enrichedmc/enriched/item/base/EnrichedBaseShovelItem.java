package com.enrichedmc.enriched.item.base;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class EnrichedBaseShovelItem extends ShovelItem {
  public EnrichedBaseShovelItem(ToolMaterial toolMaterial) {
    super(
        toolMaterial,
        new Settings()
            .maxCount(1)
            .attributeModifiers(ShovelItem.createAttributeModifiers(toolMaterial, -1.0f, -3.0f)));
  }
}
