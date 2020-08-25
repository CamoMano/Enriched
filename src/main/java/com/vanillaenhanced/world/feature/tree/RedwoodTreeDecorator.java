package com.vanillaenhanced.world.feature.tree;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.DecoratorContext;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class RedwoodTreeDecorator extends Decorator<ChanceDecoratorConfig> {

	public RedwoodTreeDecorator(Codec<ChanceDecoratorConfig> codec) {
		super(codec);
	}

	@Override
	public Stream<BlockPos> getPositions(DecoratorContext context, Random random, ChanceDecoratorConfig config, BlockPos pos) {
		if (random.nextInt(config.chance) == 0) {
			int treeCount = 4 + random.nextInt(5);
			return IntStream.range(0, treeCount).mapToObj((i) -> {
				int x = random.nextInt() + pos.getX();
				int z = random.nextInt() + pos.getZ();
				int y = context.getTopY(Heightmap.Type.MOTION_BLOCKING, x, z);
				return new BlockPos(x, y, z);
			});
		}
		return Stream.empty();
	}
}
