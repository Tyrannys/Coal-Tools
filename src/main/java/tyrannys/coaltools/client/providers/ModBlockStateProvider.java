package tyrannys.coaltools.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.coaltools.CoalTools;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, CoalTools.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    @Override
    public String getName() {
        return "Coal Tools BlockStates";
    }
}