package yaam;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import yaam.proxy.CommonProxy;

@Mod(modid = YAAM.MODID, name = YAAM.NAME, version = YAAM.VERSION, acceptedMinecraftVersions = "@MC_VERSION@")
public class YAAM {
	public static final String MODID = "yaam";
	public static final String NAME = "YAAM";
	public static final String VERSION = "@VERSION@";

	@SidedProxy(clientSide = "yaam.proxy.ClientProxy", serverSide = "yaam.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLInitializationEvent e) {
		proxy.registerItems();
		proxy.registerRecipes();
		proxy.registerRenderers();

		// update check using versionchecker
		FMLInterModComms.sendRuntimeMessage(MODID, "VersionChecker", "addVersionCheck",
				"https://raw.githubusercontent.com/notabadminer/YAAM/master/version.json");
	}
}