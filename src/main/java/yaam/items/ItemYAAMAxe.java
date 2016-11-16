package yaam.items;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import yaam.YAAM;

public class ItemYAAMAxe extends ItemTool {
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] { Blocks.planks, Blocks.bookshelf,
			Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin });

	public ItemYAAMAxe(String unlocalizedName, ToolMaterial material, float damageVsEntity) {
		super(damageVsEntity, material, EFFECTIVE_ON);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}

	public float getStrVsBlock(ItemStack stack, Block block) {
		Material material = block.getMaterial();
		return material != Material.wood && material != Material.plants && material != Material.vine
				? super.func_150893_a(stack, block) : this.efficiencyOnProperMaterial;
	}
}
