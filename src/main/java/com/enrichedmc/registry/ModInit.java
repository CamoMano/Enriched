package com.enrichedmc.registry;

import com.enrichedmc.blocks.*;
import com.enrichedmc.entity.HoneySlime;
import com.enrichedmc.items.*;
import com.enrichedmc.materials.items.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
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

import static com.enrichedmc.Enriched.MOD_ID;
import static net.minecraft.block.Blocks.SPRUCE_LOG;
import static net.minecraft.block.Blocks.SPRUCE_WOOD;
import static net.minecraft.sound.BlockSoundGroup.METAL;

public class ModInit {
    //Armor
    public static final ArmorMaterial OBSIDIAN_ARMOR = new ArmorMaterialObsidian();
    public static final ArmorMaterial EMERALD_ARMOR = new ArmorMaterialEmerald();
    public static final ArmorMaterial STEEL_ARMOR = new ArmorMaterialSteel();
    public static final ArmorMaterial RUBY_ARMOR = new ArmorMaterialRuby();
    public static final ArmorMaterial SAPPHIRE_ARMOR = new ArmorMaterialSapphire();
    public static final ArmorMaterial TANZANITE_ARMOR = new ArmorMaterialTanzanite();
    //Blocks
    public static final Block RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 3.0f));
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().sounds(BlockSoundGroup.STONE).strength(5.0f, 6.0f));
    public static final Block TANZANITE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().sounds(BlockSoundGroup.STONE).strength(5.0f, 6.0f));
    public static final Block TANZANITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 3.0f));
    public static final Block SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 3.0f));
    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().sounds(BlockSoundGroup.STONE).strength(5.0f, 6.0f));
    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).strength(6.0f, 7.0f));
    public static final Block OBSIDIAN_ALLOY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool().sounds(METAL).strength(40.0f, 1000.0f));
    public static final Block DARK_GRANITE = new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
    public static final Block DARK_GRANITE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
    public static final Block DARK_GRANITE_STAIRS = new StairsBase(DARK_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(DARK_GRANITE));
    public static final Block DARK_GRANITE_WALL = new WallBase(DARK_GRANITE);
    public static final Block POLISHED_DARK_GRANITE = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
    public static final Block POLISHED_DARK_GRANITE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
    public static final Block POLISHED_DARK_GRANITE_STAIRS = new StairsBase(POLISHED_DARK_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_DARK_GRANITE));
    public static final Block MARBLE = new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
    public static final Block MARBLE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
    public static final Block MARBLE_STAIRS = new StairsBase(MARBLE.getDefaultState(), FabricBlockSettings.copyOf(MARBLE));
    public static final Block MARBLE_WALL = new WallBase(MARBLE);
    public static final Block POLISHED_MARBLE = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
    public static final Block POLISHED_MARBLE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f));
    public static final Block POLISHED_MARBLE_STAIRS = new StairsBase(POLISHED_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_MARBLE));
    public static final Block REDWOOD_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block STRIPPED_REDWOOD_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG).sounds(BlockSoundGroup.WOOD).strength(2.0f, 2.0f));
    public static final Block STRIPPED_REDWOOD_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f, 2.0f));
    public static final Block REDWOOD_LOG = new StripableBlock(SPRUCE_LOG, STRIPPED_REDWOOD_LOG);
    public static final Block REDWOOD_WOOD = new StripableBlock(SPRUCE_WOOD, STRIPPED_REDWOOD_WOOD);
    public static final Block REDWOOD_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));
    public static final Block REDWOOD_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));
    public static final Block REDWOOD_STAIRS = new StairsBase(REDWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(REDWOOD_PLANKS));
    public static final Block REDWOOD_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));
    public static final Block REDWOOD_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));
    public static final Block REDWOOD_SAPLING = new BlockRedwoodSapling();
    public static final Block POTTED_REDWOOD_SAPLING = new FlowerPotBlock(ModInit.REDWOOD_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block REDWOOD_BUTTON = new WoodButtonBase(REDWOOD_PLANKS);
    public static final Block REDWOOD_DOOR = new WoodDoorBase(FabricBlockSettings.copyOf(REDWOOD_PLANKS));
    public static final Block REDWOOD_PRESSURE_PLATE = new WoodPressurePlateBase(REDWOOD_PLANKS);
    public static final Block REDWOOD_TRAPDOOR = new WoodTrapdoorBase(REDWOOD_PLANKS);
    public static final Block BAMBOO_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).sounds(BlockSoundGroup.BAMBOO).strength(1.5f, 1.5f));
    public static final Block BAMBOO_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB).sounds(BlockSoundGroup.BAMBOO).strength(1.5f, 1.5f));
    public static final Block BAMBOO_STAIRS = new StairsBase(BAMBOO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(BAMBOO_PLANKS));
    public static final Block BAMBOO_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).sounds(BlockSoundGroup.BAMBOO).strength(1.5f, 1.5f));
    public static final Block BAMBOO_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).sounds(BlockSoundGroup.BAMBOO).strength(1.5f, 1.5f));
    public static final Block BAMBOO_DOOR = new WoodDoorBase(FabricBlockSettings.copyOf(BAMBOO_PLANKS));
    public static final Block BAMBOO_TRAPDOOR = new WoodTrapdoorBase(BAMBOO_PLANKS);
    public static final Block DEEPSLATE_RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).strength(3.0f, 3.0f));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).strength(3.0f, 3.0f));
    public static final Block DEEPSLATE_TANZANITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).strength(3.0f, 3.0f));

    //Items
    public static final Item OBSIDIAN_ALLOY_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SAPPHIRE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TANZANITE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item STEEL_BLEND = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item OBSIDIAN_ALLOY_BLEND = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item HONEY_BALL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item BEEF_STEW = new BowlFood(new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(12).saturationModifier(14.0F).build()));
    public static final Item BERRY_JUICE = new BottleFood(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).build()));
    public static final EntityType<HoneySlime> HONEY_SLIME = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "honey_slime"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HoneySlime::new)
                    .dimensions(EntityDimensions.changing(2.04f, 2.04f)).trackRangeChunks(12)
                    .build()
    );

    //Register
    public static void Register() {
        //Biome Blocks
        block("redwood_leaves", REDWOOD_LEAVES);
        blockItem("redwood_leaves", REDWOOD_LEAVES, ItemGroup.DECORATIONS);
        block("redwood_log", REDWOOD_LOG);
        blockItem("redwood_log", REDWOOD_LOG, ItemGroup.BUILDING_BLOCKS);
        block("redwood_wood", REDWOOD_WOOD);
        blockItem("redwood_wood", REDWOOD_WOOD, ItemGroup.BUILDING_BLOCKS);
        block("redwood_planks", REDWOOD_PLANKS);
        blockItem("redwood_planks", REDWOOD_PLANKS, ItemGroup.BUILDING_BLOCKS);
        block("redwood_slab", REDWOOD_SLAB);
        blockItem("redwood_slab", REDWOOD_SLAB, ItemGroup.BUILDING_BLOCKS);
        block("redwood_stairs", REDWOOD_STAIRS);
        blockItem("redwood_stairs", REDWOOD_STAIRS, ItemGroup.BUILDING_BLOCKS);
        block("redwood_fence", REDWOOD_FENCE);
        blockItem("redwood_fence", REDWOOD_FENCE, ItemGroup.DECORATIONS);
        block("redwood_fence_gate", REDWOOD_FENCE_GATE);
        blockItem("redwood_fence_gate", REDWOOD_FENCE_GATE, ItemGroup.REDSTONE);
        block("stripped_redwood_log", STRIPPED_REDWOOD_LOG);
        blockItem("stripped_redwood_log", STRIPPED_REDWOOD_LOG, ItemGroup.BUILDING_BLOCKS);
        block("stripped_redwood_wood", STRIPPED_REDWOOD_WOOD);
        blockItem("stripped_redwood_wood", STRIPPED_REDWOOD_WOOD, ItemGroup.BUILDING_BLOCKS);
        block("redwood_sapling", REDWOOD_SAPLING);
        blockItem("redwood_sapling", REDWOOD_SAPLING, ItemGroup.DECORATIONS);
        block("redwood_button", REDWOOD_BUTTON);
        blockItem("redwood_button", REDWOOD_BUTTON, ItemGroup.REDSTONE);
        block("redwood_door", REDWOOD_DOOR);
        blockItem("redwood_door", REDWOOD_DOOR, ItemGroup.REDSTONE);
        block("redwood_trapdoor", REDWOOD_TRAPDOOR);
        blockItem("redwood_trapdoor", REDWOOD_TRAPDOOR, ItemGroup.REDSTONE);
        block("redwood_pressure_plate", REDWOOD_PRESSURE_PLATE);
        blockItem("redwood_pressure_plate", REDWOOD_PRESSURE_PLATE, ItemGroup.REDSTONE);
        block("potted_redwood_sapling", POTTED_REDWOOD_SAPLING);
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
        flammableRegistry.add(BAMBOO_PLANKS, 5, 20);
        flammableRegistry.add(BAMBOO_STAIRS, 5, 20);
        flammableRegistry.add(BAMBOO_SLAB, 5, 20);
        flammableRegistry.add(BAMBOO_FENCE_GATE, 5, 20);
        flammableRegistry.add(BAMBOO_FENCE, 5, 20);
        //Bamboo
        block("bamboo_planks", BAMBOO_PLANKS);
        blockItem("bamboo_planks", BAMBOO_PLANKS, ItemGroup.BUILDING_BLOCKS);
        block("bamboo_slab", BAMBOO_SLAB);
        blockItem("bamboo_slab", BAMBOO_SLAB, ItemGroup.BUILDING_BLOCKS);
        block("bamboo_stairs", BAMBOO_STAIRS);
        blockItem("bamboo_stairs", BAMBOO_STAIRS, ItemGroup.BUILDING_BLOCKS);
        block("bamboo_fence", BAMBOO_FENCE);
        blockItem("bamboo_fence", BAMBOO_FENCE, ItemGroup.DECORATIONS);
        block("bamboo_fence_gate", BAMBOO_FENCE_GATE);
        blockItem("bamboo_fence_gate", BAMBOO_FENCE_GATE, ItemGroup.REDSTONE);
        block("bamboo_door", BAMBOO_DOOR);
        blockItem("bamboo_door", BAMBOO_DOOR, ItemGroup.REDSTONE);
        block("bamboo_trapdoor", BAMBOO_TRAPDOOR);
        blockItem("bamboo_trapdoor", BAMBOO_TRAPDOOR, ItemGroup.REDSTONE);
        //Food
        item("beef_stew", BEEF_STEW);
        item("berry_juice", BERRY_JUICE);
        //Obsidian Ingot/Block
        item("obsidian_alloy_ingot", OBSIDIAN_ALLOY_INGOT);
        item("obsidian_alloy_blend", OBSIDIAN_ALLOY_BLEND);
        block("obsidian_alloy_block", OBSIDIAN_ALLOY_BLOCK);
        blockItem("obsidian_alloy_block", OBSIDIAN_ALLOY_BLOCK, ItemGroup.BUILDING_BLOCKS);
        //Obsidian Tools
        item("obsidian_shovel", new ShovelBase(new ToolMaterialObsidian()));
        item("obsidian_pickaxe", new PickaxeBase(new ToolMaterialObsidian()));
        item("obsidian_axe", new AxeBase(new ToolMaterialObsidian()));
        item("obsidian_sword", new SwordBase(new ToolMaterialObsidian()));
        item("obsidian_hoe", new HoeBase(new ToolMaterialObsidian()));
        //Obsidian Armor
        item("obsidian_helmet", new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.HEAD));
        item("obsidian_chestplate", new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.CHEST));
        item("obsidian_leggings", new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.LEGS));
        item("obsidian_boots", new ArmorBase(OBSIDIAN_ARMOR, EquipmentSlot.FEET));
        //Emerald Tools
        item("emerald_shovel", new ShovelBase(new ToolMaterialEmerald()));
        item("emerald_pickaxe", new PickaxeBase(new ToolMaterialEmerald()));
        item("emerald_axe", new AxeBase(new ToolMaterialEmerald()));
        item("emerald_sword", new SwordBase(new ToolMaterialEmerald()));
        item("emerald_hoe", new HoeBase(new ToolMaterialEmerald()));
        //Emerald Armor
        item("emerald_helmet", new ArmorBase(EMERALD_ARMOR, EquipmentSlot.HEAD));
        item("emerald_chestplate", new ArmorBase(EMERALD_ARMOR, EquipmentSlot.CHEST));
        item("emerald_leggings", new ArmorBase(EMERALD_ARMOR, EquipmentSlot.LEGS));
        item("emerald_boots", new ArmorBase(EMERALD_ARMOR, EquipmentSlot.FEET));
        //Steel Ingot/Block
        item("steel_ingot", STEEL_INGOT);
        item("steel_blend", STEEL_BLEND);
        block("steel_block", STEEL_BLOCK);
        blockItem("steel_block", STEEL_BLOCK, ItemGroup.BUILDING_BLOCKS);
        //Steel Tools
        item("steel_shovel", new ShovelBase(new ToolMaterialSteel()));
        item("steel_pickaxe", new PickaxeBase(new ToolMaterialSteel()));
        item("steel_axe", new AxeBase(new ToolMaterialSteel()));
        item("steel_sword", new SwordBase(new ToolMaterialSteel()));
        item("steel_hoe", new HoeBase(new ToolMaterialSteel()));
        //Steel Armor
        item("steel_helmet", new ArmorBase(STEEL_ARMOR, EquipmentSlot.HEAD));
        item("steel_chestplate", new ArmorBase(STEEL_ARMOR, EquipmentSlot.CHEST));
        item("steel_leggings", new ArmorBase(STEEL_ARMOR, EquipmentSlot.LEGS));
        item("steel_boots", new ArmorBase(STEEL_ARMOR, EquipmentSlot.FEET));
        //Ruby Item/Block
        item("ruby", RUBY);
        block("ruby_ore", RUBY_ORE);
        blockItem("ruby_ore", RUBY_ORE, ItemGroup.BUILDING_BLOCKS);
        block("deepslate_ruby_ore", DEEPSLATE_RUBY_ORE);
        blockItem("deepslate_ruby_ore", DEEPSLATE_RUBY_ORE, ItemGroup.BUILDING_BLOCKS);
        block("ruby_block", RUBY_BLOCK);
        blockItem("ruby_block", RUBY_BLOCK, ItemGroup.BUILDING_BLOCKS);
        //Ruby Tools
        item("ruby_shovel", new ShovelBase(new ToolMaterialRuby()));
        item("ruby_pickaxe", new PickaxeBase(new ToolMaterialRuby()));
        item("ruby_axe", new AxeBase(new ToolMaterialRuby()));
        item("ruby_sword", new SwordBase(new ToolMaterialRuby()));
        item("ruby_hoe", new HoeBase(new ToolMaterialRuby()));
        //Ruby Armor
        item("ruby_helmet", new ArmorBase(RUBY_ARMOR, EquipmentSlot.HEAD));
        item("ruby_chestplate", new ArmorBase(RUBY_ARMOR, EquipmentSlot.CHEST));
        item("ruby_leggings", new ArmorBase(RUBY_ARMOR, EquipmentSlot.LEGS));
        item("ruby_boots", new ArmorBase(RUBY_ARMOR, EquipmentSlot.FEET));
        //Sapphire Item/Block
        item("sapphire", SAPPHIRE);
        block("sapphire_ore", SAPPHIRE_ORE);
        blockItem("sapphire_ore", SAPPHIRE_ORE, ItemGroup.BUILDING_BLOCKS);
        block("deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE);
        blockItem("deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE, ItemGroup.BUILDING_BLOCKS);
        block("sapphire_block", SAPPHIRE_BLOCK);
        blockItem("sapphire_block", SAPPHIRE_BLOCK, ItemGroup.BUILDING_BLOCKS);
        //Sapphire Tools
        item("sapphire_shovel", new ShovelBase(new ToolMaterialSapphire()));
        item("sapphire_pickaxe", new PickaxeBase(new ToolMaterialSapphire()));
        item("sapphire_axe", new AxeBase(new ToolMaterialSapphire()));
        item("sapphire_sword", new SwordBase(new ToolMaterialSapphire()));
        item("sapphire_hoe", new HoeBase(new ToolMaterialSapphire()));
        //Sapphire Armor
        item("sapphire_helmet", new ArmorBase(SAPPHIRE_ARMOR, EquipmentSlot.HEAD));
        item("sapphire_chestplate", new ArmorBase(SAPPHIRE_ARMOR, EquipmentSlot.CHEST));
        item("sapphire_leggings", new ArmorBase(SAPPHIRE_ARMOR, EquipmentSlot.LEGS));
        item("sapphire_boots", new ArmorBase(SAPPHIRE_ARMOR, EquipmentSlot.FEET));
        //Tanzanite Item/Block
        item("tanzanite", TANZANITE);
        block("tanzanite_ore", TANZANITE_ORE);
        blockItem("tanzanite_ore", TANZANITE_ORE, ItemGroup.BUILDING_BLOCKS);
        block("deepslate_tanzanite_ore", DEEPSLATE_TANZANITE_ORE);
        blockItem("deepslate_tanzanite_ore", DEEPSLATE_TANZANITE_ORE, ItemGroup.BUILDING_BLOCKS);
        block("tanzanite_block", TANZANITE_BLOCK);
        blockItem("tanzanite_block", TANZANITE_BLOCK, ItemGroup.BUILDING_BLOCKS);
        //Tanzanite Tools
        item("tanzanite_shovel", new ShovelBase(new ToolMaterialTanzanite()));
        item("tanzanite_pickaxe", new PickaxeBase(new ToolMaterialTanzanite()));
        item("tanzanite_axe", new AxeBase(new ToolMaterialTanzanite()));
        item("tanzanite_sword", new SwordBase(new ToolMaterialTanzanite()));
        item("tanzanite_hoe", new HoeBase(new ToolMaterialTanzanite()));
        //Tanzanite Armor
        item("tanzanite_helmet", new ArmorBase(TANZANITE_ARMOR, EquipmentSlot.HEAD));
        item("tanzanite_chestplate", new ArmorBase(TANZANITE_ARMOR, EquipmentSlot.CHEST));
        item("tanzanite_leggings", new ArmorBase(TANZANITE_ARMOR, EquipmentSlot.LEGS));
        item("tanzanite_boots", new ArmorBase(TANZANITE_ARMOR, EquipmentSlot.FEET));
        //Copper Tools
        item("copper_shovel", new ShovelBase(new ToolMaterialCopper()));
        item("copper_pickaxe", new PickaxeBase(new ToolMaterialCopper()));
        item("copper_axe", new AxeBase(new ToolMaterialCopper()));
        item("copper_sword", new SwordBase(new ToolMaterialCopper()));
        item("copper_hoe", new HoeBase(new ToolMaterialCopper()));
        //Dark Granite
        block("dark_granite", DARK_GRANITE);
        blockItem("dark_granite", DARK_GRANITE, ItemGroup.BUILDING_BLOCKS);
        block("dark_granite_slab", DARK_GRANITE_SLAB);
        blockItem("dark_granite_slab", DARK_GRANITE_SLAB, ItemGroup.BUILDING_BLOCKS);
        block("dark_granite_stairs", DARK_GRANITE_STAIRS);
        blockItem("dark_granite_stairs", DARK_GRANITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        block("dark_granite_wall", DARK_GRANITE_WALL);
        blockItem("dark_granite_wall", DARK_GRANITE_WALL, ItemGroup.DECORATIONS);
        block("polished_dark_granite", POLISHED_DARK_GRANITE);
        blockItem("polished_dark_granite", POLISHED_DARK_GRANITE, ItemGroup.BUILDING_BLOCKS);
        block("polished_dark_granite_slab", POLISHED_DARK_GRANITE_SLAB);
        blockItem("polished_dark_granite_slab", POLISHED_DARK_GRANITE_SLAB, ItemGroup.BUILDING_BLOCKS);
        block("polished_dark_granite_stairs", POLISHED_DARK_GRANITE_STAIRS);
        blockItem("polished_dark_granite_stairs", POLISHED_DARK_GRANITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        //Marble
        block("marble", MARBLE);
        blockItem("marble", MARBLE, ItemGroup.BUILDING_BLOCKS);
        block("marble_slab", MARBLE_SLAB);
        blockItem("marble_slab", MARBLE_SLAB, ItemGroup.BUILDING_BLOCKS);
        block("marble_stairs", MARBLE_STAIRS);
        blockItem("marble_stairs", MARBLE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        block("marble_wall", MARBLE_WALL);
        blockItem("marble_wall", MARBLE_WALL, ItemGroup.DECORATIONS);
        block("polished_marble", POLISHED_MARBLE);
        blockItem("polished_marble", POLISHED_MARBLE, ItemGroup.BUILDING_BLOCKS);
        block("polished_marble_slab", POLISHED_MARBLE_SLAB);
        blockItem("polished_marble_slab", POLISHED_MARBLE_SLAB, ItemGroup.BUILDING_BLOCKS);
        block("polished_marble_stairs", POLISHED_MARBLE_STAIRS);
        blockItem("polished_marble_stairs", POLISHED_MARBLE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        //Honey Slime
        FabricDefaultAttributeRegistry.register(HONEY_SLIME, HostileEntity.createHostileAttributes());
        Registry.register(
                Registry.ITEM, new Identifier(MOD_ID, "honey_slime_spawn_egg"),
                new SpawnEggItem(HONEY_SLIME, 0xffd700, 0xb39700, new Item.Settings().group(ItemGroup.MISC))
        );
        item("honey_ball", HONEY_BALL);

    }

    public static <T> void register(
            Registry<T> type, String name, T element
    ) {
        Registry.register(type, new Identifier(MOD_ID, name), element);
    }

    public static void item(String name, Item item) {
        register(Registry.ITEM, name, item);
    }

    public static void block(String name, Block block) {
        register(Registry.BLOCK, name, block);
    }

    public static void blockItem(
            String name, Block item, ItemGroup group
    ) {
        item(name, new BlockItem(item, new Item.Settings().group(group)));
    }
}

