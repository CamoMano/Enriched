package com.vanillaenhanced.registry;



import com.vanillaenhanced.items.*;
import com.vanillaenhanced.materials.items.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.vanillaenhanced.VanillaEnhanced.*;


public class ModRegistry {


    public static void obsidian() {
            //Obsidian Tools
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_shovel"), new ShovelBase(new ToolMaterialObsidian()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_pickaxe"), new PickaxeBase(new ToolMaterialObsidian()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_axe"), new AxeBase(new ToolMaterialObsidian()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_sword"), new SwordBase(new ToolMaterialObsidian()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_hoe"), new HoeBase(new ToolMaterialObsidian()));
            //Obsidian Armor
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_helmet"), new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.HEAD));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_chestplate"), new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.CHEST));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_leggings"), new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.LEGS));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_boots"), new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.FEET));


    }

    public static void emerald(){
            //Emerald Tools
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_shovel"), new ShovelBase(new ToolMaterialEmerald()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_pickaxe"), new PickaxeBase(new ToolMaterialEmerald()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_axe"), new AxeBase(new ToolMaterialEmerald()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_sword"), new SwordBase(new ToolMaterialEmerald()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_hoe"), new HoeBase(new ToolMaterialEmerald()));
            //Emerald Armor
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_helmet"), new ArmorBase(EMERALD_ARMOR, EquipmentSlot.HEAD));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_chestplate"), new ArmorBase(EMERALD_ARMOR, EquipmentSlot.CHEST));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_leggings"), new ArmorBase(EMERALD_ARMOR, EquipmentSlot.LEGS));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_boots"), new ArmorBase(EMERALD_ARMOR, EquipmentSlot.FEET));
    }

    public static void steel(){
            //Steel Ingot
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_ingot"), STEEL_INGOT);
            Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"steel_block"), STEEL_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_block"), new BlockItem(STEEL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
            //Emerald Tools
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_shovel"), new ShovelBase(new ToolMaterialSteel()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_pickaxe"), new PickaxeBase(new ToolMaterialSteel()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_axe"), new AxeBase(new ToolMaterialSteel()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_sword"), new SwordBase(new ToolMaterialSteel()));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_hoe"), new HoeBase(new ToolMaterialSteel()));
            //Steel Armor
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_helmet"), new ArmorBase(STEEL_ARMOR, EquipmentSlot.HEAD));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_chestplate"), new ArmorBase(STEEL_ARMOR, EquipmentSlot.CHEST));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_leggings"), new ArmorBase(STEEL_ARMOR, EquipmentSlot.LEGS));
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_boots"), new ArmorBase(STEEL_ARMOR, EquipmentSlot.FEET));
    }
}

