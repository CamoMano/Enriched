package com.vanillaenhanced.recipes;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.vanillaenhanced.config.ModConfig;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class DynamicRecipes {

    public static JsonObject COPPER_PICKAXE_RECIPE = null;
    public static JsonObject COPPER_SWORD_RECIPE = null;
    public static JsonObject COPPER_AXE_RECIPE = null;
    public static JsonObject COPPER_SHOVEL_RECIPE = null;
    public static JsonObject COPPER_HOE_RECIPE = null;

    public static JsonObject EMERALD_PICKAXE_RECIPE = null;
    public static JsonObject EMERALD_SWORD_RECIPE = null;
    public static JsonObject EMERALD_AXE_RECIPE = null;
    public static JsonObject EMERALD_SHOVEL_RECIPE = null;
    public static JsonObject EMERALD_HOE_RECIPE = null;
    public static JsonObject EMERALD_HELMET_RECIPE = null;
    public static JsonObject EMERALD_CHESTPLATE_RECIPE = null;
    public static JsonObject EMERALD_LEGGINGS_RECIPE = null;
    public static JsonObject EMERALD_BOOTS_RECIPE = null;

    public static JsonObject OBSIDIAN_PICKAXE_RECIPE = null;
    public static JsonObject OBSIDIAN_SWORD_RECIPE = null;
    public static JsonObject OBSIDIAN_AXE_RECIPE = null;
    public static JsonObject OBSIDIAN_SHOVEL_RECIPE = null;
    public static JsonObject OBSIDIAN_HOE_RECIPE = null;
    public static JsonObject OBSIDIAN_ALLOY_RECIPE = null;
    public static JsonObject OBSIDIAN_HELMET_RECIPE = null;
    public static JsonObject OBSIDIAN_CHESTPLATE_RECIPE = null;
    public static JsonObject OBSIDIAN_LEGGINGS_RECIPE = null;
    public static JsonObject OBSIDIAN_BOOTS_RECIPE = null;


    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, int count) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:crafting_shaped");


        JsonArray jsonArray = new JsonArray();
        jsonArray.add(pattern.get(0));
        jsonArray.add(pattern.get(1));
        jsonArray.add(pattern.get(2));
        json.add("pattern", jsonArray);


        JsonObject individualKey;
        JsonObject keyList = new JsonObject();

        for (int i = 0; i < keys.size(); ++i) {
            individualKey = new JsonObject();
            individualKey.addProperty(type.get(i), items.get(i).toString());
            keyList.add(keys.get(i) + "", individualKey);
        }

        json.add("key", keyList);
        JsonObject result = new JsonObject();
        result.addProperty("item", output.toString());
        result.addProperty("count", count);
        json.add("result", result);

        return json;
    }


    public static void register(ModConfig config) {
        //Copper Gear
        COPPER_PICKAXE_RECIPE = pickaxe("copper_pickaxe", "minecraft:copper_ingot", "vanillaenhanced:copper_pickaxe", 1);
        COPPER_SWORD_RECIPE = sword("copper_sword", "minecraft:copper_ingot", "vanillaenhanced:copper_sword", 1);
        COPPER_AXE_RECIPE = axe("copper_axe", "minecraft:copper_ingot", "vanillaenhanced:copper_axe", 1);
        COPPER_SHOVEL_RECIPE = shovel("copper_shovel", "minecraft:copper_ingot", "vanillaenhanced:copper_shovel", 1);
        COPPER_HOE_RECIPE = hoe("copper_hoe", "minecraft:copper_ingot", "vanillaenhanced:copper_hoe", 1);
        //Emerald Gear
        EMERALD_PICKAXE_RECIPE = pickaxe("emerald_pickaxe", "minecraft:emerald", "vanillaenhanced:emerald_pickaxe", 1);
        EMERALD_SWORD_RECIPE = sword("emerald_sword", "minecraft:emerald", "vanillaenhanced:emerald_sword", 1);
        EMERALD_AXE_RECIPE = axe("emerald_axe", "minecraft:emerald", "vanillaenhanced:emerald_axe", 1);
        EMERALD_SHOVEL_RECIPE = shovel("emerald_shovel", "minecraft:emerald", "vanillaenhanced:emerald_shovel", 1);
        EMERALD_HOE_RECIPE = hoe("emerald_hoe", "minecraft:emerald", "vanillaenhanced:emerald_hoe", 1);
        EMERALD_HELMET_RECIPE = helmet("emerald_helmet", "minecraft:emerald", "vanillaenhanced:emerald_helmet", 1);
        EMERALD_CHESTPLATE_RECIPE = chestplate("emerald_chestplate", "minecraft:emerald", "vanillaenhanced:emerald_chestplate", 1);
        EMERALD_LEGGINGS_RECIPE = leggings("emerald_leggings", "minecraft:emerald", "vanillaenhanced:emerald_leggings", 1);
        EMERALD_BOOTS_RECIPE = boots("emerald_boots", "minecraft:emerald", "vanillaenhanced:emerald_boots", 1);
        //Obsidian Gear
        OBSIDIAN_PICKAXE_RECIPE = pickaxe("obsidian_pickaxe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_pickaxe", 1);
        OBSIDIAN_SWORD_RECIPE = sword("obsidian_sword", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_sword", 1);
        OBSIDIAN_AXE_RECIPE = axe("obsidian_axe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_axe", 1);
        OBSIDIAN_SHOVEL_RECIPE = shovel("obsidian_shovel", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_shovel", 1);
        OBSIDIAN_HOE_RECIPE = hoe("obsidian_hoe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_hoe", 1);
        OBSIDIAN_ALLOY_RECIPE = alloy("obsidian_alloy_ingot", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_alloy_ingot", 9);
        OBSIDIAN_HELMET_RECIPE = helmet("obsidian_helmet", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_helmet", 1);
        OBSIDIAN_CHESTPLATE_RECIPE = chestplate("obsidian_chestplate", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_chestplate", 1);
        OBSIDIAN_LEGGINGS_RECIPE = leggings("obsidian_leggings", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_leggings", 1);
        OBSIDIAN_BOOTS_RECIPE = boots("obsidian_boots", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_boots", 1);

    }


    public static JsonObject pickaxe(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier(item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        "###",
                        " | ",
                        " | "
                ), //Pattern
                new Identifier(result),
                count);
    }

    public static JsonObject sword(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier(item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        " # ",
                        " # ",
                        " | "
                ), //Pattern
                new Identifier(result),
                count);
    }


    public static JsonObject axe(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier(item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        "## ",
                        "#| ",
                        " | "
                ), //Pattern
                new Identifier(result), count);
    }

    public static JsonObject shovel(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier(item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        " # ",
                        " | ",
                        " | "
                ),
                new Identifier(result), count);
    }

    public static JsonObject hoe(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier(item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        "## ",
                        " | ",
                        " | "
                ),
                new Identifier(result), count);
    }

    public static JsonObject alloy(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        'O',
                        'I'
                ),
                Lists.newArrayList(new Identifier("obsidian"), new Identifier("iron_ingot")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        "III",
                        "OOO",
                        "III"
                ),
                new Identifier(result), count);
    }

    public static JsonObject helmet(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#'
                ),
                Lists.newArrayList(new Identifier(item)),
                Lists.newArrayList("item"),
                Lists.newArrayList(
                        "###",
                        "# #",
                        "   "
                ),
                new Identifier(result), count);
    }

    public static JsonObject chestplate(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#'
                ),
                Lists.newArrayList(new Identifier(item)),
                Lists.newArrayList("item"),
                Lists.newArrayList(
                        "# #",
                        "###",
                        "###"
                ),
                new Identifier(result), count);
    }

    public static JsonObject leggings(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#'
                ),
                Lists.newArrayList(new Identifier(item)),
                Lists.newArrayList("item"),
                Lists.newArrayList(
                        "###",
                        "# #",
                        "# #"
                ),
                new Identifier(result), count);
    }

    public static JsonObject boots(String name, String item, String result, int count) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#'
                ),
                Lists.newArrayList(new Identifier(item)),
                Lists.newArrayList("item"),
                Lists.newArrayList(
                        "# #",
                        "# #",
                        "  "
                ),
                new Identifier(result), count);
    }
}
