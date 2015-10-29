package armorplus;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemObsidianArmor extends ItemArmor {
	private String textureName;

	public ItemObsidianArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return YAAM.MODID + ":textures/models/armor/" + this.textureName + "_layer_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}