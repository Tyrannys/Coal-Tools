package tyrannys.test.setup;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import tyrannys.test.CoalTools;

public class ModTags {

    public static final class Blocks {

    }

    public static final class Items {



        //Needed for the forge tag
        private static TagKey<Item> forge(String path) {
            return ItemTags.create(new ResourceLocation(CoalTools.MODID, path));
        }
    }

}