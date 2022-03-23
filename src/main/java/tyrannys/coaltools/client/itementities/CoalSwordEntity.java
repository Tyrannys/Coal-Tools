package tyrannys.coaltools.client.itementities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CoalSwordEntity extends ItemEntity {

    public CoalSwordEntity(EntityType<? extends ItemEntity> entityType, Level level) {
        super(entityType, level);
    }

    public CoalSwordEntity(Level level, double x, double y, double z, ItemStack stack) {
        super(level, x, y, z, stack);
    }

    public CoalSwordEntity(Level level, double x, double y, double z, ItemStack stack, double deltaX, double deltaY, double deltaZ) {
        super(level, x, y, z, stack, deltaX, deltaY, deltaZ);
    }

}