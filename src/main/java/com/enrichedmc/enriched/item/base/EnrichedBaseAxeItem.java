package com.enrichedmc.enriched.item.base;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;

public class EnrichedBaseAxeItem extends AxeItem {
  public EnrichedBaseAxeItem(Tier toolMaterial) {
    super(
        toolMaterial,
        new Properties()
            .stacksTo(1)
            .attributes(AxeItem.createAttributes(toolMaterial, 2.0f, -3.0f)));
  }
}
