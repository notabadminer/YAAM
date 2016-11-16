package yaam;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import yaam.proxy.CommonProxy;

@Mod(modid = YAAM.MODID, name = YAAM.NAME, version = YAAM.VERSION, acceptedMinecraftVersions = "@MC_VERSION@", guiFactory = "yaam.YAAMGuiFactory")

public class YAAM {
	public static final String MODID = "yaam";
	public static final String NAME = "YAAM";
	public static final String VERSION = "@VERSION@";
	public static boolean obsidianEnabled, quartzEnabled, emeraldEnabled, lapisEnabled, nativePaxelsEnabled;
	public static Configuration config;

	@SidedProxy(clientSide = "yaam.proxy.ClientProxy", serverSide = "yaam.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());

		// custom items
		Property obsidianRecipes = config.get("recipes", "Obsidain Item Recipes", true);
		obsidianRecipes.comment = "Set to false to disable crafting recipes for obsidain tools, weapons, and armor.";
		obsidianEnabled = obsidianRecipes.getBoolean(true);
		Property emeraldRecipes = config.get("recipes", "Emerald Item Recipes", true);
		emeraldRecipes.comment = "Set to false to disable crafting recipes for emerald tools, weapons, and armor.";
		emeraldEnabled = emeraldRecipes.getBoolean(true);
		Property quartzRecipes = config.get("recipes", "Quartz Item Recipes", true);
		quartzRecipes.comment = "Set to false to disable crafting recipes for quartz tools, weapons, and armor.";
		quartzEnabled = quartzRecipes.getBoolean(true);
		Property lapisRecipes = config.get("recipes", "Lapis Item Recipes", true);
		lapisRecipes.comment = "Set to false to disable crafting recipes for lapis tools, weapons, and armor.";
		lapisEnabled = lapisRecipes.getBoolean(true);

		// native paxels
		Property nativePaxels = config.get("recipes", "Native Paxel Recipes", true);
		nativePaxels
				.comment = "Set to false to disable crafting recipes for wood, stone, iron, gold, and diamond paxels";
		nativePaxelsEnabled = nativePaxels.getBoolean(true);

		config.save();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerItems();
		proxy.registerBlocks();
		proxy.registerRecipes();
		proxy.registerRenderers();
	}
}