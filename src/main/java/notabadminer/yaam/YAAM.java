package notabadminer.yaam;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import notabadminer.yaam.items.YAAMPaxelItem;
import notabadminer.yaam.items.YAAMSwordItem;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("yaam")
public class YAAM {
	public static Item quartz_sword, obsidian_sword, wood_paxel;

    public YAAM() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            // register a new item here
            quartz_sword = new YAAMSwordItem(YAAMItemTier.QUARTZ, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_sword");
            obsidian_sword = new YAAMSwordItem(YAAMItemTier.OBSIDIAN, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_sword");
            wood_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELWOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("wood_paxel");

        	ForgeRegistries.ITEMS.register(quartz_sword);
        	ForgeRegistries.ITEMS.register(obsidian_sword);
        	ForgeRegistries.ITEMS.register(wood_paxel);
        }
    }

}
