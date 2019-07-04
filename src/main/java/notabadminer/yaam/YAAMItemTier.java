package notabadminer.yaam;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadBase;

public enum YAAMItemTier implements IItemTier {
	EMERALD(3, 1400, 9.0F, 3.0F, 18, () -> {
		return Ingredient.fromItems(Items.EMERALD);
	}),
	LAPIS(3, 800, 9.0F, 3.0F, 22, () -> {
		return Ingredient.fromItems(Items.LAPIS_LAZULI);
	}),
	OBSIDIAN(3, 1600, 9.0F, 4.0F, 16, () -> {
		return Ingredient.fromItems(Items.OBSIDIAN);
	}),
	QUARTZ(3, 1600, 9.0F, 4.0F, 16, () -> {
		return Ingredient.fromItems(Items.QUARTZ);
	}),
	PAXELWOOD(0, 177, 2.0F, 0.0F, 15, () -> {
		return Ingredient.fromTag(ItemTags.PLANKS);
	}),
	PAXELSTONE(1, 393, 4.0F, 1.0F, 5, () -> {
		return Ingredient.fromItems(Items.COBBLESTONE);
	}),
	PAXELIRON(2, 750, 6.0F, 2.0F, 14, () -> {
		return Ingredient.fromItems(Items.IRON_INGOT);
	}),
	PAXELGOLD(0, 96, 12.0F, 0.0F, 22, () -> {
		return Ingredient.fromItems(Items.GOLD_INGOT);
	}),
	PAXELDIAMOND(3, 4683, 8.0F, 3.0F, 10, () -> {
		return Ingredient.fromItems(Items.DIAMOND);
	}),
	PAXELEMERALD(3, 4200, 9.0F, 3.0F, 18, () -> {
		return Ingredient.fromItems(Items.EMERALD);
	}),
	PAXELLAPIS(3, 2400, 9.0F, 3.0F, 22, () -> {
		return Ingredient.fromItems(Items.LAPIS_LAZULI);
	}),
	PAXELOBSIDIAN(3, 3600, 9.0F, 4.0F, 16, () -> {
		return Ingredient.fromItems(Items.QUARTZ);
	}),
	PAXELQUARTZ(3, 4200, 9.0F, 3.0F, 18, () -> {
		return Ingredient.fromItems(Items.QUARTZ);
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyLoadBase<Ingredient> repairMaterial;

	private YAAMItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn,
			int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
		this.harvestLevel = harvestLevelIn;
		this.maxUses = maxUsesIn;
		this.efficiency = efficiencyIn;
		this.attackDamage = attackDamageIn;
		this.enchantability = enchantabilityIn;
		this.repairMaterial = new LazyLoadBase<>(repairMaterialIn);
	}

	public int getMaxUses() {
		return this.maxUses;
	}

	public float getEfficiency() {
		return this.efficiency;
	}

	public float getAttackDamage() {
		return this.attackDamage;
	}

	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
}
