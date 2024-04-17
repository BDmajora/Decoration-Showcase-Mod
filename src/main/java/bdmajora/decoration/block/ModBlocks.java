package bdmajora.decoration.block;

import bdmajora.decoration.block.dragonfly.BlockModel;
import bdmajora.decoration.block.gym.BlockGymLocker;
import bdmajora.decoration.block.metastates.gym.GymLockerMetaState;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import turniplabs.halplibe.helper.BlockBuilder;
import bdmajora.decoration.UtilIdRegistrar;
import bdmajora.decoration.block.mcf.BlockBlender;
import bdmajora.decoration.block.metastates.mcf.BlenderMetaState;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

import static bdmajora.decoration.decoration.MOD_ID;

public class ModBlocks {

	//mcf
	public static final Block blender = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/blender_pre.json"),
			ModelHelper.getOrCreateBlockState(MOD_ID, "mcf/blender.json"), new BlenderMetaState(), true))
		.build(new BlockBlender("blender", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/blender_pre.json")));

	//gym
	public static final Block gymLocker = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymlocker.json"),
			ModelHelper.getOrCreateBlockState(MOD_ID, "gym/gymlocker.json"), new GymLockerMetaState(), true))
		.build(new BlockGymLocker("gymLocker", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymlocker.json")));

	public static final Block carpet1 = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/carpet1.json"),
			ModelHelper.getOrCreateBlockState(MOD_ID, "gym/carpet1.json"), null, true))
		.build(new BlockModel("carpet1", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/carpet1.json")));

	public static void register() {
	}
}
