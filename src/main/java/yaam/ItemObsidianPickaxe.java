 package armorplus;
 
 import net.minecraft.item.ItemPickaxe;
 
 public class ItemObsidianPickaxe extends ItemPickaxe
 {
	 public ItemObsidianPickaxe(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
   
 }
