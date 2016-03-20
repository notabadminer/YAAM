package yaam.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import yaam.YAAM;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		// obsidian
		mesher.register(obsidian_sword, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_sword.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_pickaxe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_pickaxe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_axe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_axe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_shovel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_shovel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_hoe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_hoe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_paxel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_helmet, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_helmet.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_chestplate, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_chestplate.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_leggings, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_leggings.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(obsidian_boots, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + obsidian_boots.getUnlocalizedName().substring(5), "inventory"));
		// quartz
		mesher.register(quartz_sword, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_sword.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_pickaxe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_pickaxe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_axe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_axe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_shovel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_shovel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_hoe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_hoe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_paxel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_helmet, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_helmet.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_chestplate, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_chestplate.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_leggings, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_leggings.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(quartz_boots, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + quartz_boots.getUnlocalizedName().substring(5), "inventory"));
		// emerald
		mesher.register(emerald_sword, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_sword.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_pickaxe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_pickaxe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_axe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_axe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_shovel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_shovel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_hoe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_hoe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_paxel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_helmet, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_helmet.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_chestplate, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_chestplate.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_leggings, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_leggings.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(emerald_boots, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + emerald_boots.getUnlocalizedName().substring(5), "inventory"));
		// lapis
		mesher.register(lapis_sword, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_sword.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_pickaxe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_pickaxe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_axe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_axe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_shovel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_shovel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_hoe, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_hoe.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_paxel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_helmet, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_helmet.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_chestplate, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_chestplate.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_leggings, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_leggings.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(lapis_boots, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + lapis_boots.getUnlocalizedName().substring(5), "inventory"));
		// native material paxels
		mesher.register(wood_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + wood_paxel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(stone_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + stone_paxel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(iron_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + iron_paxel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(gold_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + gold_paxel.getUnlocalizedName().substring(5), "inventory"));
		mesher.register(diamond_paxel, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(
				YAAM.MODID + ":" + diamond_paxel.getUnlocalizedName().substring(5), "inventory"));
	}
}
