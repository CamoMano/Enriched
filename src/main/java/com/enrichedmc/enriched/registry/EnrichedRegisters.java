package com.enrichedmc.enriched.registry;

import com.enrichedmc.enriched.EnrichedMod;
import java.util.function.Function;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class EnrichedRegisters {

  public static Identifier id(String path) {
    return Identifier.fromNamespaceAndPath(EnrichedMod.MOD_ID, path);
  }

  public static ResourceKey<Block> blockKey(Block block) {
    return BuiltInRegistries.BLOCK.getResourceKey(block).orElseThrow();
  }

  public static ResourceKey<Item> itemKey(ItemLike item) {
    return BuiltInRegistries.ITEM.getResourceKey(item.asItem()).orElseThrow();
  }

  public static Item registerItem(String itemName, Function<Item.Properties, Item> itemFactory) {
    ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id(itemName));

    return Registry.register(
        BuiltInRegistries.ITEM, itemKey, itemFactory.apply(new Item.Properties().setId(itemKey)));
  }

  public static Block registerBlock(
      String blockName,
      Function<BlockBehaviour.Properties, Block> blockFactory,
      BlockBehaviour.Properties properties) {
    ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id(blockName));
    ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id(blockName));

    Block block = blockFactory.apply(properties.setId(blockKey));

    // Register the block item.
    Registry.register(
        BuiltInRegistries.ITEM,
        itemKey,
        new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(itemKey)));

    // Register the actual block.
    return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
  }

  public static void registerToItemGroup(
      ItemLike item, ResourceKey<CreativeModeTab> itemGroupRegistryKey) {
    CreativeModeTabEvents.modifyOutputEvent(itemGroupRegistryKey)
        .register(output -> output.accept(item));
  }

  public static <T extends Entity> EntityType<T> registerEntityType(
      String name, EntityType<T> entityType) {
    return Registry.register(BuiltInRegistries.ENTITY_TYPE, id(name), entityType);
  }

  public static <T extends ParticleOptions> ParticleType<T> registerParticleType(
      String name, ParticleType<T> particleType) {
    return Registry.register(BuiltInRegistries.PARTICLE_TYPE, id(name), particleType);
  }

  public static <T> ResourceKey<T> createRegistryKey(
      ResourceKey<Registry<T>> registryKey, String name) {
    return ResourceKey.create(registryKey, id(name));
  }

  public static <T> TagKey<T> createTagKey(ResourceKey<Registry<T>> registryKey, String path) {
    return TagKey.create(registryKey, id(path));
  }

  public static <T> TagKey<T> createCommonTagKey(
      ResourceKey<Registry<T>> registryKey, String path) {
    return TagKey.create(registryKey, Identifier.fromNamespaceAndPath("c", path));
  }
}
