 package armorplus;
 
 import net.minecraft.item.ItemPickaxe;
 
 public class ItemQuartzPickaxe extends ItemPickaxe
 {
	 public ItemQuartzPickaxe(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
   
 }
