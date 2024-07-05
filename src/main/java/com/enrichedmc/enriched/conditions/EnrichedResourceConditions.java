package com.enrichedmc.enriched.conditions;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.conditions.impl.*;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;

public class EnrichedResourceConditions {
  public static final ResourceCondition RUBY_ENABLED;
  public static final ResourceCondition SAPPHIRE_ENABLED;
  public static final ResourceCondition TANZANITE_ENABLED;
  public static final ResourceCondition STEEL_ENABLED;
  public static final ResourceCondition OBSIDIAN_ENABLED;
  public static final ResourceCondition EMERALD_ENABLED;
  public static final ResourceCondition COPPER_ENABLED;
  public static final ResourceCondition HORSE_ARMOR_ENABLED;
  public static final ResourceCondition CHAINMAIL_ENABLED;
  public static final ResourceCondition RAW_SMELTING_ENABLED;
  public static final ResourceCondition UNCRAFTING_ENABLED;

  static {
    RUBY_ENABLED = new RubyResourceCondition();
    SAPPHIRE_ENABLED = new SapphireResourceCondition();
    TANZANITE_ENABLED = new TanzaniteResourceCondition();
    STEEL_ENABLED = new SteelResourceCondition();
    OBSIDIAN_ENABLED = new ObsidianResourceCondition();
    EMERALD_ENABLED = new EmeraldResourceCondition();
    COPPER_ENABLED = new CopperResourceCondition();
    HORSE_ARMOR_ENABLED = new HorseArmorResourceCondition();
    CHAINMAIL_ENABLED = new ChainmailResourceCondition();
    RAW_SMELTING_ENABLED = new RawSmeltingResourceCondition();
    UNCRAFTING_ENABLED = new UncraftingResourceCondition();

    ResourceConditions.register(RUBY_ENABLED.getType());
    ResourceConditions.register(SAPPHIRE_ENABLED.getType());
    ResourceConditions.register(TANZANITE_ENABLED.getType());
    ResourceConditions.register(STEEL_ENABLED.getType());
    ResourceConditions.register(OBSIDIAN_ENABLED.getType());
    ResourceConditions.register(EMERALD_ENABLED.getType());
    ResourceConditions.register(COPPER_ENABLED.getType());
    ResourceConditions.register(HORSE_ARMOR_ENABLED.getType());
    ResourceConditions.register(CHAINMAIL_ENABLED.getType());
    ResourceConditions.register(RAW_SMELTING_ENABLED.getType());
    ResourceConditions.register(UNCRAFTING_ENABLED.getType());
  }

  public static void registerResourceConditions() {
    EnrichedMod.LOGGER.info("Registering Enriched's resource conditions...");
  }
}
