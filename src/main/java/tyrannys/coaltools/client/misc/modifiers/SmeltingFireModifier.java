package tyrannys.coaltools.client.misc.modifiers;

import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.items.ItemHandlerHelper;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SmeltingFireModifier extends LootModifier {

    public LootItemCondition[] conditions;

    public SmeltingFireModifier(LootItemCondition[] conditionsIn, int numOre, Item itemCheck, Item reward) {
        super(conditionsIn);
    }

    @NotNull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        generatedLoot.forEach(stack -> arrayList.add(smelt(stack, context)));
        return arrayList;
    }

    private static ItemStack smelt(ItemStack stack, LootContext context) {
        return context.getLevel().getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(stack), context.getLevel())
                .map(SmeltingRecipe::getResultItem)
                .filter(ItemStack -> !ItemStack.isEmpty())
                .map(ItemStack -> ItemHandlerHelper.copyStackWithSize(ItemStack, stack.getCount() * ItemStack.getCount()))
                .orElse(stack);
    }

}
