package com.enrichedmc.enriched.item.base;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class EnrichedBaseSwordItem extends SwordItem {
  public EnrichedBaseSwordItem(Tier toolMaterial) {
    super(
        toolMaterial,
        new Properties()
            .stacksTo(1)
            .attributes(SwordItem.createAttributes(toolMaterial, -1, -2.4f)));
  }
}
