package com.enrichedmc.commands;

import com.mojang.brigadier.context.CommandContext;
import com.enrichedmc.Enriched;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;

import static net.minecraft.server.command.CommandManager.literal;

public class Commands {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            dispatcher.register(literal("ve")
                .then(literal("version")
                    .executes(context -> {
                        System.out.println(Enriched.MOD_NAME + " " + Enriched.MOD_VERSION);
                        return 1;
                    })));
        });
    }

    private int execute(CommandContext<Object> context) {
        return 0;
    }
}
