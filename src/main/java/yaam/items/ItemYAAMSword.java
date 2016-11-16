package yaam.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import yaam.YAAM;

public class ItemYAAMSword extends ItemSword {
	public ItemYAAMSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
}
