package com.vanillaenhanced.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "vanillaenhanced")
@Config.Gui.CategoryBackground(category = "Biomes", background = "vanillaenhanced:textures/block/redwood_planks.png")
@Config.Gui.CategoryBackground(category = "Generation", background = "vanillaenhanced:textures/block/marble.png")
@Config.Gui.CategoryBackground(category = "Tools", background = "minecraft:textures/block/copper_block.png")
@Config.Gui.CategoryBackground(category = "Mobs", background = "minecraft:textures/block/honey_block_side.png")
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
    public boolean enableAmethystGear = true;

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
    public boolean enableAmethystOre = true;

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
}

