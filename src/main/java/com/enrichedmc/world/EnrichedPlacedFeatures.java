package com.enrichedmc.world;

import com.enrichedmc.Enriched;
import com.enrichedmc.registry.ModInit;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class EnrichedPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> REDWOOD_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Enriched.MOD_ID, "redwood_placed"));

    public static void bootstrap(Registerable<PlacedFeature> context)
    {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        EnrichedPlacedFeatures.register(context, REDWOOD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(Features.REDWOOD_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModInit.REDWOOD_SAPLING));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuredFeature,
                                 List<PlacementModifier> placementModifiers)
    {
        context.register(key, new PlacedFeature(configuredFeature, placementModifiers));
    }
}
