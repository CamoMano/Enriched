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
            enabledFeatures.add(alloy());
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

        if (config.enableSteelGear) {
            enabledFeatures.add(pickaxe("steel_pickaxe", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_pickaxe"));
            enabledFeatures.add(sword("steel_sword", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_sword"));
            enabledFeatures.add(axe("steel_axe", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_axe"));
            enabledFeatures.add(shovel("steel_shovel", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_shovel"));
            enabledFeatures.add(hoe("steel_hoe", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_hoe"));
            enabledFeatures.add(helmet("steel_helmet", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_helmet"));
            enabledFeatures.add(chestplate("steel_chestplate", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_chestplate"));
            enabledFeatures.add(leggings("steel_leggings", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_leggings"));
            enabledFeatures.add(boots("steel_boots", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_boots"));
            enabledFeatures.add(blasting("steel_ingot", "minecraft:iron_ingot", "vanillaenhanced:steel_ingot", 0.7, 400));
        }

        if (config.enableRubyGear) {
            enabledFeatures.add(pickaxe("ruby_pickaxe", "vanillaenhanced:ruby", "vanillaenhanced:ruby_pickaxe"));
            enabledFeatures.add(sword("ruby_sword", "vanillaenhanced:ruby", "vanillaenhanced:ruby_sword"));
            enabledFeatures.add(axe("ruby_axe", "vanillaenhanced:ruby", "vanillaenhanced:ruby_axe"));
            enabledFeatures.add(shovel("ruby_shovel", "vanillaenhanced:ruby", "vanillaenhanced:ruby_shovel"));
            enabledFeatures.add(hoe("ruby_hoe", "vanillaenhanced:ruby", "vanillaenhanced:ruby_hoe"));
            enabledFeatures.add(helmet("ruby_helmet", "vanillaenhanced:ruby", "vanillaenhanced:ruby_helmet"));
            enabledFeatures.add(chestplate("ruby_chestplate", "vanillaenhanced:ruby", "vanillaenhanced:ruby_chestplate"));
            enabledFeatures.add(leggings("ruby_leggings", "vanillaenhanced:ruby", "vanillaenhanced:ruby_leggings"));
            enabledFeatures.add(boots("ruby_boots", "vanillaenhanced:ruby", "vanillaenhanced:ruby_boots"));
        }

        if (config.enableSapphireGear) {
            enabledFeatures.add(pickaxe("sapphire_pickaxe", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_pickaxe"));
            enabledFeatures.add(sword("sapphire_sword", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_sword"));
            enabledFeatures.add(axe("sapphire_axe", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_axe"));
            enabledFeatures.add(shovel("sapphire_shovel", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_shovel"));
            enabledFeatures.add(hoe("sapphire_hoe", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_hoe"));
            enabledFeatures.add(helmet("sapphire_helmet", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_helmet"));
            enabledFeatures.add(chestplate("sapphire_chestplate", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_chestplate"));
            enabledFeatures.add(leggings("sapphire_leggings", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_leggings"));
            enabledFeatures.add(boots("sapphire_boots", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_boots"));
        }

        if (config.enableAmethystGear) {
            enabledFeatures.add(pickaxe("amethyst_pickaxe", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_pickaxe"));
            enabledFeatures.add(sword("amethyst_sword", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_sword"));
            enabledFeatures.add(axe("amethyst_axe", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_axe"));
            enabledFeatures.add(shovel("amethyst_shovel", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_shovel"));
            enabledFeatures.add(hoe("amethyst_hoe", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_hoe"));
            enabledFeatures.add(helmet("amethyst_helmet", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_helmet"));
            enabledFeatures.add(chestplate("amethyst_chestplate", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_chestplate"));
            enabledFeatures.add(leggings("amethyst_leggings", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_leggings"));
            enabledFeatures.add(boots("amethyst_boots", "vanillaenhanced:amethyst", "vanillaenhanced:amethyst_boots"));
        }
        
        enabledFeatures.forEach(it -> REGISTRY.put(it.getLeft(), it.getRight()));
    }

    private static Pair<Identifier, JsonObject> pickaxe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> sword(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " # ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> axe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                "#| ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> shovel(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> hoe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> alloy() {
        return ShapedRecipeBuilder.ofPattern(
                "III",
                "OOO",
                "III"
        ).item('I', "iron_ingot").item('O', "obsidian").result(
                "vanillaenhanced:obsidian_alloy_ingot", 9
        ).build(VanillaEnhanced.identifier("obsidian_alloy_ingot"));
    }

    private static Pair<Identifier, JsonObject> helmet(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "   "
        ).item('#', item).result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> chestplate(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "###",
                "###"
        ).item('#', item).result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> leggings(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "# #"
        ).item('#', item).result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> boots(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "# #",
                "   "
        ).item('#', item).result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> blasting(
            String name, String input, String output, double experience, int cookingTime
    ) {
        final Identifier identifier = VanillaEnhanced.identifier(name);
        final JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:blasting");

        final JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input);
        json.add("ingredient", ingredient);

        json.addProperty("result", output);
        json.addProperty("experience", experience);
        json.addProperty("cookingtime", cookingTime);

        return new Pair<>(identifier, json);
    }
}