package com.enrichedmc.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class BowlFood extends Item {
    public BowlFood(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof PlayerEntity) {
            return !((PlayerEntity) user).isCreative() ? new ItemStack(Items.BOWL, 1) : super.finishUsing(stack, world, user);
        }
        return new ItemStack(Items.BOWL, 1);
    }
}
