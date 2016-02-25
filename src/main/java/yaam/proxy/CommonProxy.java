package yaam.proxy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import yaam.items.ItemObsidianArmor;
import yaam.items.ItemObsidianAxe;
import yaam.items.ItemObsidianHoe;
import yaam.items.ItemObsidianPickaxe;
import yaam.items.ItemObsidianShovel;
import yaam.items.ItemObsidianSword;
import yaam.items.ItemQuartzArmor;
import yaam.items.ItemQuartzAxe;
import yaam.items.ItemQuartzHoe;
import yaam.items.ItemQuartzPickaxe;
import yaam.items.ItemQuartzShovel;
import yaam.items.ItemQuartzSword;

public class CommonProxy {
	
	Item obsidian_sword;
	Item obsidian_pickaxe;
	Item obsidian_axe;
	Item obsidian_shovel;
	Item obsidian_hoe;
	Item obsidian_helmet;
	Item obsidian_chestplate;
	Item obsidian_leggings;
	Item obsidian_boots;
	Item quartz_sword;
	Item quartz_pickaxe;
	Item quartz_axe;
	Item quartz_shovel;
	Item quartz_hoe;
	Item quartz_helmet;
	Item quartz_chestplate;
	Item quartz_leggings;
	Item quartz_boots;

	// Tool materials
	static Item.ToolMaterial enumToolMaterialObsidian = EnumHelper.addToolMaterial("Obsidian", 3, 1200, 9.0F, 3.0F, 16);
	static Item.ToolMaterial enumToolMaterialQuartz = EnumHelper.addToolMaterial("Quartz", 3, 1400, 9.0F, 3.0F, 18);

	// Armor materials
	static ArmorMaterial enumArmorMaterialObsidian = EnumHelper.addArmorMaterial("Obsidian", "universalcoins:obsidian",
			28, new int[] { 3, 8, 6, 3 }, 20);
	static ArmorMaterial enumArmorMaterialQuartz = EnumHelper.addArmorMaterial("Quartz", "universalcoins:quartz", 30,
			new int[] { 3, 8, 6, 3 }, 22);

	public void registerBlocks() {
	}

	public void registerItems() {
		GameRegistry.registerItem(obsidian_sword = new ItemObsidianSword("obsidian_sword", enumToolMaterialObsidian),
				"obsidian_sword");
		GameRegistry.registerItem(
				obsidian_pickaxe = new ItemObsidianPickaxe("obsidian_pickaxe", enumToolMaterialObsidian),
				"obsidian_pickaxe");
		GameRegistry.registerItem(obsidian_axe = new ItemObsidianAxe("obsidian_axe", enumToolMaterialObsidian),
				"obsidian_axe");
		GameRegistry.registerItem(obsidian_shovel = new ItemObsidianShovel("obsidian_shovel", enumToolMaterialObsidian),
				"obsidian_shovel");
		GameRegistry.registerItem(obsidian_hoe = new ItemObsidianHoe("obsidian_hoe", enumToolMaterialObsidian),
				"obsidian_hoe");

		GameRegistry.registerItem(
				obsidian_helmet = new ItemObsidianArmor("obsidian_helmet", enumArmorMaterialObsidian, "obsidian", 0),
				"obsidian_helmet"); // 0 for helmet
		GameRegistry.registerItem(obsidian_chestplate = new ItemObsidianArmor("obsidian_chestplate",
				enumArmorMaterialObsidian, "obsidian", 1), "obsidian_chestplate"); // 1
																					// for
																					// chestplate
		GameRegistry.registerItem(obsidian_leggings = new ItemObsidianArmor("obsidian_leggings",
				enumArmorMaterialObsidian, "obsidian", 2), "obsidian_leggings"); // 2
																				// for
																				// leggings
		GameRegistry.registerItem(
				obsidian_boots = new ItemObsidianArmor("obsidian_boots", enumArmorMaterialObsidian, "obsidian", 3),
				"obsidian_boots"); // 3 for boots

		GameRegistry.registerItem(quartz_sword = new ItemQuartzSword("quartz_sword", enumToolMaterialQuartz),
				"quartz_sword");
		GameRegistry.registerItem(quartz_pickaxe = new ItemQuartzPickaxe("quartz_pickaxe", enumToolMaterialQuartz),
				"quartz_pickaxe");
		GameRegistry.registerItem(quartz_axe = new ItemQuartzAxe("quartz_axe", enumToolMaterialQuartz), "quartz_axe");
		GameRegistry.registerItem(quartz_shovel = new ItemQuartzShovel("quartz_shovel", enumToolMaterialQuartz),
				"quartz_shovel");
		GameRegistry.registerItem(quartz_hoe = new ItemQuartzHoe("quartz_hoe", enumToolMaterialQuartz), "quartz_hoe");

		GameRegistry.registerItem(
				quartz_helmet = new ItemQuartzArmor("quartz_helmet", enumArmorMaterialQuartz, "quartz", 0),
				"quartz_helmet"); // 0 for helmet
		GameRegistry.registerItem(
				quartz_chestplate = new ItemQuartzArmor("quartz_chestplate", enumArmorMaterialQuartz, "quartz", 1),
				"quartz_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(
				quartz_leggings = new ItemQuartzArmor("quartz_leggings", enumArmorMaterialQuartz, "quartz", 2),
				"quartz_leggings"); // 2 for leggings
		GameRegistry.registerItem(
				quartz_boots = new ItemQuartzArmor("quartz_boots", enumArmorMaterialQuartz, "quartz", 3),
				"quartz_boots"); // 3 for boots
	}

	public void registerRecipes() {
		// Recipes
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

		GameRegistry.addRecipe(new ItemStack(obsidian_helmet, 1),
				new Object[] { "OOO", "O O", Character.valueOf('O'), Blocks.obsidian });
		GameRegistry.addRecipe(new ItemStack(obsidian_chestplate, 1),
				new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Blocks.obsidian });
		GameRegistry.addRecipe(new ItemStack(obsidian_leggings, 1),
				new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Blocks.obsidian });
		GameRegistry.addRecipe(new ItemStack(obsidian_boots, 1),
				new Object[] { "O O", "O O", Character.valueOf('O'), Blocks.obsidian });

		GameRegistry.addRecipe(new ItemStack(quartz_axe, 1), new Object[] { "OO ", "OS ", " S ", Character.valueOf('O'),
				Items.quartz, Character.valueOf('S'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(quartz_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
				Character.valueOf('O'), Items.quartz, Character.valueOf('S'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(quartz_hoe, 1), new Object[] { "OO ", " S ", " S ", Character.valueOf('O'),
				Items.quartz, Character.valueOf('S'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(quartz_shovel, 1), new Object[] { " O ", " S ", " S ",
				Character.valueOf('O'), Items.quartz, Character.valueOf('S'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(quartz_sword, 1), new Object[] { " O ", " O ", " S ",
				Character.valueOf('O'), Items.quartz, Character.valueOf('S'), Items.stick });

		GameRegistry.addRecipe(new ItemStack(quartz_helmet, 1),
				new Object[] { "OOO", "O O", Character.valueOf('O'), Items.quartz });
		GameRegistry.addRecipe(new ItemStack(quartz_chestplate, 1),
				new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Items.quartz });
		GameRegistry.addRecipe(new ItemStack(quartz_leggings, 1),
				new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Items.quartz });
		GameRegistry.addRecipe(new ItemStack(quartz_boots, 1),
				new Object[] { "O O", "O O", Character.valueOf('O'), Items.quartz });
	}

	public void registerRenderers() {
		// blank since we don't do anything on the server
	}

}
