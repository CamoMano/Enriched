package com.enrichedmc.enriched.config;

import com.enrichedmc.enriched.EnrichedMod;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.commons.io.FileUtils;

public class EnrichedGameOptions {
  private static final Path CONFIG_FILE =
      FabricLoader.getInstance().getConfigDir().resolve("enriched-settings.json");

  private static final Gson GSON =
      new GsonBuilder()
          .setPrettyPrinting()
          .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
          .create();

  public final ToolsAndArmorOptions toolsAndArmorOptions = new ToolsAndArmorOptions();
  public final RecipeOptions recipeOptions = new RecipeOptions();
  //public final MobOptions mobOptions = new MobOptions();
  public final WorldGenerationOptions worldGenerationOptions = new WorldGenerationOptions();

  public static EnrichedGameOptions defaults() {
    return new EnrichedGameOptions();
  }

  public static EnrichedGameOptions load() {
    if (Files.exists(EnrichedGameOptions.CONFIG_FILE)) {
      StringBuilder configFileContents = new StringBuilder();

      try {
        configFileContents.append(
            FileUtils.readFileToString(CONFIG_FILE.toFile(), StandardCharsets.UTF_8));
      } catch (IOException exception) {
        exception.printStackTrace();
      }

      EnrichedGameOptions enrichedGameOptions = null;

      try {
        enrichedGameOptions =
            GSON.fromJson(configFileContents.toString(), EnrichedGameOptions.class);
      } catch (JsonSyntaxException exception) {
        exception.printStackTrace();
      }

      return enrichedGameOptions;
    } else {
      EnrichedMod.LOGGER.warn("Failed to load Enriched's game options! Loading defaults...");

      EnrichedGameOptions defaultEnrichedGameOptions = EnrichedGameOptions.defaults();
      defaultEnrichedGameOptions.write();

      return defaultEnrichedGameOptions;
    }
  }

  public void write() {
    try {
      FileUtils.writeStringToFile(CONFIG_FILE.toFile(), GSON.toJson(this), StandardCharsets.UTF_8);
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }

  public static class ToolsAndArmorOptions {
    public boolean enableRubyGear = true;
    public boolean enableSapphireGear = true;
    public boolean enableTanzaniteGear = true;
    public boolean enableSteelGear = true;
    public boolean enableObsidianGear = true;
    public boolean enableEmeraldGear = true;

    public boolean enableBronzeGear = true;
    public boolean enableCopperTools = true;
  }

  public static class RecipeOptions {
    public boolean enableHorseArmorRecipes = true;
    public boolean enableChainmailRecipes = true;
    public boolean enableRawSmeltingRecipes = true;
    public boolean enableUncraftingRecipes = true;

    public boolean enableFoodRecipes = true;
  }

/*
  public static class MobOptions {

  }


 */
  public static class WorldGenerationOptions {
    public boolean generateRubyOres = true;
    public boolean generateSapphireOres = true;
    public boolean generateTanzaniteOres = true;

    public boolean generateAmberOres = true;

    public boolean generateTopazOres = true;

    public boolean generateTinOres = true;
    public boolean generateDarkGranite = true;
    public boolean generateMarble = true;
  }
}
