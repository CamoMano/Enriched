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

        EnrichedRegisters.registerItemToItemGroup(RUBY, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerItemToItemGroup(SAPPHIRE, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerItemToItemGroup(TANZANITE, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerItemToItemGroup(STEEL_BLEND, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerItemToItemGroup(STEEL_INGOT, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerItemToItemGroup(OBSIDIAN_ALL0Y_BLEND, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerItemToItemGroup(OBSIDIAN_ALL0Y_INGOT, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerItemToItemGroup(HONEY_BALL, ItemGroups.INGREDIENTS);

        EnrichedRegisters.registerItemToItemGroup(BEEF_STEW, ItemGroups.FOOD_AND_DRINK);
        EnrichedRegisters.registerItemToItemGroup(BERRY_JUICE, ItemGroups.FOOD_AND_DRINK);
    }

    // (Ayydxn) The point of this method is just to get the JVM load this class into memory and thus invoke the static block above.
    public static void registerItems()
    {
        EnrichedMod.LOGGER.info("Registering Enriched's items...");
    }
}
