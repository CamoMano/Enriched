package com.enrichedmc.enriched.materials.armor;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.google.common.collect.Lists;
import java.util.EnumMap;
import java.util.List;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class EnrichedArmorMaterials {
  public static final RegistryEntry<ArmorMaterial> RUBY;
  public static final RegistryEntry<ArmorMaterial> SAPPHIRE;
  public static final RegistryEntry<ArmorMaterial> TANZANITE;
  public static final RegistryEntry<ArmorMaterial> STEEL;
  public static final RegistryEntry<ArmorMaterial> OBSIDIAN;
  public static final RegistryEntry<ArmorMaterial> EMERALD;
  public static final RegistryEntry<ArmorMaterial> BRONZE;
  private static final List<Integer> BASE_ARMOR_RATING = Lists.newArrayList(2, 5, 5, 2);

  static {
    RUBY =
        ArmorMaterials.register(
            "ruby",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()));
                }),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            1.0f,
            0.0f,
            () -> Ingredient.ofItems(EnrichedItems.RUBY),
            Lists.newArrayList(new ArmorMaterial.Layer(Identifier.of(EnrichedMod.MOD_ID, "ruby"))));

    SAPPHIRE =
        ArmorMaterials.register(
            "sapphire",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId())
                          + 1);
                }),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0f,
            0.0f,
            () -> Ingredient.ofItems(EnrichedItems.SAPPHIRE),
            Lists.newArrayList(
                new ArmorMaterial.Layer(Identifier.of(EnrichedMod.MOD_ID, "sapphire"))));

    TANZANITE =
        ArmorMaterials.register(
            "tanzanite",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()));
                }),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0f,
            0.0f,
            () -> Ingredient.ofItems(EnrichedItems.TANZANITE),
            Lists.newArrayList(
                new ArmorMaterial.Layer(Identifier.of(EnrichedMod.MOD_ID, "tanzanite"))));

    STEEL =
        ArmorMaterials.register(
            "steel",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId())
                          + 2);
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId())
                          + 1);
                }),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.0f,
            0.0f,
            () -> Ingredient.ofItems(EnrichedItems.STEEL_INGOT),
            Lists.newArrayList(
                new ArmorMaterial.Layer(Identifier.of(EnrichedMod.MOD_ID, "steel"))));

    OBSIDIAN =
        ArmorMaterials.register(
            "obsidian",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId())
                          + 3);
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId())
                          + 1);
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId())
                          + 1);
                }),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            2.0f,
            0.1f,
            () -> Ingredient.ofItems(EnrichedItems.OBSIDIAN_ALLOY_INGOT),
            Lists.newArrayList(
                new ArmorMaterial.Layer(Identifier.of(EnrichedMod.MOD_ID, "obsidian"))));

    EMERALD =
        ArmorMaterials.register(
            "emerald",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()));
                }),
            26,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0f,
            0.0f,
            () -> Ingredient.ofItems(Items.EMERALD),
            Lists.newArrayList(
                new ArmorMaterial.Layer(Identifier.of(EnrichedMod.MOD_ID, "emerald"))));

    BRONZE =
        ArmorMaterials.register(
            "bronze",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()));
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()));
                }),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.5f,
            0.0f,
            () -> Ingredient.ofItems(EnrichedItems.BRONZE_INGOT),
            Lists.newArrayList(
                new ArmorMaterial.Layer(Identifier.of(EnrichedMod.MOD_ID, "bronze"))));
  }

  public static void register() {
    EnrichedMod.LOGGER.info("Registering Enriched's armor materials...");
  }
}
