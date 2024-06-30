package com.enrichedmc.materials.items;

import com.enrichedmc.Enriched;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ToolMaterialCopper implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 150;
    }

    @Override
    public float getAttackDamage()
    {
        return 3.5F;
    }

    @Override
    public TagKey<Block> getInverseTag()
    {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Enriched.MOD_ID, "incorrect_for_copper_tool"));
    }

    @Override
    public int getEnchantability()
    {
        return 13;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 4.0F;
    }
}
