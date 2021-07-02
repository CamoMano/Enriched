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


    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output) {
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
        result.addProperty("count", 1);
        json.add("result", result);

        return json;
    }


    public static void register(ModConfig config) {
        if (config.enableCopperGear){
        COPPER_PICKAXE_RECIPE = pickaxe("copper_pickaxe", "copper_ingot", "vanillaenhanced:copper_pickaxe");
        COPPER_SWORD_RECIPE = sword("copper_sword", "copper_ingot", "vanillaenhanced:copper_sword");
        COPPER_AXE_RECIPE = axe("copper_axe", "copper_ingot", "vanillaenhanced:copper_axe");
        COPPER_SHOVEL_RECIPE = shovel("copper_shovel", "copper_ingot", "vanillaenhanced:copper_shovel");
        COPPER_HOE_RECIPE = hoe("copper_hoe", "copper_ingot", "vanillaenhanced:copper_hoe");}
    }


    public static JsonObject pickaxe(String name, String item, String result) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier("minecraft", item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        "###",
                        " | ",
                        " | "
                ), //Pattern
                new Identifier(result));
    }

    public static JsonObject sword(String name, String item, String result) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier("minecraft", item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        " # ",
                        " # ",
                        " | "
                ), //Pattern
                new Identifier(result));
    }


    public static JsonObject axe(String name, String item, String result) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier("minecraft", item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        "## ",
                        "#| ",
                        " | "
                ), //Pattern
                new Identifier(result));
    }

    public static JsonObject shovel(String name, String item, String result) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier("minecraft", item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        " # ",
                        " | ",
                        " | "
                ),
                new Identifier(result));
    }

    public static JsonObject hoe(String name, String item, String result) {
        return createShapedRecipeJson(
                Lists.newArrayList(
                        '#',
                        '|'
                ),
                Lists.newArrayList(new Identifier("minecraft", item), new Identifier("stick")),
                Lists.newArrayList("item", "item"),
                Lists.newArrayList(
                        "## ",
                        " | ",
                        " | "
                ),
                new Identifier(result));
    }
}
