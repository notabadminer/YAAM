package yaam.items;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemIronPaxel extends ItemPickaxe {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] { Blocks.activator_rail, Blocks.coal_ore,
			Blocks.cobblestone, Blocks.detector_rail, Blocks.diamond_block, Blocks.diamond_ore,
			Blocks.double_stone_slab, Blocks.golden_rail, Blocks.gold_block, Blocks.gold_ore, Blocks.ice,
			Blocks.iron_block, Blocks.iron_ore, Blocks.lapis_block, Blocks.lapis_ore, Blocks.lit_redstone_ore,
			Blocks.mossy_cobblestone, Blocks.netherrack, Blocks.packed_ice, Blocks.rail, Blocks.redstone_ore,
			Blocks.sandstone, Blocks.red_sandstone, Blocks.stone, Blocks.stone_slab, Blocks.clay, Blocks.dirt,
			Blocks.farmland, Blocks.grass, Blocks.gravel, Blocks.mycelium, Blocks.sand, Blocks.snow, Blocks.snow_layer,
			Blocks.soul_sand, Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin,
			Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder });

	public ItemIronPaxel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "axe", "spade");
	}

	@Override
	public float getStrVsBlock(ItemStack stack, Block block) {
		if (block.getMaterial() == Material.wood || block.getMaterial() == Material.vine
				|| block.getMaterial() == Material.plants)
			return this.efficiencyOnProperMaterial;
		return this.EFFECTIVE_ON.contains(block) ? this.efficiencyOnProperMaterial : 1.0F;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(Items.iron_ingot), repair, false))
			return true;
		return super.getIsRepairable(toRepair, repair);
	}
}
