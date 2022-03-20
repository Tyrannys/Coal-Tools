package tyrannys.coaltools.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.setup.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CoalTools.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        singleTexture(ModItems.COAL_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/coal_pickaxe"));
        singleTexture(ModItems.FIRE_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/fire_pickaxe"));
        singleTexture(ModItems.BLAZE_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/blaze_pickaxe"));
        singleTexture(ModItems.NETHERITE_BLAZE_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/netherite_blaze_pickaxe"));

        singleTexture(ModItems.COAL_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/coal_sword"));
        singleTexture(ModItems.FIRE_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/fire_sword"));
        singleTexture(ModItems.BLAZE_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/blaze_sword"));
        singleTexture(ModItems.NETHERITE_BLAZE_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/netherite_blaze_sword"));

        singleTexture(ModItems.COAL_AXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/coal_axe"));
        singleTexture(ModItems.FIRE_AXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/fire_axe"));
        singleTexture(ModItems.BLAZE_AXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/blaze_axe"));
        singleTexture(ModItems.NETHERITE_BLAZE_AXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/netherite_blaze_axe"));

        singleTexture(ModItems.COAL_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/coal_shovel"));
        singleTexture(ModItems.FIRE_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/fire_shovel"));
        singleTexture(ModItems.BLAZE_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/blaze_shovel"));
        singleTexture(ModItems.NETHERITE_BLAZE_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/netherite_blaze_shovel"));

        singleTexture(ModItems.COAL_HOE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/coal_hoe"));
        singleTexture(ModItems.FIRE_HOE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/fire_hoe"));
        singleTexture(ModItems.BLAZE_HOE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/blaze_hoe"));
        singleTexture(ModItems.NETHERITE_BLAZE_HOE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/netherite_blaze_hoe"));

        //Armor
        singleTexture(ModItems.COAL_HELM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_helm"));
        singleTexture(ModItems.FIRE_HELM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/fire_helm"));
        singleTexture(ModItems.BLAZE_HELM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/blaze_helm"));
        singleTexture(ModItems.NETHERITE_BLAZE_HELM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/netherite_blaze_helm"));

        singleTexture(ModItems.COAL_CHEST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_chest"));
        singleTexture(ModItems.FIRE_CHEST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/fire_chest"));
        singleTexture(ModItems.BLAZE_CHEST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/blaze_chest"));
        singleTexture(ModItems.NETHERITE_BLAZE_CHEST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/netherite_blaze_chest"));

        singleTexture(ModItems.COAL_LEGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_legs"));
        singleTexture(ModItems.FIRE_LEGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/fire_legs"));
        singleTexture(ModItems.BLAZE_LEGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/blaze_legs"));
        singleTexture(ModItems.NETHERITE_BLAZE_LEGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/netherite_blaze_legs"));

        singleTexture(ModItems.COAL_FEET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/coal_feet"));
        singleTexture(ModItems.FIRE_FEET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/fire_feet"));
        singleTexture(ModItems.BLAZE_FEET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/blaze_feet"));
        singleTexture(ModItems.NETHERITE_BLAZE_FEET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/netherite_blaze_feet"));

        //Misc
        singleTexture(ModItems.REIGNITER.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/reigniter"));

    }

    @Override
    public String getName() {
        return "Coal Tools Item Models";
    }
}