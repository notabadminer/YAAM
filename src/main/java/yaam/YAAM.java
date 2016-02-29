package yaam;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import yaam.net.RecipeMessage;
import yaam.proxy.CommonProxy;
import yaam.util.PlayerLoginHandler;

@Mod(modid = YAAM.MODID, name = YAAM.NAME, version = YAAM.VERSION, acceptedMinecraftVersions = "@MC_VERSION@")
public class YAAM {
	public static final String MODID = "yaam";
	public static final String NAME = "YAAM";
	public static final String VERSION = "@VERSION@";
	public static boolean obsidianEnabled, quartzEnabled, emeraldEnabled, lapisEnabled, nativePaxelsEnabled,
			smeltingEnabled;

	@SidedProxy(clientSide = "yaam.proxy.ClientProxy", serverSide = "yaam.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static SimpleNetworkWrapper snw;

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

		// smelting recipes
		Property smeltingRecipes = config.get("Recipes", "Smelting Recipes", true);
		smeltingRecipes.comment = "Set to false to disable smelting recipes. Enabled allows tools to be smelted down returning core materials.";
		smeltingEnabled = smeltingRecipes.getBoolean(true);

		config.save();

		// network packet handling
		snw = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
		snw.registerMessage(RecipeMessage.class, RecipeMessage.class, 0, Side.CLIENT);

		MinecraftForge.EVENT_BUS.register(new PlayerLoginHandler());
	}

	@Mod.EventHandler
	public void preInit(FMLInitializationEvent event) {
		proxy.registerItems();
		proxy.registerRecipes();
		proxy.registerRenderers();

		// update check using versionchecker
		FMLInterModComms.sendRuntimeMessage(MODID, "VersionChecker", "addVersionCheck",
				"https://raw.githubusercontent.com/notabadminer/YAAM/master/version.json");
	}
}