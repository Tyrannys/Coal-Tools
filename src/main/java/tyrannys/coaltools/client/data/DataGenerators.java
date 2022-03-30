package tyrannys.coaltools.client.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.client.data.providers.*;

@Mod.EventBusSubscriber(modid = CoalTools.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            gen.addProvider(new ModRecipeProvider(gen));
            ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
            gen.addProvider(new ModItemTagsProvider(gen, blockTags,existingFileHelper));
            gen.addProvider(new ModBlockTagsProvider(gen, existingFileHelper));
            gen.addProvider(new ModLootTables(gen));
            gen.addProvider(new ModGlobalLootProvider(gen));
        }

        if (event.includeClient()) {
            gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
            gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
            gen.addProvider(new ModLanguageProvider(gen, "en_us"));
        }

    }

}