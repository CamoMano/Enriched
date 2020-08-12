package com.vanillaenhanced.world.feature.tree;

public class RedwoodTreeDecorator{}
/*
public class RedwoodTreeDecorator extends Decorator<ChanceDecoratorConfig> {

	public RedwoodTreeDecorator(Codec<ChanceDecoratorConfig> codec) {
		super(codec);
	}

	@Override
	public Stream<BlockPos> getPositions(WorldAccess world, ChunkGenerator generator, @NotNull Random random, ChanceDecoratorConfig config, BlockPos pos) {
		// Generate tree clusters randomly
		if (random.nextInt(config.chance) == 0) {
			// Generate 4 - 8 trees
			int treeCount = 4 + random.nextInt(5);
			return IntStream.range(0, treeCount).mapToObj((i) -> {
				int x = random.nextInt() + pos.getX();
				int z = random.nextInt() + pos.getZ();
				int y = world.getTopY(Heightmap.Type.MOTION_BLOCKING, x, z);
				return new BlockPos(x, y, z);
			});
		}
		return Stream.empty();
	}
}*/