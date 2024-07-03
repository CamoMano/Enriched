package com.enrichedmc.enriched.world;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import com.google.common.collect.Lists;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class EnrichedConfiguredFeatures
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE,
            "ruby_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE,
            "sapphire_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TANZANITE_ORE_KEY = EnrichedRegisters.createRegistryKey(RegistryKeys.CONFIGURED_FEATURE,
            "tanzanite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldRubyOres =
                Lists.newArrayList(OreFeatureConfig.createTarget(stoneReplaceables, EnrichedBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, EnrichedBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSapphireOres =
                Lists.newArrayList(OreFeatureConfig.createTarget(stoneReplaceables, EnrichedBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTanzaniteOres =
                Lists.newArrayList(OreFeatureConfig.createTarget(stoneReplaceables, EnrichedBlocks.TANZANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, EnrichedBlocks.DEEPSLATE_TANZANITE_ORE.getDefaultState()));

        EnrichedConfiguredFeatures.register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 12));
        EnrichedConfiguredFeatures.register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 12));
        EnrichedConfiguredFeatures.register(context, TANZANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTanzaniteOres, 12));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC featureConfig)
    {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}
