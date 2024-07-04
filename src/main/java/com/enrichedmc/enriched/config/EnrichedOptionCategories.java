package com.enrichedmc.enriched.config;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.networking.payloads.ReloadDataPacksPacket;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.gui.controllers.BooleanController;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.text.Text;

public class EnrichedOptionCategories
{
    private static final EnrichedGameOptions ENRICHED_GAME_OPTIONS;
    private static final EnrichedGameOptions.ToolsAndArmorOptions TOOLS_AND_ARMOR_OPTIONS;
    private static final EnrichedGameOptions.RecipeOptions RECIPE_OPTIONS;
    private static final EnrichedGameOptions.MobOptions MOB_OPTIONS;

    private static final OptionFlag RELOAD_DATA_PACKS;

    static
    {
        ENRICHED_GAME_OPTIONS = EnrichedMod.getInstance().getGameOptions();
        TOOLS_AND_ARMOR_OPTIONS = ENRICHED_GAME_OPTIONS.toolsAndArmorOptions;
        RECIPE_OPTIONS = ENRICHED_GAME_OPTIONS.recipeOptions;
        MOB_OPTIONS = ENRICHED_GAME_OPTIONS.mobOptions;

        // FIXME: (Ayydxn) Doesn't work on dedicated servers. Will have to investigate that.
        RELOAD_DATA_PACKS = (client) -> ClientPlayNetworking.send(new ReloadDataPacksPacket());
    }

    public static ConfigCategory toolsAndArmor()
    {
        return ConfigCategory.createBuilder()
                .name(Text.translatable("enriched.options.category.toolsAndArmor"))
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableRubyGear"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.toolsAndArmor.enableRubyGear.description")))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableRubyGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableRubyGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableRubyGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableSapphireGear"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.toolsAndArmor.enableSapphireGear.description")))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableSapphireGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableSapphireGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableSapphireGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableTanzaniteGear"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.toolsAndArmor.enableTanzaniteGear.description")))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableTanzaniteGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableTanzaniteGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableTanzaniteGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableSteelGear"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.toolsAndArmor.enableSteelGear.description")))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableSteelGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableSteelGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableSteelGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableObsidianGear"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.toolsAndArmor.enableObsidianGear.description")))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableObsidianGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableObsidianGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableObsidianGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableEmeraldGear"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.toolsAndArmor.enableEmeraldGear.description")))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableEmeraldGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableEmeraldGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableEmeraldGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableCopperTools"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.toolsAndArmor.enableCopperTools.description")))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableCopperTools, () -> TOOLS_AND_ARMOR_OPTIONS.enableCopperTools, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableCopperTools = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .build();
    }

    public static ConfigCategory recipes()
    {
        return ConfigCategory.createBuilder()
                .name(Text.translatable("enriched.options.category.recipes"))
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.recipes.enableHorseArmorRecipes"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.recipes.enableHorseArmorRecipes.description")))
                        .binding(EnrichedGameOptions.defaults().recipeOptions.enableHorseArmorRecipes, () -> RECIPE_OPTIONS.enableHorseArmorRecipes, newValue -> RECIPE_OPTIONS.enableHorseArmorRecipes = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.recipes.enableChainmailRecipes"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.recipes.enableChainmailRecipes.description")))
                        .binding(EnrichedGameOptions.defaults().recipeOptions.enableChainmailRecipes, () -> RECIPE_OPTIONS.enableChainmailRecipes, newValue -> RECIPE_OPTIONS.enableChainmailRecipes = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.recipes.enableRawSmeltingRecipes"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.recipes.enableRawSmeltingRecipes.description")))
                        .binding(EnrichedGameOptions.defaults().recipeOptions.enableRawSmeltingRecipes, () -> RECIPE_OPTIONS.enableRawSmeltingRecipes, newValue -> RECIPE_OPTIONS.enableRawSmeltingRecipes = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.recipes.enableUncraftingRecipes"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.recipes.enableUncraftingRecipes.description")))
                        .binding(EnrichedGameOptions.defaults().recipeOptions.enableUncraftingRecipes, () -> RECIPE_OPTIONS.enableUncraftingRecipes, newValue -> RECIPE_OPTIONS.enableUncraftingRecipes = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .build();
    }

    public static ConfigCategory mobs()
    {
        return ConfigCategory.createBuilder()
                .name(Text.translatable("enriched.options.category.mobs"))
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.mobs.enableHoneySlimeSpawning"))
                        .description(OptionDescription.of(Text.translatable("enriched.options.mobs.enableHoneySlimeSpawning.description")))
                        .binding(EnrichedGameOptions.defaults().mobOptions.enableHoneySlimeSpawning, () -> MOB_OPTIONS.enableHoneySlimeSpawning, newValue -> MOB_OPTIONS.enableHoneySlimeSpawning = newValue)
                        .customController(BooleanController::new)
                        .build())
                .build();
    }
}
