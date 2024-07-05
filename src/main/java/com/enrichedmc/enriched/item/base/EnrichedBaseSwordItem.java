package com.enrichedmc.enriched.item.base;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class EnrichedBaseSwordItem extends SwordItem {
  public EnrichedBaseSwordItem(ToolMaterial toolMaterial) {
    super(
        toolMaterial,
        new Settings()
            .maxCount(1)
            .attributeModifiers(SwordItem.createAttributeModifiers(toolMaterial, -1, -2.4f)));
  }
}
