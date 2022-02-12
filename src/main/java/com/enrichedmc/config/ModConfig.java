package com.enrichedmc.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "enriched")
@Config.Gui.CategoryBackground(category = "Biomes", background = "enriched:textures/block/redwood_planks.png")
@Config.Gui.CategoryBackground(category = "Generation", background = "enriched:textures/block/marble.png")
@Config.Gui.CategoryBackground(category = "Tools", background = "minecraft:textures/block/copper_block.png")
@Config.Gui.CategoryBackground(category = "Mobs", background = "minecraft:textures/block/honey_block_side.png")
@Config.Gui.CategoryBackground(category = "Recipes", background = "minecraft:textures/block/raw_copper_block.png")
public class ModConfig implements ConfigData {
    //Mobs
    @ConfigEntry.Category("Mobs")
    @ConfigEntry.Gui.Tooltip()
    public static boolean enableHoneySlime = true;

    //Tools & Armor
    @ConfigEntry.Category("Tools")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableRubyGear = true;

    @ConfigEntry.Category("Tools")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableSapphireGear = true;

    @ConfigEntry.Category("Tools")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableTanzaniteGear = true;

    @ConfigEntry.Category("Tools")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableCopperGear = true;

    @ConfigEntry.Category("Tools")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableObsidianGear = true;

    @ConfigEntry.Category("Tools")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableEmeraldGear = true;

    @ConfigEntry.Category("Tools")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableSteelGear = true;

    //Generation
    @ConfigEntry.Category("Generation")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableDarkGranite = true;

    @ConfigEntry.Category("Generation")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableMarble = true;

    @ConfigEntry.Category("Generation")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableRubyOre = true;

    @ConfigEntry.Category("Generation")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableSapphireOre = true;

    @ConfigEntry.Category("Generation")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableTanzaniteOre = true;

    @ConfigEntry.Category("Generation")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableRedwoodTrees = true;
/*
    //Biomes
    @ConfigEntry.Category("Biomes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableRedwoodForest = true;

    @ConfigEntry.Category("Biomes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableDiverseForest = true;

    @ConfigEntry.Category("Biomes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableDesertMountain = true;

    @ConfigEntry.Category("Biomes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableExtremeMountain = true;

    @ConfigEntry.Category("Biomes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableExtremeJungle = true;

    @ConfigEntry.Category("Biomes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableFrozenDesert = true;

    @ConfigEntry.Category("Biomes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableShatteredJungle = true;
   */

    @ConfigEntry.Category("Recipes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableUncrafting = true;

    @ConfigEntry.Category("Recipes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableHorseArmor = true;

    @ConfigEntry.Category("Recipes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableChainmail = true;

    @ConfigEntry.Category("Recipes")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableRawSmelting = true;

}

