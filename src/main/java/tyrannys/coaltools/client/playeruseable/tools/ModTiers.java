package tyrannys.coaltools.client.playeruseable.tools;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier COALTOOLS = new ForgeTier(1, 111, 4.0F, 1.0F, 7, BlockTags.NEEDS_STONE_TOOL, () ->
        Ingredient.of(Items.COAL));

    public static final ForgeTier FIRETOOLS = new ForgeTier(2, 241, 6.0F, 2.0F, 16, BlockTags.NEEDS_IRON_TOOL, () ->
            Ingredient.of(Items.COAL));

    public static final ForgeTier BLAZETOOLS = new ForgeTier(3, 1451, 8.0F, 3.0F, 18, BlockTags.NEEDS_DIAMOND_TOOL, () ->
            Ingredient.of(Items.COAL));

    public static final ForgeTier NETHERITEBLAZETOOLS = new ForgeTier(4, 1921, 9.0F, 4.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL, () ->
            Ingredient.of(Items.COAL));

}
