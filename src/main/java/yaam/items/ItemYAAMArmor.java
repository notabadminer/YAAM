package yaam.items;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import yaam.YAAM;

public class ItemYAAMArmor extends ItemArmor {
	private String armorTextureType;
	private String material;

	public ItemYAAMArmor(String unlocalizedName, ArmorMaterial material, int type) {
		super(material, 0, type);
		this.material = material.toString();
		this.setUnlocalizedName(unlocalizedName);
		this.armorTextureType = unlocalizedName.split("_")[0];
		this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}

	/**
	 * Return whether this item is reparable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return this.material.equals("obsidian") && repair.getItem().equals(Item.getItemFromBlock(Blocks.obsidian))
				|| this.material.equals("quartz") && repair.getItem().equals(Items.quartz)
				|| this.material.equals("emerald") && repair.getItem().equals(Items.emerald)
				|| this.material.equals("lapis") && repair.getItem().equals(Items.dye) && repair.getItemDamage() == 4;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return YAAM.MODID + ":textures/models/armor/" + armorTextureType + "_layer_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}