package com.enrichedmc.enriched.item.food;

import net.minecraft.component.type.FoodComponent;

public class EnrichedFoodComponents
{
    public static final FoodComponent BEEF_STEW = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(14.0f)
            .build();

    public static final FoodComponent BERRY_JUICE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.8f)
            .build();
}
