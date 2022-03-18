package tyrannys.test.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.test.TestMod;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, TestMod.MODID, existingFileHelper);
    }


    protected void addTags() {

    }

    @Override
    public String getName() {
        return "Test BlockTags";
    }

}
