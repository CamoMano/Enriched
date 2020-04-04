package com.vanillaenhanced;

import com.vanillaenhanced.materials.items.ArmorMaterialEmerald;
import com.vanillaenhanced.materials.items.ArmorMaterialObsidian;
import com.vanillaenhanced.materials.items.ToolMaterialEmerald;
import com.vanillaenhanced.materials.items.ToolMaterialObsidian;
import net.fabricmc.api.ModInitializer;
import com.vanillaenhanced.items.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaEnhanced implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "vanillaenhanced";
    public static final String MOD_NAME = "VanillaEnhanced";
    public static final ArmorMaterial OBSIDIAN_ARMOR = new ArmorMaterialObsidian();
    public static final ArmorMaterial EMERALD_ARMOR = new ArmorMaterialEmerald();

    @Override
    public void onInitialize() {
        log(Level.INFO, "Hello there.");
        //Obsidian Tools
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_pickaxe"), new PickaxeBase(new ToolMaterialObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_axe"), new AxeBase(new ToolMaterialObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_shovel"), new ShovelBase(new ToolMaterialObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_sword"), new SwordBase(new ToolMaterialObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_hoe"), new HoeBase(new ToolMaterialObsidian()));
        //Obsidian Armor
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_helmet"), new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_chestplate"), new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_leggings"), new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"obsidian_boots"), new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.FEET));

        //Emerald Tools
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_pickaxe"), new PickaxeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_axe"), new AxeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_shovel"), new ShovelBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_sword"), new SwordBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_hoe"), new HoeBase(new ToolMaterialEmerald()));
        //Emerald Armor
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_helmet"), new ArmorBase(EMERALD_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_chestplate"), new ArmorBase(EMERALD_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_leggings"), new ArmorBase(EMERALD_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"emerald_boots"), new ArmorBase(EMERALD_ARMOR, EquipmentSlot.FEET));

    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}