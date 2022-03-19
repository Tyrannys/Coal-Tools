package tyrannys.test.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.test.CoalTools;
import tyrannys.test.setup.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CoalTools.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        singleTexture(ModItems.COAL_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_pickaxe"));
        singleTexture(ModItems.COAL_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_sword"));
        singleTexture(ModItems.COAL_AXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_axe"));
        singleTexture(ModItems.COAL_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_shovel"));
        singleTexture(ModItems.COAL_HOE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_hoe"));

    }

    @Override
    public String getName() {
        return "Test Item Models";
    }
}