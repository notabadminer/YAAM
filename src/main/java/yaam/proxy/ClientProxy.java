package yaam.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import yaam.YAAM;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		mesher.register(obsidian_sword, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_sword.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_pickaxe, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_pickaxe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_axe, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_axe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_shovel, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_shovel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_hoe, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_hoe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_helmet, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_helmet.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_chestplate, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_chestplate.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_leggings, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_leggings.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_boots, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_boots.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_sword, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_sword.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_pickaxe, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_pickaxe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_axe, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_axe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_shovel, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_shovel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_hoe, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_hoe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_helmet, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_helmet.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_chestplate, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_chestplate.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_leggings, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_leggings.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_boots, 0, new ModelResourceLocation(
				YAAM.MODID + ":" + quartz_boots.getUnlocalizedName().substring(5), "inventory"));
	}
}
