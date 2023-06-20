package com.enrichedmc.items;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class BottleFood extends Item {
    public BottleFood(Settings settings) {
        super(settings);
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    //@Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity player) {
            player.getHungerManager().eat(stack.getItem(), stack);
            player.incrementStat(Stats.USED.getOrCreateStat(stack.getItem()));
            if (player instanceof ServerPlayerEntity) {
                Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
            }
            if (!((PlayerEntity)user).getAbilities().creativeMode){
            stack.decrement(1);
            player.giveItemStack(new ItemStack(Items.GLASS_BOTTLE));
            }
        }
        return stack;
    }
}
