package com.enrichedmc.enriched.networking.payloads;

import com.enrichedmc.enriched.config.gui.EnrichedOptionsScreen;
import com.enrichedmc.enriched.networking.EnrichedNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public class OpenOptionsScreenPayload implements CustomPayload
{
    public static final CustomPayload.Id<OpenOptionsScreenPayload> ID = new CustomPayload.Id<>(EnrichedNetworking.OPEN_OPTIONS_SCREEN_PACKET);
    public static final PacketCodec<RegistryByteBuf, OpenOptionsScreenPayload> CODEC = new PacketCodec<>()
    {
        @Override
        public OpenOptionsScreenPayload decode(RegistryByteBuf buf)
        {
            return new OpenOptionsScreenPayload();
        }

        @Override
        public void encode(RegistryByteBuf buf, OpenOptionsScreenPayload value)
        {
        }
    };

    @Override
    public Id<? extends CustomPayload> getId()
    {
        return OpenOptionsScreenPayload.ID;
    }

    public static class PayloadHandler implements ClientPlayNetworking.PlayPayloadHandler<OpenOptionsScreenPayload>
    {
        @Override
        public void receive(OpenOptionsScreenPayload payload, ClientPlayNetworking.Context context)
        {
            MinecraftClient client = context.client();
            if (client == null)
                return;

            client.setScreen(new EnrichedOptionsScreen(null).getHandle());
        }
    }
}
