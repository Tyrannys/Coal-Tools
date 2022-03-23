package tyrannys.coaltools.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
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

        ShapedRecipeBuilder.shaped(ModItems.BLAZE_HELM.get(), 1)
                .pattern("XYX")
                .pattern("X X")
                .define('X', Items.BLAZE_ROD)
                .define('Y', ModItems.REIGNITER.get())
                .unlockedBy("has_item", has(Items.BLAZE_ROD))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "blaze_helm"));
        ShapedRecipeBuilder.shaped(ModItems.BLAZE_CHEST.get(), 1)
                .pattern("X X")
                .pattern("XYX")
                .pattern("XXX")
                .define('X', Items.BLAZE_ROD)
                .define('Y', ModItems.REIGNITER.get())
                .unlockedBy("has_item", has(Items.BLAZE_ROD))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "blaze_chest"));
        ShapedRecipeBuilder.shaped(ModItems.BLAZE_LEGS.get(), 1)
                .pattern("XYX")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.BLAZE_ROD)
                .define('Y', ModItems.REIGNITER.get())
                .unlockedBy("has_item", has(Items.BLAZE_ROD))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "blaze_legs"));
        ShapedRecipeBuilder.shaped(ModItems.BLAZE_FEET.get(), 1)
                .pattern("Y X")
                .pattern("X X")
                .define('X', Items.BLAZE_ROD)
                .define('Y', ModItems.REIGNITER.get())
                .unlockedBy("has_item", has(Items.BLAZE_ROD))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "blaze_feet"));
        ShapedRecipeBuilder.shaped(ModItems.BLAZE_FEET.get(), 1)
                .pattern("X Y")
                .pattern("X X")
                .define('X', Items.BLAZE_ROD)
                .define('Y', ModItems.REIGNITER.get())
                .unlockedBy("has_item", has(Items.BLAZE_ROD))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "blaze_feet2"));

        //Items
        ShapedRecipeBuilder.shaped(ModItems.REIGNITER.get(), 1)
                .pattern("X ")
                .pattern(" Y")
                .define('X', ModItems.FROZEN_FIRE.get())
                .define('Y', Items.IRON_INGOT)
                .unlockedBy("has_item", has(ModItems.FROZEN_FIRE.get()))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "reigniter"));
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_FROZEN_FIRE.get(), 3)
                .requires(Items.BLAZE_ROD, 1)
                .requires(Items.SNOW)
                .unlockedBy("has_item", has(Items.BLAZE_ROD))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "raw_frozen_fire"));
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_FROZEN_FIRE.get(), 6)
                .requires(Items.BLAZE_ROD, 1)
                .requires(Items.ICE)
                .unlockedBy("has_item", has(Items.ICE))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "raw_frozen_fire2"));


        //Furnace, Blasting, and Cooking Recipes
        //Misc
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_FROZEN_FIRE.get()),
                ModItems.FROZEN_FIRE.get(), 0.5F, 200)
                .unlockedBy("has_item", has(ModItems.RAW_FROZEN_FIRE.get()))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "frozen_fire_smelting"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_FROZEN_FIRE.get()),
                ModItems.FROZEN_FIRE.get(), 0.5F, 100)
                .unlockedBy("has_item", has(ModItems.RAW_FROZEN_FIRE.get()))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "frozen_fire_blasting"));

        //Tools
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_PICKAXE.get()),
                        ModItems.FIRE_PICKAXE.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_pickaxe_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_SWORD.get()),
                        ModItems.FIRE_SWORD.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_sword_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_AXE.get()),
                        ModItems.FIRE_AXE.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_axe_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_SHOVEL.get()),
                        ModItems.FIRE_SHOVEL.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_shovel_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_HOE.get()),
                        ModItems.FIRE_HOE.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_hoe_smelting"));

        //Armor
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_HELM.get()),
                        ModItems.FIRE_HELM.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_helm_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_CHEST.get()),
                        ModItems.FIRE_CHEST.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_chest_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_LEGS.get()),
                        ModItems.FIRE_LEGS.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_legs_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COAL_FEET.get()),
                        ModItems.FIRE_FEET.get(), 0.5F, 200)
                .unlockedBy("has_item", has(Items.COAL))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "fire_feet_smelting"));

        //Netherite Upgrades
        //Tools
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_PICKAXE.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_PICKAXE.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_pickaxe"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_SWORD.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_SWORD.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_sword"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_SHOVEL.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_SHOVEL.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_shovel"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_AXE.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_AXE.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_axe"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_HOE.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_HOE.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_hoe"));

        //Armor
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_HELM.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_HELM.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_helm"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_CHEST.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_CHEST.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_chest"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_LEGS.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_LEGS.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_legs"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(
                ModItems.BLAZE_FEET.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        ModItems.NETHERITE_BLAZE_FEET.get())
                .unlocks("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation(CoalTools.MODID, "netherite_blaze_feet"));
    }

    @Override
    public String getName() {
        return CoalTools.MODID + "Recipes";
    }
}