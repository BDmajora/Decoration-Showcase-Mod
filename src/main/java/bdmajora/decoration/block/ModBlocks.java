package bdmajora.decoration.block;

import bdmajora.decoration.block.dragonfly.BlockModel;
import bdmajora.decoration.block.gym.*;
import bdmajora.decoration.block.mcf.*;
import bdmajora.decoration.block.mcf.Couch.BlockBlackCouch;
import bdmajora.decoration.block.metastates.gym.*;
import bdmajora.decoration.block.metastates.mcf.*;
import bdmajora.decoration.block.metastates.mcf.Couch.BlackCouchMetaState;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;
import bdmajora.decoration.UtilIdRegistrar;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

import static bdmajora.decoration.decoration.MOD_ID;
import static useless.dragonfly.helper.ModelHelper.getOrCreateBlockState;

public class ModBlocks {

	//mcf
	public static final Block blender = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/blender_pre.json"),
			getOrCreateBlockState(MOD_ID, "mcf/blender.json"), new BlenderMetaState(), true))
		.build(new BlockBlender("blender", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/blender_pre.json")));

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

	public static final Block tv = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/tv.json"),
			getOrCreateBlockState(MOD_ID, "mcf/tv.json"), new TVMetaState(), true))
		.build(new BlockTV("tv", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/tv.json")));

		public static final Block tvStand = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/tv_stand.json"),
			getOrCreateBlockState(MOD_ID, "mcf/tv_stand.json"), new TVStandMetaState(), true))
		.build(new BlockTVStand("tvStand", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/tv_stand.json")));

	public static final Block tvStandLeft = new BlockBuilder(MOD_ID)
		.addTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/tv_stand_left.json"),
			getOrCreateBlockState(MOD_ID, "mcf/tv_stand.json"), new TVStandMetaState(), true))
		.build(new BlockTVStand("tvStandLeft", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/tv_stand_left.json")));

	public static final Block tvStandRight = new BlockBuilder(MOD_ID)
		.addTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/tv_stand_right.json"),
			getOrCreateBlockState(MOD_ID, "mcf/tv_stand.json"), new TVStandMetaState(), true))
		.build(new BlockTVStand("tvStandRight", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/tv_stand_right.json")));

//	public static final Block blackCouch = new BlockBuilder(MOD_ID)
//		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch.json"),
//			getOrCreateBlockState(MOD_ID, "mcf/couch/black_couch.json"), new BlackCouchMetaState(), true))
//		.build(new BlockBlackCouch("blackCouch", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch.json")));
//
//	public static final Block blackCouchLeft = new BlockBuilder(MOD_ID)
//		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch_left.json"),
//			getOrCreateBlockState(MOD_ID, "mcf/couch/black_couch.json"), new BlackCouchMetaState(), true))
//		.build(new BlockModel("blackCouchLeft", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch_left.json")));
//
//	public static final Block blackCouchRight = new BlockBuilder(MOD_ID)
//		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch_right.json"),
//			getOrCreateBlockState(MOD_ID, "mcf/couch/black_couch.json"), new BlackCouchMetaState(), true))
//		.build(new BlockBlackCouch("blackCouchRight", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch_right.json")));
//
//	public static final Block blackCouchCornerLeft = new BlockBuilder(MOD_ID)
//		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch_corner_left.json"),
//			getOrCreateBlockState(MOD_ID, "mcf/couch/black_couch.json"), new BlackCouchMetaState(), true))
//		.build(new BlockBlackCouch("blackCouchCornerLeft", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch_corner_left.json")));
//
//	public static final Block blackCouchCornerRight = new BlockBuilder(MOD_ID)
//		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch_corner_right.json"),
//			getOrCreateBlockState(MOD_ID, "mcf/couch/black_couch.json"), new BlackCouchMetaState(), true))
//		.build(new BlockBlackCouch("blackCouchCornerRight", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/mcf/couch/black_couch_corner_right.json")));

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
		.build(new BlockCrossTrainer("crossTrainer", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/crosstrainer.json")));

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

	public static final Block lightSupportBracket = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/lightsupportbracket.json"),
			getOrCreateBlockState(MOD_ID, "gym/lightsupportbracket.json"), null, true))
		.build(new BlockModel("lightSupportBracket", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/lightsupportbracket.json")));

	public static final Block membershipForm = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/membershipform.json"),
			getOrCreateBlockState(MOD_ID, "gym/membershipform.json"), new MembershipFormMetaState(), true))
		.build(new BlockMembershipForm ("membershipForm", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/membershipform.json")));

	public static final Block powerRack = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/powerrack.json"),
			getOrCreateBlockState(MOD_ID, "gym/powerrack.json"), new PowerRackMetaState(), true))
		.build(new BlockPowerRack("powerRack", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/powerrack.json")));

	public static final Block receptionDeskCornerGC = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/receptiondeskcornergc.json"),
			getOrCreateBlockState(MOD_ID, "gym/receptiondeskcornergc.json"), new ReceptionDeskCornerGCMetaState(), true))
		.build(new BlockReceptionDeskCornerGC("receptionDeskCornerGC", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/receptiondeskcornergc.json")));

	public static final Block receptionDeskGC = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/receptiondeskgc.json"),
			getOrCreateBlockState(MOD_ID, "gym/receptiondeskgc.json"), new ReceptionDeskGCMetaState(), true))
		.build(new BlockReceptionDeskGC("receptionDeskGC", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/receptiondeskgc.json")));

	public static final Block recumbentBike = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/recumbentbike.json"),
			getOrCreateBlockState(MOD_ID, "gym/recumbentbike.json"), new RecumbentBikeMetaState(), true))
		.build(new BlockRecumbentBike("recumbentBike", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/recumbentbike.json")));

	public static final Block rowingMachine = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/rowingmachine.json"),
			getOrCreateBlockState(MOD_ID, "gym/rowingmachine.json"), new RowingMachineMetaState(), true))
		.build(new BlockRowingMachine("rowingMachine", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/rowingmachine.json")));

	public static final Block suspendedCeilingGC = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/suspendedceilinggcoff.json"),
			getOrCreateBlockState(MOD_ID, "gym/suspendedceilinggc.json"), new SuspendedCeilingGCMetaState(), true))
		.build(new BlockSuspendedCeilingGC("suspendedCeilingGC", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/suspendedceilinggcoff.json")));

	public static final Block suspendedCeilingGCOn = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.addTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/suspendedceilinggcon.json"),
			getOrCreateBlockState(MOD_ID, "gym/suspendedceilinggc.json"), new SuspendedCeilingGCMetaState(), true))
		.build(new BlockSuspendedCeilingGC("suspendedCeilingGCOn", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/suspendedceilinggcon.json")));

	public static final Block uprightBike = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/uprightbike.json"),
			getOrCreateBlockState(MOD_ID, "gym/uprightbike.json"), new UprightBikeMetaState(), true))
		.build(new BlockUprightBike("uprightBike", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/uprightbike.json")));

	public static final Block vendingMachine = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/vendingmachine.json"),
			getOrCreateBlockState(MOD_ID, "gym/vendingmachine.json"), new VendingMachineMetaState(), true))
		.build(new BlockVendingMachine("vendingMachine", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/vendingmachine.json")));

	public static final Block vinylGC = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/vinylgc.json")))
		.build(new BlockModel("vinylGC", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/vinylgc.json")));

	public static final Block weightBench = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/weightbench.json"),
			getOrCreateBlockState(MOD_ID, "gym/weightbench.json"), new WeightBenchMetaState(), true))
		.build(new BlockWeightBench("weightBench", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/weightbench.json")));

	public static final Block weighTrack = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/weightrack.json"),
			getOrCreateBlockState(MOD_ID, "gym/weightrack.json"), new WeighTrackMetaState(), true))
		.build(new BlockWeighTrack("weighTrack", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/weightrack.json")));

	public static final Block weightTree = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/weighttree.json"),
			getOrCreateBlockState(MOD_ID, "gym/weighttree.json"), new WeightTreeMetaState(), true))
		.build(new BlockWeightTree("weightTree", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gym/weighttree.json")));

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
