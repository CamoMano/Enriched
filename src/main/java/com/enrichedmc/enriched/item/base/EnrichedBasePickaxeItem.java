package com.enrichedmc.enriched.item.base;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class EnrichedBasePickaxeItem extends PickaxeItem {
  public EnrichedBasePickaxeItem(ToolMaterial toolMaterial) {
    super(
        toolMaterial,
        new Settings()
            .maxCount(1)
            .attributeModifiers(PickaxeItem.createAttributeModifiers(toolMaterial, -1.0f, -2.8f)));
  }
}
