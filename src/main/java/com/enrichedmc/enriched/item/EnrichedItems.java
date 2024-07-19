package com.enrichedmc.enriched.item;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.item.base.*;
import com.enrichedmc.enriched.item.food.EnrichedFoodComponents;
import com.enrichedmc.enriched.materials.armor.EnrichedArmorMaterials;
import com.enrichedmc.enriched.materials.tool.EnrichedToolMaterials;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;

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

  public static final ArmorItem RUBY_HELMET;
  public static final ArmorItem RUBY_CHESTPLATE;
  public static final ArmorItem RUBY_LEGGINGS;
  public static final ArmorItem RUBY_BOOTS;
  public static final ArmorItem SAPPHIRE_HELMET;
  public static final ArmorItem SAPPHIRE_CHESTPLATE;
  public static final ArmorItem SAPPHIRE_LEGGINGS;
  public static final ArmorItem SAPPHIRE_BOOTS;
  public static final ArmorItem TANZANITE_HELMET;
  public static final ArmorItem TANZANITE_CHESTPLATE;
  public static final ArmorItem TANZANITE_LEGGINGS;
  public static final ArmorItem TANZANITE_BOOTS;
  public static final ArmorItem STEEL_HELMET;
  public static final ArmorItem STEEL_CHESTPLATE;
  public static final ArmorItem STEEL_LEGGINGS;
  public static final ArmorItem STEEL_BOOTS;
  public static final ArmorItem OBSIDIAN_HELMET;
  public static final ArmorItem OBSIDIAN_CHESTPLATE;
  public static final ArmorItem OBSIDIAN_LEGGINGS;
  public static final ArmorItem OBSIDIAN_BOOTS;
  public static final ArmorItem EMERALD_HELMET;
  public static final ArmorItem EMERALD_CHESTPLATE;
  public static final ArmorItem EMERALD_LEGGINGS;
  public static final ArmorItem EMERALD_BOOTS;

  public static final ArmorItem BRONZE_HELMET;
  public static final ArmorItem BRONZE_CHESTPLATE;
  public static final ArmorItem BRONZE_LEGGINGS;
  public static final ArmorItem BRONZE_BOOTS;

  static {
    RUBY = EnrichedRegisters.registerItem("ruby", new Item(new Item.Settings()));
    SAPPHIRE = EnrichedRegisters.registerItem("sapphire", new Item(new Item.Settings()));
    TANZANITE = EnrichedRegisters.registerItem("tanzanite", new Item(new Item.Settings()));
    AMBER = EnrichedRegisters.registerItem("amber", new Item(new Item.Settings()));
    TOPAZ = EnrichedRegisters.registerItem("topaz", new Item(new Item.Settings()));
    STEEL_BLEND = EnrichedRegisters.registerItem("steel_blend", new Item(new Item.Settings()));
    STEEL_INGOT = EnrichedRegisters.registerItem("steel_ingot", new Item(new Item.Settings()));
    TIN_INGOT = EnrichedRegisters.registerItem("tin_ingot", new Item(new Item.Settings()));
    BRONZE_BLEND = EnrichedRegisters.registerItem("bronze_blend", new Item(new Item.Settings()));
    BRONZE_INGOT = EnrichedRegisters.registerItem("bronze_ingot", new Item(new Item.Settings()));
    RAW_TIN = EnrichedRegisters.registerItem("raw_tin", new Item(new Item.Settings()));
    OBSIDIAN_ALLOY_BLEND =
        EnrichedRegisters.registerItem("obsidian_alloy_blend", new Item(new Item.Settings()));
    OBSIDIAN_ALLOY_INGOT =
        EnrichedRegisters.registerItem("obsidian_alloy_ingot", new Item(new Item.Settings()));

    /*-------------*/
    /* -- Tools -- */
    /*-------------*/

    RUBY_SWORD =
        EnrichedRegisters.registerItem(
            "ruby_sword", new EnrichedBaseSwordItem(EnrichedToolMaterials.RUBY));
    RUBY_SHOVEL =
        EnrichedRegisters.registerItem(
            "ruby_shovel", new EnrichedBaseShovelItem(EnrichedToolMaterials.RUBY));
    RUBY_PICKAXE =
        EnrichedRegisters.registerItem(
            "ruby_pickaxe", new EnrichedBasePickaxeItem(EnrichedToolMaterials.RUBY));
    RUBY_AXE =
        EnrichedRegisters.registerItem(
            "ruby_axe", new EnrichedBaseAxeItem(EnrichedToolMaterials.RUBY));
    RUBY_HOE =
        EnrichedRegisters.registerItem(
            "ruby_hoe", new EnrichedBaseHoeItem(EnrichedToolMaterials.RUBY));

    SAPPHIRE_SWORD =
        EnrichedRegisters.registerItem(
            "sapphire_sword", new EnrichedBaseSwordItem(EnrichedToolMaterials.SAPPHIRE));
    SAPPHIRE_SHOVEL =
        EnrichedRegisters.registerItem(
            "sapphire_shovel", new EnrichedBaseShovelItem(EnrichedToolMaterials.SAPPHIRE));
    SAPPHIRE_PICKAXE =
        EnrichedRegisters.registerItem(
            "sapphire_pickaxe", new EnrichedBasePickaxeItem(EnrichedToolMaterials.SAPPHIRE));
    SAPPHIRE_AXE =
        EnrichedRegisters.registerItem(
            "sapphire_axe", new EnrichedBaseAxeItem(EnrichedToolMaterials.SAPPHIRE));
    SAPPHIRE_HOE =
        EnrichedRegisters.registerItem(
            "sapphire_hoe", new EnrichedBaseHoeItem(EnrichedToolMaterials.SAPPHIRE));

    TANZANITE_SWORD =
        EnrichedRegisters.registerItem(
            "tanzanite_sword", new EnrichedBaseSwordItem(EnrichedToolMaterials.TANZANITE));
    TANZANITE_SHOVEL =
        EnrichedRegisters.registerItem(
            "tanzanite_shovel", new EnrichedBaseShovelItem(EnrichedToolMaterials.TANZANITE));
    TANZANITE_PICKAXE =
        EnrichedRegisters.registerItem(
            "tanzanite_pickaxe", new EnrichedBasePickaxeItem(EnrichedToolMaterials.TANZANITE));
    TANZANITE_AXE =
        EnrichedRegisters.registerItem(
            "tanzanite_axe", new EnrichedBaseAxeItem(EnrichedToolMaterials.TANZANITE));
    TANZANITE_HOE =
        EnrichedRegisters.registerItem(
            "tanzanite_hoe", new EnrichedBaseHoeItem(EnrichedToolMaterials.TANZANITE));

    STEEL_SWORD =
        EnrichedRegisters.registerItem(
            "steel_sword", new EnrichedBaseSwordItem(EnrichedToolMaterials.STEEL));
    STEEL_SHOVEL =
        EnrichedRegisters.registerItem(
            "steel_shovel", new EnrichedBaseShovelItem(EnrichedToolMaterials.STEEL));
    STEEL_PICKAXE =
        EnrichedRegisters.registerItem(
            "steel_pickaxe", new EnrichedBasePickaxeItem(EnrichedToolMaterials.STEEL));
    STEEL_AXE =
        EnrichedRegisters.registerItem(
            "steel_axe", new EnrichedBaseAxeItem(EnrichedToolMaterials.STEEL));
    STEEL_HOE =
        EnrichedRegisters.registerItem(
            "steel_hoe", new EnrichedBaseHoeItem(EnrichedToolMaterials.STEEL));

    OBSIDIAN_SWORD =
        EnrichedRegisters.registerItem(
            "obsidian_sword", new EnrichedBaseSwordItem(EnrichedToolMaterials.OBSIDIAN));
    OBSIDIAN_SHOVEL =
        EnrichedRegisters.registerItem(
            "obsidian_shovel", new EnrichedBaseShovelItem(EnrichedToolMaterials.OBSIDIAN));
    OBSIDIAN_PICKAXE =
        EnrichedRegisters.registerItem(
            "obsidian_pickaxe", new EnrichedBasePickaxeItem(EnrichedToolMaterials.OBSIDIAN));
    OBSIDIAN_AXE =
        EnrichedRegisters.registerItem(
            "obsidian_axe", new EnrichedBaseAxeItem(EnrichedToolMaterials.OBSIDIAN));
    OBSIDIAN_HOE =
        EnrichedRegisters.registerItem(
            "obsidian_hoe", new EnrichedBaseHoeItem(EnrichedToolMaterials.OBSIDIAN));

    EMERALD_SWORD =
        EnrichedRegisters.registerItem(
            "emerald_sword", new EnrichedBaseSwordItem(EnrichedToolMaterials.EMERALD));
    EMERALD_SHOVEL =
        EnrichedRegisters.registerItem(
            "emerald_shovel", new EnrichedBaseShovelItem(EnrichedToolMaterials.EMERALD));
    EMERALD_PICKAXE =
        EnrichedRegisters.registerItem(
            "emerald_pickaxe", new EnrichedBasePickaxeItem(EnrichedToolMaterials.EMERALD));
    EMERALD_AXE =
        EnrichedRegisters.registerItem(
            "emerald_axe", new EnrichedBaseAxeItem(EnrichedToolMaterials.EMERALD));
    EMERALD_HOE =
        EnrichedRegisters.registerItem(
            "emerald_hoe", new EnrichedBaseHoeItem(EnrichedToolMaterials.EMERALD));

    COPPER_SWORD =
        EnrichedRegisters.registerItem(
            "copper_sword", new EnrichedBaseSwordItem(EnrichedToolMaterials.COPPER));
    COPPER_SHOVEL =
        EnrichedRegisters.registerItem(
            "copper_shovel", new EnrichedBaseShovelItem(EnrichedToolMaterials.COPPER));
    COPPER_PICKAXE =
        EnrichedRegisters.registerItem(
            "copper_pickaxe", new EnrichedBasePickaxeItem(EnrichedToolMaterials.COPPER));
    COPPER_AXE =
        EnrichedRegisters.registerItem(
            "copper_axe", new EnrichedBaseAxeItem(EnrichedToolMaterials.COPPER));
    COPPER_HOE =
        EnrichedRegisters.registerItem(
            "copper_hoe", new EnrichedBaseHoeItem(EnrichedToolMaterials.COPPER));

    BRONZE_SWORD =
        EnrichedRegisters.registerItem(
            "bronze_sword", new EnrichedBaseSwordItem(EnrichedToolMaterials.BRONZE));
    BRONZE_SHOVEL =
        EnrichedRegisters.registerItem(
            "bronze_shovel", new EnrichedBaseShovelItem(EnrichedToolMaterials.BRONZE));
    BRONZE_PICKAXE =
        EnrichedRegisters.registerItem(
            "bronze_pickaxe", new EnrichedBasePickaxeItem(EnrichedToolMaterials.BRONZE));
    BRONZE_AXE =
        EnrichedRegisters.registerItem(
            "bronze_axe", new EnrichedBaseAxeItem(EnrichedToolMaterials.BRONZE));
    BRONZE_HOE =
        EnrichedRegisters.registerItem(
            "bronze_hoe", new EnrichedBaseHoeItem(EnrichedToolMaterials.BRONZE));

    /*-------------*/
    /* -- Armor -- */
    /*-------------*/

    RUBY_HELMET =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "ruby_helmet",
                new ArmorItem(
                    EnrichedArmorMaterials.RUBY,
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))
                        .maxCount(1)));

    RUBY_CHESTPLATE =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "ruby_chestplate",
                new ArmorItem(
                    EnrichedArmorMaterials.RUBY,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))
                        .maxCount(1)));

    RUBY_LEGGINGS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "ruby_leggings",
                new ArmorItem(
                    EnrichedArmorMaterials.RUBY,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))
                        .maxCount(1)));

    RUBY_BOOTS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "ruby_boots",
                new ArmorItem(
                    EnrichedArmorMaterials.RUBY,
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))
                        .maxCount(1)));

    SAPPHIRE_HELMET =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "sapphire_helmet",
                new ArmorItem(
                    EnrichedArmorMaterials.SAPPHIRE,
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))
                        .maxCount(1)));

    SAPPHIRE_CHESTPLATE =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "sapphire_chestplate",
                new ArmorItem(
                    EnrichedArmorMaterials.SAPPHIRE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                        .maxCount(1)
                        .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));

    SAPPHIRE_LEGGINGS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "sapphire_leggings",
                new ArmorItem(
                    EnrichedArmorMaterials.SAPPHIRE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))
                        .maxCount(1)));

    SAPPHIRE_BOOTS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "sapphire_boots",
                new ArmorItem(
                    EnrichedArmorMaterials.SAPPHIRE,
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))
                        .maxCount(1)));

    TANZANITE_HELMET =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "tanzanite_helmet",
                new ArmorItem(
                    EnrichedArmorMaterials.TANZANITE,
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))
                        .maxCount(1)));

    TANZANITE_CHESTPLATE =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "tanzanite_chestplate",
                new ArmorItem(
                    EnrichedArmorMaterials.TANZANITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))
                        .maxCount(1)));

    TANZANITE_LEGGINGS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "tanzanite_leggings",
                new ArmorItem(
                    EnrichedArmorMaterials.TANZANITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))
                        .maxCount(1)));

    TANZANITE_BOOTS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "tanzanite_boots",
                new ArmorItem(
                    EnrichedArmorMaterials.TANZANITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))
                        .maxCount(1)));

    STEEL_HELMET =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "steel_helmet",
                new ArmorItem(
                    EnrichedArmorMaterials.STEEL,
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(21))
                        .maxCount(1)));

    STEEL_CHESTPLATE =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "steel_chestplate",
                new ArmorItem(
                    EnrichedArmorMaterials.STEEL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(21))
                        .maxCount(1)));

    STEEL_LEGGINGS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "steel_leggings",
                new ArmorItem(
                    EnrichedArmorMaterials.STEEL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(21))
                        .maxCount(1)));

    STEEL_BOOTS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "steel_boots",
                new ArmorItem(
                    EnrichedArmorMaterials.STEEL,
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(21))
                        .maxCount(1)));

    OBSIDIAN_HELMET =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "obsidian_helmet",
                new ArmorItem(
                    EnrichedArmorMaterials.OBSIDIAN,
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(39))
                        .maxCount(1)));

    OBSIDIAN_CHESTPLATE =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "obsidian_chestplate",
                new ArmorItem(
                    EnrichedArmorMaterials.OBSIDIAN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(39))
                        .maxCount(1)));

    OBSIDIAN_LEGGINGS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "obsidian_leggings",
                new ArmorItem(
                    EnrichedArmorMaterials.OBSIDIAN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(39))
                        .maxCount(1)));

    OBSIDIAN_BOOTS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "obsidian_boots",
                new ArmorItem(
                    EnrichedArmorMaterials.OBSIDIAN,
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(39))
                        .maxCount(1)));

    EMERALD_HELMET =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "emerald_helmet",
                new ArmorItem(
                    EnrichedArmorMaterials.EMERALD,
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))
                        .maxCount(1)));

    EMERALD_CHESTPLATE =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "emerald_chestplate",
                new ArmorItem(
                    EnrichedArmorMaterials.EMERALD,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))
                        .maxCount(1)));

    EMERALD_LEGGINGS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "emerald_leggings",
                new ArmorItem(
                    EnrichedArmorMaterials.EMERALD,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))
                        .maxCount(1)));

    EMERALD_BOOTS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "emerald_boots",
                new ArmorItem(
                    EnrichedArmorMaterials.EMERALD,
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))
                        .maxCount(1)));

    BRONZE_HELMET =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "bronze_helmet",
                new ArmorItem(
                    EnrichedArmorMaterials.BRONZE,
                    ArmorItem.Type.HELMET,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(23))
                        .maxCount(1)));

    BRONZE_CHESTPLATE =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "bronze_chestplate",
                new ArmorItem(
                    EnrichedArmorMaterials.BRONZE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(23))
                        .maxCount(1)));

    BRONZE_LEGGINGS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "bronze_leggings",
                new ArmorItem(
                    EnrichedArmorMaterials.BRONZE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(23))
                        .maxCount(1)));

    BRONZE_BOOTS =
        (ArmorItem)
            EnrichedRegisters.registerItem(
                "bronze_boots",
                new ArmorItem(
                    EnrichedArmorMaterials.BRONZE,
                    ArmorItem.Type.BOOTS,
                    new Item.Settings()
                        .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(23))
                        .maxCount(1)));

    ;

    /*------------*/
    /* -- Food -- */
    /*------------*/

    BEEF_STEW =
        EnrichedRegisters.registerItem(
            "beef_stew", new Item(new Item.Settings().food(EnrichedFoodComponents.BEEF_STEW)));

    BERRY_JUICE =
        EnrichedRegisters.registerItem(
            "berry_juice", new Item(new Item.Settings().food(EnrichedFoodComponents.BERRY_JUICE)));

    EnrichedItems.registerItemsToItemGroups();
  }

  public static void registerItems() {
    EnrichedMod.LOGGER.info("Registering Enriched's items...");
  }

  private static void registerItemsToItemGroups() {
    EnrichedRegisters.registerToItemGroup(RUBY, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(SAPPHIRE, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(TANZANITE, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(AMBER, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(TOPAZ, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(STEEL_BLEND, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(STEEL_INGOT, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(BRONZE_BLEND, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(BRONZE_INGOT, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(TIN_INGOT, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_BLEND, ItemGroups.INGREDIENTS);
    EnrichedRegisters.registerToItemGroup(OBSIDIAN_ALLOY_INGOT, ItemGroups.INGREDIENTS);

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

    EnrichedRegisters.registerToItemGroup(BEEF_STEW, ItemGroups.FOOD_AND_DRINK);
    EnrichedRegisters.registerToItemGroup(BERRY_JUICE, ItemGroups.FOOD_AND_DRINK);
  }

  private static void registerToolsToItemGroup(
      Item sword, Item shovel, Item pickaxe, Item axe, Item hoe) {
    EnrichedRegisters.registerToItemGroup(sword, ItemGroups.COMBAT);
    EnrichedRegisters.registerToItemGroup(shovel, ItemGroups.TOOLS);
    EnrichedRegisters.registerToItemGroup(pickaxe, ItemGroups.TOOLS);
    EnrichedRegisters.registerToItemGroup(axe, ItemGroups.TOOLS);
    EnrichedRegisters.registerToItemGroup(axe, ItemGroups.COMBAT);
    EnrichedRegisters.registerToItemGroup(hoe, ItemGroups.TOOLS);
  }

  // (Ayydxn) Maybe add an item group parameter instead of hard-coding the combat item group?
  private static void registerArmorToItemGroup(
      ArmorItem helmet, ArmorItem chestplate, ArmorItem leggings, ArmorItem boots) {
    EnrichedRegisters.registerToItemGroup(helmet, ItemGroups.COMBAT);
    EnrichedRegisters.registerToItemGroup(chestplate, ItemGroups.COMBAT);
    EnrichedRegisters.registerToItemGroup(leggings, ItemGroups.COMBAT);
    EnrichedRegisters.registerToItemGroup(boots, ItemGroups.COMBAT);
  }
}
