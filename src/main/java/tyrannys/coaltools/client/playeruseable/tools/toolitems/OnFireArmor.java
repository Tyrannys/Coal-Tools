package tyrannys.coaltools.client.playeruseable.tools.toolitems;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import static tyrannys.coaltools.setup.ModTags.Items.FIRE_IMMUNE;
import static tyrannys.coaltools.setup.ModTags.Items.FIRE_RESISTANT;

public class OnFireArmor extends ArmorItem {

    public OnFireArmor(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {

        if (stack.is(FIRE_IMMUNE)) {
            player.isInvulnerableTo(DamageSource.LAVA);
        }

        if (stack.is(FIRE_RESISTANT)) {
            player.setRemainingFireTicks(10);
        }

        if (player.isOnFire()) {
            player.clearFire();
            player.fireImmune();
        }

    }
}
