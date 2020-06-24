package com.vanillaenhanced.config;


import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import java.util.Optional;
import java.util.function.Supplier;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;

@Environment(EnvType.CLIENT)
public class ModMenu implements ModMenuApi {

    //@Override
    public String getModId() {
        return "vanillaenhanced";
    }


    //@Override
    public Optional<Supplier<Screen>> getConfigScreen(Screen screen) {
        return Optional.of(AutoConfig.getConfigScreen(ModConfig.class, screen));
    }

}
