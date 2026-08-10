package com.enrichedmc.enriched.world;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class EnrichedConfiguredFeatures {
  public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "ruby_ore");

  public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "sapphire_ore");

  public static final ResourceKey<ConfiguredFeature<?, ?>> TANZANITE_ORE_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "tanzanite_ore");

  public static final ResourceKey<ConfiguredFeature<?, ?>> AMBER_ORE_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "amber_ore");

  public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "topaz_ore");
  public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "tin_ore");

  public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "redwood");

  public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_GRANITE_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "dark_granite");

  public static final ResourceKey<ConfiguredFeature<?, ?>> MARBLE_KEY =
      EnrichedRegisters.createRegistryKey(Registries.CONFIGURED_FEATURE, "marble");

  public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    RuleTest stoneOverwoldReplaceables = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);

    List<OreConfiguration.TargetBlockState> overworldRubyOres =
        Lists.newArrayList(
            OreConfiguration.target(
                stoneReplaceables, EnrichedBlocks.RUBY_ORE.defaultBlockState()),
            OreConfiguration.target(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_RUBY_ORE.defaultBlockState()));

    List<OreConfiguration.TargetBlockState> overworldSapphireOres =
        Lists.newArrayList(
            OreConfiguration.target(
                stoneReplaceables, EnrichedBlocks.SAPPHIRE_ORE.defaultBlockState()),
            OreConfiguration.target(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE.defaultBlockState()));

    List<OreConfiguration.TargetBlockState> overworldTanzaniteOres =
        Lists.newArrayList(
            OreConfiguration.target(
                stoneReplaceables, EnrichedBlocks.TANZANITE_ORE.defaultBlockState()),
            OreConfiguration.target(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_TANZANITE_ORE.defaultBlockState()));

    List<OreConfiguration.TargetBlockState> overworldAmberOres =
        Lists.newArrayList(
            OreConfiguration.target(
                stoneReplaceables, EnrichedBlocks.AMBER_ORE.defaultBlockState()),
            OreConfiguration.target(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_AMBER_ORE.defaultBlockState()));

    List<OreConfiguration.TargetBlockState> overworldTopazOres =
        Lists.newArrayList(
            OreConfiguration.target(
                stoneReplaceables, EnrichedBlocks.TOPAZ_ORE.defaultBlockState()),
            OreConfiguration.target(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_TOPAZ_ORE.defaultBlockState()));

    List<OreConfiguration.TargetBlockState> overworldTinOres =
        Lists.newArrayList(
            OreConfiguration.target(
                stoneReplaceables, EnrichedBlocks.TIN_ORE.defaultBlockState()),
            OreConfiguration.target(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_TIN_ORE.defaultBlockState()));

    List<OreConfiguration.TargetBlockState> overworldDarkGranite =
        Lists.newArrayList(
            OreConfiguration.target(
                stoneOverwoldReplaceables, EnrichedBlocks.DARK_GRANITE.defaultBlockState()));

    List<OreConfiguration.TargetBlockState> overworldMarble =
        Lists.newArrayList(
            OreConfiguration.target(
                stoneOverwoldReplaceables, EnrichedBlocks.MARBLE.defaultBlockState()));

    EnrichedConfiguredFeatures.register(
        context, RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 6));
    EnrichedConfiguredFeatures.register(
        context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 5));
    EnrichedConfiguredFeatures.register(
        context, TANZANITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTanzaniteOres, 6));

    EnrichedConfiguredFeatures.register(
        context, AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 4));

    EnrichedConfiguredFeatures.register(
        context, TOPAZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTopazOres, 6));

    EnrichedConfiguredFeatures.register(
        context, TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 10));

    EnrichedConfiguredFeatures.register(
        context, DARK_GRANITE_KEY, Feature.ORE, new OreConfiguration(overworldDarkGranite, 64));
    EnrichedConfiguredFeatures.register(
        context, MARBLE_KEY, Feature.ORE, new OreConfiguration(overworldMarble, 64));

    EnrichedConfiguredFeatures.register(
        context,
        REDWOOD_KEY,
        Feature.TREE,
        new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(EnrichedBlocks.REDWOOD_LOG),
                new MegaJungleTrunkPlacer(10, 2, 19),
                BlockStateProvider.simple(EnrichedBlocks.REDWOOD_LEAVES),
                new MegaJungleFoliagePlacer(
                    ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 1, 2),
                BlockStateProvider.simple(Blocks.DIRT))
            .build());
  }

  private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
      BootstrapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key,
      F feature,
      FC featureConfig) {
    context.register(key, new ConfiguredFeature<>(feature, featureConfig));
  }
}
