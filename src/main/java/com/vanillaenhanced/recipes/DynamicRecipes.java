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
            enabledFeatures.add(blend("obsidian_alloy_blend", "minecraft:iron_ingot", "minecraft:obsidian", "vanillaenhanced:obsidian_alloy_blend"));
            enabledFeatures.add(pickaxe("obsidian_pickaxe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_pickaxe"));
            enabledFeatures.add(sword("obsidian_sword", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_sword"));
            enabledFeatures.add(axe("obsidian_axe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_axe"));
            enabledFeatures.add(shovel("obsidian_shovel", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_shovel"));
            enabledFeatures.add(hoe("obsidian_hoe", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_hoe"));
            enabledFeatures.add(helmet("obsidian_helmet", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_helmet"));
            enabledFeatures.add(chestplate("obsidian_chestplate", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_chestplate"));
            enabledFeatures.add(leggings("obsidian_leggings", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_leggings"));
            enabledFeatures.add(boots("obsidian_boots", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_boots"));
            enabledFeatures.add(blasting("obsidian_alloy_ingot_blasting", "vanillaenhanced:obsidian_alloy_blend", "vanillaenhanced:obsidian_alloy_ingot", 0.7, 100));
            enabledFeatures.add(smelting("obsidian_alloy_ingot_smelting", "vanillaenhanced:obsidian_alloy_blend", "vanillaenhanced:obsidian_alloy_ingot", 0.7, 200));
            enabledFeatures.add(block("obsidian_alloy_block", "vanillaenhanced:obsidian_alloy_ingot", "vanillaenhanced:obsidian_alloy_block", 1));
            enabledFeatures.add(uncrafting("obsidian_alloy_ingot", "vanillaenhanced:obsidian_alloy_block", "vanillaenhanced:obsidian_alloy_ingot", 9));
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
            enabledFeatures.add(blend("steel_blend", "minecraft:iron_ingot", "minecraft:coal", "vanillaenhanced:steel_blend"));
            enabledFeatures.add(blasting("steel_ingot_blasting", "vanillaenhanced:steel_blend", "vanillaenhanced:steel_ingot", 0.7, 100));
            enabledFeatures.add(smelting("steel_ingot_smelting", "vanillaenhanced:obsidian_alloy_blend", "vanillaenhanced:obsidian_alloy_ingot", 0.7, 200));
            enabledFeatures.add(block("steel_block", "vanillaenhanced:steel_ingot", "vanillaenhanced:steel_block", 1));
            enabledFeatures.add(uncrafting("steel_ingot", "vanillaenhanced:steel_block", "vanillaenhanced:steel_ingot", 9));
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
            enabledFeatures.add(block("ruby_block", "vanillaenhanced:ruby", "vanillaenhanced:ruby_block", 1));
            enabledFeatures.add(uncrafting("ruby", "vanillaenhanced:ruby_block", "vanillaenhanced:ruby", 9));
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
            enabledFeatures.add(block("sapphire_block", "vanillaenhanced:sapphire", "vanillaenhanced:sapphire_block", 1));
            enabledFeatures.add(uncrafting("sapphire", "vanillaenhanced:sapphire_block", "vanillaenhanced:sapphire", 9));
        }

        if (config.enableTanzaniteGear) {
            enabledFeatures.add(pickaxe("tanzanite_pickaxe", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_pickaxe"));
            enabledFeatures.add(sword("tanzanite_sword", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_sword"));
            enabledFeatures.add(axe("tanzanite_axe", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_axe"));
            enabledFeatures.add(shovel("tanzanite_shovel", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_shovel"));
            enabledFeatures.add(hoe("tanzanite_hoe", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_hoe"));
            enabledFeatures.add(helmet("tanzanite_helmet", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_helmet"));
            enabledFeatures.add(chestplate("tanzanite_chestplate", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_chestplate"));
            enabledFeatures.add(leggings("tanzanite_leggings", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_leggings"));
            enabledFeatures.add(boots("tanzanite_boots", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_boots"));
            enabledFeatures.add(block("tanzanite_block", "vanillaenhanced:tanzanite", "vanillaenhanced:tanzanite_block", 1));
            enabledFeatures.add(uncrafting("tanzanite", "vanillaenhanced:tanzanite_block", "vanillaenhanced:tanzanite", 9));
        }
        //Uncrafting
        if (config.enableUncrafting) {
            enabledFeatures.add(uncrafting_tag("uncrafting_wool", "minecraft:wool", "minecraft:string", 4));
            enabledFeatures.add(uncrafting("uncrafting_cobweb", "minecraft:cobweb", "minecraft:string", 5));
            enabledFeatures.add(uncrafting("uncrafting_brick", "minecraft:bricks", "minecraft:brick", 4));
            enabledFeatures.add(uncrafting("uncrafting_netherbrick", "minecraft:nether_bricks", "minecraft:nether_brick", 4));
            enabledFeatures.add(uncrafting("uncrafting_magma", "minecraft:magma_block", "minecraft:magma_cream", 4));
            enabledFeatures.add(uncrafting("uncrafting_nether_wart", "minecraft:nether_wart_block", "minecraft:nether_wart", 9));
            enabledFeatures.add(uncrafting("uncrafting_honeycomb", "minecraft:honeycomb_block", "minecraft:honeycomb", 4));
        }
        if (config.enableHorseArmor) {
            enabledFeatures.add(horse_armor("diamond_horse_armor", "minecraft:wool", "minecraft:diamond", "minecraft:diamond_horse_armor", 1));
            enabledFeatures.add(horse_armor("golden_horse_armor", "minecraft:wool", "minecraft:gold_ingot", "minecraft:golden_horse_armor", 1));
            enabledFeatures.add(horse_armor("iron_horse_armor", "minecraft:wool", "minecraft:iron_ingot", "minecraft:iron_horse_armor", 1));
        }
        if (config.enableChainmail) {
            enabledFeatures.add(helmet("chainmail_helmet", "minecraft:chain", "minecraft:chainmail_helmet"));
            enabledFeatures.add(chestplate("chainmail_chestplate", "minecraft:chain", "minecraft:chainmail_chestplate"));
            enabledFeatures.add(leggings("chainmail_leggings", "minecraft:chain", "minecraft:chainmail_leggings"));
            enabledFeatures.add(boots("chainmail_boots", "minecraft:chain", "minecraft:chainmail_boots"));
        }

        if(config.enableRawSmelting) {
            enabledFeatures.add(smelting("iron_block_smelting", "minecraft:raw_iron_block", "minecraft:iron_block", 6.3, 1800));
            enabledFeatures.add(smelting("copper_block_smelting", "minecraft:raw_copper_block", "minecraft:copper_block", 6.3, 1800));
            enabledFeatures.add(smelting("gold_block_smelting", "minecraft:raw_gold_block", "minecraft:gold_block", 6.3, 1800));
            enabledFeatures.add(blasting("iron_block_blasting", "minecraft:raw_iron_block", "minecraft:iron_block", 6.3, 900));
            enabledFeatures.add(blasting("copper_block_blasting", "minecraft:raw_copper_block", "minecraft:copper_block", 6.3, 900));
            enabledFeatures.add(blasting("gold_block_blasting", "minecraft:raw_gold_block", "minecraft:gold_block", 6.3, 900));
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

    private static Pair<Identifier, JsonObject> blend(String name, String item_1, String item_2, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "   ",
                "21 ",
                "   "
        ).item('1', item_1).item('2', item_2).result(result).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> uncrafting_tag(String name, String tag, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "#  ",
                "   ",
                "   "
        ).tag('#', tag).result(result, count).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> uncrafting(String name, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "#  ",
                "   ",
                "   "
        ).item('#', item).result(result, count).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> horse_armor(String name, String tag, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "  #",
                "#W#",
                "###"
        ).tag('W', tag).item('#', item).result(result, count).build(
                VanillaEnhanced.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> block(String name, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "###",
                "###"
        ).item('#', item).result(result, count).build(
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

    private static Pair<Identifier, JsonObject> smelting(
            String name, String input, String output, double experience, int cookingTime
    ) {
        final Identifier identifier = VanillaEnhanced.identifier(name);
        final JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smelting");

        final JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input);
        json.add("ingredient", ingredient);

        json.addProperty("result", output);
        json.addProperty("experience", experience);
        json.addProperty("cookingtime", cookingTime);

        return new Pair<>(identifier, json);
    }
}