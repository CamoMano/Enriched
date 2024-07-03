package com.enrichedmc.enriched.networking;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.networking.payloads.OpenOptionsScreenPayload;
import com.enrichedmc.enriched.networking.payloads.ReloadDataPacksPacket;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.util.Identifier;

public class EnrichedNetworking
{
    public static final Identifier OPEN_OPTIONS_SCREEN_PACKET = Identifier.of(EnrichedMod.MOD_ID, "open_options_screen");
    public static final Identifier RELOAD_DATA_PACKS_PACKET = Identifier.of(EnrichedMod.MOD_ID, "reload_data_packs");

    public static void registerPayloads()
    {
        PayloadTypeRegistry.playS2C().register(OpenOptionsScreenPayload.ID, OpenOptionsScreenPayload.CODEC);

        PayloadTypeRegistry.playC2S().register(ReloadDataPacksPacket.ID, ReloadDataPacksPacket.CODEC);
    }
}
