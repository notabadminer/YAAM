package notabadminer.yaam.common;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class ConfigHandler {

	/*
	 * public static final ForgeConfigSpec clientSpec; public static final Client
	 * CLIENT; static { final Pair<Client, ForgeConfigSpec> specPair = new
	 * ForgeConfigSpec.Builder().configure(Client::new); clientSpec =
	 * specPair.getRight(); CLIENT = specPair.getLeft(); }
	 */


    public static final ForgeConfigSpec commonSpec;
    public static final Common COMMON;
    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonSpec = specPair.getRight();
        COMMON = specPair.getLeft();
    }

	public static class Common {
		public final ForgeConfigSpec.BooleanValue vanillaPaxels;

		Common(ForgeConfigSpec.Builder builder) {
			//builder.comment("Server configuration settings").push("server");
			
			vanillaPaxels = builder.comment("Enable crafting recipes for wood, stone, iron, gold, and diamond paxels.")
					.define("vanillaPaxels.enabled", true);
			
			//builder.pop();
		}
	}

	/*
	 * public static class Client { final ForgeConfigSpec.BooleanValue
	 * vanillaPaxels;
	 * 
	 * Client(ForgeConfigSpec.Builder builder) {
	 * 
	 * vanillaPaxels = builder.
	 * comment("Enable crafting recipes for wood, stone, iron, gold, and diamond paxels."
	 * ) .define("vanillaPaxels.enabled", true);
	 * 
	 * } }
	 */
}
