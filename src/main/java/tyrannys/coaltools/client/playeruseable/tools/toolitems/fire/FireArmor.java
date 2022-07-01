package tyrannys.coaltools.client.playeruseable.tools.toolitems.fire;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import tyrannys.coaltools.setup.ModEnchantments;
import tyrannys.coaltools.setup.ModItems;

import static tyrannys.coaltools.setup.ModTags.Items.FIRE_IMMUNE;
import static tyrannys.coaltools.setup.ModTags.Items.FIRE_RESISTANT;

public class FireArmor extends ArmorItem {

    public FireArmor(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }
    MobEffectInstance FIRE_RES = new MobEffectInstance(MobEffects.FIRE_RESISTANCE);

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {

        player.displayFireAnimation();

        if ((player.hasItemInSlot(EquipmentSlot.HEAD) == stack.is(ModItems.FIRE_HELM.get())) &&
                (player.hasItemInSlot(EquipmentSlot.CHEST) == stack.is(ModItems.FIRE_CHEST.get())) &&
                (player.hasItemInSlot(EquipmentSlot.LEGS) == stack.is(ModItems.FIRE_LEGS.get())) &&
                (player.hasItemInSlot(EquipmentSlot.FEET) == stack.is(ModItems.FIRE_FEET.get()))) {
            player.addEffect(FIRE_RES);
        }

        if ((player.hasItemInSlot(EquipmentSlot.HEAD) == stack.is(ModItems.BLAZE_HELM.get())) &&
                (player.hasItemInSlot(EquipmentSlot.CHEST) == stack.is(ModItems.BLAZE_CHEST.get())) &&
                (player.hasItemInSlot(EquipmentSlot.LEGS) == stack.is(ModItems.BLAZE_LEGS.get())) &&
                (player.hasItemInSlot(EquipmentSlot.FEET) == stack.is(ModItems.BLAZE_FEET.get()))) {
            player.addEffect(FIRE_RES);
        }

        if ((player.hasItemInSlot(EquipmentSlot.HEAD) == stack.is(ModItems.NETHERITE_BLAZE_HELM.get())) &&
                (player.hasItemInSlot(EquipmentSlot.CHEST) == stack.is(ModItems.NETHERITE_BLAZE_CHEST.get())) &&
                (player.hasItemInSlot(EquipmentSlot.LEGS) == stack.is(ModItems.NETHERITE_BLAZE_LEGS.get())) &&
                (player.hasItemInSlot(EquipmentSlot.FEET) == stack.is(ModItems.NETHERITE_BLAZE_FEET.get()))) {
            player.addEffect(FIRE_RES);
        }

        if (stack.is(FIRE_IMMUNE)) {
            player.isInvulnerableTo(DamageSource.LAVA);
            player.isInvulnerableTo(DamageSource.IN_FIRE);
        }

        if (stack.is(FIRE_RESISTANT) && player.isOnFire()) {
            player.isInvulnerableTo(DamageSource.IN_FIRE);
        }

        if (player.isOnFire()) {
            player.isInvulnerableTo(DamageSource.ON_FIRE);
        }
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        int damageValue;


        if (entity.isOnFire() && (stack.isEnchanted() == ModEnchantments.FIRE_THORNS.isPresent())) {
            if (stack.is(ModItems.FIRE_HELM.get())) {
                damageValue = stack.getDamageValue();
                entity.remove(Entity.RemovalReason.KILLED);
                entity.getItem().setDamageValue(damageValue);
                entity.getItem().enchant(ModEnchantments.FIRE_THORNS.get(), 2);
            }
            else if (stack.is(ModItems.FIRE_CHEST.get())) {
                damageValue = stack.getDamageValue();
                entity.remove(Entity.RemovalReason.KILLED);
                entity.getItem().setDamageValue(damageValue);
                entity.getItem().enchant(ModEnchantments.FIRE_THORNS.get(), 2);
            }
            else if (stack.is(ModItems.FIRE_LEGS.get())) {
                damageValue = stack.getDamageValue();
                entity.remove(Entity.RemovalReason.KILLED);
                entity.getItem().setDamageValue(damageValue);
                entity.getItem().enchant(ModEnchantments.FIRE_THORNS.get(), 2);
            }
            else if (stack.is(ModItems.FIRE_FEET.get())) {
                damageValue = stack.getDamageValue();
                entity.remove(Entity.RemovalReason.KILLED);
                entity.getItem().setDamageValue(damageValue);
                entity.getItem().enchant(ModEnchantments.FIRE_THORNS.get(), 2);
            }
        }

        return false;
    }

    public boolean setEquipped(ItemStack stack, Player player) {

        return false;
    }
}
