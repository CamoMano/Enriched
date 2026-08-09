package com.enrichedmc.enriched.networking.payloads;

import com.enrichedmc.enriched.config.gui.EnrichedOptionsScreen;
import com.enrichedmc.enriched.networking.EnrichedNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;

public class OpenOptionsScreenPayload implements CustomPacketPayload {
  public static final CustomPacketPayload.Type<OpenOptionsScreenPayload> ID =
      new CustomPacketPayload.Type<>(EnrichedNetworking.OPEN_OPTIONS_SCREEN_PACKET);
  public static final StreamCodec<RegistryFriendlyByteBuf, OpenOptionsScreenPayload> CODEC =
      new StreamCodec<>() {
        @Override
        public OpenOptionsScreenPayload decode(RegistryFriendlyByteBuf buf) {
          return new OpenOptionsScreenPayload();
        }

        @Override
        public void encode(RegistryFriendlyByteBuf buf, OpenOptionsScreenPayload value) {}
      };

  @Override
  public Type<? extends CustomPacketPayload> type() {
    return OpenOptionsScreenPayload.ID;
  }

  public static class PayloadHandler
      implements ClientPlayNetworking.PlayPayloadHandler<OpenOptionsScreenPayload> {
    @Override
    public void receive(OpenOptionsScreenPayload payload, ClientPlayNetworking.Context context) {
      Minecraft client = context.client();
      if (client == null) return;

      client.setScreen(new EnrichedOptionsScreen(null).getHandle());
    }
  }
}
