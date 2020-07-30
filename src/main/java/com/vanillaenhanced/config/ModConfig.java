package com.vanillaenhanced.config;


import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;


@Config(name = "vanillaenhanced")
    public class ModConfig implements ConfigData {
    @Comment("Should Obsidian Alloy Tools, Armor, and Items be enabled?")
        public boolean enableObsidianGear = true;
    @Comment("Should Emerald Tools and Armor be enabled?")
        public boolean enableEmeraldGear = true;
    @Comment("Should Steel Tools, Armor, and Items be enabled?")
        public boolean enableSteelGear = true;
    @Comment("Should Ruby Tools, Armor, and Items be enabled?")
        public boolean enableRubyGear = true;
    @Comment("Should Food items be enabled?")
        public boolean enableFood = true;
    @Comment("Should the stone variants be enabled?")
    public boolean enableStones = true;



    }

