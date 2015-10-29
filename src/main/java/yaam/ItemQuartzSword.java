 package armorplus;
 
 import net.minecraft.item.ItemSword;
 
 public class ItemQuartzSword extends ItemSword
 {
	 public ItemQuartzSword(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(YAAM.MODID + ":" + unlocalizedName);
	}
   
 }
