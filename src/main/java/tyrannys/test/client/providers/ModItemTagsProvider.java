package tyrannys.test.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.test.TestMod;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper){
        super(gen,blockTagProvider, TestMod.MODID, existingFileHelper);
    }

    @Override
    public String getName() {
        return "Test ItemTags";
    }

}