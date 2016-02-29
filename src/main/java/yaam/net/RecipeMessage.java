package yaam.net;

import java.util.Iterator;
import java.util.List;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import yaam.YAAM;

public class RecipeMessage implements IMessage, IMessageHandler<RecipeMessage, IMessage> {
	private boolean obsidianEnabled, quartzEnabled, emeraldEnabled, lapisEnabled, nativePaxelsEnabled, smeltingEnabled;

	public RecipeMessage() {
		this.obsidianEnabled = YAAM.obsidianEnabled;
		this.quartzEnabled = YAAM.quartzEnabled;
		this.emeraldEnabled = YAAM.emeraldEnabled;
		this.lapisEnabled = YAAM.lapisEnabled;
		this.nativePaxelsEnabled = YAAM.nativePaxelsEnabled;
		this.smeltingEnabled = YAAM.smeltingEnabled;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.obsidianEnabled = buf.readBoolean();
		this.quartzEnabled = buf.readBoolean();
		this.emeraldEnabled = buf.readBoolean();
		this.lapisEnabled = buf.readBoolean();
		this.nativePaxelsEnabled = buf.readBoolean();
		this.smeltingEnabled = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(obsidianEnabled);
		buf.writeBoolean(quartzEnabled);
		buf.writeBoolean(emeraldEnabled);
		buf.writeBoolean(lapisEnabled);
		buf.writeBoolean(nativePaxelsEnabled);
		buf.writeBoolean(smeltingEnabled);
	}

	@Override
	public IMessage onMessage(final RecipeMessage message, final MessageContext ctx) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				processMessage(message, ctx);
			}
		};
		if (ctx.side == Side.CLIENT) {
			Minecraft.getMinecraft().addScheduledTask(task);
		} else if (ctx.side == Side.SERVER) {
			EntityPlayerMP playerEntity = ctx.getServerHandler().playerEntity;
			if (playerEntity == null) {
				FMLLog.warning("onMessage-server: Player is null");
				return null;
			}
			playerEntity.getServerForPlayer().addScheduledTask(task);
		}
		return null;
	}

	private void processMessage(RecipeMessage message, final MessageContext ctx) {
		if (!message.obsidianEnabled) {
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_sword);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_pickaxe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_axe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_shovel);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_hoe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_helmet);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_chestplate);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_leggings);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_boots);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.obsidian_paxel);
		}
		if (!message.quartzEnabled) {
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_sword);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_pickaxe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_axe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_shovel);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_hoe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_helmet);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_chestplate);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_leggings);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_boots);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.quartz_paxel);
		}
		if (!message.emeraldEnabled) {
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_sword);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_pickaxe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_axe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_shovel);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_hoe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_helmet);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_chestplate);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_leggings);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_boots);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.emerald_paxel);
		}
		if (!message.lapisEnabled) {
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_sword);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_pickaxe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_axe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_shovel);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_hoe);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_helmet);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_chestplate);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_leggings);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_boots);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.lapis_paxel);
		}
		if (!message.nativePaxelsEnabled) {
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.wood_paxel);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.stone_paxel);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.iron_paxel);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.gold_paxel);
			CraftingManager.getInstance().getRecipeList().remove(YAAM.proxy.diamond_paxel);
		}
		if (!message.smeltingEnabled) {
			// iron
			FurnaceRecipes.instance().getSmeltingList().remove(Items.iron_hoe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.iron_shovel);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.iron_axe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.iron_pickaxe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.iron_boots);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.iron_leggings);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.iron_chestplate);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.iron_helmet);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.iron_paxel);
			// gold
			FurnaceRecipes.instance().getSmeltingList().remove(Items.golden_hoe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.golden_shovel);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.golden_axe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.golden_pickaxe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.golden_boots);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.golden_leggings);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.golden_chestplate);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.golden_helmet);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.gold_paxel);
			// diamond
			FurnaceRecipes.instance().getSmeltingList().remove(Items.diamond_hoe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.diamond_shovel);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.diamond_axe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.diamond_pickaxe);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.diamond_boots);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.diamond_leggings);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.diamond_chestplate);
			FurnaceRecipes.instance().getSmeltingList().remove(Items.diamond_helmet);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.diamond_paxel);
			// obsidian
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_hoe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_shovel);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_axe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_pickaxe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_boots);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_leggings);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_chestplate);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_helmet);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.obsidian_paxel);
			// emerald
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_hoe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_shovel);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_axe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_pickaxe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_boots);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_leggings);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_chestplate);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_helmet);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.emerald_paxel);
			// quartz
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_hoe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_shovel);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_axe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_pickaxe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_boots);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_leggings);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_chestplate);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_helmet);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.quartz_paxel);
			// lapis
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_hoe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_shovel);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_axe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_pickaxe);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_boots);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_leggings);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_chestplate);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_helmet);
			FurnaceRecipes.instance().getSmeltingList().remove(YAAM.proxy.lapis_paxel);
		}

	}
}
