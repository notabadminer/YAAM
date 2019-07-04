package notabadminer.yaam;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import notabadminer.yaam.items.YAAMSwordItem;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("yaam")
public class YAAM {
	public static Item quartzSword, obsidianSword;

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
            quartzSword = new YAAMSwordItem(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_sword");
            obsidianSword = new YAAMSwordItem(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_sword");
        	ForgeRegistries.ITEMS.register(quartzSword);
        	ForgeRegistries.ITEMS.register(obsidianSword);
        }
    }

}
