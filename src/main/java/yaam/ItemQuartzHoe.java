 package armorplus;
 
 import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
 
 public class ItemQuartzHoe extends ItemHoe
 {
	 public ItemQuartzHoe(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
   
 }
