package com.enrichedmc.enriched.item.base;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class EnrichedBasePickaxeItem extends PickaxeItem {
  public EnrichedBasePickaxeItem(Tier toolMaterial) {
    super(
        toolMaterial,
        new Properties()
            .stacksTo(1)
            .attributes(PickaxeItem.createAttributes(toolMaterial, -1.0f, -2.8f)));
  }
}
