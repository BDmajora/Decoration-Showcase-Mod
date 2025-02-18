package bdmajora.decoration.block.mcf;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import useless.dragonfly.model.block.processed.BlockCube;
import useless.dragonfly.model.block.processed.BlockModel;

import java.util.ArrayList;

import static bdmajora.decoration.block.ModBlocks.*;

public class BlockTVStand extends BlockTransparent {
	public BlockModel model;

	public BlockTVStand(String key, int id, Material material, BlockModel model) {
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

		switch (hRotation) {
			case NORTH:
				if (world.getBlockId(x - 1, y, z) == this.id) {
					if (world.getBlockId(x - 2, y, z) == this.id) {
						world.setBlockMetadataWithNotify(x - 1, y, z, meta);
					}
				} else if (world.getBlockId(x + 1, y, z) == this.id) {
					if (world.getBlockId(x + 2, y, z) == this.id) {
						world.setBlockMetadataWithNotify(x + 1, y, z, meta);
					}
				}
				break;
			case SOUTH:
				if (world.getBlockId(x + 1, y, z) == this.id) {
					if (world.getBlockId(x + 2, y, z) == this.id) {
						world.setBlockMetadataWithNotify(x + 1, y, z, meta);
					}
				} else if (world.getBlockId(x - 1, y, z) == this.id) {
					if (world.getBlockId(x - 2, y, z) == this.id) {
						world.setBlockMetadataWithNotify(x - 1, y, z, meta);
					}
				}
				break;
			case EAST:
				if (world.getBlockId(x, y, z - 1) == this.id) {
					if (world.getBlockId(x, y, z - 2) == this.id) {
						world.setBlockMetadataWithNotify(x, y, z - 1, meta);
					}
				} else if (world.getBlockId(x, y, z + 1) == this.id) {
					if (world.getBlockId(x, y, z + 2) == this.id) {
						world.setBlockMetadataWithNotify(x, y, z + 1, meta);
					}
				}
				break;
			case WEST:
				if (world.getBlockId(x, y, z + 1) == this.id) {
					if (world.getBlockId(x, y, z + 2) == this.id) {
						world.setBlockMetadataWithNotify(x, y, z + 1, meta);
					}
				} else if (world.getBlockId(x, y, z - 1) == this.id) {
					if (world.getBlockId(x, y, z - 2) == this.id) {
						world.setBlockMetadataWithNotify(x, y, z - 1, meta);
					}
				}
				break;
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
		for (BlockCube cube: model.blockCubes) {
			setBlockBounds(cube.xMin(), cube.yMin(), cube.zMin(), cube.xMax(), cube.yMax(), cube.zMax());
			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
		}
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
	}

	public boolean canConnectTo(WorldSource worldSource, int x, int y, int z) {
		Block block = worldSource.getBlock(x, y, z);
		return block instanceof BlockTVStand;
	}

}
