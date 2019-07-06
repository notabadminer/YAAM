package notabadminer.yaam.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.registries.ForgeRegistries;

public class YAAMItems {

	public static Item wooden_paxel, stone_paxel, iron_paxel, gold_paxel, diamond_paxel, emerald_hoe, emerald_sword,
			emerald_shovel, emerald_axe, emerald_pickaxe, emerald_paxel, lapis_hoe, lapis_sword, lapis_shovel,
			lapis_axe, lapis_pickaxe, lapis_paxel, quartz_hoe, quartz_sword, quartz_shovel, quartz_axe, quartz_pickaxe,
			quartz_paxel, obsidian_hoe, obsidian_sword, obsidian_shovel, obsidian_axe, obsidian_pickaxe, obsidian_paxel,
			emerald_helmet, emerald_chestplate, emerald_leggings, emerald_boots, lapis_helmet, lapis_chestplate,
			lapis_leggings, lapis_boots, obsidian_helmet, obsidian_chestplate, obsidian_leggings, obsidian_boots,
			quartz_helmet, quartz_chestplate, quartz_leggings, quartz_boots;

	public static void registerItems() {
		ForgeRegistries.ITEMS.register(wooden_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELWOOD, 6.0F, -3.2F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("wooden_paxel"));
		ForgeRegistries.ITEMS.register(stone_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELSTONE, 7.0F, -3.2F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("stone_paxel"));
		ForgeRegistries.ITEMS.register(iron_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELIRON, 6.0F, -3.1F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("iron_paxel"));
		ForgeRegistries.ITEMS.register(gold_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELGOLD, 6.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("gold_paxel"));
		ForgeRegistries.ITEMS.register(diamond_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELDIAMOND, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("diamond_paxel"));

		// Emerald
		ForgeRegistries.ITEMS.register(
				emerald_hoe = new HoeItem(YAAMItemTier.EMERALD, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS))
						.setRegistryName("emerald_hoe"));
		ForgeRegistries.ITEMS.register(emerald_sword = new SwordItem(YAAMItemTier.EMERALD, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("emerald_sword"));
		ForgeRegistries.ITEMS.register(emerald_shovel = new ShovelItem(YAAMItemTier.EMERALD, 1.5F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("emerald_shovel"));
		ForgeRegistries.ITEMS.register(emerald_axe = new YAAMAxeItem(YAAMItemTier.EMERALD, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("emerald_axe"));
		ForgeRegistries.ITEMS.register(emerald_pickaxe = new YAAMPickaxeItem(YAAMItemTier.EMERALD, 1, -2.8F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("emerald_pickaxe"));
		ForgeRegistries.ITEMS.register(emerald_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELEMERALD, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("emerald_paxel"));
		ForgeRegistries.ITEMS.register(emerald_helmet = new ArmorItem(YAAMArmorMaterial.EMERALD, EquipmentSlotType.HEAD,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("emerald_helmet"));
		ForgeRegistries.ITEMS
				.register(emerald_chestplate = new ArmorItem(YAAMArmorMaterial.EMERALD, EquipmentSlotType.CHEST,
						(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("emerald_chestplate"));
		ForgeRegistries.ITEMS
				.register(emerald_leggings = new ArmorItem(YAAMArmorMaterial.EMERALD, EquipmentSlotType.LEGS,
						(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("emerald_leggings"));
		ForgeRegistries.ITEMS.register(emerald_boots = new ArmorItem(YAAMArmorMaterial.EMERALD, EquipmentSlotType.FEET,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("emerald_boots"));

		// Lapis
		ForgeRegistries.ITEMS.register(
				lapis_hoe = new HoeItem(YAAMItemTier.LAPIS, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS))
						.setRegistryName("lapis_hoe"));
		ForgeRegistries.ITEMS.register(lapis_sword = new SwordItem(YAAMItemTier.LAPIS, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("lapis_sword"));
		ForgeRegistries.ITEMS.register(lapis_shovel = new ShovelItem(YAAMItemTier.LAPIS, 1.5F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("lapis_shovel"));
		ForgeRegistries.ITEMS.register(lapis_axe = new YAAMAxeItem(YAAMItemTier.LAPIS, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("lapis_axe"));
		ForgeRegistries.ITEMS.register(lapis_pickaxe = new YAAMPickaxeItem(YAAMItemTier.LAPIS, 1, -2.8F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("lapis_pickaxe"));
		ForgeRegistries.ITEMS.register(lapis_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELLAPIS, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("lapis_paxel"));
		ForgeRegistries.ITEMS.register(lapis_helmet = new ArmorItem(YAAMArmorMaterial.LAPIS, EquipmentSlotType.HEAD,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("lapis_helmet"));
		ForgeRegistries.ITEMS
				.register(lapis_chestplate = new ArmorItem(YAAMArmorMaterial.LAPIS, EquipmentSlotType.CHEST,
						(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("lapis_chestplate"));
		ForgeRegistries.ITEMS
				.register(lapis_leggings = new ArmorItem(YAAMArmorMaterial.LAPIS, EquipmentSlotType.LEGS,
						(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("lapis_leggings"));
		ForgeRegistries.ITEMS.register(lapis_boots = new ArmorItem(YAAMArmorMaterial.LAPIS, EquipmentSlotType.FEET,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("lapis_boots"));

		// Obsidian
		ForgeRegistries.ITEMS.register(
				obsidian_hoe = new HoeItem(YAAMItemTier.OBSIDIAN, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS))
						.setRegistryName("obsidian_hoe"));
		ForgeRegistries.ITEMS.register(obsidian_sword = new SwordItem(YAAMItemTier.OBSIDIAN, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_sword"));
		ForgeRegistries.ITEMS.register(obsidian_shovel = new ShovelItem(YAAMItemTier.OBSIDIAN, 1.5F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("obsidian_shovel"));
		ForgeRegistries.ITEMS.register(obsidian_axe = new YAAMAxeItem(YAAMItemTier.OBSIDIAN, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("obsidian_axe"));
		ForgeRegistries.ITEMS.register(obsidian_pickaxe = new YAAMPickaxeItem(YAAMItemTier.OBSIDIAN, 1, -2.8F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("obsidian_pickaxe"));
		ForgeRegistries.ITEMS.register(obsidian_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELOBSIDIAN, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("obsidian_paxel"));
		ForgeRegistries.ITEMS.register(obsidian_helmet = new ArmorItem(YAAMArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_helmet"));
		ForgeRegistries.ITEMS
				.register(obsidian_chestplate = new ArmorItem(YAAMArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST,
						(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_chestplate"));
		ForgeRegistries.ITEMS
				.register(obsidian_leggings = new ArmorItem(YAAMArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS,
						(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_leggings"));
		ForgeRegistries.ITEMS.register(obsidian_boots = new ArmorItem(YAAMArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("obsidian_boots"));

		// Quartz
		ForgeRegistries.ITEMS.register(
				quartz_hoe = new HoeItem(YAAMItemTier.QUARTZ, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS))
						.setRegistryName("quartz_hoe"));
		ForgeRegistries.ITEMS.register(quartz_sword = new SwordItem(YAAMItemTier.QUARTZ, 3, -2.4F,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_sword"));
		ForgeRegistries.ITEMS.register(quartz_shovel = new ShovelItem(YAAMItemTier.QUARTZ, 1.5F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("quartz_shovel"));
		ForgeRegistries.ITEMS.register(quartz_axe = new YAAMAxeItem(YAAMItemTier.QUARTZ, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("quartz_axe"));
		ForgeRegistries.ITEMS.register(quartz_pickaxe = new YAAMPickaxeItem(YAAMItemTier.QUARTZ, 1, -2.8F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("quartz_pickaxe"));
		ForgeRegistries.ITEMS.register(quartz_paxel = new YAAMPaxelItem(YAAMItemTier.PAXELQUARTZ, 5.0F, -3.0F,
				(new Item.Properties()).group(ItemGroup.TOOLS)).setRegistryName("quartz_paxel"));
		ForgeRegistries.ITEMS.register(quartz_helmet = new ArmorItem(YAAMArmorMaterial.QUARTZ, EquipmentSlotType.HEAD,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_helmet"));
		ForgeRegistries.ITEMS
				.register(quartz_chestplate = new ArmorItem(YAAMArmorMaterial.QUARTZ, EquipmentSlotType.CHEST,
						(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_chestplate"));
		ForgeRegistries.ITEMS
				.register(quartz_leggings = new ArmorItem(YAAMArmorMaterial.QUARTZ, EquipmentSlotType.LEGS,
						(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_leggings"));
		ForgeRegistries.ITEMS.register(quartz_boots = new ArmorItem(YAAMArmorMaterial.QUARTZ, EquipmentSlotType.FEET,
				(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("quartz_boots"));
	}
}
