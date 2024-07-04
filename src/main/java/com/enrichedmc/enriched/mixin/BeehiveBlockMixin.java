package com.enrichedmc.enriched.mixin;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.entity.EnrichedEntityTypes;
import com.enrichedmc.enriched.entity.custom.HoneySlimeEntity;
import com.google.common.base.Preconditions;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BeehiveBlock.class)
public class BeehiveBlockMixin
{
    @Inject(method = "takeHoney(Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;)V", at = @At("TAIL"), cancellable = true)
    public void potentiallySpawnHoneySlime(World world, BlockState state, BlockPos pos, CallbackInfo ci)
    {
        if (!EnrichedMod.getInstance().getGameOptions().mobOptions.enableHoneySlimeSpawning)
            ci.cancel();

        if (!(Random.create().nextInt(3) == 2))
            ci.cancel();

        HoneySlimeEntity honeySlimeEntity = EnrichedEntityTypes.HONEY_SLIME.create(world);
        Preconditions.checkArgument(honeySlimeEntity != null, "Failed to create and spawn Honey Slime!");

        honeySlimeEntity.refreshPositionAndAngles((double) pos.getX() + 0.5d, pos.getY(), (double) pos.getZ() + 0.5d, 0.0f, 0.0f);
        honeySlimeEntity.setHealth(1.0f);

        world.spawnEntity(honeySlimeEntity);
    }
}
