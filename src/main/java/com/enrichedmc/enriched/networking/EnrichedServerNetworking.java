package com.enrichedmc.enriched.networking;

import com.enrichedmc.enriched.networking.payloads.ReloadDataPacksPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public class EnrichedServerNetworking
{
    public static void registerServerboundPackets()
    {
        ServerPlayNetworking.registerGlobalReceiver(ReloadDataPacksPacket.ID, new ReloadDataPacksPacket.PayloadHandler());
    }
}
