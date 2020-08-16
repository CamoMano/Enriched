package com.vanillaenhanced.config;


import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;


@Config(name = "vanillaenhanced")
@Config.Gui.CategoryBackground(category = "Biomes" , background = "vanillaenhanced:textures/block/redwood_planks.png")
@Config.Gui.CategoryBackground(category = "Blocks" , background = "vanillaenhanced:textures/block/marble.png")
@Config.Gui.CategoryBackground(category = "Items" , background = "vanillaenhanced:textures/block/amethyst_ore.png")
    public class ModConfig implements ConfigData {

    //Items & Ores
    @ConfigEntry.Category("Items")
    @Comment("Should Obsidian Alloy Tools, Armor, and Items be enabled?")
    public boolean enableObsidianGear = true;
    @ConfigEntry.Category("Items")
    @Comment("Should Emerald Tools and Armor be enabled?")
    public boolean enableEmeraldGear = true;
    @ConfigEntry.Category("Items")
    @Comment("Should Steel Tools, Armor, and Items be enabled?")
    public boolean enableSteelGear = true;
    @ConfigEntry.Category("Items")
    @Comment("Should Ruby Tools, Armor, and Items be enabled?")
    public boolean enableRubyGear = true;
    @ConfigEntry.Category("Items")
    @Comment("Should Sapphire Tools, Armor, and Items be enabled?")
    public boolean enableSapphireGear = true;
    @ConfigEntry.Category("Items")
    @Comment("Should Amethyst Tools, Armor, and Items be enabled?")
    public boolean enableAmethystGear = true;
    @ConfigEntry.Category("Items")
    @Comment("Should Food items be enabled?")
    public boolean enableFood = true;

    //Blocks
    @ConfigEntry.Category("Blocks")
    @Comment("Should Dark Granite be generated?")
    public boolean enableDarkGranite = true;
    @ConfigEntry.Category("Blocks")
    @Comment("Should Marble be generated?")
    public boolean enableMarble = true;


    //Biomes
    @ConfigEntry.Category("Biomes")
    @Comment("Should Redwood Forest biomes be enabled?")
    public boolean enableRedwoodForest = true;
    @ConfigEntry.Category("Biomes")
    @Comment("Should Diverse Forest biomes be enabled?")
    public boolean enableDiverseForest = true;
    @ConfigEntry.Category("Biomes")
    @Comment("Should Desert Mountain biomes be enabled?")
    public boolean enableDesertMountain = true;
    @ConfigEntry.Category("Biomes")
    @Comment("Should Extreme Mountain biomes be enabled?")
    public boolean enableExtremeMountain = true;
    @ConfigEntry.Category("Biomes")
    @Comment("Should Extreme Jungle biomes be enabled?")
    public boolean enableExtremeJungle = true;
    @ConfigEntry.Category("Biomes")
    @Comment("Should Frozen Desert biomes be enabled?")
    public boolean enableFrozenDesert = true;
    @ConfigEntry.Category("Biomes")
    @Comment("Should the Monolith biome be enabled?")
    public boolean enableMonolith = false;




    }

