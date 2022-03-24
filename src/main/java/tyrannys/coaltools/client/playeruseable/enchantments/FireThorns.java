package tyrannys.coaltools.client.playeruseable.enchantments;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FireThorns extends Enchantment {
    private Player player;
    public FireThorns(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot[] pApplicableSlots, EquipmentSlot... slots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public int getDamageProtection(int pLevel, DamageSource pSource) {

        if (pLevel == 1) {
            try {
                wait(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            player.clearFire();
        }
        else {
            player.fireImmune();
        }

        return super.getDamageProtection(pLevel, pSource);
    }

    @Override
    public void doPostHurt(LivingEntity pUser, Entity pAttacker, int pLevel) {
        if(!pAttacker.level.isClientSide()) {
            ServerLevel world = (ServerLevel) pAttacker.level;
            ServerPlayer player = ((ServerPlayer) pAttacker);
            BlockPos position = pAttacker.blockPosition();

            if(pLevel == 1) {
                pAttacker.setSecondsOnFire(3);
            }
            else if (pLevel == 2) {
                pAttacker.setSecondsOnFire(5);
            }
            else if (pLevel == 3) {
                pAttacker.setSecondsOnFire(10);
            }
            else if (pLevel == 4) {
                pAttacker.setSecondsOnFire(15);
            }
            else if (pLevel == 5) {
                pAttacker.setSecondsOnFire(20);
            }

        }

        super.doPostHurt(pUser, pAttacker, pLevel);
    }

    @Override
    public Enchantment.Rarity getRarity() {
        return Rarity.VERY_RARE;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

}
