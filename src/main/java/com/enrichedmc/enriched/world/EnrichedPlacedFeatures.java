package com.enrichedmc.enriched.world;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class EnrichedPlacedFeatures {
  public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "ruby_ore_placed");
  public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "sapphire_ore_placed");
  public static final ResourceKey<PlacedFeature> TANZANITE_ORE_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "tanzanite_ore_placed");

  public static final ResourceKey<PlacedFeature> AMBER_ORE_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "amber_ore_placed");

  public static final ResourceKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "topaz_ore_placed");

  public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "tin_ore_placed");

  public static final ResourceKey<PlacedFeature> REDWOOD_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "redwood_placed");

  public static final ResourceKey<PlacedFeature> DARK_GRANITE_UPPER_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "dark_granite_upper_placed");

  public static final ResourceKey<PlacedFeature> DARK_GRANITE_LOWER_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "dark_granite_lower_placed");

  public static final ResourceKey<PlacedFeature> MARBLE_UPPER_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "marble_upper_placed");

  public static final ResourceKey<PlacedFeature> MARBLE_LOWER_PLACED_KEY =
      EnrichedRegisters.createRegistryKey(Registries.PLACED_FEATURE, "marble_lower_placed");

  public static void bootstrap(BootstrapContext<PlacedFeature> context) {
    HolderGetter<ConfiguredFeature<?, ?>> registryEntryLookup =
        context.lookup(Registries.CONFIGURED_FEATURE);

    register(
        context,
        RUBY_ORE_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.RUBY_ORE_KEY),
        OrePlacements.commonOrePlacement(
            7, HeightRangePlacement.uniform(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(55))));

    register(
        context,
        SAPPHIRE_ORE_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.SAPPHIRE_ORE_KEY),
        OrePlacements.commonOrePlacement(
            6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(55))));

    register(
        context,
        TANZANITE_ORE_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.TANZANITE_ORE_KEY),
        OrePlacements.commonOrePlacement(
            6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(55))));

    register(
        context,
        AMBER_ORE_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.AMBER_ORE_KEY),
        OrePlacements.commonOrePlacement(
            6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(55))));

    register(
        context,
        TOPAZ_ORE_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.TOPAZ_ORE_KEY),
        OrePlacements.commonOrePlacement(
            6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(55))));

    register(
        context,
        TIN_ORE_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.TIN_ORE_KEY),
        OrePlacements.commonOrePlacement(
            16, HeightRangePlacement.uniform(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(75))));

    register(
        context,
        REDWOOD_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.REDWOOD_KEY),
        VegetationPlacements.treePlacement(
            PlacementUtils.countExtra(2, 0.1f, 2), EnrichedBlocks.REDWOOD_SAPLING));

    register(
        context,
        DARK_GRANITE_UPPER_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.DARK_GRANITE_KEY),
        OrePlacements.rareOrePlacement(
            6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));

    register(
        context,
        DARK_GRANITE_LOWER_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.DARK_GRANITE_KEY),
        OrePlacements.commonOrePlacement(
            2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));

    register(
        context,
        MARBLE_UPPER_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.MARBLE_KEY),
        OrePlacements.rareOrePlacement(
            6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));

    register(
        context,
        MARBLE_LOWER_PLACED_KEY,
        registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.MARBLE_KEY),
        OrePlacements.commonOrePlacement(
            2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
  }

  private static void register(
      BootstrapContext<PlacedFeature> context,
      ResourceKey<PlacedFeature> registryKey,
      Holder<ConfiguredFeature<?, ?>> configuration,
      List<PlacementModifier> placementModifiers) {
    context.register(
        registryKey, new PlacedFeature(configuration, List.copyOf(placementModifiers)));
  }
}
