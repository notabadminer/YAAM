 package armorplus;
 
 import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
 
 public class ItemObsidianAxe extends ItemAxe
 {
	 public ItemObsidianAxe(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
   
 }
