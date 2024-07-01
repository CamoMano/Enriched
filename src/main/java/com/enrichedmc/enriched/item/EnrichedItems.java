package com.enrichedmc.enriched.item;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.item.food.EnrichedFoodComponents;
import com.enrichedmc.enriched.materials.armor.EnrichedArmorMaterials;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class EnrichedItems
{
    public static final Item RUBY;
    public static final Item SAPPHIRE;
    public static final Item TANZANITE;
    public static final Item STEEL_BLEND;
    public static final Item STEEL_INGOT;
    public static final Item OBSIDIAN_ALLOY_BLEND;
    public static final Item OBSIDIAN_ALLOY_INGOT;

    public static final Item HONEY_BALL;

    public static final Item BEEF_STEW;
    public static final Item BERRY_JUICE;

    public static final ArmorItem RUBY_HELMET;
    public static final ArmorItem RUBY_CHESTPLATE;
    public static final ArmorItem RUBY_LEGGINGS;
    public static final ArmorItem RUBY_BOOTS;
    public static final ArmorItem SAPPHIRE_HELMET;
    public static final ArmorItem SAPPHIRE_CHESTPLATE;
    public static final ArmorItem SAPPHIRE_LEGGINGS;
    public static final ArmorItem SAPPHIRE_BOOTS;
    public static final ArmorItem TANZANITE_HELMET;
    public static final ArmorItem TANZANITE_CHESTPLATE;
    public static final ArmorItem TANZANITE_LEGGINGS;
    public static final ArmorItem TANZANITE_BOOTS;
    public static final ArmorItem STEEL_HELMET;
    public static final ArmorItem STEEL_CHESTPLATE;
    public static final ArmorItem STEEL_LEGGINGS;
    public static final ArmorItem STEEL_BOOTS;
    public static final ArmorItem OBSIDIAN_HELMET;
    public static final ArmorItem OBSIDIAN_CHESTPLATE;
    public static final ArmorItem OBSIDIAN_LEGGINGS;
    public static final ArmorItem OBSIDIAN_BOOTS;
    public static final ArmorItem EMERALD_HELMET;
    public static final ArmorItem EMERALD_CHESTPLATE;
    public static final ArmorItem EMERALD_LEGGINGS;
    public static final ArmorItem EMERALD_BOOTS;

    static
    {
        RUBY = EnrichedRegisters.registerItem("ruby", new Item(new Item.Settings()));
        SAPPHIRE = EnrichedRegisters.registerItem("sapphire", new Item(new Item.Settings()));
        TANZANITE = EnrichedRegisters.registerItem("tanzanite", new Item(new Item.Settings()));
        STEEL_BLEND = EnrichedRegisters.registerItem("steel_blend", new Item(new Item.Settings()));
        STEEL_INGOT = EnrichedRegisters.registerItem("steel_ingot", new Item(new Item.Settings()));
        OBSIDIAN_ALLOY_BLEND = EnrichedRegisters.registerItem("obsidian_alloy_blend", new Item(new Item.Settings()));
        OBSIDIAN_ALLOY_INGOT = EnrichedRegisters.registerItem("obsidian_alloy_ingot", new Item(new Item.Settings()));

        HONEY_BALL = EnrichedRegisters.registerItem("honey_ball", new Item(new Item.Settings()));

        /*-------------*/
        /* -- Armor -- */
        /*-------------*/

        RUBY_HELMET = (ArmorItem) EnrichedRegisters.registerItem("ruby_helmet", new ArmorItem(EnrichedArmorMaterials.RUBY, ArmorItem.Type.HELMET,
                new Item.Settings()));

        RUBY_CHESTPLATE = (ArmorItem) EnrichedRegisters.registerItem("ruby_chestplate", new ArmorItem(EnrichedArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE,
                new Item.Settings()));

        RUBY_LEGGINGS = (ArmorItem) EnrichedRegisters.registerItem("ruby_leggings", new ArmorItem(EnrichedArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS,
                new Item.Settings()));

        RUBY_BOOTS = (ArmorItem) EnrichedRegisters.registerItem("ruby_boots", new ArmorItem(EnrichedArmorMaterials.RUBY, ArmorItem.Type.BOOTS,
                new Item.Settings()));

        SAPPHIRE_HELMET = (ArmorItem) EnrichedRegisters.registerItem("sapphire_helmet", new ArmorItem(EnrichedArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET,
                new Item.Settings()));

        SAPPHIRE_CHESTPLATE = (ArmorItem) EnrichedRegisters.registerItem("sapphire_chestplate", new ArmorItem(EnrichedArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE,
                new Item.Settings()));

        SAPPHIRE_LEGGINGS = (ArmorItem) EnrichedRegisters.registerItem("sapphire_leggings", new ArmorItem(EnrichedArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS,
                new Item.Settings()));

        SAPPHIRE_BOOTS = (ArmorItem) EnrichedRegisters.registerItem("sapphire_boots", new ArmorItem(EnrichedArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS,
                new Item.Settings()));

        TANZANITE_HELMET = (ArmorItem) EnrichedRegisters.registerItem("tanzanite_helmet", new ArmorItem(EnrichedArmorMaterials.TANZANITE,
                ArmorItem.Type.HELMET, new Item.Settings()));

        TANZANITE_CHESTPLATE = (ArmorItem) EnrichedRegisters.registerItem("tanzanite_chestplate", new ArmorItem(EnrichedArmorMaterials.TANZANITE,
                ArmorItem.Type.CHESTPLATE, new Item.Settings()));

        TANZANITE_LEGGINGS = (ArmorItem) EnrichedRegisters.registerItem("tanzanite_leggings", new ArmorItem(EnrichedArmorMaterials.TANZANITE,
                ArmorItem.Type.LEGGINGS, new Item.Settings()));

        TANZANITE_BOOTS = (ArmorItem) EnrichedRegisters.registerItem("tanzanite_boots", new ArmorItem(EnrichedArmorMaterials.TANZANITE,
                ArmorItem.Type.BOOTS, new Item.Settings()));

        STEEL_HELMET = (ArmorItem) EnrichedRegisters.registerItem("steel_helmet", new ArmorItem(EnrichedArmorMaterials.STEEL, ArmorItem.Type.HELMET,
                new Item.Settings()));

        STEEL_CHESTPLATE = (ArmorItem) EnrichedRegisters.registerItem("steel_chestplate", new ArmorItem(EnrichedArmorMaterials.STEEL,
                ArmorItem.Type.CHESTPLATE, new Item.Settings()));

        STEEL_LEGGINGS = (ArmorItem) EnrichedRegisters.registerItem("steel_leggings", new ArmorItem(EnrichedArmorMaterials.STEEL,
                ArmorItem.Type.LEGGINGS, new Item.Settings()));

        STEEL_BOOTS = (ArmorItem) EnrichedRegisters.registerItem("steel_boots", new ArmorItem(EnrichedArmorMaterials.STEEL, ArmorItem.Type.BOOTS,
                new Item.Settings()));

        OBSIDIAN_HELMET = (ArmorItem) EnrichedRegisters.registerItem("obsidian_helmet", new ArmorItem(EnrichedArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET,
                new Item.Settings()));

        OBSIDIAN_CHESTPLATE = (ArmorItem) EnrichedRegisters.registerItem("obsidian_chestplate", new ArmorItem(EnrichedArmorMaterials.OBSIDIAN,
                ArmorItem.Type.CHESTPLATE, new Item.Settings()));

        OBSIDIAN_LEGGINGS = (ArmorItem) EnrichedRegisters.registerItem("obsidian_leggings", new ArmorItem(EnrichedArmorMaterials.OBSIDIAN,
                ArmorItem.Type.LEGGINGS, new Item.Settings()));

        OBSIDIAN_BOOTS = (ArmorItem) EnrichedRegisters.registerItem("obsidian_boots", new ArmorItem(EnrichedArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS,
                new Item.Settings()));

        EMERALD_HELMET = (ArmorItem) EnrichedRegisters.registerItem("emerald_helmet", new ArmorItem(EnrichedArmorMaterials.EMERALD, ArmorItem.Type.HELMET,
                new Item.Settings()));

        EMERALD_CHESTPLATE = (ArmorItem) EnrichedRegisters.registerItem("emerald_chestplate", new ArmorItem(EnrichedArmorMaterials.EMERALD,
                ArmorItem.Type.CHESTPLATE, new Item.Settings()));

        EMERALD_LEGGINGS = (ArmorItem) EnrichedRegisters.registerItem("emerald_leggings", new ArmorItem(EnrichedArmorMaterials.EMERALD,
                ArmorItem.Type.LEGGINGS, new Item.Settings()));

        EMERALD_BOOTS = (ArmorItem) EnrichedRegisters.registerItem("emerald_boots", new ArmorItem(EnrichedArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,
                new Item.Settings()));

        /*------------*/
        /* -- Food -- */
        /*------------*/

        BEEF_STEW = EnrichedRegisters.registerItem("beef_stew", new Item(new Item.Settings()
                .food(EnrichedFoodComponents.BEEF_STEW)));

        BERRY_JUICE = EnrichedRegisters.registerItem("berry_juice", new Item(new Item.Settings()
                .food(EnrichedFoodComponents.BERRY_JUICE)));

        EnrichedItems.registerItemsToItemGroups();
    }

    public static void registerItems()
    {
        EnrichedMod.LOGGER.info("Registering Enriched's items...");
    }

    private static void registerItemsToItemGroups()
    {
        EnrichedRegisters.registerToItemGroup(RUBY, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(SAPPHIRE, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(TANZANITE, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(STEEL_BLEND, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(STEEL_INGOT, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_BLEND, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_INGOT, ItemGroups.INGREDIENTS);
        EnrichedRegisters.registerToItemGroup(HONEY_BALL, ItemGroups.INGREDIENTS);

        /*-------------*/
        /* -- Armor -- */
        /*-------------*/

        EnrichedItems.registerArmorToItemGroup(RUBY_HELMET, RUBY_CHESTPLATE, RUBY_LEGGINGS, RUBY_BOOTS);
        EnrichedItems.registerArmorToItemGroup(SAPPHIRE_HELMET, SAPPHIRE_CHESTPLATE, SAPPHIRE_LEGGINGS, SAPPHIRE_BOOTS);
        EnrichedItems.registerArmorToItemGroup(TANZANITE_HELMET, TANZANITE_CHESTPLATE, TANZANITE_LEGGINGS, TANZANITE_BOOTS);
        EnrichedItems.registerArmorToItemGroup(STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS);
        EnrichedItems.registerArmorToItemGroup(OBSIDIAN_HELMET, OBSIDIAN_CHESTPLATE, OBSIDIAN_LEGGINGS, OBSIDIAN_BOOTS);
        EnrichedItems.registerArmorToItemGroup(EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS);

        /*------------*/
        /* -- Food -- */
        /*------------*/

        EnrichedRegisters.registerToItemGroup(BEEF_STEW, ItemGroups.FOOD_AND_DRINK);
        EnrichedRegisters.registerToItemGroup(BERRY_JUICE, ItemGroups.FOOD_AND_DRINK);
    }

    // (Ayydxn) Maybe add an item group parameter instead of hard-coding the combat item group?
    private static void registerArmorToItemGroup(ArmorItem helmet, ArmorItem chestplate, ArmorItem leggings, ArmorItem boots)
    {
        EnrichedRegisters.registerToItemGroup(helmet, ItemGroups.COMBAT);
        EnrichedRegisters.registerToItemGroup(chestplate, ItemGroups.COMBAT);
        EnrichedRegisters.registerToItemGroup(leggings, ItemGroups.COMBAT);
        EnrichedRegisters.registerToItemGroup(boots, ItemGroups.COMBAT);
    }
}
