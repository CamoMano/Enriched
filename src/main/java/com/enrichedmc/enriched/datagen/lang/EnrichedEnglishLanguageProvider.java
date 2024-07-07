package com.enrichedmc.enriched.datagen.lang;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.entity.EnrichedEntityTypes;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.tag.EnrichedTags;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;

public class EnrichedEnglishLanguageProvider extends FabricLanguageProvider {
  public EnrichedEnglishLanguageProvider(
      FabricDataOutput dataOutput,
      CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
    super(dataOutput, "en_us", registryLookup);
  }

  @Override
  public void generateTranslations(
      RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
    /*-------------*/
    /* -- Items -- */
    /*-------------*/

    translationBuilder.add(EnrichedItems.RUBY, "Ruby");
    translationBuilder.add(EnrichedItems.SAPPHIRE, "Sapphire");
    translationBuilder.add(EnrichedItems.TANZANITE, "Tanzanite");
    translationBuilder.add(EnrichedItems.STEEL_BLEND, "Steel Blend");
    translationBuilder.add(EnrichedItems.STEEL_INGOT, "Steel Ingot");
    translationBuilder.add(EnrichedItems.OBSIDIAN_ALLOY_BLEND, "Obsidian Alloy Blend");
    translationBuilder.add(EnrichedItems.OBSIDIAN_ALLOY_INGOT, "Obsidian Alloy Ingot");
    translationBuilder.add(EnrichedItems.HONEY_BALL, "Honey Ball");
    translationBuilder.add(EnrichedItems.HONEY_SLIME_SPAWN_EGG, "Honey Slime Spawn Egg");

    /*--------------*/
    /* -- Blocks -- */
    /*--------------*/

    translationBuilder.add(EnrichedBlocks.RUBY_BLOCK, "Ruby Block");
    translationBuilder.add(EnrichedBlocks.RUBY_ORE, "Ruby Ore");
    translationBuilder.add(EnrichedBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");

    translationBuilder.add(EnrichedBlocks.SAPPHIRE_BLOCK, "Sapphire Block");
    translationBuilder.add(EnrichedBlocks.SAPPHIRE_ORE, "Sapphire Ore");
    translationBuilder.add(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE, "Deepslate Sapphire Ore");

    translationBuilder.add(EnrichedBlocks.TANZANITE_BLOCK, "Tanzanite Block");
    translationBuilder.add(EnrichedBlocks.TANZANITE_ORE, "Tanzanite Ore");
    translationBuilder.add(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE, "Deepslate Tanzanite Ore");

    translationBuilder.add(EnrichedBlocks.STEEL_BLOCK, "Steel Block");
    translationBuilder.add(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK, "Obsidian Alloy Block");

    translationBuilder.add(EnrichedBlocks.REDWOOD_LOG, "Redwood Log");
    translationBuilder.add(EnrichedTags.BlockTags.REDWOOD_LOGS, "Redwood Logs");
    translationBuilder.add(EnrichedTags.ItemTags.REDWOOD_LOGS, "Redwood Logs");
    translationBuilder.add(EnrichedBlocks.REDWOOD_WOOD, "Redwood Wood");
    translationBuilder.add(EnrichedBlocks.STRIPPED_REDWOOD_LOG, "Stripped Redwood Log");
    translationBuilder.add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD, "Stripped Redwood Wood");
    translationBuilder.add(EnrichedBlocks.REDWOOD_PLANKS, "Redwood Planks");
    translationBuilder.add(EnrichedBlocks.REDWOOD_LEAVES, "Redwood Leaves");
    translationBuilder.add(EnrichedBlocks.REDWOOD_SAPLING, "Redwood Sapling");
    translationBuilder.add(EnrichedBlocks.REDWOOD_BUTTON, "Redwood Button");
    translationBuilder.add(EnrichedBlocks.REDWOOD_DOOR, "Redwood Door");
    translationBuilder.add(EnrichedBlocks.REDWOOD_PRESSURE_PLATE, "Redwood Pressure Plate");
    translationBuilder.add(EnrichedBlocks.REDWOOD_TRAPDOOR, "Redwood Trapdoor");
    translationBuilder.add(EnrichedBlocks.REDWOOD_SLAB, "Redwood Slab");
    translationBuilder.add(EnrichedBlocks.REDWOOD_STAIRS, "Redwood Stairs");
    translationBuilder.add(EnrichedBlocks.REDWOOD_FENCE, "Redwood Fence");
    translationBuilder.add(EnrichedBlocks.REDWOOD_FENCE_GATE, "Redwood Fence Gate");

    translationBuilder.add(EnrichedBlocks.DARK_GRANITE, "Dark Granite");
    translationBuilder.add(EnrichedBlocks.DARK_GRANITE_SLAB, "Dark Granite Slab");
    translationBuilder.add(EnrichedBlocks.DARK_GRANITE_STAIRS, "Dark Granite Stairs");
    translationBuilder.add(EnrichedBlocks.DARK_GRANITE_WALL, "Dark Granite Wall");
    translationBuilder.add(EnrichedBlocks.POLISHED_DARK_GRANITE, "Polished Dark Granite");
    translationBuilder.add(EnrichedBlocks.POLISHED_DARK_GRANITE_SLAB, "Polished Dark Granite Slab");
    translationBuilder.add(
        EnrichedBlocks.POLISHED_DARK_GRANITE_STAIRS, "Polished Dark Granite Stairs");

    translationBuilder.add(EnrichedBlocks.MARBLE, "Marble");
    translationBuilder.add(EnrichedBlocks.MARBLE_SLAB, "Marble Slab");
    translationBuilder.add(EnrichedBlocks.MARBLE_STAIRS, "Marble Stairs");
    translationBuilder.add(EnrichedBlocks.MARBLE_WALL, "Marble Wall");
    translationBuilder.add(EnrichedBlocks.POLISHED_MARBLE, "Polished Marble");
    translationBuilder.add(EnrichedBlocks.POLISHED_MARBLE_SLAB, "Polished Marble Slab");
    translationBuilder.add(EnrichedBlocks.POLISHED_MARBLE_STAIRS, "Polished Marble Stairs");

    /*-------------*/
    /* -- Tools -- */
    /*-------------*/

    this.addToolTranslations(
        translationBuilder,
        EnrichedItems.RUBY_SWORD,
        EnrichedItems.RUBY_SHOVEL,
        EnrichedItems.RUBY_PICKAXE,
        EnrichedItems.RUBY_AXE,
        EnrichedItems.RUBY_HOE,
        "Ruby Sword",
        "Ruby Shovel",
        "Ruby Pickaxe",
        "Ruby Axe",
        "Ruby Hoe");

    this.addToolTranslations(
        translationBuilder,
        EnrichedItems.SAPPHIRE_SWORD,
        EnrichedItems.SAPPHIRE_SHOVEL,
        EnrichedItems.SAPPHIRE_PICKAXE,
        EnrichedItems.SAPPHIRE_AXE,
        EnrichedItems.SAPPHIRE_HOE,
        "Sapphire Sword",
        "Sapphire Shovel",
        "Sapphire Pickaxe",
        "Sapphire Axe",
        "Sapphire Hoe");

    this.addToolTranslations(
        translationBuilder,
        EnrichedItems.TANZANITE_SWORD,
        EnrichedItems.TANZANITE_SHOVEL,
        EnrichedItems.TANZANITE_PICKAXE,
        EnrichedItems.TANZANITE_AXE,
        EnrichedItems.TANZANITE_HOE,
        "Tanzanite Sword",
        "Tanzanite Shovel",
        "Tanzanite Pickaxe",
        "Tanzanite Axe",
        "Tanzanite Hoe");

    this.addToolTranslations(
        translationBuilder,
        EnrichedItems.STEEL_SWORD,
        EnrichedItems.STEEL_SHOVEL,
        EnrichedItems.STEEL_PICKAXE,
        EnrichedItems.STEEL_AXE,
        EnrichedItems.STEEL_HOE,
        "Steel Sword",
        "Steel Shovel",
        "Steel Pickaxe",
        "Steel Axe",
        "Steel Hoe");

    this.addToolTranslations(
        translationBuilder,
        EnrichedItems.OBSIDIAN_SWORD,
        EnrichedItems.OBSIDIAN_SHOVEL,
        EnrichedItems.OBSIDIAN_PICKAXE,
        EnrichedItems.OBSIDIAN_AXE,
        EnrichedItems.OBSIDIAN_HOE,
        "Obsidian Sword",
        "Obsidian Shovel",
        "Obsidian Pickaxe",
        "Obsidian Axe",
        "Obsidian Hoe");

    this.addToolTranslations(
        translationBuilder,
        EnrichedItems.EMERALD_SWORD,
        EnrichedItems.EMERALD_SHOVEL,
        EnrichedItems.EMERALD_PICKAXE,
        EnrichedItems.EMERALD_AXE,
        EnrichedItems.EMERALD_HOE,
        "Emerald Sword",
        "Emerald Shovel",
        "Emerald Pickaxe",
        "Emerald Axe",
        "Emerald Hoe");

    this.addToolTranslations(
        translationBuilder,
        EnrichedItems.COPPER_SWORD,
        EnrichedItems.COPPER_SHOVEL,
        EnrichedItems.COPPER_PICKAXE,
        EnrichedItems.COPPER_AXE,
        EnrichedItems.COPPER_HOE,
        "Copper Sword",
        "Copper Shovel",
        "Copper Pickaxe",
        "Copper Axe",
        "Copper Hoe");

    /*-------------*/
    /* -- Armor -- */
    /*-------------*/

    this.addArmorTranslations(
        translationBuilder,
        EnrichedItems.RUBY_HELMET,
        EnrichedItems.RUBY_CHESTPLATE,
        EnrichedItems.RUBY_LEGGINGS,
        EnrichedItems.RUBY_BOOTS,
        "Ruby Helmet",
        "Ruby Chestplate",
        "Ruby Leggings",
        "Ruby Boots");

    this.addArmorTranslations(
        translationBuilder,
        EnrichedItems.SAPPHIRE_HELMET,
        EnrichedItems.SAPPHIRE_CHESTPLATE,
        EnrichedItems.SAPPHIRE_LEGGINGS,
        EnrichedItems.SAPPHIRE_BOOTS,
        "Sapphire Helmet",
        "Sapphire Chestplate",
        "Sapphire Leggings",
        "Sapphire Boots");

    this.addArmorTranslations(
        translationBuilder,
        EnrichedItems.TANZANITE_HELMET,
        EnrichedItems.TANZANITE_CHESTPLATE,
        EnrichedItems.TANZANITE_LEGGINGS,
        EnrichedItems.TANZANITE_BOOTS,
        "Tanzanite Helmet",
        "Tanzanite Chestplate",
        "Tanzanite Leggings",
        "Tanzanite Boots");

    this.addArmorTranslations(
        translationBuilder,
        EnrichedItems.STEEL_HELMET,
        EnrichedItems.STEEL_CHESTPLATE,
        EnrichedItems.STEEL_LEGGINGS,
        EnrichedItems.STEEL_BOOTS,
        "Steel Helmet",
        "Steel Chestplate",
        "Steel Leggings",
        "Steel Boots");

    this.addArmorTranslations(
        translationBuilder,
        EnrichedItems.OBSIDIAN_HELMET,
        EnrichedItems.OBSIDIAN_CHESTPLATE,
        EnrichedItems.OBSIDIAN_LEGGINGS,
        EnrichedItems.OBSIDIAN_BOOTS,
        "Obsidian Helmet",
        "Obsidian Chestplate",
        "Obsidian Leggings",
        "Obsidian Boots");

    this.addArmorTranslations(
        translationBuilder,
        EnrichedItems.EMERALD_HELMET,
        EnrichedItems.EMERALD_CHESTPLATE,
        EnrichedItems.EMERALD_LEGGINGS,
        EnrichedItems.EMERALD_BOOTS,
        "Emerald Helmet",
        "Emerald Chestplate",
        "Emerald Leggings",
        "Emerald Boots");

    /*------------*/
    /* -- Food -- */
    /*------------*/

    translationBuilder.add(EnrichedItems.BEEF_STEW, "Beef Stew");
    translationBuilder.add(EnrichedItems.BERRY_JUICE, "Berry Juice");

    /*----------------*/
    /* -- Entities -- */
    /*----------------*/

    translationBuilder.add(EnrichedEntityTypes.HONEY_SLIME, "Honey Slime");

    /*---------------*/
    /* -- Options -- */
    /*---------------*/

    translationBuilder.add("enriched.options.category.toolsAndArmor", "Tools and Armor");
    translationBuilder.add("enriched.options.toolsAndArmor.enableRubyGear", "Enable Ruby Gear");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableRubyGear.description",
        "Enables/disables the recipes for Ruby gear and tools.");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableSapphireGear", "Enable Sapphire Gear");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableSapphireGear.description",
        "Enables/disables the recipes for Sapphire gear and tools.");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableTanzaniteGear", "Enable Tanzanite Gear");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableTanzaniteGear.description",
        "Enables/disables the recipes for Tanzanite gear and tools.");
    translationBuilder.add("enriched.options.toolsAndArmor.enableSteelGear", "Enable Steel Gear");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableSteelGear.description",
        "Enables/disables the recipes for Steel gear and tools.");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableObsidianGear", "Enable Obsidian Gear");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableObsidianGear.description",
        "Enables/disables the recipes for Obsidian gear and tools.");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableEmeraldGear", "Enable Emerald Gear");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableEmeraldGear.description",
        "Enables/disables the recipes for Emerald gear and tools.");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableCopperTools", "Enable Copper Tools");
    translationBuilder.add(
        "enriched.options.toolsAndArmor.enableCopperTools.description",
        "Enables/disables the recipes for Copper tools.");

    translationBuilder.add("enriched.options.category.recipes", "Recipes");
    translationBuilder.add(
        "enriched.options.recipes.enableHorseArmorRecipes", "Enable Horse Armor Recipes");
    translationBuilder.add(
        "enriched.options.recipes.enableHorseArmorRecipes.description",
        "Enables/disables for the recipes for horse armor.");
    translationBuilder.add(
        "enriched.options.recipes.enableChainmailRecipes", "Enable Chainmail Recipes");
    translationBuilder.add(
        "enriched.options.recipes.enableChainmailRecipes.description",
        "Enables/disables the recipes for Chainmail armor.");
    translationBuilder.add(
        "enriched.options.recipes.enableRawSmeltingRecipes", "Enable Raw Smelting Recipes");
    translationBuilder.add(
        "enriched.options.recipes.enableRawSmeltingRecipes.description",
        "Enable/disables the recipes for getting a block from smelting or blasting its raw version. (Example: Raw Gold Block -> Gold Block)");
    translationBuilder.add(
        "enriched.options.recipes.enableUncraftingRecipes", "Enable Uncrafting Recipes");
    translationBuilder.add(
        "enriched.options.recipes.enableUncraftingRecipes.description",
        "Enables/disables the recipes for getting items from certain blocks. (Example: Wool -> String)");

    translationBuilder.add("enriched.options.category.mobs", "Mobs");
    translationBuilder.add(
        "enriched.options.mobs.enableHoneySlimeSpawning", "Enable Honey Slime Spawning");
    translationBuilder.add(
        "enriched.options.mobs.enableHoneySlimeSpawning.description",
        "Enables/disables the Honey Slime from potentially spawning when harvesting a beehive.");

    translationBuilder.add("enriched.options.category.worldGeneration", "World Generation");
    translationBuilder.add(
        "enriched.options.category.worldGeneration.description",
        "All of these options relate to Enriched's ability to generate its own blocks in a world. All of these settings §lMUST§r be set to your desired values prior to creating a world and require a restart to take effect.");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateRubyOres", "Generate Ruby Ores");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateRubyOres.description",
        "Enables/disables the generation of Ruby ores in a world.");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateSapphireOres", "Generate Sapphire Ores");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateSapphireOres.description",
        "Enables/disables the generation of Sapphire ores in a world.");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateTanzaniteOres", "Generate Tanzanite Ores");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateTanzaniteOres.description",
        "Enables/disables the generation of Tanzanite ores in a world.");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateDarkGranite", "Generate Dark Granite");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateDarkGranite.description",
        "Enables/disables the generation of Dark Granite in a world.");
    translationBuilder.add("enriched.options.worldGeneration.generateMarble", "Generate Marble");
    translationBuilder.add(
        "enriched.options.worldGeneration.generateMarble.description",
        "Enables/disables the generation of Marble in a world.");
  }

  private void addToolTranslations(
      TranslationBuilder translationBuilder,
      Item sword,
      Item shovel,
      Item pickaxe,
      Item axe,
      Item hoe,
      String swordText,
      String shovelText,
      String pickaxeText,
      String axeText,
      String hoeText) {
    translationBuilder.add(sword, swordText);
    translationBuilder.add(shovel, shovelText);
    translationBuilder.add(pickaxe, pickaxeText);
    translationBuilder.add(axe, axeText);
    translationBuilder.add(hoe, hoeText);
  }

  private void addArmorTranslations(
      TranslationBuilder translationBuilder,
      ArmorItem helmet,
      ArmorItem chestplate,
      ArmorItem leggings,
      ArmorItem boots,
      String helmetText,
      String chestplateText,
      String leggingsText,
      String bootsText) {
    translationBuilder.add(helmet, helmetText);
    translationBuilder.add(chestplate, chestplateText);
    translationBuilder.add(leggings, leggingsText);
    translationBuilder.add(boots, bootsText);
  }
}
