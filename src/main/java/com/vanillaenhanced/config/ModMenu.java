package com.vanillaenhanced.config;


import io.github.prospector.modmenu.api.ModMenuApi;
import java.util.function.Function;
import net.minecraft.client.gui.screen.Screen;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;


@Environment(EnvType.CLIENT)

public class ModMenu implements ModMenuApi {


    @Override
    public Function<Screen, ? extends Screen> getConfigScreenFactory() {
        return screen -> AutoConfig.getConfigScreen(ModConfig.class, screen).get();
    }


}
