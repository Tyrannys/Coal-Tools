package tyrannys.coaltools.setup;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.client.playeruseable.enchantments.FireThorns;

public class ModEnchantments extends Enchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CoalTools.MODID);

    public static void init() { ENCHANTMENTS.register(FMLJavaModLoadingContext.get().getModEventBus()); }


    private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

    public static final RegistryObject<Enchantment> FIRE_THORNS = ENCHANTMENTS.register("fire_thorns", () ->
        new FireThorns(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.ARMOR, ARMOR_SLOTS)
    );


}
