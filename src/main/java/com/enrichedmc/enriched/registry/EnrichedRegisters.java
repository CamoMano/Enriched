package com.enrichedmc.enriched.registry;

import com.enrichedmc.enriched.EnrichedMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class EnrichedRegisters {
  public static Item registerItem(String itemName, Item itemInstance) {
    return Registry.register(
        Registries.ITEM, Identifier.of(EnrichedMod.MOD_ID, itemName), itemInstance);
  }

  public static Block registerBlock(String blockName, Block blockInstance) {
    // Register the block item.
    Registry.register(
        Registries.ITEM,
        Identifier.of(EnrichedMod.MOD_ID, blockName),
        new BlockItem(blockInstance, new Item.Settings()));

    // Register the actual block.
    return Registry.register(
        Registries.BLOCK, Identifier.of(EnrichedMod.MOD_ID, blockName), blockInstance);
  }

  public static void registerToItemGroup(
      ItemConvertible item, RegistryKey<ItemGroup> itemGroupRegistryKey) {
    ItemGroupEvents.modifyEntriesEvent(itemGroupRegistryKey).register(entries -> entries.add(item));
  }

  public static <T extends Entity> EntityType<T> registerEntityType(
      String name, EntityType<T> entityType) {
    return Registry.register(
        Registries.ENTITY_TYPE, Identifier.of(EnrichedMod.MOD_ID, name), entityType);
  }

  public static <T extends ParticleEffect> ParticleType<T> registerParticleType(
      String name, ParticleType<T> particleType) {
    return Registry.register(
        Registries.PARTICLE_TYPE, Identifier.of(EnrichedMod.MOD_ID, name), particleType);
  }

  public static <T> RegistryKey<T> createRegistryKey(
      RegistryKey<Registry<T>> registryKey, String name) {
    return RegistryKey.of(registryKey, Identifier.of(EnrichedMod.MOD_ID, name));
  }

  public static <T> TagKey<T> createTagKey(RegistryKey<Registry<T>> registryKey, String path) {
    return TagKey.of(registryKey, Identifier.of(EnrichedMod.MOD_ID, path));
  }
}
