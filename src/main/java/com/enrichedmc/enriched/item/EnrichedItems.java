package com.enrichedmc.enriched.item;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.item.food.EnrichedFoodComponents;
import com.enrichedmc.enriched.materials.armor.EnrichedArmorMaterials;
import com.enrichedmc.enriched.materials.tool.EnrichedToolMaterials;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class EnrichedItems {
  public static final Item RUBY;
  public static final Item SAPPHIRE;
  public static final Item TANZANITE;

  public static final Item AMBER;

  public static final Item TOPAZ;
  public static final Item STEEL_BLEND;
  public static final Item STEEL_INGOT;

  public static final Item BRONZE_BLEND;
  public static final Item BRONZE_INGOT;

  public static final Item TIN_INGOT;
  public static final Item RAW_TIN;
  public static final Item OBSIDIAN_ALLOY_BLEND;
  public static final Item OBSIDIAN_ALLOY_INGOT;

  public static final Item BEEF_STEW;
  public static final Item BERRY_JUICE;

  public static final Item RUBY_SWORD;
  public static final Item RUBY_SHOVEL;
  public static final Item RUBY_PICKAXE;
  public static final Item RUBY_AXE;
  public static final Item RUBY_HOE;
  public static final Item SAPPHIRE_SWORD;
  public static final Item SAPPHIRE_SHOVEL;
  public static final Item SAPPHIRE_PICKAXE;
  public static final Item SAPPHIRE_AXE;
  public static final Item SAPPHIRE_HOE;
  public static final Item TANZANITE_SWORD;
  public static final Item TANZANITE_SHOVEL;
  public static final Item TANZANITE_PICKAXE;
  public static final Item TANZANITE_AXE;
  public static final Item TANZANITE_HOE;
  public static final Item STEEL_SWORD;
  public static final Item STEEL_SHOVEL;
  public static final Item STEEL_PICKAXE;
  public static final Item STEEL_AXE;
  public static final Item STEEL_HOE;
  public static final Item OBSIDIAN_SWORD;
  public static final Item OBSIDIAN_SHOVEL;
  public static final Item OBSIDIAN_PICKAXE;
  public static final Item OBSIDIAN_AXE;
  public static final Item OBSIDIAN_HOE;
  public static final Item EMERALD_SWORD;
  public static final Item EMERALD_SHOVEL;
  public static final Item EMERALD_PICKAXE;
  public static final Item EMERALD_AXE;
  public static final Item EMERALD_HOE;
  public static final Item COPPER_SWORD;
  public static final Item COPPER_SHOVEL;
  public static final Item COPPER_PICKAXE;
  public static final Item COPPER_AXE;
  public static final Item COPPER_HOE;
  public static final Item BRONZE_SWORD;
  public static final Item BRONZE_SHOVEL;
  public static final Item BRONZE_PICKAXE;
  public static final Item BRONZE_AXE;
  public static final Item BRONZE_HOE;

  public static final Item RUBY_HELMET;
  public static final Item RUBY_CHESTPLATE;
  public static final Item RUBY_LEGGINGS;
  public static final Item RUBY_BOOTS;
  public static final Item SAPPHIRE_HELMET;
  public static final Item SAPPHIRE_CHESTPLATE;
  public static final Item SAPPHIRE_LEGGINGS;
  public static final Item SAPPHIRE_BOOTS;
  public static final Item TANZANITE_HELMET;
  public static final Item TANZANITE_CHESTPLATE;
  public static final Item TANZANITE_LEGGINGS;
  public static final Item TANZANITE_BOOTS;
  public static final Item STEEL_HELMET;
  public static final Item STEEL_CHESTPLATE;
  public static final Item STEEL_LEGGINGS;
  public static final Item STEEL_BOOTS;
  public static final Item OBSIDIAN_HELMET;
  public static final Item OBSIDIAN_CHESTPLATE;
  public static final Item OBSIDIAN_LEGGINGS;
  public static final Item OBSIDIAN_BOOTS;
  public static final Item EMERALD_HELMET;
  public static final Item EMERALD_CHESTPLATE;
  public static final Item EMERALD_LEGGINGS;
  public static final Item EMERALD_BOOTS;

  public static final Item BRONZE_HELMET;
  public static final Item BRONZE_CHESTPLATE;
  public static final Item BRONZE_LEGGINGS;
  public static final Item BRONZE_BOOTS;

  static {
    RUBY = EnrichedRegisters.registerItem("ruby", Item::new);
    SAPPHIRE = EnrichedRegisters.registerItem("sapphire", Item::new);
    TANZANITE = EnrichedRegisters.registerItem("tanzanite", Item::new);
    AMBER = EnrichedRegisters.registerItem("amber", Item::new);
    TOPAZ = EnrichedRegisters.registerItem("topaz", Item::new);
    STEEL_BLEND = EnrichedRegisters.registerItem("steel_blend", Item::new);
    STEEL_INGOT = EnrichedRegisters.registerItem("steel_ingot", Item::new);
    TIN_INGOT = EnrichedRegisters.registerItem("tin_ingot", Item::new);
    BRONZE_BLEND = EnrichedRegisters.registerItem("bronze_blend", Item::new);
    BRONZE_INGOT = EnrichedRegisters.registerItem("bronze_ingot", Item::new);
    RAW_TIN = EnrichedRegisters.registerItem("raw_tin", Item::new);
    OBSIDIAN_ALLOY_BLEND = EnrichedRegisters.registerItem("obsidian_alloy_blend", Item::new);
    OBSIDIAN_ALLOY_INGOT = EnrichedRegisters.registerItem("obsidian_alloy_ingot", Item::new);

    /*-------------*/
    /* -- Tools -- */
    /*-------------*/

    RUBY_SWORD = registerSword("ruby_sword", EnrichedToolMaterials.RUBY);
    RUBY_SHOVEL = registerShovel("ruby_shovel", EnrichedToolMaterials.RUBY);
    RUBY_PICKAXE = registerPickaxe("ruby_pickaxe", EnrichedToolMaterials.RUBY);
    RUBY_AXE = registerAxe("ruby_axe", EnrichedToolMaterials.RUBY);
    RUBY_HOE = registerHoe("ruby_hoe", EnrichedToolMaterials.RUBY);

    SAPPHIRE_SWORD = registerSword("sapphire_sword", EnrichedToolMaterials.SAPPHIRE);
    SAPPHIRE_SHOVEL = registerShovel("sapphire_shovel", EnrichedToolMaterials.SAPPHIRE);
    SAPPHIRE_PICKAXE = registerPickaxe("sapphire_pickaxe", EnrichedToolMaterials.SAPPHIRE);
    SAPPHIRE_AXE = registerAxe("sapphire_axe", EnrichedToolMaterials.SAPPHIRE);
    SAPPHIRE_HOE = registerHoe("sapphire_hoe", EnrichedToolMaterials.SAPPHIRE);

    TANZANITE_SWORD = registerSword("tanzanite_sword", EnrichedToolMaterials.TANZANITE);
    TANZANITE_SHOVEL = registerShovel("tanzanite_shovel", EnrichedToolMaterials.TANZANITE);
    TANZANITE_PICKAXE = registerPickaxe("tanzanite_pickaxe", EnrichedToolMaterials.TANZANITE);
    TANZANITE_AXE = registerAxe("tanzanite_axe", EnrichedToolMaterials.TANZANITE);
    TANZANITE_HOE = registerHoe("tanzanite_hoe", EnrichedToolMaterials.TANZANITE);

    STEEL_SWORD = registerSword("steel_sword", EnrichedToolMaterials.STEEL);
    STEEL_SHOVEL = registerShovel("steel_shovel", EnrichedToolMaterials.STEEL);
    STEEL_PICKAXE = registerPickaxe("steel_pickaxe", EnrichedToolMaterials.STEEL);
    STEEL_AXE = registerAxe("steel_axe", EnrichedToolMaterials.STEEL);
    STEEL_HOE = registerHoe("steel_hoe", EnrichedToolMaterials.STEEL);

    OBSIDIAN_SWORD = registerSword("obsidian_sword", EnrichedToolMaterials.OBSIDIAN);
    OBSIDIAN_SHOVEL = registerShovel("obsidian_shovel", EnrichedToolMaterials.OBSIDIAN);
    OBSIDIAN_PICKAXE = registerPickaxe("obsidian_pickaxe", EnrichedToolMaterials.OBSIDIAN);
    OBSIDIAN_AXE = registerAxe("obsidian_axe", EnrichedToolMaterials.OBSIDIAN);
    OBSIDIAN_HOE = registerHoe("obsidian_hoe", EnrichedToolMaterials.OBSIDIAN);

    EMERALD_SWORD = registerSword("emerald_sword", EnrichedToolMaterials.EMERALD);
    EMERALD_SHOVEL = registerShovel("emerald_shovel", EnrichedToolMaterials.EMERALD);
    EMERALD_PICKAXE = registerPickaxe("emerald_pickaxe", EnrichedToolMaterials.EMERALD);
    EMERALD_AXE = registerAxe("emerald_axe", EnrichedToolMaterials.EMERALD);
    EMERALD_HOE = registerHoe("emerald_hoe", EnrichedToolMaterials.EMERALD);

    COPPER_SWORD = registerSword("copper_sword", EnrichedToolMaterials.COPPER);
    COPPER_SHOVEL = registerShovel("copper_shovel", EnrichedToolMaterials.COPPER);
    COPPER_PICKAXE = registerPickaxe("copper_pickaxe", EnrichedToolMaterials.COPPER);
    COPPER_AXE = registerAxe("copper_axe", EnrichedToolMaterials.COPPER);
    COPPER_HOE = registerHoe("copper_hoe", EnrichedToolMaterials.COPPER);

    BRONZE_SWORD = registerSword("bronze_sword", EnrichedToolMaterials.BRONZE);
    BRONZE_SHOVEL = registerShovel("bronze_shovel", EnrichedToolMaterials.BRONZE);
    BRONZE_PICKAXE = registerPickaxe("bronze_pickaxe", EnrichedToolMaterials.BRONZE);
    BRONZE_AXE = registerAxe("bronze_axe", EnrichedToolMaterials.BRONZE);
    BRONZE_HOE = registerHoe("bronze_hoe", EnrichedToolMaterials.BRONZE);

    /*-------------*/
    /* -- Armor -- */
    /*-------------*/

    RUBY_HELMET = registerArmor("ruby_helmet", EnrichedArmorMaterials.RUBY, ArmorType.HELMET);
    RUBY_CHESTPLATE =
        registerArmor("ruby_chestplate", EnrichedArmorMaterials.RUBY, ArmorType.CHESTPLATE);
    RUBY_LEGGINGS = registerArmor("ruby_leggings", EnrichedArmorMaterials.RUBY, ArmorType.LEGGINGS);
    RUBY_BOOTS = registerArmor("ruby_boots", EnrichedArmorMaterials.RUBY, ArmorType.BOOTS);

    SAPPHIRE_HELMET =
        registerArmor("sapphire_helmet", EnrichedArmorMaterials.SAPPHIRE, ArmorType.HELMET);
    SAPPHIRE_CHESTPLATE =
        registerArmor("sapphire_chestplate", EnrichedArmorMaterials.SAPPHIRE, ArmorType.CHESTPLATE);
    SAPPHIRE_LEGGINGS =
        registerArmor("sapphire_leggings", EnrichedArmorMaterials.SAPPHIRE, ArmorType.LEGGINGS);
    SAPPHIRE_BOOTS =
        registerArmor("sapphire_boots", EnrichedArmorMaterials.SAPPHIRE, ArmorType.BOOTS);

    TANZANITE_HELMET =
        registerArmor("tanzanite_helmet", EnrichedArmorMaterials.TANZANITE, ArmorType.HELMET);
    TANZANITE_CHESTPLATE =
        registerArmor(
            "tanzanite_chestplate", EnrichedArmorMaterials.TANZANITE, ArmorType.CHESTPLATE);
    TANZANITE_LEGGINGS =
        registerArmor("tanzanite_leggings", EnrichedArmorMaterials.TANZANITE, ArmorType.LEGGINGS);
    TANZANITE_BOOTS =
        registerArmor("tanzanite_boots", EnrichedArmorMaterials.TANZANITE, ArmorType.BOOTS);

    STEEL_HELMET = registerArmor("steel_helmet", EnrichedArmorMaterials.STEEL, ArmorType.HELMET);
    STEEL_CHESTPLATE =
        registerArmor("steel_chestplate", EnrichedArmorMaterials.STEEL, ArmorType.CHESTPLATE);
    STEEL_LEGGINGS =
        registerArmor("steel_leggings", EnrichedArmorMaterials.STEEL, ArmorType.LEGGINGS);
    STEEL_BOOTS = registerArmor("steel_boots", EnrichedArmorMaterials.STEEL, ArmorType.BOOTS);

    OBSIDIAN_HELMET =
        registerArmor("obsidian_helmet", EnrichedArmorMaterials.OBSIDIAN, ArmorType.HELMET);
    OBSIDIAN_CHESTPLATE =
        registerArmor("obsidian_chestplate", EnrichedArmorMaterials.OBSIDIAN, ArmorType.CHESTPLATE);
    OBSIDIAN_LEGGINGS =
        registerArmor("obsidian_leggings", EnrichedArmorMaterials.OBSIDIAN, ArmorType.LEGGINGS);
    OBSIDIAN_BOOTS =
        registerArmor("obsidian_boots", EnrichedArmorMaterials.OBSIDIAN, ArmorType.BOOTS);

    EMERALD_HELMET =
        registerArmor("emerald_helmet", EnrichedArmorMaterials.EMERALD, ArmorType.HELMET);
    EMERALD_CHESTPLATE =
        registerArmor("emerald_chestplate", EnrichedArmorMaterials.EMERALD, ArmorType.CHESTPLATE);
    EMERALD_LEGGINGS =
        registerArmor("emerald_leggings", EnrichedArmorMaterials.EMERALD, ArmorType.LEGGINGS);
    EMERALD_BOOTS = registerArmor("emerald_boots", EnrichedArmorMaterials.EMERALD, ArmorType.BOOTS);

    BRONZE_HELMET = registerArmor("bronze_helmet", EnrichedArmorMaterials.BRONZE, ArmorType.HELMET);
    BRONZE_CHESTPLATE =
        registerArmor("bronze_chestplate", EnrichedArmorMaterials.BRONZE, ArmorType.CHESTPLATE);
    BRONZE_LEGGINGS =
        registerArmor("bronze_leggings", EnrichedArmorMaterials.BRONZE, ArmorType.LEGGINGS);
    BRONZE_BOOTS = registerArmor("bronze_boots", EnrichedArmorMaterials.BRONZE, ArmorType.BOOTS);

    /*------------*/
    /* -- Food -- */
    /*------------*/

    BEEF_STEW =
        EnrichedRegisters.registerItem(
            "beef_stew", properties -> new Item(properties.food(EnrichedFoodComponents.BEEF_STEW)));

    BERRY_JUICE =
        EnrichedRegisters.registerItem(
            "berry_juice",
            properties -> new Item(properties.food(EnrichedFoodComponents.BERRY_JUICE)));

    EnrichedItems.registerItemsToItemGroups();
  }

  public static void registerItems() {
    EnrichedMod.LOGGER.info("Registering Enriched's items...");
  }

  private static Item registerSword(String name, ToolMaterial material) {
    return EnrichedRegisters.registerItem(
        name, properties -> new Item(properties.sword(material, -1.0f, -2.4f)));
  }

  private static Item registerShovel(String name, ToolMaterial material) {
    return EnrichedRegisters.registerItem(
        name, properties -> new Item(properties.shovel(material, -1.0f, -3.0f)));
  }

  private static Item registerPickaxe(String name, ToolMaterial material) {
    return EnrichedRegisters.registerItem(
        name, properties -> new Item(properties.pickaxe(material, -1.0f, -2.8f)));
  }

  private static Item registerAxe(String name, ToolMaterial material) {
    return EnrichedRegisters.registerItem(
        name, properties -> new Item(properties.axe(material, 2.0f, -3.0f)));
  }

  private static Item registerHoe(String name, ToolMaterial material) {
    return EnrichedRegisters.registerItem(
        name, properties -> new Item(properties.hoe(material, -4.0f, 0.0f)));
  }

  private static Item registerArmor(String name, ArmorMaterial material, ArmorType armorType) {
    return EnrichedRegisters.registerItem(
        name, properties -> new Item(properties.humanoidArmor(material, armorType)));
  }

  private static void registerItemsToItemGroups() {
    EnrichedRegisters.registerToItemGroup(RUBY, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(SAPPHIRE, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(TANZANITE, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(AMBER, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(TOPAZ, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(STEEL_BLEND, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(STEEL_INGOT, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(BRONZE_BLEND, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(BRONZE_INGOT, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(TIN_INGOT, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_BLEND, CreativeModeTabs.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_INGOT, CreativeModeTabs.INGREDIENTS);

    /*-------------*/
    /* -- Tools -- */
    /*-------------*/

    EnrichedItems.registerToolsToItemGroup(
        EnrichedItems.RUBY_SWORD,
        EnrichedItems.RUBY_SHOVEL,
        EnrichedItems.RUBY_PICKAXE,
        EnrichedItems.RUBY_AXE,
        EnrichedItems.RUBY_HOE);

    EnrichedItems.registerToolsToItemGroup(
        EnrichedItems.SAPPHIRE_SWORD,
        EnrichedItems.SAPPHIRE_SHOVEL,
        EnrichedItems.SAPPHIRE_PICKAXE,
        EnrichedItems.SAPPHIRE_AXE,
        EnrichedItems.SAPPHIRE_HOE);

    EnrichedItems.registerToolsToItemGroup(
        EnrichedItems.TANZANITE_SWORD,
        EnrichedItems.TANZANITE_SHOVEL,
        EnrichedItems.TANZANITE_PICKAXE,
        EnrichedItems.TANZANITE_AXE,
        EnrichedItems.TANZANITE_HOE);

    EnrichedItems.registerToolsToItemGroup(
        EnrichedItems.STEEL_SWORD,
        EnrichedItems.STEEL_SHOVEL,
        EnrichedItems.STEEL_PICKAXE,
        EnrichedItems.STEEL_AXE,
        EnrichedItems.STEEL_HOE);

    EnrichedItems.registerToolsToItemGroup(
        EnrichedItems.OBSIDIAN_SWORD,
        EnrichedItems.OBSIDIAN_SHOVEL,
        EnrichedItems.OBSIDIAN_PICKAXE,
        EnrichedItems.OBSIDIAN_AXE,
        EnrichedItems.OBSIDIAN_HOE);

    EnrichedItems.registerToolsToItemGroup(
        EnrichedItems.EMERALD_SWORD,
        EnrichedItems.EMERALD_SHOVEL,
        EnrichedItems.EMERALD_PICKAXE,
        EnrichedItems.EMERALD_AXE,
        EnrichedItems.EMERALD_HOE);

    EnrichedItems.registerToolsToItemGroup(
        EnrichedItems.COPPER_SWORD,
        EnrichedItems.COPPER_SHOVEL,
        EnrichedItems.COPPER_PICKAXE,
        EnrichedItems.COPPER_AXE,
        EnrichedItems.COPPER_HOE);

    EnrichedItems.registerToolsToItemGroup(
        EnrichedItems.BRONZE_SWORD,
        EnrichedItems.BRONZE_SHOVEL,
        EnrichedItems.BRONZE_PICKAXE,
        EnrichedItems.BRONZE_AXE,
        EnrichedItems.BRONZE_HOE);

    /*-------------*/
    /* -- Armor -- */
    /*-------------*/

    EnrichedItems.registerArmorToItemGroup(RUBY_HELMET, RUBY_CHESTPLATE, RUBY_LEGGINGS, RUBY_BOOTS);
    EnrichedItems.registerArmorToItemGroup(
        SAPPHIRE_HELMET, SAPPHIRE_CHESTPLATE, SAPPHIRE_LEGGINGS, SAPPHIRE_BOOTS);
    EnrichedItems.registerArmorToItemGroup(
        TANZANITE_HELMET, TANZANITE_CHESTPLATE, TANZANITE_LEGGINGS, TANZANITE_BOOTS);
    EnrichedItems.registerArmorToItemGroup(
        STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS);
    EnrichedItems.registerArmorToItemGroup(
        OBSIDIAN_HELMET, OBSIDIAN_CHESTPLATE, OBSIDIAN_LEGGINGS, OBSIDIAN_BOOTS);
    EnrichedItems.registerArmorToItemGroup(
        EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS);
    EnrichedItems.registerArmorToItemGroup(
        BRONZE_HELMET, BRONZE_CHESTPLATE, BRONZE_LEGGINGS, BRONZE_BOOTS);

    /*------------*/
    /* -- Food -- */
    /*------------*/

    EnrichedRegisters.registerToItemGroup(BEEF_STEW, CreativeModeTabs.FOOD_AND_DRINKS);
    EnrichedRegisters.registerToItemGroup(BERRY_JUICE, CreativeModeTabs.FOOD_AND_DRINKS);
  }

  private static void registerToolsToItemGroup(
      Item sword, Item shovel, Item pickaxe, Item axe, Item hoe) {
    EnrichedRegisters.registerToItemGroup(sword, CreativeModeTabs.COMBAT);
    EnrichedRegisters.registerToItemGroup(shovel, CreativeModeTabs.TOOLS_AND_UTILITIES);
    EnrichedRegisters.registerToItemGroup(pickaxe, CreativeModeTabs.TOOLS_AND_UTILITIES);
    EnrichedRegisters.registerToItemGroup(axe, CreativeModeTabs.TOOLS_AND_UTILITIES);
    EnrichedRegisters.registerToItemGroup(axe, CreativeModeTabs.COMBAT);
    EnrichedRegisters.registerToItemGroup(hoe, CreativeModeTabs.TOOLS_AND_UTILITIES);
  }

  // (Ayydxn) Maybe add an item group parameter instead of hard-coding the combat item group?
  private static void registerArmorToItemGroup(
      Item helmet, Item chestplate, Item leggings, Item boots) {
    EnrichedRegisters.registerToItemGroup(helmet, CreativeModeTabs.COMBAT);
    EnrichedRegisters.registerToItemGroup(chestplate, CreativeModeTabs.COMBAT);
    EnrichedRegisters.registerToItemGroup(leggings, CreativeModeTabs.COMBAT);
    EnrichedRegisters.registerToItemGroup(boots, CreativeModeTabs.COMBAT);
  }
}
