package tyrannys.coaltools.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.setup.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        //Shaped
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
        ShapedRecipeBuilder.shaped(ModItems.COAL_HELM.get(), 1)
                .pattern("XXX")
                .pattern("X X")
                .define('X', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_helm"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_CHEST.get(), 1)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_chest"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_LEGS.get(), 1)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_legs"));
        ShapedRecipeBuilder.shaped(ModItems.COAL_FEET.get(), 1)
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.COAL)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "coal_feet"));


        //Shapeless
        ShapelessRecipeBuilder.shapeless(ModItems.REIGNITER.get(), 1)
                .requires(Ingredient.of(Items.BLAZE_POWDER), 1)
                .requires(Ingredient.of(Items.IRON_INGOT), 1)
                .unlockedBy("has_item", has(Items.BLAZE_ROD))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "reigniter"));

    }

    @Override
    public String getName() {
        return "CoalTools Recipes";
    }
}