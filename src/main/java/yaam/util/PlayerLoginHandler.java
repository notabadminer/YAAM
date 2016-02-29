package yaam.util;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import yaam.YAAM;
import yaam.net.RecipeMessage;

public class PlayerLoginHandler {

	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

		MinecraftServer server = MinecraftServer.getServer();
		if (!server.isSinglePlayer()) {
			// we need to update client with recipes that are removed
			YAAM.snw.sendTo(new RecipeMessage(), (EntityPlayerMP) event.player);
		}
	}
}
