package com.vanillaenhanced;

import com.vanillaenhanced.biome.Biomes;
import com.vanillaenhanced.config.ModConfig;
import com.vanillaenhanced.registry.ModInit;
import com.vanillaenhanced.world.Features;
import com.vanillaenhanced.world.Generator;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaEnhanced implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "vanillaenhanced";
    public static final String MOD_NAME = "VanillaEnhanced";
    public static final String MOD_VERSION = FabricLoader.getInstance().getModContainer("vanillaenhanced").get().getMetadata().getVersion().toString();

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    @Override
    public void onInitialize() {
        log(Level.INFO, "Hello there!");
        //Config
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
        //Setup
        ModInit.Register();
        Features.register();
        Biomes.register(config);
        Generator.register(config);
        //Commands.register();
    }
}