package bdmajora.decoration.block.gym;

import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import useless.dragonfly.model.block.processed.BlockCube;

import java.util.ArrayList;

public class BlockGymLight extends BlockTransparent {
	public useless.dragonfly.model.block.processed.BlockModel model;
	public BlockGymLight(String key, int id, Material material, useless.dragonfly.model.block.processed.BlockModel model) {
		super(key, id, material, true);
		this.model = model;
	}

	@Override
	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		int meta = world.getBlockMetadata(x, y, z);
		meta = meta == 0 ? 1 : 0; // Toggle the meta value between 0 (off) and 1 (on)
		world.setBlockMetadataWithNotify(x, y, z, meta);
		return true;
	}


	// Setting this to false also disables the game trying to push you out of the block
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
}
