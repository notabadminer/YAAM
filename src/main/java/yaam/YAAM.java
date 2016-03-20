package yaam;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import yaam.proxy.CommonProxy;

@Mod(modid = YAAM.MODID, name = YAAM.NAME, version = YAAM.VERSION, acceptedMinecraftVersions = "@MC_VERSION@")
public class YAAM {
	public static final String MODID = "yaam";
	public static final String NAME = "YAAM";
	public static final String VERSION = "@VERSION@";
	public static boolean obsidianEnabled, quartzEnabled, emeraldEnabled, lapisEnabled, nativePaxelsEnabled;

	@SidedProxy(clientSide = "yaam.proxy.ClientProxy", serverSide = "yaam.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		// custom items
		Property obsidianRecipes = config.get("Recipes", "Obsidain Item Recipes", true);
		obsidianRecipes.comment = "Set to false to disable crafting recipes for obsidain tools, weapons, and armor.";
		obsidianEnabled = obsidianRecipes.getBoolean(true);
		Property emeraldRecipes = config.get("Recipes", "Emerald Item Recipes", true);
		emeraldRecipes.comment = "Set to false to disable crafting recipes for emerald tools, weapons, and armor.";
		emeraldEnabled = emeraldRecipes.getBoolean(true);
		Property quartzRecipes = config.get("Recipes", "Quartz Item Recipes", true);
		quartzRecipes.comment = "Set to false to disable crafting recipes for quartz tools, weapons, and armor.";
		quartzEnabled = quartzRecipes.getBoolean(true);
		Property lapisRecipes = config.get("Recipes", "Lapis Item Recipes", true);
		quartzRecipes.comment = "Set to false to disable crafting recipes for lapis tools, weapons, and armor.";
		lapisEnabled = lapisRecipes.getBoolean(true);

		// native paxels
		Property nativePaxels = config.get("Recipes", "Native Paxel Recipes", true);
		nativePaxels.comment = "Set to false to disable crafting recipes for wood, stone, iron, gold, and diamond paxels";
		nativePaxelsEnabled = nativePaxels.getBoolean(true);

		config.save();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerItems();
		proxy.registerBlocks();
		proxy.registerRecipes();
		proxy.registerRenderers();

		// update check using versionchecker
		FMLInterModComms.sendRuntimeMessage(MODID, "VersionChecker", "addVersionCheck",
				"https://raw.githubusercontent.com/notabadminer/YAAM/master/version.json");
	}
}