package tyrannys.coaltools.client.playeruseable.itementities.tools;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CoalSwordEntity extends ItemEntity {

    public CoalSwordEntity(EntityType<? extends Entity> entityType, Level level) {
        super((EntityType<? extends CoalSwordEntity>) entityType, level);
        this.setYRot(this.random.nextFloat() * 360.0F);
    }

    public CoalSwordEntity(Level level, double x, double y, double z, ItemStack stack) {
        this(level, x, y, z, stack, level.random.nextDouble() * 0.2D - 0.1D, 0.2D, level.random.nextDouble() * 0.2D - 0.1D);
    }

    public CoalSwordEntity(Level level, double x, double y, double z, ItemStack stack, double deltaX, double deltaY, double deltaZ) {
        this(EntityType.ITEM, level);
        this.setPos(x, y, z);
        this.setDeltaMovement(deltaX, deltaY, deltaZ);
        this.setItem(stack);
        this.lifespan = (stack.getItem() == null ? 6000 : stack.getEntityLifespan(level));
    }
}