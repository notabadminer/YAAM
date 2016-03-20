package yaam.items;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemYAAMArmor extends ItemArmor {
	private String textureName;
	private String material;

	public ItemYAAMArmor(String unlocalizedName, ArmorMaterial material, String textureName, EntityEquipmentSlot type) {
		super(material, 0, type);
		this.material = material.toString();
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return this.material.equals("obsidian") && repair.getItem().equals(Item.getItemFromBlock(Blocks.obsidian))
				|| this.material.equals("quartz") && repair.getItem().equals(Items.quartz)
				|| this.material.equals("emerald") && repair.getItem().equals(Items.emerald)
				|| this.material.equals("lapis") && repair.getItem().equals(Items.dye) && repair.getItemDamage() == 4;
	}
}