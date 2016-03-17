package yaam.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemLapisHoe extends ItemHoe {
	public ItemLapisHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(Items.dye, 1, 4), repair, false))
			return true;
		return super.getIsRepairable(toRepair, repair);
	}
}