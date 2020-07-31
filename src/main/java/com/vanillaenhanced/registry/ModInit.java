package com.vanillaenhanced.registry;


import com.vanillaenhanced.blocks.StairsBase;
import com.vanillaenhanced.blocks.WallBase;
import com.vanillaenhanced.config.ModConfig;
import com.vanillaenhanced.items.*;
import com.vanillaenhanced.materials.items.*;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;
import static net.minecraft.sound.BlockSoundGroup.METAL;


public class ModInit{

        public static boolean enableObsidianGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableObsidianGear;
        public static boolean enableEmeraldGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableEmeraldGear;
        public static boolean enableSteelGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableSteelGear;
        public static boolean enableRubyGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableRubyGear;
        public static boolean enableSapphireGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableSapphireGear;
        public static boolean enableFood = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableFood;
        public static boolean enableDarkGranite = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableDarkGranite;
        public static boolean enableMarble = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableMarble;

        //Armor
        public static final ArmorMaterial OBSIDIAN_ARMOR = new ArmorMaterialObsidian();
        public static final ArmorMaterial EMERALD_ARMOR = new ArmorMaterialEmerald();
        public static final ArmorMaterial STEEL_ARMOR = new ArmorMaterialSteel();
        public static final ArmorMaterial RUBY_ARMOR = new ArmorMaterialRuby();
        public static final ArmorMaterial SAPPHIRE_ARMOR = new ArmorMaterialSapphire();

        //Blocks
        public static final Block RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(3.0f,3.0f));
        public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(5.0f,6.0f));
        public static final Block SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(3.0f,3.0f));
        public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(5.0f,6.0f));
        public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.METAL).strength(6.0f,7.0f));
        public static final Block OBSIDIAN_ALLOY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(METAL).strength(40.0f,1000.0f));
        public static final Block DARK_GRANITE = new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f,6.0f));
        public static final Block DARK_GRANITE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f,6.0f));
        public static final Block DARK_GRANITE_STAIRS = new StairsBase(DARK_GRANITE.getDefaultState(),"dark_granite_stairs",DARK_GRANITE);
        public static final Block DARK_GRANITE_WALL = new WallBase("dark_granite_wall",DARK_GRANITE);
        public static final Block POLISHED_DARK_GRANITE = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f,6.0f));
        public static final Block POLISHED_DARK_GRANITE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f,6.0f));
        public static final Block POLISHED_DARK_GRANITE_STAIRS = new StairsBase(POLISHED_DARK_GRANITE.getDefaultState(),"polished_dark_granite_stairs",DARK_GRANITE);
        public static final Block MARBLE = new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f,6.0f));
        public static final Block MARBLE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f,6.0f));
        public static final Block MARBLE_STAIRS = new StairsBase(MARBLE.getDefaultState(),"marble_stairs",MARBLE);
        public static final Block MARBLE_WALL = new WallBase("marble_wall",MARBLE);
        public static final Block POLISHED_MARBLE = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f,6.0f));
        public static final Block POLISHED_MARBLE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f,6.0f));
        public static final Block POLISHED_MARBLE_STAIRS = new StairsBase(POLISHED_MARBLE.getDefaultState(),"polished_marble_stairs",MARBLE);

        //Items
        public static final Item OBSIDIAN_ALLOY_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item SAPPHIRE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item BEEF_STEW = new BowlFood (new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(10).saturationModifier(24.0F).build()));
        public static final Item BERRY_JUICE = new BottleFood (new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).build()));

        //Register
    public static void Register() {

            if (enableFood) {
                    //Food
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beef_stew"), BEEF_STEW);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "berry_juice"), BERRY_JUICE);
            }

            if (enableObsidianGear) {
                    //Obsidian Ingot/Block
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "obsidian_alloy_ingot"), OBSIDIAN_ALLOY_INGOT);
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "obsidian_alloy_block"), OBSIDIAN_ALLOY_BLOCK);
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
            }

            if (enableEmeraldGear) {
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

            if (enableSteelGear) {
                    //Steel Ingot/Block
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_ingot"), STEEL_INGOT);
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "steel_block"), STEEL_BLOCK);
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
            }

            if (enableRubyGear) {
                    //Ruby Item/Block
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ruby_ore"), RUBY_ORE);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ruby_block"), RUBY_BLOCK);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    //Ruby Tools
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_shovel"), new ShovelBase(new ToolMaterialRuby()));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_pickaxe"), new PickaxeBase(new ToolMaterialRuby()));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_axe"), new AxeBase(new ToolMaterialRuby()));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_sword"), new SwordBase(new ToolMaterialRuby()));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_hoe"), new HoeBase(new ToolMaterialRuby()));
                    //Ruby Armor
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_helmet"), new ArmorBase(RUBY_ARMOR, EquipmentSlot.HEAD));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_chestplate"), new ArmorBase(RUBY_ARMOR, EquipmentSlot.CHEST));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_leggings"), new ArmorBase(RUBY_ARMOR, EquipmentSlot.LEGS));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_boots"), new ArmorBase(RUBY_ARMOR, EquipmentSlot.FEET));
            }
            if (enableSapphireGear) {
                    //Sapphire Item/Block
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire"), SAPPHIRE);
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_block"), new BlockItem(SAPPHIRE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    //Sapphire Tools
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_shovel"), new ShovelBase(new ToolMaterialSapphire()));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_pickaxe"), new PickaxeBase(new ToolMaterialSapphire()));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_axe"), new AxeBase(new ToolMaterialSapphire()));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_sword"), new SwordBase(new ToolMaterialSapphire()));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_hoe"), new HoeBase(new ToolMaterialSapphire()));
                    //Sapphire Armor
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_helmet"), new ArmorBase(SAPPHIRE_ARMOR, EquipmentSlot.HEAD));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_chestplate"), new ArmorBase(SAPPHIRE_ARMOR, EquipmentSlot.CHEST));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_leggings"), new ArmorBase(SAPPHIRE_ARMOR, EquipmentSlot.LEGS));
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_boots"), new ArmorBase(SAPPHIRE_ARMOR, EquipmentSlot.FEET));
            }
            if (enableDarkGranite){
                    //Dark Granite
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_granite"), DARK_GRANITE);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_granite"), new BlockItem(DARK_GRANITE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_granite_slab"), DARK_GRANITE_SLAB);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_granite_slab"), new BlockItem(DARK_GRANITE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_granite_stairs"), DARK_GRANITE_STAIRS);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_granite_stairs"), new BlockItem(DARK_GRANITE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_granite_wall"), DARK_GRANITE_WALL);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_granite_wall"), new BlockItem(DARK_GRANITE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_dark_granite"), POLISHED_DARK_GRANITE);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_dark_granite"), new BlockItem(POLISHED_DARK_GRANITE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_dark_granite_slab"), POLISHED_DARK_GRANITE_SLAB);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_dark_granite_slab"), new BlockItem(POLISHED_DARK_GRANITE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_dark_granite_stairs"), POLISHED_DARK_GRANITE_STAIRS);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_dark_granite_stairs"), new BlockItem(POLISHED_DARK_GRANITE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
            }
            if (enableMarble){
                    //Marble
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "marble"), MARBLE);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "marble"), new BlockItem(MARBLE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "marble_slab"), MARBLE_SLAB);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "marble_slab"), new BlockItem(MARBLE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "marble_stairs"), MARBLE_STAIRS);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "marble_stairs"), new BlockItem(MARBLE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "marble_wall"), MARBLE_WALL);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "marble_wall"), new BlockItem(MARBLE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_marble"), POLISHED_MARBLE);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_marble"), new BlockItem(POLISHED_MARBLE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_marble_slab"), POLISHED_MARBLE_SLAB);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_marble_slab"), new BlockItem(POLISHED_MARBLE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_marble_stairs"), POLISHED_MARBLE_STAIRS);
                    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_marble_stairs"), new BlockItem(POLISHED_MARBLE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
            }


        }


}

