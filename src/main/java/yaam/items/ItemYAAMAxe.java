package yaam.items;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemYAAMAxe extends ItemTool {
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] { Blocks.planks, Blocks.bookshelf,
			Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block,
			Blocks.ladder, Blocks.wooden_button, Blocks.wooden_pressure_plate });

	public ItemYAAMAxe(String unlocalizedName, ToolMaterial material, Float attackSpeed) {
		super(material, EFFECTIVE_ON);
		this.setUnlocalizedName(unlocalizedName);
		this.damageVsEntity = 5.0F + material.getDamageVsEntity();
		this.attackSpeed = attackSpeed;
	}

	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.wood && material != Material.plants && material != Material.vine
				? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
	}
}
