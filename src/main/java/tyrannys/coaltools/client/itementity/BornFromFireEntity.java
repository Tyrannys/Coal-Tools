package tyrannys.coaltools.client.itementity;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

public class BornFromFireEntity extends ItemEntity {

    private int health = 5;

    public BornFromFireEntity(Level level, double x, double y, double z, ItemStack stack) {
        super(level, x, y, z, stack);
    }

    @Override
    public boolean hurt(DamageSource pSource, float pAmount) {
        if (pSource.isFire()) {
            this.markHurt();
            this.health = (int)((float)this.health - pAmount);
            this.gameEvent(GameEvent.ENTITY_DAMAGED, pSource.getEntity());
            if (this.health <= 0) {
                this.getItem().onDestroyed(this, pSource);
                this.discard();
            }
            return true;
        }
        else {
            return false;
        }
    }
}
