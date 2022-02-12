package com.enrichedmc.mixin;

import com.enrichedmc.config.ModConfig;
import com.enrichedmc.entity.HoneySlime;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.concurrent.ThreadLocalRandom;

import static com.enrichedmc.registry.ModInit.HONEY_SLIME;

@Mixin(BeehiveBlock.class)
public class BeehiveBlockMixin {
    @Inject(method = "takeHoney(Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "TAIL"))
    public void takeHoney(World world, BlockState state, BlockPos pos, CallbackInfo ci) {
        if (ModConfig.enableHoneySlime) {
            if (ThreadLocalRandom.current().nextInt(3) == 2) {
                //System.out.println("Yes");
                HoneySlime honeySlime = HONEY_SLIME.create(world);
                honeySlime.refreshPositionAndAngles((double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, 0.0F, 0.0F);
                honeySlime.setHealth(1f);
                world.spawnEntity(honeySlime);
                return;
            }
        }
        //System.out.println("No");
    }
}

