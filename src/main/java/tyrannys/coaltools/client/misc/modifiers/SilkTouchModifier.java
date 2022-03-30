package tyrannys.coaltools.client.misc.modifiers;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SilkTouchModifier extends LootModifier {

    public LootItemCondition[] conditions;

    public SilkTouchModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @NotNull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        ItemStack tool = context.getParamOrNull(LootContextParams.TOOL);
        if (EnchantmentHelper.getEnchantments(tool).containsKey(Enchantments.SILK_TOUCH)) return generatedLoot;
        ItemStack fakeTool = tool.copy();
        fakeTool.enchant(Enchantments.SILK_TOUCH, 1);
        LootContext.Builder builder = new LootContext.Builder(context);
        builder.withParameter(LootContextParams.TOOL, fakeTool);
        LootContext block = builder.create(LootContextParamSets.BLOCK);
        LootTable lootTable = context.getLevel().getServer().getLootTables().get(context.getParamOrNull(LootContextParams.BLOCK_STATE).getBlock().getLootTable());
        return lootTable.getRandomItems(block);
    }

}
