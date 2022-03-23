package tyrannys.coaltools.client.playeruseableitems.itementities.tools;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BlazeSwordEntity extends ItemEntity {
    int ticks = 10;

    public BlazeSwordEntity(EntityType<? extends ItemEntity> entityType, Level level) {
        super(entityType, level);
    }

    public BlazeSwordEntity(Level level, double x, double y, double z, ItemStack stack) {
        super(level, x, y, z, stack);
    }

    public BlazeSwordEntity(Level level, double x, double y, double z, ItemStack stack, double deltaX, double deltaY, double deltaZ) {
        super(level, x, y, z, stack, deltaX, deltaY, deltaZ);
    }

    @Override
    public void setPickUpDelay(int ticks) {
        super.setPickUpDelay(ticks);
    }

    @Override
    public boolean hasPickUpDelay() {
        return true;
    }

    @Override
    public boolean isOnFire() {
        return super.isOnFire();
    }
}