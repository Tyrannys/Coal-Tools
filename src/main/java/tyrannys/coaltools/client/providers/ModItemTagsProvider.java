package tyrannys.coaltools.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.coaltools.CoalTools;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper){
        super(gen,blockTagProvider, CoalTools.MODID, existingFileHelper);
    }

    @Override
    public String getName() {
        return "CoalTools ItemTags";
    }

}