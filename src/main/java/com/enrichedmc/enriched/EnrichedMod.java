package com.enrichedmc.enriched;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.commands.OpenOptionsScreenCommand;
import com.enrichedmc.enriched.conditions.EnrichedResourceConditions;
import com.enrichedmc.enriched.config.EnrichedGameOptions;
import com.enrichedmc.enriched.entity.EnrichedEntityTypes;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.enrichedmc.enriched.materials.armor.EnrichedArmorMaterials;
import com.enrichedmc.enriched.networking.EnrichedNetworking;
import com.enrichedmc.enriched.networking.EnrichedServerNetworking;
import com.enrichedmc.enriched.tag.EnrichedTags;
import com.enrichedmc.enriched.world.gen.EnrichedWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class EnrichedMod implements ModInitializer
{
    private static EnrichedMod INSTANCE;

    public static final Logger LOGGER = (Logger) LogManager.getLogger("Enriched");
    public static final String MOD_ID = "enriched";

    private EnrichedGameOptions enrichedGameOptions;

    @Override
    public void onInitialize()
    {
        INSTANCE = this;

        LOGGER.info("Initializing Enriched... (Version: {})", FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(NullPointerException::new)
                .getMetadata().getVersion().getFriendlyString());

        this.enrichedGameOptions = EnrichedGameOptions.load();

        // (Ayydxn) These don't do anything and are being called, so the JVM will load the class and run their static blocks.
        EnrichedItems.registerItems();
        EnrichedBlocks.registerBlocks();
        EnrichedTags.registerTags();
        EnrichedEntityTypes.registerEntityTypes();
        EnrichedArmorMaterials.register();
        EnrichedResourceConditions.registerResourceConditions();

        EnrichedWorldGeneration.generateWorldGeneration();

        EnrichedNetworking.registerPayloads();
        EnrichedServerNetworking.registerServerboundPackets();

        StrippableBlockRegistry.register(EnrichedBlocks.REDWOOD_LOG, EnrichedBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(EnrichedBlocks.REDWOOD_WOOD, EnrichedBlocks.STRIPPED_REDWOOD_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(EnrichedBlocks.REDWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EnrichedBlocks.REDWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EnrichedBlocks.STRIPPED_REDWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EnrichedBlocks.REDWOOD_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EnrichedBlocks.REDWOOD_LEAVES, 30, 60);

        CommandRegistrationCallback.EVENT.register(new OpenOptionsScreenCommand());
    }

    public static EnrichedMod getInstance()
    {
        if (INSTANCE == null)
            throw new IllegalStateException("Tried to access an instance of Enriched before one was available!");

        return INSTANCE;
    }

    public EnrichedGameOptions getGameOptions()
    {
        return this.enrichedGameOptions;
    }
}
