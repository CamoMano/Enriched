package com.enrichedmc.enriched.registry;

import com.enrichedmc.enriched.EnrichedMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class EnrichedRegisters
{
    public static Item registerItem(String itemName, Item itemInstance)
    {
        return Registry.register(Registries.ITEM, Identifier.of(EnrichedMod.MOD_ID, itemName), itemInstance);
    }

    public static Block registerBlock(String blockName, Block blockInstance)
    {
        // Register the block item.
        Registry.register(Registries.ITEM, Identifier.of(EnrichedMod.MOD_ID, blockName), new BlockItem(blockInstance, new Item.Settings()));

        // Register the actual block.
        return Registry.register(Registries.BLOCK, Identifier.of(EnrichedMod.MOD_ID, blockName), blockInstance);
    }

    public static void registerToItemGroup(ItemConvertible item, RegistryKey<ItemGroup> itemGroupRegistryKey)
    {
        ItemGroupEvents.modifyEntriesEvent(itemGroupRegistryKey).register(entries -> entries.add(item));
    }
}
