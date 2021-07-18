package com.vanillaenhanced.commands;

import com.mojang.brigadier.context.CommandContext;
import com.vanillaenhanced.VanillaEnhanced;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.literal;

public class Commands {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            dispatcher.register(literal("ve")
                .then(literal("version")
                    .executes(context -> {
                        context.getSource().sendFeedback(Text.of(VanillaEnhanced.MOD_NAME + " " + VanillaEnhanced.MOD_VERSION), false);
                        return 1;
                    })));
        });
    }

    private int execute(CommandContext<Object> context) {
        return 0;
    }
}
