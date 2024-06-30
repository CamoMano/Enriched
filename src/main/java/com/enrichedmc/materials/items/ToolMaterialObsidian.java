package com.enrichedmc.materials.items;

import com.enrichedmc.Enriched;
import com.enrichedmc.registry.ModInit;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ToolMaterialObsidian implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 1820;
    }

    @Override
    public float getAttackDamage()
    {
        return 4.5F;
    }

    @Override
    public TagKey<Block> getInverseTag()
    {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Enriched.MOD_ID, "incorrect_for_obsidian_tool"));
    }

    @Override
    public int getEnchantability()
    {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModInit.OBSIDIAN_ALLOY_INGOT);
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 7.0F;
    }
}
