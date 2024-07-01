package com.enrichedmc.enriched;

import com.enrichedmc.enriched.item.EnrichedItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class EnrichedMod implements ModInitializer
{
    public static final Logger LOGGER = (Logger) LogManager.getLogger("Enriched");
    public static final String MOD_ID = "enriched";

    @Override
    public void onInitialize()
    {
        LOGGER.info("Initializing Enriched... (Version: {})", FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(NullPointerException::new)
                .getMetadata().getVersion().getFriendlyString());

        EnrichedItems.registerItems();
    }
}
