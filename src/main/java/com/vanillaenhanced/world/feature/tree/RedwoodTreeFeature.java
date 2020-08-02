package com.vanillaenhanced.world.feature.tree;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ModifiableTestableWorld;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;

import java.util.Random;
import java.util.Set;

public class RedwoodTreeFeature extends TreeFeature {

	public RedwoodTreeFeature(Codec<TreeFeatureConfig> codec) {
		super(codec);
	}

	public static class FoliagePlacer extends BlobFoliagePlacer {


		public FoliagePlacer(int radius, int randomRadius, int offset, int randomOffset, int height) {
			super(radius, randomRadius, offset, randomOffset, height);
		}

		@Override
		protected void generate(ModifiableTestableWorld world, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, Set<BlockPos> leaves, int i, BlockBox blockBox) {
			super.generate(world, random, config, trunkHeight, treeNode, foliageHeight, radius, leaves, i, blockBox);

			spawnSpike(world, treeNode.getCenter());
		}

		private void spawnSpike(ModifiableTestableWorld world, BlockPos pos) {
			final int startScan = pos.getY();
			BlockPos topPos = null;

			//Limit the scan to 15 blocks
			while (topPos == null && pos.getY() - startScan < 15) {
				pos = pos.up();
				if (world.testBlockState(pos, BlockState::isAir)) {
					topPos = pos;
				}
			}

			if (topPos == null) return;

			/*for (int i = 0; i < 4; i++) {
				world.setBlockState(pos.up(i), ModInit.REDWOOD_LEAVES.getDefaultState(), 19);
			}*/
		}
	}


}
