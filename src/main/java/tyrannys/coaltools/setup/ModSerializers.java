package tyrannys.coaltools.setup;

import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.client.data.serializers.OreConverterSerializer;
import tyrannys.coaltools.client.data.serializers.SilkTouchSerializer;
import tyrannys.coaltools.client.data.serializers.SmeltingFireSerializer;

public class ModSerializers {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, CoalTools.MODID);

    public static void init() { SERIALIZERS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    public static final RegistryObject<SmeltingFireSerializer> SMELTING = SERIALIZERS.register("smelting", SmeltingFireSerializer::new);
    public static final RegistryObject<OreConverterSerializer> ORE_CONVERSION = SERIALIZERS.register("ingot_harvest", OreConverterSerializer::new);
    public static final RegistryObject<SilkTouchSerializer> SILK_TOUCH = SERIALIZERS.register("silk_touch_ore", SilkTouchSerializer::new);

}
