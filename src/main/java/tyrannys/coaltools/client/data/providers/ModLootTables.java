package tyrannys.coaltools.client.data.providers;

import net.minecraft.data.DataGenerator;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.client.misc.BaseLootTableProvider;
import tyrannys.coaltools.setup.ModBlocks;
import tyrannys.coaltools.setup.ModItems;

public class ModLootTables extends BaseLootTableProvider {

    public ModLootTables(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void addTables() {
        lootTables.put(ModBlocks.FROZEN_FIRE_ORE.get(),
                createSilkTouchTable("frozen_fire_ore",
                        ModBlocks.FROZEN_FIRE_ORE.get(),
                        ModItems.RAW_FROZEN_FIRE.get(), 1, 3));

        lootTables.put(ModBlocks.BLAZING_FIRE_ORE.get(),
                createSilkTouchTable("blazing_fire_ore",
                        ModBlocks.BLAZING_FIRE_ORE.get(),
                        ModItems.RAW_BLAZING_FIRE.get(), 1, 3));
    }

    @Override
    public String getName() {
        return CoalTools.MODID + "LootTables";
    }
}
