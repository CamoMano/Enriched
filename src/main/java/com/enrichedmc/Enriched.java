package com.enrichedmc;

import com.enrichedmc.commands.Commands;
import com.enrichedmc.config.ModConfig;
import com.enrichedmc.recipes.DynamicRecipes;
import com.enrichedmc.registry.ModInit;
import com.enrichedmc.world.Features;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Enriched implements ModInitializer {
  public static final Logger LOGGER = LogManager.getLogger();
  public static final String MOD_ID = "enriched";
  public static final String MOD_NAME = "Enriched";
  public static final String MOD_VERSION =
      FabricLoader.getInstance()
          .getModContainer("enriched")
          .get()
          .getMetadata()
          .getVersion()
          .toString();

  public static void log(Level level, String message) {
    LOGGER.log(level, "[" + MOD_NAME + "] " + message);
  }

  public static Identifier identifier(String name) {
    return new Identifier(MOD_ID, name);
  }

  @Override
  public void onInitialize() {
    log(Level.INFO, "Hello there!");
    // Config
    AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
    ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    // Setup
    ModInit.Register(config);
    Features.register();
    DynamicRecipes.register(config);
    Commands.register();
  }
}
