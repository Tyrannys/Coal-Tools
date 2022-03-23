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
        //Mod Ore
        tag(ModTags.Blocks.ORES_FIRE)
                .add(ModBlocks.FROZEN_FIRE_ORE.get())
                .add(ModBlocks.BLAZING_FIRE_ORE.get());

        //Ores
        tag(Tags.Blocks.ORES)
                .addTag(ModTags.Blocks.ORES_FIRE);

        //Pickaxe Blocks
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(ModTags.Blocks.ORES_FIRE);


        //Needs Iron Tool
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.FROZEN_FIRE_ORE.get());

        //Needs Diamond Tool
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BLAZING_FIRE_ORE.get());

    }

    @Override
    public String getName() {
        return CoalTools.MODID + "BlockTags";
    }

}
