package tyrannys.coaltools.setup;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import tyrannys.coaltools.CoalTools;

public class ModTags {

    public static final class Blocks {

        public static final TagKey<Block> ORES_FIRE = forge("ores/fire");

        private static TagKey<Block> forge(String path) {
            return BlockTags.create(new ResourceLocation("forge", path));
        }

        private static TagKey<Block> mod(String path) {
            return BlockTags.create(new ResourceLocation(CoalTools.MODID, path));
        }

    }

    public static final class Items {

        public static final TagKey<Item> ORES_FIRE = forge("ores/fire");

        //Tools
        public static final TagKey<Item> PICKAXE_TOOL = forge("tools/pickaxe");
        public static final TagKey<Item> AXE_TOOL = forge("tools/axe");
        public static final TagKey<Item> SWORD_TOOL = forge("tools/sword");
        public static final TagKey<Item> SHOVEL_TOOL = forge("tools/shovel");
        public static final TagKey<Item> HOE_TOOL = forge("tools/hoe");

        //Armor
        public static final TagKey<Item> HELM = forge("armor/helm");
        public static final TagKey<Item> CHEST = forge("armor/chest");
        public static final TagKey<Item> LEGS = forge("armor/legs");
        public static final TagKey<Item> FEET = forge("armor/feet");

        public static final TagKey<Item> FIRE_RESISTANT = forge("armor/fire_resistant");
        public static final TagKey<Item> FIRE_IMMUNE = forge("armor/fire_immune");

        public static final TagKey<Item> AUTOSMELT = forge("tools/autosmelt");

        //Needed for the forge tag
        private static TagKey<Item> forge(String path) {
            return ItemTags.create(new ResourceLocation(CoalTools.MODID, path));
        }
    }

}