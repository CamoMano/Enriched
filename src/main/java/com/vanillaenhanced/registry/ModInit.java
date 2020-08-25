package com.vanillaenhanced.registry;


import com.vanillaenhanced.blocks.*;
import com.vanillaenhanced.config.ModConfig;
import com.vanillaenhanced.entity.HoneySlime;
import com.vanillaenhanced.items.*;
import com.vanillaenhanced.materials.items.*;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;
import static net.minecraft.block.Blocks.SPRUCE_LOG;
import static net.minecraft.block.Blocks.SPRUCE_WOOD;
import static net.minecraft.sound.BlockSoundGroup.METAL;


public class ModInit {

        //Config
        public static boolean enableObsidianGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableObsidianGear;
        public static boolean enableEmeraldGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableEmeraldGear;
        public static boolean enableSteelGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableSteelGear;
        public static boolean enableRubyGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableRubyGear;
        public static boolean enableAmethystGear = AutoConfig.getConfigHolder(ModConfig.class).getConfig().enableAmethystGear;
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
        public static final ArmorMaterial AMETHYST_ARMOR = new ArmorMaterialAmethyst();

        //Blocks
        public static final Block RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(3.0f, 3.0f));
        public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(5.0f, 6.0f));
        public static final Block AMETHYST_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(5.0f, 6.0f));
        public static final Block AMETHYST_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(3.0f, 3.0f));
        public static final Block SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(3.0f, 3.0f));
        public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(5.0f, 6.0f));
        public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.METAL).strength(6.0f, 7.0f));
        public static final Block OBSIDIAN_ALLOY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(METAL).strength(40.0f, 1000.0f));
        public static final Block DARK_GRANITE = new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
        public static final Block DARK_GRANITE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
        public static final Block DARK_GRANITE_STAIRS = new StairsBase(DARK_GRANITE.getDefaultState(), "dark_granite_stairs", DARK_GRANITE);
        public static final Block DARK_GRANITE_WALL = new WallBase("dark_granite_wall", DARK_GRANITE);
        public static final Block POLISHED_DARK_GRANITE = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
        public static final Block POLISHED_DARK_GRANITE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
        public static final Block POLISHED_DARK_GRANITE_STAIRS = new StairsBase(POLISHED_DARK_GRANITE.getDefaultState(), "polished_dark_granite_stairs", DARK_GRANITE);
        public static final Block MARBLE = new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
        public static final Block MARBLE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
        public static final Block MARBLE_STAIRS = new StairsBase(MARBLE.getDefaultState(), "marble_stairs", MARBLE);
        public static final Block MARBLE_WALL = new WallBase("marble_wall", MARBLE);
        public static final Block POLISHED_MARBLE = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
        public static final Block POLISHED_MARBLE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
        public static final Block POLISHED_MARBLE_STAIRS = new StairsBase(POLISHED_MARBLE.getDefaultState(), "polished_marble_stairs", MARBLE);
        public static final Block REDWOOD_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
        public static final Block STRIPPED_REDWOOD_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG).sounds(BlockSoundGroup.WOOD).strength(2.0f, 2.0f));
        public static final Block STRIPPED_REDWOOD_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f, 2.0f));
        public static final Block REDWOOD_LOG = new StripableBlock(SPRUCE_LOG, STRIPPED_REDWOOD_LOG);
        public static final Block REDWOOD_WOOD = new StripableBlock(SPRUCE_WOOD, STRIPPED_REDWOOD_WOOD);
        public static final Block REDWOOD_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).sounds(BlockSoundGroup.WOOD).strength(3.0f, 2.0f));
        public static final Block REDWOOD_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB).sounds(BlockSoundGroup.STONE).strength(3.0f, 3.0f));
        public static final Block REDWOOD_STAIRS = new StairsBase(REDWOOD_PLANKS.getDefaultState(), "redwood_stairs", REDWOOD_PLANKS);
        public static final Block REDWOOD_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));
        public static final Block REDWOOD_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));
        public static final Block REDWOOD_SAPLING = new BlockRedwoodSapling();
        public static final Block REDWOOD_BUTTON = new WoodButtonBase("redwood_button", REDWOOD_PLANKS);
        public static final Block REDWOOD_DOOR = new WoodDoorBase("redwood_door", REDWOOD_PLANKS);
        public static final Block REDWOOD_PRESSURE_PLATE = new WoodPressurePlateBase("redwood_pressure_plate", REDWOOD_PLANKS);
        public static final Block REDWOOD_TRAPDOOR = new WoodTrapdoorBase("redwood_trapdoor", REDWOOD_PLANKS);
        //public static final SignBlock REDWOOD_SIGN = new SignBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SIGN), SignType.SPRUCE);
        //public static final WallSignBlock REDWOOD_WALL_SIGN = new WallSignBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WALL_SIGN), SignType.SPRUCE);

        //Items
        public static final Item OBSIDIAN_ALLOY_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item SAPPHIRE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item AMETHYST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
        public static final Item BEEF_STEW = new BowlFood(new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(12).saturationModifier(14.0F).build()));
        public static final Item BERRY_JUICE = new BottleFood(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).build()));



        public static final EntityType<HoneySlime> HONEY_SLIME = FabricEntityTypeBuilder.
                create(SpawnGroup.MONSTER, HoneySlime::new)
                .dimensions(EntityDimensions.changing(2.04f, 2.04f)).trackable(32, 4)
                .build();


        //Register
        public static void Register() {


                //Biome Blocks
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_leaves"), REDWOOD_LEAVES);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_leaves"), new BlockItem(REDWOOD_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_log"), REDWOOD_LOG);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_log"), new BlockItem(REDWOOD_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_wood"), REDWOOD_WOOD);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_wood"), new BlockItem(REDWOOD_WOOD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_planks"), REDWOOD_PLANKS);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_planks"), new BlockItem(REDWOOD_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_slab"), REDWOOD_SLAB);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_slab"), new BlockItem(REDWOOD_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_stairs"), REDWOOD_STAIRS);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_stairs"), new BlockItem(REDWOOD_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_fence"), REDWOOD_FENCE);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_fence"), new BlockItem(REDWOOD_FENCE, new Item.Settings().group(ItemGroup.DECORATIONS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_fence_gate"), REDWOOD_FENCE_GATE);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_fence_gate"), new BlockItem(REDWOOD_FENCE_GATE, new Item.Settings().group(ItemGroup.REDSTONE)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_redwood_log"), STRIPPED_REDWOOD_LOG);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_redwood_log"), new BlockItem(STRIPPED_REDWOOD_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_redwood_wood"), STRIPPED_REDWOOD_WOOD);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_redwood_wood"), new BlockItem(STRIPPED_REDWOOD_WOOD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_sapling"), REDWOOD_SAPLING);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_sapling"), new BlockItem(REDWOOD_SAPLING, new Item.Settings().group(ItemGroup.DECORATIONS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_button"), REDWOOD_BUTTON);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_button"), new BlockItem(REDWOOD_BUTTON, new Item.Settings().group(ItemGroup.REDSTONE)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_door"), REDWOOD_DOOR);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_door"), new BlockItem(REDWOOD_DOOR, new Item.Settings().group(ItemGroup.REDSTONE)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_trapdoor"), REDWOOD_TRAPDOOR);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_trapdoor"), new BlockItem(REDWOOD_TRAPDOOR, new Item.Settings().group(ItemGroup.REDSTONE)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_pressure_plate"), REDWOOD_PRESSURE_PLATE);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_pressure_plate"), new BlockItem(REDWOOD_PRESSURE_PLATE, new Item.Settings().group(ItemGroup.REDSTONE)));
                //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_sign"), REDWOOD_SIGN);
                //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_sign"), new BlockItem(REDWOOD_SIGN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_wall_sign"), REDWOOD_WALL_SIGN);
                //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_wall_sign"), new WallSignBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WALL_SIGN), SignType.SPRUCE));
                FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();
                flammableRegistry.add(REDWOOD_LOG, 5, 5);
                flammableRegistry.add(STRIPPED_REDWOOD_LOG, 5, 5);
                flammableRegistry.add(REDWOOD_WOOD, 5, 5);
                flammableRegistry.add(STRIPPED_REDWOOD_WOOD, 5, 5);
                flammableRegistry.add(REDWOOD_PLANKS, 5, 20);
                flammableRegistry.add(REDWOOD_STAIRS, 5, 20);
                flammableRegistry.add(REDWOOD_SLAB, 5, 20);
                flammableRegistry.add(REDWOOD_FENCE_GATE, 5, 20);
                flammableRegistry.add(REDWOOD_FENCE, 5, 20);
                flammableRegistry.add(REDWOOD_LEAVES, 30, 60);


                //Biomes


        /*
        if (enableDiverseForest){
            OverworldBiomes.addContinentalBiome(ModInit.DIVERSE_FOREST, OverworldClimate.TEMPERATE, 0.75);
            OverworldBiomes.addBiomeVariant(Biomes.PLAINS, ModInit.DIVERSE_FOREST, 0.33);
            OverworldBiomes.addHillsBiome(ModInit.DIVERSE_FOREST, Biomes.MOUNTAINS, 0.33);
        }
        if (enableRedwoodForest){
            OverworldBiomes.addContinentalBiome(ModInit.REDWOOD_FOREST, OverworldClimate.TEMPERATE, 0.4);
        }
        if (enableDesertMountain){
            OverworldBiomes.addContinentalBiome(ModInit.DESERT_MOUNTAINS, OverworldClimate.DRY, 0.5);
        }
        if (enableExtremeMountain){
            OverworldBiomes.addContinentalBiome(ModInit.EXTREME_MOUNTAINS, OverworldClimate.COOL, 0.25);
        }
        if (enableExtremeJungle){
            OverworldBiomes.addContinentalBiome(ModInit.EXTREME_JUNGLE, OverworldClimate.TEMPERATE, 0.15);
        }
        if (enableFrozenDesert){
            OverworldBiomes.addContinentalBiome(ModInit.FROZEN_DESERT, OverworldClimate.SNOWY, 0.10);
        }
        if (enableMonolith){
            OverworldBiomes.addContinentalBiome(ModInit.MONOLITH, OverworldClimate.TEMPERATE, 0.02);
        }
		*/

                //Generator.initBiomeFeatures();


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

                if (enableAmethystGear) {
                        //Amethyst Item/Block
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst"), AMETHYST);
                        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amethyst_ore"), AMETHYST_ORE);
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_ore"), new BlockItem(AMETHYST_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amethyst_block"), AMETHYST_BLOCK);
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_block"), new BlockItem(AMETHYST_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                        //Amethyst Tools
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_shovel"), new ShovelBase(new ToolMaterialAmethyst()));
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_pickaxe"), new PickaxeBase(new ToolMaterialAmethyst()));
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_axe"), new AxeBase(new ToolMaterialAmethyst()));
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_sword"), new SwordBase(new ToolMaterialAmethyst()));
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_hoe"), new HoeBase(new ToolMaterialAmethyst()));
                        //Amethyst Armor
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_helmet"), new ArmorBase(AMETHYST_ARMOR, EquipmentSlot.HEAD));
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_chestplate"), new ArmorBase(AMETHYST_ARMOR, EquipmentSlot.CHEST));
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_leggings"), new ArmorBase(AMETHYST_ARMOR, EquipmentSlot.LEGS));
                        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_boots"), new ArmorBase(AMETHYST_ARMOR, EquipmentSlot.FEET));
                }
                //if (enableDarkGranite){
                //Dark Granite
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_granite"), DARK_GRANITE);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_granite"), new BlockItem(DARK_GRANITE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_granite_slab"), DARK_GRANITE_SLAB);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_granite_slab"), new BlockItem(DARK_GRANITE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_granite_stairs"), DARK_GRANITE_STAIRS);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_granite_stairs"), new BlockItem(DARK_GRANITE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_granite_wall"), DARK_GRANITE_WALL);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_granite_wall"), new BlockItem(DARK_GRANITE_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_dark_granite"), POLISHED_DARK_GRANITE);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_dark_granite"), new BlockItem(POLISHED_DARK_GRANITE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_dark_granite_slab"), POLISHED_DARK_GRANITE_SLAB);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_dark_granite_slab"), new BlockItem(POLISHED_DARK_GRANITE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_dark_granite_stairs"), POLISHED_DARK_GRANITE_STAIRS);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_dark_granite_stairs"), new BlockItem(POLISHED_DARK_GRANITE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                //}
                //if (enableMarble){
                //Marble
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "marble"), MARBLE);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "marble"), new BlockItem(MARBLE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "marble_slab"), MARBLE_SLAB);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "marble_slab"), new BlockItem(MARBLE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "marble_stairs"), MARBLE_STAIRS);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "marble_stairs"), new BlockItem(MARBLE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "marble_wall"), MARBLE_WALL);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "marble_wall"), new BlockItem(MARBLE_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_marble"), POLISHED_MARBLE);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_marble"), new BlockItem(POLISHED_MARBLE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_marble_slab"), POLISHED_MARBLE_SLAB);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_marble_slab"), new BlockItem(POLISHED_MARBLE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_marble_stairs"), POLISHED_MARBLE_STAIRS);
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_marble_stairs"), new BlockItem(POLISHED_MARBLE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                // }

                FabricDefaultAttributeRegistry.register(HONEY_SLIME, HostileEntity.createHostileAttributes());
                Registry.register(Registry.ENTITY_TYPE, MOD_ID+"honey_slime", HONEY_SLIME);
                Registry.register(
                        Registry.ITEM,
                        MOD_ID+"honey_slime_spawn_egg",
                        new SpawnEggItem(HONEY_SLIME, 0x513EA0, 0x7E6EBF, new Item.Settings().group(ItemGroup.MISC))
                );


        }
}

