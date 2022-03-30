package tyrannys.coaltools.client.data.providers;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.client.misc.modifiers.SmeltingFireModifier;
import tyrannys.coaltools.setup.ModTags;

import static tyrannys.coaltools.setup.ModSerializers.SMELTING;

public class ModGlobalLootProvider extends GlobalLootModifierProvider {

    public ModGlobalLootProvider(DataGenerator gen) {
        super(gen, CoalTools.MODID);
    }

    @Override
    protected void start() {
        add("smelting_iron", SMELTING.get(), new SmeltingFireModifier(
                new LootItemCondition[] {
                        MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModTags.Items.AUTOSMELT)).build(),
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.IRON_ORE).build()
                },
                3, Items.RAW_IRON, Items.IRON_INGOT)
        );
        add("smelting_gold", SMELTING.get(), new SmeltingFireModifier(
                new LootItemCondition[] {
                        MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModTags.Items.AUTOSMELT)).build(),
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GOLD_ORE).build()
                },
                3, Items.RAW_GOLD, Items.GOLD_INGOT)
        );
        add("smelting_copper", SMELTING.get(), new SmeltingFireModifier(
                new LootItemCondition[] {
                        MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModTags.Items.AUTOSMELT)).build(),
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.COPPER_ORE).build()
                },
                3, Items.RAW_COPPER, Items.COPPER_INGOT)
        );
    }
}
