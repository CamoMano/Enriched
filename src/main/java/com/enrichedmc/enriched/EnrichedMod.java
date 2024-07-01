package com.enrichedmc.enriched;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.materials.armor.EnrichedArmorMaterials;
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

        // (Ayydxn) These don't do anything and are being called, so the JVM will load the class and run their static blocks.
        EnrichedItems.registerItems();
        EnrichedBlocks.registerBlocks();
        EnrichedArmorMaterials.register();
    }
}
