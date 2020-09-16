package com.vanillaenhanced.mixin;


import com.vanillaenhanced.entity.HoneySlime;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.concurrent.ThreadLocalRandom;

import static com.vanillaenhanced.registry.ModInit.HONEY_SLIME;


@Mixin(BeehiveBlock.class)
/*
public class BeehiveBlockMixin {
    @Inject(method = "takeHoney(Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE_ASSIGN"))
    public void takeHoney(World world, BlockState state, BlockPos pos, CallbackInfo ci) {
        if ((ThreadLocalRandom.current().nextInt(6) + 1) % 2 == 0) {
            System.out.println("Yes");
            HoneySlime honeySlime = HONEY_SLIME.create(world);
            honeySlime.refreshPositionAndAngles((double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, 0.0F, 0.0F);
            honeySlime.setHealth(1f);
            world.spawnEntity(honeySlime);
            return;
        }
        System.out.println("No");
    }

}

 */
public class BeehiveBlockMixin {
    @Inject(method = "onUse(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE_ASSIGN"))
    public void onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> cir) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.getItem() != Items.GLASS_BOTTLE) return;
        if ((ThreadLocalRandom.current().nextInt(6) + 1) % 2 == 0) {
            System.out.println("Yes");
            HoneySlime honeySlime = HONEY_SLIME.create(world);
            honeySlime.refreshPositionAndAngles((double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, 0.0F, 0.0F);
            honeySlime.setHealth(1f);
            world.spawnEntity(honeySlime);
            return;
        }
        System.out.println("No");
    }

}
