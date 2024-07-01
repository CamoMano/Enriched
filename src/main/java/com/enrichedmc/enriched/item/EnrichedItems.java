package com.enrichedmc.enriched.item;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.item.food.EnrichedFoodComponents;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class EnrichedItems
{
    public static final Item RUBY;
    public static final Item SAPPHIRE;
    public static final Item TANZANITE;
    public static final Item STEEL_BLEND;
    public static final Item STEEL_INGOT;
    public static final Item OBSIDIAN_ALL0Y_BLEND;
    public static final Item OBSIDIAN_ALL0Y_INGOT;

    public static final Item HONEY_BALL;

    public static final Item BEEF_STEW;
    public static final Item BERRY_JUICE;

    static
    {
        RUBY = EnrichedRegisters.registerItem("ruby", new Item(new Item.Settings()));
        SAPPHIRE = EnrichedRegisters.registerItem("sapphire", new Item(new Item.Settings()));
        TANZANITE = EnrichedRegisters.registerItem("tanzanite", new Item(new Item.Settings()));
        STEEL_BLEND = EnrichedRegisters.registerItem("steel_blend", new Item(new Item.Settings()));
        STEEL_INGOT = EnrichedRegisters.registerItem("steel_ingot", new Item(new Item.Settings()));
        OBSIDIAN_ALL0Y_BLEND = EnrichedRegisters.registerItem("obsidian_alloy_blend", new Item(new Item.Settings()));
        OBSIDIAN_ALL0Y_INGOT = EnrichedRegisters.registerItem("obsidian_alloy_ingot", new Item(new Item.Settings()));

        HONEY_BALL = EnrichedRegisters.registerItem("honey_ball", new Item(new Item.Settings()));

        BEEF_STEW = EnrichedRegisters.registerItem("beef_stew", new Item(new Item.Settings()
                .food(EnrichedFoodComponents.BEEF_STEW)));

        BERRY_JUICE = EnrichedRegisters.registerItem("berry_juice", new Item(new Item.Settings()
                .food(EnrichedFoodComponents.BERRY_JUICE)));

        EnrichedRegisters.registerToItemGroup(RUBY, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(SAPPHIRE, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(TANZANITE, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(STEEL_BLEND, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(STEEL_INGOT, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALL0Y_BLEND, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALL0Y_INGOT, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(HONEY_BALL, ItemGroups.INGREDIENTS);

        EnrichedRegisters.registerToItemGroup(BEEF_STEW, ItemGroups.FOOD_AND_DRINK);
        EnrichedRegisters.registerToItemGroup(BERRY_JUICE, ItemGroups.FOOD_AND_DRINK);
    }

    public static void registerItems()
    {
        EnrichedMod.LOGGER.info("Registering Enriched's items...");
    }
}
