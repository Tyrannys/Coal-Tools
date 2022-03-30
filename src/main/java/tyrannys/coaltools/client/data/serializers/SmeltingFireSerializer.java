package tyrannys.coaltools.client.data.serializers;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import tyrannys.coaltools.client.misc.modifiers.SmeltingFireModifier;

public class SmeltingFireSerializer extends GlobalLootModifierSerializer<SmeltingFireModifier> {

    private int numOre;
    private Item itemCheck;
    private Item reward;

    public SmeltingFireSerializer() {
    }

    @Override
    public SmeltingFireModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] conditionsIn) {
        return new SmeltingFireModifier(conditionsIn, numOre, itemCheck, reward);
    }

    @Override
    public JsonObject write(SmeltingFireModifier instance) {
        return makeConditions(instance.conditions);
    }

}
