package com.vanillaenhanced;

import com.vanillaenhanced.biome.BiomesRedo;
import com.vanillaenhanced.config.ModConfig;
import com.vanillaenhanced.registry.ModInit;
import com.vanillaenhanced.world.Generator;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import me.shedaniel.cloth.api.dynamic.registry.v1.DynamicRegistryCallback;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class VanillaEnhanced implements ModInitializer{

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "vanillaenhanced";
    public static final String MOD_NAME = "VanillaEnhanced";


    @Override
    public void onInitialize() {
        log(Level.INFO, "Hello there.");

        //Config
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
        //Setup
        ModInit.Register();
        BiomesRedo.init();

        DynamicRegistryCallback.callback(Registry.BIOME_KEY).register((dynamicRegistryManager, registryKey, biome) -> {
            Generator.oreGen(registryKey, biome);
            Generator.blockGen(registryKey, biome);
        });

    }



    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}