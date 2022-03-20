package tyrannys.coaltools.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.coaltools.CoalTools;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, CoalTools.MODID, existingFileHelper);
    }


    protected void addTags() {

    }

    @Override
    public String getName() {
        return "Coal Tools BlockTags";
    }

}
