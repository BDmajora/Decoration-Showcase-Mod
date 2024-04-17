package bdmajora.decoration.block.metastates.gym;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class GymLightMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		boolean on = (meta & 0b1) == 0b1; // Check the least significant bit to determine if the light is on
		HashMap<String, String> result = new HashMap<>();
		result.put("on", on ? "true" : "false"); // Set the 'on' property of the block state
		return result;
	}
}

