package tyrannys.test.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import tyrannys.test.CoalTools;
import tyrannys.test.setup.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(ModItems.COAL_PICKAXE.get(), 1)
                .pattern("YYY")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.STICK)
                .define('Y', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_pickaxe"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_SWORD.get(), 1)
                .pattern(" Y ")
                .pattern(" Y ")
                .pattern(" X ")
                .define('X', Items.STICK)
                .define('Y', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_sword"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_AXE.get(), 1)
                .pattern("YY ")
                .pattern("YX ")
                .pattern(" X ")
                .define('X', Items.STICK)
                .define('Y', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_axe"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_AXE.get(), 1)
                .pattern(" YY")
                .pattern(" XY")
                .pattern(" X ")
                .define('X', Items.STICK)
                .define('Y', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_axe2"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_SHOVEL.get(), 1)
                .pattern(" Y ")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.STICK)
                .define('Y', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_shovel"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_HOE.get(), 1)
                .pattern(" YY")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.STICK)
                .define('Y', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_hoe"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_HOE.get(), 1)
                .pattern("YY ")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.STICK)
                .define('Y', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_hoe2"));
    }

    @Override
    public String getName() {
        return "Test Recipes";
    }
}