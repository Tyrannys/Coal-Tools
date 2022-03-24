package tyrannys.coaltools.setup;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tyrannys.coaltools.CoalTools;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, CoalTools.MODID);

    //Attaches the deferred register to the event bus
    public static void init() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    /*public static final RegistryObject<EntityType<CoalSwordEntity>> COAL_SWORD_ENTITY = ENTITIES.register("coal_sword", () ->
            EntityType.Builder.of(CoalSwordEntity::new, MobCategory.MISC).build("coal_sword");
    */
}
