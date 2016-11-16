package yaam.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import yaam.YAAM;

public class ItemYAAMHoe extends ItemHoe {
	public ItemYAAMHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}

}
