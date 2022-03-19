package tyrannys.test.setup;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tyrannys.test.CoalTools;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CoalTools.MODID);

    public static void init() { BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    public ModBlocks() {

    }

}