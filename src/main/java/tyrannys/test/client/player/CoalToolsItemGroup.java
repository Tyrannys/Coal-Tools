package tyrannys.test.client.player;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tyrannys.test.setup.ModItems;

public class CoalToolsItemGroup extends CreativeModeTab {

    private final ItemLike icon;

    public CoalToolsItemGroup(String label, ItemLike icon) {
        super(label);
        this.icon = icon;
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(icon);
    }
    public static final CoalToolsItemGroup COAL_TOOLS_ITEM_GROUP = new CoalToolsItemGroup("coaltoolsitemgroup", ()->
            (ModItems.COAL_PICKAXE.get()));

}
