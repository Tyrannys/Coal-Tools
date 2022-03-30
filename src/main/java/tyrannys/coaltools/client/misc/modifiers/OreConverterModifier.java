package tyrannys.coaltools.client.misc.modifiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class OreConverterModifier extends LootModifier {
    public final int numOreToConvert;
    public final Item itemToCheck;
    public final Item itemReward;
    public LootItemCondition[] conditions;

    public OreConverterModifier(LootItemCondition[] conditionsIn, int numOre, Item itemCheck, Item reward) {
        super(conditionsIn);
        numOreToConvert = numOre;
        itemToCheck = itemCheck;
        itemReward = reward;
    }

    @NotNull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        int numOre = 0;
        for (ItemStack stack : generatedLoot) {
            if (stack.getItem() == itemToCheck)
                numOre+=stack.getCount();
        }
        if (numOre >= numOreToConvert) {
            generatedLoot.removeIf(x -> x.getItem() == itemToCheck);
            generatedLoot.add(new ItemStack(itemReward, (numOre/numOreToConvert)));
            numOre = numOre%numOreToConvert;
            if (numOre > 0)
                generatedLoot.add(new ItemStack(itemToCheck, numOre));
        }
        return generatedLoot;
    }
}
