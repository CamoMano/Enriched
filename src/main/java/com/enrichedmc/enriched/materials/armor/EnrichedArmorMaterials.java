package com.enrichedmc.enriched.materials.armor;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.enrichedmc.enriched.tag.EnrichedTags;
import java.util.EnumMap;
import java.util.Map;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public class EnrichedArmorMaterials {
  public static final ResourceKey<EquipmentAsset> RUBY_ASSET = createAssetId("ruby");
  public static final ResourceKey<EquipmentAsset> SAPPHIRE_ASSET = createAssetId("sapphire");
  public static final ResourceKey<EquipmentAsset> TANZANITE_ASSET = createAssetId("tanzanite");
  public static final ResourceKey<EquipmentAsset> STEEL_ASSET = createAssetId("steel");
  public static final ResourceKey<EquipmentAsset> OBSIDIAN_ASSET = createAssetId("obsidian");
  public static final ResourceKey<EquipmentAsset> EMERALD_ASSET = createAssetId("emerald");
  public static final ResourceKey<EquipmentAsset> BRONZE_ASSET = createAssetId("bronze");

  public static final ArmorMaterial RUBY =
      new ArmorMaterial(
          25,
          defense(2, 5, 5, 2),
          9,
          SoundEvents.ARMOR_EQUIP_DIAMOND,
          1.0f,
          0.0f,
          EnrichedTags.ItemTags.RUBIES,
          RUBY_ASSET);

  public static final ArmorMaterial SAPPHIRE =
      new ArmorMaterial(
          25,
          defense(3, 6, 6, 3),
          9,
          SoundEvents.ARMOR_EQUIP_DIAMOND,
          0.0f,
          0.0f,
          EnrichedTags.ItemTags.SAPPHIRES,
          SAPPHIRE_ASSET);

  public static final ArmorMaterial TANZANITE =
      new ArmorMaterial(
          25,
          defense(2, 5, 5, 2),
          9,
          SoundEvents.ARMOR_EQUIP_DIAMOND,
          0.0f,
          0.0f,
          EnrichedTags.ItemTags.TANZANITES,
          TANZANITE_ASSET);

  public static final ArmorMaterial STEEL =
      new ArmorMaterial(
          21,
          defense(3, 6, 7, 3),
          9,
          SoundEvents.ARMOR_EQUIP_IRON,
          1.0f,
          0.0f,
          EnrichedTags.ItemTags.STEEL_INGOTS,
          STEEL_ASSET);

  public static final ArmorMaterial OBSIDIAN =
      new ArmorMaterial(
          39,
          defense(3, 8, 6, 3),
          9,
          SoundEvents.ARMOR_EQUIP_GOLD,
          2.0f,
          0.1f,
          EnrichedTags.ItemTags.OBSIDIAN_ALLOY_INGOTS,
          OBSIDIAN_ASSET);

  public static final ArmorMaterial EMERALD =
      new ArmorMaterial(
          25,
          defense(2, 5, 5, 2),
          26,
          SoundEvents.ARMOR_EQUIP_DIAMOND,
          0.0f,
          0.0f,
          ConventionalItemTags.EMERALD_GEMS,
          EMERALD_ASSET);

  public static final ArmorMaterial BRONZE =
      new ArmorMaterial(
          23,
          defense(2, 5, 5, 2),
          9,
          SoundEvents.ARMOR_EQUIP_IRON,
          0.5f,
          0.0f,
          EnrichedTags.ItemTags.BRONZE_INGOTS,
          BRONZE_ASSET);

  private static ResourceKey<EquipmentAsset> createAssetId(String name) {
    return ResourceKey.create(EquipmentAssets.ROOT_ID, EnrichedRegisters.id(name));
  }

  /** Builds the per-slot defense map. The body slot mirrors the chestplate's protection. */
  private static Map<ArmorType, Integer> defense(
      int helmet, int chestplate, int leggings, int boots) {
    return Util.make(
        new EnumMap<>(ArmorType.class),
        map -> {
          map.put(ArmorType.HELMET, helmet);
          map.put(ArmorType.CHESTPLATE, chestplate);
          map.put(ArmorType.LEGGINGS, leggings);
          map.put(ArmorType.BOOTS, boots);
          map.put(ArmorType.BODY, chestplate);
        });
  }

  public static void register() {
    EnrichedMod.LOGGER.info("Registering Enriched's armor materials...");
  }
}
