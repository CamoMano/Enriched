package com.vanillaenhanced;

import com.vanillaenhanced.materials.items.ToolMaterialObsidian;
import net.fabricmc.api.ModInitializer;
import com.vanillaenhanced.items.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaEnhanced implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "vanillaenhanced";
    public static final String MOD_NAME = "VanillaEnhanced";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_pickaxe"), new PickaxeBase(new ToolMaterialObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_axe"), new AxeBase(new ToolMaterialObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_shovel"), new ShovelBase(new ToolMaterialObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_sword"), new SwordBase(new ToolMaterialObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_hoe"), new HoeBase(new ToolMaterialObsidian()));

    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}