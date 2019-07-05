package notabadminer.yaam;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import notabadminer.yaam.common.ConfigHandler;
import notabadminer.yaam.items.YAAMItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(YAAM.MODID)
public class YAAM {
	public final static String MODID = "yaam";

	public YAAM() {

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);

		// Configuration setup
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigHandler.serverSpec);
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ConfigHandler.clientSpec);
	}

	// Event bus for receiving Registry Events)
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)

	public static class RegistryEvents {
		@SubscribeEvent
		public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
			// register our items here
			YAAMItems.registerItems();
		}
	}
}
