package yaam.proxy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import yaam.YAAM;
import yaam.items.ItemEmeraldArmor;
import yaam.items.ItemEmeraldAxe;
import yaam.items.ItemEmeraldHoe;
import yaam.items.ItemEmeraldPaxel;
import yaam.items.ItemEmeraldPickaxe;
import yaam.items.ItemEmeraldShovel;
import yaam.items.ItemEmeraldSword;
import yaam.items.ItemGoldPaxel;
import yaam.items.ItemIronPaxel;
import yaam.items.ItemLapisArmor;
import yaam.items.ItemLapisAxe;
import yaam.items.ItemLapisHoe;
import yaam.items.ItemLapisPaxel;
import yaam.items.ItemLapisPickaxe;
import yaam.items.ItemLapisShovel;
import yaam.items.ItemLapisSword;
import yaam.items.ItemObsidianArmor;
import yaam.items.ItemObsidianAxe;
import yaam.items.ItemObsidianHoe;
import yaam.items.ItemObsidianPaxel;
import yaam.items.ItemObsidianPickaxe;
import yaam.items.ItemObsidianShovel;
import yaam.items.ItemObsidianSword;
import yaam.items.ItemQuartzArmor;
import yaam.items.ItemQuartzAxe;
import yaam.items.ItemQuartzHoe;
import yaam.items.ItemQuartzPaxel;
import yaam.items.ItemQuartzPickaxe;
import yaam.items.ItemQuartzShovel;
import yaam.items.ItemQuartzSword;
import yaam.items.ItemStonePaxel;
import yaam.items.ItemWoodPaxel;

public class CommonProxy {

	public Item obsidian_sword, obsidian_pickaxe, obsidian_axe, obsidian_shovel, obsidian_hoe, obsidian_helmet,
			obsidian_chestplate, obsidian_leggings, obsidian_boots, quartz_sword, quartz_pickaxe, quartz_axe,
			quartz_shovel, quartz_hoe, quartz_helmet, quartz_chestplate, quartz_leggings, quartz_boots, emerald_sword,
			emerald_pickaxe, emerald_axe, emerald_shovel, emerald_hoe, emerald_helmet, emerald_chestplate,
			emerald_leggings, emerald_boots, lapis_sword, lapis_pickaxe, lapis_axe, lapis_shovel, lapis_hoe,
			lapis_helmet, lapis_chestplate, lapis_leggings, lapis_boots, wood_paxel, stone_paxel, iron_paxel,
			gold_paxel, diamond_paxel, emerald_paxel, quartz_paxel, obsidian_paxel, lapis_paxel;

	// Tool materials
	static Item.ToolMaterial toolMaterialObsidian = EnumHelper.addToolMaterial("Obsidian", 3, 1200, 9.0F, 3.0F, 16);
	static Item.ToolMaterial toolMaterialQuartz = EnumHelper.addToolMaterial("Quartz", 3, 1400, 9.0F, 3.0F, 18);
	static Item.ToolMaterial toolMaterialEmerald = EnumHelper.addToolMaterial("Emerald", 3, 1400, 9.0F, 3.0F, 18);
	static Item.ToolMaterial toolMaterialLapis = EnumHelper.addToolMaterial("Lapis", 3, 800, 9.0F, 3.0F, 22);
	static Item.ToolMaterial paxelMaterialWood = EnumHelper.addToolMaterial("Wood", 0, 177, 2.0F, 0.0F, 15);
	static Item.ToolMaterial paxelMaterialStone = EnumHelper.addToolMaterial("Stone", 1, 393, 4.0F, 1.0F, 5);
	static Item.ToolMaterial paxelMaterialIron = EnumHelper.addToolMaterial("Iron", 2, 750, 6.0F, 2.0F, 14);
	static Item.ToolMaterial paxelMaterialGold = EnumHelper.addToolMaterial("Gold", 0, 96, 12.0F, 0.0F, 22);
	static Item.ToolMaterial paxelMaterialDiamond = EnumHelper.addToolMaterial("Diamond", 3, 4683, 8.0F, 3.0F, 10);
	static Item.ToolMaterial paxelMaterialEmerald = EnumHelper.addToolMaterial("Emerald", 3, 4200, 9.0F, 3.0F, 18);
	static Item.ToolMaterial paxelMaterialQuartz = EnumHelper.addToolMaterial("Quartz", 3, 4200, 9.0F, 3.0F, 18);
	static Item.ToolMaterial paxelMaterialObsidian = EnumHelper.addToolMaterial("Obsidian", 3, 3600, 9.0F, 3.0F, 16);
	static Item.ToolMaterial paxelMaterialLapis = EnumHelper.addToolMaterial("Lapis", 3, 2400, 9.0F, 3.0F, 22);

	// Armor materials
	static ArmorMaterial armorMaterialObsidian = EnumHelper.addArmorMaterial("Obsidian", "universalcoins:obsidian", 28,
			new int[] { 3, 8, 6, 3 }, 16);
	static ArmorMaterial armorMaterialQuartz = EnumHelper.addArmorMaterial("Quartz", "universalcoins:quartz", 30,
			new int[] { 3, 8, 6, 3 }, 24);
	static ArmorMaterial armorMaterialEmerald = EnumHelper.addArmorMaterial("Emerald", "universalcoins:emerald", 33,
			new int[] { 3, 8, 6, 3 }, 26);
	static ArmorMaterial armorMaterialLapis = EnumHelper.addArmorMaterial("Lapis", "universalcoins:lapis", 9,
			new int[] { 2, 6, 5, 2 }, 30);

	public void registerBlocks() {
	}

	public void registerItems() {
		// obsidian
		GameRegistry.registerItem(obsidian_sword = new ItemObsidianSword("obsidian_sword", toolMaterialObsidian),
				"obsidian_sword");
		GameRegistry.registerItem(obsidian_pickaxe = new ItemObsidianPickaxe("obsidian_pickaxe", toolMaterialObsidian),
				"obsidian_pickaxe");
		GameRegistry.registerItem(obsidian_axe = new ItemObsidianAxe("obsidian_axe", toolMaterialObsidian),
				"obsidian_axe");
		GameRegistry.registerItem(obsidian_shovel = new ItemObsidianShovel("obsidian_shovel", toolMaterialObsidian),
				"obsidian_shovel");
		GameRegistry.registerItem(obsidian_hoe = new ItemObsidianHoe("obsidian_hoe", toolMaterialObsidian),
				"obsidian_hoe");
		GameRegistry.registerItem(obsidian_paxel = new ItemObsidianPaxel("obsidian_paxel", paxelMaterialObsidian),
				"obsidian_paxel");
		GameRegistry.registerItem(
				obsidian_helmet = new ItemObsidianArmor("obsidian_helmet", armorMaterialObsidian, "obsidian", 0),
				"obsidian_helmet"); // 0 for helmet
		GameRegistry.registerItem(obsidian_chestplate = new ItemObsidianArmor("obsidian_chestplate",
				armorMaterialObsidian, "obsidian", 1), "obsidian_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(
				obsidian_leggings = new ItemObsidianArmor("obsidian_leggings", armorMaterialObsidian, "obsidian", 2),
				"obsidian_leggings"); // 2 for leggings
		GameRegistry.registerItem(
				obsidian_boots = new ItemObsidianArmor("obsidian_boots", armorMaterialObsidian, "obsidian", 3),
				"obsidian_boots"); // 3 for boots
		// quartz
		GameRegistry.registerItem(quartz_sword = new ItemQuartzSword("quartz_sword", toolMaterialQuartz),
				"quartz_sword");
		GameRegistry.registerItem(quartz_pickaxe = new ItemQuartzPickaxe("quartz_pickaxe", toolMaterialQuartz),
				"quartz_pickaxe");
		GameRegistry.registerItem(quartz_axe = new ItemQuartzAxe("quartz_axe", toolMaterialQuartz), "quartz_axe");
		GameRegistry.registerItem(quartz_shovel = new ItemQuartzShovel("quartz_shovel", toolMaterialQuartz),
				"quartz_shovel");
		GameRegistry.registerItem(quartz_hoe = new ItemQuartzHoe("quartz_hoe", toolMaterialQuartz), "quartz_hoe");
		GameRegistry.registerItem(quartz_paxel = new ItemQuartzPaxel("quartz_paxel", paxelMaterialQuartz),
				"quartz_paxel");
		GameRegistry.registerItem(
				quartz_helmet = new ItemQuartzArmor("quartz_helmet", armorMaterialQuartz, "quartz", 0),
				"quartz_helmet"); // 0 for helmet
		GameRegistry.registerItem(
				quartz_chestplate = new ItemQuartzArmor("quartz_chestplate", armorMaterialQuartz, "quartz", 1),
				"quartz_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(
				quartz_leggings = new ItemQuartzArmor("quartz_leggings", armorMaterialQuartz, "quartz", 2),
				"quartz_leggings"); // 2 for leggings
		GameRegistry.registerItem(quartz_boots = new ItemQuartzArmor("quartz_boots", armorMaterialQuartz, "quartz", 3),
				"quartz_boots"); // 3 for boots
		// emerald
		GameRegistry.registerItem(emerald_sword = new ItemEmeraldSword("emerald_sword", toolMaterialEmerald),
				"emerald_sword");
		GameRegistry.registerItem(emerald_pickaxe = new ItemEmeraldPickaxe("emerald_pickaxe", toolMaterialEmerald),
				"emerald_pickaxe");
		GameRegistry.registerItem(emerald_axe = new ItemEmeraldAxe("emerald_axe", toolMaterialEmerald), "emerald_axe");
		GameRegistry.registerItem(emerald_shovel = new ItemEmeraldShovel("emerald_shovel", toolMaterialEmerald),
				"emerald_shovel");
		GameRegistry.registerItem(emerald_hoe = new ItemEmeraldHoe("emerald_hoe", toolMaterialEmerald), "emerald_hoe");
		GameRegistry.registerItem(emerald_paxel = new ItemEmeraldPaxel("emerald_paxel", paxelMaterialEmerald),
				"emerald_paxel");
		GameRegistry.registerItem(
				emerald_helmet = new ItemEmeraldArmor("emerald_helmet", armorMaterialEmerald, "emerald", 0),
				"emerald_helmet"); // 0 for helmet
		GameRegistry.registerItem(
				emerald_chestplate = new ItemEmeraldArmor("emerald_chestplate", armorMaterialEmerald, "emerald", 1),
				"emerald_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(
				emerald_leggings = new ItemEmeraldArmor("emerald_leggings", armorMaterialEmerald, "emerald", 2),
				"emerald_leggings"); // 2 for leggings
		GameRegistry.registerItem(
				emerald_boots = new ItemEmeraldArmor("emerald_boots", armorMaterialEmerald, "emerald", 3),
				"emerald_boots"); // 3 for boots
		// lapis
		GameRegistry.registerItem(lapis_sword = new ItemLapisSword("lapis_sword", toolMaterialLapis), "lapis_sword");
		GameRegistry.registerItem(lapis_pickaxe = new ItemLapisPickaxe("lapis_pickaxe", toolMaterialLapis),
				"lapis_pickaxe");
		GameRegistry.registerItem(lapis_axe = new ItemLapisAxe("lapis_axe", toolMaterialLapis), "lapis_axe");
		GameRegistry.registerItem(lapis_shovel = new ItemLapisShovel("lapis_shovel", toolMaterialLapis),
				"lapis_shovel");
		GameRegistry.registerItem(lapis_hoe = new ItemLapisHoe("lapis_hoe", toolMaterialLapis), "lapis_hoe");
		GameRegistry.registerItem(lapis_paxel = new ItemLapisPaxel("lapis_paxel", paxelMaterialLapis), "lapis_paxel");
		GameRegistry.registerItem(lapis_helmet = new ItemLapisArmor("lapis_helmet", armorMaterialLapis, "lapis", 0),
				"lapis_helmet"); // 0 for helmet
		GameRegistry.registerItem(
				lapis_chestplate = new ItemLapisArmor("lapis_chestplate", armorMaterialLapis, "lapis", 1),
				"lapis_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(lapis_leggings = new ItemLapisArmor("lapis_leggings", armorMaterialLapis, "lapis", 2),
				"lapis_leggings"); // 2 for leggings
		GameRegistry.registerItem(lapis_boots = new ItemLapisArmor("lapis_boots", armorMaterialLapis, "lapis", 3),
				"lapis_boots"); // 3 for boots
		// native material paxels
		GameRegistry.registerItem(wood_paxel = new ItemWoodPaxel("wood_paxel", paxelMaterialWood), "wood_paxel");
		GameRegistry.registerItem(stone_paxel = new ItemStonePaxel("stone_paxel", paxelMaterialStone), "stone_paxel");
		GameRegistry.registerItem(iron_paxel = new ItemIronPaxel("iron_paxel", paxelMaterialIron), "iron_paxel");
		GameRegistry.registerItem(gold_paxel = new ItemGoldPaxel("gold_paxel", paxelMaterialGold), "gold_paxel");
		GameRegistry.registerItem(diamond_paxel = new ItemGoldPaxel("diamond_paxel", paxelMaterialDiamond),
				"diamond_paxel");
	}

	public void registerRecipes() {
		// obsidian
		if (YAAM.obsidianEnabled) {
			GameRegistry.addRecipe(new ItemStack(obsidian_axe, 1), new Object[] { "OO ", "OS ", " S ",
					Character.valueOf('O'), Blocks.obsidian, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(obsidian_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
					Character.valueOf('O'), Blocks.obsidian, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(obsidian_hoe, 1), new Object[] { "OO ", " S ", " S ",
					Character.valueOf('O'), Blocks.obsidian, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(obsidian_shovel, 1), new Object[] { " O ", " S ", " S ",
					Character.valueOf('O'), Blocks.obsidian, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(obsidian_sword, 1), new Object[] { " O ", " O ", " S ",
					Character.valueOf('O'), Blocks.obsidian, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(obsidian_paxel, 1),
					new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), obsidian_axe, Character.valueOf('P'),
							obsidian_pickaxe, Character.valueOf('L'), obsidian_shovel, Character.valueOf('S'),
							Items.stick });
			GameRegistry.addRecipe(new ItemStack(obsidian_helmet, 1),
					new Object[] { "OOO", "O O", Character.valueOf('O'), Blocks.obsidian });
			GameRegistry.addRecipe(new ItemStack(obsidian_chestplate, 1),
					new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Blocks.obsidian });
			GameRegistry.addRecipe(new ItemStack(obsidian_leggings, 1),
					new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Blocks.obsidian });
			GameRegistry.addRecipe(new ItemStack(obsidian_boots, 1),
					new Object[] { "O O", "O O", Character.valueOf('O'), Blocks.obsidian });
		}

		// quartz
		if (YAAM.quartzEnabled) {
			GameRegistry.addRecipe(new ItemStack(quartz_axe, 1), new Object[] { "OO ", "OS ", " S ",
					Character.valueOf('O'), Items.quartz, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(quartz_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
					Character.valueOf('O'), Items.quartz, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(quartz_hoe, 1), new Object[] { "OO ", " S ", " S ",
					Character.valueOf('O'), Items.quartz, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(quartz_shovel, 1), new Object[] { " O ", " S ", " S ",
					Character.valueOf('O'), Items.quartz, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(quartz_sword, 1), new Object[] { " O ", " O ", " S ",
					Character.valueOf('O'), Items.quartz, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(quartz_paxel, 1),
					new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), quartz_axe, Character.valueOf('P'),
							quartz_pickaxe, Character.valueOf('L'), quartz_shovel, Character.valueOf('S'),
							Items.stick });
			GameRegistry.addRecipe(new ItemStack(quartz_helmet, 1),
					new Object[] { "OOO", "O O", Character.valueOf('O'), Items.quartz });
			GameRegistry.addRecipe(new ItemStack(quartz_chestplate, 1),
					new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Items.quartz });
			GameRegistry.addRecipe(new ItemStack(quartz_leggings, 1),
					new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Items.quartz });
			GameRegistry.addRecipe(new ItemStack(quartz_boots, 1),
					new Object[] { "O O", "O O", Character.valueOf('O'), Items.quartz });
		}

		// emerald
		if (YAAM.emeraldEnabled) {
			GameRegistry.addRecipe(new ItemStack(emerald_axe, 1), new Object[] { "OO ", "OS ", " S ",
					Character.valueOf('O'), Items.emerald, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(emerald_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
					Character.valueOf('O'), Items.emerald, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(emerald_hoe, 1), new Object[] { "OO ", " S ", " S ",
					Character.valueOf('O'), Items.emerald, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(emerald_shovel, 1), new Object[] { " O ", " S ", " S ",
					Character.valueOf('O'), Items.emerald, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(emerald_sword, 1), new Object[] { " O ", " O ", " S ",
					Character.valueOf('O'), Items.emerald, Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(emerald_paxel, 1),
					new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), emerald_axe, Character.valueOf('P'),
							emerald_pickaxe, Character.valueOf('L'), emerald_shovel, Character.valueOf('S'),
							Items.stick });
			GameRegistry.addRecipe(new ItemStack(emerald_helmet, 1),
					new Object[] { "OOO", "O O", Character.valueOf('O'), Items.emerald });
			GameRegistry.addRecipe(new ItemStack(emerald_chestplate, 1),
					new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Items.emerald });
			GameRegistry.addRecipe(new ItemStack(emerald_leggings, 1),
					new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Items.emerald });
			GameRegistry.addRecipe(new ItemStack(emerald_boots, 1),
					new Object[] { "O O", "O O", Character.valueOf('O'), Items.emerald });
		}

		// lapis
		if (YAAM.lapisEnabled) {
			GameRegistry.addRecipe(new ItemStack(emerald_axe, 1), new Object[] { "OO ", "OS ", " S ",
					Character.valueOf('O'), new ItemStack(Items.dye, 1, 4), Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(lapis_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
					Character.valueOf('O'), new ItemStack(Items.dye, 1, 4), Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(lapis_hoe, 1), new Object[] { "OO ", " S ", " S ",
					Character.valueOf('O'), new ItemStack(Items.dye, 1, 4), Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(lapis_shovel, 1), new Object[] { " O ", " S ", " S ",
					Character.valueOf('O'), new ItemStack(Items.dye, 1, 4), Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(lapis_sword, 1), new Object[] { " O ", " O ", " S ",
					Character.valueOf('O'), new ItemStack(Items.dye, 1, 4), Character.valueOf('S'), Items.stick });
			GameRegistry
					.addRecipe(new ItemStack(lapis_paxel, 1),
							new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), lapis_axe,
									Character.valueOf('P'), lapis_pickaxe, Character.valueOf('L'), lapis_shovel,
									Character.valueOf('S'), Items.stick });
			GameRegistry.addRecipe(new ItemStack(lapis_helmet, 1),
					new Object[] { "OOO", "O O", Character.valueOf('O'), new ItemStack(Items.dye, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(lapis_chestplate, 1),
					new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), new ItemStack(Items.dye, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(lapis_leggings, 1),
					new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), new ItemStack(Items.dye, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(lapis_boots, 1),
					new Object[] { "O O", "O O", Character.valueOf('O'), new ItemStack(Items.dye, 1, 4) });

			// natives
			if (YAAM.nativePaxelsEnabled) {
				GameRegistry.addRecipe(new ItemStack(wood_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.wooden_axe,
								Character.valueOf('P'), Items.wooden_pickaxe, Character.valueOf('L'),
								Items.wooden_shovel, Character.valueOf('S'), Items.stick });
				GameRegistry.addRecipe(new ItemStack(stone_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.stone_axe,
								Character.valueOf('P'), Items.stone_pickaxe, Character.valueOf('L'), Items.stone_shovel,
								Character.valueOf('S'), Items.stick });
				GameRegistry.addRecipe(new ItemStack(iron_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.iron_axe,
								Character.valueOf('P'), Items.iron_pickaxe, Character.valueOf('L'), Items.iron_shovel,
								Character.valueOf('S'), Items.stick });
				GameRegistry.addRecipe(new ItemStack(gold_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.golden_axe,
								Character.valueOf('P'), Items.golden_pickaxe, Character.valueOf('L'),
								Items.golden_shovel, Character.valueOf('S'), Items.stick });
				GameRegistry.addRecipe(new ItemStack(diamond_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.diamond_axe,
								Character.valueOf('P'), Items.diamond_pickaxe, Character.valueOf('L'),
								Items.diamond_shovel, Character.valueOf('S'), Items.stick });
			}
			if (YAAM.smeltingEnabled) {
				// iron
				GameRegistry.addSmelting(Items.iron_hoe, new ItemStack(Items.iron_ingot, 2), 0F);
				GameRegistry.addSmelting(Items.iron_shovel, new ItemStack(Items.iron_ingot, 1), 0F);
				GameRegistry.addSmelting(Items.iron_axe, new ItemStack(Items.iron_ingot, 3), 0F);
				GameRegistry.addSmelting(Items.iron_pickaxe, new ItemStack(Items.iron_ingot, 3), 0F);
				GameRegistry.addSmelting(Items.iron_boots, new ItemStack(Items.iron_ingot, 4), 0F);
				GameRegistry.addSmelting(Items.iron_leggings, new ItemStack(Items.iron_ingot, 7), 0F);
				GameRegistry.addSmelting(Items.iron_chestplate, new ItemStack(Items.iron_ingot, 8), 0F);
				GameRegistry.addSmelting(Items.iron_helmet, new ItemStack(Items.iron_ingot, 5), 0F);
				GameRegistry.addSmelting(iron_paxel, new ItemStack(Items.iron_ingot, 7), 0F);
				// gold
				GameRegistry.addSmelting(Items.golden_hoe, new ItemStack(Items.gold_ingot, 2), 0F);
				GameRegistry.addSmelting(Items.golden_shovel, new ItemStack(Items.gold_ingot, 1), 0F);
				GameRegistry.addSmelting(Items.golden_axe, new ItemStack(Items.gold_ingot, 3), 0F);
				GameRegistry.addSmelting(Items.golden_pickaxe, new ItemStack(Items.gold_ingot, 3), 0F);
				GameRegistry.addSmelting(Items.golden_boots, new ItemStack(Items.gold_ingot, 4), 0F);
				GameRegistry.addSmelting(Items.golden_leggings, new ItemStack(Items.gold_ingot, 7), 0F);
				GameRegistry.addSmelting(Items.golden_chestplate, new ItemStack(Items.gold_ingot, 8), 0F);
				GameRegistry.addSmelting(Items.golden_helmet, new ItemStack(Items.gold_ingot, 5), 0F);
				GameRegistry.addSmelting(gold_paxel, new ItemStack(Items.gold_ingot, 7), 0F);
				// diamond
				GameRegistry.addSmelting(Items.diamond_hoe, new ItemStack(Items.diamond, 2), 0F);
				GameRegistry.addSmelting(Items.diamond_shovel, new ItemStack(Items.diamond, 1), 0F);
				GameRegistry.addSmelting(Items.diamond_axe, new ItemStack(Items.diamond, 3), 0F);
				GameRegistry.addSmelting(Items.diamond_pickaxe, new ItemStack(Items.diamond, 3), 0F);
				GameRegistry.addSmelting(Items.diamond_boots, new ItemStack(Items.diamond, 4), 0F);
				GameRegistry.addSmelting(Items.diamond_leggings, new ItemStack(Items.diamond, 7), 0F);
				GameRegistry.addSmelting(Items.diamond_chestplate, new ItemStack(Items.diamond, 8), 0F);
				GameRegistry.addSmelting(Items.diamond_helmet, new ItemStack(Items.diamond, 5), 0F);
				GameRegistry.addSmelting(diamond_paxel, new ItemStack(Items.diamond, 7), 0F);
				// obsidian
				GameRegistry.addSmelting(obsidian_hoe, new ItemStack(Blocks.obsidian, 2), 0F);
				GameRegistry.addSmelting(obsidian_shovel, new ItemStack(Blocks.obsidian, 1), 0F);
				GameRegistry.addSmelting(obsidian_axe, new ItemStack(Blocks.obsidian, 3), 0F);
				GameRegistry.addSmelting(obsidian_pickaxe, new ItemStack(Blocks.obsidian, 3), 0F);
				GameRegistry.addSmelting(obsidian_boots, new ItemStack(Blocks.obsidian, 4), 0F);
				GameRegistry.addSmelting(obsidian_leggings, new ItemStack(Blocks.obsidian, 7), 0F);
				GameRegistry.addSmelting(obsidian_chestplate, new ItemStack(Blocks.obsidian, 8), 0F);
				GameRegistry.addSmelting(obsidian_helmet, new ItemStack(Blocks.obsidian, 5), 0F);
				GameRegistry.addSmelting(obsidian_paxel, new ItemStack(Blocks.obsidian, 7), 0F);
				// emerald
				GameRegistry.addSmelting(emerald_hoe, new ItemStack(Items.emerald, 2), 0F);
				GameRegistry.addSmelting(emerald_shovel, new ItemStack(Items.emerald, 1), 0F);
				GameRegistry.addSmelting(emerald_axe, new ItemStack(Items.emerald, 3), 0F);
				GameRegistry.addSmelting(emerald_pickaxe, new ItemStack(Items.emerald, 3), 0F);
				GameRegistry.addSmelting(emerald_boots, new ItemStack(Items.emerald, 4), 0F);
				GameRegistry.addSmelting(emerald_leggings, new ItemStack(Items.emerald, 7), 0F);
				GameRegistry.addSmelting(emerald_chestplate, new ItemStack(Items.emerald, 8), 0F);
				GameRegistry.addSmelting(emerald_helmet, new ItemStack(Items.emerald, 5), 0F);
				GameRegistry.addSmelting(emerald_paxel, new ItemStack(Items.emerald, 7), 0F);
				// quartz
				GameRegistry.addSmelting(quartz_hoe, new ItemStack(Items.quartz, 2), 0F);
				GameRegistry.addSmelting(quartz_shovel, new ItemStack(Items.quartz, 1), 0F);
				GameRegistry.addSmelting(quartz_axe, new ItemStack(Items.quartz, 3), 0F);
				GameRegistry.addSmelting(quartz_pickaxe, new ItemStack(Items.quartz, 3), 0F);
				GameRegistry.addSmelting(quartz_boots, new ItemStack(Items.quartz, 4), 0F);
				GameRegistry.addSmelting(quartz_leggings, new ItemStack(Items.quartz, 7), 0F);
				GameRegistry.addSmelting(quartz_chestplate, new ItemStack(Items.quartz, 8), 0F);
				GameRegistry.addSmelting(quartz_helmet, new ItemStack(Items.quartz, 5), 0F);
				GameRegistry.addSmelting(quartz_paxel, new ItemStack(Items.quartz, 7), 0F);
				// lapis
				GameRegistry.addSmelting(lapis_hoe, new ItemStack(Items.dye, 2, 4), 0F);
				GameRegistry.addSmelting(lapis_shovel, new ItemStack(Items.dye, 1, 4), 0F);
				GameRegistry.addSmelting(lapis_axe, new ItemStack(Items.dye, 3, 4), 0F);
				GameRegistry.addSmelting(lapis_pickaxe, new ItemStack(Items.dye, 3, 4), 0F);
				GameRegistry.addSmelting(lapis_boots, new ItemStack(Items.dye, 4, 4), 0F);
				GameRegistry.addSmelting(lapis_leggings, new ItemStack(Items.dye, 7, 4), 0F);
				GameRegistry.addSmelting(lapis_chestplate, new ItemStack(Items.dye, 8, 4), 0F);
				GameRegistry.addSmelting(lapis_helmet, new ItemStack(Items.dye, 5, 4), 0F);
				GameRegistry.addSmelting(lapis_paxel, new ItemStack(Items.dye, 7, 4), 0F);
			}
		}
	}

	public void registerRenderers() {
		// blank since we don't do anything on the server
	}

}
