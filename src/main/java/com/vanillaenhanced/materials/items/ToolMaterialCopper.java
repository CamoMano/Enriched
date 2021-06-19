package com.vanillaenhanced.materials.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialCopper implements ToolMaterial {
    @Override
    public int getDurability() {
        return 150;
    }

    @Override
    public float getAttackDamage() {
        return 3.5F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 13;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0F;
    }
}
