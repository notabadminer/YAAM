 package armorplus;
 
 import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
 
 public class ItemQuartzAxe extends ItemAxe
 {
	 public ItemQuartzAxe(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
   
 }
