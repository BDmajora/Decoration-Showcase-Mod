package bdmajora.decoration.block;

import bdmajora.decoration.block.dragonfly.BlockModel;
import bdmajora.decoration.block.gym.*;
import bdmajora.decoration.block.mcf.BlockCeilingLight;
import bdmajora.decoration.block.metastates.gym.*;
import bdmajora.decoration.block.metastates.mcf.CeilingLightMetaState;
import net.minecraft.client.render.block.color.BlockColorWater;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;
import bdmajora.decoration.UtilIdRegistrar;
import bdmajora.decoration.block.mcf.BlockBlender;
import bdmajora.decoration.block.metastates.mcf.BlenderMetaState;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

import static bdmajora.decoration.decoration.MOD_ID;
import static useless.dragonfly.helper.ModelHelper.getOrCreateBlockState;

public class ModBlocks {

	//mcf
	public static final Block blender = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/blender_pre.json"),
			getOrCreateBlockState(MOD_ID, "mcf/blender.json"), new BlenderMetaState(), true))
		.build(new BlockModel("blender", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/blender_pre.json")));

	public static final Block birdBath = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/bird_bath.json"),
			getOrCreateBlockState(MOD_ID, "mcf/bird_bath.json"), null, true))
		.build(new BlockModel("birdBath", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/bird_bath.json")));

	public static final Block ceilingLight = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/ceiling_light_off_pre.json"),
			getOrCreateBlockState(MOD_ID, "mcf/ceiling_light.json"), new CeilingLightMetaState(), true))
		.build(new BlockCeilingLight("ceilingLight", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/ceiling_light_off_pre.json")));

	public static final Block ceilingLightOn = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.addTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/ceiling_light_pre.json"),
			getOrCreateBlockState(MOD_ID, "mcf/ceiling_light.json"), new CeilingLightMetaState(), true))
		.build(new BlockCeilingLight("gymLightOn", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/ceiling_light_pre.json")));

	//gym
	public static final Block gymLocker = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymlocker.json"),
			getOrCreateBlockState(MOD_ID, "gym/gymlocker.json"), new GymLockerMetaState(), true))
		.build(new BlockGymLocker("gymLocker", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymlocker.json")));

	public static final Block carpet1 = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/carpet1.json"),
			getOrCreateBlockState(MOD_ID, "gym/carpet1.json"), null, true))
		.build(new BlockModel("carpet1", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/carpet1.json")));

	public static final Block carpet2 = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/carpet2.json"),
			getOrCreateBlockState(MOD_ID, "gym/carpet2.json"), null, true))
		.build(new BlockModel("carpet2", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/carpet2.json")));

	public static final Block treadmill = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/treadmill.json"),
			getOrCreateBlockState(MOD_ID, "gym/treadmill.json"), new TreadMillMetaState(), true))
		.build(new BlockTreadMill("treadmill", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/treadmill.json")));

	public static final Block yogamat = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/yogamat.json"),
			getOrCreateBlockState(MOD_ID, "gym/yogamat.json"), new YogamatMetaState(), true))
		.build(new BlockYogamat("yogamat", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/yogamat.json")));

	public static final Block aerobicStepper = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/aerobicstepper.json"),
			getOrCreateBlockState(MOD_ID, "gym/aerobicstepper.json"), new AerobicStepperMetaState(), true))
		.build(new BlockAerobicStepper("aerobicStepper", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/aerobicstepper.json")));

	public static final Block benchgc = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/benchgc.json"),
			getOrCreateBlockState(MOD_ID, "gym/benchgc.json"), new BenchgcMetaState(), true))
		.build(new BlockBenchgc("benchgc", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/benchgc.json")));

	public static final Block brickWallGC = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/brickwallgc.json")))
		.build(new BlockModel("brickwallgc", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/brickwallgc.json")));

	public static final Block crossTrainer = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/crosstrainer.json"),
			getOrCreateBlockState(MOD_ID, "gym/crosstrainer.json"), new CrossTrainerMetaState(), true))
		.build(new BlockBenchgc("crossTrainer", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/crosstrainer.json")));

	public static final Block gymBallPurple = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymballpurple.json")))
		.build(new BlockModel("gymBallPurple", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymballpurple.json")));

	public static final Block gymBallSilver = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymballsilver.json")))
		.build(new BlockModel("gymBallSilver", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymballsilver.json")));

	public static final Block gymBallLime = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymballlime.json")))
		.build(new BlockModel("gymBallLime", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymballlime.json")));

	public static final Block gymSink = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymsink.json"),
			getOrCreateBlockState(MOD_ID, "gym/gymsink.json"), new GymSinkMetaState(), true))
		.build(new BlockGymSink("gymSink", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/gymsink.json")));

	public static final Block gymLight = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/hanginglightoff.json"),
			getOrCreateBlockState(MOD_ID, "gym/hanginglight.json"), new GymLightMetaState(), true))
		.build(new BlockGymLight("gymLight", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/hanginglightoff.json")));

	public static final Block gymLightOn = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.addTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/hanginglighton.json"),
			getOrCreateBlockState(MOD_ID, "gym/hanginglight.json"), new GymLightMetaState(), true))
		.build(new BlockGymLight("gymLight", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/hanginglighton.json")));


	//arcade
	public static final Block creeperPlushy = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/arcade/creeperplushie.json")))
		.build(new BlockModel("creeperPlushy", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/arcade/creeperplushie.json")));

	public static final Block pigPlushy = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/arcade/pigplushie.json")))
		.build(new BlockModel("pigPlushy", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/arcade/pigplushie.json")));


	public static void register() {
	}
}
