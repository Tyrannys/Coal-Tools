package tyrannys.coaltools.client.playeruseable.tools.toolitems.fire;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import tyrannys.coaltools.setup.ModItems;

import static tyrannys.coaltools.setup.ModTags.Items.FIRE_RESISTANT;

public class FireArmor extends ArmorItem {

    public FireArmor(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {

        if (stack.is(ModItems.BLAZE_HELM.get())) {
            player.isInvulnerableTo(DamageSource.LAVA);
            player.isInvulnerableTo(DamageSource.ON_FIRE);
            player.isInvulnerableTo(DamageSource.IN_FIRE);
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
