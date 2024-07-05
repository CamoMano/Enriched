package com.enrichedmc.enriched.networking.payloads;

import com.enrichedmc.enriched.networking.EnrichedNetworking;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.server.MinecraftServer;

public class ReloadDataPacksPacket implements CustomPayload {
  public static final CustomPayload.Id<ReloadDataPacksPacket> ID =
      new CustomPayload.Id<>(EnrichedNetworking.RELOAD_DATA_PACKS_PACKET);
  public static final PacketCodec<RegistryByteBuf, ReloadDataPacksPacket> CODEC =
      new PacketCodec<>() {
        @Override
        public ReloadDataPacksPacket decode(RegistryByteBuf buf) {
          return new ReloadDataPacksPacket();
        }

        @Override
        public void encode(RegistryByteBuf buf, ReloadDataPacksPacket value) {}
      };

  @Override
  public Id<? extends CustomPayload> getId() {
    return ReloadDataPacksPacket.ID;
  }

  public static class PayloadHandler
      implements ServerPlayNetworking.PlayPayloadHandler<ReloadDataPacksPacket> {
    @Override
    public void receive(ReloadDataPacksPacket payload, ServerPlayNetworking.Context context) {
      MinecraftServer server = context.server();

      try {
        server.getCommandManager().getDispatcher().execute("reload", server.getCommandSource());
      } catch (CommandSyntaxException exception) {
        exception.printStackTrace();
      }
    }
  }
}
