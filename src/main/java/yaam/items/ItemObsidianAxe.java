package yaam.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemObsidianAxe extends ItemAxe {
	public ItemObsidianAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(Blocks.obsidian), repair, false))
			return true;
		return super.getIsRepairable(toRepair, repair);
	}
}
