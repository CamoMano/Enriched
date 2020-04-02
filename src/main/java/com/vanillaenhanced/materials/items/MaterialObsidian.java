package com.vanillaenhanced.materials.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MaterialObsidian implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1820;
    }

    @Override
    public float getAttackDamage() {
        return 6.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.OBSIDIAN);
    }

    @Override
    public float getMiningSpeed() {
        return 7.0F;
    }
}
