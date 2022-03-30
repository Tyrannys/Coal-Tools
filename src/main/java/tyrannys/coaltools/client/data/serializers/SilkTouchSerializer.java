package tyrannys.coaltools.client.data.serializers;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import tyrannys.coaltools.client.misc.modifiers.SilkTouchModifier;

public class SilkTouchSerializer extends GlobalLootModifierSerializer<SilkTouchModifier> {

    @Override
    public SilkTouchModifier read(ResourceLocation name, JsonObject json, LootItemCondition[] conditionsIn) {
        return new SilkTouchModifier(conditionsIn);
    }

    @Override
    public JsonObject write(SilkTouchModifier instance) {
        return makeConditions(instance.conditions);
    }
}

