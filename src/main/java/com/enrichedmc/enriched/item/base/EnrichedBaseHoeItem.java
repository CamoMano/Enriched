package com.enrichedmc.enriched.item.base;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;

public class EnrichedBaseHoeItem extends HoeItem {
  public EnrichedBaseHoeItem(Tier toolMaterial) {
    super(
        toolMaterial,
        new Properties()
            .stacksTo(1)
            .attributes(HoeItem.createAttributes(toolMaterial, -4, 0.0f)));
  }
}
