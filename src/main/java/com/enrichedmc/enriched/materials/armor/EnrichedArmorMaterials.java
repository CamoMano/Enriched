package com.enrichedmc.enriched.materials.armor;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.google.common.collect.Lists;
import java.util.EnumMap;
import java.util.List;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class EnrichedArmorMaterials {
  public static final Holder<ArmorMaterial> RUBY;
  public static final Holder<ArmorMaterial> SAPPHIRE;
  public static final Holder<ArmorMaterial> TANZANITE;
  public static final Holder<ArmorMaterial> STEEL;
  public static final Holder<ArmorMaterial> OBSIDIAN;
  public static final Holder<ArmorMaterial> EMERALD;
  public static final Holder<ArmorMaterial> BRONZE;
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
                          ArmorItem.Type.BOOTS.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.LEGGINGS.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.CHESTPLATE.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.HELMET.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BODY.getSlot().getIndex()));
                }),
            9,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0f,
            0.0f,
            () -> Ingredient.of(EnrichedItems.RUBY),
            Lists.newArrayList(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, "ruby"))));

    SAPPHIRE =
        ArmorMaterials.register(
            "sapphire",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BOOTS.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.LEGGINGS.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.CHESTPLATE.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.HELMET.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BODY.getSlot().getIndex())
                          + 1);
                }),
            9,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0f,
            0.0f,
            () -> Ingredient.of(EnrichedItems.SAPPHIRE),
            Lists.newArrayList(
                new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, "sapphire"))));

    TANZANITE =
        ArmorMaterials.register(
            "tanzanite",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BOOTS.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.LEGGINGS.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.CHESTPLATE.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.HELMET.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BODY.getSlot().getIndex()));
                }),
            9,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0f,
            0.0f,
            () -> Ingredient.of(EnrichedItems.TANZANITE),
            Lists.newArrayList(
                new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, "tanzanite"))));

    STEEL =
        ArmorMaterials.register(
            "steel",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BOOTS.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.LEGGINGS.getSlot().getIndex())
                          + 2);
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.CHESTPLATE.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.HELMET.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BODY.getSlot().getIndex())
                          + 1);
                }),
            9,
            SoundEvents.ARMOR_EQUIP_IRON,
            1.0f,
            0.0f,
            () -> Ingredient.of(EnrichedItems.STEEL_INGOT),
            Lists.newArrayList(
                new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, "steel"))));

    OBSIDIAN =
        ArmorMaterials.register(
            "obsidian",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BOOTS.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.LEGGINGS.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.CHESTPLATE.getSlot().getIndex())
                          + 3);
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.HELMET.getSlot().getIndex())
                          + 1);
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                              ArmorItem.Type.BODY.getSlot().getIndex())
                          + 1);
                }),
            9,
            SoundEvents.ARMOR_EQUIP_GOLD,
            2.0f,
            0.1f,
            () -> Ingredient.of(EnrichedItems.OBSIDIAN_ALLOY_INGOT),
            Lists.newArrayList(
                new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, "obsidian"))));

    EMERALD =
        ArmorMaterials.register(
            "emerald",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BOOTS.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.LEGGINGS.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.CHESTPLATE.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.HELMET.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BODY.getSlot().getIndex()));
                }),
            26,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0f,
            0.0f,
            () -> Ingredient.of(Items.EMERALD),
            Lists.newArrayList(
                new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, "emerald"))));

    BRONZE =
        ArmorMaterials.register(
            "bronze",
            Util.make(
                new EnumMap<>(ArmorItem.Type.class),
                map -> {
                  map.put(
                      ArmorItem.Type.BOOTS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BOOTS.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.LEGGINGS,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.LEGGINGS.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.CHESTPLATE,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.CHESTPLATE.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.HELMET,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.HELMET.getSlot().getIndex()));
                  map.put(
                      ArmorItem.Type.BODY,
                      BASE_ARMOR_RATING.get(
                          ArmorItem.Type.BODY.getSlot().getIndex()));
                }),
            9,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.5f,
            0.0f,
            () -> Ingredient.of(EnrichedItems.BRONZE_INGOT),
            Lists.newArrayList(
                new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, "bronze"))));
  }

  public static void register() {
    EnrichedMod.LOGGER.info("Registering Enriched's armor materials...");
  }
}
