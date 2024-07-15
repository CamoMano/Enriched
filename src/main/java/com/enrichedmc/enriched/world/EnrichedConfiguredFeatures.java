package com.enrichedmc.enriched.world;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;

public class EnrichedConfiguredFeatures {
  public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "ruby_ore");

  public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "sapphire_ore");

  public static final RegistryKey<ConfiguredFeature<?, ?>> TANZANITE_ORE_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "tanzanite_ore");

  public static final RegistryKey<ConfiguredFeature<?, ?>> AMBER_ORE_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "amber_ore");

  public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "topaz_ore");
  public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "tin_ore");

  public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "redwood");

  public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_GRANITE_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "dark_granite");

  public static final RegistryKey<ConfiguredFeature<?, ?>> MARBLE_KEY =
      EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE, "marble");

  public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
    RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    RuleTest stoneOverwoldReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD);

    List<OreFeatureConfig.Target> overworldRubyOres =
        Lists.newArrayList(
            OreFeatureConfig.createTarget(
                stoneReplaceables, EnrichedBlocks.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

    List<OreFeatureConfig.Target> overworldSapphireOres =
        Lists.newArrayList(
            OreFeatureConfig.createTarget(
                stoneReplaceables, EnrichedBlocks.SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

    List<OreFeatureConfig.Target> overworldTanzaniteOres =
        Lists.newArrayList(
            OreFeatureConfig.createTarget(
                stoneReplaceables, EnrichedBlocks.TANZANITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_TANZANITE_ORE.getDefaultState()));

    List<OreFeatureConfig.Target> overworldAmberOres =
        Lists.newArrayList(
            OreFeatureConfig.createTarget(
                stoneReplaceables, EnrichedBlocks.AMBER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_AMBER_ORE.getDefaultState()));

    List<OreFeatureConfig.Target> overworldTopazOres =
        Lists.newArrayList(
            OreFeatureConfig.createTarget(
                stoneReplaceables, EnrichedBlocks.TOPAZ_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));

    List<OreFeatureConfig.Target> overworldTinOres =
        Lists.newArrayList(
            OreFeatureConfig.createTarget(
                stoneReplaceables, EnrichedBlocks.TIN_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(
                deepslateReplaceables, EnrichedBlocks.DEEPSLATE_TIN_ORE.getDefaultState()));

    List<OreFeatureConfig.Target> overworldDarkGranite =
        Lists.newArrayList(
            OreFeatureConfig.createTarget(
                stoneOverwoldReplaceables, EnrichedBlocks.DARK_GRANITE.getDefaultState()));

    List<OreFeatureConfig.Target> overworldMarble =
        Lists.newArrayList(
            OreFeatureConfig.createTarget(
                stoneOverwoldReplaceables, EnrichedBlocks.MARBLE.getDefaultState()));

    EnrichedConfiguredFeatures.register(
        context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 6));
    EnrichedConfiguredFeatures.register(
        context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 5));
    EnrichedConfiguredFeatures.register(
        context, TANZANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTanzaniteOres, 6));

    EnrichedConfiguredFeatures.register(
        context, AMBER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAmberOres, 4));

    EnrichedConfiguredFeatures.register(
        context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 6));

    EnrichedConfiguredFeatures.register(
        context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 8));

    EnrichedConfiguredFeatures.register(
        context, DARK_GRANITE_KEY, Feature.ORE, new OreFeatureConfig(overworldDarkGranite, 64));
    EnrichedConfiguredFeatures.register(
        context, MARBLE_KEY, Feature.ORE, new OreFeatureConfig(overworldMarble, 64));

    EnrichedConfiguredFeatures.register(
        context,
        REDWOOD_KEY,
        Feature.TREE,
        new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EnrichedBlocks.REDWOOD_LOG),
                new MegaJungleTrunkPlacer(10, 2, 19),
                BlockStateProvider.of(EnrichedBlocks.REDWOOD_LEAVES),
                new JungleFoliagePlacer(
                    ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                new TwoLayersFeatureSize(1, 1, 2))
            .build());
  }

  private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
      Registerable<ConfiguredFeature<?, ?>> context,
      RegistryKey<ConfiguredFeature<?, ?>> key,
      F feature,
      FC featureConfig) {
    context.register(key, new ConfiguredFeature<>(feature, featureConfig));
  }
}
