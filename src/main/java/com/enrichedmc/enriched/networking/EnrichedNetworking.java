package com.enrichedmc.enriched.networking;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.networking.payloads.OpenOptionsScreenPayload;
import com.enrichedmc.enriched.networking.payloads.ReloadDataPacksPacket;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.resources.Identifier;

public class EnrichedNetworking {
  public static final Identifier OPEN_OPTIONS_SCREEN_PACKET =
      Identifier.fromNamespaceAndPath(EnrichedMod.MOD_ID, "open_options_screen");
  public static final Identifier RELOAD_DATA_PACKS_PACKET =
      Identifier.fromNamespaceAndPath(EnrichedMod.MOD_ID, "reload_data_packs");

  public static void registerPayloads() {
    PayloadTypeRegistry.clientboundPlay()
        .register(OpenOptionsScreenPayload.ID, OpenOptionsScreenPayload.CODEC);

    PayloadTypeRegistry.serverboundPlay().register(ReloadDataPacksPacket.ID, ReloadDataPacksPacket.CODEC);
  }
}
