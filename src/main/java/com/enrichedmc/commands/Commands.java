package com.enrichedmc.commands;

import static net.minecraft.server.command.CommandManager.literal;

import com.enrichedmc.Enriched;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;

public class Commands {
  public static void register() {
    CommandRegistrationCallback.EVENT.register(
        (dispatcher, dedicated, CommandRegistrationCallback) -> {
          dispatcher.register(
              literal("enriched")
                  .then(
                      literal("version")
                          .executes(
                              context -> {
                                      context.getSource().sendMessage(Text.of(Enriched.MOD_NAME + " " + Enriched.MOD_VERSION));
                                return 1;
                              })));
        });
  }

  private int execute(CommandContext<Object> context) {
    return 0;
  }
}
