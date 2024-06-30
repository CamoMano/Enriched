package com.enrichedmc.materials.items;

import com.enrichedmc.Enriched;
import com.enrichedmc.registry.ModInit;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ToolMaterialSapphire implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 650;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 8.0f;
    }

    @Override
    public float getAttackDamage()
    {
        return 4.0f;
    }

    @Override
    public TagKey<Block> getInverseTag()
    {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Enriched.MOD_ID, "incorrect_for_sapphire_tool"));
    }

    @Override
    public int getEnchantability()
    {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModInit.SAPPHIRE);
    }
}
