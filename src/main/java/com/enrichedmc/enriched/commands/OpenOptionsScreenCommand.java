package com.enrichedmc.enriched.commands;

import com.enrichedmc.enriched.networking.payloads.OpenOptionsScreenPayload;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class OpenOptionsScreenCommand implements CommandRegistrationCallback
{
    private static int execute(CommandContext<ServerCommandSource> context)
    {
        ServerPlayerEntity serverPlayerEntity = context.getSource().getPlayer();
        if (serverPlayerEntity == null)
        {
            context.getSource().sendMessage(Text.literal("You must be a player to use this command!").formatted(Formatting.RED));

            return 1;
        }

        ServerPlayNetworking.send(serverPlayerEntity, new OpenOptionsScreenPayload());

        return 0;
    }

    @Override
    public void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess,
                         CommandManager.RegistrationEnvironment environment)
    {
        dispatcher.register(CommandManager.literal("enriched").then(CommandManager.literal("options")
                        .requires(source -> source.hasPermissionLevel(2))
                        .executes(OpenOptionsScreenCommand::execute)));
    }
}
