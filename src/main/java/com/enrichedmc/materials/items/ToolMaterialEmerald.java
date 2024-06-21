package com.enrichedmc.materials.items;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public class ToolMaterialEmerald implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 650;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 7.5f;
    }

    @Override
    public float getAttackDamage()
    {
        return 4.0f;
    }

    @Override
    public TagKey<Block> getInverseTag()
    {
        return null;
    }

    @Override
    public int getEnchantability()
    {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
