package com.enrichedmc.enriched.config.gui;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.config.EnrichedOptionCategories;
import com.google.common.collect.Lists;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EnrichedOptionsScreen
{
    private final Screen previousScreen;

    public EnrichedOptionsScreen(@Nullable Screen previousScreen)
    {
        this.previousScreen = previousScreen;
    }

    public Screen getHandle()
    {
        List<ConfigCategory> configCategories = Lists.newArrayList(EnrichedOptionCategories.toolsAndArmor(), EnrichedOptionCategories.recipes());

        return YetAnotherConfigLib.createBuilder()
                .title(Text.literal("Enriched Game Options"))
                .categories(configCategories)
                .save(() -> EnrichedMod.getInstance().getGameOptions().write())
                .build()
                .generateScreen(this.previousScreen);
    }
}
