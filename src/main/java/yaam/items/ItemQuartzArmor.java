package yaam.items;

import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import yaam.YAAM;

public class ItemQuartzArmor extends ItemArmor {
	private String textureName;

	public ItemQuartzArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return YAAM.MODID + ":textures/models/armor/" + this.textureName + "_layer_" + (this.armorType == 2 ? "2" : "1")
				+ ".png";
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(Items.quartz), repair, false))
			return true;
		return super.getIsRepairable(toRepair, repair);
	}
}