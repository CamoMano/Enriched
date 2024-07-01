package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.world.gen.structure.OceanRuinStructure;

public class EnrichedModelProvider extends FabricModelProvider
{
    public EnrichedModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.DEEPSLATE_RUBY_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.TANZANITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.TANZANITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        /*-------------*/
        /* -- Items -- */
        /*-------------*/

        itemModelGenerator.register(EnrichedItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.TANZANITE, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.STEEL_BLEND, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.OBSIDIAN_ALLOY_BLEND, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.OBSIDIAN_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.HONEY_BALL, Models.GENERATED);

        /*-------------*/
        /* -- Armor -- */
        /*-------------*/

        this.registerArmorModels(itemModelGenerator, EnrichedItems.RUBY_HELMET, EnrichedItems.RUBY_CHESTPLATE, EnrichedItems.RUBY_LEGGINGS,
                EnrichedItems.RUBY_BOOTS);

        this.registerArmorModels(itemModelGenerator, EnrichedItems.SAPPHIRE_HELMET, EnrichedItems.SAPPHIRE_CHESTPLATE, EnrichedItems.SAPPHIRE_LEGGINGS,
                EnrichedItems.SAPPHIRE_BOOTS);

        this.registerArmorModels(itemModelGenerator, EnrichedItems.TANZANITE_HELMET, EnrichedItems.TANZANITE_CHESTPLATE, EnrichedItems.TANZANITE_LEGGINGS,
                EnrichedItems.TANZANITE_BOOTS);

        this.registerArmorModels(itemModelGenerator, EnrichedItems.STEEL_HELMET, EnrichedItems.STEEL_CHESTPLATE, EnrichedItems.STEEL_LEGGINGS,
                EnrichedItems.STEEL_BOOTS);

        this.registerArmorModels(itemModelGenerator, EnrichedItems.OBSIDIAN_HELMET, EnrichedItems.OBSIDIAN_CHESTPLATE, EnrichedItems.OBSIDIAN_LEGGINGS,
                EnrichedItems.OBSIDIAN_BOOTS);

        this.registerArmorModels(itemModelGenerator, EnrichedItems.EMERALD_HELMET, EnrichedItems.EMERALD_CHESTPLATE, EnrichedItems.EMERALD_LEGGINGS,
                EnrichedItems.EMERALD_BOOTS);

        /*------------*/
        /* -- Food -- */
        /*------------*/

        itemModelGenerator.register(EnrichedItems.BEEF_STEW, Models.GENERATED);
        itemModelGenerator.register(EnrichedItems.BERRY_JUICE, Models.GENERATED);
    }

    private void registerArmorModels(ItemModelGenerator itemModelGenerator, ArmorItem helmet, ArmorItem chestplate, ArmorItem leggings, ArmorItem boots)
    {
        itemModelGenerator.registerArmor(helmet);
        itemModelGenerator.registerArmor(chestplate);
        itemModelGenerator.registerArmor(leggings);
        itemModelGenerator.registerArmor(boots);
    }
}
