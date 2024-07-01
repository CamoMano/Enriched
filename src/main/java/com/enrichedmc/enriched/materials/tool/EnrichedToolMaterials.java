package com.enrichedmc.enriched.materials.tool;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.item.EnrichedItems;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum EnrichedToolMaterials implements ToolMaterial
{
    RUBY(EnrichedToolMaterials.createInverseTag("incorrect_for_ruby_tool"), 650, 7.5f, 4.5f, 20,
            () -> Ingredient.ofItems(EnrichedItems.RUBY)),

    SAPPHIRE(EnrichedToolMaterials.createInverseTag("incorrect_for_sapphire_tool"), 650, 8.0f, 4.0f, 20,
            () -> Ingredient.ofItems(EnrichedItems.SAPPHIRE)),

    TANZANITE(EnrichedToolMaterials.createInverseTag("incorrect_for_tanzanite_tool"), 750, 7.5f, 4.0f, 20,
            () -> Ingredient.ofItems(EnrichedItems.TANZANITE)),

    STEEL(EnrichedToolMaterials.createInverseTag("incorrect_for_steel_tool"), 850, 6.0f, 5.0f, 9,
            () -> Ingredient.ofItems(EnrichedItems.STEEL_INGOT)),

    OBSIDIAN(EnrichedToolMaterials.createInverseTag("incorrect_for_obsidian_tool"), 1820, 7.0f, 4.5f, 9,
            () -> Ingredient.ofItems(EnrichedItems.OBSIDIAN_ALLOY_INGOT)),

    EMERALD(EnrichedToolMaterials.createInverseTag("incorrect_for_emerald_tool"), 650, 7.5f, 4.0f, 25,
            () -> Ingredient.ofItems(Items.EMERALD));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    EnrichedToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient)
    {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability()
    {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag()
    {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }

    private static TagKey<Block> createInverseTag(String tagPath)
    {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(EnrichedMod.MOD_ID, tagPath));
    }
}
