package notabadminer.yaam.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.ForgeRegistries;

public class YAAMItems {

	public static Item quartz_sword, obsidian_sword, wood_paxel;

	public static void registerItems() {
		ForgeRegistries.ITEMS.register(quartz_sword = new YAAMSwordItem(YAAMItemTier.QUARTZ, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_sword"));
		ForgeRegistries.ITEMS.register(obsidian_sword = new YAAMSwordItem(YAAMItemTier.OBSIDIAN, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_sword"));
		ForgeRegistries.ITEMS.register(wood_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELWOOD, 6.0F, -3.2F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("wood_paxel"));
	}
}
