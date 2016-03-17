package yaam.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemEmeraldSword extends ItemSword {
	public ItemEmeraldSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(Items.emerald), repair, false))
			return true;
		return super.getIsRepairable(toRepair, repair);
	}
}