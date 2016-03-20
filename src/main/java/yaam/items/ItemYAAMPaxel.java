package yaam.items;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemYAAMPaxel extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] { Blocks.clay, Blocks.dirt,
			Blocks.farmland, Blocks.grass, Blocks.gravel, Blocks.mycelium, Blocks.sand, Blocks.snow, Blocks.snow_layer,
			Blocks.soul_sand, Blocks.grass_path, Blocks.activator_rail, Blocks.coal_ore, Blocks.cobblestone,
			Blocks.detector_rail, Blocks.diamond_block, Blocks.diamond_ore, Blocks.double_stone_slab,
			Blocks.golden_rail, Blocks.gold_block, Blocks.gold_ore, Blocks.ice, Blocks.iron_block, Blocks.iron_ore,
			Blocks.lapis_block, Blocks.lapis_ore, Blocks.lit_redstone_ore, Blocks.mossy_cobblestone, Blocks.netherrack,
			Blocks.packed_ice, Blocks.rail, Blocks.redstone_ore, Blocks.sandstone, Blocks.red_sandstone, Blocks.stone,
			Blocks.stone_slab, Blocks.stone_button, Blocks.stone_pressure_plate, Blocks.planks, Blocks.bookshelf,
			Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block,
			Blocks.ladder, Blocks.wooden_button, Blocks.wooden_pressure_plate });

	public ItemYAAMPaxel(String unlocalizedName, ToolMaterial material) {
		super(5.0F, -2.0F, material, EFFECTIVE_ON);
		this.setUnlocalizedName(unlocalizedName);
	}

	/**
	 * Check whether this Item can harvest the given Block
	 */
	public boolean canHarvestBlock(IBlockState blockIn) {
		Block block = blockIn.getBlock();

		if (block == Blocks.obsidian) {
			return this.toolMaterial.getHarvestLevel() == 3;
		} else if (block != Blocks.diamond_block && block != Blocks.diamond_ore) {
			if (block != Blocks.emerald_ore && block != Blocks.emerald_block) {
				if (block != Blocks.gold_block && block != Blocks.gold_ore) {
					if (block != Blocks.iron_block && block != Blocks.iron_ore) {
						if (block != Blocks.lapis_block && block != Blocks.lapis_ore) {
							if (block != Blocks.redstone_ore && block != Blocks.lit_redstone_ore) {
								Material material = blockIn.getMaterial();
								return material == Material.rock ? true
										: (material == Material.iron ? true : material == Material.anvil);
							} else {
								return this.toolMaterial.getHarvestLevel() >= 2;
							}
						} else {
							return this.toolMaterial.getHarvestLevel() >= 1;
						}
					} else {
						return this.toolMaterial.getHarvestLevel() >= 1;
					}
				} else {
					return this.toolMaterial.getHarvestLevel() >= 2;
				}
			} else {
				return this.toolMaterial.getHarvestLevel() >= 2;
			}
		} else {
			return this.toolMaterial.getHarvestLevel() >= 2;
		}
	}

	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "axe", "spade");
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		return this.EFFECTIVE_ON.contains(state.getBlock()) ? this.efficiencyOnProperMaterial : 1.0F;
	}

	/**
	 * Called when a Block is right-clicked with this Item
	 */
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack)) {
			return EnumActionResult.FAIL;
		} else {
			IBlockState iblockstate = worldIn.getBlockState(pos);
			Block block = iblockstate.getBlock();

			if (facing != EnumFacing.DOWN && worldIn.getBlockState(pos.up()).getMaterial() == Material.air
					&& block == Blocks.grass) {
				IBlockState iblockstate1 = Blocks.grass_path.getDefaultState();
				worldIn.playSound(playerIn, pos, SoundEvents.item_shovel_flatten, SoundCategory.BLOCKS, 1.0F, 1.0F);

				if (!worldIn.isRemote) {
					worldIn.setBlockState(pos, iblockstate1, 11);
					stack.damageItem(1, playerIn);
				}

				return EnumActionResult.SUCCESS;
			} else {
				return EnumActionResult.PASS;
			}
		}
	}
}
