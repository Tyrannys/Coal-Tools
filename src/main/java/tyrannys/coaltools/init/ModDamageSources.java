package tyrannys.coaltools.init;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.world.entity.Entity;

public class ModDamageSources {

    public static DamageSource fire_thorns(Entity source) {
        return (new EntityDamageSource("fire_thorns", source).setIsFire().setMagic());
    }
}
