package armorplus;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = YAAM.MODID, name = YAAM.NAME, version = YAAM.VERSION, acceptedMinecraftVersions = "@MC_VERSION@")
public class YAAM {
	public static final String MODID = "yaam";
	public static final String NAME = "YAAM";
	public static final String VERSION = "@VERSION@";

	// Tool materials
	static Item.ToolMaterial enumToolMaterialObsidian = EnumHelper.addToolMaterial("Obsidian", 3, 1200, 9.0F, 3.0F, 16);
	static Item.ToolMaterial enumToolMaterialQuartz = EnumHelper.addToolMaterial("Quartz", 3, 1400, 9.0F, 3.0F, 18);

	// Armor materials
	static ArmorMaterial enumArmorMaterialObsidian = EnumHelper.addArmorMaterial("Obsidian", 28,
			new int[] { 3, 8, 6, 3 }, 20);
	static ArmorMaterial enumArmorMaterialQuartz = EnumHelper.addArmorMaterial("Quartz", 30,
			new int[] { 3, 8, 6, 3 }, 22);

	public static Item obsidian_sword;
	public static Item obsidian_pickaxe;
	public static Item obsidian_axe;
	public static Item obsidian_shovel;
	public static Item obsidian_hoe;
	public static Item obsidian_helmet;
	public static Item obsidian_chestplate;
	public static Item obsidian_leggings;
	public static Item obsidian_boots;
	public static Item quartz_sword;
	public static Item quartz_pickaxe;
	public static Item quartz_axe;
	public static Item quartz_shovel;
	public static Item quartz_hoe;
	public static Item quartz_helmet;
	public static Item quartz_chestplate;
	public static Item quartz_leggings;
	public static Item quartz_boots;


	@Mod.EventHandler
	public void preInit(FMLInitializationEvent e) {

		GameRegistry.registerItem(obsidian_sword = new ItemObsidianSword("obsidian_sword", enumToolMaterialObsidian),
				"obsidiansword");
		GameRegistry.registerItem(
				obsidian_pickaxe = new ItemObsidianPickaxe("obsidian_pickaxe", enumToolMaterialObsidian),
				"obsidianpickaxe");
		GameRegistry.registerItem(obsidian_axe = new ItemObsidianAxe("obsidian_axe", enumToolMaterialObsidian),
				"obsidianaxe");
		GameRegistry.registerItem(obsidian_shovel = new ItemObsidianShovel("obsidian_shovel", enumToolMaterialObsidian),
				"obsidianshovel");
		GameRegistry.registerItem(obsidian_hoe = new ItemObsidianHoe("obsidian_hoe", enumToolMaterialObsidian),
				"obsidianhoe");

		GameRegistry.registerItem(
				obsidian_helmet = new ItemObsidianArmor("obsidian_helmet", enumArmorMaterialObsidian, "obsidian", 0),
				"obsidianhelmet"); // 0 for helmet
		GameRegistry.registerItem(obsidian_chestplate = new ItemObsidianArmor("obsidian_chestplate",
				enumArmorMaterialObsidian, "obsidian", 1), "obsidianchestplate"); // 1 for chestplate
		GameRegistry.registerItem(obsidian_leggings = new ItemObsidianArmor("obsidian_leggings",
				enumArmorMaterialObsidian, "obsidian", 2), "obsidianleggings"); // 2 for leggings
		GameRegistry.registerItem(
				obsidian_boots = new ItemObsidianArmor("obsidian_boots", enumArmorMaterialObsidian, "obsidian", 3),
				"obsidianboots"); // 3 for boots
		
		GameRegistry.registerItem(quartz_sword = new ItemQuartzSword("quartz_sword", enumToolMaterialQuartz),
				"quartzsword");
		GameRegistry.registerItem(
				quartz_pickaxe = new ItemQuartzPickaxe("quartz_pickaxe", enumToolMaterialQuartz),
				"quartzpickaxe");
		GameRegistry.registerItem(quartz_axe = new ItemQuartzAxe("quartz_axe", enumToolMaterialQuartz),
				"quartzaxe");
		GameRegistry.registerItem(quartz_shovel = new ItemQuartzShovel("quartz_shovel", enumToolMaterialQuartz),
				"quartzshovel");
		GameRegistry.registerItem(quartz_hoe = new ItemQuartzHoe("quartz_hoe", enumToolMaterialQuartz),
				"quartzhoe");

		GameRegistry.registerItem(
				quartz_helmet = new ItemQuartzArmor("quartz_helmet", enumArmorMaterialQuartz, "quartz", 0),
				"quartzhelmet"); // 0 for helmet
		GameRegistry.registerItem(quartz_chestplate = new ItemQuartzArmor("quartz_chestplate",
				enumArmorMaterialQuartz, "quartz", 1), "quartzchestplate"); // 1 for chestplate
		GameRegistry.registerItem(quartz_leggings = new ItemQuartzArmor("quartz_leggings",
				enumArmorMaterialQuartz, "quartz", 2), "quartzleggings"); // 2 for leggings
		GameRegistry.registerItem(
				quartz_boots = new ItemQuartzArmor("quartz_boots", enumArmorMaterialQuartz, "quartz", 3),
				"quartzboots"); // 3 for boots

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

		GameRegistry.addRecipe(new ItemStack(quartz_helmet, 1),
				new Object[] { "OOO", "O O", Character.valueOf('O'), Items.quartz });
		GameRegistry.addRecipe(new ItemStack(quartz_chestplate, 1),
				new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Items.quartz });
		GameRegistry.addRecipe(new ItemStack(quartz_leggings, 1),
				new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Items.quartz });
		GameRegistry.addRecipe(new ItemStack(quartz_boots, 1),
				new Object[] { "O O", "O O", Character.valueOf('O'), Items.quartz });
	}
}