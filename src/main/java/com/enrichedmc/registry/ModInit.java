package com.enrichedmc.registry;

import static com.enrichedmc.Enriched.MOD_ID;
import static net.minecraft.block.Blocks.SPRUCE_LOG;
import static net.minecraft.block.Blocks.SPRUCE_WOOD;
import static net.minecraft.item.ItemGroups.*;
import static net.minecraft.sound.BlockSoundGroup.METAL;

import com.enrichedmc.blocks.*;
import com.enrichedmc.entity.HoneySlime;
import com.enrichedmc.items.*;
import com.enrichedmc.materials.items.*;
import com.enrichedmc.world.feature.tree.RedwoodSaplingGenerator;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModInit {
  // Armor
  public static final ArmorMaterial OBSIDIAN_ARMOR = new ArmorMaterialObsidian();
  public static final ArmorMaterial EMERALD_ARMOR = new ArmorMaterialEmerald();
  public static final ArmorMaterial STEEL_ARMOR = new ArmorMaterialSteel();
  public static final ArmorMaterial RUBY_ARMOR = new ArmorMaterialRuby();
  public static final ArmorMaterial SAPPHIRE_ARMOR = new ArmorMaterialSapphire();
  public static final ArmorMaterial TANZANITE_ARMOR = new ArmorMaterialTanzanite();
  
  // Blocks
  public static final Block RUBY_ORE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(3.0f, 3.0f));
  public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY =
      RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_ruby"));
  public static final Block RUBY_BLOCK =
      new Block(
          FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(5.0f, 6.0f));
  public static final Block TANZANITE_BLOCK =
      new Block(
          FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(5.0f, 6.0f));
  public static final Block TANZANITE_ORE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(3.0f, 3.0f));
  public static final RegistryKey<PlacedFeature> TANZANITE_ORE_PLACED_KEY =
      RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_tanzanite"));
  public static final Block SAPPHIRE_ORE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(3.0f, 3.0f));
  public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY =
      RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_sapphire"));
  public static final Block SAPPHIRE_BLOCK =
      new Block(
          FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(5.0f, 6.0f));
  public static final Block STEEL_BLOCK =
      new Block(
          FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
              .requiresTool()
              .sounds(BlockSoundGroup.METAL)
              .strength(6.0f, 7.0f));
  public static final Block OBSIDIAN_ALLOY_BLOCK =
      new Block(
          FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
              .requiresTool()
              .sounds(METAL)
              .strength(40.0f, 1000.0f));
  public static final Block DARK_GRANITE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.GRANITE)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(1.5f, 6.0f));

  public static final RegistryKey<PlacedFeature> DARK_GRANITE_UP_KEY =
      RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_dark_granite_up"));
  public static final RegistryKey<PlacedFeature> DARK_GRANITE_LOW_KEY =
      RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_dark_granite_low"));
  public static final Block DARK_GRANITE_SLAB =
      new SlabBlock(
          FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(1.5f, 6.0f));
  public static final Block DARK_GRANITE_STAIRS =
      new StairsBase(DARK_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(DARK_GRANITE));
  public static final Block DARK_GRANITE_WALL = new WallBase(DARK_GRANITE);
  public static final Block POLISHED_DARK_GRANITE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(1.5f, 6.0f));
  public static final Block POLISHED_DARK_GRANITE_SLAB =
      new SlabBlock(
          FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(1.5f, 6.0f));
  public static final Block POLISHED_DARK_GRANITE_STAIRS =
      new StairsBase(
          POLISHED_DARK_GRANITE.getDefaultState(),
          FabricBlockSettings.copyOf(POLISHED_DARK_GRANITE));
  public static final Block MARBLE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.GRANITE)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(1.5f, 6.0f));
  public static final RegistryKey<PlacedFeature> MARBLE_UP_KEY =
      RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_marble_up"));
  public static final RegistryKey<PlacedFeature> MARBLE_LOW_KEY =
      RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_marble_low"));
  public static final Block MARBLE_SLAB =
      new SlabBlock(
          FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(1.5f, 6.0f));
  public static final Block MARBLE_STAIRS =
      new StairsBase(MARBLE.getDefaultState(), FabricBlockSettings.copyOf(MARBLE));
  public static final Block MARBLE_WALL = new WallBase(MARBLE);
  public static final Block POLISHED_MARBLE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(1.5f, 6.0f));
  public static final Block POLISHED_MARBLE_SLAB =
      new SlabBlock(
          FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB)
              .requiresTool()
              .sounds(BlockSoundGroup.STONE)
              .strength(1.5f, 6.0f));
  public static final Block POLISHED_MARBLE_STAIRS =
      new StairsBase(
          POLISHED_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_MARBLE));
  public static final Block REDWOOD_LEAVES =
      new LeavesBlock(
          FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)
              .ticksRandomly()
              .sounds(BlockSoundGroup.GRASS)
              .strength(0.2f, 0.2f));
  public static final Block STRIPPED_REDWOOD_LOG =
      new PillarBlock(
          FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG)
              .sounds(BlockSoundGroup.WOOD)
              .strength(2.0f, 2.0f));
  public static final Block STRIPPED_REDWOOD_WOOD =
      new PillarBlock(
          FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD)
              .sounds(BlockSoundGroup.WOOD)
              .strength(2.0f, 2.0f));
  public static final Block REDWOOD_LOG = new StripableBlock(SPRUCE_LOG, STRIPPED_REDWOOD_LOG);
  public static final Block REDWOOD_WOOD = new StripableBlock(SPRUCE_WOOD, STRIPPED_REDWOOD_WOOD);
  public static final Block REDWOOD_PLANKS =
      new Block(
          FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)
              .sounds(BlockSoundGroup.WOOD)
              .strength(2.0f, 3.0f));
  public static final Block REDWOOD_SLAB =
      new SlabBlock(
          FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB)
              .sounds(BlockSoundGroup.WOOD)
              .strength(2.0f, 3.0f));
  public static final Block REDWOOD_STAIRS =
      new StairsBase(REDWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(REDWOOD_PLANKS));
  public static final Block REDWOOD_FENCE =
      new FenceBlock(
          FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE)
              .sounds(BlockSoundGroup.WOOD)
              .strength(2.0f, 3.0f));
  public static final Block REDWOOD_FENCE_GATE =
      new FenceGateBlock(
          FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE)
              .sounds(BlockSoundGroup.WOOD)
              .strength(2.0f, 3.0f),
          WoodType.SPRUCE);
  public static final Block REDWOOD_SAPLING =
      new SaplingBlock(
          new RedwoodSaplingGenerator(),
          AbstractBlock.Settings.create()
              .mapColor(MapColor.DARK_GREEN)
              .noCollision()
              .ticksRandomly()
              .breakInstantly()
              .sounds(BlockSoundGroup.GRASS)
              .pistonBehavior(PistonBehavior.DESTROY));
  public static final Block POTTED_REDWOOD_SAPLING =
      new FlowerPotBlock(
          ModInit.REDWOOD_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_SPRUCE_SAPLING));
  public static final Block REDWOOD_BUTTON =
      new ButtonBlock(
          (FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON)), BlockSetType.SPRUCE, 4, true);
  public static final Block REDWOOD_DOOR =
      new WoodDoorBase(FabricBlockSettings.copyOf(REDWOOD_PLANKS), BlockSetType.SPRUCE);
  public static final Block REDWOOD_PRESSURE_PLATE =
      new WoodPressurePlateBase(REDWOOD_PLANKS, BlockSetType.SPRUCE);
  public static final Block REDWOOD_TRAPDOOR =
      new WoodTrapdoorBase(REDWOOD_PLANKS, BlockSetType.SPRUCE);
  public static final Block DEEPSLATE_RUBY_ORE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)
              .requiresTool()
              .sounds(BlockSoundGroup.DEEPSLATE)
              .strength(3.0f, 3.0f));
  public static final Block DEEPSLATE_SAPPHIRE_ORE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)
              .requiresTool()
              .sounds(BlockSoundGroup.DEEPSLATE)
              .strength(3.0f, 3.0f));
  public static final Block DEEPSLATE_TANZANITE_ORE =
      new Block(
          FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)
              .requiresTool()
              .sounds(BlockSoundGroup.DEEPSLATE)
              .strength(3.0f, 3.0f));

  // Items
  public static final Item OBSIDIAN_ALLOY_INGOT = new Item(new Item.Settings());
  public static final Item RUBY = new Item(new Item.Settings());

  public static final Item SAPPHIRE = new Item(new Item.Settings());
  public static final Item TANZANITE = new Item(new Item.Settings());
  public static final Item STEEL_INGOT = new Item(new Item.Settings());
  public static final Item STEEL_BLEND = new Item(new Item.Settings());
  public static final Item OBSIDIAN_ALLOY_BLEND = new Item(new Item.Settings());
  public static final Item HONEY_BALL = new Item(new Item.Settings());
  public static final Item BEEF_STEW =
      new BowlFood(
          new Item.Settings()
              .maxCount(1)
              .food(new FoodComponent.Builder().hunger(12).saturationModifier(14.0F).build()));
  public static final Item BERRY_JUICE =
      new BottleFood(
          new Item.Settings()
              .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).build()));
  public static final EntityType<HoneySlime> HONEY_SLIME =
      Registry.register(
          Registries.ENTITY_TYPE,
          new Identifier(MOD_ID, "honey_slime"),
          FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HoneySlime::new)
              .dimensions(EntityDimensions.changing(2.04f, 2.04f))
              .trackRangeChunks(12)
              .build());

//Ruby
  public static final Item RUBY_HELMET = new ArmorItem(RUBY_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
  public static final Item RUBY_CHESTPLATE = new ArmorItem(RUBY_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
  public static final Item RUBY_LEGGINGS = new ArmorItem(RUBY_ARMOR,  ArmorItem.Type.LEGGINGS, new Item.Settings());
  public static final Item RUBY_BOOTS = new ArmorItem(RUBY_ARMOR,  ArmorItem.Type.BOOTS, new Item.Settings());

  public static final Item RUBY_PICKAXE = new PickaxeBase(new ToolMaterialRuby());
  public static final Item RUBY_SWORD = new SwordBase(new ToolMaterialRuby());
  public static final Item RUBY_AXE = new AxeBase(new ToolMaterialRuby());
  public static final Item RUBY_SHOVEL = new ShovelBase(new ToolMaterialRuby());
  public static final Item RUBY_HOE = new HoeBase(new ToolMaterialRuby());

//Sapphire
  public static final Item SAPPHIRE_HELMET = new ArmorItem(SAPPHIRE_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
  public static final Item SAPPHIRE_CHESTPLATE = new ArmorItem(SAPPHIRE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
  public static final Item SAPPHIRE_LEGGINGS = new ArmorItem(SAPPHIRE_ARMOR,  ArmorItem.Type.LEGGINGS, new Item.Settings());
  public static final Item SAPPHIRE_BOOTS = new ArmorItem(SAPPHIRE_ARMOR,  ArmorItem.Type.BOOTS, new Item.Settings());

  public static final Item SAPPHIRE_PICKAXE = new PickaxeBase(new ToolMaterialSapphire());
  public static final Item SAPPHIRE_SWORD = new SwordBase(new ToolMaterialSapphire());
  public static final Item SAPPHIRE_AXE = new AxeBase(new ToolMaterialSapphire());
  public static final Item SAPPHIRE_SHOVEL = new ShovelBase(new ToolMaterialSapphire());
  public static final Item SAPPHIRE_HOE = new HoeBase(new ToolMaterialSapphire());

//Tanzanite
  public static final Item TANZANITE_HELMET = new ArmorItem(TANZANITE_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
  public static final Item TANZANITE_CHESTPLATE = new ArmorItem(TANZANITE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
  public static final Item TANZANITE_LEGGINGS = new ArmorItem(TANZANITE_ARMOR,  ArmorItem.Type.LEGGINGS, new Item.Settings());
  public static final Item TANZANITE_BOOTS = new ArmorItem(TANZANITE_ARMOR,  ArmorItem.Type.BOOTS, new Item.Settings());

  public static final Item TANZANITE_PICKAXE = new PickaxeBase(new ToolMaterialTanzanite());
  public static final Item TANZANITE_SWORD = new SwordBase(new ToolMaterialTanzanite());
  public static final Item TANZANITE_AXE = new AxeBase(new ToolMaterialTanzanite());
  public static final Item TANZANITE_SHOVEL = new ShovelBase(new ToolMaterialTanzanite());
  public static final Item TANZANITE_HOE = new HoeBase(new ToolMaterialTanzanite());

//Emerald
  public static final Item EMERALD_HELMET = new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
  public static final Item EMERALD_CHESTPLATE = new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
  public static final Item EMERALD_LEGGINGS = new ArmorItem(EMERALD_ARMOR,  ArmorItem.Type.LEGGINGS, new Item.Settings());
  public static final Item EMERALD_BOOTS = new ArmorItem(EMERALD_ARMOR,  ArmorItem.Type.BOOTS, new Item.Settings());

  public static final Item EMERALD_PICKAXE = new PickaxeBase(new ToolMaterialEmerald());
  public static final Item EMERALD_SWORD = new SwordBase(new ToolMaterialEmerald());
  public static final Item EMERALD_AXE = new AxeBase(new ToolMaterialEmerald());
  public static final Item EMERALD_SHOVEL = new ShovelBase(new ToolMaterialEmerald());
  public static final Item EMERALD_HOE = new HoeBase(new ToolMaterialEmerald());

//Steel
  public static final Item STEEL_HELMET = new ArmorItem(STEEL_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
  public static final Item STEEL_CHESTPLATE = new ArmorItem(STEEL_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
  public static final Item STEEL_LEGGINGS = new ArmorItem(STEEL_ARMOR,  ArmorItem.Type.LEGGINGS, new Item.Settings());
  public static final Item STEEL_BOOTS = new ArmorItem(STEEL_ARMOR,  ArmorItem.Type.BOOTS, new Item.Settings());

  public static final Item STEEL_PICKAXE = new PickaxeBase(new ToolMaterialSteel());
  public static final Item STEEL_SWORD = new SwordBase(new ToolMaterialSteel());
  public static final Item STEEL_AXE = new AxeBase(new ToolMaterialSteel());
  public static final Item STEEL_SHOVEL = new ShovelBase(new ToolMaterialSteel());
  public static final Item STEEL_HOE = new HoeBase(new ToolMaterialSteel());

//Obsidian
  public static final Item OBSIDIAN_HELMET = new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
  public static final Item OBSIDIAN_CHESTPLATE = new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
  public static final Item OBSIDIAN_LEGGINGS = new ArmorItem(OBSIDIAN_ARMOR,  ArmorItem.Type.LEGGINGS, new Item.Settings());
  public static final Item OBSIDIAN_BOOTS = new ArmorItem(OBSIDIAN_ARMOR,  ArmorItem.Type.BOOTS, new Item.Settings());

  public static final Item OBSIDIAN_PICKAXE = new PickaxeBase(new ToolMaterialObsidian());
  public static final Item OBSIDIAN_SWORD = new SwordBase(new ToolMaterialObsidian());
  public static final Item OBSIDIAN_AXE = new AxeBase(new ToolMaterialObsidian());
  public static final Item OBSIDIAN_SHOVEL = new ShovelBase(new ToolMaterialObsidian());
  public static final Item OBSIDIAN_HOE = new HoeBase(new ToolMaterialObsidian());
  
//Copper
  public static final Item COPPER_PICKAXE = new PickaxeBase(new ToolMaterialCopper());
  public static final Item COPPER_SWORD = new SwordBase(new ToolMaterialCopper());
  public static final Item COPPER_AXE = new AxeBase(new ToolMaterialCopper());
  public static final Item COPPER_SHOVEL = new ShovelBase(new ToolMaterialCopper());
  public static final Item COPPER_HOE = new HoeBase(new ToolMaterialCopper());










  // Register
  public static void Register() {
    // Biome Blocks
    block("redwood_leaves", REDWOOD_LEAVES);
    blockItem("redwood_leaves", REDWOOD_LEAVES);
    block("redwood_log", REDWOOD_LOG);
    blockItem("redwood_log", REDWOOD_LOG);
    block("redwood_wood", REDWOOD_WOOD);
    blockItem("redwood_wood", REDWOOD_WOOD);
    block("redwood_planks", REDWOOD_PLANKS);
    blockItem("redwood_planks", REDWOOD_PLANKS);
    block("redwood_slab", REDWOOD_SLAB);
    blockItem("redwood_slab", REDWOOD_SLAB);
    block("redwood_stairs", REDWOOD_STAIRS);
    blockItem("redwood_stairs", REDWOOD_STAIRS);
    block("redwood_fence", REDWOOD_FENCE);
    blockItem("redwood_fence", REDWOOD_FENCE);
    block("redwood_fence_gate", REDWOOD_FENCE_GATE);
    blockItem("redwood_fence_gate", REDWOOD_FENCE_GATE);
    block("stripped_redwood_log", STRIPPED_REDWOOD_LOG);
    blockItem("stripped_redwood_log", STRIPPED_REDWOOD_LOG);
    block("stripped_redwood_wood", STRIPPED_REDWOOD_WOOD);
    blockItem("stripped_redwood_wood", STRIPPED_REDWOOD_WOOD);
    block("redwood_sapling", REDWOOD_SAPLING);
    blockItem("redwood_sapling", REDWOOD_SAPLING);
    block("redwood_button", REDWOOD_BUTTON);
    blockItem("redwood_button", REDWOOD_BUTTON);
    block("redwood_door", REDWOOD_DOOR);
    blockItem("redwood_door", REDWOOD_DOOR);
    block("redwood_trapdoor", REDWOOD_TRAPDOOR);
    blockItem("redwood_trapdoor", REDWOOD_TRAPDOOR);
    block("redwood_pressure_plate", REDWOOD_PRESSURE_PLATE);
    blockItem("redwood_pressure_plate", REDWOOD_PRESSURE_PLATE);
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
    // Food
    item("beef_stew", BEEF_STEW);
    item("berry_juice", BERRY_JUICE);
    // Obsidian Ingot/Block
    item("obsidian_alloy_ingot", OBSIDIAN_ALLOY_INGOT);
    item("obsidian_alloy_blend", OBSIDIAN_ALLOY_BLEND);
    block("obsidian_alloy_block", OBSIDIAN_ALLOY_BLOCK);
    blockItem("obsidian_alloy_block", OBSIDIAN_ALLOY_BLOCK);
    // Obsidian Tools
    item("obsidian_shovel", OBSIDIAN_SHOVEL);
    item("obsidian_pickaxe", OBSIDIAN_PICKAXE);
    item("obsidian_axe", OBSIDIAN_AXE);
    item("obsidian_sword", OBSIDIAN_SWORD);
    item("obsidian_hoe", OBSIDIAN_HOE);
    // Obsidian Armor
    item("obsidian_helmet", OBSIDIAN_HELMET);
    item("obsidian_chestplate", OBSIDIAN_CHESTPLATE);
    item("obsidian_leggings", OBSIDIAN_LEGGINGS);
    item("obsidian_boots", OBSIDIAN_BOOTS);
    // Emerald Tools
    item("emerald_shovel", EMERALD_SHOVEL);
    item("emerald_pickaxe", EMERALD_PICKAXE);
    item("emerald_axe", EMERALD_AXE);
    item("emerald_sword", EMERALD_SWORD);
    item("emerald_hoe", EMERALD_HOE);
    // Emerald Armor
    item("emerald_helmet", EMERALD_HELMET);
    item("emerald_chestplate", EMERALD_CHESTPLATE);
    item("emerald_leggings", EMERALD_LEGGINGS);
    item("emerald_boots", EMERALD_BOOTS);
    // Steel Ingot/Block
    item("steel_ingot", STEEL_INGOT);
    item("steel_blend", STEEL_BLEND);
    block("steel_block", STEEL_BLOCK);
    blockItem("steel_block", STEEL_BLOCK);
    // Steel Tools
    item("steel_shovel", STEEL_SHOVEL);
    item("steel_pickaxe", STEEL_PICKAXE);
    item("steel_axe", STEEL_AXE);
    item("steel_sword", STEEL_SWORD);
    item("steel_hoe", STEEL_HOE);
    // Steel Armor
    item("steel_helmet", STEEL_HELMET);
    item("steel_chestplate", STEEL_CHESTPLATE);
    item("steel_leggings", STEEL_LEGGINGS);
    item("steel_boots", STEEL_BOOTS);
    // Ruby Item/Block
    item("ruby", RUBY);
    block("ruby_ore", RUBY_ORE);
    blockItem("ruby_ore", RUBY_ORE);
    block("deepslate_ruby_ore", DEEPSLATE_RUBY_ORE);
    blockItem("deepslate_ruby_ore", DEEPSLATE_RUBY_ORE);
    block("ruby_block", RUBY_BLOCK);
    blockItem("ruby_block", RUBY_BLOCK);
    // Ruby Tools
    item("ruby_shovel", RUBY_SHOVEL);
    item("ruby_pickaxe", RUBY_PICKAXE);
    item("ruby_axe", RUBY_AXE);
    item("ruby_sword", RUBY_SWORD);
    item("ruby_hoe", RUBY_HOE);
    // Ruby Armor
    item("ruby_helmet", RUBY_HELMET);
    item("ruby_chestplate", RUBY_CHESTPLATE);
    item("ruby_leggings", RUBY_LEGGINGS);
    item("ruby_boots", RUBY_BOOTS);
    // Sapphire Item/Block
    item("sapphire", SAPPHIRE);
    block("sapphire_ore", SAPPHIRE_ORE);
    blockItem("sapphire_ore", SAPPHIRE_ORE);
    block("deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE);
    blockItem("deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE);
    block("sapphire_block", SAPPHIRE_BLOCK);
    blockItem("sapphire_block", SAPPHIRE_BLOCK);
    // Sapphire Tools
    item("sapphire_shovel", SAPPHIRE_SHOVEL);
    item("sapphire_pickaxe", SAPPHIRE_PICKAXE);
    item("sapphire_axe", SAPPHIRE_AXE);
    item("sapphire_sword", SAPPHIRE_SWORD);
    item("sapphire_hoe", SAPPHIRE_HOE);
    // Sapphire Armor
    item("sapphire_helmet", SAPPHIRE_HELMET);
    item("sapphire_chestplate", SAPPHIRE_CHESTPLATE);
    item("sapphire_leggings", SAPPHIRE_LEGGINGS);
    item("sapphire_boots", SAPPHIRE_BOOTS);
    // Tanzanite Item/Block
    item("tanzanite", TANZANITE);
    block("tanzanite_ore", TANZANITE_ORE);
    blockItem("tanzanite_ore", TANZANITE_ORE);
    block("deepslate_tanzanite_ore", DEEPSLATE_TANZANITE_ORE);
    blockItem("deepslate_tanzanite_ore", DEEPSLATE_TANZANITE_ORE);
    block("tanzanite_block", TANZANITE_BLOCK);
    blockItem("tanzanite_block", TANZANITE_BLOCK);
    // Tanzanite Tools
    item("tanzanite_shovel", TANZANITE_SHOVEL);
    item("tanzanite_pickaxe", TANZANITE_PICKAXE);
    item("tanzanite_axe", TANZANITE_AXE);
    item("tanzanite_sword", TANZANITE_SWORD);
    item("tanzanite_hoe", TANZANITE_HOE);
    // Tanzanite Armor
    item("tanzanite_helmet", TANZANITE_HELMET);
    item("tanzanite_chestplate", TANZANITE_CHESTPLATE);
    item("tanzanite_leggings", TANZANITE_LEGGINGS);
    item("tanzanite_boots", TANZANITE_BOOTS);
    // Copper Tools
    item("copper_shovel", COPPER_SHOVEL);
    item("copper_pickaxe", COPPER_PICKAXE);
    item("copper_axe", COPPER_AXE);
    item("copper_sword", COPPER_SWORD);
    item("copper_hoe", COPPER_HOE);
    // Dark Granite
    block("dark_granite", DARK_GRANITE);
    blockItem("dark_granite", DARK_GRANITE);
    block("dark_granite_slab", DARK_GRANITE_SLAB);
    blockItem("dark_granite_slab", DARK_GRANITE_SLAB);
    block("dark_granite_stairs", DARK_GRANITE_STAIRS);
    blockItem("dark_granite_stairs", DARK_GRANITE_STAIRS);
    block("dark_granite_wall", DARK_GRANITE_WALL);
    blockItem("dark_granite_wall", DARK_GRANITE_WALL);
    block("polished_dark_granite", POLISHED_DARK_GRANITE);
    blockItem("polished_dark_granite", POLISHED_DARK_GRANITE);
    block("polished_dark_granite_slab", POLISHED_DARK_GRANITE_SLAB);
    blockItem("polished_dark_granite_slab", POLISHED_DARK_GRANITE_SLAB);
    block("polished_dark_granite_stairs", POLISHED_DARK_GRANITE_STAIRS);
    blockItem("polished_dark_granite_stairs", POLISHED_DARK_GRANITE_STAIRS);
    // Marble
    block("marble", MARBLE);
    blockItem("marble", MARBLE);
    block("marble_slab", MARBLE_SLAB);
    blockItem("marble_slab", MARBLE_SLAB);
    block("marble_stairs", MARBLE_STAIRS);
    blockItem("marble_stairs", MARBLE_STAIRS);
    block("marble_wall", MARBLE_WALL);
    blockItem("marble_wall", MARBLE_WALL);
    block("polished_marble", POLISHED_MARBLE);
    blockItem("polished_marble", POLISHED_MARBLE);
    block("polished_marble_slab", POLISHED_MARBLE_SLAB);
    blockItem("polished_marble_slab", POLISHED_MARBLE_SLAB);
    block("polished_marble_stairs", POLISHED_MARBLE_STAIRS);
    blockItem("polished_marble_stairs", POLISHED_MARBLE_STAIRS);
    // Honey Slime
    FabricDefaultAttributeRegistry.register(HONEY_SLIME, HostileEntity.createHostileAttributes());
    Registry.register(
        Registries.ITEM,
        new Identifier(MOD_ID, "honey_slime_spawn_egg"),
        new SpawnEggItem(HONEY_SLIME, 0xffd700, 0xb39700, new Item.Settings()));
    item("honey_ball", HONEY_BALL);

    BiomeModifications.addFeature(
        BiomeSelectors.foundInOverworld(),
        GenerationStep.Feature.UNDERGROUND_ORES,
        RUBY_ORE_PLACED_KEY);
    BiomeModifications.addFeature(
        BiomeSelectors.foundInOverworld(),
        GenerationStep.Feature.UNDERGROUND_ORES,
        TANZANITE_ORE_PLACED_KEY);
    BiomeModifications.addFeature(
        BiomeSelectors.foundInOverworld(),
        GenerationStep.Feature.UNDERGROUND_ORES,
        SAPPHIRE_ORE_PLACED_KEY);
    BiomeModifications.addFeature(
        BiomeSelectors.foundInOverworld(),
        GenerationStep.Feature.UNDERGROUND_ORES,
        DARK_GRANITE_UP_KEY);
    BiomeModifications.addFeature(
        BiomeSelectors.foundInOverworld(),
        GenerationStep.Feature.UNDERGROUND_ORES,
        DARK_GRANITE_LOW_KEY);
    BiomeModifications.addFeature(
        BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, MARBLE_UP_KEY);
    BiomeModifications.addFeature(
        BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, MARBLE_LOW_KEY);

    ItemGroupEvents.modifyEntriesEvent(INGREDIENTS).register(entries -> entries.add(RUBY));
    ItemGroupEvents.modifyEntriesEvent(INGREDIENTS).register(entries -> entries.add(SAPPHIRE));
    ItemGroupEvents.modifyEntriesEvent(INGREDIENTS).register(entries -> entries.add(TANZANITE));
    ItemGroupEvents.modifyEntriesEvent(INGREDIENTS).register(entries -> entries.add(STEEL_INGOT));
    ItemGroupEvents.modifyEntriesEvent(INGREDIENTS).register(entries -> entries.add(STEEL_BLEND));
    ItemGroupEvents.modifyEntriesEvent(INGREDIENTS)
        .register(entries -> entries.add(OBSIDIAN_ALLOY_INGOT));
    ItemGroupEvents.modifyEntriesEvent(INGREDIENTS)
        .register(entries -> entries.add(OBSIDIAN_ALLOY_BLEND));
    ItemGroupEvents.modifyEntriesEvent(INGREDIENTS).register(entries -> entries.add(HONEY_BALL));
    ItemGroupEvents.modifyEntriesEvent(NATURAL).register(entries -> entries.add(REDWOOD_SAPLING));
    ItemGroupEvents.modifyEntriesEvent(FOOD_AND_DRINK).register(entries -> entries.add(BEEF_STEW));
    ItemGroupEvents.modifyEntriesEvent(FOOD_AND_DRINK).register(entries -> entries.add(BERRY_JUICE));

    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(RUBY_BLOCK));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(SAPPHIRE_BLOCK));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(TANZANITE_BLOCK));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(STEEL_BLOCK));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(OBSIDIAN_ALLOY_BLOCK));

    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS).register(entries -> entries.add(MARBLE));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(MARBLE_SLAB));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(MARBLE_STAIRS));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(MARBLE_WALL));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(POLISHED_MARBLE));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(POLISHED_MARBLE_SLAB));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(POLISHED_MARBLE_STAIRS));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(DARK_GRANITE));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(DARK_GRANITE_SLAB));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(DARK_GRANITE_STAIRS));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(DARK_GRANITE_WALL));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(POLISHED_DARK_GRANITE));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(POLISHED_DARK_GRANITE_SLAB));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(POLISHED_DARK_GRANITE_STAIRS));

    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_LOG));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_WOOD));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(STRIPPED_REDWOOD_LOG));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_PLANKS));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_SLAB));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_STAIRS));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_LEAVES));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_FENCE));

    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_FENCE_GATE));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_DOOR));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_BUTTON));
    ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS)
        .register(entries -> entries.add(REDWOOD_PRESSURE_PLATE));

    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(RUBY_HELMET));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(RUBY_CHESTPLATE));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(RUBY_LEGGINGS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(RUBY_BOOTS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(RUBY_SWORD));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(RUBY_SHOVEL));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(RUBY_PICKAXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(RUBY_AXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(RUBY_HOE));

    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(SAPPHIRE_HELMET));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(SAPPHIRE_CHESTPLATE));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(SAPPHIRE_LEGGINGS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(SAPPHIRE_BOOTS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(SAPPHIRE_SWORD));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(SAPPHIRE_SHOVEL));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(SAPPHIRE_PICKAXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(SAPPHIRE_AXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(SAPPHIRE_HOE));

    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(TANZANITE_HELMET));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(TANZANITE_CHESTPLATE));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(TANZANITE_LEGGINGS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(TANZANITE_BOOTS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(TANZANITE_SWORD));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(TANZANITE_SHOVEL));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(TANZANITE_PICKAXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(TANZANITE_AXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(TANZANITE_HOE));

    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(EMERALD_HELMET));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(EMERALD_CHESTPLATE));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(EMERALD_LEGGINGS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(EMERALD_BOOTS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(EMERALD_SWORD));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(EMERALD_SHOVEL));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(EMERALD_PICKAXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(EMERALD_AXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(EMERALD_HOE));

    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(OBSIDIAN_HELMET));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(OBSIDIAN_CHESTPLATE));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(OBSIDIAN_LEGGINGS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(OBSIDIAN_BOOTS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(OBSIDIAN_SWORD));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(OBSIDIAN_SHOVEL));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(OBSIDIAN_PICKAXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(OBSIDIAN_AXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(OBSIDIAN_HOE));

    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(STEEL_HELMET));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(STEEL_CHESTPLATE));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(STEEL_LEGGINGS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(STEEL_BOOTS));
    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(STEEL_SWORD));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(STEEL_SHOVEL));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(STEEL_PICKAXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(STEEL_AXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(STEEL_HOE));


    ItemGroupEvents.modifyEntriesEvent(COMBAT)
            .register(entries -> entries.add(COPPER_SWORD));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(COPPER_SHOVEL));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(COPPER_PICKAXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(COPPER_AXE));
    ItemGroupEvents.modifyEntriesEvent(TOOLS)
            .register(entries -> entries.add(COPPER_HOE));
  }

  public static <T> void register(Registry<T> type, String name, T element) {
    Registry.register(type, new Identifier(MOD_ID, name), element);
  }

  public static void item(String name, Item item) {
    register(Registries.ITEM, name, item);
  }

  public static void block(String name, Block block) {
    register(Registries.BLOCK, name, block);
  }

  public static void blockItem(String name, Block item) {
    item(name, new BlockItem(item, new Item.Settings()));
  }
}
