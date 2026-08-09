package com.enrichedmc.enriched.item.food;

import net.minecraft.world.food.FoodProperties;

public class EnrichedFoodComponents {
  public static final FoodProperties BEEF_STEW =
      new FoodProperties.Builder().nutrition(12).saturationModifier(14.0f).build();

  public static final FoodProperties BERRY_JUICE =
      new FoodProperties.Builder().nutrition(4).saturationModifier(0.8f).build();
}
