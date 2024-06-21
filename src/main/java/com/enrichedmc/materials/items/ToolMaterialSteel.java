package com.enrichedmc.materials.items;

import com.enrichedmc.registry.ModInit;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public class ToolMaterialSteel implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 850;
    }

    @Override
    public float getAttackDamage()
    {
        return 5.0F;
    }

    @Override
    public TagKey<Block> getInverseTag()
    {
        return null;
    }

    @Override
    public int getEnchantability()
    {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModInit.STEEL_INGOT);
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 6.0F;
    }
}
