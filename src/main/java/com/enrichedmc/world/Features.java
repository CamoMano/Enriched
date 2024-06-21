package com.enrichedmc.world;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.apache.logging.log4j.Level;

import static com.enrichedmc.Enriched.*;

public class Features
{

    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, identifier("redwood_tree"));

    public static void log(Level level, String message)
    {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    public static void register()
    {
        log(Level.INFO, "Loaded features.");
    }
}
