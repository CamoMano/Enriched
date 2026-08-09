package com.enrichedmc.enriched.networking.payloads;

import com.enrichedmc.enriched.networking.EnrichedNetworking;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.MinecraftServer;

public class ReloadDataPacksPacket implements CustomPacketPayload {
  public static final CustomPacketPayload.Type<ReloadDataPacksPacket> ID =
      new CustomPacketPayload.Type<>(EnrichedNetworking.RELOAD_DATA_PACKS_PACKET);
  public static final StreamCodec<RegistryFriendlyByteBuf, ReloadDataPacksPacket> CODEC =
      new StreamCodec<>() {
        @Override
        public ReloadDataPacksPacket decode(RegistryFriendlyByteBuf buf) {
          return new ReloadDataPacksPacket();
        }

        @Override
        public void encode(RegistryFriendlyByteBuf buf, ReloadDataPacksPacket value) {}
      };

  @Override
  public Type<? extends CustomPacketPayload> type() {
    return ReloadDataPacksPacket.ID;
  }

  public static class PayloadHandler
      implements ServerPlayNetworking.PlayPayloadHandler<ReloadDataPacksPacket> {
    @Override
    public void receive(ReloadDataPacksPacket payload, ServerPlayNetworking.Context context) {
      MinecraftServer server = context.server();

      try {
        server.getCommands().getDispatcher().execute("reload", server.createCommandSourceStack());
      } catch (CommandSyntaxException exception) {
        exception.printStackTrace();
      }
    }
  }
}
