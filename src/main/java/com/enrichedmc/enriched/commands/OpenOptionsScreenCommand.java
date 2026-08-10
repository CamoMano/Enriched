package com.enrichedmc.enriched.commands;

import com.enrichedmc.enriched.networking.payloads.OpenOptionsScreenPayload;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.ChatFormatting;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class OpenOptionsScreenCommand implements CommandRegistrationCallback {
  private static int execute(CommandContext<CommandSourceStack> context) {
    ServerPlayer serverPlayerEntity = context.getSource().getPlayer();
    if (serverPlayerEntity == null) {
      context
          .getSource()
          .sendSystemMessage(
              Component.literal("You must be a player to use this command!").withStyle(ChatFormatting.RED));

      return 1;
    }

    ServerPlayNetworking.send(serverPlayerEntity, new OpenOptionsScreenPayload());

    return 0;
  }

  @Override
  public void register(
      CommandDispatcher<CommandSourceStack> dispatcher,
      CommandBuildContext registryAccess,
      Commands.CommandSelection environment) {
    dispatcher.register(
        Commands.literal("enriched")
            .then(
                Commands.literal("options")
                    .requires(Commands.hasPermission(Commands.LEVEL_GAMEMASTERS))
                    .executes(OpenOptionsScreenCommand::execute)));
  }
}
