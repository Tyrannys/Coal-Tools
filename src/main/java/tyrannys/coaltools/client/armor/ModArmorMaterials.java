package tyrannys.coaltools.client.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import tyrannys.coaltools.CoalTools;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial{

    COAL("coal", 4, new int[]{1, 2, 3, 1}, 10, SoundEvents.ARMOR_EQUIP_IRON, 0F, 0F, () -> Ingredient.of(Items.COAL)),
    FIREY("firey", 14, new int[]{2, 5, 6, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 0F, 0F, () -> Ingredient.of(Items.COAL)),
    BLAZE("blaze", 32, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(Items.BLAZE_ROD)),
    NETHERITE_BLAZE("netherite_blaze", 36, new int[]{3, 6, 8, 3}, 22, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(Items.NETHERITE_INGOT));


    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String name, int durabilityMult, int[] slotProt, int enchant, SoundEvent sound, float toughness, float knockBack, Supplier<Ingredient> repairIng) {
        this.name = name;
        this.durabilityMultiplier = durabilityMult;
        this.slotProtections = slotProt;
        this.enchantmentValue = enchant;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockBack;
        this.repairIngredient = new LazyLoadedValue<>(repairIng);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return CoalTools.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
