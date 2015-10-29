 package armorplus;
 
 import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
 
 public class ItemObsidianShovel extends ItemSpade
 {
	 public ItemObsidianShovel(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
   
 }
