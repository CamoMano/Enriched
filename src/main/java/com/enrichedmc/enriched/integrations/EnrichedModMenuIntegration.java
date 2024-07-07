package com.enrichedmc.enriched.integrations;

import com.enrichedmc.enriched.config.gui.EnrichedOptionsScreen;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class EnrichedModMenuIntegration implements ModMenuApi {
  @Override
  public ConfigScreenFactory<?> getModConfigScreenFactory() {
    return screen -> new EnrichedOptionsScreen(screen).getHandle();
  }
}
