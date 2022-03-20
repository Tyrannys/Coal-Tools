package tyrannys.coaltools.setup;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tyrannys.coaltools.CoalTools;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CoalTools.MODID);

    public static void init() { BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus()); }


    public static final RegistryObject<Block> FROZEN_FIRE_ORE = BLOCKS.register("frozen_fire_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 50F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops())
        );

}