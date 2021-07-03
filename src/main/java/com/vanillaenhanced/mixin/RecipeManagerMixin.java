package com.vanillaenhanced.mixin;

import com.google.gson.JsonElement;
import com.vanillaenhanced.config.ModConfig;
import com.vanillaenhanced.recipes.DynamicRecipes;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;


@Mixin(RecipeManager.class)
public class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo ci) {
        if (ModConfig.enableCopperGear) {
            map.put(new Identifier("vanillaenhanced", "copper_pickaxe"), DynamicRecipes.COPPER_PICKAXE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "copper_sword"), DynamicRecipes.COPPER_SWORD_RECIPE);
            map.put(new Identifier("vanillaenhanced", "copper_axe"), DynamicRecipes.COPPER_AXE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "copper_shovel"), DynamicRecipes.COPPER_SHOVEL_RECIPE);
            map.put(new Identifier("vanillaenhanced", "copper_hoe"), DynamicRecipes.COPPER_HOE_RECIPE);
        }
        if (ModConfig.enableEmeraldGear) {
            map.put(new Identifier("vanillaenhanced", "emerald_pickaxe"), DynamicRecipes.EMERALD_PICKAXE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "emerald_sword"), DynamicRecipes.EMERALD_SWORD_RECIPE);
            map.put(new Identifier("vanillaenhanced", "emerald_axe"), DynamicRecipes.EMERALD_AXE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "emerald_shovel"), DynamicRecipes.EMERALD_SHOVEL_RECIPE);
            map.put(new Identifier("vanillaenhanced", "emerald_hoe"), DynamicRecipes.EMERALD_HOE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "emerald_helmet"), DynamicRecipes.EMERALD_HELMET_RECIPE);
            map.put(new Identifier("vanillaenhanced", "emerald_chestplate"), DynamicRecipes.EMERALD_CHESTPLATE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "emerald_leggings"), DynamicRecipes.EMERALD_LEGGINGS_RECIPE);
            map.put(new Identifier("vanillaenhanced", "emerald_boots"), DynamicRecipes.EMERALD_BOOTS_RECIPE);
        }
        if (ModConfig.enableObsidianGear) {
            map.put(new Identifier("vanillaenhanced", "obsidian_pickaxe"), DynamicRecipes.OBSIDIAN_PICKAXE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_sword"), DynamicRecipes.OBSIDIAN_SWORD_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_axe"), DynamicRecipes.OBSIDIAN_AXE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_shovel"), DynamicRecipes.OBSIDIAN_SHOVEL_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_hoe"), DynamicRecipes.OBSIDIAN_HOE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_alloy_ingot"), DynamicRecipes.OBSIDIAN_ALLOY_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_helmet"), DynamicRecipes.OBSIDIAN_HELMET_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_chestplate"), DynamicRecipes.OBSIDIAN_CHESTPLATE_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_leggings"), DynamicRecipes.OBSIDIAN_LEGGINGS_RECIPE);
            map.put(new Identifier("vanillaenhanced", "obsidian_boots"), DynamicRecipes.OBSIDIAN_BOOTS_RECIPE);
        }

        map.put(new Identifier("vanillaenhanced", "steel_ingot"), DynamicRecipes.STEEL_INGOT_RECIPE);
    }
}