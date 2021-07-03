package com.vanillaenhanced.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "vanillaenhanced")
@Config.Gui.CategoryBackground(category = "Biomes", background = "vanillaenhanced:textures/block/redwood_planks.png")
@Config.Gui.CategoryBackground(category = "Blocks", background = "vanillaenhanced:textures/block/marble.png")
@Config.Gui.CategoryBackground(category = "Items", background = "vanillaenhanced:textures/block/amethyst_ore.png")
@Config.Gui.CategoryBackground(category = "Mobs", background = "minecraft:textures/block/honey_block_side.png")
public class ModConfig implements ConfigData {
    //Mobs
    @ConfigEntry.Category("Mobs")
    @ConfigEntry.Gui.Tooltip()
    public static boolean enableHoneySlime = true;

    //Items & Ores
    @ConfigEntry.Category("Items")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableRubyGear = true;

    @ConfigEntry.Category("Items")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableSapphireGear = true;

    @ConfigEntry.Category("Items")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableAmethystGear = true;

    @ConfigEntry.Category("Items")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableCopperGear = true;

    @ConfigEntry.Category("Items")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableObsidianGear = true;

    @ConfigEntry.Category("Items")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableEmeraldGear = true;

    @ConfigEntry.Category("Items")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableSteelGear = true;

    //Blocks
    @ConfigEntry.Category("Blocks")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableDarkGranite = true;

    @ConfigEntry.Category("Blocks")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableMarble = true;

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

