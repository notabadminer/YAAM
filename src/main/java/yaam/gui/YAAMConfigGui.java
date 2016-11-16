package yaam.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import yaam.YAAM;

public class YAAMConfigGui extends GuiConfig {
	public YAAMConfigGui(GuiScreen parentScreen) {
		super(parentScreen, new ConfigElement(YAAM.config.getCategory("recipes")).getChildElements(), YAAM.MODID, false,
				true, "YAAM Config Options");
	}
	
	public void onGuiClosed() {
		YAAM.config.save();
    }
}
