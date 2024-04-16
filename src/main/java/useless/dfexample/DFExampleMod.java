package useless.dfexample;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import useless.dfexample.block.ModBlocks;
import useless.dfexample.item.ModItems;

import java.util.Properties;


public class DFExampleMod implements ClientStartEntrypoint, ModInitializer, GameStartEntrypoint, PreLaunchEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "dfexample";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	public static ConfigHandler config;  // Made public and static

	private void handleConfig() {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","9000");
		prop.setProperty("starting_item_id","30000");

		config = new ConfigHandler(MOD_ID,prop);  // Now refers to the class level variable
		UtilIdRegistrar.initIds(config.getInt("starting_block_id"), config.getInt("starting_item_id"));

		config.updateConfig();
	}

	@Override
	public void beforeClientStart() {
		handleConfig();
	}

	@Override
	public void afterClientStart() {

	}

	@Override
	public void onInitialize() {
		LOGGER.info("backport loading! watch out for bugs");


		LOGGER.info("BackPort loaded successfully!");
	}

	@Override
	public void beforeGameStart() {
		ModBlocks.register();
		ModItems.register();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onPreLaunch() {

	}

	@Override
	public void onRecipesReady() {

	}

	public void initNamespaces() {
	}


}
