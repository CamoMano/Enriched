package com.vanillaenhanced.recipes;

import com.google.gson.JsonObject;
import com.vanillaenhanced.VanillaEnhanced;
import com.vanillaenhanced.builder.ShapedRecipeBuilder;
import com.vanillaenhanced.config.ModConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.*;

public class DynamicRecipes {
    public static final Map<Identifier, JsonObject> REGISTRY = new HashMap<>();

    public static void register(ModConfig config) {
        final List<Pair<Identifier, JsonObject>> enabledFeatures = new ArrayList<>();
        if (config.enableCopperGear) {
            enabledFeatures.add(pickaxe("copper_pickaxe", "minecraft:copper_ingot", "vanillaenhanced:copper_pickaxe"));
            enabledFeatures.add(sword("copper_sword", "minecraft:copper_ingot", "vanillaenhanced:copper_sword"));
            enabledFeatures.add(axe("copper_axe", "minecraft:copper_ingot", "vanillaenhanced:copper_axe"));
            enabledFeatures.add(shovel("copper_shovel", "minecraft:copper_ingot", "vanillaenhanced:copper_shovel"));
            enabledFeatures.add(hoe("copper_hoe", "minecraft:copper_ingot", "vanillaenhanced:copper_hoe"));
        }
        if (config.enableEmeraldGear) {
            enabledFeatures.add(pickaxe("emerald_pickaxe", "minecraft:emerald", "vanillaenhanced:emerald_pickaxe"));
            enabledFeatures.add(sword("emerald_sword", "minecraft:emerald", "vanillaenhanced:emerald_sword"));
            enabledFeatures.add(axe("emerald_axe", "minecraft:emerald", "vanillaenhanced:emerald_axe"));
            enabledFeatures.add(shovel("emerald_shovel", "minecraft:emerald", "vanillaenhanced:emerald_shovel"));
            enabledFeatures.add(hoe("emerald_hoe", "minecraft:emerald", "vanillaenhanced:emerald_hoe"));
            enabledFeatures.add(helmet("emerald_helmet", "minecraft:emerald", "vanillaenhanced:emerald_helmet"));
            enabledFeatures.add(chestplate("emerald_chestplate", "minecraft:emerald", "vanillaenhanced:emerald_chestplate"));
            enabledFeatures.add(leggings("emerald_leggings", "minecraft:emerald", "vanillaenhanced:emerald_leggings"));
            enabledFeatures.add(boots("emerald_boots", "minecraft:emerald", "vanillaenhanced:emerald_boots"));
        }
        if (config.enableObsidianGear) {
            enabledFeatures.add(alloy("obsidian_alloy_ingot", "vanillaenhanced:obsidian_alloy_ingot"));
            enabledFeatures.add(pickaxe("obsidian_pickaxe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_pickaxe"));
            enabledFeatures.add(sword("obsidian_sword", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_sword"));
            enabledFeatures.add(axe("obsidian_axe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_axe"));
            enabledFeatures.add(shovel("obsidian_shovel", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_shovel"));
            enabledFeatures.add(hoe("obsidian_hoe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_hoe"));
            enabledFeatures.add(helmet("obsidian_helmet", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_helmet"));
            enabledFeatures.add(chestplate("obsidian_chestplate", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_chestplate"));
            enabledFeatures.add(leggings("obsidian_leggings", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_leggings"));
            enabledFeatures.add(boots("obsidian_boots", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_boots"));
        }
        enabledFeatures.forEach(it -> REGISTRY.put(it.getLeft(), it.getRight()));
    }


    public static Pair<Identifier, JsonObject> pickaxe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            "###",
            " | ",
            " | "
        ).item('#', item).item('|', "stick").result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }

    public static Pair<Identifier, JsonObject> sword(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            " # ",
            " # ",
            " | "
        ).item('#', item).item('|', "stick").result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }


    public static Pair<Identifier, JsonObject> axe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            "## ",
            "#| ",
            " | "
        ).item('#', item).item('|', "stick").result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }

    public static Pair<Identifier, JsonObject> shovel(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            " # ",
            " | ",
            " | "
        ).item('#', item).item('|', "stick").result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }

    public static Pair<Identifier, JsonObject> hoe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            "## ",
            " | ",
            " | "
        ).item('#', item).item('|', "stick").result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }

    public static Pair<Identifier, JsonObject> alloy(String name, String result) {
        return ShapedRecipeBuilder.ofPattern(
            "III",
            "OOO",
            "III"
        ).item('I', "iron_ingot").item('O', "obsidian").result(result, 9).build(
            VanillaEnhanced.identifier(name)
        );
    }

    public static Pair<Identifier, JsonObject> helmet(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            "###",
            "# #",
            "   "
        ).item('#', item).result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }

    public static Pair<Identifier, JsonObject> chestplate(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            "# #",
            "###",
            "###"
        ).item('#', item).result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }

    public static Pair<Identifier, JsonObject> leggings(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            "###",
            "# #",
            "# #"
        ).item('#', item).result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }

    public static Pair<Identifier, JsonObject> boots(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
            "# #",
            "# #",
            "   "
        ).item('#', item).result(result).build(
            VanillaEnhanced.identifier(name)
        );
    }
}