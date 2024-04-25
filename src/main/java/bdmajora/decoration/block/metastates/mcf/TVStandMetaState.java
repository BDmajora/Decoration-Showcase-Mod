package bdmajora.decoration.block.metastates.mcf;

import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.WorldSource;
import bdmajora.decoration.block.mcf.BlockTVStand; // Assuming TVStand is the class of your block
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class TVStandMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		int hRotation = meta & 0b11;
		HashMap<String, String> result = new HashMap<>();
		result.put("facing", new String[]{"north", "south", "east", "west"}[hRotation]);
		if (block instanceof BlockTVStand) { // Check if the block is an instance of TVStand
			Direction facing = Direction.values()[hRotation];
			switch (facing) {
				case NORTH:
					result.put("right", ((BlockTVStand)block).canConnectTo(worldSource, x - 1, y, z) ? "true" : "false");
					result.put("left", ((BlockTVStand)block).canConnectTo(worldSource, x + 1, y, z) ? "true" : "false");
					break;
				case SOUTH:
					result.put("right", ((BlockTVStand)block).canConnectTo(worldSource, x + 1, y, z) ? "true" : "false");
					result.put("left", ((BlockTVStand)block).canConnectTo(worldSource, x - 1, y, z) ? "true" : "false");
					break;
				case EAST:
					result.put("right", ((BlockTVStand)block).canConnectTo(worldSource, x, y, z + 1) ? "true" : "false");
					result.put("left", ((BlockTVStand)block).canConnectTo(worldSource, x, y, z - 1) ? "true" : "false");
					break;
				case WEST:
					result.put("right", ((BlockTVStand)block).canConnectTo(worldSource, x, y, z - 1) ? "true" : "false");
					result.put("left", ((BlockTVStand)block).canConnectTo(worldSource, x, y, z + 1) ? "true" : "false");
					break;
			}
		}

		return result;
	}
}
