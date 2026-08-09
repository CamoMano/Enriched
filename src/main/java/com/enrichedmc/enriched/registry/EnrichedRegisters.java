package com.enrichedmc.enriched.registry;

import com.enrichedmc.enriched.EnrichedMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

public class EnrichedRegisters {
  public static Item registerItem(String itemName, Item itemInstance) {
    return Registry.register(
        BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, itemName), itemInstance);
  }

  public static Block registerBlock(String blockName, Block blockInstance) {
    // Register the block item.
    Registry.register(
        BuiltInRegistries.ITEM,
        ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, blockName),
        new BlockItem(blockInstance, new Item.Properties()));

    // Register the actual block.
    return Registry.register(
        BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, blockName), blockInstance);
  }

  public static void registerToItemGroup(
      ItemLike item, ResourceKey<CreativeModeTab> itemGroupRegistryKey) {
    ItemGroupEvents.modifyEntriesEvent(itemGroupRegistryKey).register(entries -> entries.accept(item));
  }

  public static <T extends Entity> EntityType<T> registerEntityType(
      String name, EntityType<T> entityType) {
    return Registry.register(
        BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, name), entityType);
  }

  public static <T extends ParticleOptions> ParticleType<T> registerParticleType(
      String name, ParticleType<T> particleType) {
    return Registry.register(
        BuiltInRegistries.PARTICLE_TYPE, ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, name), particleType);
  }

  public static <T> ResourceKey<T> createRegistryKey(
      ResourceKey<Registry<T>> registryKey, String name) {
    return ResourceKey.create(registryKey, ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, name));
  }

  public static <T> TagKey<T> createTagKey(ResourceKey<Registry<T>> registryKey, String path) {
    return TagKey.create(registryKey, ResourceLocation.fromNamespaceAndPath(EnrichedMod.MOD_ID, path));
  }

  public static <T> TagKey<T> createCommonTagKey(
      ResourceKey<Registry<T>> registryKey, String path) {
    return TagKey.create(registryKey, ResourceLocation.fromNamespaceAndPath("c", path));
  }
}
