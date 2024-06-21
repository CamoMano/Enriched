package com.enrichedmc.materials.items;

import com.enrichedmc.registry.ModInit;
import com.google.common.collect.Lists;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;

// Added by Ayydxn
public class ArmorMaterials
{
    private static final List<Integer> BASE_ARMOR_DURABILITY = Lists.newArrayList(13, 15, 16, 11);

    // Might not need this anymore?
    private static final List<Integer> PROTECTION_AMOUNTS = Lists.newArrayList(2, 5, 5, 2);

    public static final RegistryEntry<ArmorMaterial> EMERALD;
    public static final RegistryEntry<ArmorMaterial> OBSIDIAN;
    public static final RegistryEntry<ArmorMaterial> RUBY;
    public static final RegistryEntry<ArmorMaterial> SAPPHIRE;
    public static final RegistryEntry<ArmorMaterial> STEEL;
    public static final RegistryEntry<ArmorMaterial> TANZANITE;

    static
    {
        EMERALD = net.minecraft.item.ArmorMaterials.register("emerald", Util.make(new EnumMap<>(ArmorItem.Type.class), map ->
        {
            map.put(ArmorItem.Type.BOOTS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.LEGGINGS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.CHESTPLATE, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.HELMET, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.BODY, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()) * 18);
        }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.EMERALD));

        OBSIDIAN = net.minecraft.item.ArmorMaterials.register("obsidian", Util.make(new EnumMap<>(ArmorItem.Type.class), map ->
        {
            map.put(ArmorItem.Type.BOOTS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()) * 35);
            map.put(ArmorItem.Type.LEGGINGS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()) * 35);
            map.put(ArmorItem.Type.CHESTPLATE, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()) * 35);
            map.put(ArmorItem.Type.HELMET, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()) * 35);
            map.put(ArmorItem.Type.BODY, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()) * 35);
        }), 9, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0f, 0.1f, () -> Ingredient.ofItems(ModInit.OBSIDIAN_ALLOY_INGOT));

        RUBY = net.minecraft.item.ArmorMaterials.register("ruby", Util.make(new EnumMap<>(ArmorItem.Type.class), map ->
        {
            map.put(ArmorItem.Type.BOOTS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.LEGGINGS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.CHESTPLATE, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.HELMET, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.BODY, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()) * 18);
        }), 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f, () -> Ingredient.ofItems(ModInit.RUBY));

        SAPPHIRE = net.minecraft.item.ArmorMaterials.register("sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class), map ->
        {
            map.put(ArmorItem.Type.BOOTS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.LEGGINGS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.CHESTPLATE, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.HELMET, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()) * 18);
            map.put(ArmorItem.Type.BODY, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()) * 18);
        }), 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.ofItems(ModInit.SAPPHIRE));

        STEEL = net.minecraft.item.ArmorMaterials.register("tanzanite", Util.make(new EnumMap<>(ArmorItem.Type.class), map ->
        {
            map.put(ArmorItem.Type.BOOTS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()) * 25);
            map.put(ArmorItem.Type.LEGGINGS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()) * 25);
            map.put(ArmorItem.Type.CHESTPLATE, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()) * 25);
            map.put(ArmorItem.Type.HELMET, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()) * 25);
            map.put(ArmorItem.Type.BODY, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()) * 25);
        }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f, 0.0f, () -> Ingredient.ofItems(ModInit.STEEL_INGOT));

        TANZANITE = net.minecraft.item.ArmorMaterials.register("steel", Util.make(new EnumMap<>(ArmorItem.Type.class), map ->
        {
            map.put(ArmorItem.Type.BOOTS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BOOTS.getEquipmentSlot().getEntitySlotId()) * 22);
            map.put(ArmorItem.Type.LEGGINGS, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.LEGGINGS.getEquipmentSlot().getEntitySlotId()) * 22);
            map.put(ArmorItem.Type.CHESTPLATE, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.CHESTPLATE.getEquipmentSlot().getEntitySlotId()) * 22);
            map.put(ArmorItem.Type.HELMET, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.HELMET.getEquipmentSlot().getEntitySlotId()) * 22);
            map.put(ArmorItem.Type.BODY, BASE_ARMOR_DURABILITY.get(ArmorItem.Type.BODY.getEquipmentSlot().getEntitySlotId()) * 22);
        }), 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.ofItems(ModInit.TANZANITE));
    }
}
