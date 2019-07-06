package notabadminer.yaam.items;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum YAAMArmorMaterial implements IArmorMaterial {
	OBSIDIAN("yaam:obsidian", 33, new int[] { 3, 6, 8, 3 }, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, () -> {
		return Ingredient.fromItems(Items.OBSIDIAN);
	}), QUARTZ("yaam:quartz", 33, new int[] { 3, 6, 8, 3 }, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, () -> {
		return Ingredient.fromItems(Items.QUARTZ);
	}), EMERALD("yaam:emerald", 33, new int[] { 3, 6, 8, 3 }, 26, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, () -> {
		return Ingredient.fromItems(Items.EMERALD);
	}), LAPIS("yaam:lapis", 33, new int[] { 2, 5, 6, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, () -> {
		return Ingredient.fromItems(Items.LAPIS_LAZULI);
	});

	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final LazyLoadBase<Ingredient> repairMaterial;

	private YAAMArmorMaterial(String nameIn, int p_i48533_4_, int[] p_i48533_5_, int p_i48533_6_,
			SoundEvent p_i48533_7_, float p_i48533_8_, Supplier<Ingredient> p_i48533_9_) {
		this.name = nameIn;
		this.maxDamageFactor = p_i48533_4_;
		this.damageReductionAmountArray = p_i48533_5_;
		this.enchantability = p_i48533_6_;
		this.soundEvent = p_i48533_7_;
		this.toughness = p_i48533_8_;
		this.repairMaterial = new LazyLoadBase<>(p_i48533_9_);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}
}
