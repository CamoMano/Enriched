package com.enrichedmc.materials.items;

import com.enrichedmc.registry.ModInit;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialTanzanite implements ArmorMaterial {
  private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
  private static final int[] PROTECTION_AMOUNTS = new int[] {2, 5, 5, 2};

  @Override
  public int getDurability(ArmorItem.Type type) {
    return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * 22;
  }

  @Override
  public int getProtection(ArmorItem.Type type) {
    return PROTECTION_AMOUNTS[type.getEquipmentSlot().getEntitySlotId()];
  }

  @Override
  public int getEnchantability() {
    return 20;
  }

  @Override
  public SoundEvent getEquipSound() {
    return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(ModInit.TANZANITE);
  }

  @Override
  public String getName() {
    return "tanzanite";
  }

  @Override
  public float getToughness() {
    return 0;
  }

  @Override
  public float getKnockbackResistance() {
    return 0;
  }
}
