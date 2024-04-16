package bdmajora.decoration.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import bdmajora.decoration.UtilIdRegistrar;
import bdmajora.decoration.block.dragonfly.BlockBlender;
import bdmajora.decoration.block.dragonfly.BlockModel;
import bdmajora.decoration.block.metastates.BlenderMetaState;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

import static bdmajora.decoration.decoration.MOD_ID;

public class ModBlocks {

	public static final Block blender = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/blender_pre.json"),
			ModelHelper.getOrCreateBlockState(MOD_ID, "blender.json"), new BlenderMetaState(), true))
		.build(new BlockBlender("blender", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/blender_pre.json")));

	public static void register() {
	}
}
