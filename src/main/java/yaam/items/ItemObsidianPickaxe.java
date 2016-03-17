package yaam.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemObsidianPickaxe extends ItemPickaxe {
	public ItemObsidianPickaxe(String unlocalizedName, ToolMaterial material) {
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
