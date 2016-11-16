package yaam.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import yaam.YAAM;

public class ItemYAAMPickaxe extends ItemPickaxe {
	public ItemYAAMPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
}
