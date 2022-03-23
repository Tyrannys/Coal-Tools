package tyrannys.coaltools.client.data.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.setup.ModItems;
import tyrannys.coaltools.setup.ModTags;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper){
        super(gen,blockTagProvider, CoalTools.MODID, existingFileHelper);
    }

    protected void addTags() {
        copy(ModTags.Blocks.ORES_FIRE, ModTags.Items.ORES_FIRE);


        //TOOLS
        tag(ModTags.Items.PICKAXE_TOOL)
                .add(ModItems.COAL_PICKAXE.get())
                .add(ModItems.FIRE_PICKAXE.get())
                .add(ModItems.BLAZE_PICKAXE.get())
                .add(ModItems.NETHERITE_BLAZE_PICKAXE.get());
        tag(ModTags.Items.SWORD_TOOL)
                .add(ModItems.COAL_SWORD.get())
                .add(ModItems.FIRE_SWORD.get())
                .add(ModItems.BLAZE_SWORD.get())
                .add(ModItems.NETHERITE_BLAZE_SWORD.get());
        tag(ModTags.Items.AXE_TOOL)
                .add(ModItems.COAL_AXE.get())
                .add(ModItems.FIRE_AXE.get())
                .add(ModItems.BLAZE_AXE.get())
                .add(ModItems.NETHERITE_BLAZE_AXE.get());
        tag(ModTags.Items.SHOVEL_TOOL)
                .add(ModItems.COAL_SHOVEL.get())
                .add(ModItems.FIRE_SHOVEL.get())
                .add(ModItems.FIRE_SHOVEL.get())
                .add(ModItems.NETHERITE_BLAZE_SHOVEL.get());
        tag(ModTags.Items.HOE_TOOL)
                .add(ModItems.COAL_HOE.get())
                .add(ModItems.FIRE_HOE.get())
                .add(ModItems.BLAZE_HOE.get())
                .add(ModItems.NETHERITE_BLAZE_HOE.get());

        tag(ModTags.Items.AUTOSMELT)
                .add(ModItems.FIRE_PICKAXE.get())
                .add(ModItems.BLAZE_PICKAXE.get())
                .add(ModItems.NETHERITE_BLAZE_PICKAXE.get());


        //Armor
        tag(ModTags.Items.HELM)
                .add(ModItems.COAL_HELM.get())
                .add(ModItems.FIRE_HELM.get())
                .add(ModItems.BLAZE_HELM.get())
                .add(ModItems.NETHERITE_BLAZE_HELM.get());
        tag(ModTags.Items.CHEST)
                .add(ModItems.COAL_CHEST.get())
                .add(ModItems.FIRE_CHEST.get())
                .add(ModItems.BLAZE_CHEST.get())
                .add(ModItems.NETHERITE_BLAZE_CHEST.get());
        tag(ModTags.Items.LEGS)
                .add(ModItems.COAL_LEGS.get())
                .add(ModItems.FIRE_LEGS.get())
                .add(ModItems.BLAZE_LEGS.get())
                .add(ModItems.NETHERITE_BLAZE_LEGS.get());
        tag(ModTags.Items.FEET)
                .add(ModItems.COAL_FEET.get())
                .add(ModItems.FIRE_FEET.get())
                .add(ModItems.BLAZE_FEET.get())
                .add(ModItems.NETHERITE_BLAZE_FEET.get());

    }

    @Override
    public String getName() {
        return CoalTools.MODID + "ItemTags";
    }

}