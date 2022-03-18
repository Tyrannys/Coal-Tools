package tyrannys.test.client.player;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tyrannys.test.setup.ModItems;

public class TestItemGroup extends CreativeModeTab {

    private final ItemLike icon;

    public TestItemGroup(String label, ItemLike icon) {
        super(label);
        this.icon = icon;
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(icon);
    }
    public static final TestItemGroup TEST_ITEM_GROUP = new TestItemGroup("moditemgroup", ()->
            (ModItems.COAL_PICKAXE.get()));

}
