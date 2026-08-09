package com.enrichedmc.enriched.item.base;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class EnrichedBaseShovelItem extends ShovelItem {
  public EnrichedBaseShovelItem(Tier toolMaterial) {
    super(
        toolMaterial,
        new Properties()
            .stacksTo(1)
            .attributes(ShovelItem.createAttributes(toolMaterial, -1.0f, -3.0f)));
  }
}
