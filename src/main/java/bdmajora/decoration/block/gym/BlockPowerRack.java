package bdmajora.decoration.block.gym;

import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import useless.dragonfly.model.block.processed.BlockCube;
import useless.dragonfly.model.block.processed.BlockModel;

import java.util.ArrayList;

public class BlockPowerRack extends BlockTransparent {
	public useless.dragonfly.model.block.processed.BlockModel model;

	public BlockPowerRack(String key, int id, Material material, BlockModel model) {
		super(key, id, material, true);
		this.model = model;
	}

	@Override
	public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
		int meta = world.getBlockMetadata(x, y, z) & 0x11111100;
		Direction hRotation = entity.getHorizontalPlacementDirection(side);
		if (hRotation == Direction.NORTH) {
			meta |= 2;
		}
		if (hRotation == Direction.EAST) {
			meta |= 1;
		}
		if (hRotation == Direction.SOUTH) {
			meta |= 3;
		}
		if (hRotation == Direction.WEST) {
			meta |= 0;
		}
		world.setBlockMetadataWithNotify(x, y, z, meta);
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean canPlaceOnSurface() {
		return true;
	}

	@Override
	public int getRenderBlockPass() {
		return 0;
	}

	@Override
	public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList<AABB> aabbList) {
		for (BlockCube cube : model.blockCubes) {
			setBlockBounds(cube.xMin(), cube.yMin(), cube.zMin(), cube.xMax(), cube.yMax(), cube.zMax());
			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
		}
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
	}
}
