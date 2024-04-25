package bdmajora.decoration.block.metastates.mcf.Couch;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import bdmajora.decoration.block.mcf.Couch.BlockBlackCouch; // Assuming TVStand is the class of your block
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class BlackCouchMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		int hRotation = meta & 0b11;
		HashMap<String, String> result = new HashMap<>();
		result.put("facing", new String[]{"east", "west", "south", "north"}[hRotation]);

		// Add the connecting attribute
		if (block instanceof BlockBlackCouch) { // Check if the block is an instance of TVStand
			result.put("left", ((BlockBlackCouch)block).canConnectTo(worldSource, x - 1, y, z) ? "true" : "false");
			result.put("right", ((BlockBlackCouch)block).canConnectTo(worldSource, x + 1, y, z) ? "true" : "false");
			result.put("corner_left", ((BlockBlackCouch)block).canConnectTo(worldSource, x - 1, y, z - 1) ? "true" : "false");
			result.put("corner_right", ((BlockBlackCouch)block).canConnectTo(worldSource, x + 1, y, z + 1) ? "true" : "false");
		}

		return result;
	}
}
