package com.enrichedmc.enriched;

import com.enrichedmc.enriched.networking.EnrichedClientNetworking;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class EnrichedClientMod implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        EnrichedClientNetworking.registerClientboundPackets();
    }
}
