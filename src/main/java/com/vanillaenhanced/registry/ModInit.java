package com.vanillaenhanced.registry;


import com.vanillaenhanced.config.ModConfig;
import com.vanillaenhanced.items.*;
import com.vanillaenhanced.materials.items.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.vanillaenhanced.VanillaEnhanced.*;
import static net.minecraft.sound.BlockSoundGroup.METAL;


public class ModInit {


        //Armor
        public static final ArmorMaterial OBSIDIAN_ARMOR = new ArmorMaterialObsidian();
        public static final ArmorMaterial EMERALD_ARMOR = new ArmorMaterialEmerald();
        public static final ArmorMaterial STEEL_ARMOR = new ArmorMaterialSteel();

        //Blocks
        public static final Block RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(6.0f,7.0f));
        public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.METAL).strength(6.0f,7.0f));
        public static final Block OBSIDIAN_ALLOY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(METAL).strength(40.0f,1000.0f));

        //Items
        public static final Item OBSIDIAN_ALLOY_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item BEEF_STEW = new BowlFood (new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(10).saturationModifier(24.0F).build()));

        //Register
    public static void Register() {

            //Food
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beef_stew"), BEEF_STEW);

            //Obsidian Ingot/Block
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_alloy_ingot"), OBSIDIAN_ALLOY_INGOT);
            Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"obsidian_alloy_block"), OBSIDIAN_ALLOY_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_alloy_block"), new BlockItem(OBSIDIAN_ALLOY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
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


            //Steel Ingot/Block
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_ingot"), STEEL_INGOT);
            Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"steel_block"), STEEL_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_block"), new BlockItem(STEEL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
            //Steel Tools
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


            //Ruby Item/Block
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
            Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"ruby_ore"), RUBY_ORE);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        }


}

