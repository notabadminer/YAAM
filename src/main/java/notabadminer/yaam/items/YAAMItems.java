package notabadminer.yaam.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.registries.ForgeRegistries;

public class YAAMItems {

	public static Item wood_paxel, stone_paxel, iron_paxel, gold_paxel, diamond_paxel, emerald_paxel, obsidian_paxel,
			lapis_paxel, quartz_paxel, emerald_sword, emerald_shovel, lapis_sword, lapis_shovel, quartz_sword,
			quartz_shovel, obsidian_sword, obsidian_shovel;

	public static void registerItems() {
		ForgeRegistries.ITEMS.register(wood_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELWOOD, 6.0F, -3.2F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("wood_paxel"));
		ForgeRegistries.ITEMS.register(stone_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELSTONE, 7.0F, -3.2F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("stone_paxel"));
		ForgeRegistries.ITEMS.register(iron_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELIRON, 6.0F, -3.1F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("iron_paxel"));
		ForgeRegistries.ITEMS.register(gold_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELGOLD, 6.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("gold_paxel"));
		ForgeRegistries.ITEMS.register(diamond_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELDIAMOND, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("diamond_paxel"));

		// Emerald
		ForgeRegistries.ITEMS.register(emerald_sword = new SwordItem(YAAMItemTier.EMERALD, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("emerald_sword"));
		ForgeRegistries.ITEMS.register(emerald_shovel = new ShovelItem(YAAMItemTier.EMERALD, 1.5F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("emerald_shovel"));
		// TODO AxeItem protected. Cannot create new axe :(
		ForgeRegistries.ITEMS.register(emerald_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELEMERALD, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("emerald_paxel"));
		// Lapis
		ForgeRegistries.ITEMS.register(lapis_sword = new SwordItem(YAAMItemTier.LAPIS, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("lapis_sword"));
		ForgeRegistries.ITEMS.register(lapis_shovel = new ShovelItem(YAAMItemTier.LAPIS, 1.5F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("lapis_shovel"));
		ForgeRegistries.ITEMS.register(lapis_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELLAPIS, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("lapis_paxel"));
		// Obsidian
		ForgeRegistries.ITEMS.register(obsidian_sword = new SwordItem(YAAMItemTier.OBSIDIAN, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_sword"));
		ForgeRegistries.ITEMS.register(obsidian_shovel = new ShovelItem(YAAMItemTier.OBSIDIAN, 1.5F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("obsidian_shovel"));
		ForgeRegistries.ITEMS.register(obsidian_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELOBSIDIAN, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("obsidian_paxel"));
		// Quartz
		ForgeRegistries.ITEMS.register(quartz_sword = new SwordItem(YAAMItemTier.QUARTZ, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_sword"));
		ForgeRegistries.ITEMS.register(quartz_shovel = new ShovelItem(YAAMItemTier.QUARTZ, 1.5F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("quartz_shovel"));
		ForgeRegistries.ITEMS.register(quartz_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELQUARTZ, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("quartz_paxel"));
	}
}
