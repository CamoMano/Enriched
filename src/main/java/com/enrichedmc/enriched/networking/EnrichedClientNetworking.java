package com.enrichedmc.enriched.networking;

import com.enrichedmc.enriched.networking.payloads.OpenOptionsScreenPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class EnrichedClientNetworking
{
    public static void registerClientboundPackets()
    {
        ClientPlayNetworking.registerGlobalReceiver(OpenOptionsScreenPayload.ID, new OpenOptionsScreenPayload.PayloadHandler());
    }
}
