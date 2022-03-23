package tyrannys.coaltools.client.data.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.setup.ModBlocks;
import tyrannys.coaltools.setup.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, CoalTools.MODID, existingFileHelper);
    }


    protected void addTags() {
        tag(ModTags.Blocks.ORES_FIRE)
                .add(ModBlocks.FROZEN_FIRE_ORE.get());

        tag(Tags.Blocks.ORES)
                .addTag(ModTags.Blocks.ORES_FIRE);

        tag(BlockTags.NEEDS_IRON_TOOL)
                .addTag(ModTags.Blocks.ORES_FIRE);

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(ModTags.Blocks.ORES_FIRE);
    }

    @Override
    public String getName() {
        return CoalTools.MODID + "BlockTags";
    }

}
