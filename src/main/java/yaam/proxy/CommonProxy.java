package yaam.proxy;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import yaam.YAAM;
import yaam.items.ItemYAAMArmor;
import yaam.items.ItemYAAMAxe;
import yaam.items.ItemYAAMHoe;
import yaam.items.ItemYAAMPaxel;
import yaam.items.ItemYAAMPickaxe;
import yaam.items.ItemYAAMShovel;
import yaam.items.ItemYAAMSword;

public class CommonProxy {

	public static Item obsidian_sword, obsidian_pickaxe, obsidian_axe, obsidian_shovel, obsidian_hoe, obsidian_helmet,
			obsidian_chestplate, obsidian_leggings, obsidian_boots, obsidian_paxel, quartz_sword, quartz_pickaxe,
			quartz_axe, quartz_shovel, quartz_hoe, quartz_helmet, quartz_chestplate, quartz_leggings, quartz_boots,
			quartz_paxel, emerald_sword, emerald_pickaxe, emerald_axe, emerald_shovel, emerald_hoe, emerald_helmet,
			emerald_chestplate, emerald_leggings, emerald_boots, emerald_paxel, lapis_sword, lapis_pickaxe, lapis_axe,
			lapis_shovel, lapis_hoe, lapis_helmet, lapis_chestplate, lapis_leggings, lapis_boots, lapis_paxel,
			wood_paxel, stone_paxel, iron_paxel, gold_paxel, diamond_paxel;

	// Tool materials
	static Item.ToolMaterial toolMaterialObsidian = EnumHelper.addToolMaterial("obsidian", 3, 1200, 9.0F, 4.0F, 16)
			.setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	static Item.ToolMaterial toolMaterialQuartz = EnumHelper.addToolMaterial("quartz", 3, 1400, 9.0F, 3.0F, 18)
			.setRepairItem(new ItemStack(Items.QUARTZ));
	static Item.ToolMaterial toolMaterialEmerald = EnumHelper.addToolMaterial("emerald", 3, 1400, 9.0F, 3.0F, 18)
			.setRepairItem(new ItemStack(Items.EMERALD));
	static Item.ToolMaterial toolMaterialLapis = EnumHelper.addToolMaterial("lapis", 3, 800, 9.0F, 3.0F, 22)
			.setRepairItem(new ItemStack(Items.DYE, 1, 4));
	static Item.ToolMaterial paxelMaterialWood = EnumHelper.addToolMaterial("wood", 0, 177, 2.0F, 0.0F, 15);
	static Item.ToolMaterial paxelMaterialStone = EnumHelper.addToolMaterial("stone", 1, 393, 4.0F, 1.0F, 5)
			.setRepairItem(new ItemStack(Blocks.COBBLESTONE));
	static Item.ToolMaterial paxelMaterialIron = EnumHelper.addToolMaterial("iron", 2, 750, 6.0F, 2.0F, 14)
			.setRepairItem(new ItemStack(Items.IRON_INGOT));
	static Item.ToolMaterial paxelMaterialGold = EnumHelper.addToolMaterial("gold", 0, 96, 12.0F, 0.0F, 22)
			.setRepairItem(new ItemStack(Items.GOLD_INGOT));
	static Item.ToolMaterial paxelMaterialDiamond = EnumHelper.addToolMaterial("diamond", 3, 4683, 8.0F, 3.0F, 10)
			.setRepairItem(new ItemStack(Items.DIAMOND));
	static Item.ToolMaterial paxelMaterialEmerald = EnumHelper.addToolMaterial("emerald", 3, 4200, 9.0F, 3.0F, 18)
			.setRepairItem(new ItemStack(Items.EMERALD));
	static Item.ToolMaterial paxelMaterialQuartz = EnumHelper.addToolMaterial("quartz", 3, 4200, 9.0F, 3.0F, 18)
			.setRepairItem(new ItemStack(Items.QUARTZ));
	static Item.ToolMaterial paxelMaterialObsidian = EnumHelper.addToolMaterial("obsidian", 3, 3600, 9.0F, 4.0F, 16)
			.setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	static Item.ToolMaterial paxelMaterialLapis = EnumHelper.addToolMaterial("lapis", 3, 2400, 9.0F, 3.0F, 22)
			.setRepairItem(new ItemStack(Items.DYE, 1, 4));

	// Armor materials
	static ArmorMaterial armorMaterialObsidian = EnumHelper.addArmorMaterial("obsidian", "yaam:obsidian", 28,
			new int[] { 3, 6, 8, 3 }, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
	static ArmorMaterial armorMaterialQuartz = EnumHelper.addArmorMaterial("quartz", "yaam:quartz", 30,
			new int[] { 3, 6, 8, 3 }, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
	static ArmorMaterial armorMaterialEmerald = EnumHelper.addArmorMaterial("emerald", "yaam:emerald", 33,
			new int[] { 3, 6, 8, 3 }, 26, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
	static ArmorMaterial armorMaterialLapis = EnumHelper.addArmorMaterial("lapis", "yaam:lapis", 9,
			new int[] { 2, 5, 6, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);

	public void registerBlocks() {
	}

	public void registerItems() {
		// obsidian
		GameRegistry.registerItem(obsidian_sword = new ItemYAAMSword("obsidian_sword", toolMaterialObsidian),
				"obsidian_sword");
		GameRegistry.registerItem(obsidian_pickaxe = new ItemYAAMPickaxe("obsidian_pickaxe", toolMaterialObsidian),
				"obsidian_pickaxe");
		GameRegistry.registerItem(obsidian_axe = new ItemYAAMAxe("obsidian_axe", toolMaterialObsidian, -3.0F),
				"obsidian_axe");
		GameRegistry.registerItem(obsidian_shovel = new ItemYAAMShovel("obsidian_shovel", toolMaterialObsidian),
				"obsidian_shovel");
		GameRegistry.registerItem(obsidian_hoe = new ItemYAAMHoe("obsidian_hoe", toolMaterialObsidian), "obsidian_hoe");
		GameRegistry.registerItem(obsidian_paxel = new ItemYAAMPaxel("obsidian_paxel", paxelMaterialObsidian),
				"obsidian_paxel");
		GameRegistry.registerItem(obsidian_helmet = new ItemYAAMArmor("obsidian_helmet", armorMaterialObsidian,
				"obsidian", EntityEquipmentSlot.HEAD), "obsidian_helmet");
		GameRegistry.registerItem(obsidian_chestplate = new ItemYAAMArmor("obsidian_chestplate", armorMaterialObsidian,
				"obsidian", EntityEquipmentSlot.CHEST), "obsidian_chestplate");
		GameRegistry.registerItem(obsidian_leggings = new ItemYAAMArmor("obsidian_leggings", armorMaterialObsidian,
				"obsidian", EntityEquipmentSlot.LEGS), "obsidian_leggings");
		GameRegistry.registerItem(obsidian_boots = new ItemYAAMArmor("obsidian_boots", armorMaterialObsidian,
				"obsidian", EntityEquipmentSlot.FEET), "obsidian_boots");
		// quartz
		GameRegistry.registerItem(quartz_sword = new ItemYAAMSword("quartz_sword", toolMaterialQuartz), "quartz_sword");
		GameRegistry.registerItem(quartz_pickaxe = new ItemYAAMPickaxe("quartz_pickaxe", toolMaterialQuartz),
				"quartz_pickaxe");
		GameRegistry.registerItem(quartz_axe = new ItemYAAMAxe("quartz_axe", toolMaterialQuartz, -3.0F), "quartz_axe");
		GameRegistry.registerItem(quartz_shovel = new ItemYAAMShovel("quartz_shovel", toolMaterialQuartz),
				"quartz_shovel");
		GameRegistry.registerItem(quartz_hoe = new ItemYAAMHoe("quartz_hoe", toolMaterialQuartz), "quartz_hoe");
		GameRegistry.registerItem(quartz_paxel = new ItemYAAMPaxel("quartz_paxel", paxelMaterialQuartz),
				"quartz_paxel");
		GameRegistry.registerItem(quartz_helmet = new ItemYAAMArmor("quartz_helmet", armorMaterialQuartz, "quartz",
				EntityEquipmentSlot.HEAD), "quartz_helmet");
		GameRegistry.registerItem(quartz_chestplate = new ItemYAAMArmor("quartz_chestplate", armorMaterialQuartz,
				"quartz", EntityEquipmentSlot.CHEST), "quartz_chestplate");
		GameRegistry.registerItem(quartz_leggings = new ItemYAAMArmor("quartz_leggings", armorMaterialQuartz, "quartz",
				EntityEquipmentSlot.LEGS), "quartz_leggings");
		GameRegistry.registerItem(quartz_boots = new ItemYAAMArmor("quartz_boots", armorMaterialQuartz, "quartz",
				EntityEquipmentSlot.FEET), "quartz_boots");
		// emerald
		GameRegistry.registerItem(emerald_sword = new ItemYAAMSword("emerald_sword", toolMaterialEmerald),
				"emerald_sword");
		GameRegistry.registerItem(emerald_pickaxe = new ItemYAAMPickaxe("emerald_pickaxe", toolMaterialEmerald),
				"emerald_pickaxe");
		GameRegistry.registerItem(emerald_axe = new ItemYAAMAxe("emerald_axe", toolMaterialEmerald, -3.0F),
				"emerald_axe");
		GameRegistry.registerItem(emerald_shovel = new ItemYAAMShovel("emerald_shovel", toolMaterialEmerald),
				"emerald_shovel");
		GameRegistry.registerItem(emerald_hoe = new ItemYAAMHoe("emerald_hoe", toolMaterialEmerald), "emerald_hoe");
		GameRegistry.registerItem(emerald_paxel = new ItemYAAMPaxel("emerald_paxel", paxelMaterialEmerald),
				"emerald_paxel");
		GameRegistry.registerItem(emerald_helmet = new ItemYAAMArmor("emerald_helmet", armorMaterialEmerald, "emerald",
				EntityEquipmentSlot.HEAD), "emerald_helmet");
		GameRegistry.registerItem(emerald_chestplate = new ItemYAAMArmor("emerald_chestplate", armorMaterialEmerald,
				"emerald", EntityEquipmentSlot.CHEST), "emerald_chestplate");
		GameRegistry.registerItem(emerald_leggings = new ItemYAAMArmor("emerald_leggings", armorMaterialEmerald,
				"emerald", EntityEquipmentSlot.LEGS), "emerald_leggings");
		GameRegistry.registerItem(emerald_boots = new ItemYAAMArmor("emerald_boots", armorMaterialEmerald, "emerald",
				EntityEquipmentSlot.FEET), "emerald_boots");
		// lapis
		GameRegistry.registerItem(lapis_sword = new ItemYAAMSword("lapis_sword", toolMaterialLapis), "lapis_sword");
		GameRegistry.registerItem(lapis_pickaxe = new ItemYAAMPickaxe("lapis_pickaxe", toolMaterialLapis),
				"lapis_pickaxe");
		GameRegistry.registerItem(lapis_axe = new ItemYAAMAxe("lapis_axe", toolMaterialLapis, -3.0F), "lapis_axe");
		GameRegistry.registerItem(lapis_shovel = new ItemYAAMShovel("lapis_shovel", toolMaterialLapis), "lapis_shovel");
		GameRegistry.registerItem(lapis_hoe = new ItemYAAMHoe("lapis_hoe", toolMaterialLapis), "lapis_hoe");
		GameRegistry.registerItem(lapis_paxel = new ItemYAAMPaxel("lapis_paxel", paxelMaterialLapis), "lapis_paxel");
		GameRegistry.registerItem(
				lapis_helmet = new ItemYAAMArmor("lapis_helmet", armorMaterialLapis, "lapis", EntityEquipmentSlot.HEAD),
				"lapis_helmet");
		GameRegistry.registerItem(lapis_chestplate = new ItemYAAMArmor("lapis_chestplate", armorMaterialLapis, "lapis",
				EntityEquipmentSlot.CHEST), "lapis_chestplate");
		GameRegistry.registerItem(lapis_leggings = new ItemYAAMArmor("lapis_leggings", armorMaterialLapis, "lapis",
				EntityEquipmentSlot.LEGS), "lapis_leggings");
		GameRegistry.registerItem(
				lapis_boots = new ItemYAAMArmor("lapis_boots", armorMaterialLapis, "lapis", EntityEquipmentSlot.FEET),
				"lapis_boots");
		// native material paxels
		GameRegistry.registerItem(wood_paxel = new ItemYAAMPaxel("wood_paxel", paxelMaterialWood), "wood_paxel");
		GameRegistry.registerItem(stone_paxel = new ItemYAAMPaxel("stone_paxel", paxelMaterialStone), "stone_paxel");
		GameRegistry.registerItem(iron_paxel = new ItemYAAMPaxel("iron_paxel", paxelMaterialIron), "iron_paxel");
		GameRegistry.registerItem(gold_paxel = new ItemYAAMPaxel("gold_paxel", paxelMaterialGold), "gold_paxel");
		GameRegistry.registerItem(diamond_paxel = new ItemYAAMPaxel("diamond_paxel", paxelMaterialDiamond),
				"diamond_paxel");
	}

	public void registerRecipes() {
		// obsidian
		if (YAAM.obsidianEnabled) {
			GameRegistry.addRecipe(new ItemStack(obsidian_axe, 1), new Object[] { "OO ", "OS ", " S ",
					Character.valueOf('O'), Blocks.OBSIDIAN, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(obsidian_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
					Character.valueOf('O'), Blocks.OBSIDIAN, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(obsidian_hoe, 1), new Object[] { "OO ", " S ", " S ",
					Character.valueOf('O'), Blocks.OBSIDIAN, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(obsidian_shovel, 1), new Object[] { " O ", " S ", " S ",
					Character.valueOf('O'), Blocks.OBSIDIAN, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(obsidian_sword, 1), new Object[] { " O ", " O ", " S ",
					Character.valueOf('O'), Blocks.OBSIDIAN, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(obsidian_paxel, 1),
					new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), obsidian_axe, Character.valueOf('P'),
							obsidian_pickaxe, Character.valueOf('L'), obsidian_shovel, Character.valueOf('S'),
							Items.STICK });
			GameRegistry.addRecipe(new ItemStack(obsidian_helmet, 1),
					new Object[] { "OOO", "O O", Character.valueOf('O'), Blocks.OBSIDIAN });
			GameRegistry.addRecipe(new ItemStack(obsidian_chestplate, 1),
					new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Blocks.OBSIDIAN });
			GameRegistry.addRecipe(new ItemStack(obsidian_leggings, 1),
					new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Blocks.OBSIDIAN });
			GameRegistry.addRecipe(new ItemStack(obsidian_boots, 1),
					new Object[] { "O O", "O O", Character.valueOf('O'), Blocks.OBSIDIAN });
		}

		// quartz
		if (YAAM.quartzEnabled) {
			GameRegistry.addRecipe(new ItemStack(quartz_axe, 1), new Object[] { "OO ", "OS ", " S ",
					Character.valueOf('O'), Items.QUARTZ, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(quartz_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
					Character.valueOf('O'), Items.QUARTZ, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(quartz_hoe, 1), new Object[] { "OO ", " S ", " S ",
					Character.valueOf('O'), Items.QUARTZ, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(quartz_shovel, 1), new Object[] { " O ", " S ", " S ",
					Character.valueOf('O'), Items.QUARTZ, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(quartz_sword, 1), new Object[] { " O ", " O ", " S ",
					Character.valueOf('O'), Items.QUARTZ, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(quartz_paxel, 1),
					new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), quartz_axe, Character.valueOf('P'),
							quartz_pickaxe, Character.valueOf('L'), quartz_shovel, Character.valueOf('S'),
							Items.STICK });
			GameRegistry.addRecipe(new ItemStack(quartz_helmet, 1),
					new Object[] { "OOO", "O O", Character.valueOf('O'), Items.QUARTZ });
			GameRegistry.addRecipe(new ItemStack(quartz_chestplate, 1),
					new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Items.QUARTZ });
			GameRegistry.addRecipe(new ItemStack(quartz_leggings, 1),
					new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Items.QUARTZ });
			GameRegistry.addRecipe(new ItemStack(quartz_boots, 1),
					new Object[] { "O O", "O O", Character.valueOf('O'), Items.QUARTZ });
		}

		// emerald
		if (YAAM.emeraldEnabled) {
			GameRegistry.addRecipe(new ItemStack(emerald_axe, 1), new Object[] { "OO ", "OS ", " S ",
					Character.valueOf('O'), Items.EMERALD, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(emerald_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
					Character.valueOf('O'), Items.EMERALD, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(emerald_hoe, 1), new Object[] { "OO ", " S ", " S ",
					Character.valueOf('O'), Items.EMERALD, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(emerald_shovel, 1), new Object[] { " O ", " S ", " S ",
					Character.valueOf('O'), Items.EMERALD, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(emerald_sword, 1), new Object[] { " O ", " O ", " S ",
					Character.valueOf('O'), Items.EMERALD, Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(emerald_paxel, 1),
					new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), emerald_axe, Character.valueOf('P'),
							emerald_pickaxe, Character.valueOf('L'), emerald_shovel, Character.valueOf('S'),
							Items.STICK });
			GameRegistry.addRecipe(new ItemStack(emerald_helmet, 1),
					new Object[] { "OOO", "O O", Character.valueOf('O'), Items.EMERALD });
			GameRegistry.addRecipe(new ItemStack(emerald_chestplate, 1),
					new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), Items.EMERALD });
			GameRegistry.addRecipe(new ItemStack(emerald_leggings, 1),
					new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), Items.EMERALD });
			GameRegistry.addRecipe(new ItemStack(emerald_boots, 1),
					new Object[] { "O O", "O O", Character.valueOf('O'), Items.EMERALD });
		}

		// lapis
		if (YAAM.lapisEnabled) {
			GameRegistry.addRecipe(new ItemStack(emerald_axe, 1), new Object[] { "OO ", "OS ", " S ",
					Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4), Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(lapis_pickaxe, 1), new Object[] { "OOO", " S ", " S ",
					Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4), Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(lapis_hoe, 1), new Object[] { "OO ", " S ", " S ",
					Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4), Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(lapis_shovel, 1), new Object[] { " O ", " S ", " S ",
					Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4), Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(lapis_sword, 1), new Object[] { " O ", " O ", " S ",
					Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4), Character.valueOf('S'), Items.STICK });
			GameRegistry
					.addRecipe(new ItemStack(lapis_paxel, 1),
							new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), lapis_axe,
									Character.valueOf('P'), lapis_pickaxe, Character.valueOf('L'), lapis_shovel,
									Character.valueOf('S'), Items.STICK });
			GameRegistry.addRecipe(new ItemStack(lapis_helmet, 1),
					new Object[] { "OOO", "O O", Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(lapis_chestplate, 1),
					new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(lapis_leggings, 1),
					new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(lapis_boots, 1),
					new Object[] { "O O", "O O", Character.valueOf('O'), new ItemStack(Items.DYE, 1, 4) });

			// natives
			if (YAAM.nativePaxelsEnabled) {
				GameRegistry.addRecipe(new ItemStack(wood_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.WOODEN_AXE,
								Character.valueOf('P'), Items.WOODEN_PICKAXE, Character.valueOf('L'),
								Items.WOODEN_SHOVEL, Character.valueOf('S'), Items.STICK });
				GameRegistry.addRecipe(new ItemStack(stone_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.STONE_AXE,
								Character.valueOf('P'), Items.STONE_PICKAXE, Character.valueOf('L'), Items.STONE_SHOVEL,
								Character.valueOf('S'), Items.STICK });
				GameRegistry.addRecipe(new ItemStack(iron_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.IRON_AXE,
								Character.valueOf('P'), Items.IRON_PICKAXE, Character.valueOf('L'), Items.IRON_SHOVEL,
								Character.valueOf('S'), Items.STICK });
				GameRegistry.addRecipe(new ItemStack(gold_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.GOLDEN_AXE,
								Character.valueOf('P'), Items.GOLDEN_PICKAXE, Character.valueOf('L'),
								Items.GOLDEN_SHOVEL, Character.valueOf('S'), Items.STICK });
				GameRegistry.addRecipe(new ItemStack(diamond_paxel, 1),
						new Object[] { "PAL", " S ", " S ", Character.valueOf('A'), Items.DIAMOND_AXE,
								Character.valueOf('P'), Items.DIAMOND_PICKAXE, Character.valueOf('L'),
								Items.DIAMOND_SHOVEL, Character.valueOf('S'), Items.STICK });
			}
		}
	}

	public void registerRenderers() {
		// blank since we don't do anything on the server
	}

}
